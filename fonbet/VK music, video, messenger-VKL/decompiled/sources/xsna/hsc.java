package xsna;

import androidx.activity.result.ActivityResult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hsc implements ua0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ vpi c;

    public /* synthetic */ hsc(vpi vpiVar, int i) {
        this.b = i;
        this.c = vpiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ua0
    public final void onActivityResult(Object obj) {
        int i = this.b;
        vpi vpiVar = this.c;
        switch (i) {
            case 0:
                isc iscVar = (isc) vpiVar;
                ActivityResult activityResult = (ActivityResult) obj;
                qcy<Object>[] qcyVarArr = isc.t1;
                ((fvd) iscVar.o1.getValue()).getClass();
                iscVar.onActivityResult(1765, activityResult.b, activityResult.c);
                break;
            default:
                String str = (String) obj;
                int i2 = a5g0.k1;
                n6g0 n6g0Var = (n6g0) ((a5g0) vpiVar).j1.getValue();
                if (str == null) {
                    n6g0Var.getClass();
                    break;
                } else {
                    utk0 utk0Var = n6g0Var.e;
                    utk0Var.getClass();
                    utk0Var.i(null, str);
                    n6g0Var.i = true;
                    break;
                }
        }
    }
}
