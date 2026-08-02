package xsna;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import xsna.pyc0;

/* compiled from: SingleFileSharedPreference.kt */
/* loaded from: classes17.dex */
public final class auj0 implements SharedPreferences, pyc0 {
    public final SharedPreferences a;
    public final String b;
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, SharedPreferences.OnSharedPreferenceChangeListener> c = new WeakHashMap<>();
    public final ReentrantLock d = new ReentrantLock();

    /* compiled from: SingleFileSharedPreference.kt */
    public static final class a implements SharedPreferences.Editor, pyc0 {
        public final SharedPreferences.Editor a;
        public final SharedPreferences b;
        public final String c;

        public a(SharedPreferences.Editor editor, SharedPreferences sharedPreferences, String str) {
            this.a = editor;
            this.b = sharedPreferences;
            this.c = str;
        }

        @Override // xsna.pyc0
        public final String a() {
            return this.c;
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            this.a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor clear() {
            try {
                String str = this.c;
                if (str != null) {
                    for (String str2 : this.b.getAll().keySet()) {
                        if (brm0.B(str2, str, false)) {
                            this.a.remove(str2);
                        }
                        commit();
                    }
                }
            } finally {
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            return this.a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.a.putBoolean(pyc0.a.a(this, str), z);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
            this.a.putFloat(pyc0.a.a(this, str), f);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putInt(String str, int i) {
            this.a.putInt(pyc0.a.a(this, str), i);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putLong(String str, long j) {
            this.a.putLong(pyc0.a.a(this, str), j);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putString(String str, String str2) {
            this.a.putString(pyc0.a.a(this, str), str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.a.putStringSet(pyc0.a.a(this, str), set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor remove(String str) {
            this.a.remove(pyc0.a.a(this, str));
            return this;
        }
    }

    public auj0(SharedPreferences sharedPreferences, String str) {
        this.a = sharedPreferences;
        this.b = str;
    }

    @Override // xsna.pyc0
    public final String a() {
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.a.contains(pyc0.a.a(this, str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.a;
        return new a(sharedPreferences.edit(), sharedPreferences, this.b);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        String str;
        Map<String, ?> all = this.a.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.b;
            if (!hasNext) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (str == null) {
                str = "";
            }
            if (brm0.B(key, str, false)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(drm0.U((String) entry.getKey(), str + "__"), entry.getValue());
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(pyc0.a.a(this, str), z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return this.a.getFloat(pyc0.a.a(this, str), f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return this.a.getInt(pyc0.a.a(this, str), i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return this.a.getLong(pyc0.a.a(this, str), j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return this.a.getString(pyc0.a.a(this, str), str2);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        return this.a.getStringSet(pyc0.a.a(this, str), set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xsna.ztj0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    String str2 = auj0.this.b;
                    if (str2 == null || str == null || !brm0.B(str, str2, false)) {
                        return;
                    }
                    String U = drm0.U(str, str2 + "__");
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener3 = onSharedPreferenceChangeListener;
                    if (onSharedPreferenceChangeListener3 != null) {
                        onSharedPreferenceChangeListener3.onSharedPreferenceChanged(sharedPreferences, U);
                    }
                }
            };
            this.c.put(onSharedPreferenceChangeListener, onSharedPreferenceChangeListener2);
            this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener2);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            this.a.unregisterOnSharedPreferenceChangeListener(this.c.remove(onSharedPreferenceChangeListener));
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
