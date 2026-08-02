package com.yandex.messaging.internal.authorized.chat.refresher;

import defpackage.imz;
import defpackage.rol0;
import defpackage.s9;
import defpackage.vqc;

/* loaded from: classes15.dex */
public final class b extends s9 {
    public static final long d = vqc.a(0, 0, 300, 7);
    public final c a;
    public imz b;
    public final long c;

    public b(c cVar) {
        this.a = cVar;
        imz imzVar = imz.w;
        this.b = imz.w;
        this.c = d;
    }

    @Override // defpackage.s9
    public final long a() {
        return this.c;
    }

    @Override // defpackage.s9
    public final boolean b() {
        return !this.b.isEmpty();
    }

    @Override // defpackage.s9
    public final rol0 c() {
        imz imzVar = this.b;
        this.b = imz.w;
        return new rol0(new ReducedMessageLoadScheduler$load$2(this, imzVar, null));
    }
}
