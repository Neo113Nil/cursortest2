package defpackage;

import com.yandex.mapkit.map.Callback;

/* loaded from: classes6.dex */
public final /* synthetic */ class a75 implements Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4c0 b;

    public /* synthetic */ a75(f4c0 f4c0Var, int i) {
        this.a = i;
        this.b = f4c0Var;
    }

    @Override // com.yandex.mapkit.map.Callback
    public final void onTaskFinished() {
        int i = this.a;
        f4c0 f4c0Var = this.b;
        switch (i) {
            case 0:
                f4c0Var.o = true;
                t26 t26Var = f4c0Var.n;
                if (t26Var != null) {
                    t26Var.onTaskFinished();
                }
                f4c0Var.n = null;
                break;
            default:
                f4c0Var.d();
                break;
        }
    }
}
