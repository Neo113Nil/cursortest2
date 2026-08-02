package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.C4810eh;
import io.appmetrica.analytics.impl.C5243vb;
import io.appmetrica.analytics.impl.EnumC5037nb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4810eh {
    public final Context a;
    public final InterfaceC4969kl b;
    public final C5343zb c = new C5343zb();
    public final B4 d = new B4(new C4944jm(), new A4(), null);
    public final Consumer e;

    public C4810eh(Context context, final InterfaceC5084p6 interfaceC5084p6, final EnumC5037nb enumC5037nb, InterfaceC4969kl interfaceC4969kl) {
        this.a = context;
        this.b = interfaceC4969kl;
        this.e = new Consumer() { // from class: xsna.ouy0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C4810eh.a(EnumC5037nb.this, interfaceC5084p6, this, (C5243vb) obj);
            }
        };
    }

    public static final void a(EnumC5037nb enumC5037nb, InterfaceC5084p6 interfaceC5084p6, C4810eh c4810eh, C5243vb c5243vb) {
        String str = c5243vb.h;
        C4720b4 c4720b4 = new C4720b4(str, c5243vb.e, c5243vb.f, c5243vb.g, c5243vb.i);
        String str2 = c5243vb.b;
        byte[] bArr = c5243vb.a;
        int i = c5243vb.c;
        HashMap hashMap = c5243vb.d;
        String str3 = c5243vb.j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = I9.a;
        Y3 y3 = new Y3(bArr, str2, enumC5037nb.a, orCreatePublicLogger);
        y3.q = hashMap;
        y3.g = i;
        y3.c = str3;
        ((C4759ch) interfaceC5084p6).a(c4720b4, y3, c4810eh.d);
    }
}
