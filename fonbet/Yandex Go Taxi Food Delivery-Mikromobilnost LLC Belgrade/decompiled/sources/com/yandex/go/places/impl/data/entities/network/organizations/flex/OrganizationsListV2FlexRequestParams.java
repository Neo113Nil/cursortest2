package com.yandex.go.places.impl.data.entities.network.organizations.flex;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsStateRequestParam;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/flex/OrganizationsListV2FlexRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/flex/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsListV2FlexRequestParams {
    public static final a Companion = new a();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final OrganizationsStateRequestParam e;
    public final String f;

    public /* synthetic */ OrganizationsListV2FlexRequestParams(int i, int i2, OrganizationsStateRequestParam organizationsStateRequestParam, String str, String str2, String str3, String str4) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = organizationsStateRequestParam;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public OrganizationsListV2FlexRequestParams() {
        this(null, null, null, null, 63);
    }

    public OrganizationsListV2FlexRequestParams(String str, String str2, String str3, OrganizationsStateRequestParam organizationsStateRequestParam, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        organizationsStateRequestParam = (i & 16) != 0 ? null : organizationsStateRequestParam;
        this.a = 0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = organizationsStateRequestParam;
        this.f = null;
    }
}
