package com.yandex.go.zone.dto.objects;

import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.InstructionItemButton$$serializer;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction$$serializer;
import defpackage.auu0;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x3w;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ScheduledOrderDescriptionItem;", "Lx3w;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/q3", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScheduledOrderDescriptionItem implements x3w {
    public static final q3 Companion = new q3();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final InstructionItemButton e;
    public final ScheduledOrderItemAction f;
    public final int g;

    public /* synthetic */ ScheduledOrderDescriptionItem(int i, String str, String str2, String str3, boolean z, InstructionItemButton instructionItemButton, ScheduledOrderItemAction scheduledOrderItemAction, int i2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = instructionItemButton;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = scheduledOrderItemAction;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
    }

    public static final void d(ScheduledOrderDescriptionItem scheduledOrderDescriptionItem, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(scheduledOrderDescriptionItem.a, "")) {
            yjdVar.o(serialDescriptor, 0, scheduledOrderDescriptionItem.a);
        }
        if (yjdVar.F() || scheduledOrderDescriptionItem.b != null) {
            yjdVar.g(serialDescriptor, 1, auu0.a, scheduledOrderDescriptionItem.b);
        }
        if (yjdVar.F() || !jl40.l(scheduledOrderDescriptionItem.c, "")) {
            yjdVar.o(serialDescriptor, 2, scheduledOrderDescriptionItem.c);
        }
        if (yjdVar.F() || scheduledOrderDescriptionItem.d) {
            yjdVar.n(serialDescriptor, 3, scheduledOrderDescriptionItem.d);
        }
        if (yjdVar.F() || scheduledOrderDescriptionItem.e != null) {
            yjdVar.g(serialDescriptor, 4, InstructionItemButton$$serializer.INSTANCE, scheduledOrderDescriptionItem.e);
        }
        if (yjdVar.F() || scheduledOrderDescriptionItem.f != null) {
            yjdVar.g(serialDescriptor, 5, ScheduledOrderItemAction$$serializer.INSTANCE, scheduledOrderDescriptionItem.f);
        }
        if (!yjdVar.F() && scheduledOrderDescriptionItem.g == 0) {
            return;
        }
        yjdVar.A(6, scheduledOrderDescriptionItem.g, serialDescriptor);
    }

    @Override // defpackage.x3w
    /* renamed from: a, reason: from getter */
    public final InstructionItemButton getE() {
        return this.e;
    }

    @Override // defpackage.x3w
    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduledOrderDescriptionItem)) {
            return false;
        }
        ScheduledOrderDescriptionItem scheduledOrderDescriptionItem = (ScheduledOrderDescriptionItem) obj;
        return jl40.l(this.a, scheduledOrderDescriptionItem.a) && jl40.l(this.b, scheduledOrderDescriptionItem.b) && jl40.l(this.c, scheduledOrderDescriptionItem.c) && this.d == scheduledOrderDescriptionItem.d && jl40.l(this.e, scheduledOrderDescriptionItem.e) && jl40.l(this.f, scheduledOrderDescriptionItem.f) && this.g == scheduledOrderDescriptionItem.g;
    }

    @Override // defpackage.x3w
    /* renamed from: getAction, reason: from getter */
    public final ScheduledOrderItemAction getF() {
        return this.f;
    }

    @Override // defpackage.x3w
    /* renamed from: getSubtitle, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.x3w
    /* renamed from: getTitle, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        InstructionItemButton instructionItemButton = this.e;
        int hashCode2 = (e + (instructionItemButton == null ? 0 : instructionItemButton.hashCode())) * 31;
        ScheduledOrderItemAction scheduledOrderItemAction = this.f;
        return Integer.hashCode(this.g) + ((hashCode2 + (scheduledOrderItemAction != null ? scheduledOrderItemAction.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScheduledOrderDescriptionItem(title=", this.a, ", subtitle=", this.b, ", iconImageTag=");
        tse0.y(this.c, ", substituteDayTime=", ", button=", v, this.d);
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", substituteDaytimeDeltaMins=");
        return oyr.m(this.g, Extension.C_BRAKE, v);
    }

    public ScheduledOrderDescriptionItem() {
        this(null, null, null, null, HProv.PP_VERSION_TIMESTAMP);
    }

    public ScheduledOrderDescriptionItem(String str, String str2, String str3, ScheduledOrderItemAction scheduledOrderItemAction, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        scheduledOrderItemAction = (i & 32) != 0 ? null : scheduledOrderItemAction;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = false;
        this.e = null;
        this.f = scheduledOrderItemAction;
        this.g = 0;
    }
}
