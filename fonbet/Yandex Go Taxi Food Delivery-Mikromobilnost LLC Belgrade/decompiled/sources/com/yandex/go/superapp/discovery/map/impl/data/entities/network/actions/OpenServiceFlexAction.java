package com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/data/entities/network/actions/OpenServiceFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/data/entities/network/actions/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenServiceFlexAction extends kr {
    public static final b Companion = new b();
    public final String a;

    public /* synthetic */ OpenServiceFlexAction(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, OpenServiceFlexAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
