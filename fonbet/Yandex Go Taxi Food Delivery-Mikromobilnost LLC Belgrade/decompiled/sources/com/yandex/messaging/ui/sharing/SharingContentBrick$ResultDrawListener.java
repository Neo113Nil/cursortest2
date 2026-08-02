package com.yandex.messaging.ui.sharing;

import android.view.ViewTreeObserver;
import defpackage.eqr0;
import defpackage.yjt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/yandex/messaging/ui/sharing/SharingContentBrick$ResultDrawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "<init>", "(Leqr0;)V", "Lzy11;", "onDraw", "()V", "Lyjt;", "trace", "Lyjt;", "getTrace", "()Lyjt;", "setTrace", "(Lyjt;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SharingContentBrick$ResultDrawListener implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ eqr0 this$0;
    private yjt trace;

    public SharingContentBrick$ResultDrawListener(eqr0 eqr0Var) {
    }

    public final yjt getTrace() {
        return this.trace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        yjt yjtVar = this.trace;
        if (yjtVar == null) {
            this.trace = null;
        } else {
            yjtVar.a(7);
            throw null;
        }
    }

    public final void setTrace(yjt yjtVar) {
        this.trace = yjtVar;
    }
}
