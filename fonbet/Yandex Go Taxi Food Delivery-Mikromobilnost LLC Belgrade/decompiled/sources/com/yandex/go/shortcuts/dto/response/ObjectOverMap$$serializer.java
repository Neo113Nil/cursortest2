package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.ij2;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.xx;
import defpackage.yjd;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/ObjectOverMap.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/ObjectOverMap;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ObjectOverMap$$serializer implements uxs {
    public static final ObjectOverMap$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ObjectOverMap$$serializer objectOverMap$$serializer = new ObjectOverMap$$serializer();
        INSTANCE = objectOverMap$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.ObjectOverMap", objectOverMap$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("accessibility_text", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ObjectOverMap$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = ObjectOverMap.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(ObjectOverMap$ShowPolicy$$serializer.INSTANCE), qke.n(ij2.e), qke.n(xx.f), qke.n(w7s.a), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final ObjectOverMap deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = ObjectOverMap.i;
        b.getClass();
        ObjectOverMap objectOverMap = null;
        boolean z = true;
        Map map = null;
        String str = null;
        ObjectOverMap.ShowPolicy showPolicy = null;
        d dVar = null;
        com.yandex.go.dto.response.q1 q1Var = null;
        FormattedText formattedText = null;
        PositionOverMap positionOverMap = null;
        String str2 = null;
        int i = 0;
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
                    showPolicy = (ObjectOverMap.ShowPolicy) b.s(serialDescriptor, 1, ObjectOverMap$ShowPolicy$$serializer.INSTANCE, showPolicy);
                    i |= 2;
                    break;
                case 2:
                    dVar = (d) b.s(serialDescriptor, 2, ij2.e, dVar);
                    i |= 4;
                    break;
                case 3:
                    q1Var = (com.yandex.go.dto.response.q1) b.s(serialDescriptor, 3, xx.f, q1Var);
                    i |= 8;
                    break;
                case 4:
                    formattedText = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText);
                    i |= 16;
                    break;
                case 5:
                    positionOverMap = (PositionOverMap) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), positionOverMap);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return objectOverMap;
            }
            objectOverMap = null;
        }
        b.c(serialDescriptor);
        return new ObjectOverMap(i, str, showPolicy, dVar, q1Var, formattedText, positionOverMap, str2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ObjectOverMap value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ObjectOverMap.j(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
