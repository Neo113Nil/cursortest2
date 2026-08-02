package xsna;

import android.app.Application;

/* compiled from: ReefPermissionsUtil.kt */
/* loaded from: classes5.dex */
public final class hof0 {
    public final fnf0 a;
    public final vfe b;
    public Boolean c;
    public Boolean d;

    public hof0(fnf0 fnf0Var, Application application) {
        vfe vfeVar = new vfe(application);
        this.a = fnf0Var;
        this.b = vfeVar;
    }

    public final boolean a() {
        this.a.getClass();
        Boolean bool = this.c;
        if (bool == null) {
            vfe vfeVar = this.b;
            bool = Boolean.valueOf(vfeVar.l("android.permission.ACCESS_FINE_LOCATION") || vfeVar.l("android.permission.ACCESS_COARSE_LOCATION"));
        }
        this.c = bool;
        return bool.booleanValue();
    }
}
