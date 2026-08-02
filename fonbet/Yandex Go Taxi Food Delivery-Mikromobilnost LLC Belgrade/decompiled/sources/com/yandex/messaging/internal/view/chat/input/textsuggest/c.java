package com.yandex.messaging.internal.view.chat.input.textsuggest;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.g92;
import defpackage.h3y;
import defpackage.i720;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.n1f;
import defpackage.oyr;
import defpackage.pet;
import defpackage.q6b;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tpr;
import defpackage.tz10;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class c {
    public static final /* synthetic */ kgx[] m = {new MutablePropertyReference1Impl("sendingJob", 0, "getSendingJob()Lkotlinx/coroutines/Job;", c.class), oyr.B(qoi0.a, c.class, "watchingMentionsJob", "getWatchingMentionsJob()Lkotlinx/coroutines/Job;", 0)};
    public final ChatRequest a;
    public final h3y b;
    public final com.yandex.messaging.internal.textsuggest.d c;
    public final h3y d;
    public final pet e;
    public final h3y f;
    public final i720 g;
    public final q6b h;
    public final p i;
    public boolean j;
    public final rp3 k = new rp3();
    public final rp3 l = new rp3();

    public c(ChatRequest chatRequest, h3y h3yVar, com.yandex.messaging.internal.textsuggest.d dVar, h3y h3yVar2, pet petVar, Lifecycle lifecycle, h3y h3yVar3, i720 i720Var, q6b q6bVar) {
        this.a = chatRequest;
        this.b = h3yVar;
        this.c = dVar;
        this.d = h3yVar2;
        this.e = petVar;
        this.f = h3yVar3;
        this.g = i720Var;
        this.h = q6bVar;
        this.i = r.a(lifecycle);
    }

    public final void a(com.yandex.bricks.c cVar) {
        tpr n1fVar;
        pet petVar = this.e;
        if (petVar.a.a(tz10.I)) {
            n1fVar = new n1f(23, petVar.b.a(this.a), petVar);
        } else {
            n1fVar = new g92(2, null);
        }
        e.H(this.i, new jqr(n1fVar, new TextSuggestViewController$init$1(this, cVar, null), 3));
    }
}
