package com.yandex.go.feedback_common.services;

import android.content.Context;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.tje;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class d {
    public final c a;
    public final hbp0 b;

    public d(hit hitVar, c cVar) {
        this.a = cVar;
        this.b = hitVar.a;
    }

    public final void a(FeedbackParam feedbackParam) {
        tje.N(this.b, null, null, new FeedbackTaskQueueInteractorCompat$enqueueAsync$1(this, feedbackParam, null), 3);
    }

    public final boolean b(String str) {
        return ((Boolean) tje.Y(EmptyCoroutineContext.a, new FeedbackTaskQueueInteractorCompat$hasFeedbackInQueueBlocking$1(this, str, null))).booleanValue();
    }

    public final void c(Context context) {
        tje.N(this.b, null, null, new FeedbackTaskQueueInteractorCompat$startServiceIfNeededAsync$1(this, context, null), 3);
    }
}
