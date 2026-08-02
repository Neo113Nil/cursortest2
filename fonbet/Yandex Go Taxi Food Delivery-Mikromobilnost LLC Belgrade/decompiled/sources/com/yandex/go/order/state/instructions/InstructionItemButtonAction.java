package com.yandex.go.order.state.instructions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.smv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/state/instructions/InstructionItemButtonAction;", "", "Companion", "com/yandex/go/order/state/instructions/b", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InstructionItemButtonAction {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(27))};
    public static final InstructionItemButtonAction c = new InstructionItemButtonAction(0);
    public final InstructionItemButtonActionType a;

    public /* synthetic */ InstructionItemButtonAction(int i, InstructionItemButtonActionType instructionItemButtonActionType) {
        if ((i & 1) == 0) {
            this.a = InstructionItemButtonActionType.UNSUPPORTED;
        } else {
            this.a = instructionItemButtonActionType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstructionItemButtonAction) && this.a == ((InstructionItemButtonAction) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InstructionItemButtonAction(type=" + this.a + Extension.C_BRAKE;
    }

    public InstructionItemButtonAction() {
        this(0);
    }

    public InstructionItemButtonAction(int i) {
        this.a = InstructionItemButtonActionType.UNSUPPORTED;
    }
}
