package xsna;

import com.vk.log.L;
import xsna.w0q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j3w implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                n3w n3wVar = (n3w) this.c;
                n3wVar.j = new bhl0(n3wVar.a.a.a, (h0w) n3wVar.y.getValue(), n3wVar.a.k.get(), c2l.a, (Iterable) n3wVar.a.i.invoke(), n3wVar.i, n3wVar.h, new np(n3wVar, 6), new a67(n3wVar, 4), new kb0(3), n3wVar.a.O.g());
                break;
            default:
                w0q0.b bVar = (w0q0.b) this.c;
                L.e("ImmediateHideObserver", "onAppBackgroundUnsafe: tracked appHide unsafely");
                bVar.d = true;
                bVar.c.a();
                bVar.h = null;
                break;
        }
    }
}
