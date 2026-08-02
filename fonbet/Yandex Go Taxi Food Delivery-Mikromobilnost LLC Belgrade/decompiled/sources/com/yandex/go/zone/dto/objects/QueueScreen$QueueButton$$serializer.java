package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.QueueScreen;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/QueueScreen.QueueButton.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/QueueScreen$QueueButton;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/QueueScreen$QueueButton;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/QueueScreen$QueueButton;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class QueueScreen$QueueButton$$serializer implements uxs {
    public static final QueueScreen$QueueButton$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        QueueScreen$QueueButton$$serializer queueScreen$QueueButton$$serializer = new QueueScreen$QueueButton$$serializer();
        INSTANCE = queueScreen$QueueButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.QueueScreen.QueueButton", queueScreen$QueueButton$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("is_loading", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("transparency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private QueueScreen$QueueButton$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{QueueScreen.QueueButton.g[0].getValue(), w7s.a, auu0.a, z96Var, z96Var, e6m.a};
    }

    @Override // defpackage.myi
    public final QueueScreen.QueueButton deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = QueueScreen.QueueButton.g;
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        QueueScreen.QueueButton.QueueButtonAction queueButtonAction = null;
        FormattedText formattedText = null;
        String str = null;
        double d = 0.0d;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    queueButtonAction = (QueueScreen.QueueButton.QueueButtonAction) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), queueButtonAction);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    d = b.E(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new QueueScreen.QueueButton(i, queueButtonAction, formattedText, str, z, z2, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, QueueScreen.QueueButton value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = QueueScreen.QueueButton.g;
        if (b.F() || value.a != QueueScreen.QueueButton.QueueButtonAction.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || !value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || Double.compare(value.f, 1.0d) != 0) {
            b.E(serialDescriptor, 5, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
