package xsna;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import xsna.aqx0;
import xsna.iut0;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class kgm extends td implements omm, u080 {
    public final Window l;
    public final wh50 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    /* compiled from: AndroidDialog.android.kt */
    public static final class a extends aqx0.b {
        public a() {
            super(1);
        }

        @Override // xsna.aqx0.b
        public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
            kgm kgmVar = kgm.this;
            if (!kgmVar.o) {
                View childAt = kgmVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, kgmVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, kgmVar.getHeight() - childAt.getBottom());
                if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                    return bqx0Var.a.r(max, max2, max3, max4);
                }
            }
            return bqx0Var;
        }

        @Override // xsna.aqx0.b
        public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
            kgm kgmVar = kgm.this;
            if (!kgmVar.o) {
                View childAt = kgmVar.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, kgmVar.getWidth() - childAt.getRight());
                int max4 = Math.max(0, kgmVar.getHeight() - childAt.getBottom());
                if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                    h4x c = h4x.c(max, max2, max3, max4);
                    int i = c.a;
                    h4x h4xVar = aVar.a;
                    int i2 = c.b;
                    int i3 = c.c;
                    int i4 = c.d;
                    return new aqx0.a(bqx0.e(h4xVar, i, i2, i3, i4), bqx0.e(aVar.b, i, i2, i3, i4));
                }
            }
            return aVar;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class b extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            kgm.this.o(ne7.I(this.$$changed | 1), aVar);
            return s3q0.a;
        }
    }

    public kgm(Context context, Window window) {
        super(context, null, 6, 0);
        this.l = window;
        this.m = androidx.compose.runtime.k.b(tai.a);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(this, this);
        aqx0.a(this, new a());
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        if (!this.o) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return bqx0Var.a.r(max, max2, max3, max4);
            }
        }
        return bqx0Var;
    }

    @Override // xsna.td
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.q;
    }

    @Override // xsna.omm
    public final Window getWindow() {
        return this.l;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1735448596);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:506)");
            }
            ((wzs) ((zak0) this.m).getValue()).invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b(i);
        }
    }

    @Override // xsna.td
    public final void u(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // xsna.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i, int i2) {
        int i3;
        int i4;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.v(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.l;
        if (mode2 == Integer.MIN_VALUE && !this.n && window.getAttributes().height == -2) {
            if (this.o) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = pw2.a.a(window);
                } else if (i5 < 32) {
                    i3 = sw2.a.a(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = i3 - paddingBottom;
            int i7 = i6 >= 0 ? i6 : 0;
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.o && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.n) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        int i62 = i3 - paddingBottom2;
        if (i62 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.o) {
        }
    }
}
