package com.yandex.go.shortcuts.dto.response;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.o170;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.xx;
import defpackage.yjd;
import io.appmetrica.analytics.impl.C0553n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/TurboButton.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/TurboButton;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/TurboButton;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/TurboButton;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TurboButton$$serializer implements uxs {
    public static final TurboButton$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TurboButton$$serializer turboButton$$serializer = new TurboButton$$serializer();
        INSTANCE = turboButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.TurboButton", turboButton$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("attributed_title", true);
        pluginGeneratedSerialDescriptor.j("overlays", true);
        pluginGeneratedSerialDescriptor.j("text_style", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        pluginGeneratedSerialDescriptor.j("counters", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("icon_size", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("onboarding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TurboButton$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = TurboButton.m;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(w7s.a), i3yVarArr[3].getValue(), TextStyleDto$$serializer.INSTANCE, Background$$serializer.INSTANCE, Counters$$serializer.INSTANCE, xx.f, auu0Var, i3yVarArr[9].getValue(), auu0Var, qke.n(o170.e)};
    }

    @Override // defpackage.myi
    public final TurboButton deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = TurboButton.m;
        b.getClass();
        f0 f0Var = null;
        ShortcutIconSize shortcutIconSize = null;
        boolean z = true;
        com.yandex.go.dto.response.q1 q1Var = null;
        int i = 0;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        List list = null;
        TextStyleDto textStyleDto = null;
        Background background = null;
        Counters counters = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr2 = i3yVarArr;
                    z = false;
                    break;
                case 0:
                    i3yVarArr2 = i3yVarArr;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr2 = i3yVarArr;
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr2 = i3yVarArr;
                    formattedText = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr2 = i3yVarArr;
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr2[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr2 = i3yVarArr;
                    textStyleDto = (TextStyleDto) b.A(serialDescriptor, 4, TextStyleDto$$serializer.INSTANCE, textStyleDto);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr2 = i3yVarArr;
                    background = (Background) b.A(serialDescriptor, 5, Background$$serializer.INSTANCE, background);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr2 = i3yVarArr;
                    counters = (Counters) b.A(serialDescriptor, 6, Counters$$serializer.INSTANCE, counters);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr2 = i3yVarArr;
                    q1Var = (com.yandex.go.dto.response.q1) b.A(serialDescriptor, 7, xx.f, q1Var);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr2 = i3yVarArr;
                    str3 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr2 = i3yVarArr;
                    shortcutIconSize = (ShortcutIconSize) b.A(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), shortcutIconSize);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr2 = i3yVarArr;
                    str4 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr2 = i3yVarArr;
                    f0Var = (f0) b.s(serialDescriptor, 11, o170.e, f0Var);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr = i3yVarArr2;
        }
        b.c(serialDescriptor);
        return new TurboButton(i, str, str2, formattedText, list, textStyleDto, background, counters, q1Var, str3, shortcutIconSize, str4, f0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TurboButton value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        TurboButton.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
