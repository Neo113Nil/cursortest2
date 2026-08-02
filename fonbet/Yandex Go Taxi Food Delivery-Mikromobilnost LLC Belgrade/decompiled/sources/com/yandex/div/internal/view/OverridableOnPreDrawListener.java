package com.yandex.div.internal.view;

import android.view.ViewTreeObserver;
import defpackage.gcm;
import defpackage.hcm;
import defpackage.lol0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/div/internal/view/OverridableOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "delegate", "Lhcm;", "overrideStrategy", "<init>", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;Lhcm;)V", "", "onPreDraw", "()Z", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lhcm;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private final ViewTreeObserver.OnPreDrawListener delegate;
    private final hcm overrideStrategy;

    public /* synthetic */ OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, hcm hcmVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onPreDrawListener, (i & 2) != 0 ? gcm.b : hcmVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean onPreDraw = this.delegate.onPreDraw();
        hcm hcmVar = this.overrideStrategy;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.delegate;
        lol0 lol0Var = (lol0) hcmVar;
        if (onPreDraw) {
            lol0Var.a = 0;
            return true;
        }
        int i = lol0Var.a;
        if (i < 3) {
            lol0Var.a = i + 1;
            lol0Var.b(onPreDrawListener);
            return false;
        }
        if (i == 3) {
            lol0Var.a = i + 1;
            lol0Var.a(onPreDrawListener);
        }
        return true;
    }

    public OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, hcm hcmVar) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = hcmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(onPreDrawListener, null, 2, 0 == true ? 1 : 0);
    }
}
