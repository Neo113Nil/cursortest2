package ru.mail.libverify.u;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class e extends Lambda implements gzs<Object> {
    final /* synthetic */ ru.mail.libverify.storage.g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mail.libverify.storage.g gVar) {
        super(0);
        this.a = gVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return ru.mail.libverify.n0.e.b(this.a.getContext());
    }
}
