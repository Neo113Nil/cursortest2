package com.yandex.go.places.organization.card.impl.data.entities.network.card.flex;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationCardStateRequestParam;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/flex/OrganizationCardFlexRequestParams;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/flex/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardFlexRequestParams {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final OrganizationCardStateRequestParam d;
    public final String e;
    public final String f;
    public final boolean g;

    public /* synthetic */ OrganizationCardFlexRequestParams(int i, String str, String str2, String str3, OrganizationCardStateRequestParam organizationCardStateRequestParam, String str4, String str5, boolean z) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = organizationCardStateRequestParam;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
    }

    public OrganizationCardFlexRequestParams(String str, String str2, String str3, OrganizationCardStateRequestParam organizationCardStateRequestParam, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = organizationCardStateRequestParam;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public OrganizationCardFlexRequestParams() {
        this(null, null, null, null, null, null, true);
    }
}
