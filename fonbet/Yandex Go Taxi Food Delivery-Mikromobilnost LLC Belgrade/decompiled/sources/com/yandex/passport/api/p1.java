package com.yandex.passport.api;

import defpackage.auu0;
import defpackage.exv;
import defpackage.ooc;
import defpackage.uxs;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final /* synthetic */ class p1 implements uxs {
    public static final p1 a;
    private static final SerialDescriptor descriptor;

    static {
        p1 p1Var = new p1();
        a = p1Var;
        exv exvVar = new exv("com.yandex.passport.api.PassportPartition", p1Var);
        exvVar.j("value", false);
        descriptor = exvVar;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return PassportPartition.m231boximpl(PassportPartition.m232constructorimpl(decoder.w(descriptor).p()));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String m240unboximpl = ((PassportPartition) obj).m240unboximpl();
        Encoder i = encoder.i(descriptor);
        if (i == null) {
            return;
        }
        i.t(m240unboximpl);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
