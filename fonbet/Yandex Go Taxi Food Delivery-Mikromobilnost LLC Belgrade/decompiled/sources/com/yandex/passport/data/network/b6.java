package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class b6 implements uxs {
    public static final b6 a;
    private static final SerialDescriptor descriptor;

    static {
        b6 b6Var = new b6();
        a = b6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetConfigRequest.Result", b6Var, 10);
        pluginGeneratedSerialDescriptor.j("backends", true);
        pluginGeneratedSerialDescriptor.j("am_config", true);
        pluginGeneratedSerialDescriptor.j("android_white_list_regex", true);
        pluginGeneratedSerialDescriptor.j("default_locations", true);
        pluginGeneratedSerialDescriptor.j("url_templates", true);
        pluginGeneratedSerialDescriptor.j("android_ebs_config", true);
        pluginGeneratedSerialDescriptor.j("android_block_vpn", true);
        pluginGeneratedSerialDescriptor.j("android_vpn_manual_mode", true);
        pluginGeneratedSerialDescriptor.j("android_autologin_app_parameters", true);
        pluginGeneratedSerialDescriptor.j("android_autologin_client_id_parameters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = d6.k;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], qke.n(auu0.a), kSerializerArr[3], qke.n(h6.a), qke.n(s5.a), kSerializerArr[6], kSerializerArr[7], kSerializerArr[8], kSerializerArr[9]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr2 = d6.k;
        b.getClass();
        List list = null;
        List list2 = null;
        boolean z = true;
        Set set = null;
        int i = 0;
        List list3 = null;
        List list4 = null;
        String str = null;
        List list5 = null;
        j6 j6Var = null;
        u5 u5Var = null;
        List list6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    list3 = (List) b.A(serialDescriptor, 0, kSerializerArr[0], list3);
                    i |= 1;
                    break;
                case 1:
                    kSerializerArr = kSerializerArr2;
                    list4 = (List) b.A(serialDescriptor, 1, kSerializerArr[1], list4);
                    i |= 2;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr2;
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr2;
                    list5 = (List) b.A(serialDescriptor, 3, kSerializerArr[3], list5);
                    i |= 8;
                    break;
                case 4:
                    kSerializerArr = kSerializerArr2;
                    j6Var = (j6) b.s(serialDescriptor, 4, h6.a, j6Var);
                    i |= 16;
                    break;
                case 5:
                    kSerializerArr = kSerializerArr2;
                    u5Var = (u5) b.s(serialDescriptor, 5, s5.a, u5Var);
                    i |= 32;
                    break;
                case 6:
                    kSerializerArr = kSerializerArr2;
                    list6 = (List) b.A(serialDescriptor, 6, kSerializerArr[6], list6);
                    i |= 64;
                    break;
                case 7:
                    kSerializerArr = kSerializerArr2;
                    set = (Set) b.A(serialDescriptor, 7, kSerializerArr[7], set);
                    i |= 128;
                    break;
                case 8:
                    kSerializerArr = kSerializerArr2;
                    list2 = (List) b.A(serialDescriptor, 8, kSerializerArr[8], list2);
                    i |= 256;
                    break;
                case 9:
                    kSerializerArr = kSerializerArr2;
                    list = (List) b.A(serialDescriptor, 9, kSerializerArr2[9], list);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            kSerializerArr2 = kSerializerArr;
        }
        b.c(serialDescriptor);
        return new d6(i, list3, list4, str, list5, j6Var, u5Var, list6, set, list2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d6 d6Var = (d6) obj;
        List list = d6Var.j;
        List list2 = d6Var.i;
        Set set = d6Var.h;
        List list3 = d6Var.g;
        u5 u5Var = d6Var.f;
        j6 j6Var = d6Var.e;
        List list4 = d6Var.d;
        String str = d6Var.c;
        List list5 = d6Var.b;
        List list6 = d6Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = d6.k;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(list6, emptyList)) {
            b.e(serialDescriptor, 0, kSerializerArr[0], list6);
        }
        if (b.F() || !jl40.l(list5, emptyList)) {
            b.e(serialDescriptor, 1, kSerializerArr[1], list5);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        if (b.F() || !jl40.l(list4, emptyList)) {
            b.e(serialDescriptor, 3, kSerializerArr[3], list4);
        }
        if (b.F() || j6Var != null) {
            b.g(serialDescriptor, 4, h6.a, j6Var);
        }
        if (b.F() || u5Var != null) {
            b.g(serialDescriptor, 5, s5.a, u5Var);
        }
        if (b.F() || !jl40.l(list3, emptyList)) {
            b.e(serialDescriptor, 6, kSerializerArr[6], list3);
        }
        if (b.F() || !jl40.l(set, EmptySet.a)) {
            b.e(serialDescriptor, 7, kSerializerArr[7], set);
        }
        if (b.F() || !jl40.l(list2, emptyList)) {
            b.e(serialDescriptor, 8, kSerializerArr[8], list2);
        }
        if (b.F() || !jl40.l(list, emptyList)) {
            b.e(serialDescriptor, 9, kSerializerArr[9], list);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
