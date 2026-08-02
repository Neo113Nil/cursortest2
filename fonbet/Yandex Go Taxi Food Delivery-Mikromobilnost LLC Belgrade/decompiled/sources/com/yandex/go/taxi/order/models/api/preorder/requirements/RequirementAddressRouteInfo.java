package com.yandex.go.taxi.order.models.api.preorder.requirements;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/requirements/RequirementAddressRouteInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/requirements/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RequirementAddressRouteInfo {
    public static final b Companion = new b();
    public final RequirementAddressInfo a;
    public final RequirementAddressInfo b;
    public final String c;

    public /* synthetic */ RequirementAddressRouteInfo(int i, RequirementAddressInfo requirementAddressInfo, RequirementAddressInfo requirementAddressInfo2, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = requirementAddressInfo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = requirementAddressInfo2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequirementAddressRouteInfo)) {
            return false;
        }
        RequirementAddressRouteInfo requirementAddressRouteInfo = (RequirementAddressRouteInfo) obj;
        return jl40.l(this.a, requirementAddressRouteInfo.a) && jl40.l(this.b, requirementAddressRouteInfo.b) && jl40.l(this.c, requirementAddressRouteInfo.c);
    }

    public final int hashCode() {
        RequirementAddressInfo requirementAddressInfo = this.a;
        int hashCode = (requirementAddressInfo == null ? 0 : requirementAddressInfo.hashCode()) * 31;
        RequirementAddressInfo requirementAddressInfo2 = this.b;
        int hashCode2 = (hashCode + (requirementAddressInfo2 == null ? 0 : requirementAddressInfo2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequirementAddressRouteInfo(sourceAddressInfo=");
        sb.append(this.a);
        sb.append(", destinationAddressInfo=");
        sb.append(this.b);
        sb.append(", contactPhone=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public RequirementAddressRouteInfo(RequirementAddressInfo requirementAddressInfo, RequirementAddressInfo requirementAddressInfo2, String str) {
        this.a = requirementAddressInfo;
        this.b = requirementAddressInfo2;
        this.c = str;
    }

    public RequirementAddressRouteInfo() {
        this(null, null, null);
    }
}
