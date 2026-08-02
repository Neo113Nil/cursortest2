package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/dto/response/SectionTypedHeader.Lead.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/dto/response/SectionTypedHeader$Lead;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SectionTypedHeader$Lead$$serializer implements uxs {
    public static final SectionTypedHeader$Lead$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SectionTypedHeader$Lead$$serializer sectionTypedHeader$Lead$$serializer = new SectionTypedHeader$Lead$$serializer();
        INSTANCE = sectionTypedHeader$Lead$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.dto.response.SectionTypedHeader.Lead", sectionTypedHeader$Lead$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("appearance_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SectionTypedHeader$Lead$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = SectionTypedHeader.Lead.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), SectionTypedHeader$SectionTitle$$serializer.INSTANCE, auu0.a, i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final SectionTypedHeader.Lead deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = SectionTypedHeader.Lead.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        SectionTypedHeader.Lead.LeadType leadType = null;
        SectionTypedHeader.SectionTitle sectionTitle = null;
        String str = null;
        SectionTypedHeader.Lead.AppearanceType appearanceType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                leadType = (SectionTypedHeader.Lead.LeadType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), leadType);
                i |= 1;
            } else if (v == 1) {
                sectionTitle = (SectionTypedHeader.SectionTitle) b.A(serialDescriptor, 1, SectionTypedHeader$SectionTitle$$serializer.INSTANCE, sectionTitle);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                appearanceType = (SectionTypedHeader.Lead.AppearanceType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), appearanceType);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SectionTypedHeader.Lead(i, leadType, sectionTitle, str, appearanceType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SectionTypedHeader.Lead value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        SectionTypedHeader.Lead.b(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
