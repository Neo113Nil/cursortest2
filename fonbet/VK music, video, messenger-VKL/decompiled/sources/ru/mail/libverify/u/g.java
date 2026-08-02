package ru.mail.libverify.u;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class g extends Lambda implements gzs<Object> {
    final /* synthetic */ ru.mail.libverify.storage.g a;
    final /* synthetic */ ru.mail.libverify.o.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.mail.libverify.storage.g gVar, ru.mail.libverify.o.e eVar) {
        super(0);
        this.a = gVar;
        this.b = eVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return v.a(this.a.getContext(), this.b.b());
    }
}
