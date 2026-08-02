package com.yandex.go.promocodes.referral.api.net.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/api/net/dto/DescriptionItem;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/api/net/dto/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DescriptionItem {
    public static final a Companion = new a();
    public final String a;
    public final String b;

    public /* synthetic */ DescriptionItem(int i, String str, String str2) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionItem)) {
            return false;
        }
        DescriptionItem descriptionItem = (DescriptionItem) obj;
        return jl40.l(this.a, descriptionItem.a) && jl40.l(this.b, descriptionItem.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DescriptionItem(title=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }

    public DescriptionItem() {
        this.a = "";
        this.b = "";
    }
}
