package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import defpackage.auu0;
import defpackage.h6w;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/transfer_requirement/transferapi/TransferParam.$serializer", "Luxs;", "Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/transfer_requirement/transferapi/TransferParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TransferParam$$serializer implements uxs {
    public static final TransferParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TransferParam$$serializer transferParam$$serializer = new TransferParam$$serializer();
        INSTANCE = transferParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.transfer_requirement.transferapi.TransferParam", transferParam$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("number", false);
        pluginGeneratedSerialDescriptor.j(MetaDataField.DATE_FIELD, false);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, true);
        pluginGeneratedSerialDescriptor.j("train_carriage_number", true);
        pluginGeneratedSerialDescriptor.j("greeting", false);
        pluginGeneratedSerialDescriptor.j("tz", false);
        pluginGeneratedSerialDescriptor.j("with_sign", false);
        pluginGeneratedSerialDescriptor.j("luggage_count", true);
        pluginGeneratedSerialDescriptor.j("point_a", false);
        pluginGeneratedSerialDescriptor.j("tariff_classes", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransferParam$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TransferParam.l;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n(h6w.a), qke.n(TransferParam$PointA$$serializer.INSTANCE), i3yVarArr[10].getValue()};
    }

    @Override // defpackage.myi
    public final TransferParam deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = TransferParam.l;
        b.getClass();
        List list = null;
        TransferParam.PointA pointA = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        TransferParam.TransferType transferType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    transferType = (TransferParam.TransferType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), transferType);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    num = (Integer) b.s(serialDescriptor, 8, h6w.a, num);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    pointA = (TransferParam.PointA) b.s(serialDescriptor, 9, TransferParam$PointA$$serializer.INSTANCE, pointA);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr2[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new TransferParam(i, transferType, str, str2, str3, str4, str5, str6, z2, num, pointA, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TransferParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransferParam.l;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        TransferParam.TransferType transferType = value.a;
        Integer num = value.i;
        String str = value.e;
        String str2 = value.d;
        b.e(serialDescriptor, 0, kSerializer, transferType);
        b.o(serialDescriptor, 1, value.b);
        b.o(serialDescriptor, 2, value.c);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 4, auu0.a, str);
        }
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.n(serialDescriptor, 7, value.h);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 8, h6w.a, num);
        }
        b.g(serialDescriptor, 9, TransferParam$PointA$$serializer.INSTANCE, value.j);
        b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
