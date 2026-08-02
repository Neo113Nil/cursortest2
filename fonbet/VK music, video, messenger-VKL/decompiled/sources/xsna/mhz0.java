package xsna;

import com.ironsource.C4618w9;
import xsna.ocz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class mhz0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mhz0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C4618w9.b((C4618w9) this.c);
                break;
            default:
                ocz0.c cVar = ((mxy0) this.c).c.W;
                if (cVar != null) {
                    h8z0.e(cVar.a, "interactiveStarted", 999, null);
                    break;
                }
                break;
        }
    }
}
