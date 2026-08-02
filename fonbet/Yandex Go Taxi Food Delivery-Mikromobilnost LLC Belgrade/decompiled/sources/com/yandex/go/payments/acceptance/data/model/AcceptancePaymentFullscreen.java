package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.pd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentFullscreen;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentFullscreen {
    public static final d Companion = new d();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(2))};
    public final String a;
    public final List b;

    public /* synthetic */ AcceptancePaymentFullscreen(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptancePaymentFullscreen)) {
            return false;
        }
        AcceptancePaymentFullscreen acceptancePaymentFullscreen = (AcceptancePaymentFullscreen) obj;
        return jl40.l(this.a, acceptancePaymentFullscreen.a) && jl40.l(this.b, acceptancePaymentFullscreen.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("AcceptancePaymentFullscreen(text=", this.a, ", actionButtons=", Extension.C_BRAKE, this.b);
    }

    public AcceptancePaymentFullscreen(int i) {
        this.a = "";
        this.b = EmptyList.a;
    }

    public AcceptancePaymentFullscreen() {
        this(0);
    }
}
