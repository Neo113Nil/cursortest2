package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import defpackage.au50;
import defpackage.b64;
import defpackage.d6z;
import defpackage.ew4;
import defpackage.j63;
import defpackage.jb7;
import defpackage.jjx;
import defpackage.m610;
import defpackage.ny61;
import defpackage.ve1;
import defpackage.w9j;
import defpackage.we1;
import defpackage.x9j;
import defpackage.yhl;
import defpackage.yvi0;
import defpackage.z92;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    private static final String KEY_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
    private static final String NULL_VALUE = "__NULL__";
    private static final String VALUE_KEYSET_ALIAS = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
    final String mFileName;
    final w9j mKeyDeterministicAead;
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners = new CopyOnWriteArrayList<>();
    final String mMasterKeyAlias;
    final SharedPreferences mSharedPreferences;
    final ve1 mValueAead;

    /* loaded from: classes10.dex */
    public static final class Editor implements SharedPreferences.Editor {
        private final SharedPreferences.Editor mEditor;
        private final EncryptedSharedPreferences mEncryptedSharedPreferences;
        private final AtomicBoolean mClearRequested = new AtomicBoolean(false);
        private final List<String> mKeysChanged = new CopyOnWriteArrayList();

        public Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.mEncryptedSharedPreferences = encryptedSharedPreferences;
            this.mEditor = editor;
        }

        private void clearKeysIfNeeded() {
            if (this.mClearRequested.getAndSet(false)) {
                for (String str : this.mEncryptedSharedPreferences.getAll().keySet()) {
                    if (!this.mKeysChanged.contains(str) && !this.mEncryptedSharedPreferences.isReservedKey(str)) {
                        this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
                    }
                }
            }
        }

        private void notifyListeners() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.mEncryptedSharedPreferences.mListeners.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.mKeysChanged.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.mEncryptedSharedPreferences, it2.next());
                }
            }
        }

        private void putEncryptedObject(String str, byte[] bArr) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                ny61.z(b64.j(str, " is a reserved key for the encryption keyset."));
                return;
            }
            this.mKeysChanged.add(str);
            if (str == null) {
                str = EncryptedSharedPreferences.NULL_VALUE;
            }
            try {
                Pair<String, String> encryptKeyValuePair = this.mEncryptedSharedPreferences.encryptKeyValuePair(str, bArr);
                this.mEditor.putString((String) encryptKeyValuePair.first, (String) encryptKeyValuePair.second);
            } catch (GeneralSecurityException e) {
                yhl.e(e.getMessage(), "Could not encrypt data: ", e);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            clearKeysIfNeeded();
            this.mEditor.apply();
            notifyListeners();
            this.mKeysChanged.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClearRequested.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            clearKeysIfNeeded();
            try {
                return this.mEditor.commit();
            } finally {
                notifyListeners();
                this.mKeysChanged.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(EncryptedType.BOOLEAN.b());
            allocate.put(z ? (byte) 1 : (byte) 0);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.FLOAT.b());
            allocate.putFloat(f);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(EncryptedType.INT.b());
            allocate.putInt(i);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(EncryptedType.LONG.b());
            allocate.putLong(j);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = EncryptedSharedPreferences.NULL_VALUE;
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(EncryptedType.STRING.b());
            allocate.putInt(length);
            allocate.put(bytes);
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new j63();
                set.add(EncryptedSharedPreferences.NULL_VALUE);
            }
            ArrayList arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(EncryptedType.STRING_SET.b());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            putEncryptedObject(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (this.mEncryptedSharedPreferences.isReservedKey(str)) {
                ny61.z(b64.j(str, " is a reserved key for the encryption keyset."));
                return null;
            }
            this.mEditor.remove(this.mEncryptedSharedPreferences.encryptKey(str));
            this.mKeysChanged.add(str);
            return this;
        }
    }

    /* loaded from: classes10.dex */
    public enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        EncryptedType(int i) {
            this.mId = i;
        }

        public static EncryptedType a(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public final int b() {
            return this.mId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class PrefKeyEncryptionScheme {
        private static final /* synthetic */ PrefKeyEncryptionScheme[] $VALUES;
        public static final PrefKeyEncryptionScheme AES256_SIV;
        private final String mDeterministicAeadKeyTemplateName = "AES256_SIV";

        static {
            PrefKeyEncryptionScheme prefKeyEncryptionScheme = new PrefKeyEncryptionScheme();
            AES256_SIV = prefKeyEncryptionScheme;
            $VALUES = new PrefKeyEncryptionScheme[]{prefKeyEncryptionScheme};
        }

        public static PrefKeyEncryptionScheme valueOf(String str) {
            return (PrefKeyEncryptionScheme) Enum.valueOf(PrefKeyEncryptionScheme.class, str);
        }

        public static PrefKeyEncryptionScheme[] values() {
            return (PrefKeyEncryptionScheme[]) $VALUES.clone();
        }

        public final jjx a() {
            return d6z.F(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class PrefValueEncryptionScheme {
        private static final /* synthetic */ PrefValueEncryptionScheme[] $VALUES;
        public static final PrefValueEncryptionScheme AES256_GCM;
        private final String mAeadKeyTemplateName = "AES256_GCM";

        static {
            PrefValueEncryptionScheme prefValueEncryptionScheme = new PrefValueEncryptionScheme();
            AES256_GCM = prefValueEncryptionScheme;
            $VALUES = new PrefValueEncryptionScheme[]{prefValueEncryptionScheme};
        }

        public static PrefValueEncryptionScheme valueOf(String str) {
            return (PrefValueEncryptionScheme) Enum.valueOf(PrefValueEncryptionScheme.class, str);
        }

        public static PrefValueEncryptionScheme[] values() {
            return (PrefValueEncryptionScheme[]) $VALUES.clone();
        }

        public final jjx a() {
            return d6z.F(this.mAeadKeyTemplateName);
        }
    }

    public EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, ve1 ve1Var, w9j w9jVar) {
        this.mFileName = str;
        this.mSharedPreferences = sharedPreferences;
        this.mMasterKeyAlias = str2;
        this.mValueAead = ve1Var;
        this.mKeyDeterministicAead = w9jVar;
    }

    @Deprecated
    public static SharedPreferences create(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        jb7 t;
        jb7 t2;
        x9j.a();
        we1.a();
        Context applicationContext = context.getApplicationContext();
        z92 z92Var = new z92();
        z92Var.f = prefKeyEncryptionScheme.a();
        if (applicationContext == null) {
            ny61.g("need an Android context");
            return null;
        }
        z92Var.a = applicationContext;
        z92Var.b = KEY_KEYSET_ALIAS;
        z92Var.c = str;
        z92Var.d("android-keystore://" + str2);
        au50 a = z92Var.a();
        synchronized (a) {
            t = ((yvi0) a.b).t();
        }
        z92 z92Var2 = new z92();
        z92Var2.f = prefValueEncryptionScheme.a();
        z92Var2.a = applicationContext;
        z92Var2.b = VALUE_KEYSET_ALIAS;
        z92Var2.c = str;
        z92Var2.d("android-keystore://" + str2);
        au50 a2 = z92Var2.a();
        synchronized (a2) {
            t2 = ((yvi0) a2.b).t();
        }
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (ve1) t2.i(ve1.class), (w9j) t.i(w9j.class));
    }

    private Object getDecryptedObject(String str) throws SecurityException {
        if (isReservedKey(str)) {
            ny61.z(b64.j(str, " is a reserved key for the encryption keyset."));
            return null;
        }
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            String encryptKey = encryptKey(str);
            String string = this.mSharedPreferences.getString(encryptKey, null);
            if (string != null) {
                byte[] a = ew4.a(0, string);
                ve1 ve1Var = this.mValueAead;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(ve1Var.b(a, encryptKey.getBytes(charset)));
                wrap.position(0);
                int i = wrap.getInt();
                EncryptedType a2 = EncryptedType.a(i);
                if (a2 == null) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
                }
                int ordinal = a2.ordinal();
                if (ordinal == 0) {
                    int i2 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i2);
                    String charBuffer = charset.decode(slice).toString();
                    if (!charBuffer.equals(NULL_VALUE)) {
                        return charBuffer;
                    }
                } else {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return Integer.valueOf(wrap.getInt());
                        }
                        if (ordinal == 3) {
                            return Long.valueOf(wrap.getLong());
                        }
                        if (ordinal == 4) {
                            return Float.valueOf(wrap.getFloat());
                        }
                        if (ordinal == 5) {
                            return Boolean.valueOf(wrap.get() != 0);
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: " + a2);
                    }
                    j63 j63Var = new j63();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i3);
                        wrap.position(wrap.position() + i3);
                        j63Var.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (j63Var.c != 1 || !NULL_VALUE.equals(j63Var.b[0])) {
                        return j63Var;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            yhl.e(e.getMessage(), "Could not decrypt value. ", e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (isReservedKey(str)) {
            ny61.z(b64.j(str, " is a reserved key for the encryption keyset."));
            return false;
        }
        return this.mSharedPreferences.contains(encryptKey(str));
    }

    public String decryptKey(String str) {
        try {
            String str2 = new String(this.mKeyDeterministicAead.a(ew4.a(0, str), this.mFileName.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals(NULL_VALUE)) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            yhl.e(e.getMessage(), "Could not decrypt key. ", e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.mSharedPreferences.edit());
    }

    public String encryptKey(String str) {
        if (str == null) {
            str = NULL_VALUE;
        }
        try {
            return ew4.c(2, this.mKeyDeterministicAead.b(str.getBytes(StandardCharsets.UTF_8), this.mFileName.getBytes()));
        } catch (GeneralSecurityException e) {
            yhl.e(e.getMessage(), "Could not encrypt key. ", e);
            return null;
        }
    }

    public Pair<String, String> encryptKeyValuePair(String str, byte[] bArr) throws GeneralSecurityException {
        String encryptKey = encryptKey(str);
        return new Pair<>(encryptKey, ew4.c(2, this.mValueAead.a(bArr, encryptKey.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.mSharedPreferences.getAll().entrySet()) {
            if (!isReservedKey(entry.getKey())) {
                String decryptKey = decryptKey(entry.getKey());
                hashMap.put(decryptKey, getDecryptedObject(decryptKey));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Boolean ? ((Boolean) decryptedObject).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Float ? ((Float) decryptedObject).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Integer ? ((Integer) decryptedObject).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof Long ? ((Long) decryptedObject).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object decryptedObject = getDecryptedObject(str);
        return decryptedObject instanceof String ? (String) decryptedObject : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object decryptedObject = getDecryptedObject(str);
        Set<String> j63Var = decryptedObject instanceof Set ? (Set) decryptedObject : new j63();
        return j63Var.size() > 0 ? j63Var : set;
    }

    public boolean isReservedKey(String str) {
        return KEY_KEYSET_ALIAS.equals(str) || VALUE_KEYSET_ALIAS.equals(str);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }

    public static SharedPreferences create(Context context, String str, m610 m610Var, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) throws GeneralSecurityException, IOException {
        return create(str, m610Var.a, context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }
}
