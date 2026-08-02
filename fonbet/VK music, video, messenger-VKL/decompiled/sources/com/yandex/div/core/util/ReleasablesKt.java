package com.yandex.div.core.util;

import android.view.View;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;
import xsna.wik0;

/* compiled from: Releasables.kt */
/* loaded from: classes7.dex */
public final class ReleasablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExpressionSubscriber getExpressionSubscriber(View view) {
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        Object tag = view.getTag(R$id.div_releasable_list);
        wik0 wik0Var = tag instanceof wik0 ? (wik0) tag : null;
        if (wik0Var == null) {
            wik0Var = new wik0();
            view.setTag(R$id.div_releasable_list, wik0Var);
        }
        Object g = wik0Var.g(0);
        ExpressionSubscriber expressionSubscriber = g instanceof ExpressionSubscriber ? (ExpressionSubscriber) g : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        wik0Var.h(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }

    public static final Iterable<Releasable> getReleasableList(View view) {
        Object tag = view.getTag(R$id.div_releasable_list);
        wik0 wik0Var = tag instanceof wik0 ? (wik0) tag : null;
        if (wik0Var != null) {
            return SparseArraysKt.toIterable(wik0Var);
        }
        return null;
    }
}
