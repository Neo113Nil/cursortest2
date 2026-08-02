package com.yandex.go.explorer.impl.data.models;

import defpackage.acj;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/explorer/impl/data/models/DiscoveredCellsResponse;", "", "Companion", "$serializer", "com/yandex/go/explorer/impl/data/models/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DiscoveredCellsResponse {
    public static final d Companion = new d();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new acj(7)), null};
    public final List a;
    public final long b;

    public /* synthetic */ DiscoveredCellsResponse(int i, long j, List list) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, DiscoveredCellsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredCellsResponse)) {
            return false;
        }
        DiscoveredCellsResponse discoveredCellsResponse = (DiscoveredCellsResponse) obj;
        return jl40.l(this.a, discoveredCellsResponse.a) && this.b == discoveredCellsResponse.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiscoveredCellsResponse(cells=" + this.a + ", syncTs=" + this.b + Extension.C_BRAKE;
    }
}
