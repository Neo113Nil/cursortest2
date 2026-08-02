package com.yandex.go.user_profile.ui.am;

import com.yandex.go.user_profile.ui.am.AmProfileParams;
import defpackage.auu0;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/user_profile/ui/am/AmProfileParams.Interactions.$serializer", "Luxs;", "Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Interactions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Interactions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/user_profile/ui/am/AmProfileParams$Interactions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class AmProfileParams$Interactions$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AmProfileParams$Interactions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AmProfileParams$Interactions$$serializer amProfileParams$Interactions$$serializer = new AmProfileParams$Interactions$$serializer();
        INSTANCE = amProfileParams$Interactions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.user_profile.ui.am.AmProfileParams.Interactions", amProfileParams$Interactions$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("restriction_info", true);
        pluginGeneratedSerialDescriptor.j("change_account", true);
        pluginGeneratedSerialDescriptor.j("change_phone", true);
        pluginGeneratedSerialDescriptor.j("change_name", true);
        pluginGeneratedSerialDescriptor.j("change_photo", true);
        pluginGeneratedSerialDescriptor.j("change_email", true);
        pluginGeneratedSerialDescriptor.j("change_birthday", true);
        pluginGeneratedSerialDescriptor.j("logout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AmProfileParams$Interactions$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(auu0.a), z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final AmProfileParams.Interactions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z4 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z5 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z6 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z7 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z8 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new AmProfileParams.Interactions(i, str, z2, z3, z4, z5, z6, z7, z8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AmProfileParams.Interactions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || !value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || !value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || !value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || !value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
