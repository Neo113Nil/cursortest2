package com.yandex.passport.sloth.command.data;

import defpackage.auu0;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements uxs {
    public static final w0 a;
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.sloth.command.data.SetPopupSizeData", w0Var, 6);
        pluginGeneratedSerialDescriptor.j("mode", false);
        pluginGeneratedSerialDescriptor.j("corner_radius", false);
        pluginGeneratedSerialDescriptor.j("horizontal_margins", false);
        pluginGeneratedSerialDescriptor.j("vertical_margins", false);
        pluginGeneratedSerialDescriptor.j("height", false);
        pluginGeneratedSerialDescriptor.j("animate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        nor norVar = nor.a;
        return new KSerializer[]{n, qke.n(norVar), qke.n(norVar), qke.n(norVar), qke.n(norVar), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
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
                    f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                    i |= 2;
                    break;
                case 2:
                    f2 = (Float) b.s(serialDescriptor, 2, nor.a, f2);
                    i |= 4;
                    break;
                case 3:
                    f3 = (Float) b.s(serialDescriptor, 3, nor.a, f3);
                    i |= 8;
                    break;
                case 4:
                    f4 = (Float) b.s(serialDescriptor, 4, nor.a, f4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new y0(i, str, f, f2, f3, f4, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y0 y0Var = (y0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        auu0 auu0Var = auu0.a;
        String str = y0Var.a;
        boolean z = y0Var.f;
        b.g(serialDescriptor, 0, auu0Var, str);
        nor norVar = nor.a;
        b.g(serialDescriptor, 1, norVar, y0Var.b);
        b.g(serialDescriptor, 2, norVar, y0Var.c);
        b.g(serialDescriptor, 3, norVar, y0Var.d);
        b.g(serialDescriptor, 4, norVar, y0Var.e);
        if (b.F() || !z) {
            b.n(serialDescriptor, 5, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
