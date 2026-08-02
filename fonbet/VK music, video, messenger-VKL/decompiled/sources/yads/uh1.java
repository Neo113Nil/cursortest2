package yads;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.s3q0;
import xsna.tdj;

/* loaded from: classes10.dex */
public final class uh1 implements sh1, SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final sz2 b;
    public final Context c;
    public final Lazy d;
    public final LinkedHashSet e;

    public uh1(Context context, String str, sz2 sz2Var) {
        this.a = str;
        this.b = sz2Var;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.d = new bpn0(new th1(this));
        this.e = new LinkedHashSet();
    }

    public final void a() {
        ((SharedPreferences) this.d.getValue()).edit().clear().apply();
    }

    public final long b(String str) {
        return ((SharedPreferences) this.d.getValue()).getLong(str, 0L);
    }

    public final String c(String str) {
        return ((SharedPreferences) this.d.getValue()).getString(str, null);
    }

    public final void d(String str) {
        ((SharedPreferences) this.d.getValue()).edit().remove(str).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                rh1 rh1Var = (rh1) ((WeakReference) it.next()).get();
                if (rh1Var != null) {
                    zw zwVar = (zw) rh1Var;
                    synchronized (zw.j) {
                        try {
                            ix a = zwVar.c.a(this, str);
                            if (a == null) {
                                a = zwVar.b.a(this, str);
                            }
                            if (a != null) {
                                zwVar.a(a);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final boolean a(String str) {
        return ((SharedPreferences) this.d.getValue()).contains(str);
    }

    public final void b(String str, boolean z) {
        tdj.b((SharedPreferences) this.d.getValue(), str, z);
    }

    public final boolean a(String str, boolean z) {
        return ((SharedPreferences) this.d.getValue()).getBoolean(str, z);
    }

    public final int a(int i, String str) {
        ((SharedPreferences) this.d.getValue()).contains(str);
        return ((SharedPreferences) this.d.getValue()).getInt(str, i);
    }

    public final void b(int i, String str) {
        ((SharedPreferences) this.d.getValue()).edit().putInt(str, i).apply();
    }

    public final Set a(String str, Set set) {
        return ((SharedPreferences) this.d.getValue()).getStringSet(str, set);
    }

    public final void a(String str, long j) {
        ((SharedPreferences) this.d.getValue()).edit().putLong(str, j).apply();
    }

    public final void a(String str, String str2) {
        ((SharedPreferences) this.d.getValue()).edit().putString(str, str2).apply();
    }

    public final void a(String str, HashSet hashSet) {
        ((SharedPreferences) this.d.getValue()).edit().putStringSet(str, hashSet).apply();
    }

    public final void a(rh1 rh1Var) {
        if (this.e.isEmpty()) {
            ((SharedPreferences) this.d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.e.add(new WeakReference(rh1Var));
    }
}
