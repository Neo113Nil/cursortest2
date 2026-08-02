package xsna;

import com.vk.core.exceptions.DisposableException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nq80 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ yp80 c;

    public /* synthetic */ nq80(yp80 yp80Var, int i) {
        this.b = i;
        this.c = yp80Var;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                yp80 yp80Var = this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            default:
                yp80 yp80Var2 = this.c;
                if (yp80Var2 != null) {
                    yp80Var2.onError(new DisposableException());
                    break;
                }
                break;
        }
    }
}
