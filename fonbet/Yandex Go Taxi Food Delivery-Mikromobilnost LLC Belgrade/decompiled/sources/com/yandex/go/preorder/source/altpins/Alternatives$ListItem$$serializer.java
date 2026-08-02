package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives.ListItem.$serializer", "Luxs;", "Lcom/yandex/go/preorder/source/altpins/Alternatives$ListItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/preorder/source/altpins/Alternatives$ListItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/preorder/source/altpins/Alternatives$ListItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class Alternatives$ListItem$$serializer implements uxs {
    public static final Alternatives$ListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Alternatives$ListItem$$serializer alternatives$ListItem$$serializer = new Alternatives$ListItem$$serializer();
        INSTANCE = alternatives$ListItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.preorder.source.altpins.Alternatives.ListItem", alternatives$ListItem$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("order_priority", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("trail_title", true);
        pluginGeneratedSerialDescriptor.j("trail_subtitle", true);
        pluginGeneratedSerialDescriptor.j("trail_subtitle_formatted", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("trail_image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Alternatives$ListItem$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(w7s.a);
        KSerializer n5 = qke.n(Alternatives$Badge$$serializer.INSTANCE);
        c7v c7vVar = c7v.a;
        return new KSerializer[]{h6w.a, auu0Var, n, n2, n3, n4, n5, qke.n(c7vVar), qke.n(c7vVar)};
    }

    @Override // defpackage.myi
    public final Alternatives.ListItem deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Alternatives.ListItem listItem = null;
        boolean z = true;
        n7v n7vVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        FormattedText formattedText = null;
        Alternatives.Badge badge = null;
        n7v n7vVar2 = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    formattedText = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText);
                    i |= 32;
                    break;
                case 6:
                    badge = (Alternatives.Badge) b.s(serialDescriptor, 6, Alternatives$Badge$$serializer.INSTANCE, badge);
                    i |= 64;
                    break;
                case 7:
                    n7vVar2 = (n7v) b.s(serialDescriptor, 7, c7v.a, n7vVar2);
                    i |= 128;
                    break;
                case 8:
                    n7vVar = (n7v) b.s(serialDescriptor, 8, c7v.a, n7vVar);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return listItem;
            }
            listItem = null;
        }
        b.c(serialDescriptor);
        return new Alternatives.ListItem(i, i2, str, str2, str3, str4, formattedText, badge, n7vVar2, n7vVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Alternatives.ListItem value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != 0) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, Alternatives$Badge$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, c7v.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, c7v.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
