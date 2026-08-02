package xsna;

import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qtg0 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qtg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.c;
                rye.b bVar = (rye.b) this.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                bVar.a();
                break;
            default:
                smm0 smm0Var = (smm0) this.c;
                smm0Var.i.remove((otz) this.d);
                break;
        }
    }
}
