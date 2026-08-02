package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentUi;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentUi {
    public static final h Companion = new h();
    public final AcceptancePaymentNotification a;
    public final AcceptancePaymentFullscreen b;

    public /* synthetic */ AcceptancePaymentUi(int i, AcceptancePaymentNotification acceptancePaymentNotification, AcceptancePaymentFullscreen acceptancePaymentFullscreen) {
        this.a = (i & 1) == 0 ? new AcceptancePaymentNotification(0) : acceptancePaymentNotification;
        if ((i & 2) == 0) {
            this.b = new AcceptancePaymentFullscreen(0);
        } else {
            this.b = acceptancePaymentFullscreen;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptancePaymentUi)) {
            return false;
        }
        AcceptancePaymentUi acceptancePaymentUi = (AcceptancePaymentUi) obj;
        return jl40.l(this.a, acceptancePaymentUi.a) && jl40.l(this.b, acceptancePaymentUi.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AcceptancePaymentUi(notification=" + this.a + ", fullscreen=" + this.b + Extension.C_BRAKE;
    }

    public AcceptancePaymentUi() {
        this(0);
    }

    public AcceptancePaymentUi(int i) {
        AcceptancePaymentNotification acceptancePaymentNotification = new AcceptancePaymentNotification(0);
        AcceptancePaymentFullscreen acceptancePaymentFullscreen = new AcceptancePaymentFullscreen(0);
        this.a = acceptancePaymentNotification;
        this.b = acceptancePaymentFullscreen;
    }
}
