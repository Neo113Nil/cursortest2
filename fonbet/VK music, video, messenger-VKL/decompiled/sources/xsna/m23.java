package xsna;

import xsna.f360;
import xsna.l23;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m23 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m23(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                l23.c cVar = (l23.c) this.c;
                Runnable runnable = (Runnable) this.d;
                cVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    cVar.a();
                }
            default:
                ((izs) this.c).invoke((f360.a) this.d);
                return;
        }
    }
}
