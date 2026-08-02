package com.yandex.go.feedback_common.services;

import android.content.Context;
import com.yandex.go.coroutines.h;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.tt2;
import defpackage.wnt;

/* loaded from: classes.dex */
public final class b {
    public final Context a;
    public final wnt b;
    public final tt2 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "FeedbackTaskQueueCachingFactory");
    public final h e = new h(new FeedbackTaskQueueCachingFactory$taskQueue$1(this, null));

    public b(Context context, wnt wntVar, tt2 tt2Var) {
        this.a = context;
        this.b = wntVar;
        this.c = tt2Var;
    }
}
