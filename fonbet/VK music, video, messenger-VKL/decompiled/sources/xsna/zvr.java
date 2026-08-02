package xsna;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.f;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import xsna.ub9;

/* compiled from: FocusMeteringControl.java */
/* loaded from: classes11.dex */
public final class zvr {
    public final re9 a;
    public final tli0 b;
    public final mtu c;
    public ScheduledFuture<?> g;
    public volatile boolean d = false;
    public boolean e = false;

    @NonNull
    public Integer f = 0;
    public long h = 0;
    public boolean i = false;
    public xvr j = null;
    public MeteringRectangle[] k = new MeteringRectangle[0];
    public MeteringRectangle[] l = new MeteringRectangle[0];
    public MeteringRectangle[] m = new MeteringRectangle[0];
    public MeteringRectangle[] n = new MeteringRectangle[0];
    public MeteringRectangle[] o = new MeteringRectangle[0];
    public MeteringRectangle[] p = new MeteringRectangle[0];
    public ub9.a<bwr> q = null;

    /* compiled from: FocusMeteringControl.java */
    public class a extends gg9 {
        public final /* synthetic */ ub9.a a;

        public a(ub9.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.gg9
        public final void a() {
            ub9.a aVar = this.a;
            if (aVar != null) {
                aVar.d(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // xsna.gg9
        public final void b(@NonNull he9 he9Var) {
            ub9.a aVar = this.a;
            if (aVar != null) {
                aVar.b(he9Var);
            }
        }

        @Override // xsna.gg9
        public final void c(@NonNull CameraCaptureFailure cameraCaptureFailure) {
            ub9.a aVar = this.a;
            if (aVar != null) {
                aVar.d(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    public zvr(@NonNull re9 re9Var, @NonNull mtu mtuVar, @NonNull tli0 tli0Var) {
        this.a = re9Var;
        this.b = tli0Var;
        this.c = mtuVar;
    }

    public static PointF c(@NonNull ej20 ej20Var, @NonNull Rational rational, @NonNull Rational rational2) {
        PointF pointF = new PointF(ej20Var.a, ej20Var.b);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointF.y = (1.0f / doubleValue) * (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF.y);
                return pointF;
            }
            float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointF.x = (1.0f / doubleValue2) * (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF.x);
        }
        return pointF;
    }

    public static MeteringRectangle d(ej20 ej20Var, PointF pointF, Rect rect) {
        int width = (int) ((pointF.x * rect.width()) + rect.left);
        int height = (int) ((pointF.y * rect.height()) + rect.top);
        int width2 = ((int) (ej20Var.c * rect.width())) / 2;
        int height2 = ((int) (ej20Var.c * rect.height())) / 2;
        Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
        rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
        rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
        rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
        rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
        return new MeteringRectangle(rect2, 1000);
    }

    public static boolean e(@Nullable MeteringRectangle[] meteringRectangleArr, @Nullable MeteringRectangle[] meteringRectangleArr2) {
        if ((meteringRectangleArr == null ? 0 : meteringRectangleArr.length) == 0) {
            if ((meteringRectangleArr2 == null ? 0 : meteringRectangleArr2.length) == 0) {
                return true;
            }
        }
        if ((meteringRectangleArr == null ? 0 : meteringRectangleArr.length) != (meteringRectangleArr2 == null ? 0 : meteringRectangleArr2.length)) {
            return false;
        }
        if (meteringRectangleArr != null && meteringRectangleArr2 != null) {
            for (int i = 0; i < meteringRectangleArr.length; i++) {
                if (!meteringRectangleArr[i].equals(meteringRectangleArr2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean f(@NonNull ej20 ej20Var) {
        float f = ej20Var.a;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
            return false;
        }
        float f2 = ej20Var.b;
        return f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= 1.0f;
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            f.a aVar = new f.a();
            aVar.e = true;
            aVar.c = 1;
            androidx.camera.core.impl.n z3 = androidx.camera.core.impl.n.z();
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                androidx.camera.core.impl.a aVar2 = if9.t;
                z3.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), 2);
            }
            if (z2) {
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                androidx.camera.core.impl.a aVar3 = if9.t;
                z3.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key2.getName(), Object.class, key2), 2);
            }
            aVar.c(new if9(androidx.camera.core.impl.o.y(z3)));
            this.a.m(Collections.singletonList(aVar.d()));
        }
    }

    public final void b() {
        re9 re9Var = this.a;
        re9Var.b.a.remove(null);
        re9Var.b.a.remove(this.j);
        ub9.a<bwr> aVar = this.q;
        if (aVar != null) {
            aVar.d(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.q = null;
        }
        ScheduledFuture<?> scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.g = null;
        }
        if (this.k.length > 0) {
            a(true, false);
        }
        this.k = new MeteringRectangle[0];
        this.l = new MeteringRectangle[0];
        this.m = new MeteringRectangle[0];
        this.e = false;
        re9Var.n();
    }

    public final void g(@Nullable ub9.a<androidx.camera.core.impl.c> aVar) {
        if (!this.d) {
            if (aVar != null) {
                aVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        f.a aVar2 = new f.a();
        aVar2.c = 1;
        aVar2.e = true;
        androidx.camera.core.impl.n z = androidx.camera.core.impl.n.z();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        androidx.camera.core.impl.a aVar3 = if9.t;
        z.C(new androidx.camera.core.impl.a("camera2.captureRequest.option." + key.getName(), Object.class, key), 1);
        aVar2.c(new if9(androidx.camera.core.impl.o.y(z)));
        aVar2.b(new a(aVar));
        this.a.m(Collections.singletonList(aVar2.d()));
    }
}
