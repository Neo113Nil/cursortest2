package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.qvm;
import xsna.svm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class mvm implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mvm(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                nvm nvmVar = (nvm) this.c;
                qvm.b bVar = (qvm.b) ((qvm) this.d);
                nvmVar.n(new svm.c(bVar.b, bVar.c));
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                hwp0 hwp0Var = (hwp0) this.d;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar != null) {
                    hwp0Var.g.a(cVar);
                    break;
                }
                break;
        }
    }
}
