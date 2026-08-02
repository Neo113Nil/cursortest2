package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.yi80;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewCardButtonDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationPreviewCardButtonDto {
    public static final j Companion = new j();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final OrganizationPreviewCardButtonTypeDto e;
    public final String f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new yi80(7)), null, kotlin.a.b(lazyThreadSafetyMode, new yi80(8))};
    }

    public /* synthetic */ OrganizationPreviewCardButtonDto(int i, String str, String str2, String str3, boolean z, OrganizationPreviewCardButtonTypeDto organizationPreviewCardButtonTypeDto, String str4, List list) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = organizationPreviewCardButtonTypeDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    public OrganizationPreviewCardButtonDto() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = true;
        this.e = null;
        this.f = null;
        this.g = EmptyList.a;
    }
}
