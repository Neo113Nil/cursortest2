package xsna;

import java.util.Queue;
import java.util.function.Consumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class y0z implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((qq70) obj).record(((Queue) ((kb) this.b).c).size(), q94.j(z0z.h, z0z.j));
                break;
            default:
                ((vmy0) this.b).f.remove(((xmy0) obj).b.p());
                break;
        }
    }
}
