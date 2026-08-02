package com.yandex.go.overdraft.data.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.u9x0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/overdraft/data/model/DebtInfo.$serializer", "Luxs;", "Lcom/yandex/go/overdraft/data/model/DebtInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/overdraft/data/model/DebtInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/overdraft/data/model/DebtInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class DebtInfo$$serializer implements uxs {
    public static final DebtInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DebtInfo$$serializer debtInfo$$serializer = new DebtInfo$$serializer();
        INSTANCE = debtInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.overdraft.data.model.DebtInfo", debtInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("ride_infos", true);
        pluginGeneratedSerialDescriptor.j("payment_method_action", true);
        pluginGeneratedSerialDescriptor.j("plus_points", true);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("is_separator_visible", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DebtInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DebtInfo.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), u9x0.e, PlusPoints$$serializer.INSTANCE, i3yVarArr[5].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final DebtInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DebtInfo.h;
        b.getClass();
        DebtInfo debtInfo = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        List list = null;
        t0 t0Var = null;
        PlusPoints plusPoints = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    t0Var = (t0) b.A(serialDescriptor, 3, u9x0.e, t0Var);
                    i |= 8;
                    break;
                case 4:
                    plusPoints = (PlusPoints) b.A(serialDescriptor, 4, PlusPoints$$serializer.INSTANCE, plusPoints);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return debtInfo;
            }
            debtInfo = null;
        }
        b.c(serialDescriptor);
        return new DebtInfo(i, str, str2, list, t0Var, plusPoints, list2, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.overdraft.data.model.PlusPoints.d) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, DebtInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DebtInfo.h;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, s0.INSTANCE)) {
            b.e(serialDescriptor, 3, u9x0.e, value.d);
        }
        if (!b.F()) {
            PlusPoints plusPoints = value.e;
            PlusPoints.Companion.getClass();
        }
        b.e(serialDescriptor, 4, PlusPoints$$serializer.INSTANCE, value.e);
        if (b.F() || !jl40.l(value.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
