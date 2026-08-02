package com.yandex.go.scooters.data.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersOnboardingAgreement.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersOnboardingAgreement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersOnboardingAgreement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersOnboardingAgreement;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersOnboardingAgreement$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersOnboardingAgreement$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersOnboardingAgreement$$serializer scootersOnboardingAgreement$$serializer = new ScootersOnboardingAgreement$$serializer();
        INSTANCE = scootersOnboardingAgreement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersOnboardingAgreement", scootersOnboardingAgreement$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(CRLDistributionPointsExtension.POINTS, true);
        pluginGeneratedSerialDescriptor.j("text_content", true);
        pluginGeneratedSerialDescriptor.j("accept_button", true);
        pluginGeneratedSerialDescriptor.j("complete_rules", true);
        pluginGeneratedSerialDescriptor.j("rules", true);
        pluginGeneratedSerialDescriptor.j("accept_items", true);
        pluginGeneratedSerialDescriptor.j("root_accept_item", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersOnboardingAgreement$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScootersOnboardingAgreement.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(CompleteRules$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n(RootAcceptItem$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ScootersOnboardingAgreement deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersOnboardingAgreement.i;
        b.getClass();
        ScootersOnboardingAgreement scootersOnboardingAgreement = null;
        boolean z = true;
        RootAcceptItem rootAcceptItem = null;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        CompleteRules completeRules = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    completeRules = (CompleteRules) b.s(serialDescriptor, 4, CompleteRules$$serializer.INSTANCE, completeRules);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    rootAcceptItem = (RootAcceptItem) b.s(serialDescriptor, 7, RootAcceptItem$$serializer.INSTANCE, rootAcceptItem);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return scootersOnboardingAgreement;
            }
            scootersOnboardingAgreement = null;
        }
        b.c(serialDescriptor);
        return new ScootersOnboardingAgreement(i, str, list, str2, str3, completeRules, list2, list3, rootAcceptItem);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersOnboardingAgreement value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersOnboardingAgreement.i;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, CompleteRules$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, RootAcceptItem$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
