package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentActionButton;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentActionButton {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;
    public final AcceptancePaymentButtonAction c;

    public /* synthetic */ AcceptancePaymentActionButton(int i, String str, boolean z, AcceptancePaymentButtonAction acceptancePaymentButtonAction) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = acceptancePaymentButtonAction;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptancePaymentActionButton)) {
            return false;
        }
        AcceptancePaymentActionButton acceptancePaymentActionButton = (AcceptancePaymentActionButton) obj;
        return jl40.l(this.a, acceptancePaymentActionButton.a) && this.b == acceptancePaymentActionButton.b && jl40.l(this.c, acceptancePaymentActionButton.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        AcceptancePaymentButtonAction acceptancePaymentButtonAction = this.c;
        return e + (acceptancePaymentButtonAction == null ? 0 : acceptancePaymentButtonAction.a.hashCode());
    }

    public final String toString() {
        StringBuilder l = oo31.l("AcceptancePaymentActionButton(title=", this.a, ", isMainButton=", ", action=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public AcceptancePaymentActionButton() {
        this.a = "";
        this.b = false;
        this.c = null;
    }
}
