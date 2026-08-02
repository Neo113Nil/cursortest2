package xsna;

import androidx.core.os.OperationCanceledException;
import xsna.gfw;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ifw implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ifw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                jfw jfwVar = (jfw) this.c;
                alw alwVar = (alw) this.d;
                gfw.a aVar = (gfw.a) this.e;
                ub9.a aVar2 = (ub9.a) this.f;
                if (!jfwVar.f) {
                    aVar2.d(new OperationCanceledException("ImageAnalysis is detached"));
                    break;
                } else {
                    aVar.b(new mzi0(alwVar, new nm5(alwVar.B().c(), alwVar.B().getTimestamp(), jfwVar.c), 0));
                    aVar2.b(null);
                    break;
                }
            default:
                com.vungle.ads.internal.load.c.a((com.vungle.ads.internal.downloader.k) this.c, (com.vungle.ads.internal.load.g) this.d, (com.vungle.ads.internal.load.c) this.e, (com.vungle.ads.internal.downloader.b) this.f);
                break;
        }
    }
}
