package com.yandex.go.vault.flexsdk.descriptors.widget.actions;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload.$serializer", "Luxs;", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/vault/flexsdk/descriptors/widget/actions/VaultStoreErrorScreenPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class VaultStoreErrorScreenPayload$$serializer implements uxs {
    public static final VaultStoreErrorScreenPayload$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VaultStoreErrorScreenPayload$$serializer vaultStoreErrorScreenPayload$$serializer = new VaultStoreErrorScreenPayload$$serializer();
        INSTANCE = vaultStoreErrorScreenPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultStoreErrorScreenPayload", vaultStoreErrorScreenPayload$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("error_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("reload_button_title", true);
        pluginGeneratedSerialDescriptor.j("back_button_title", true);
        pluginGeneratedSerialDescriptor.j("title_color", true);
        pluginGeneratedSerialDescriptor.j("subtitle_color", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("back_arrow_tint", true);
        pluginGeneratedSerialDescriptor.j("back_arrow_background_color", true);
        pluginGeneratedSerialDescriptor.j("back_button_background_color", true);
        pluginGeneratedSerialDescriptor.j("back_button_text_color", true);
        pluginGeneratedSerialDescriptor.j("reload_button_background_color", true);
        pluginGeneratedSerialDescriptor.j("reload_button_text_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VaultStoreErrorScreenPayload$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final VaultStoreErrorScreenPayload deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str9 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str10 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str11 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    str12 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    str13 = b.k(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    str14 = b.k(serialDescriptor, 13);
                    i |= 8192;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new VaultStoreErrorScreenPayload(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VaultStoreErrorScreenPayload value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, "")) {
            b.o(serialDescriptor, 8, value.i);
        }
        if (b.F() || !jl40.l(value.j, "")) {
            b.o(serialDescriptor, 9, value.j);
        }
        if (b.F() || !jl40.l(value.k, "")) {
            b.o(serialDescriptor, 10, value.k);
        }
        if (b.F() || !jl40.l(value.l, "")) {
            b.o(serialDescriptor, 11, value.l);
        }
        if (b.F() || !jl40.l(value.m, "")) {
            b.o(serialDescriptor, 12, value.m);
        }
        if (b.F() || !jl40.l(value.n, "")) {
            b.o(serialDescriptor, 13, value.n);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
