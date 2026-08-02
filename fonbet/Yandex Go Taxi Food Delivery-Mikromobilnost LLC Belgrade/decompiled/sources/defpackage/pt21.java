package defpackage;

import com.yandex.auth.LegacyAccountType;
import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class pt21 implements uxs {
    public static final pt21 a;
    private static final SerialDescriptor descriptor;

    static {
        pt21 pt21Var = new pt21();
        a = pt21Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.UserStatusDto", pt21Var, 4);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j(LegacyAccountType.STRING_LOGIN, true);
        pluginGeneratedSerialDescriptor.j("familyRole", true);
        pluginGeneratedSerialDescriptor.j("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rt21.e;
        return new KSerializer[]{pnz.a, qke.n(auu0.a), i3yVarArr[2].getValue(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rt21.e;
        b.getClass();
        int i = 0;
        long j = 0;
        String str = null;
        FamilyRoleDto familyRoleDto = null;
        List list = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                familyRoleDto = (FamilyRoleDto) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), familyRoleDto);
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
        return new rt21(i, j, str, familyRoleDto, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rt21 rt21Var = (rt21) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rt21.e;
        long j = rt21Var.a;
        List list = rt21Var.d;
        FamilyRoleDto familyRoleDto = rt21Var.c;
        String str = rt21Var.b;
        b.s(serialDescriptor, 0, j);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        if (b.F() || familyRoleDto != FamilyRoleDto.NONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), familyRoleDto);
        }
        if (b.F() || !jl40.l(list, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
