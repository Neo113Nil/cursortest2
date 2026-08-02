package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewTagDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationPreviewTagDto {
    public static final q Companion = new q();
    public final String a;
    public final String b;
    public final String c;
    public final ImageDto d;
    public final String e;
    public final String f;

    public /* synthetic */ OrganizationPreviewTagDto(int i, String str, String str2, String str3, ImageDto imageDto, String str4, String str5) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = imageDto;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
    }

    public OrganizationPreviewTagDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = "";
        this.f = "";
    }
}
