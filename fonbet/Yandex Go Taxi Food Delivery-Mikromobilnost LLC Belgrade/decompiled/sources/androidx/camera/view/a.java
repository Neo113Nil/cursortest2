package androidx.camera.view;

import androidx.camera.core.impl.CameraInternal$State;
import androidx.camera.view.PreviewView;
import defpackage.ar7;
import defpackage.bye0;
import defpackage.dq60;
import defpackage.dy40;
import defpackage.eye0;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.gym;
import defpackage.hm7;
import defpackage.hsj0;
import defpackage.jqs;
import defpackage.ni91;
import defpackage.o89;
import defpackage.q6c0;
import defpackage.sgb1;
import defpackage.x4e;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class a implements dq60 {
    public final ar7 a;
    public final dy40 b;
    public PreviewView.StreamState c;
    public final eye0 d;
    public jqs e;
    public boolean f = false;

    public a(ar7 ar7Var, dy40 dy40Var, eye0 eye0Var) {
        this.a = ar7Var;
        this.b = dy40Var;
        this.d = eye0Var;
        synchronized (this) {
            this.c = (PreviewView.StreamState) dy40Var.d();
        }
    }

    @Override // defpackage.dq60
    public final void a(Object obj) {
        CameraInternal$State cameraInternal$State = (CameraInternal$State) obj;
        if (cameraInternal$State == CameraInternal$State.CLOSING || cameraInternal$State == CameraInternal$State.CLOSED || cameraInternal$State == CameraInternal$State.RELEASING || cameraInternal$State == CameraInternal$State.RELEASED) {
            b(PreviewView.StreamState.IDLE);
            if (this.f) {
                this.f = false;
                jqs jqsVar = this.e;
                if (jqsVar != null) {
                    jqsVar.cancel(false);
                    this.e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((cameraInternal$State == CameraInternal$State.OPENING || cameraInternal$State == CameraInternal$State.OPEN || cameraInternal$State == CameraInternal$State.PENDING_OPEN) && !this.f) {
            ar7 ar7Var = this.a;
            b(PreviewView.StreamState.IDLE);
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
            bVar.c = new hsj0();
            gl7 gl7Var = new gl7(bVar);
            bVar.b = gl7Var;
            bVar.a = x4e.class;
            try {
                hm7 hm7Var = new hm7(bVar, ar7Var);
                arrayList.add(hm7Var);
                ar7Var.e(geb1.b(), hm7Var);
                bVar.a = "waitForCaptureResult";
            } catch (Exception e) {
                gl7Var.a(e);
            }
            o89 n = ni91.n(jqs.a(gl7Var), new bye0(this), geb1.b());
            bye0 bye0Var = new bye0(this);
            o89 n2 = ni91.n(n, new gym(bye0Var), geb1.b());
            this.e = n2;
            ni91.a(n2, new q6c0(this, arrayList, ar7Var, false, 12), geb1.b());
            this.f = true;
        }
    }

    public final void b(PreviewView.StreamState streamState) {
        synchronized (this) {
            try {
                if (this.c.equals(streamState)) {
                    return;
                }
                this.c = streamState;
                Objects.toString(streamState);
                sgb1.g(3, "StreamStateObserver");
                this.b.m(streamState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dq60
    public final void onError(Throwable th) {
        jqs jqsVar = this.e;
        if (jqsVar != null) {
            jqsVar.cancel(false);
            this.e = null;
        }
        b(PreviewView.StreamState.IDLE);
    }
}
