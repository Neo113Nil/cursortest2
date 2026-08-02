package com.yandex.go.shortcuts.impl.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.shortcuts.impl.view.adapter.h;
import com.yandex.go.shortcuts.impl.view.adapter.s;
import defpackage.a0s0;
import defpackage.azg;
import defpackage.b0s0;
import defpackage.bys;
import defpackage.bzg;
import defpackage.c0s0;
import defpackage.dzg;
import defpackage.h73;
import defpackage.ib8;
import defpackage.jst;
import defpackage.kgx;
import defpackage.kx31;
import defpackage.psg0;
import defpackage.s5r;
import defpackage.scc;
import defpackage.seb1;
import defpackage.t3s0;
import defpackage.tb;
import defpackage.tje;
import defpackage.unr0;
import defpackage.wp81;
import defpackage.xw31;
import defpackage.za90;
import defpackage.zzr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;
import ru.yandex.taxi.widget.ShimmeringPaint;

/* loaded from: classes8.dex */
public class a extends zzr0 {
    public final Paint A;
    public final Paint B;
    public boolean C;
    public final ArrayList D;
    public int E;
    public final ValueAnimator F;
    public float G;
    public wp81 H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public final float a;
    public final ShimmeringPaint b;
    public final ArrayList c;
    public boolean w;
    public final ArrayList x;
    public final RectF y;
    public final RectF z;

    public a(Context context, za90 za90Var) {
        this.a = tje.r(psg0.shortcuts_corners_round, context);
        ShimmeringPaint shimmeringPaint = new ShimmeringPaint(context);
        shimmeringPaint.setAlpha(0);
        shimmeringPaint.setGradientWidth(tje.u(88, context));
        this.b = shimmeringPaint;
        this.c = new ArrayList();
        this.w = true;
        this.x = new ArrayList();
        this.y = new RectF();
        this.z = new RectF();
        Paint f = unr0.f(true);
        int i = za90Var.b;
        kgx kgxVar = za90.z[1];
        f.setColor(za90Var.b(i));
        this.A = f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        this.B = paint;
        this.C = true;
        this.D = new ArrayList();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(200L);
        this.F = ofInt;
        this.H = azg.c;
    }

