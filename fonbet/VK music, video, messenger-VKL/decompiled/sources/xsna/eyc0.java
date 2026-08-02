package xsna;

import android.content.SharedPreferences;

/* compiled from: PreferenceDelegate.kt */
/* loaded from: classes.dex */
public final class eyc0 implements p7f0<Object, SharedPreferences> {
    public final hy6 b;
    public final iy6 c;
    public SharedPreferences d;

    public eyc0(hy6 hy6Var, iy6 iy6Var) {
        this.b = hy6Var;
        this.c = iy6Var;
        this.d = (SharedPreferences) hy6Var.invoke();
    }

    @Override // xsna.i7f0
    public final Object getValue(Object obj, qcy qcyVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.invoke();
        SharedPreferences sharedPreferences2 = this.d;
        if (sharedPreferences2 != sharedPreferences) {
            this.d = sharedPreferences;
            this.c.invoke(sharedPreferences2, sharedPreferences);
        }
        return this.d;
    }

    @Override // xsna.p7f0
    public final void setValue(Object obj, qcy qcyVar, SharedPreferences sharedPreferences) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        SharedPreferences sharedPreferences3 = this.d;
        if (sharedPreferences3 != sharedPreferences2) {
            this.d = sharedPreferences2;
            this.c.invoke(sharedPreferences3, sharedPreferences2);
        }
    }
}
