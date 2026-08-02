package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/TransportTypeItem;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TransportTypeItem {
    public static final y Companion = new y();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ TransportTypeItem(String str, int i, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportTypeItem)) {
            return false;
        }
        TransportTypeItem transportTypeItem = (TransportTypeItem) obj;
        return jl40.l(this.a, transportTypeItem.a) && this.b == transportTypeItem.b && jl40.l(this.c, transportTypeItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(oo31.l("TransportTypeItem(id=", this.a, ", isDefault=", ", title=", this.b), this.c, Extension.C_BRAKE);
    }

    public TransportTypeItem() {
        this.a = "";
        this.b = false;
        this.c = "";
    }
}
