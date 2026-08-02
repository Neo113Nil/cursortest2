package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/subscription/data/model/ChargersSubscriptionStatusActionDto$PlusHome", "Lcom/yandex/go/chargers/subscription/data/model/t;", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersSubscriptionStatusActionDto$PlusHome extends t {
    public static final r Companion = new r();
    public final String a;

    public ChargersSubscriptionStatusActionDto$PlusHome(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersSubscriptionStatusActionDto$PlusHome) && jl40.l(this.a, ((ChargersSubscriptionStatusActionDto$PlusHome) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("PlusHome(plusHomeUrl=", this.a, Extension.C_BRAKE);
    }

    public ChargersSubscriptionStatusActionDto$PlusHome() {
        this.a = null;
    }
}
