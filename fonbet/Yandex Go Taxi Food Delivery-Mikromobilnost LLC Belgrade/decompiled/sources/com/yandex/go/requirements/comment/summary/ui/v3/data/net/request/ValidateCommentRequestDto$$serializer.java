package com.yandex.go.requirements.comment.summary.ui.v3.data.net.request;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto.$serializer", "Luxs;", "Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ValidateCommentRequestDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ValidateCommentRequestDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ValidateCommentRequestDto$$serializer validateCommentRequestDto$$serializer = new ValidateCommentRequestDto$$serializer();
        INSTANCE = validateCommentRequestDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto", validateCommentRequestDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("comment", false);
        pluginGeneratedSerialDescriptor.j("selected_class", false);
        pluginGeneratedSerialDescriptor.j("selected_vertical", false);
        pluginGeneratedSerialDescriptor.j("payment_method", false);
        pluginGeneratedSerialDescriptor.j("tariff_requirements", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ValidateCommentRequestDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ValidateCommentRequestDto.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), auu0Var, auu0Var, auu0Var, PaymentInfoDto$$serializer.INSTANCE, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final ValidateCommentRequestDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ValidateCommentRequestDto.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PaymentInfoDto paymentInfoDto = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    paymentInfoDto = (PaymentInfoDto) b.A(serialDescriptor, 4, PaymentInfoDto$$serializer.INSTANCE, paymentInfoDto);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ValidateCommentRequestDto(i, list, str, str2, str3, paymentInfoDto, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ValidateCommentRequestDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ValidateCommentRequestDto.g;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        b.o(serialDescriptor, 1, value.b);
        b.o(serialDescriptor, 2, value.c);
        b.o(serialDescriptor, 3, value.d);
        b.e(serialDescriptor, 4, PaymentInfoDto$$serializer.INSTANCE, value.e);
        b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
