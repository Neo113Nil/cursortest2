package com.yandex.messaging.ui.globalsearch;

import android.view.ViewTreeObserver;
import defpackage.kjt;
import defpackage.yjt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/yandex/messaging/ui/globalsearch/GlobalSearchBrick$ResultDrawListener", "Landroid/view/ViewTreeObserver$OnDrawListener;", "<init>", "(Lkjt;)V", "Lzy11;", "onDraw", "()V", "Lyjt;", "searchTrace", "Lyjt;", "getSearchTrace", "()Lyjt;", "setSearchTrace", "(Lyjt;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class GlobalSearchBrick$ResultDrawListener implements ViewTreeObserver.OnDrawListener {
    private yjt searchTrace;
    final /* synthetic */ kjt this$0;

    public GlobalSearchBrick$ResultDrawListener(kjt kjtVar) {
    }

    public final yjt getSearchTrace() {
        return this.searchTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        yjt yjtVar = this.searchTrace;
        if (yjtVar == null) {
            return;
        }
        yjtVar.a(7);
        int i = kjt.a;
        throw null;
    }

    public final void setSearchTrace(yjt yjtVar) {
        this.searchTrace = yjtVar;
    }
}
