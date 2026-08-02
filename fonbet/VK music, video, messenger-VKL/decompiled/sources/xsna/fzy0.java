package xsna;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fzy0 extends nuy0 {
    /* JADX WARN: Removed duplicated region for block: B:43:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0371 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0325  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        phz0 phz0Var;
        View view;
        View view2;
        int i5;
        ProgressBar progressBar;
        ixy0 ixy0Var;
        gdy0 gdy0Var = this.f;
        if (gdy0Var.getVisibility() == 0) {
            c1z0.u(i4 - i2, i, gdy0Var);
        }
        int i6 = i3 - i;
        int i7 = i4 - i2;
        whz0 whz0Var = this.k;
        r5z0 r5z0Var = this.l;
        phz0 phz0Var2 = this.g;
        auy0 auy0Var = this.b;
        View view3 = this.o;
        View view4 = this.n;
        ldy0 ldy0Var = this.u;
        auy0 auy0Var2 = this.d;
        tjz0 tjz0Var = this.e;
        View view5 = this.p;
        int i8 = this.F;
        int i9 = this.B;
        whz0 whz0Var2 = this.j;
        View view6 = this.L;
        if (i6 < i7) {
            if (auy0Var2.getVisibility() == 0) {
                int i10 = i9 - i8;
                c1z0.m(i2 + i10, i6 - i10, auy0Var2);
            } else {
                c1z0.m(i2 + i9, i6 - i9, ldy0Var);
            }
            c1z0.r(tjz0Var, i2, i);
            int i11 = i4 - this.G;
            Button button = this.q;
            c1z0.j(button, 0, i11 - button.getMeasuredHeight(), i3, i11);
            c1z0.j(view6, i, i2, i3, i4);
            if (whz0Var2.getMeasuredWidth() > 0 && whz0Var2.getMeasuredHeight() > 0) {
                c1z0.j(whz0Var2, i, i2, i3, i4);
            }
            int left = view6 != null ? view6.getLeft() : 0;
            int top = view6 != null ? view6.getTop() : 0;
            int e = c1z0.e(view6 != null ? view6.getRight() : 0, whz0Var2.getRight());
            int e2 = c1z0.e(view6 != null ? view6.getBottom() : 0, whz0Var2.getBottom());
            view4.layout(left, top, e, e2);
            TextView textView = this.s;
            int measuredHeight = (i9 / 2) + textView.getMeasuredHeight();
            TextView textView2 = this.r;
            if (textView2.getVisibility() == 0) {
                measuredHeight += textView2.getMeasuredHeight() + i9;
            }
            int i12 = i6 - (i9 * 2);
            int measuredWidth = ((i12 - textView2.getMeasuredWidth()) / 2) + i9;
            int measuredWidth2 = ((i12 - textView.getMeasuredWidth()) / 2) + i9;
            int e3 = c1z0.e(whz0Var2.getBottom(), e2);
            if (measuredHeight < button.getTop() - e3) {
                int top2 = (((button.getTop() - e3) - measuredHeight) / 2) + e3;
                c1z0.r(textView2, top2, measuredWidth);
                c1z0.r(textView, c1z0.e(top2, textView2.getBottom() + this.K), measuredWidth2);
            } else {
                c1z0.u(button.getTop() - i9, measuredWidth2, textView);
                textView2.layout(0, 0, 0, 0);
            }
            int top3 = textView2.getTop() > 0 ? textView2.getTop() : textView.getTop() > 0 ? textView.getTop() : button.getTop();
            c1z0.r(view3, tjz0Var.getTop(), tjz0Var.getLeft());
            c1z0.r(view5, top3 - i9, i);
            int i13 = i9 - i8;
            c1z0.s(Math.min(view5.getTop(), Math.max(e2, whz0Var2.getBottom())) - i13, i3 - i13, auy0Var);
            phz0Var2.c(((double) (whz0Var2.getBottom() - view5.getTop())) > ((double) whz0Var2.getMeasuredHeight()) * 0.1d);
            int top4 = (gdy0Var.getVisibility() == 0 ? gdy0Var.getTop() : i4) - i9;
            c1z0.s(top4, i3 - i9, r5z0Var);
            c1z0.u(top4, i9, whz0Var);
            view2 = view6;
        } else {
            int visibility = auy0Var2.getVisibility();
            int i14 = this.J;
            if (visibility == 0) {
                int i15 = i14 - i8;
                view = view5;
                phz0Var = phz0Var2;
                c1z0.m(i2 + i15, i6 - i15, auy0Var2);
            } else {
                phz0Var = phz0Var2;
                view = view5;
                c1z0.m(i2 + i14, i6 - i14, ldy0Var);
            }
            if (!c(i6)) {
                c1z0.r(whz0Var, i14, i14);
                c1z0.u(i7, i, tjz0Var);
                c1z0.j(whz0Var2, i, i2, i3, i4);
                view2 = view6;
                c1z0.j(view2, i, i2, i3, i4);
                view4.layout(whz0Var2.getLeft(), whz0Var2.getTop(), whz0Var2.getRight(), whz0Var2.getBottom());
                i5 = 0;
                view3.layout(0, 0, 0, 0);
                c1z0.r(view, tjz0Var.getTop(), tjz0Var.getLeft());
                int i16 = i9 - i8;
                c1z0.s(tjz0Var.getTop() - i16, i3 - (i14 - i8), auy0Var);
                c1z0.s(auy0Var.getTop() - i16, i3 - i14, r5z0Var);
                phz0Var.c(true);
                int left2 = view2 == null ? view2.getLeft() : whz0Var2.getLeft();
                int top5 = view2 == null ? view2.getTop() : whz0Var2.getTop();
                int e4 = c1z0.e(view2 == null ? view2.getRight() : i5, whz0Var2.getRight());
                int e5 = c1z0.e(view2 == null ? view2.getBottom() : i5, whz0Var2.getBottom());
                progressBar = this.m;
                if (progressBar.getVisibility() == 0) {
                    c1z0.j(progressBar, left2, top5, e4, e5);
                }
                ixy0Var = this.h;
                if (ixy0Var.getVisibility() == 0) {
                    return;
                }
                Button button2 = this.i;
                if (button2.getVisibility() != 0) {
                    c1z0.j(ixy0Var, left2, top5, e4, e5);
                    return;
                }
                int a = defpackage.j0.a(e4, left2, button2.getMeasuredWidth() + ixy0Var.getMeasuredWidth() + i9, 2, left2);
                int measuredHeight2 = (((e5 - top5) - ixy0Var.getMeasuredHeight()) / 2) + top5;
                c1z0.r(ixy0Var, measuredHeight2, a);
                c1z0.r(button2, measuredHeight2, ixy0Var.getRight() + i9);
                return;
            }
            c1z0.j(whz0Var2, i, i2, whz0Var2.getMeasuredWidth() + i, i4);
            c1z0.j(view6, i, i2, (view6 != null ? view6.getMeasuredWidth() : 0) + i, i4);
            int left3 = view6 != null ? view6.getLeft() : whz0Var2.getLeft();
            int right = view6 != null ? view6.getRight() : whz0Var2.getRight();
            int bottom = view6 != null ? view6.getBottom() : whz0Var2.getBottom();
            int top6 = view6 != null ? view6.getTop() : whz0Var2.getTop();
            int e6 = c1z0.e(right, whz0Var2.getRight()) + i14;
            int measuredHeight3 = whz0Var.getMeasuredHeight();
            TextView textView3 = this.t;
            c1z0.g(i14, e6, c1z0.e(measuredHeight3, textView3.getMeasuredHeight()) + i8, i8, whz0Var, textView3);
            view4.layout(left3, top6, right, bottom);
            tjz0Var.layout(c1z0.e(right, whz0Var2.getRight()), i2, i3, i4);
            view3.layout(0, 0, 0, 0);
            int i17 = i14 - i8;
            c1z0.s(i4 - i17, Math.max(whz0Var2.getRight(), right) - i17, auy0Var);
            phz0Var.c(false);
            c1z0.r(view, i4, tjz0Var.getLeft());
            c1z0.m(i14, auy0Var2.getVisibility() == 0 ? (auy0Var2.getLeft() - i9) + i8 : ldy0Var.getVisibility() == 0 ? ldy0Var.getLeft() - i9 : i3 - i14, r5z0Var);
            view2 = view6;
        }
        i5 = 0;
        if (view2 == null) {
        }
        if (view2 == null) {
        }
        int e42 = c1z0.e(view2 == null ? view2.getRight() : i5, whz0Var2.getRight());
        int e52 = c1z0.e(view2 == null ? view2.getBottom() : i5, whz0Var2.getBottom());
        progressBar = this.m;
        if (progressBar.getVisibility() == 0) {
        }
        ixy0Var = this.h;
        if (ixy0Var.getVisibility() == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int visibility;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i7 = this.M;
        if (i7 <= 0 || (i6 = this.N) <= 0) {
            i3 = size;
        } else {
            float f = i7;
            float f2 = i6;
            float f3 = f / f2;
            float f4 = size;
            float f5 = f4 / f;
            float f6 = size2;
            if (Math.min(f5, f6 / f2) == f5 && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i4 = (int) (f4 / f3);
                i3 = size;
                View view = this.L;
                c1z0.i(view, i3, i4, Integer.MIN_VALUE);
                whz0 whz0Var = this.j;
                c1z0.i(whz0Var, i3, i4, Integer.MIN_VALUE);
                c1z0.i(this.n, i3, i4, 1073741824);
                int i8 = this.H;
                whz0 whz0Var2 = this.k;
                c1z0.i(whz0Var2, i8, i8, Integer.MIN_VALUE);
                int i9 = this.F * 2;
                int i10 = this.E;
                int i11 = i9 + i10;
                c1z0.i(this.b, i11, i11, 1073741824);
                c1z0.i(this.d, i11, i11, 1073741824);
                c1z0.i(this.u, i10, i10, 1073741824);
                r5z0 r5z0Var = this.l;
                c1z0.i(r5z0Var, i11, i11, 1073741824);
                TextView textView = this.t;
                View view2 = this.p;
                View view3 = this.o;
                tjz0 tjz0Var = this.e;
                TextView textView2 = this.s;
                TextView textView3 = this.r;
                if (size >= size2) {
                    tjz0Var.setVisibility(0);
                    view3.setVisibility(0);
                    view2.setVisibility(0);
                    textView.setVisibility(8);
                    c1z0.i(tjz0Var, size - i10, size2, Integer.MIN_VALUE);
                    c1z0.i(view3, size, tjz0Var.getMeasuredHeight(), 1073741824);
                    if (c1z0.e(view != null ? view.getMeasuredHeight() : 0, whz0Var.getMeasuredHeight()) * 1.6d > size2) {
                        textView3.setVisibility(8);
                        if (!TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(0);
                        }
                    } else {
                        if (TextUtils.isEmpty(textView3.getText())) {
                            textView3.setVisibility(8);
                        } else {
                            textView3.setVisibility(0);
                        }
                        if (TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(8);
                        } else {
                            textView2.setVisibility(0);
                        }
                    }
                    int i12 = this.B;
                    int i13 = i12 * 2;
                    i5 = 1073741824;
                    this.q.measure(View.MeasureSpec.makeMeasureSpec(((size - (i12 * 4)) - r5z0Var.getMeasuredWidth()) - whz0Var2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
                    int i14 = size - i13;
                    int i15 = size2 - i13;
                    c1z0.i(textView3, i14, i15, Integer.MIN_VALUE);
                    c1z0.i(textView2, i14, i15, Integer.MIN_VALUE);
                    c1z0.i(view2, size, size2, 1073741824);
                } else {
                    textView3.setVisibility(8);
                    textView2.setVisibility(8);
                    view3.setVisibility(8);
                    tjz0Var.setVisibility(0);
                    if (c(size)) {
                        textView.setVisibility(0);
                        view2.setVisibility(8);
                        c1z0.i(textView, size, size2, Integer.MIN_VALUE);
                        int e = size - c1z0.e(view != null ? view.getMeasuredWidth() : 0, whz0Var.getMeasuredWidth());
                        c1z0.i(tjz0Var, e, e, Integer.MIN_VALUE);
                    } else {
                        textView.setVisibility(8);
                        view2.setVisibility(0);
                        c1z0.i(tjz0Var, size, size2, Integer.MIN_VALUE);
                    }
                    i5 = 1073741824;
                    c1z0.i(view2, tjz0Var.getMeasuredWidth(), tjz0Var.getMeasuredHeight(), 1073741824);
                }
                ixy0 ixy0Var = this.h;
                visibility = ixy0Var.getVisibility();
                int i16 = this.C;
                if (visibility == 0) {
                    c1z0.i(ixy0Var, i16, i16, i5);
                    Button button = this.i;
                    if (button.getVisibility() == 0) {
                        button.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(ixy0Var.getMeasuredHeight(), i5));
                    }
                }
                c1z0.i(this.m, i16, i16, i5);
                c1z0.i(this.f, size, this.D, i5);
                setMeasuredDimension(size, size2);
            }
            i3 = (int) (f6 * f3);
        }
        i4 = size2;
        View view4 = this.L;
        c1z0.i(view4, i3, i4, Integer.MIN_VALUE);
        whz0 whz0Var3 = this.j;
        c1z0.i(whz0Var3, i3, i4, Integer.MIN_VALUE);
        c1z0.i(this.n, i3, i4, 1073741824);
        int i82 = this.H;
        whz0 whz0Var22 = this.k;
        c1z0.i(whz0Var22, i82, i82, Integer.MIN_VALUE);
        int i92 = this.F * 2;
        int i102 = this.E;
        int i112 = i92 + i102;
        c1z0.i(this.b, i112, i112, 1073741824);
        c1z0.i(this.d, i112, i112, 1073741824);
        c1z0.i(this.u, i102, i102, 1073741824);
        r5z0 r5z0Var2 = this.l;
        c1z0.i(r5z0Var2, i112, i112, 1073741824);
        TextView textView4 = this.t;
        View view22 = this.p;
        View view32 = this.o;
        tjz0 tjz0Var2 = this.e;
        TextView textView22 = this.s;
        TextView textView32 = this.r;
        if (size >= size2) {
        }
        ixy0 ixy0Var2 = this.h;
        visibility = ixy0Var2.getVisibility();
        int i162 = this.C;
        if (visibility == 0) {
        }
        c1z0.i(this.m, i162, i162, i5);
        c1z0.i(this.f, size, this.D, i5);
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.nuy0, xsna.ary0
    public void setBanner(@NonNull tez0 tez0Var) {
        kiw kiwVar;
        Bitmap a;
        super.setBanner(tez0Var);
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var == null) {
            return;
        }
        this.f.setVisibility(0);
        auy0 auy0Var = this.b;
        auy0Var.setVisibility(0);
        if (lgz0Var.g0) {
            auy0Var.a(this.w, false);
            auy0Var.setContentDescription("sound_off");
        } else {
            auy0Var.a(this.v, false);
            auy0Var.setContentDescription("sound_on");
        }
        this.h.setImageBitmap(this.x);
        sgz0 sgz0Var = (sgz0) lgz0Var.v0;
        kiw kiwVar2 = lgz0Var.Z;
        if (sgz0Var != null) {
            this.M = sgz0Var.b;
            this.N = sgz0Var.c;
        }
        if ((this.M <= 0 || this.N <= 0) && kiwVar2 != null) {
            this.M = kiwVar2.b;
            this.N = kiwVar2.c;
        }
        if ((this.M <= 0 || this.N <= 0) && (kiwVar = tez0Var.t) != null) {
            int i = kiwVar.b;
            this.M = i;
            int i2 = kiwVar.c;
            this.N = i2;
            if ((i <= 0 || i2 <= 0) && (a = kiwVar.a()) != null) {
                this.M = a.getWidth();
                this.N = a.getHeight();
            }
        }
        boolean z = this.Q;
        View view = this.L;
        View view2 = this.n;
        if (!z) {
            auy0Var.setOnClickListener(this);
            if (view != null) {
                view.setOnClickListener(this);
            }
            view2.setOnClickListener(this);
            return;
        }
        auy0Var.setOnClickListener(new com.vk.im.video.d(this, 17));
        s8z0 s8z0Var = this.A;
        if (view != null) {
            view.setOnTouchListener(s8z0Var);
            view.setOnClickListener(new pi6(this, 9));
        }
        view2.setOnTouchListener(s8z0Var);
        view2.setOnClickListener(new zh0(this, 13));
    }
}
