package xsna;

import com.vk.masks.MasksController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j8w implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j8w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        fvv0 M;
        gvv0 view;
        switch (this.b) {
            case 0:
                k8w k8wVar = (k8w) this.c;
                k8wVar.e.e();
                k8wVar.f.e();
                return;
            case 1:
                MasksController masksController = (MasksController) this.c;
                synchronized (masksController) {
                    masksController.i = null;
                }
                return;
            case 2:
                ((a2e0) this.c).a();
                return;
            default:
                r6y r6yVar = ((oxv0) this.c).b;
                if (r6yVar == null || (M = r6yVar.M()) == null || (view = M.getView()) == null) {
                    return;
                }
                view.jk();
                return;
        }
    }
}
