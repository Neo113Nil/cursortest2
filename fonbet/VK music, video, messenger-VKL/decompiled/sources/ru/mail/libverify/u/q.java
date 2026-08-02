package ru.mail.libverify.u;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class q extends Lambda implements gzs<Object> {
    final /* synthetic */ ru.mail.libverify.g0.q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ru.mail.libverify.g0.q qVar) {
        super(0);
        this.a = qVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return Boolean.valueOf(this.a.d());
    }
}
