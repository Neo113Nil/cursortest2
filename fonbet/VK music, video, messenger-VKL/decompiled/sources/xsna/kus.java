package xsna;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: FroyoGestureDetector.java */
@TargetApi(8)
/* loaded from: classes17.dex */
public final class kus extends wwo {
    public final ScaleGestureDetector j;

    public kus(Context context) {
        super(context);
        this.j = new ScaleGestureDetector(context, new a());
    }

    public final boolean a(MotionEvent motionEvent) {
        float x;
        float y;
        float x2;
        float y2;
        float x3;
        float y3;
        VelocityTracker velocityTracker;
        this.j.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.h = -1;
        } else if (action == 6) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            if (motionEvent.getPointerId(action2) == this.h) {
                int i = action2 == 0 ? 1 : 0;
                this.h = motionEvent.getPointerId(i);
                this.b = motionEvent.getX(i);
                this.c = motionEvent.getY(i);
            }
        }
        int i2 = this.h;
        if (i2 == -1) {
            i2 = 0;
        }
        this.i = motionEvent.findPointerIndex(i2);
        int action3 = motionEvent.getAction();
        if (action3 == 0) {
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x = motionEvent.getX(this.i);
            } catch (Exception unused) {
                x = motionEvent.getX();
            }
            this.b = x;
            try {
                y = motionEvent.getY(this.i);
            } catch (Exception unused2) {
                y = motionEvent.getY();
            }
            this.c = y;
            this.g = false;
        } else if (action3 == 1) {
            if (this.g && this.f != null) {
                try {
                    x2 = motionEvent.getX(this.i);
                } catch (Exception unused3) {
                    x2 = motionEvent.getX();
                }
                this.b = x2;
                try {
                    y2 = motionEvent.getY(this.i);
                } catch (Exception unused4) {
                    y2 = motionEvent.getY();
                }
                this.c = y2;
                this.f.addMovement(motionEvent);
                this.f.computeCurrentVelocity(1000);
                if (Math.max(Math.abs(this.f.getXVelocity()), Math.abs(this.f.getYVelocity())) >= this.e) {
                    this.a.getClass();
                }
            }
            VelocityTracker velocityTracker2 = this.f;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f = null;
            }
        } else if (action3 == 2) {
            try {
                x3 = motionEvent.getX(this.i);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            try {
                y3 = motionEvent.getY(this.i);
            } catch (Exception unused6) {
                y3 = motionEvent.getY();
            }
            float f = x3 - this.b;
            float f2 = y3 - this.c;
            if (!this.g) {
                this.g = ((float) Math.sqrt((double) ((f2 * f2) + (f * f)))) >= this.d;
            }
            if (this.g) {
                com.vk.crop.f fVar = this.a;
                if (!fVar.b.j.isInProgress()) {
                    com.vk.crop.b bVar = (com.vk.crop.b) fVar.c;
                    bfk bfkVar = bVar.c;
                    if (!bVar.c(1.0f)) {
                        float cropWidth = bfkVar.getCropWidth();
                        float abs = ((Math.abs(f) * 0.43f) * cropWidth) / ((Math.abs(f) * 0.43f) + cropWidth);
                        f = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -abs : abs;
                        float cropHeight = bfkVar.getCropHeight();
                        float abs2 = ((Math.abs(f2) * 0.43f) * cropHeight) / ((Math.abs(f2) * 0.43f) + cropHeight);
                        f2 = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -abs2 : abs2;
                    }
                    bVar.e.b(f, f2, false);
                    bVar.e();
                }
                this.b = x3;
                this.c = y3;
                VelocityTracker velocityTracker3 = this.f;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            }
        } else if (action3 == 3 && (velocityTracker = this.f) != null) {
            velocityTracker.recycle();
            this.f = null;
            return true;
        }
        return true;
    }

    /* compiled from: FroyoGestureDetector.java */
    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            com.vk.crop.f fVar = kus.this.a;
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            com.vk.crop.b bVar = (com.vk.crop.b) fVar.c;
            bVar.e.a(scaleFactor, focusX, focusY, false);
            bVar.e();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
