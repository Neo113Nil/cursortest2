package com.yandex.go.zone.dto.objects;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.multitariff.SelectionRules$$serializer;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/ZoneVerticalMulticlass.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlass;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlass;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/ZoneVerticalMulticlass;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ZoneVerticalMulticlass$$serializer implements uxs {
    public static final ZoneVerticalMulticlass$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ZoneVerticalMulticlass$$serializer zoneVerticalMulticlass$$serializer = new ZoneVerticalMulticlass$$serializer();
        INSTANCE = zoneVerticalMulticlass$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.ZoneVerticalMulticlass", zoneVerticalMulticlass$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("selector_icon", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("selection_rules", true);
        pluginGeneratedSerialDescriptor.j("can_be_default", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("should_deactivate_inappropriate_tariffs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ZoneVerticalMulticlass$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ZoneVerticalMulticlass.j;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(h6w.a), i3yVarArr[1].getValue(), qke.n(c7v.a), auu0Var, ZoneVerticalMulticlassDetails$$serializer.INSTANCE, SelectionRules$$serializer.INSTANCE, z96Var, qke.n(auu0Var), z96Var};
    }

    @Override // defpackage.myi
    public final ZoneVerticalMulticlass deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneVerticalMulticlass.j;
        b.getClass();
        ZoneVerticalMulticlass zoneVerticalMulticlass = null;
        boolean z = true;
        String str = null;
        Integer num = null;
        List list = null;
        n7v n7vVar = null;
        String str2 = null;
        ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = null;
        SelectionRules selectionRules = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zoneVerticalMulticlassDetails = (ZoneVerticalMulticlassDetails) b.A(serialDescriptor, 4, ZoneVerticalMulticlassDetails$$serializer.INSTANCE, zoneVerticalMulticlassDetails);
                    i |= 16;
                    break;
                case 5:
                    selectionRules = (SelectionRules) b.A(serialDescriptor, 5, SelectionRules$$serializer.INSTANCE, selectionRules);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    z3 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return zoneVerticalMulticlass;
            }
            zoneVerticalMulticlass = null;
        }
        b.c(serialDescriptor);
        return new ZoneVerticalMulticlass(i, num, list, n7vVar, str2, zoneVerticalMulticlassDetails, selectionRules, z2, str, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.ZoneVerticalMulticlassDetails.d) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ZoneVerticalMulticlass value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ZoneVerticalMulticlass.j;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, h6w.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, c7v.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (!b.F()) {
            ZoneVerticalMulticlassDetails zoneVerticalMulticlassDetails = value.e;
            ZoneVerticalMulticlassDetails.Companion.getClass();
        }
        b.e(serialDescriptor, 4, ZoneVerticalMulticlassDetails$$serializer.INSTANCE, value.e);
        if (b.F() || !jl40.l(value.f, SelectionRules.b)) {
            b.e(serialDescriptor, 5, SelectionRules$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
