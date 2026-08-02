package com.yandex.go.superapp.searchbar.impl.experiments;

import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment.Searchbar.AnimatedText.$serializer", "Luxs;", "Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar$AnimatedText;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer implements uxs {
    public static final SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer superappSearchbarExperiment$Searchbar$AnimatedText$$serializer = new SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer();
        INSTANCE = superappSearchbarExperiment$Searchbar$AnimatedText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment.Searchbar.AnimatedText", superappSearchbarExperiment$Searchbar$AnimatedText$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("items", false);
        pluginGeneratedSerialDescriptor.j("keyframes", false);
        pluginGeneratedSerialDescriptor.j("accessibility_text_key", true);
        pluginGeneratedSerialDescriptor.j("hide_delay", true);
        pluginGeneratedSerialDescriptor.j("hide_animation_duration", true);
        pluginGeneratedSerialDescriptor.j("show_delay", true);
        pluginGeneratedSerialDescriptor.j("show_animation_duration", true);
        pluginGeneratedSerialDescriptor.j("timeout_animation_duration", true);
        pluginGeneratedSerialDescriptor.j("repeat_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SuperappSearchbarExperiment.Searchbar.AnimatedText.j;
        pnz pnzVar = pnz.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), qke.n(auu0.a), pnzVar, pnzVar, pnzVar, pnzVar, pnzVar, qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final SuperappSearchbarExperiment.Searchbar.AnimatedText deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperappSearchbarExperiment.Searchbar.AnimatedText.j;
        b.getClass();
        SuperappSearchbarExperiment.Searchbar.AnimatedText animatedText = null;
        int i = 0;
        Map map = null;
        List list = null;
        String str = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        boolean z = true;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    j = b.f(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = b.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j3 = b.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j4 = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j5 = b.f(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) b.s(serialDescriptor, 8, h6w.a, num);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return animatedText;
            }
            animatedText = null;
        }
        b.c(serialDescriptor);
        return new SuperappSearchbarExperiment.Searchbar.AnimatedText(i, map, list, str, j, j2, j3, j4, j5, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperappSearchbarExperiment.Searchbar.AnimatedText value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperappSearchbarExperiment.Searchbar.AnimatedText.j;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        Map map = value.a;
        Integer num = value.i;
        long j = value.h;
        long j2 = value.g;
        long j3 = value.f;
        long j4 = value.e;
        long j5 = value.d;
        String str = value.c;
        b.e(serialDescriptor, 0, kSerializer, map);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        if (b.F() || j5 != 1500) {
            b.s(serialDescriptor, 3, j5);
        }
        if (b.F() || j4 != 400) {
            b.s(serialDescriptor, 4, j4);
        }
        if (b.F() || j3 != 200) {
            b.s(serialDescriptor, 5, j3);
        }
        if (b.F() || j2 != 400) {
            b.s(serialDescriptor, 6, j2);
        }
        if (b.F() || j != 1500) {
            b.s(serialDescriptor, 7, j);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 8, h6w.a, num);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
