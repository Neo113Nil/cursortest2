package com.yandex.go.places.organization.card.impl.data.entities.network.search;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.uc4;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/search/LoadOrganizationCardsListRequest;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/search/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LoadOrganizationCardsListRequest {
    public static final a Companion = new a();
    public final uc4 a;
    public final String b;
    public final String c;

    public /* synthetic */ LoadOrganizationCardsListRequest(int i, uc4 uc4Var, String str, String str2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, LoadOrganizationCardsListRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = uc4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadOrganizationCardsListRequest)) {
            return false;
        }
        LoadOrganizationCardsListRequest loadOrganizationCardsListRequest = (LoadOrganizationCardsListRequest) obj;
        return jl40.l(this.a, loadOrganizationCardsListRequest.a) && jl40.l(this.b, loadOrganizationCardsListRequest.b) && jl40.l(this.c, loadOrganizationCardsListRequest.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadOrganizationCardsListRequest(bbox=");
        sb.append(this.a);
        sb.append(", oid=");
        sb.append(this.b);
        sb.append(", mode=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public LoadOrganizationCardsListRequest(uc4 uc4Var, String str, String str2) {
        this.a = uc4Var;
        this.b = str;
        this.c = str2;
    }
}
