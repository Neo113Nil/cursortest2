package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.ztg;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtNotificationButton;", "", "Companion", "com/yandex/go/overdraft/data/model/p", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtNotificationButton {
    public static final p Companion = new p();
    public static final DebtNotificationButton d = new DebtNotificationButton(0);
    public final String a;
    public final String b;
    public final ztg c;

    public /* synthetic */ DebtNotificationButton(int i, String str, String str2, ztg ztgVar) {
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
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = ztgVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtNotificationButton)) {
            return false;
        }
        DebtNotificationButton debtNotificationButton = (DebtNotificationButton) obj;
        return jl40.l(this.a, debtNotificationButton.a) && jl40.l(this.b, debtNotificationButton.b) && jl40.l(this.c, debtNotificationButton.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ztg ztgVar = this.c;
        return b + (ztgVar == null ? 0 : ztgVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("DebtNotificationButton(text=", this.a, ", color=", this.b, ", action=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public DebtNotificationButton(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public DebtNotificationButton() {
        this(0);
    }
}
