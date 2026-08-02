package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainModalItem;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtTrainModalItem {
    public static final o Companion = new o();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ MtTrainModalItem(String str, int i, String str2, boolean z) {
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
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainModalItem)) {
            return false;
        }
        MtTrainModalItem mtTrainModalItem = (MtTrainModalItem) obj;
        return jl40.l(this.a, mtTrainModalItem.a) && jl40.l(this.b, mtTrainModalItem.b) && this.c == mtTrainModalItem.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("MtTrainModalItem(id=", this.a, ", title=", this.b, ", isDefault="), this.c, Extension.C_BRAKE);
    }

    public MtTrainModalItem() {
        this.a = "";
        this.b = "";
        this.c = false;
    }
}
