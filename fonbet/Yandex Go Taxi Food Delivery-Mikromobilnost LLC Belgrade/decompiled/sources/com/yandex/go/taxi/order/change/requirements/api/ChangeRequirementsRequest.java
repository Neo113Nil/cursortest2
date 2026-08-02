package com.yandex.go.taxi.order.change.requirements.api;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/change/requirements/api/ChangeRequirementsRequest;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/change/requirements/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ChangeRequirementsRequest {
    public static final a Companion = new a();
    public final String a;
    public final kotlinx.serialization.json.b b;

    public /* synthetic */ ChangeRequirementsRequest(int i, String str, kotlinx.serialization.json.b bVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ChangeRequirementsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeRequirementsRequest)) {
            return false;
        }
        ChangeRequirementsRequest changeRequirementsRequest = (ChangeRequirementsRequest) obj;
        return jl40.l(this.a, changeRequirementsRequest.a) && jl40.l(this.b, changeRequirementsRequest.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kotlinx.serialization.json.b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "ChangeRequirementsRequest(orderId=" + this.a + ", requirementsPayload=" + this.b + Extension.C_BRAKE;
    }

    public ChangeRequirementsRequest(String str, kotlinx.serialization.json.b bVar) {
        this.a = str;
        this.b = bVar;
    }
}
