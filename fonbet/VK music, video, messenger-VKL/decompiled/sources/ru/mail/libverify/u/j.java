package ru.mail.libverify.u;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class j extends Lambda implements gzs<Object> {
    final /* synthetic */ ru.mail.libverify.storage.g a;
    final /* synthetic */ ru.mail.libverify.g0.q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru.mail.libverify.storage.g gVar, ru.mail.libverify.g0.q qVar) {
        super(0);
        this.a = gVar;
        this.b = qVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return v.a(this.a.getContext(), this.b);
    }
}
