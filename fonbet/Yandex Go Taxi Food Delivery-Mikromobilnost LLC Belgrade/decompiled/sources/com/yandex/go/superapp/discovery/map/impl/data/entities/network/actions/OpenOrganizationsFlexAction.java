package com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions;

import defpackage.gsq0;
import defpackage.kr;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/data/entities/network/actions/OpenOrganizationsFlexAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/superapp/discovery/map/impl/data/entities/network/actions/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OpenOrganizationsFlexAction extends kr {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ OpenOrganizationsFlexAction(int i, String str, String str2, String str3) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, OpenOrganizationsFlexAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }
}
