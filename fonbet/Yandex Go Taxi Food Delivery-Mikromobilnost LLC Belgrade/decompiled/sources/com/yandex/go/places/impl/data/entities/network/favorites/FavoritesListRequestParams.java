package com.yandex.go.places.impl.data.entities.network.favorites;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsStateRequestParam;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/favorites/FavoritesListRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/favorites/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesListRequestParams {
    public static final a Companion = new a();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final OrganizationsStateRequestParam d;

    public /* synthetic */ FavoritesListRequestParams(int i, String str, Integer num, Integer num2, OrganizationsStateRequestParam organizationsStateRequestParam) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = new OrganizationsStateRequestParam(null, null, null, null, null, null, 255);
        } else {
            this.d = organizationsStateRequestParam;
        }
    }

    public FavoritesListRequestParams() {
        this(15, null, null);
    }

    public FavoritesListRequestParams(int i, Integer num, Integer num2) {
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        OrganizationsStateRequestParam organizationsStateRequestParam = new OrganizationsStateRequestParam(null, null, null, null, null, null, 255);
        this.a = null;
        this.b = num;
        this.c = num2;
        this.d = organizationsStateRequestParam;
    }
}
