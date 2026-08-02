package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;
import xsna.q9k;

/* loaded from: classes8.dex */
public final class Nd implements Consumer {
    public final C4759ch a;
    public final H0 b;
    public final Wd c;

    public Nd(C4759ch c4759ch, H0 h0, Wd wd) {
        this.a = c4759ch;
        this.b = h0;
        this.c = wd;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        C4759ch c4759ch = this.a;
        H0 h0 = this.b;
        String str2 = h0.a;
        String str3 = h0.b;
        Integer valueOf = Integer.valueOf(h0.d);
        H0 h02 = this.b;
        C4720b4 c4720b4 = new C4720b4(str2, str3, valueOf, h02.e, h02.c);
        Wd wd = this.c;
        EnumC5037nb enumC5037nb = wd.b;
        G0 g0 = wd.a;
        String str4 = g0.c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(g0.f.a);
        Set set = I9.a;
        Bundle a = q9k.a("payload_crash_id", str4);
        Y3 y3 = new Y3("", "", enumC5037nb.a, orCreatePublicLogger);
        if (str != null) {
            y3.f(str);
        }
        y3.m = a;
        y3.c = wd.a.f.f;
        c4759ch.a(c4720b4, y3, new B4(new C4944jm(), new A4(), null));
    }
}
