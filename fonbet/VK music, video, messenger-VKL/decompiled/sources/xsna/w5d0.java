package xsna;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import java.util.concurrent.atomic.AtomicReference;
import xsna.wiz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class w5d0 {
    public final /* synthetic */ PreviewView.a a;
    public final /* synthetic */ androidx.camera.view.b b;
    public final /* synthetic */ CameraInternal c;

    public /* synthetic */ w5d0(PreviewView.a aVar, androidx.camera.view.b bVar, CameraInternal cameraInternal) {
        this.a = aVar;
        this.b = bVar;
        this.c = cameraInternal;
    }

    public final void a() {
        PreviewView.a aVar = this.a;
        androidx.camera.view.b bVar = this.b;
        CameraInternal cameraInternal = this.c;
        AtomicReference<androidx.camera.view.b> atomicReference = PreviewView.this.f;
        while (true) {
            if (atomicReference.compareAndSet(bVar, null)) {
                bVar.a(PreviewView.StreamState.IDLE);
                break;
            } else if (atomicReference.get() != bVar) {
                break;
            }
        }
        p0t p0tVar = bVar.e;
        if (p0tVar != null) {
            p0tVar.cancel(false);
            bVar.e = null;
        }
        wiz d = cameraInternal.d();
        synchronized (d.b) {
            try {
                wiz.a aVar2 = (wiz.a) d.b.remove(bVar);
                if (aVar2 != null) {
                    aVar2.b.set(false);
                    xo9.t().execute(new uiz(d, aVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
