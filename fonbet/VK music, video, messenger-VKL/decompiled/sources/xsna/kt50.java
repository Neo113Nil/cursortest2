package xsna;

import android.annotation.SuppressLint;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import kotlin.Pair;

/* compiled from: MyTouchListener.kt */
/* loaded from: classes4.dex */
public final class kt50 implements View.OnTouchListener {
    public final CollageSlotView b;
    public final defpackage.e c;
    public defpackage.f d;
    public CollageSlotView.a e;
    public CollageSlotView.b f;
    public boolean g;
    public long h;
    public float n;
    public boolean p;
    public int x;
    public float i = -1.0f;
    public float j = -1.0f;
    public float k = -1.0f;
    public float l = -1.0f;
    public float m = -1.0f;
    public float o = 1.0f;
    public float q = -1.0f;
    public float r = -1.0f;
    public float s = -1.0f;
    public float t = -1.0f;
    public float u = -1.0f;
    public float v = -1.0f;
    public float w = -1.0f;
    public int y = -1;

    /* compiled from: MyTouchListener.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final Float g;
        public final float h;

        public a(float f, float f2, float f3, float f4, float f5, float f6, Float f7, float f8) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = f8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && Float.compare(this.e, aVar.e) == 0 && Float.compare(this.f, aVar.f) == 0 && this.g.equals(aVar.g) && Float.compare(this.h, aVar.h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.h) + ((this.g.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 961)) * 31);
        }

        public final String toString() {
            StringBuilder a = bxj0.a("Transform(centerX=", this.a, ", centerY=", this.b, ", pivotX=");
            gq.h(a, this.c, ", pivotY=", this.d, ", diffX=");
            gq.h(a, this.e, ", diffY=", this.f, ", scale=null, diffScale=");
            a.append(this.g);
            a.append(", diffAngle=");
            a.append(this.h);
            a.append(")");
            return a.toString();
        }
    }

    public kt50(CollageSlotView collageSlotView, defpackage.e eVar) {
        this.b = collageSlotView;
        this.c = eVar;
    }

    public final float a(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.x);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.y);
        if (motionEvent.getPointerCount() < 2 || findPointerIndex == -1 || findPointerIndex2 == -1 || this.q < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.r < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.s < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.t < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float degrees = ((float) Math.toDegrees(Math.atan2(this.r - this.t, this.q - this.s) - Math.atan2(y - y2, x - x2))) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        if (degrees > 180.0f) {
            degrees -= 360.0f;
        }
        return -degrees;
    }

    public final Pair<Float, Float> b(MotionEvent motionEvent) {
        float x;
        float y;
        int findPointerIndex = motionEvent.findPointerIndex(this.x);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.y);
        if (motionEvent.getPointerCount() < 2 || findPointerIndex < 0 || findPointerIndex2 < 0) {
            x = motionEvent.getX();
            y = motionEvent.getY();
        } else {
            float x2 = motionEvent.getX(findPointerIndex);
            float x3 = motionEvent.getX(findPointerIndex2);
            float y2 = motionEvent.getY(findPointerIndex);
            float y3 = motionEvent.getY(findPointerIndex2);
            x = wq.a(x3, x2, 2.0f, x2);
            y = wq.a(y3, y2, 2.0f, y2);
        }
        return new Pair<>(Float.valueOf(x), Float.valueOf(y));
    }

    public final float c(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.x);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.y);
        if (motionEvent.getPointerCount() < 2 || findPointerIndex == -1 || findPointerIndex2 == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float x = motionEvent.getX(findPointerIndex) - motionEvent.getX(findPointerIndex2);
        float y = motionEvent.getY(findPointerIndex) - motionEvent.getY(findPointerIndex2);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    public final float d(MotionEvent motionEvent) {
        return (motionEvent.getPointerCount() < 2 || this.y == -1 || this.k == -1.0f) ? this.o : c(motionEvent) / this.k;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CollageSlotView.b bVar;
        defpackage.f fVar;
        CollageSlotView.b bVar2;
        Pair<Float, Float> b;
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            boolean z = false;
            if (valueOf != null && valueOf.intValue() == 5) {
                if (this.p) {
                    if (this.y < 0) {
                        this.y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.s = motionEvent.getX(motionEvent.getActionIndex());
                        this.t = motionEvent.getY(motionEvent.getActionIndex());
                        Pair<Float, Float> b2 = b(motionEvent);
                        float floatValue = b2.d().floatValue();
                        float floatValue2 = b2.g().floatValue();
                        this.i = floatValue;
                        this.j = floatValue2;
                        this.k = c(motionEvent);
                        this.l = this.i;
                        this.m = this.j;
                        this.n = a(motionEvent);
                        this.o = 1.0f;
                        return true;
                    }
                }
                return false;
            }
            if (valueOf != null && valueOf.intValue() == 6) {
                if (this.p) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int i = this.x;
                    if (pointerId == i) {
                        int i2 = this.y;
                        this.x = i2;
                        this.y = -1;
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex < 0) {
                            this.p = false;
                            return true;
                        }
                        this.i = motionEvent.getX(findPointerIndex);
                        this.j = motionEvent.getY(findPointerIndex);
                        this.k = -1.0f;
                        this.q = motionEvent.getX(findPointerIndex);
                        this.r = motionEvent.getY(findPointerIndex);
                        this.s = -1.0f;
                        this.t = -1.0f;
                    } else if (pointerId == this.y) {
                        this.y = -1;
                        int findPointerIndex2 = motionEvent.findPointerIndex(i);
                        if (findPointerIndex2 < 0) {
                            this.p = false;
                            return true;
                        }
                        this.i = motionEvent.getX(findPointerIndex2);
                        this.j = motionEvent.getY(findPointerIndex2);
                        this.k = -1.0f;
                        this.s = -1.0f;
                        this.t = -1.0f;
                    }
                    this.l = this.i;
                    this.m = this.j;
                    this.n = a(motionEvent);
                    return true;
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                if (this.p && this.g) {
                    Pair<Float, Float> b3 = b(motionEvent);
                    float floatValue3 = b3.d().floatValue();
                    float floatValue4 = b3.g().floatValue();
                    int findPointerIndex3 = motionEvent.findPointerIndex(this.x);
                    int findPointerIndex4 = motionEvent.findPointerIndex(this.y);
                    if (motionEvent.getPointerCount() < 2 || findPointerIndex3 < 0 || findPointerIndex4 < 0) {
                        b = b(motionEvent);
                    } else {
                        float x = motionEvent.getX(findPointerIndex3);
                        float x2 = motionEvent.getX(findPointerIndex4);
                        float y = motionEvent.getY(findPointerIndex3);
                        float y2 = motionEvent.getY(findPointerIndex4);
                        float a2 = wq.a(x2, x, 2.0f, x);
                        CollageSlotView collageSlotView = this.b;
                        b = new Pair<>(Float.valueOf(a2 / collageSlotView.getWidth()), Float.valueOf(wq.a(y2, y, 2.0f, y2) / collageSlotView.getWidth()));
                    }
                    float floatValue5 = b.d().floatValue();
                    float floatValue6 = b.g().floatValue();
                    float f = (floatValue3 - this.l) * 0.8f;
                    float f2 = (floatValue4 - this.m) * 0.8f;
                    float d = (d(motionEvent) - this.o) * 0.5f;
                    float a3 = (a(motionEvent) - this.n) * 0.5f;
                    this.u = Math.abs(f) + this.u;
                    this.v = Math.abs(f2) + this.v;
                    this.w = Math.abs(a3) + this.w;
                    SizeF sizeF = (SizeF) this.c.invoke();
                    float width = sizeF.getWidth();
                    float height = sizeF.getHeight();
                    CollageSlotView.a aVar = this.e;
                    if (aVar != null) {
                        aVar.invoke(new a(floatValue3 / width, floatValue4 / height, floatValue5 / width, floatValue6 / height, f / width, f2 / height, Float.valueOf(d), a3));
                    }
                    this.l = floatValue3;
                    this.m = floatValue4;
                    this.n = a(motionEvent);
                    this.o = d(motionEvent);
                    return true;
                }
            } else if (valueOf != null && valueOf.intValue() == 1) {
                if (this.p) {
                    this.p = false;
                    this.y = -1;
                    long currentTimeMillis = System.currentTimeMillis() - this.h;
                    if (((this.u < 25.0f && this.v < 25.0f && this.w < 5.0f) || !this.g) && currentTimeMillis < 110.0f) {
                        z = true;
                    }
                    if (this.g && (bVar2 = this.f) != null) {
                        bVar2.invoke(Boolean.FALSE);
                    }
                    if (z && (fVar = this.d) != null) {
                        fVar.invoke();
                        return true;
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 3) {
                if (this.p) {
                    this.p = false;
                    this.y = -1;
                    this.o = 1.0f;
                    if (this.g && (bVar = this.f) != null) {
                        bVar.invoke(Boolean.TRUE);
                    }
                }
            }
            return false;
        }
        if (!this.p) {
            this.p = true;
            this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.h = System.currentTimeMillis();
            this.i = motionEvent.getX(motionEvent.getActionIndex());
            this.j = motionEvent.getY(motionEvent.getActionIndex());
            this.q = motionEvent.getX(motionEvent.getActionIndex());
            this.r = motionEvent.getY(motionEvent.getActionIndex());
            this.l = this.i;
            this.m = this.j;
            this.n = a(motionEvent);
            this.o = 1.0f;
            this.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return true;
        }
        return true;
    }
}
