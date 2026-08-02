package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.SharedPaymentExperiment;
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
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/SharedPaymentExperiment.RawType.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/SharedPaymentExperiment$RawType;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/SharedPaymentExperiment$RawType;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/SharedPaymentExperiment$RawType;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SharedPaymentExperiment$RawType$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SharedPaymentExperiment$RawType$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedPaymentExperiment$RawType$$serializer sharedPaymentExperiment$RawType$$serializer = new SharedPaymentExperiment$RawType$$serializer();
        INSTANCE = sharedPaymentExperiment$RawType$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.SharedPaymentExperiment.RawType", sharedPaymentExperiment$RawType$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("menu_title", true);
        pluginGeneratedSerialDescriptor.j("promo_title", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("dont_need_name", true);
        pluginGeneratedSerialDescriptor.j("descriptions", true);
        pluginGeneratedSerialDescriptor.j("cannot_be_created_when_another_is_used", true);
        pluginGeneratedSerialDescriptor.j("cannot_be_created_when_another_is_used_explanation", true);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("plus_multi_banner", true);
        pluginGeneratedSerialDescriptor.j("lite_creation_flow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SharedPaymentExperiment$RawType$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SharedPaymentExperiment.RawType.m;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, z96Var, i3yVarArr[6].getValue(), z96Var, auu0Var, i3yVarArr[9].getValue(), qke.n(SharedPaymentExperiment$PlusMultiBanner$$serializer.INSTANCE), qke.n(SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final SharedPaymentExperiment.RawType deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = SharedPaymentExperiment.RawType.m;
        b.getClass();
        SharedPaymentExperiment.BusinessAccountCreationFlow businessAccountCreationFlow = null;
        SharedPaymentExperiment.PlusMultiBanner plusMultiBanner = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        List list2 = null;
        boolean z3 = false;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z3 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    plusMultiBanner = (SharedPaymentExperiment.PlusMultiBanner) b.s(serialDescriptor, 10, SharedPaymentExperiment$PlusMultiBanner$$serializer.INSTANCE, plusMultiBanner);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    businessAccountCreationFlow = (SharedPaymentExperiment.BusinessAccountCreationFlow) b.s(serialDescriptor, 11, SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer.INSTANCE, businessAccountCreationFlow);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new SharedPaymentExperiment.RawType(i, str, str2, str3, str4, str5, z2, list2, z3, str6, list, plusMultiBanner, businessAccountCreationFlow);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedPaymentExperiment.RawType value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SharedPaymentExperiment.RawType.m;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, "")) {
            b.o(serialDescriptor, 8, value.i);
        }
        if (b.F() || !jl40.l(value.j, emptyList)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, SharedPaymentExperiment$PlusMultiBanner$$serializer.INSTANCE, value.k);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer.INSTANCE, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
