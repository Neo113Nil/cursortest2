package xsna;

import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl$OperationCanceledException;
import xsna.if9;
import xsna.re9;
import xsna.ub9;

/* compiled from: Camera2CameraControl.java */
/* loaded from: classes11.dex */
public final class me9 {
    public final re9 c;
    public final tli0 d;
    public ub9.a<Void> g;
    public boolean a = false;
    public boolean b = false;
    public final Object e = new Object();
    public if9.a f = new if9.a();
    public final je9 h = new re9.c() { // from class: xsna.je9
        /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        @Override // xsna.re9.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            ub9.a<Void> aVar;
            Integer a;
            me9 me9Var = me9.this;
            if (me9Var.g != null) {
                Object tag = totalCaptureResult.getRequest().getTag();
                if ((tag instanceof d0o0) && (a = ((d0o0) tag).a("Camera2CameraControl")) != null && a.equals(Integer.valueOf(me9Var.g.hashCode()))) {
                    aVar = me9Var.g;
                    me9Var.g = null;
                    if (aVar != null) {
                        return false;
                    }
                    aVar.b(null);
                    return false;
                }
            }
            aVar = null;
            if (aVar != null) {
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.je9] */
    public me9(@NonNull re9 re9Var, @NonNull tli0 tli0Var) {
        this.c = re9Var;
        this.d = tli0Var;
    }

    @NonNull
    public final if9 a() {
        if9 if9Var;
        synchronized (this.e) {
            try {
                ub9.a<Void> aVar = this.g;
                if (aVar != null) {
                    this.f.a.C(if9.y, Integer.valueOf(aVar.hashCode()));
                }
                if9.a aVar2 = this.f;
                aVar2.getClass();
                if9Var = new if9(androidx.camera.core.impl.o.y(aVar2.a));
            } catch (Throwable th) {
                throw th;
            }
        }
        return if9Var;
    }

    public final void b(ub9.a<Void> aVar) {
        this.b = true;
        ub9.a<Void> aVar2 = this.g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.g = aVar;
        if (this.a) {
            re9 re9Var = this.c;
            re9Var.c.execute(new kv3(re9Var, 2));
            this.b = false;
        }
        if (aVar2 != null) {
            aVar2.d(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
