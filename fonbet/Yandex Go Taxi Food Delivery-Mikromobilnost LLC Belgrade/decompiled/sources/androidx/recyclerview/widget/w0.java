package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.sji0;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w0 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator w;
    public boolean x;
    public boolean y;
    public final /* synthetic */ RecyclerView z;

    public w0(RecyclerView recyclerView) {
        this.z = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.w = interpolator;
        this.x = false;
        this.y = false;
        this.c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.z;
        recyclerView.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator = this.w;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.w = interpolator2;
            this.c = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.x) {
            this.y = true;
            return;
        }
        RecyclerView recyclerView = this.z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, Interpolator interpolator, int i3) {
        RecyclerView recyclerView = this.z;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.w != interpolator) {
            this.w = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.z;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.y = false;
        this.x = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int consumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i5);
            int consumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i6);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                consumeFlingInHorizontalStretch -= iArr2[0];
                consumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i7 = iArr4[0];
                int i8 = iArr4[1];
                int i9 = consumeFlingInHorizontalStretch - i7;
                int i10 = consumeFlingInVerticalStretch - i8;
                RecyclerView.j jVar = recyclerView.mLayout.x;
                if (jVar != null && !jVar.d && jVar.e) {
                    int b = recyclerView.mState.b();
                    if (b == 0) {
                        jVar.i();
                    } else if (jVar.a >= b) {
                        jVar.a = b - 1;
                        jVar.d(i7, i8);
                    } else {
                        jVar.d(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = consumeFlingInHorizontalStretch;
                i2 = consumeFlingInVerticalStretch;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i11 = i - iArr6[0];
            int i12 = i2 - iArr6[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.dispatchOnScrolled(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            RecyclerView.j jVar2 = recyclerView.mLayout.x;
            if ((jVar2 == null || !jVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i13, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    o oVar = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = oVar.c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    oVar.d = 0;
                }
            } else {
                b();
                p pVar = recyclerView.mGapWorker;
                if (pVar != null) {
                    pVar.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                sji0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        RecyclerView.j jVar3 = recyclerView.mLayout.x;
        if (jVar3 != null && jVar3.d) {
            jVar3.d(0, 0);
        }
        this.x = false;
        if (!this.y) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
