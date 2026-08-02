package xsna;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ScaleGestureDetectorWithConfigurableSpan.java */
/* loaded from: classes6.dex */
public final class s4h0 {
    public final ViewGroup a;
    public float b;
    public float c;
    public boolean d;
    public final boolean e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public final int j;
    public int k;
    public float l;
    public float m;
    public int n = 0;
    public final GestureDetector o;
    public boolean p;

    /* compiled from: ScaleGestureDetectorWithConfigurableSpan.java */
    public interface a {
        void d();

        void e(@NonNull s4h0 s4h0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s4h0(@NonNull Context context, @NonNull a aVar) {
        this.a = (ViewGroup) aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.j = viewConfiguration.getScaledTouchSlop() * 2;
        this.k = Build.VERSION.SDK_INT >= 29 ? viewConfiguration.getScaledMinimumScalingSpan() : 300;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.d = true;
            if (this.o == null) {
                this.o = new GestureDetector(context, new r4h0(this), null);
            }
        }
        if (i > 22) {
            this.e = true;
        }
    }

    public final float a() {
        if (!b()) {
            float f = this.g;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return this.f / f;
            }
            return 1.0f;
        }
        boolean z = this.p;
        boolean z2 = (z && this.f < this.g) || (!z && this.f > this.g);
        float abs = Math.abs(1.0f - (this.f / this.g)) * 0.5f;
        if (this.g <= this.j) {
            return 1.0f;
        }
        return z2 ? abs + 1.0f : 1.0f - abs;
    }

    public final boolean b() {
        return this.n != 0;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.ViewGroup, xsna.s4h0$a] */
    public final void c(@NonNull MotionEvent motionEvent) {
        float f;
        float f2;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.d) {
            this.o.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z = (motionEvent.getButtonState() & 32) != 0;
        boolean z2 = this.n == 2 && !z;
        boolean z3 = actionMasked == 1 || actionMasked == 3 || z2;
        ?? r10 = this.a;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (actionMasked == 0 || z3) {
            if (this.i) {
                r10.d();
                this.i = false;
                this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.n = 0;
            } else if (b() && z3) {
                this.i = false;
                this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.n = 0;
            }
            if (z3) {
                return;
            }
        }
        if (!this.i && this.e && !b() && !z3 && z) {
            this.l = motionEvent.getX();
            this.m = motionEvent.getY();
            this.n = 2;
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        boolean z4 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2;
        boolean z5 = actionMasked == 6;
        int actionIndex = z5 ? motionEvent.getActionIndex() : -1;
        int i = z5 ? pointerCount - 1 : pointerCount;
        if (b()) {
            f2 = this.l;
            f = this.m;
            if (motionEvent.getY() < f) {
                this.p = true;
            } else {
                this.p = false;
            }
        } else {
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    f4 += motionEvent.getX(i2);
                    f5 += motionEvent.getY(i2);
                }
            }
            float f6 = i;
            float f7 = f4 / f6;
            f = f5 / f6;
            f2 = f7;
        }
        float f8 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                float abs = Math.abs(motionEvent.getX(i3) - f2) + f3;
                f8 = Math.abs(motionEvent.getY(i3) - f) + f8;
                f3 = abs;
            }
        }
        float f9 = i;
        float f10 = (f3 / f9) * 2.0f;
        float f11 = (f8 / f9) * 2.0f;
        if (!b()) {
            f11 = (float) Math.hypot(f10, f11);
        }
        boolean z6 = this.i;
        this.b = f2;
        this.c = f;
        if (!b() && this.i && (f11 < this.k || z4)) {
            r10.d();
            this.i = false;
            this.h = f11;
        }
        if (z4) {
            this.f = f11;
            this.g = f11;
            this.h = f11;
        }
        boolean b = b();
        int i4 = this.j;
        int i5 = b ? i4 : this.k;
        if (!this.i && f11 >= i5 && (z6 || Math.abs(f11 - this.h) > i4)) {
            this.f = f11;
            this.g = f11;
            this.i = true;
        }
        if (actionMasked == 2) {
            this.f = f11;
            if (this.i) {
                r10.e(this);
            }
            this.g = this.f;
        }
    }
}
