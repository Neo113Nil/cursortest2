package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoView;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d extends RecyclerView.g {
    public final RecyclerView a;
    public final GoView b;
    public final ru.yandex.taxi.design.utils.b c;
    public final i3y d = kotlin.a.b(LazyThreadSafetyMode.NONE, new iik0(16, this));

    public d(RecyclerView recyclerView, GoView goView, ru.yandex.taxi.design.utils.b bVar, tse tseVar) {
        this.a = recyclerView;
        this.b = goView;
        this.c = bVar;
        com.yandex.go.coroutines.b.g(tseVar, null, null, new RvFooterShadowListener$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RvFooterShadowListener$applyShadow$1 rvFooterShadowListener$applyShadow$1;
        int i;
        if (continuationImpl instanceof RvFooterShadowListener$applyShadow$1) {
            rvFooterShadowListener$applyShadow$1 = (RvFooterShadowListener$applyShadow$1) continuationImpl;
            int i2 = rvFooterShadowListener$applyShadow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rvFooterShadowListener$applyShadow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rvFooterShadowListener$applyShadow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rvFooterShadowListener$applyShadow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rvFooterShadowListener$applyShadow$1.L$0 = this;
                    rvFooterShadowListener$applyShadow$1.label = 1;
                    obj = this.c.g(24, rvFooterShadowListener$applyShadow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d) rvFooterShadowListener$applyShadow$1.L$0;
                    kotlin.b.b(obj);
                }
                Drawable drawable = (Drawable) obj;
                GoView goView = this.b;
                Rect rect = new Rect();
                drawable.getPadding(rect);
                xw31.E(goView, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(((Number) this.d.getValue()).intValue() + (-rect.bottom)));
                goView.setBackground(drawable);
                return zy11.a;
            }
        }
        rvFooterShadowListener$applyShadow$1 = new RvFooterShadowListener$applyShadow$1(this, continuationImpl);
        Object obj2 = rvFooterShadowListener$applyShadow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rvFooterShadowListener$applyShadow$1.label;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj2;
        GoView goView2 = this.b;
        Rect rect2 = new Rect();
        drawable2.getPadding(rect2);
        xw31.E(goView2, Integer.valueOf(-rect2.left), Integer.valueOf(-rect2.top), Integer.valueOf(-rect2.right), Integer.valueOf(((Number) this.d.getValue()).intValue() + (-rect2.bottom)));
        goView2.setBackground(drawable2);
        return zy11.a;
    }

    public final void b() {
        RecyclerView recyclerView = this.a;
        boolean canScrollVertically = recyclerView.canScrollVertically(1);
        GoView goView = this.b;
        if (canScrollVertically && goView.getVisibility() != 0) {
            goView.setVisibility(0);
        } else {
            if (recyclerView.canScrollVertically(1) || goView.getVisibility() != 0) {
                return;
            }
            goView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b();
    }
}
