package ru.mail.libverify.u;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class s extends Lambda implements gzs<Object> {
    final /* synthetic */ ru.mail.libverify.f0.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ru.mail.libverify.f0.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return this.a.i();
    }
}
