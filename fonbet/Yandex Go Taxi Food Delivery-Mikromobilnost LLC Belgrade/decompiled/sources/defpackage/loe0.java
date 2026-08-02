package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;

/* loaded from: classes4.dex */
public final class loe0 implements IKeyStorage {
    public final Context a;
    public final String b;
    public SharedPreferences c;
    public SharedPreferences.Editor d;

    public loe0(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final SharedPreferences.Editor a() {
        if (this.d == null) {
            SharedPreferences b = b();
            this.d = b != null ? b.edit() : null;
        }
        return this.d;
    }

    public final SharedPreferences b() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.b, 0);
        }
        return this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean getBoolean(String str, boolean z) {
        SharedPreferences b = b();
        return b != null ? b.getBoolean(str, z) : z;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final float getFloat(String str, float f) {
        SharedPreferences b = b();
        return b != null ? b.getFloat(str, f) : f;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final int getInt(String str, int i) {
        SharedPreferences b = b();
        return b != null ? b.getInt(str, i) : i;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final long getLong(String str, long j) {
        SharedPreferences b = b();
        return b != null ? b.getLong(str, j) : j;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final String getString(String str, String str2) {
        String string;
        SharedPreferences b = b();
        return (b == null || (string = b.getString(str, str2)) == null) ? str2 : string;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final Set getStringSet(String str, Set set) {
        Set<String> stringSet;
        SharedPreferences b = b();
        return (b == null || (stringSet = b.getStringSet(str, set)) == null) ? set : stringSet;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean hasKey(String str) {
        SharedPreferences b = b();
        if (b != null) {
            return b.contains(str);
        }
        return false;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean initialize() {
        release();
        return true;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putBoolean(String str, boolean z) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putBoolean(str, z);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putFloat(String str, float f) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putFloat(str, f);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putInt(String str, int i) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putInt(str, i);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putLong(String str, long j) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putLong(str, j);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putString(String str, String str2) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putString(str, str2);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage putStringSet(String str, Set set) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.putStringSet(str, set);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final boolean release() {
        save();
        this.d = null;
        this.c = null;
        return true;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage remove(String str) {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.remove(str);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage removeAll() {
        SharedPreferences.Editor a = a();
        if (a != null) {
            a.clear();
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage removeAllWith(String str) {
        ArrayList<String> arrayList;
        Map<String, ?> all;
        SharedPreferences b = b();
        if (b == null || (all = b.getAll()) == null) {
            arrayList = null;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (evu0.y(entry.getKey(), str, false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            SharedPreferences.Editor a = a();
            for (String str2 : arrayList) {
                if (a != null) {
                    a.remove(str2);
                }
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage
    public final IKeyStorage save() {
        SharedPreferences.Editor editor = this.d;
        if (editor != null) {
            editor.apply();
        }
        this.d = null;
        return this;
    }
}
