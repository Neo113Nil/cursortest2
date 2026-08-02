package com.yandex.go.payments.data.model.response;

import defpackage.auu0;
import defpackage.e6m;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/CorpAccount.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/CorpAccount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/CorpAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/CorpAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CorpAccount$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CorpAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CorpAccount$$serializer corpAccount$$serializer = new CorpAccount$$serializer();
        INSTANCE = corpAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.CorpAccount", corpAccount$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("money_spent", true);
        pluginGeneratedSerialDescriptor.j("money_limit", true);
        pluginGeneratedSerialDescriptor.j("money_left", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("cost_center", true);
        pluginGeneratedSerialDescriptor.j("cost_center_fields", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CorpAccount$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = CorpAccount.k;
        auu0 auu0Var = auu0.a;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{auu0Var, auu0Var, e6mVar, e6mVar, e6mVar, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[8].getValue(), qke.n(Availability$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final CorpAccount deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        i3y[] i3yVarArr3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = CorpAccount.k;
        b.getClass();
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        Availability availability = null;
        List list = null;
        String str = null;
        boolean z2 = true;
        String str2 = null;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str4 = b.k(serialDescriptor, 0);
                    i |= 1;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr3 = i3yVarArr;
                    str5 = b.k(serialDescriptor, 1);
                    i |= 2;
                    i3yVarArr = i3yVarArr3;
                case 2:
                    i3yVarArr3 = i3yVarArr;
                    d = b.E(serialDescriptor, 2);
                    i |= 4;
                    i3yVarArr = i3yVarArr3;
                case 3:
                    i3yVarArr3 = i3yVarArr;
                    d2 = b.E(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr = i3yVarArr3;
                case 4:
                    i3yVarArr3 = i3yVarArr;
                    d3 = b.E(serialDescriptor, 4);
                    i |= 16;
                    i3yVarArr = i3yVarArr3;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr2[8].getValue(), list);
                    i |= 256;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    z = z2;
                    availability = (Availability) b.s(serialDescriptor, 9, Availability$$serializer.INSTANCE, availability);
                    i |= 512;
                    i3yVarArr = i3yVarArr2;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CorpAccount(i, str4, str5, d, d2, d3, str2, str3, str, list, availability);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CorpAccount value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        CorpAccount.m(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
