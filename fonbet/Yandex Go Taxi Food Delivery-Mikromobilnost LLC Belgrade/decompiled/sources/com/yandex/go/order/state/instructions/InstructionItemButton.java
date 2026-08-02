package com.yandex.go.order.state.instructions;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/state/instructions/InstructionItemButton;", "", "Companion", "$serializer", "com/yandex/go/order/state/instructions/a", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InstructionItemButton {
    public static final a Companion = new a();
    public final String a;
    public final InstructionItemButtonAction b;

    public InstructionItemButton(int i, String str, InstructionItemButtonAction instructionItemButtonAction) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) != 0) {
            this.b = instructionItemButtonAction;
        } else {
            InstructionItemButtonAction.Companion.getClass();
            this.b = InstructionItemButtonAction.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionItemButton)) {
            return false;
        }
        InstructionItemButton instructionItemButton = (InstructionItemButton) obj;
        return jl40.l(this.a, instructionItemButton.a) && jl40.l(this.b, instructionItemButton.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstructionItemButton(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public InstructionItemButton() {
        InstructionItemButtonAction.Companion.getClass();
        InstructionItemButtonAction instructionItemButtonAction = InstructionItemButtonAction.c;
        this.a = "";
        this.b = instructionItemButtonAction;
    }
}
