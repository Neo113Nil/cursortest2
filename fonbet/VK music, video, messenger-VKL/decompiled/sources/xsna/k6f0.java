package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.f2f0;

/* compiled from: FeedReactionsScrollView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes18.dex */
public final class k6f0 extends HorizontalScrollView {
    public final int[] b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final PorterDuffXfermode n;
    public final bpn0 o;
    public final Rect p;
    public final bpn0 q;
    public final bpn0 r;
    public final LinearLayout s;
    public final View t;
    public final w1r[] u;
    public final f3r[] v;

    public k6f0(Context context, ArrayList arrayList, y6f0 y6f0Var) {
        super(context, null, 0);
        Context context2;
        f3r e3rVar;
        this.b = new int[2];
        new Rect();
        int i = y6f0Var.b;
        this.d = i;
        this.e = y6f0Var.c;
        this.f = y6f0Var.d;
        int i2 = y6f0Var.e;
        this.g = i2;
        int i3 = y6f0Var.f;
        this.h = i3;
        int i4 = y6f0Var.g;
        this.i = i4;
        this.j = y6f0Var.h;
        this.k = y6f0Var.i;
        this.l = y6f0Var.j;
        this.m = y6f0Var.k;
        this.n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.o = new bpn0(new e9h(context, 3));
        this.p = new Rect();
        this.q = new bpn0(new ek(27));
        this.r = new bpn0(new vo50(13));
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (i4 * 2) + i);
        f4m.x(i4 - i2, this);
        f4m.w(i4 - i3, this);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setImportantForAccessibility(2);
        addView(linearLayout);
        this.s = linearLayout;
        int size = arrayList.size();
        w1r[] w1rVarArr = new w1r[size];
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            w1r w1rVar = new w1r(context);
            Integer R = rl3.R(i5, getNameViewIds());
            w1rVar.setId(R != null ? R.intValue() : -1);
            w1rVar.setClipChildren(false);
            w1rVar.setClipToPadding(false);
            w1rVar.setImportantForAccessibility(2);
            int i6 = this.d;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
            int i7 = this.g;
            int i8 = this.i;
            layoutParams2.setMargins(i7, i8, this.h, i8);
            s3q0 s3q0Var = s3q0.a;
            if (i5 == arrayList.size() - 1 && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((f2f0) it.next()) instanceof f2f0.a) {
                        View view = new View(getContext());
                        view.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary, view.getContext()));
                        f4m.s(cn70.b(8), view);
                        f4m.r(cn70.b(8), view);
                        this.t = view;
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(cn70.b(1), cn70.b(24));
                        layoutParams3.setMargins(cn70.b(8), this.i, cn70.b(8), this.i);
                        s3q0 s3q0Var2 = s3q0.a;
                        this.s.addView(view, layoutParams3);
                        break;
                    }
                }
            }
            this.s.addView(w1rVar, layoutParams2);
            w1rVarArr[i5] = w1rVar;
            i5++;
        }
        this.u = w1rVarArr;
        int size2 = arrayList.size();
        f3r[] f3rVarArr = new f3r[size2];
        int i9 = 0;
        while (i9 < size2) {
            f2f0 f2f0Var = (f2f0) arrayList.get(i9);
            if (f2f0Var instanceof f2f0.a) {
                e3rVar = new dxq(context, this.d, this.e, this.f);
                context2 = context;
            } else {
                context2 = context;
                e3rVar = new e3r(context2, this.d, this.e, this.f, f2f0Var);
            }
            Integer R2 = rl3.R(i9, getViewIds());
            e3rVar.setId(R2 != null ? R2.intValue() : -1);
            e3rVar.setImportantForAccessibility(2);
            w1r w1rVar2 = this.u[i9];
            int i10 = this.d;
            w1rVar2.addView(e3rVar, new FrameLayout.LayoutParams(i10, i10));
            f3rVarArr[i9] = e3rVar;
            i9++;
            context = context2;
        }
        this.v = f3rVarArr;
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(2);
    }

    private final int[] getNameViewIds() {
        return (int[]) this.r.getValue();
    }

    private final NinePatchDrawable getReactionsPopupBg() {
        return (NinePatchDrawable) this.o.getValue();
    }

    private final int[] getViewIds() {
        return (int[]) this.q.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        int scrollX = getScrollX() - this.j;
        int i = this.c - this.k;
        int width = getWidth() + getScrollX() + this.l;
        int height = getHeight() + this.c + this.m;
        Rect rect = this.p;
        rect.set(scrollX, i, width, height);
        NinePatchDrawable reactionsPopupBg = getReactionsPopupBg();
        if (reactionsPopupBg != null) {
            reactionsPopupBg.setBounds(rect);
        }
        int saveLayer = canvas.saveLayer(getScrollX(), this.c, getWidth() + getScrollX(), this.c + getHeight(), null);
        super.dispatchDraw(canvas);
        NinePatchDrawable reactionsPopupBg2 = getReactionsPopupBg();
        Xfermode xfermode = (reactionsPopupBg2 == null || (paint3 = reactionsPopupBg2.getPaint()) == null) ? null : paint3.getXfermode();
        NinePatchDrawable reactionsPopupBg3 = getReactionsPopupBg();
        if (reactionsPopupBg3 != null && (paint2 = reactionsPopupBg3.getPaint()) != null) {
            paint2.setXfermode(this.n);
        }
        NinePatchDrawable reactionsPopupBg4 = getReactionsPopupBg();
        if (reactionsPopupBg4 != null) {
            reactionsPopupBg4.draw(canvas);
        }
        canvas.restoreToCount(saveLayer);
        NinePatchDrawable reactionsPopupBg5 = getReactionsPopupBg();
        if (reactionsPopupBg5 == null || (paint = reactionsPopupBg5.getPaint()) == null) {
            return;
        }
        paint.setXfermode(xfermode);
    }

    public int[] getLocation() {
        int[] iArr = this.b;
        getLocationOnScreen(iArr);
        return iArr;
    }

    public final w1r[] getReactionContainerViews() {
        return this.u;
    }

    public final f3r[] getReactionViews() {
        return this.v;
    }

    public final View getReactionsSeparator() {
        return this.t;
    }

    public final void setBackgroundTranslation(int i) {
        this.c = i;
        invalidate();
    }

    public final void setViewsAlpha(float f) {
        for (f3r f3rVar : this.v) {
            f3rVar.setAlpha(f);
        }
    }

    public final void setViewsRotation(float f) {
        for (f3r f3rVar : this.v) {
            f3rVar.setRotation(f);
        }
    }
}
