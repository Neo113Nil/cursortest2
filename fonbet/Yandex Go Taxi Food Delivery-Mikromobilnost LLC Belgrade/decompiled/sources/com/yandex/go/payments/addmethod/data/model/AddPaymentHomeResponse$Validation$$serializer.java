package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
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
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse.Validation.$serializer", "Luxs;", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$Validation;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$Validation;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$Validation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class AddPaymentHomeResponse$Validation$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AddPaymentHomeResponse$Validation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddPaymentHomeResponse$Validation$$serializer addPaymentHomeResponse$Validation$$serializer = new AddPaymentHomeResponse$Validation$$serializer();
        INSTANCE = addPaymentHomeResponse$Validation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.Validation", addPaymentHomeResponse$Validation$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("field_type", true);
        pluginGeneratedSerialDescriptor.j("length_restrictions", true);
        pluginGeneratedSerialDescriptor.j("not_editable_prefix", true);
        pluginGeneratedSerialDescriptor.j("phone_formats", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddPaymentHomeResponse$Validation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AddPaymentHomeResponse.Validation.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(AddPaymentHomeResponse$LengthRestrictions$$serializer.INSTANCE), qke.n(auu0.a), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final AddPaymentHomeResponse.Validation deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.Validation.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        AddPaymentHomeResponse.FieldType fieldType = null;
        AddPaymentHomeResponse.LengthRestrictions lengthRestrictions = null;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                fieldType = (AddPaymentHomeResponse.FieldType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), fieldType);
                i |= 1;
            } else if (v == 1) {
                lengthRestrictions = (AddPaymentHomeResponse.LengthRestrictions) b.s(serialDescriptor, 1, AddPaymentHomeResponse$LengthRestrictions$$serializer.INSTANCE, lengthRestrictions);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new AddPaymentHomeResponse.Validation(i, fieldType, lengthRestrictions, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AddPaymentHomeResponse.Validation value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.Validation.e;
        if (b.F() || value.a != AddPaymentHomeResponse.FieldType.PHONE_NUMBER) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, AddPaymentHomeResponse$LengthRestrictions$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