    public static void r(View view, ArrayList arrayList) {
        int x = (int) view.getX();
        int y = (int) view.getY();
        arrayList.add(new Rect(x, y, view.getWidth() + x, view.getHeight() + y));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        x0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder instanceof s) {
            rect.set(0, this.J, 0, 0);
            return;
        }
        if (childViewHolder instanceof kx31) {
            boolean z = childViewHolder instanceof h;
            int i = this.J;
            if (z) {
                rect.set(i, 0, i, 0);
            } else {
                rect.set(i, i, i, i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        Paint paint;
        int intValue;
        Rect L1;
        float computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ArrayList arrayList = this.D;
        b0s0 b0s0Var = (b0s0) kotlin.collections.a.b0(arrayList);
        float a = b0s0Var != null ? b0s0Var.a() : 0.0f;
        float f = this.G;
        if (f != computeVerticalScrollOffset && f < computeVerticalScrollOffset && computeVerticalScrollOffset * 1.15d >= a) {
            this.C = true;
        }
        boolean z = this.C;
        ArrayList arrayList2 = this.x;
        if (z) {
            RecyclerView.e layoutManager = recyclerView.getLayoutManager();
            SpannedGridLayoutManager spannedGridLayoutManager = layoutManager instanceof SpannedGridLayoutManager ? (SpannedGridLayoutManager) layoutManager : null;
            if (spannedGridLayoutManager != null) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                bys bysVar = adapter instanceof bys ? (bys) adapter : null;
                List list = bysVar != null ? bysVar.x.f : null;
                if (list == null) {
                    list = EmptyList.a;
                }
                ArrayList arrayList3 = new ArrayList();
                List list2 = list;
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!(obj instanceof t3s0) || !((t3s0) obj).m()) {
                        valueOf = null;
                    }
                    if (valueOf != null && (L1 = spannedGridLayoutManager.L1(valueOf.intValue())) != null) {
                        arrayList3.add(Float.valueOf((this.L / 2.0f) + L1.top));
                    }
                    i = i2;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size() + 2);
                arrayList4.add(Float.valueOf(((-this.K) - recyclerView.getPaddingTop()) + this.M));
                arrayList4.addAll(arrayList3);
                arrayList4.add(Float.valueOf(recyclerView.getBottom() + recyclerView.computeVerticalScrollRange() + this.K));
                arrayList.clear();
                Iterator it = arrayList4.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    float floatValue = ((Number) next).floatValue();
                    if (i3 < scc.f(arrayList4)) {
                        arrayList.add(new b0s0(floatValue + this.K + recyclerView.getPaddingTop(), ((Number) arrayList4.get(i4)).floatValue() + recyclerView.getPaddingTop()));
                    }
                    i3 = i4;
                }
                arrayList2.clear();
                s5r s5rVar = new s5r(b.g(b.g(new h73(1, list2), c0s0.a), ShortcutItemDecoratorImpl$updateSectionsIfNeeded$3.b));
                int i5 = 0;
                while (s5rVar.hasNext()) {
                    Object next2 = s5rVar.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    t3s0 t3s0Var = (t3s0) next2;
                    Integer valueOf2 = Integer.valueOf(i5);
                    if (t3s0Var.n()) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null && (intValue = valueOf2.intValue()) >= 0 && intValue < arrayList3.size()) {
                        arrayList2.add(new a0s0((((Number) arrayList3.get(intValue)).floatValue() + recyclerView.getPaddingTop()) - this.L, ((Number) arrayList3.get(intValue)).floatValue() + recyclerView.getPaddingTop() + this.L + this.K, t3s0Var.c()));
                    }
                    i5 = i6;
                }
                this.C = false;
            }
        }
        int size = arrayList.size();
        Paint paint2 = this.A;
        if (size <= 1) {
            int i7 = this.M;
            if (i7 == 0) {
                canvas.drawColor(paint2.getColor());
                return;
            }
            if (!this.w) {
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                float f2 = this.L;
                canvas.drawPath(seb1.b(i7 - computeVerticalScrollOffset, width, height, f2, f2, true, true, false, false), paint2);
                return;
            }
            float f3 = i7 - computeVerticalScrollOffset;
            float width2 = canvas.getWidth();
            float height2 = canvas.getHeight();
            float f4 = this.L;
            canvas.drawRoundRect(0.0f, f3, width2, height2, f4, f4, paint2);
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            paint = this.B;
            if (!hasNext) {
                break;
            }
            a0s0 a0s0Var = (a0s0) it2.next();
            float c = a0s0Var.c() - computeVerticalScrollOffset;
            float width3 = canvas.getWidth();
            float a2 = a0s0Var.a() - computeVerticalScrollOffset;
            RectF rectF = this.y;
            rectF.set(0.0f, c, width3, a2);
            paint.setColor(a0s0Var.b());
            canvas.drawRect(rectF, paint);
        }
        if (!arrayList.isEmpty()) {
            float a3 = (((b0s0) kotlin.collections.a.Z(arrayList)).a() - this.L) - computeVerticalScrollOffset;
            if (this.w) {
                float width4 = canvas.getWidth();
                float height3 = canvas.getHeight();
                float f5 = this.L;
                canvas.drawPath(seb1.b(a3, width4, height3, f5, f5, false, false, true, true), paint);
            } else {
                canvas.drawRect(new RectF(0.0f, a3, canvas.getWidth(), canvas.getHeight()), paint);
            }
        }
        canvas.save();
        canvas.translate(0.0f, -computeVerticalScrollOffset);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            b0s0 b0s0Var2 = (b0s0) it3.next();
            float b = b0s0Var2.b();
            float a4 = b0s0Var2.a();
            float width5 = recyclerView.getWidth();
            RectF rectF2 = this.z;
            rectF2.set(0.0f, b, width5, a4);
            float f6 = this.L;
            canvas.drawRoundRect(rectF2, f6, f6, paint2);
        }
        canvas.restore();
        this.G = computeVerticalScrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        if (width > 0) {
            boolean z = this.I;
            ShimmeringPaint shimmeringPaint = this.b;
            if (z || shimmeringPaint.getAlpha() != 0) {
                if (this.E != width) {
                    this.E = width;
                    shimmeringPaint.updateOffset(recyclerView);
                }
                ArrayList arrayList = this.c;
                arrayList.clear();
                wp81 wp81Var = this.H;
                if (wp81Var instanceof azg) {
                    xw31.q(recyclerView, new tb(11, recyclerView, this));
                } else if (wp81Var instanceof bzg) {
                    xw31.q(recyclerView, new ib8(4, recyclerView, wp81Var, this));
                } else if (wp81Var instanceof dzg) {
                    x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(((dzg) wp81Var).e());
                    if (findViewHolderForAdapterPosition != null) {
                        r(findViewHolderForAdapterPosition.a, arrayList);
                    }
                } else {
                    jst.e.n("Unknown loading mode for shortcuts");
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                ValueAnimator valueAnimator = this.F;
                valueAnimator.setCurrentPlayTime(currentAnimationTimeMillis - valueAnimator.getStartDelay());
                shimmeringPaint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                shimmeringPaint.updateShimmering();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RectF rectF = new RectF((Rect) it.next());
                    float f = this.a;
                    canvas.drawRoundRect(rectF, f, f, shimmeringPaint);
                }
                recyclerView.postInvalidateOnAnimation();
            }
        }
    }

    @Override // defpackage.zzr0
    public final wp81 f() {
        return this.H;
    }

    @Override // defpackage.zzr0
    public final boolean g() {
        return this.I;
    }

    @Override // defpackage.zzr0
    public final void h() {
        this.C = true;
    }

    @Override // defpackage.zzr0
    public final void i(int i) {
        this.N = i;
    }

    @Override // defpackage.zzr0
    public final void j(boolean z) {
        this.I = z;
        int alpha = this.b.getAlpha();
        int i = z ? 255 : 0;
        ValueAnimator valueAnimator = this.F;
        valueAnimator.setIntValues(alpha, i);
        valueAnimator.setStartDelay(AnimationUtils.currentAnimationTimeMillis());
    }

    @Override // defpackage.zzr0
    public final void k(int i) {
        this.J = i;
    }

    @Override // defpackage.zzr0
    public final void l(wp81 wp81Var) {
        this.H = wp81Var;
    }

    @Override // defpackage.zzr0
    public final void m(int i) {
        this.A.setColor(i);
    }

    @Override // defpackage.zzr0
    public final void n(float f) {
        this.L = f;
    }

    @Override // defpackage.zzr0
    public final void o(int i) {
        this.B.setColor(i);
    }

    @Override // defpackage.zzr0
    public final void p(int i) {
        this.K = i;
    }

    @Override // defpackage.zzr0
    public final void q(int i, int i2, int i3, int i4) {
        this.b.setColors(i, i2, i3, i4);
    }
}
