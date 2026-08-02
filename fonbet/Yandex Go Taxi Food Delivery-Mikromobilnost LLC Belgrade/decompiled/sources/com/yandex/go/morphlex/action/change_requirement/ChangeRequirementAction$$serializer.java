package com.yandex.go.morphlex.action.change_requirement;

import com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction.$serializer", "Luxs;", "Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/morphlex/action/change_requirement/ChangeRequirementAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChangeRequirementAction$$serializer implements uxs {
    public static final ChangeRequirementAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChangeRequirementAction$$serializer changeRequirementAction$$serializer = new ChangeRequirementAction$$serializer();
        INSTANCE = changeRequirementAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction", changeRequirementAction$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("requirement_name", false);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("operation", true);
        pluginGeneratedSerialDescriptor.j("value_type", true);
        pluginGeneratedSerialDescriptor.j("boolean_value", true);
        pluginGeneratedSerialDescriptor.j("integer_value", true);
        pluginGeneratedSerialDescriptor.j("string_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChangeRequirementAction$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChangeRequirementAction.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(z96.a), qke.n(h6w.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final ChangeRequirementAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChangeRequirementAction.h;
        b.getClass();
        ChangeRequirementAction changeRequirementAction = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ChangeRequirementAction.Operation operation = null;
        ChangeRequirementAction.ValueType valueType = null;
        Boolean bool = null;
        Integer num = null;
        String str3 = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    operation = (ChangeRequirementAction.Operation) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), operation);
                    i |= 4;
                    break;
                case 3:
                    valueType = (ChangeRequirementAction.ValueType) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), valueType);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return changeRequirementAction;
            }
            changeRequirementAction = null;
        }
        b.c(serialDescriptor);
        return new ChangeRequirementAction(i, str, str2, operation, valueType, bool, num, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChangeRequirementAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChangeRequirementAction.h;
        String str = value.a;
        String str2 = value.g;
        Integer num = value.f;
        Boolean bool = value.e;
        ChangeRequirementAction.ValueType valueType = value.d;
        ChangeRequirementAction.Operation operation = value.c;
        String str3 = value.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 1, auu0.a, str3);
        }
        if (b.F() || operation != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), operation);
        }
        if (b.F() || valueType != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), valueType);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 4, z96.a, bool);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 5, h6w.a, num);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 6, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
