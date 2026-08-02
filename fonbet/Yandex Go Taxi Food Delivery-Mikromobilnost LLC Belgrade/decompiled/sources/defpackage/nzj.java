package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class nzj implements uxs {
    public static final nzj a;
    private static final SerialDescriptor descriptor;

    static {
        nzj nzjVar = new nzj();
        a = nzjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto", nzjVar, 7);
        pluginGeneratedSerialDescriptor.j("indent", false);
        pluginGeneratedSerialDescriptor.j("backgroundColorSettings", false);
        pluginGeneratedSerialDescriptor.j("backgroundShapeSettings", false);
        pluginGeneratedSerialDescriptor.j("opacity", false);
        pluginGeneratedSerialDescriptor.j("horizontalRule", false);
        pluginGeneratedSerialDescriptor.j("verticalRule", false);
        pluginGeneratedSerialDescriptor.j("widthType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = wzj.h;
        return new KSerializer[]{tqv.a, i3yVarArr[1].getValue(), gir0.a, qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wzj.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        vqv vqvVar = null;
        List list = null;
        oir0 oir0Var = null;
        Integer num = null;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto = null;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto = null;
        vzj vzjVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    vqvVar = (vqv) b.A(serialDescriptor, 0, tqv.a, vqvVar);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    oir0Var = (oir0) b.A(serialDescriptor, 2, gir0.a, oir0Var);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    break;
                case 4:
                    displayRulesDto$HorizontalRuleDto = (DisplayRulesDto$HorizontalRuleDto) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), displayRulesDto$HorizontalRuleDto);
                    i |= 16;
                    break;
                case 5:
                    displayRulesDto$VerticalRuleDto = (DisplayRulesDto$VerticalRuleDto) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), displayRulesDto$VerticalRuleDto);
                    i |= 32;
                    break;
                case 6:
                    vzjVar = (vzj) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), vzjVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new wzj(i, vqvVar, list, oir0Var, num, displayRulesDto$HorizontalRuleDto, displayRulesDto$VerticalRuleDto, vzjVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wzj wzjVar = (wzj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wzj.h;
        b.e(serialDescriptor, 0, tqv.a, wzjVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), wzjVar.b);
        b.e(serialDescriptor, 2, gir0.a, wzjVar.c);
        b.g(serialDescriptor, 3, h6w.a, wzjVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), wzjVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), wzjVar.f);
        b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), wzjVar.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
