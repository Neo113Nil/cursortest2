package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsRequestParams {
    public static final t Companion = new t();
    public final int a;
    public final OrganizationsStateRequestParam b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ OrganizationsRequestParams(int i, int i2, OrganizationsStateRequestParam organizationsStateRequestParam, String str, String str2, String str3, String str4) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = new OrganizationsStateRequestParam(null, null, null, null, null, null, 255);
        } else {
            this.b = organizationsStateRequestParam;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public OrganizationsRequestParams(int i, OrganizationsStateRequestParam organizationsStateRequestParam, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = organizationsStateRequestParam;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public OrganizationsRequestParams() {
        this(0, new OrganizationsStateRequestParam(null, null, null, null, null, null, 255), null, null, null, null);
    }
}
