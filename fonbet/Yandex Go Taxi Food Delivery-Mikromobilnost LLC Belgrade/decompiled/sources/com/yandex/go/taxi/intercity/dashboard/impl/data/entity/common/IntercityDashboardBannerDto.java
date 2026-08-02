package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardBannerDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardBannerDto {
    public static final f Companion = new f();
    public static final i3y[] k = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(8)), null, null, null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final IntercityDashboardSectionTypeDto e;
    public final boolean f;
    public final String g;
    public final IntercityDashboardActionDto h;
    public final kotlinx.serialization.json.b i;
    public final IntercityDashboardBannerStyleDto j;

    public /* synthetic */ IntercityDashboardBannerDto(int i, String str, String str2, String str3, String str4, IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto, boolean z, String str5, IntercityDashboardActionDto intercityDashboardActionDto, kotlinx.serialization.json.b bVar, IntercityDashboardBannerStyleDto intercityDashboardBannerStyleDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = IntercityDashboardSectionTypeDto.UNKNOWN;
        } else {
            this.e = intercityDashboardSectionTypeDto;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = intercityDashboardActionDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = intercityDashboardBannerStyleDto;
        }
    }

    public IntercityDashboardBannerDto() {
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto = IntercityDashboardSectionTypeDto.UNKNOWN;
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = intercityDashboardSectionTypeDto;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
