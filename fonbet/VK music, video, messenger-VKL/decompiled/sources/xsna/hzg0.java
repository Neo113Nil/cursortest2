package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SafeEncryptedPreferences.kt */
/* loaded from: classes.dex */
public final class hzg0 implements SharedPreferences {
    public final bpn0 a;
    public final bpn0 b;

    /* compiled from: SafeEncryptedPreferences.kt */
    public static final class a {
        public static boolean a(SharedPreferences sharedPreferences, String str) {
            try {
                Trace.beginSection("SafeEncryptedPreferences.safeContains");
                boolean contains = sharedPreferences.contains(str);
                Trace.endSection();
                return contains;
            } catch (Exception unused) {
                Trace.endSection();
                return false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* compiled from: SafeEncryptedPreferences.kt */
    /* loaded from: classes17.dex */
    public static final class b implements SharedPreferences.Editor {
        public final SharedPreferences.Editor a;
        public final SharedPreferences.Editor b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        public b(SharedPreferences.Editor editor, SharedPreferences.Editor editor2) {
            this.a = editor;
            this.b = editor2;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            boolean andSet = this.c.getAndSet(false);
            SharedPreferences.Editor editor = this.a;
            try {
                if (andSet) {
                    editor.commit();
                } else {
                    editor.apply();
                }
            } catch (Exception unused) {
            }
            this.b.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.c.set(true);
            try {
                this.a.clear();
            } catch (Exception unused) {
            }
            this.b.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            boolean z;
            try {
                z = this.a.commit();
            } catch (Exception unused) {
                z = false;
            }
            return z && this.b.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            try {
                this.a.putBoolean(str, z);
                return this;
            } catch (Exception unused) {
                this.b.putBoolean(str, z);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            try {
                this.a.putFloat(str, f);
                return this;
            } catch (Exception unused) {
                this.b.putFloat(str, f);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            try {
                this.a.putInt(str, i);
                return this;
            } catch (Exception unused) {
                this.b.putInt(str, i);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            try {
                this.a.putLong(str, j);
                return this;
            } catch (Exception unused) {
                this.b.putLong(str, j);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            try {
                this.a.putString(str, str2);
                return this;
            } catch (Exception unused) {
                this.b.putString(str, str2);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set set) {
            try {
                this.a.putStringSet(str, set);
                return this;
            } catch (Exception unused) {
                this.b.putStringSet(str, set);
                return this;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            try {
                this.a.remove(str);
            } catch (Exception unused) {
            }
            this.b.remove(str);
            return this;
        }
    }

    public hzg0(Context context, String str) {
        this.a = new bpn0(new tb60(context, str, this, 1));
        this.b = new bpn0(new j7x(1, context, str));
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.a.getValue();
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.b.getValue();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return a.a(a(), str) || b().contains(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new b(a().edit(), b().edit());
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        Map<String, ?> map;
        try {
            map = a().getAll();
        } catch (Exception unused) {
            map = jgp.b;
        }
        Map<String, ?> all = b().getAll();
        HashMap hashMap = new HashMap(map.size() + map.size());
        hashMap.putAll(all);
        hashMap.putAll(map);
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getBoolean(str, z);
            } catch (Exception unused) {
                b2 = b();
            }
        } else {
            b2 = b();
        }
        return b2.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getFloat(str, f);
            } catch (Exception unused) {
                b2 = b();
            }
        } else {
            b2 = b();
        }
        return b2.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getInt(str, i);
            } catch (Exception unused) {
                b2 = b();
            }
        } else {
            b2 = b();
        }
        return b2.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getLong(str, j);
            } catch (Exception unused) {
                b2 = b();
            }
        } else {
            b2 = b();
        }
        return b2.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getString(str, str2);
            } catch (Exception unused) {
                b2 = b();
            }
        } else {
            b2 = b();
        }
        return b2.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        SharedPreferences b2;
        if (a.a(a(), str)) {
            try {
                return a().getStringSet(str, set);
            } catch (Exception unused) {
                b2 = b();
                set = set;
            }
        } else {
            b2 = b();
        }
        return b2.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        b().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        b().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
