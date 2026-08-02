package com.yandex.messaging.internal.view.timeline.common;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.unreadcount.d;
import defpackage.bvf0;
import defpackage.iqr;
import defpackage.jqr;
import defpackage.vse;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a {
    public final d a;
    public final ChatRequest b;
    public final r0 c;

    public a(d dVar, ChatRequest chatRequest, vse vseVar) {
        this.a = dVar;
        this.b = chatRequest;
        r0 c = bvf0.c(0);
        this.c = c;
        e.H(vseVar.c(true), new jqr(e.X(e.t(new iqr(c.j(), 0)), new TimelineUnreadCountObservable$special$$inlined$flatMapLatest$1(this, null)), new TimelineUnreadCountObservable$2(this, null), 3));
    }
}
