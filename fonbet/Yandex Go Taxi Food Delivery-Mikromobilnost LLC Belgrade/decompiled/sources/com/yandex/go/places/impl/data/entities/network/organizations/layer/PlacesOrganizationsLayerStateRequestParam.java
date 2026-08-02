package com.yandex.go.places.impl.data.entities.network.organizations.layer;

import defpackage.gsq0;
import defpackage.uc4;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/layer/PlacesOrganizationsLayerStateRequestParam;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/layer/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesOrganizationsLayerStateRequestParam {
    public static final c Companion = new c();
    public final zzs a;
    public final uc4 b;
    public final Integer c;
    public final Boolean d;
    public final String e;
    public final String f;

    public /* synthetic */ PlacesOrganizationsLayerStateRequestParam(int i, zzs zzsVar, uc4 uc4Var, Integer num, Boolean bool, String str, String str2) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uc4Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public PlacesOrganizationsLayerStateRequestParam() {
        this(0);
    }

    public PlacesOrganizationsLayerStateRequestParam(zzs zzsVar, uc4 uc4Var, Integer num, Boolean bool, String str, String str2) {
        this.a = zzsVar;
        this.b = uc4Var;
        this.c = num;
        this.d = bool;
        this.e = str;
        this.f = str2;
    }

    public /* synthetic */ PlacesOrganizationsLayerStateRequestParam(int i) {
        this(zzs.f, null, null, null, null, null);
    }
}
