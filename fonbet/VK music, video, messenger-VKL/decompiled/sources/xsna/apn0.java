package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.von0;

/* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
/* loaded from: classes11.dex */
public final class apn0 extends von0.a {
    public final ArrayList a;

    /* compiled from: SynchronizedCaptureSessionStateCallbacks.java */
    public static class a extends von0.a {

        @NonNull
        public final CameraCaptureSession.StateCallback a;

        public a(@NonNull List<CameraCaptureSession.StateCallback> list) {
            this.a = list.isEmpty() ? new ng9() : list.size() == 1 ? list.get(0) : new mg9(list);
        }

        @Override // xsna.von0.a
        public final void g(@NonNull xon0 xon0Var) {
            this.a.onActive(xon0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void h(@NonNull xon0 xon0Var) {
            this.a.onCaptureQueueEmpty(xon0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void i(@NonNull von0 von0Var) {
            this.a.onClosed(von0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void j(@NonNull von0 von0Var) {
            this.a.onConfigureFailed(von0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void k(@NonNull xon0 xon0Var) {
            this.a.onConfigured(xon0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void l(@NonNull xon0 xon0Var) {
            this.a.onReady(xon0Var.b().a.a);
        }

        @Override // xsna.von0.a
        public final void m(@NonNull xon0 xon0Var, @NonNull Surface surface) {
            this.a.onSurfacePrepared(xon0Var.b().a.a, surface);
        }
    }

    public apn0(@NonNull List<von0.a> list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    @Override // xsna.von0.a
    public final void g(@NonNull xon0 xon0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).g(xon0Var);
        }
    }

    @Override // xsna.von0.a
    public final void h(@NonNull xon0 xon0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).h(xon0Var);
        }
    }

    @Override // xsna.von0.a
    public final void i(@NonNull von0 von0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).i(von0Var);
        }
    }

    @Override // xsna.von0.a
    public final void j(@NonNull von0 von0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).j(von0Var);
        }
    }

    @Override // xsna.von0.a
    public final void k(@NonNull xon0 xon0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).k(xon0Var);
        }
    }

    @Override // xsna.von0.a
    public final void l(@NonNull xon0 xon0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).l(xon0Var);
        }
    }

    @Override // xsna.von0.a
    public final void m(@NonNull xon0 xon0Var, @NonNull Surface surface) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((von0.a) it.next()).m(xon0Var, surface);
        }
    }
}
