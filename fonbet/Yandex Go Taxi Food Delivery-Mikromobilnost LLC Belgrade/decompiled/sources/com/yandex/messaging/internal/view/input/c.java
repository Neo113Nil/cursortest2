package com.yandex.messaging.internal.view.input;

import com.yandex.messaging.ChatRequest;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.kse;
import defpackage.mdb;
import defpackage.uqq0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class c {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.chat.info.settings.domain.a b;
    public final mdb c;
    public final ike d;
    public final r0 e;
    public final gci0 f;
    public final r0 g;
    public final gci0 h;
    public final boolean i;

    public c(ChatRequest chatRequest, com.yandex.messaging.internal.chat.info.settings.domain.a aVar, mdb mdbVar, kse kseVar) {
        this.a = chatRequest;
        this.b = aVar;
        this.c = mdbVar;
        this.d = kseVar.c();
        r0 c = bvf0.c(new uqq0(false, false));
        this.e = c;
        this.f = kotlinx.coroutines.flow.e.d(c);
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.g = c2;
        this.h = kotlinx.coroutines.flow.e.d(c2);
        this.i = mdbVar.n;
    }

    public final void a() {
        kotlinx.coroutines.flow.e.H(this.d, new jqr(this.b.a(this.a), new SendingMessagesSettingsStateController$onAttach$1(this, null), 3));
    }

    public final void b(boolean z) {
        r0 r0Var;
        Object value;
        boolean z2;
        do {
            r0Var = this.e;
            value = r0Var.getValue();
            uqq0 uqq0Var = (uqq0) value;
            z2 = uqq0Var.a;
            uqq0Var.getClass();
        } while (!r0Var.k(value, new uqq0(z2, z)));
    }

    public final void c(boolean z) {
        r0 r0Var;
        Object value;
        boolean z2;
        do {
            r0Var = this.e;
            value = r0Var.getValue();
            uqq0 uqq0Var = (uqq0) value;
            z2 = uqq0Var.b;
            uqq0Var.getClass();
        } while (!r0Var.k(value, new uqq0(z, z2)));
    }
}
