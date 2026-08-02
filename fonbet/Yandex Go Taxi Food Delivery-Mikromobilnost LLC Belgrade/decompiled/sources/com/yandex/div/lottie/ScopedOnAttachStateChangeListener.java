package com.yandex.div.lottie;

import android.view.View;
import defpackage.bvf0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B3\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0010R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/lottie/ScopedOnAttachStateChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Lkotlin/Function2;", "Ltse;", "Lkotlin/coroutines/Continuation;", "Lzy11;", "", "action", "Landroid/view/View;", "view", "<init>", "(Lwls;Landroid/view/View;)V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "performActionInScope", "()V", "clearScope", "Lwls;", "getAction", "()Lwls;", "Landroid/view/View;", "attachScope", "Ltse;", "div-lottie_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScopedOnAttachStateChangeListener implements View.OnAttachStateChangeListener {
    private final wls action;
    private tse attachScope;
    private final View view;

    public ScopedOnAttachStateChangeListener(wls wlsVar, View view) {
        this.action = wlsVar;
        this.view = view;
    }

    public final void clearScope() {
        tse tseVar = this.attachScope;
        if (tseVar != null) {
            bvf0.j(tseVar, null);
        }
        this.attachScope = null;
    }

    public final wls getAction() {
        return this.action;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        performActionInScope();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        clearScope();
    }

    public final void performActionInScope() {
        tse tseVar = this.attachScope;
        if (tseVar == null) {
            tseVar = bvf0.a(uyj.b);
        }
        tje.N(tseVar, null, null, new ScopedOnAttachStateChangeListener$performActionInScope$1(this, null), 3);
        this.attachScope = tseVar;
        this.view.removeOnAttachStateChangeListener(this);
    }
}
