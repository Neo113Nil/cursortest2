package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/overdraft/data/model/TapAction$OpenSBPAction", "Lcom/yandex/go/overdraft/data/model/t0;", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapAction$OpenSBPAction extends t0 {
    public static final l0 Companion = new l0();
    public final String a;
    public final String b;

    public TapAction$OpenSBPAction(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.OPEN_SBP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapAction$OpenSBPAction)) {
            return false;
        }
        TapAction$OpenSBPAction tapAction$OpenSBPAction = (TapAction$OpenSBPAction) obj;
        return jl40.l(this.a, tapAction$OpenSBPAction.a) && jl40.l(this.b, tapAction$OpenSBPAction.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenSBPAction(serviceToken=", this.a, ", purchaseToken=", this.b, Extension.C_BRAKE);
    }

    public TapAction$OpenSBPAction() {
        this.a = "";
        this.b = "";
    }
}
