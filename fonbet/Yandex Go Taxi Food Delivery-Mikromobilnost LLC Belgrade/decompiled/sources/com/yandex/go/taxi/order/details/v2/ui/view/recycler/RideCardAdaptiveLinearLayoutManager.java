package com.yandex.go.taxi.order.details.v2.ui.view.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.hst;
import defpackage.jst;
import defpackage.zfj0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/recycler/RideCardAdaptiveLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RideCardAdaptiveLinearLayoutManager extends LinearLayoutManager {
    public final a3y0 b0;
    public final Rect c0;

    public RideCardAdaptiveLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.b0 = new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "AdaptiveLinearLayoutManager");
        this.c0 = new Rect();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int itemCount = getItemCount();
        a3y0 a3y0Var = this.b0;
        if (itemCount == 0) {
            a3y0Var.getClass();
            a3y0.h(new String[]{"onLayoutChildren"});
            hst hstVar = jst.e;
            c1(r0Var);
            return;
        }
        if (kVar.g) {
            U(r0Var);
            super.U0(r0Var, kVar);
            return;
        }
        try {
            U(r0Var);
            if (getItemCount() == 1) {
                h2(r0Var);
            } else {
                if (i2(r0Var, kVar)) {
                    return;
                }
                a3y0Var.getClass();
                a3y0.h(new String[]{"onLayoutChildren"});
                hst hstVar2 = jst.e;
                super.U0(r0Var, kVar);
            }
        } catch (Exception e) {
            a3y0Var.b("onLayoutChildren", e, new zfj0(24));
            U(r0Var);
            super.U0(r0Var, kVar);
        }
    }

    public final void h2(r0 r0Var) {
        View e = r0Var.e(0);
        F(e);
        Rect rect = this.c0;
        m(e, rect);
        int paddingLeft = (this.H - getPaddingLeft()) - getPaddingRight();
        D0(0, 0, e);
        e.measure(View.MeasureSpec.makeMeasureSpec((paddingLeft - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec(e.getMeasuredHeight(), 1073741824));
        C0(getPaddingLeft(), getPaddingTop(), l0(e) + getPaddingLeft(), k0(e) + getPaddingTop(), e);
        this.b0.getClass();
        a3y0.h(new String[]{"layoutSingle"});
        hst hstVar = jst.e;
    }

    public final boolean i2(r0 r0Var, RecyclerView.k kVar) {
        Rect rect;
        RideCardAdaptiveLinearLayoutManager rideCardAdaptiveLinearLayoutManager = this;
        int min = Math.min(rideCardAdaptiveLinearLayoutManager.getItemCount(), kVar.b());
        rideCardAdaptiveLinearLayoutManager.b0.getClass();
        a3y0.h(new String[]{"tryLayoutMultiple"});
        hst hstVar = jst.e;
        ArrayList arrayList = new ArrayList(min);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        boolean z = rideCardAdaptiveLinearLayoutManager.b.getLayoutDirection() == 1;
        int i = 0;
        while (true) {
            rect = rideCardAdaptiveLinearLayoutManager.c0;
            if (i >= min) {
                break;
            }
            View e = r0Var.e(i);
            rect.setEmpty();
            rideCardAdaptiveLinearLayoutManager.m(e, rect);
            rideCardAdaptiveLinearLayoutManager.F(e);
            rideCardAdaptiveLinearLayoutManager.D0(0, 0, e);
            int l0 = rideCardAdaptiveLinearLayoutManager.l0(e);
            arrayList.add(i, e);
            ref$IntRef.element += l0;
            a3y0.h(new String[]{"tryLayoutMultiple"});
            hst hstVar2 = jst.e;
            i++;
        }
        int paddingLeft = (rideCardAdaptiveLinearLayoutManager.H - rideCardAdaptiveLinearLayoutManager.getPaddingLeft()) - rideCardAdaptiveLinearLayoutManager.getPaddingRight();
        a3y0.h(new String[]{"tryLayoutMultiple"});
        hst hstVar3 = jst.e;
        if (ref$IntRef.element > paddingLeft) {
            a3y0.h(new String[]{"tryLayoutMultiple"});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int j = rideCardAdaptiveLinearLayoutManager.a.j((View) it.next());
                if (j >= 0) {
                    rideCardAdaptiveLinearLayoutManager.a.c(j);
                }
            }
            return false;
        }
        if (!kVar.i) {
            if (arrayList.size() == 2) {
                int i2 = paddingLeft / 2;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (rideCardAdaptiveLinearLayoutManager.l0((View) it2.next()) <= i2) {
                        }
                    }
                }
                a3y0.h(new String[]{"tryLayoutMultiple"});
                hst hstVar4 = jst.e;
                int paddingRight = z ? rideCardAdaptiveLinearLayoutManager.H - rideCardAdaptiveLinearLayoutManager.getPaddingRight() : rideCardAdaptiveLinearLayoutManager.getPaddingLeft();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    View view = (View) it3.next();
                    rect.setEmpty();
                    rideCardAdaptiveLinearLayoutManager.m(view, rect);
                    view.measure(View.MeasureSpec.makeMeasureSpec((i2 - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                    int l02 = rideCardAdaptiveLinearLayoutManager.l0(view);
                    int i3 = z ? paddingRight - l02 : paddingRight;
                    if (!z) {
                        paddingRight += l02;
                    }
                    int paddingTop = rideCardAdaptiveLinearLayoutManager.getPaddingTop();
                    int i4 = i3;
                    int i5 = paddingRight;
                    paddingRight = i4;
                    rideCardAdaptiveLinearLayoutManager.C0(paddingRight, paddingTop, i5, rideCardAdaptiveLinearLayoutManager.k0(view) + paddingTop, view);
                    if (!z) {
                        paddingRight = i5;
                    }
                    a3y0.h(new String[]{"layoutItems"});
                    hst hstVar5 = jst.e;
                }
            }
            int i6 = min > 0 ? (paddingLeft - ref$IntRef.element) / min : 0;
            a3y0.h(new String[]{"tryLayoutMultiple"});
            hst hstVar6 = jst.e;
            int paddingRight2 = z ? rideCardAdaptiveLinearLayoutManager.H - rideCardAdaptiveLinearLayoutManager.getPaddingRight() : rideCardAdaptiveLinearLayoutManager.getPaddingLeft();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                View view2 = (View) it4.next();
                rect.setEmpty();
                rideCardAdaptiveLinearLayoutManager.m(view2, rect);
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth() + i6, 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getMeasuredHeight(), 1073741824));
                int l03 = rideCardAdaptiveLinearLayoutManager.l0(view2);
                int i7 = z ? paddingRight2 - l03 : paddingRight2;
                if (!z) {
                    paddingRight2 += l03;
                }
                int paddingTop2 = rideCardAdaptiveLinearLayoutManager.getPaddingTop();
                int i8 = i7;
                int i9 = paddingRight2;
                paddingRight2 = i8;
                rideCardAdaptiveLinearLayoutManager.C0(paddingRight2, paddingTop2, i9, rideCardAdaptiveLinearLayoutManager.k0(view2) + paddingTop2, view2);
                if (!z) {
                    paddingRight2 = i9;
                }
                a3y0.h(new String[]{"layoutItems"});
                hst hstVar7 = jst.e;
                rideCardAdaptiveLinearLayoutManager = this;
            }
            a3y0.h(new String[]{"tryLayoutMultiple"});
            hst hstVar8 = jst.e;
            return true;
        }
        int paddingRight3 = z ? rideCardAdaptiveLinearLayoutManager.H - rideCardAdaptiveLinearLayoutManager.getPaddingRight() : rideCardAdaptiveLinearLayoutManager.getPaddingLeft();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            View view3 = (View) it5.next();
            int l04 = rideCardAdaptiveLinearLayoutManager.l0(view3);
            int i10 = z ? paddingRight3 - l04 : paddingRight3;
            if (!z) {
                paddingRight3 += l04;
            }
            int paddingTop3 = rideCardAdaptiveLinearLayoutManager.getPaddingTop();
            int i11 = i10;
            int i12 = paddingRight3;
            paddingRight3 = i11;
            rideCardAdaptiveLinearLayoutManager.C0(paddingRight3, paddingTop3, i12, rideCardAdaptiveLinearLayoutManager.k0(view3) + paddingTop3, view3);
            if (!z) {
                paddingRight3 = i12;
            }
        }
        return true;
    }
}
