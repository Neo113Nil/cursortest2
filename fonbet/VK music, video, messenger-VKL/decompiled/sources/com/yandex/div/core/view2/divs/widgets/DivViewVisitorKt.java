package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import xsna.kxt0;

/* compiled from: DivViewVisitor.kt */
/* loaded from: classes7.dex */
public final class DivViewVisitorKt {
    public static final void visitViewTree(DivViewVisitor divViewVisitor, View view) {
        if (view instanceof DivWrapLayout) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var.next());
            }
            divViewVisitor.visit((DivWrapLayout) view);
            return;
        }
        if (view instanceof DivFrameLayout) {
            kxt0 kxt0Var2 = new kxt0((ViewGroup) view);
            while (kxt0Var2.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var2.next());
            }
            divViewVisitor.visit((DivFrameLayout) view);
            return;
        }
        if (view instanceof DivGridLayout) {
            kxt0 kxt0Var3 = new kxt0((ViewGroup) view);
            while (kxt0Var3.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var3.next());
            }
            divViewVisitor.visit((DivGridLayout) view);
            return;
        }
        if (view instanceof DivLinearLayout) {
            kxt0 kxt0Var4 = new kxt0((ViewGroup) view);
            while (kxt0Var4.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var4.next());
            }
            divViewVisitor.visit((DivLinearLayout) view);
            return;
        }
        if (view instanceof DivPagerView) {
            kxt0 kxt0Var5 = new kxt0((ViewGroup) view);
            while (kxt0Var5.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var5.next());
            }
            divViewVisitor.visit((DivPagerView) view);
            return;
        }
        if (view instanceof DivRecyclerView) {
            kxt0 kxt0Var6 = new kxt0((ViewGroup) view);
            while (kxt0Var6.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var6.next());
            }
            divViewVisitor.visit((DivRecyclerView) view);
            return;
        }
        if (view instanceof DivStateLayout) {
            kxt0 kxt0Var7 = new kxt0((ViewGroup) view);
            while (kxt0Var7.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var7.next());
            }
            divViewVisitor.visit((DivStateLayout) view);
            return;
        }
        if (view instanceof DivTabsLayout) {
            kxt0 kxt0Var8 = new kxt0((ViewGroup) view);
            while (kxt0Var8.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var8.next());
            }
            divViewVisitor.visit((DivTabsLayout) view);
            return;
        }
        if (view instanceof DivCustomWrapper) {
            kxt0 kxt0Var9 = new kxt0((ViewGroup) view);
            while (kxt0Var9.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var9.next());
            }
            divViewVisitor.visit((DivCustomWrapper) view);
            return;
        }
        if (view instanceof DivSeparatorView) {
            divViewVisitor.visit((DivSeparatorView) view);
            return;
        }
        if (view instanceof DivGifImageView) {
            divViewVisitor.visit((DivGifImageView) view);
            return;
        }
        if (view instanceof DivImageView) {
            divViewVisitor.visit((DivImageView) view);
            return;
        }
        if (view instanceof DivLineHeightTextView) {
            divViewVisitor.visit((DivLineHeightTextView) view);
            return;
        }
        if (view instanceof DivPagerIndicatorView) {
            divViewVisitor.visit((DivPagerIndicatorView) view);
            return;
        }
        if (view instanceof DivSliderView) {
            divViewVisitor.visit((DivSliderView) view);
            return;
        }
        if (view instanceof DivSelectView) {
            divViewVisitor.visit((DivSelectView) view);
            return;
        }
        if (view instanceof DivVideoView) {
            divViewVisitor.visit((DivVideoView) view);
            return;
        }
        if (view instanceof DivSwitchView) {
            divViewVisitor.visit((DivSwitchView) view);
            return;
        }
        if (view instanceof ViewGroup) {
            kxt0 kxt0Var10 = new kxt0((ViewGroup) view);
            while (kxt0Var10.hasNext()) {
                visitViewTree(divViewVisitor, kxt0Var10.next());
            }
        }
        divViewVisitor.visit(view);
    }
}
