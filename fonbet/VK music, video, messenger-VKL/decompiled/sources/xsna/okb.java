package xsna;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class okb implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ okb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                rkb rkbVar = (rkb) this.c;
                return rkbVar.b.a(rkbVar.g);
            default:
                return new it80(((po20) this.c).b());
        }
    }
}
