package com.yandex.div.internal.viewpool;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.cti;
import xsna.lmi0;
import xsna.n9x;
import xsna.ozl;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;

/* compiled from: ViewPreCreationProfile.kt */
@ozl
/* loaded from: classes7.dex */
public final class PreCreationModel$$serializer implements vht<PreCreationModel> {
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ xfb0 descriptor;

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        xfb0 xfb0Var = new xfb0("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        xfb0Var.j("capacity", false);
        xfb0Var.j(UcumUtils.UCUM_MINUTES, true);
        xfb0Var.j(InneractiveMediationNameConsts.MAX, true);
        descriptor = xfb0Var;
    }

    private PreCreationModel$$serializer() {
    }

    @Override // xsna.vht
    public KSerializer<?>[] childSerializers() {
        n9x n9xVar = n9x.a;
        return new KSerializer[]{n9xVar, n9xVar, n9xVar};
    }

    @Override // xsna.a3m
    public PreCreationModel deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        ssi d = decoder.d(descriptor2);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int m = d.m(descriptor2);
            if (m == -1) {
                z = false;
            } else if (m == 0) {
                i2 = d.s(descriptor2, 0);
                i |= 1;
            } else if (m == 1) {
                i3 = d.s(descriptor2, 1);
                i |= 2;
            } else {
                if (m != 2) {
                    throw new UnknownFieldException(m);
                }
                i4 = d.s(descriptor2, 2);
                i |= 4;
            }
        }
        d.e(descriptor2);
        return new PreCreationModel(i, i2, i3, i4, (lmi0) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, PreCreationModel preCreationModel) {
        SerialDescriptor descriptor2 = getDescriptor();
        cti d = encoder.d(descriptor2);
        PreCreationModel.write$Self(preCreationModel, d, descriptor2);
        d.e(descriptor2);
    }

    @Override // xsna.vht
    public KSerializer<?>[] typeParametersSerializers() {
        return x1o0.c;
    }
}
