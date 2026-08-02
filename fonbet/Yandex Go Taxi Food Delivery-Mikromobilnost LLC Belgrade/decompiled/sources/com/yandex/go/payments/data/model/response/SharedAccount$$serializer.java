package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.SharedAccount;
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
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/SharedAccount.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/SharedAccount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/SharedAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/SharedAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SharedAccount$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SharedAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedAccount$$serializer sharedAccount$$serializer = new SharedAccount$$serializer();
        INSTANCE = sharedAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.SharedAccount", sharedAccount$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("error_description", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("member_role", true);
        pluginGeneratedSerialDescriptor.j("is_invitation_sent", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SharedAccount$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = SharedAccount.j;
        KSerializer n = qke.n((KSerializer) i3yVarArr[5].getValue());
        KSerializer n2 = qke.n(Availability$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, z96Var, n, z96Var, SharedAccount$Details$$serializer.INSTANCE, n2};
    }

    @Override // defpackage.myi
    public final SharedAccount deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = SharedAccount.j;
        b.getClass();
        Availability availability = null;
        boolean z = true;
        SharedAccount.Details details = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = false;
        MemberRole memberRole = null;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    memberRole = (MemberRole) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), memberRole);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    details = (SharedAccount.Details) b.A(serialDescriptor, 7, SharedAccount$Details$$serializer.INSTANCE, details);
                    i |= 128;
                    break;
                case 8:
                    availability = (Availability) b.s(serialDescriptor, 8, Availability$$serializer.INSTANCE, availability);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SharedAccount(i, str, str2, str3, str4, z2, memberRole, z3, details, availability);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedAccount value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SharedAccount.p(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
