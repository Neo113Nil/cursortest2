package com.ybsdk.core.analytics.performance;

import android.view.ViewTreeObserver;
import defpackage.adr;
import defpackage.ejp;
import defpackage.qpo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ybsdk/core/analytics/performance/FirstDrawListener$drawListener$1", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lzy11;", "onDraw", "()V", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FirstDrawListener$drawListener$1 implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ adr this$0;

    public FirstDrawListener$drawListener$1(adr adrVar) {
        this.this$0 = adrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDraw$lambda$0(adr adrVar) {
        adrVar.b.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDraw$lambda$1(adr adrVar, FirstDrawListener$drawListener$1 firstDrawListener$drawListener$1) {
        if (adrVar.a.getViewTreeObserver().isAlive()) {
            adrVar.a.getViewTreeObserver().removeOnDrawListener(firstDrawListener$drawListener$1);
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        adr adrVar = this.this$0;
        if (adrVar.d) {
            return;
        }
        adrVar.d = true;
        adrVar.c.postAtFrontOfQueue(new ejp(5, adrVar));
        adr adrVar2 = this.this$0;
        adrVar2.c.post(new qpo(12, adrVar2, this));
    }
}
