package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import defpackage.a1x0;
import defpackage.b1x0;
import defpackage.d1x0;
import defpackage.dn7;
import defpackage.e1x0;
import defpackage.geb1;
import defpackage.hh5;
import defpackage.sgb1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class r extends a1x0 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public r(final List list) {
        this.b = list.isEmpty() ? new CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new CameraCaptureSession.StateCallback(list) { // from class: androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks$ComboSessionStateCallback
            private final List<CameraCaptureSession.StateCallback> mCallbacks = new ArrayList();

            {
                for (CameraCaptureSession.StateCallback stateCallback : list) {
                    if (!(stateCallback instanceof CameraCaptureSessionStateCallbacks$NoOpSessionStateCallback)) {
                        this.mCallbacks.add(stateCallback);
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onActive(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onActive(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onCaptureQueueEmpty(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onClosed(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onClosed(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onConfigureFailed(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onConfigured(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(CameraCaptureSession cameraCaptureSession) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onReady(cameraCaptureSession);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                Iterator<CameraCaptureSession.StateCallback> it = this.mCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onSurfacePrepared(cameraCaptureSession, surface);
                }
            }
        };
    }

    private final void i(b1x0 b1x0Var) {
    }

    @Override // defpackage.a1x0
    public void a(b1x0 b1x0Var) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                break;
        }
    }

    @Override // defpackage.a1x0
    public void b(b1x0 b1x0Var) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                break;
        }
    }

    @Override // defpackage.a1x0
    public void c(b1x0 b1x0Var) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                break;
        }
    }

    @Override // defpackage.a1x0
    public final void d(b1x0 b1x0Var) {
        switch (this.a) {
            case 0:
                synchronized (((s) this.b).a) {
                    try {
                        switch (((s) this.b).j.ordinal()) {
                            case 0:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((s) this.b).j);
                            case 1:
                                sgb1.g(3, "CaptureSession");
                                break;
                            case 4:
                            case 5:
                            case 6:
                                ((s) this.b).m();
                                break;
                        }
                        sgb1.d("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((s) this.b).j);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                return;
        }
    }

    @Override // defpackage.a1x0
    public final void e(b1x0 b1x0Var) {
        switch (this.a) {
            case 0:
                synchronized (((s) this.b).a) {
                    try {
                        switch (((s) this.b).j.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((s) this.b).j);
                            case 4:
                                ((e1x0) b1x0Var).n();
                                break;
                            case 5:
                                ((s) this.b).e = b1x0Var;
                                break;
                            case 6:
                                ((s) this.b).r(CaptureSession$State.OPENED);
                                ((s) this.b).e = b1x0Var;
                                sgb1.g(3, "CaptureSession");
                                s sVar = (s) this.b;
                                sVar.q(sVar.f);
                                s sVar2 = (s) this.b;
                                sVar2.p.b().c(new dn7(11, sVar2), geb1.b());
                                break;
                        }
                        Objects.toString(((s) this.b).j);
                        sgb1.g(3, "CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                return;
        }
    }

    @Override // defpackage.a1x0
    public final void f(b1x0 b1x0Var) {
        switch (this.a) {
            case 0:
                synchronized (((s) this.b).a) {
                    try {
                        if (((s) this.b).j.ordinal() == 0) {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((s) this.b).j);
                        }
                        Objects.toString(((s) this.b).j);
                        sgb1.g(3, "CaptureSession");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b);
                return;
        }
    }

    @Override // defpackage.a1x0
    public final void g(b1x0 b1x0Var) {
        switch (this.a) {
            case 0:
                synchronized (((s) this.b).a) {
                    try {
                        if (((s) this.b).j == CaptureSession$State.UNINITIALIZED) {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((s) this.b).j);
                        }
                        sgb1.g(3, "CaptureSession");
                        ((s) this.b).m();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.a1x0
    public void h(b1x0 b1x0Var, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((hh5) ((d1x0) b1x0Var).m().b).b, surface);
                break;
        }
    }

    public r(s sVar) {
        this.b = sVar;
    }
}
