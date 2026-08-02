package com.yandex.go.taxi.order.models.api.preorder.requirements;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/requirements/RequirementAddressInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/requirements/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RequirementAddressInfo {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ RequirementAddressInfo(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequirementAddressInfo)) {
            return false;
        }
        RequirementAddressInfo requirementAddressInfo = (RequirementAddressInfo) obj;
        return jl40.l(this.a, requirementAddressInfo.a) && jl40.l(this.b, requirementAddressInfo.b) && jl40.l(this.c, requirementAddressInfo.c) && jl40.l(this.d, requirementAddressInfo.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("RequirementAddressInfo(porch=", this.a, ", floor=", this.b, ", apartment="), this.c, ", doorPhone=", this.d, Extension.C_BRAKE);
    }

    public RequirementAddressInfo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public RequirementAddressInfo() {
        this(null, null, null, null);
    }
}
