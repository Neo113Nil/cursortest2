package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.Config$OptionPriority;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes10.dex */
public final class mur {
    public static final MeteringRectangle[] x = new MeteringRectangle[0];
    public final b a;
    public final androidx.camera.core.impl.utils.executor.b b;
    public final k6u c;
    public final uk10 f;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public MeteringRectangle[] s;
    public androidx.concurrent.futures.b t;
    public androidx.concurrent.futures.b u;
    public boolean v;
    public jur w;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public lur o = null;
    public kur p = null;

    public mur(b bVar, k6u k6uVar, androidx.camera.core.impl.utils.executor.b bVar2, a73 a73Var) {
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = null;
        this.a = bVar;
        this.b = bVar2;
        this.c = k6uVar;
        this.f = new uk10(a73Var);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            r38 r38Var = new r38();
            r38Var.f = true;
            r38Var.c = this.n;
            vn7 vn7Var = new vn7();
            if (z) {
                vn7Var.b(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                vn7Var.b(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            r38Var.c(vn7Var.a());
            this.a.E(Collections.singletonList(r38Var.e()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [im7, kur] */
    public final void b(androidx.concurrent.futures.b bVar) {
        kur kurVar = this.p;
        b bVar2 = this.a;
        bVar2.B(kurVar);
        androidx.concurrent.futures.b bVar3 = this.u;
        if (bVar3 != null) {
            bVar3.d(new CameraControl$OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
            this.u = null;
        }
        bVar2.B(this.o);
        androidx.concurrent.futures.b bVar4 = this.t;
        if (bVar4 != null) {
            bVar4.d(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.t = null;
        }
        this.u = bVar;
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.g = false;
        final long F = bVar2.F();
        if (this.u != null) {
            final int w = bVar2.w(this.n != 3 ? 4 : 3);
            ?? r0 = new im7() { // from class: kur
                @Override // defpackage.im7
                public final boolean b(TotalCaptureResult totalCaptureResult) {
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != w || !b.A(totalCaptureResult, F)) {
                        return false;
                    }
                    mur murVar = this;
                    androidx.concurrent.futures.b bVar5 = murVar.u;
                    if (bVar5 == null) {
                        return true;
                    }
                    bVar5.b(null);
                    murVar.u = null;
                    return true;
                }
            };
            this.p = r0;
            bVar2.r(r0);
        }
    }

    public final euy c(boolean z) {
        if (b.v(this.a.e, 5) != 5) {
            return hiv.c;
        }
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.b.execute(new uf4(this, z, bVar, 4));
            bVar.a = "enableExternalFlashAeMode";
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d(List list, int i, Rational rational, Rect rect, int i2) {
        PointF pointF;
        MeteringRectangle meteringRectangle;
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s920 s920Var = (s920) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = s920Var.a;
            float f2 = s920Var.c;
            if (f >= 0.0f && f <= 1.0f) {
                float f3 = s920Var.b;
                if (f3 >= 0.0f && f3 <= 1.0f) {
                    Rational rational3 = s920Var.d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    if (i2 == 1 && ((a73) this.f.a).a(AfRegionFlipHorizontallyQuirk.class)) {
                        pointF = new PointF(1.0f - f, f3);
                        if (!rational3.equals(rational2)) {
                            if (rational3.compareTo(rational2) > 0) {
                                float doubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                                pointF.y = (1.0f / doubleValue) * (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF.y);
                            } else {
                                float doubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                                pointF.x = (1.0f / doubleValue2) * (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF.x);
                            }
                        }
                        int width = (int) ((pointF.x * rect.width()) + rect.left);
                        int height = (int) ((pointF.y * rect.height()) + rect.top);
                        int width2 = ((int) (rect.width() * f2)) / 2;
                        int height2 = ((int) (f2 * rect.height())) / 2;
                        Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
                        rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                        rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                        rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                        rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                        meteringRectangle = new MeteringRectangle(rect2, 1000);
                        if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                            arrayList.add(meteringRectangle);
                        }
                    }
                    pointF = new PointF(f, f3);
                    if (!rational3.equals(rational2)) {
                    }
                    int width3 = (int) ((pointF.x * rect.width()) + rect.left);
                    int height3 = (int) ((pointF.y * rect.height()) + rect.top);
                    int width22 = ((int) (rect.width() * f2)) / 2;
                    int height22 = ((int) (f2 * rect.height())) / 2;
                    Rect rect22 = new Rect(width3 - width22, height3 - height22, width3 + width22, height3 + height22);
                    rect22.left = Math.min(Math.max(rect22.left, rect.left), rect.right);
                    rect22.right = Math.min(Math.max(rect22.right, rect.left), rect.right);
                    rect22.top = Math.min(Math.max(rect22.top, rect.top), rect.bottom);
                    rect22.bottom = Math.min(Math.max(rect22.bottom, rect.top), rect.bottom);
                    meteringRectangle = new MeteringRectangle(rect22, 1000);
                    if (meteringRectangle.getWidth() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final gl7 e() {
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.b.execute(new iur(this, bVar, 0));
            bVar.a = "triggerAePrecapture";
            return gl7Var;
        } catch (Exception e) {
            gl7Var.a(e);
            return gl7Var;
        }
    }

    public final void f(androidx.concurrent.futures.b bVar) {
        sgb1.g(3, "FocusMeteringControl");
        if (!this.d) {
            bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
            return;
        }
        r38 r38Var = new r38();
        r38Var.c = this.n;
        r38Var.f = true;
        vn7 vn7Var = new vn7();
        vn7Var.b(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        r38Var.c(vn7Var.a());
        r38Var.b(new zm7(1, bVar));
        this.a.E(Collections.singletonList(r38Var.e()));
    }

    public final void g(boolean z) {
        if (this.d) {
            r38 r38Var = new r38();
            r38Var.c = this.n;
            r38Var.f = true;
            vn7 vn7Var = new vn7();
            vn7Var.b(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z) {
                vn7Var.c(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(b.v(this.a.e, 1)), Config$OptionPriority.HIGH_PRIORITY_REQUIRED);
            }
            r38Var.c(vn7Var.a());
            r38Var.b(new y38(1));
            this.a.E(Collections.singletonList(r38Var.e()));
        }
    }
}
