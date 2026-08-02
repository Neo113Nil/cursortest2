package com.yandex.messaging.contacts.sync;

import com.yandex.messaging.internal.authorized.sync.d;
import defpackage.at2;
import defpackage.k020;
import defpackage.kse;
import defpackage.tje;
import defpackage.to3;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class a {
    public final to3 a;
    public final kse b;
    public final b c;
    public final at2 d;
    public final com.yandex.messaging.internal.storage.contacts.a e;
    public final k020 f;
    public final d g;

    public a(to3 to3Var, kse kseVar, b bVar, at2 at2Var, com.yandex.messaging.internal.storage.contacts.a aVar, k020 k020Var, d dVar) {
        this.a = to3Var;
        this.b = kseVar;
        this.c = bVar;
        this.d = at2Var;
        this.e = aVar;
        this.f = k020Var;
        this.g = dVar;
    }

    public final Object a(Continuation continuation) {
        return tje.k0(this.b.e, new ContactsRemover$purgeContacts$2(this, null), continuation);
    }
}
