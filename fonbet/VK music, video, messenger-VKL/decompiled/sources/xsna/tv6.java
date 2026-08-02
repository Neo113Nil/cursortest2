package xsna;

import com.ironsource.Be;
import com.ironsource.C4462ne;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class tv6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ InterfaceC4569te c;
    public final /* synthetic */ C4462ne d;

    public /* synthetic */ tv6(InterfaceC4569te interfaceC4569te, C4462ne c4462ne, int i) {
        this.b = i;
        this.c = interfaceC4569te;
        this.d = c4462ne;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Be.b(this.c, this.d);
                break;
            default:
                Ce.a(this.c, this.d);
                break;
        }
    }
}
