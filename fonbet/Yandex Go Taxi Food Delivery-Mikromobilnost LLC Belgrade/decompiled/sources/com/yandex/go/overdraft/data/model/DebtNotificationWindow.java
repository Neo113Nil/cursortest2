package com.yandex.go.overdraft.data.model;

import com.yandex.go.overdraft.data.model.DebtNotificationWindow;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.sls;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtNotificationWindow;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtNotificationWindow {
    public static final q Companion = new q();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ief e;
    public final DebtNotificationButton f;
    public final Double g;
    public final String h;
    public final String i;

    public DebtNotificationWindow(int i, String str, String str2, String str3, String str4, ief iefVar, DebtNotificationButton debtNotificationButton, Double d, String str5, String str6) {
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = ief.e;
        } else {
            this.e = iefVar;
        }
        if ((i & 32) == 0) {
            DebtNotificationButton.Companion.getClass();
            this.f = DebtNotificationButton.d;
        } else {
            this.f = debtNotificationButton;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str6;
        }
        final int i2 = 0;
        kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: bug
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                DebtNotificationWindow debtNotificationWindow = this;
                switch (i3) {
                }
                return gwk0.h(debtNotificationWindow.e);
            }
        });
    }

    /* renamed from: a, reason: from getter */
    public final Double getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtNotificationWindow)) {
            return false;
        }
        DebtNotificationWindow debtNotificationWindow = (DebtNotificationWindow) obj;
        return jl40.l(this.a, debtNotificationWindow.a) && jl40.l(this.b, debtNotificationWindow.b) && jl40.l(this.c, debtNotificationWindow.c) && jl40.l(this.d, debtNotificationWindow.d) && jl40.l(this.e, debtNotificationWindow.e) && jl40.l(this.f, debtNotificationWindow.f) && jl40.l(this.g, debtNotificationWindow.g) && jl40.l(this.h, debtNotificationWindow.h) && jl40.l(this.i, debtNotificationWindow.i);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31)) * 31;
        Double d = this.g;
        return this.i.hashCode() + unr0.b((hashCode + (d != null ? d.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebtNotificationWindow(title=", this.a, ", text=", this.b, ", iconTag=");
        g8e.D(v, this.c, ", changePaymentText=", this.d, ", currencyRulesDto=");
        v.append(this.e);
        v.append(", mainButton=");
        v.append(this.f);
        v.append(", debtAmount=");
        v.append(this.g);
        v.append(", paymentType=");
        v.append(this.h);
        v.append(", paymentMethodId=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }

    public DebtNotificationWindow() {
        DebtNotificationButton.Companion.getClass();
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = "";
        this.e = ief.e;
        this.f = DebtNotificationButton.d;
        this.g = null;
        this.h = "";
        this.i = "";
        final int i = 1;
        kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: bug
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                DebtNotificationWindow debtNotificationWindow = this;
                switch (i3) {
                }
                return gwk0.h(debtNotificationWindow.e);
            }
        });
    }
}
