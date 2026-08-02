package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.BrowserInfoAttributesDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.yi80;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/OrganizationItemV2Dto$OrganizationPreviewItemV2Dto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/i;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationItemV2Dto$OrganizationPreviewItemV2Dto extends i {
    public static final g Companion = new g();
    public static final i3y[] k;
    public final String a;
    public final List b;
    public final String c;
    public final CompressionResistantAttributedTextContainerDto d;
    public final ImageDto e;
    public final List f;
    public final OrganizationPreviewRatingDto g;
    public final List h;
    public final List i;
    public final BrowserInfoAttributesDto j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new yi80(2)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new yi80(3)), null, kotlin.a.b(lazyThreadSafetyMode, new yi80(4)), kotlin.a.b(lazyThreadSafetyMode, new yi80(5)), null};
    }

    public OrganizationItemV2Dto$OrganizationPreviewItemV2Dto(int i, String str, List list, String str2, CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto, ImageDto imageDto, List list2, OrganizationPreviewRatingDto organizationPreviewRatingDto, List list3, List list4, BrowserInfoAttributesDto browserInfoAttributesDto) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = compressionResistantAttributedTextContainerDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = imageDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i & 64) == 0) {
            this.g = new OrganizationPreviewRatingDto(0);
        } else {
            this.g = organizationPreviewRatingDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
        if ((i & 256) == 0) {
            this.i = emptyList;
        } else {
            this.i = list4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = browserInfoAttributesDto;
        }
    }

    public OrganizationItemV2Dto$OrganizationPreviewItemV2Dto() {
        OrganizationPreviewRatingDto organizationPreviewRatingDto = new OrganizationPreviewRatingDto(0);
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = organizationPreviewRatingDto;
        this.h = null;
        this.i = emptyList;
        this.j = null;
    }
}
