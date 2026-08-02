package xsna;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
import xsna.gbc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ica implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ica(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                SharedPreferences.Editor edit = ((SharedPreferences) ((kca) this.c).a.getValue()).edit();
                edit.clear();
                edit.apply();
                return s3q0.a;
            case 1:
                gbc0 gbc0Var = (gbc0) this.c;
                wy2 wy2Var = vx2.e;
                if (wy2Var != null) {
                    return (gbc0.a) l7r0.g(wy2Var, gbc0Var.b, gbc0Var);
                }
                return null;
            default:
                y2o0 y2o0Var = (y2o0) this.c;
                return dv90.a(y2o0Var.a.getStableHardwareId(y2o0Var.asGoogleApiClient()), emi.f);
        }
    }
}
