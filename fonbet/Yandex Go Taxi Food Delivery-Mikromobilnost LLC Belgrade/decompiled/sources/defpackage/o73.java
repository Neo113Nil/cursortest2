package defpackage;

import com.yandex.go.order.state.instructions.InstructionItemButton;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class o73 implements x3w {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final InstructionItemButton f;
    public final ScheduledOrderItemAction g;
    public final int h = o3h0.ic_walk_24dp;

    public o73(String str, String str2, String str3, String str4, int i, InstructionItemButton instructionItemButton, ScheduledOrderItemAction scheduledOrderItemAction) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = instructionItemButton;
        this.g = scheduledOrderItemAction;
    }

    @Override // defpackage.x3w
    /* renamed from: a */
    public final InstructionItemButton getE() {
        return this.f;
    }

    @Override // defpackage.x3w
    /* renamed from: b */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.x3w
    public final int c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return jl40.l(this.a, o73Var.a) && jl40.l(this.b, o73Var.b) && jl40.l(this.c, o73Var.c) && jl40.l(this.d, o73Var.d) && this.e == o73Var.e && jl40.l(this.f, o73Var.f) && jl40.l(this.g, o73Var.g);
    }

    @Override // defpackage.x3w
    /* renamed from: getAction */
    public final ScheduledOrderItemAction getF() {
        return this.g;
    }

    @Override // defpackage.x3w
    /* renamed from: getSubtitle */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.x3w
    /* renamed from: getTitle */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = oyr.b(this.e, unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31);
        InstructionItemButton instructionItemButton = this.f;
        int hashCode2 = (b + (instructionItemButton == null ? 0 : instructionItemButton.hashCode())) * 31;
        ScheduledOrderItemAction scheduledOrderItemAction = this.g;
        return hashCode2 + (scheduledOrderItemAction != null ? scheduledOrderItemAction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ArrivalTimeInstructionItem(title=", this.a, ", subtitle=", this.b, ", iconImageTag=");
        g8e.D(v, this.c, ", originalTitle=", this.d, ", substituteDaytimeDeltaMins=");
        v.append(this.e);
        v.append(", button=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
