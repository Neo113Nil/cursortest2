package com.yandex.messaging.internal.view.timeline;

import androidx.lifecycle.Lifecycle;
import com.yandex.messaging.ChatRequest;
import defpackage.abz0;
import defpackage.b00;
import defpackage.tje;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes15.dex */
public final class g0 {
    public final b00 a;
    public final ChatRequest b;
    public final Lifecycle c;
    public final com.yandex.messaging.internal.translator.k d;

    public g0(b00 b00Var, ChatRequest chatRequest, Lifecycle lifecycle, com.yandex.messaging.internal.translator.k kVar) {
        this.a = b00Var;
        this.b = chatRequest;
        this.c = lifecycle;
        this.d = kVar;
    }

    public final void a(abz0 abz0Var) {
        tje.N(androidx.lifecycle.r.a(this.c), null, null, new TimelineActions$copyMessage$1(this, abz0Var, null), 3);
    }

    public final void b(HashSet hashSet) {
        tje.e();
        tje.N(androidx.lifecycle.r.a(this.c), null, null, new TimelineActions$copyMessages$1(this, hashSet, null), 3);
    }

    public final void c(Set set) {
        tje.e();
        tje.N(androidx.lifecycle.r.a(this.c), null, null, new TimelineActions$shareMessages$1(this, set, null), 3);
    }
}
