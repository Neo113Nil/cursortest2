package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.i8m;
import defpackage.vji0;

/* loaded from: classes10.dex */
public final class l extends RecyclerView.d implements vji0 {
    public static final int[] V = {R.attr.state_pressed};
    public static final int[] W = new int[0];
    public final Drawable A;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public int H;
    public float I;
    public final RecyclerView L;
    public final ValueAnimator S;
    public int T;
    public final i8m U;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable w;
    public final int x;
    public final int y;
    public final StateListDrawable z;
    public int J = 0;
    public int K = 0;
    public boolean M = false;
    public boolean N = false;
    public int O = 0;
    public int P = 0;
    public final int[] Q = new int[2];
    public final int[] R = new int[2];

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        this.T = 0;
        i8m i8mVar = new i8m(7, this);
        this.U = i8mVar;
        k kVar = new k(this);
        this.c = stateListDrawable;
        this.w = drawable;
        this.z = stateListDrawable2;
        this.A = drawable2;
        this.x = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.y = Math.max(i, drawable.getIntrinsicWidth());
        this.B = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.C = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.FastScroller$AnimatorListener
            private boolean mCanceled = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.mCanceled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.mCanceled) {
                    this.mCanceled = false;
                    return;
                }
                float floatValue = ((Float) l.this.S.getAnimatedValue()).floatValue();
                l lVar = l.this;
                if (floatValue == 0.0f) {
                    lVar.T = 0;
                    lVar.i(0);
                } else {
                    lVar.T = 2;
                    lVar.L.invalidate();
                }
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.recyclerview.widget.FastScroller$AnimatorUpdater
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                l.this.c.setAlpha(floatValue);
                l.this.w.setAlpha(floatValue);
                l.this.L.invalidate();
            }
        });
        RecyclerView recyclerView2 = this.L;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.L.removeOnItemTouchListener(this);
            this.L.removeOnScrollListener(kVar);
            this.L.removeCallbacks(i8mVar);
        }
        this.L = recyclerView;
        recyclerView.addItemDecoration(this);
        this.L.addOnItemTouchListener(this);
        this.L.addOnScrollListener(kVar);
    }

    public static int h(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i = this.J;
        RecyclerView recyclerView2 = this.L;
        if (i != recyclerView2.getWidth() || this.K != recyclerView2.getHeight()) {
            this.J = recyclerView2.getWidth();
            this.K = recyclerView2.getHeight();
            i(0);
            return;
        }
        if (this.T != 0) {
            if (this.M) {
                int i2 = this.J;
                int i3 = this.x;
                int i4 = i2 - i3;
                int i5 = this.E;
                int i6 = this.D;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.y;
                int i9 = this.K;
                Drawable drawable = this.w;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.N) {
                int i10 = this.K;
                int i11 = this.B;
                int i12 = i10 - i11;
                int i13 = this.H;
                int i14 = this.G;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.z;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.J;
                int i17 = this.C;
                Drawable drawable2 = this.A;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean f(float f, float f2) {
        if (f2 < this.K - this.B) {
            return false;
        }
        int i = this.H;
        int i2 = this.G;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    public final boolean g(float f, float f2) {
        int layoutDirection = this.L.getLayoutDirection();
        int i = this.x;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.J - i) {
            return false;
        }
        int i2 = this.E;
        int i3 = this.D / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void i(int i) {
        RecyclerView recyclerView = this.L;
        i8m i8mVar = this.U;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.O != 2) {
            stateListDrawable.setState(V);
            recyclerView.removeCallbacks(i8mVar);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            j();
        }
        if (this.O == 2 && i != 2) {
            stateListDrawable.setState(W);
            recyclerView.removeCallbacks(i8mVar);
            recyclerView.postDelayed(i8mVar, OperationProgressView.ROTATION_ANIMATION_DURATION);
        } else if (i == 1) {
            recyclerView.removeCallbacks(i8mVar);
            recyclerView.postDelayed(i8mVar, 1500L);
        }
        this.O = i;
    }

    public final void j() {
        int i = this.T;
        ValueAnimator valueAnimator = this.S;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.T = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.O;
        if (i != 1) {
            return i == 2;
        }
        boolean g = g(motionEvent.getX(), motionEvent.getY());
        boolean f = f(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!g && !f) {
            return false;
        }
        if (f) {
            this.P = 1;
            this.I = (int) motionEvent.getX();
        } else if (g) {
            this.P = 2;
            this.F = (int) motionEvent.getY();
        }
        i(2);
        return true;
    }

    @Override // defpackage.vji0
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // defpackage.vji0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.O == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (g || f) {
                if (f) {
                    this.P = 1;
                    this.I = (int) motionEvent.getX();
                } else if (g) {
                    this.P = 2;
                    this.F = (int) motionEvent.getY();
                }
                i(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.O == 2) {
            this.F = 0.0f;
            this.I = 0.0f;
            i(1);
            this.P = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.O == 2) {
            j();
            int i = this.P;
            RecyclerView recyclerView2 = this.L;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.R;
                iArr[0] = i2;
                int i3 = this.J - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.H - max) >= 2.0f) {
                    int h = h(this.I, max, iArr, recyclerView2.computeHorizontalScrollRange(), recyclerView2.computeHorizontalScrollOffset(), this.J);
                    if (h != 0) {
                        recyclerView2.scrollBy(h, 0);
                    }
                    this.I = max;
                }
            }
            if (this.P == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.Q;
                iArr2[0] = i2;
                int i4 = this.K - i2;
                iArr2[1] = i4;
                float max2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.E - max2) < 2.0f) {
                    return;
                }
                int h2 = h(this.F, max2, iArr2, recyclerView2.computeVerticalScrollRange(), recyclerView2.computeVerticalScrollOffset(), this.K);
                if (h2 != 0) {
                    recyclerView2.scrollBy(0, h2);
                }
                this.F = max2;
            }
        }
    }
}
