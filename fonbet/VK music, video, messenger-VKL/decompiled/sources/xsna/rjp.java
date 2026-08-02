package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EncryptedPreferencesApi21.kt */
/* loaded from: classes17.dex */
public final class rjp implements SharedPreferences {
    public final String a;
    public final Context b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EncryptedPreferencesApi21.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOLEAN;
        public static final a Companion;
        public static final b FLOAT;
        public static final b INT;
        public static final b LONG;
        public static final b STRING;
        private final char id;

        /* compiled from: EncryptedPreferencesApi21.kt */
        public static final class a {
        }

        static {
            b bVar = new b("STRING", 0, (char) 0);
            STRING = bVar;
            b bVar2 = new b("INT", 1, (char) 2);
            INT = bVar2;
            b bVar3 = new b("LONG", 2, (char) 3);
            LONG = bVar3;
            b bVar4 = new b("FLOAT", 3, (char) 4);
            FLOAT = bVar4;
            b bVar5 = new b("BOOLEAN", 4, (char) 5);
            BOOLEAN = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
            Companion = new a();
        }

        public b(String str, int i, char c) {
            this.id = c;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String a(Object obj) {
            return this.id + obj.toString();
        }

        public final char h() {
            return this.id;
        }
    }

    /* compiled from: EncryptedPreferencesApi21.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rjp(Context context, String str) {
        this.a = str;
        this.b = context.getApplicationContext();
    }

    public final Object a(String str) {
        sjp.b(this.b);
        b61 b61Var = uz70.a;
        if (str == null) {
            str = "___NULL___";
        }
        String a2 = uz70.a(str, this.a);
        if (a2 == null) {
            return null;
        }
        try {
            char charAt = a2.charAt(0);
            String substring = a2.substring(1);
            b.Companion.getClass();
            for (b bVar : b.values()) {
                if (bVar.h() == charAt) {
                    int i = c.$EnumSwitchMapping$0[bVar.ordinal()];
                    if (i == -1) {
                        return null;
                    }
                    if (i == 1) {
                        return substring;
                    }
                    if (i == 2) {
                        return Integer.valueOf(Integer.parseInt(substring));
                    }
                    if (i == 3) {
                        return Long.valueOf(Long.parseLong(substring));
                    }
                    if (i == 4) {
                        return Float.valueOf(Float.parseFloat(substring));
                    }
                    if (i == 5) {
                        return Boolean.valueOf(Boolean.parseBoolean(substring));
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        sjp.b(this.b);
        b61 b61Var = uz70.a;
        if (str == null) {
            str = "___NULL___";
        }
        return uz70.a(str, this.a) != null;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this.b, this.a);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        b61 b61Var = uz70.a;
        Set<String> keySet = Preference.f(this.a).getAll().keySet();
        HashMap hashMap = new HashMap(keySet.size());
        for (String str : keySet) {
            hashMap.put(!epx.f(str, "___NULL___") ? str : null, a(str));
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object a2 = a(str);
        Boolean bool = a2 instanceof Boolean ? (Boolean) a2 : null;
        return bool != null ? bool.booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object a2 = a(str);
        Float f2 = a2 instanceof Float ? (Float) a2 : null;
        return f2 != null ? f2.floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object a2 = a(str);
        Integer num = a2 instanceof Integer ? (Integer) a2 : null;
        return num != null ? num.intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object a2 = a(str);
        Long l = a2 instanceof Long ? (Long) a2 : null;
        return l != null ? l.longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object a2 = a(str);
        String str3 = a2 instanceof String ? (String) a2 : null;
        return str3 == null ? str2 : str3;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        return new LinkedHashSet();
    }

    /* compiled from: EncryptedPreferencesApi21.kt */
    public static final class a implements SharedPreferences.Editor {
        public final Context a;
        public final String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            Preference.B(this.b);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return true;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            uz70.d(str, b.BOOLEAN.a(Boolean.valueOf(z)), this.b);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            uz70.d(str, b.FLOAT.a(Float.valueOf(f)), this.b);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            uz70.d(str, b.INT.a(Integer.valueOf(i)), this.b);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            uz70.d(str, b.LONG.a(Long.valueOf(j)), this.b);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            Context context = this.a;
            sjp.b(context);
            String str3 = this.b;
            if (str2 != null) {
                b61 b61Var = uz70.a;
                if (str == null) {
                    str = "___NULL___";
                }
                uz70.d(str, b.STRING.a(str2), str3);
                return this;
            }
            sjp.b(context);
            b61 b61Var2 = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            Preference.C(str3, str);
            b61 b61Var3 = uz70.a;
            if (b61Var3 == null) {
                b61Var3 = null;
            }
            b61Var3.a.a(str, null);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            sjp.b(this.a);
            b61 b61Var = uz70.a;
            if (str == null) {
                str = "___NULL___";
            }
            Preference.C(this.b, str);
            b61 b61Var2 = uz70.a;
            if (b61Var2 == null) {
                b61Var2 = null;
            }
            b61Var2.a.a(str, null);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set set) {
            return this;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
