package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class gv4 implements uxs {
    public static final gv4 a;
    private static final SerialDescriptor descriptor;

    static {
        gv4 gv4Var = new gv4();
        a = gv4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.barcode.BarcodeCustomProps", gv4Var, 4);
        pluginGeneratedSerialDescriptor.j("format", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.CORNER_RADIUS, true);
        pluginGeneratedSerialDescriptor.j("padding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, auu0Var, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new iv4(str, i, str2, i2, i3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iv4 iv4Var = (iv4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = iv4Var.a;
        int i = iv4Var.d;
        int i2 = iv4Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, iv4Var.b);
        if (b.F() || i2 != 0) {
            b.A(2, i2, serialDescriptor);
        }
        if (b.F() || i != 0) {
            b.A(3, i, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
