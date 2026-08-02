package com.yandex.go.taxi.order.details.v2.state.elements.companion_buffer_search.animation;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CompanionBufferSearch;
import defpackage.jl40;
import defpackage.rol0;
import defpackage.ytz;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes14.dex */
public final class a {
    public final ytz a;
    public final LinkedHashSet b = new LinkedHashSet();

    public a(ytz ytzVar) {
        this.a = ytzVar;
    }

    public final rol0 a(String str, Boolean bool, List list) {
        int i = 0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (jl40.l(((RideCardItemDto$CompanionBufferSearch.CompanionSearchState) it.next()).a, str)) {
                break;
            }
            i++;
        }
        return new rol0(new RideCardBufferSearchAnimationItemDataSource$getFlow$1(str, this, booleanValue, i, list, null));
    }
}
