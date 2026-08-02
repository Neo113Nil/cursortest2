package com.yandex.plus.core.data.common;

import com.yandex.plus.core.data.common.PlusGradient;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.core.data.common.PlusGradient.Linear", eVar, 3);
        pluginGeneratedSerialDescriptor.j("colors", false);
        pluginGeneratedSerialDescriptor.j("positions", false);
        pluginGeneratedSerialDescriptor.j("angle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = PlusGradient.Linear.$childSerializers;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), e6m.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = PlusGradient.Linear.$childSerializers;
        b.getClass();
        int i = 0;
        List list = null;
        List list2 = null;
        double d = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                d = b.E(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new PlusGradient.Linear(i, list, list2, d, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        PlusGradient.Linear.write$Self$plus_core_common_release((PlusGradient.Linear) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
