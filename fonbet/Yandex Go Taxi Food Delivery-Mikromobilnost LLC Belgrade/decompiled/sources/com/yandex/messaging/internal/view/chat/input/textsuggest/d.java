package com.yandex.messaging.internal.view.chat.input.textsuggest;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.messaging.ChatRequest;
import defpackage.p4t;
import defpackage.qet;
import defpackage.qty0;
import defpackage.tje;
import defpackage.x22;

/* loaded from: classes15.dex */
public final class d {
    public final ChatRequest a;
    public final p4t b;
    public final Lifecycle c;
    public final x22 d;
    public final qet e;
    public String f;
    public qty0 g;

    public d(ChatRequest chatRequest, p4t p4tVar, Lifecycle lifecycle, x22 x22Var, qet qetVar) {
        this.a = chatRequest;
        this.b = p4tVar;
        this.c = lifecycle;
        this.d = x22Var;
        this.e = qetVar;
        tje.N(r.a(lifecycle), null, null, new TextSuggestViewReporter$1(this, null), 3);
    }
}
