package com.yandex.go.vault.flexsdk.descriptors.widget;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.t8s0;
import defpackage.uxs;
import defpackage.w8s0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/vault/flexsdk/descriptors/widget/Vault.$serializer", "Luxs;", "Lcom/yandex/go/vault/flexsdk/descriptors/widget/Vault;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/vault/flexsdk/descriptors/widget/Vault;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/vault/flexsdk/descriptors/widget/Vault;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class Vault$$serializer implements uxs {
    public static final Vault$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Vault$$serializer vault$$serializer = new Vault$$serializer();
        INSTANCE = vault$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.vault.flexsdk.descriptors.widget.Vault", vault$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("rarity", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("title_color", false);
        pluginGeneratedSerialDescriptor.j("image_tag", false);
        pluginGeneratedSerialDescriptor.j("open_animation", false);
        pluginGeneratedSerialDescriptor.j("background_top_gradient_color", true);
        pluginGeneratedSerialDescriptor.j("key_amount_to_open", false);
        pluginGeneratedSerialDescriptor.j("open_prize_list_action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Vault$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{Vault.i[0].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, h6w.a, t8s0.a};
    }

    @Override // defpackage.myi
    public final Vault deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Vault.i;
        b.getClass();
        Vault vault = null;
        boolean z = true;
        w8s0 w8s0Var = null;
        VaultRarity vaultRarity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    vaultRarity = (VaultRarity) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), vaultRarity);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i2 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    w8s0Var = (w8s0) b.A(serialDescriptor, 7, t8s0.a, w8s0Var);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return vault;
            }
            vault = null;
        }
        b.c(serialDescriptor);
        return new Vault(i, vaultRarity, str, str2, str3, str4, str5, i2, w8s0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Vault value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) Vault.i[0].getValue();
        VaultRarity vaultRarity = value.a;
        String str = value.f;
        b.e(serialDescriptor, 0, kSerializer, vaultRarity);
        b.o(serialDescriptor, 1, value.b);
        b.o(serialDescriptor, 2, value.c);
        b.o(serialDescriptor, 3, value.d);
        b.o(serialDescriptor, 4, value.e);
        if (b.F() || !jl40.l(str, "")) {
            b.o(serialDescriptor, 5, str);
        }
        b.A(6, value.g, serialDescriptor);
        b.e(serialDescriptor, 7, t8s0.a, value.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
