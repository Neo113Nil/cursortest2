package com.yandex.go.user_profile.ui.am;

import com.yandex.go.user_profile.ui.am.AmProfileParams;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.t02;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/user_profile/ui/am/AmProfileParams.Profile.$serializer", "Luxs;", "Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Profile;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Profile;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Profile;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class AmProfileParams$Profile$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AmProfileParams$Profile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AmProfileParams$Profile$$serializer amProfileParams$Profile$$serializer = new AmProfileParams$Profile$$serializer();
        INSTANCE = amProfileParams$Profile$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.user_profile.ui.am.AmProfileParams.Profile", amProfileParams$Profile$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("email", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j("rating_info", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("upload_photo_action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmProfileParams$Profile$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        AmProfileParams$Line$$serializer amProfileParams$Line$$serializer = AmProfileParams$Line$$serializer.INSTANCE;
        KSerializer n = qke.n(amProfileParams$Line$$serializer);
        KSerializer n2 = qke.n(amProfileParams$Line$$serializer);
        KSerializer n3 = qke.n(amProfileParams$Line$$serializer);
        KSerializer n4 = qke.n(amProfileParams$Line$$serializer);
        KSerializer n5 = qke.n(amProfileParams$Line$$serializer);
        t02 t02Var = t02.e;
        return new KSerializer[]{n, n2, n3, n4, n5, qke.n(t02Var), qke.n(t02Var)};
    }

    @Override // defpackage.myi
    public final AmProfileParams.Profile deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        AmProfileParams.Line line = null;
        AmProfileParams.Line line2 = null;
        AmProfileParams.Line line3 = null;
        AmProfileParams.Line line4 = null;
        AmProfileParams.Line line5 = null;
        g gVar = null;
        g gVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    line = (AmProfileParams.Line) b.s(serialDescriptor, 0, AmProfileParams$Line$$serializer.INSTANCE, line);
                    i |= 1;
                    break;
                case 1:
                    line2 = (AmProfileParams.Line) b.s(serialDescriptor, 1, AmProfileParams$Line$$serializer.INSTANCE, line2);
                    i |= 2;
                    break;
                case 2:
                    line3 = (AmProfileParams.Line) b.s(serialDescriptor, 2, AmProfileParams$Line$$serializer.INSTANCE, line3);
                    i |= 4;
                    break;
                case 3:
                    line4 = (AmProfileParams.Line) b.s(serialDescriptor, 3, AmProfileParams$Line$$serializer.INSTANCE, line4);
                    i |= 8;
                    break;
                case 4:
                    line5 = (AmProfileParams.Line) b.s(serialDescriptor, 4, AmProfileParams$Line$$serializer.INSTANCE, line5);
                    i |= 16;
                    break;
                case 5:
                    gVar = (g) b.s(serialDescriptor, 5, t02.e, gVar);
                    i |= 32;
                    break;
                case 6:
                    gVar2 = (g) b.s(serialDescriptor, 6, t02.e, gVar2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new AmProfileParams.Profile(i, line, line2, line3, line4, line5, gVar, gVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AmProfileParams.Profile value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, AmProfileParams$Line$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, AmProfileParams$Line$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, AmProfileParams$Line$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, AmProfileParams$Line$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, AmProfileParams$Line$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, t02.e, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, t02.e, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
