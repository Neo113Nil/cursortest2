package xsna;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import java.util.ArrayList;
import xsna.ub9;
import xsna.wiz;

/* compiled from: LiveDataObservable.java */
/* loaded from: classes11.dex */
public final class viz implements Runnable {
    public final /* synthetic */ wiz.b b;
    public final /* synthetic */ wiz.a c;

    public viz(wiz.a aVar, wiz.b bVar) {
        this.c = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        wiz.a aVar = this.c;
        if (aVar.b.get()) {
            wiz.b bVar = this.b;
            bVar.getClass();
            final androidx.camera.view.b bVar2 = aVar.c;
            T t = bVar.a;
            bVar2.getClass();
            CameraInternal.State state = (CameraInternal.State) t;
            if (state == CameraInternal.State.CLOSING || state == CameraInternal.State.CLOSED || state == CameraInternal.State.RELEASING || state == CameraInternal.State.RELEASED) {
                bVar2.a(PreviewView.StreamState.IDLE);
                if (bVar2.f) {
                    bVar2.f = false;
                    p0t p0tVar = bVar2.e;
                    if (p0tVar != null) {
                        p0tVar.cancel(false);
                        bVar2.e = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if ((state == CameraInternal.State.OPENING || state == CameraInternal.State.OPEN || state == CameraInternal.State.PENDING_OPEN) && !bVar2.f) {
                final ui9 ui9Var = bVar2.a;
                bVar2.a(PreviewView.StreamState.IDLE);
                final ArrayList arrayList = new ArrayList();
                p0t a = p0t.a(ub9.a(new ub9.c() { // from class: xsna.p5d0
                    @Override // xsna.ub9.c
                    public final Object attachCompleter(ub9.a aVar2) {
                        androidx.camera.view.b.this.getClass();
                        ti9 ti9Var = ui9Var;
                        r5d0 r5d0Var = new r5d0(aVar2, ti9Var);
                        arrayList.add(r5d0Var);
                        ((ui9) ti9Var).c(xo9.g(), r5d0Var);
                        return "waitForCaptureResult";
                    }
                }));
                oyr oyrVar = new oyr(bVar2, 15);
                mzm g = xo9.g();
                a.getClass();
                ora g2 = r0t.g(a, oyrVar, g);
                tp1 tp1Var = new tp1(bVar2, 25);
                ora g3 = r0t.g(g2, new t98(tp1Var), xo9.g());
                bVar2.e = g3;
                r0t.a(g3, new q5d0(bVar2, arrayList, ui9Var), xo9.g());
                bVar2.f = true;
            }
        }
    }
}
