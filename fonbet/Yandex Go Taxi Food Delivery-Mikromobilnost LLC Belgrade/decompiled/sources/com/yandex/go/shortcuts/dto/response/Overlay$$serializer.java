package com.yandex.go.shortcuts.dto.response;

import defpackage.aei0;
import defpackage.auu0;
import defpackage.cei0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/Overlay.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/Overlay;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/Overlay;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/Overlay;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Overlay$$serializer implements uxs {
    public static final Overlay$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Overlay$$serializer overlay$$serializer = new Overlay$$serializer();
        INSTANCE = overlay$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.Overlay", overlay$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("shape", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("info", true);
        pluginGeneratedSerialDescriptor.j("analytics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Overlay$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = Overlay.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{ShowPolicy$$serializer.INSTANCE, i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, Background$$serializer.INSTANCE, i3yVarArr[6].getValue(), w7s.a, i3yVarArr[8].getValue(), qke.n(aei0.a)};
    }

    @Override // defpackage.myi
    public final Overlay deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = Overlay.k;
        b.getClass();
        cei0 cei0Var = null;
        List list = null;
        boolean z = true;
        FormattedText formattedText = null;
        int i = 0;
        ShowPolicy showPolicy = null;
        OverlayType overlayType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Background background = null;
        Shape shape = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    showPolicy = (ShowPolicy) b.A(serialDescriptor, 0, ShowPolicy$$serializer.INSTANCE, showPolicy);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr2 = i3yVarArr;
                    overlayType = (OverlayType) b.A(serialDescriptor, 1, (myi) i3yVarArr2[1].getValue(), overlayType);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr2 = i3yVarArr;
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    background = (Background) b.A(serialDescriptor, 5, Background$$serializer.INSTANCE, background);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    shape = (Shape) b.A(serialDescriptor, 6, (myi) i3yVarArr2[6].getValue(), shape);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    formattedText = (FormattedText) b.A(serialDescriptor, 7, w7s.a, formattedText);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr2[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    cei0Var = (cei0) b.s(serialDescriptor, 9, aei0.a, cei0Var);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr = i3yVarArr2;
        }
        b.c(serialDescriptor);
        return new Overlay(i, showPolicy, overlayType, str, str2, str3, background, shape, formattedText, list, cei0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Overlay value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        Overlay.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
