package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class bsg extends i9 {
    public static final bsg a = new bsg();
    public static final i3y b = a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(8));

    @Override // defpackage.i9
    public final myi a(sjd sjdVar, String str) {
        return ((ssp0) b.getValue()).a(sjdVar, str);
    }

    @Override // defpackage.i9
    public final KSerializer b(Encoder encoder, Object obj) {
        return ((ssp0) b.getValue()).b(encoder, (asg) obj);
    }

    @Override // defpackage.i9
    public final lfx c() {
        return qoi0.a(asg.class);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return ((ssp0) b.getValue()).getDescriptor();
    }
}
