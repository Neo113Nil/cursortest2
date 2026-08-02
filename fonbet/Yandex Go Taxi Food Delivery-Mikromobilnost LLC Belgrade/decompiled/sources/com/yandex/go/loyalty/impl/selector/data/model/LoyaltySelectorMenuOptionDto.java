package com.yandex.go.loyalty.impl.selector.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.o3z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/loyalty/impl/selector/data/model/LoyaltySelectorMenuOptionDto;", "", "Companion", "$serializer", "com/yandex/go/loyalty/impl/selector/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltySelectorMenuOptionDto {
    public static final h Companion = new h();
    public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(29)), null, null, null};
    public final String a;
    public final String b;
    public final String c;
    public final LoyaltyProgramStateDto d;
    public final String e;
    public final LoyaltyProgramBadgeDto f;
    public final LoyaltyProgramButtonDto g;

    public /* synthetic */ LoyaltySelectorMenuOptionDto(int i, String str, String str2, String str3, LoyaltyProgramStateDto loyaltyProgramStateDto, String str4, LoyaltyProgramBadgeDto loyaltyProgramBadgeDto, LoyaltyProgramButtonDto loyaltyProgramButtonDto) {
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
            this.d = LoyaltyProgramStateDto.DISABLED;
        } else {
            this.d = loyaltyProgramStateDto;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = loyaltyProgramBadgeDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = loyaltyProgramButtonDto;
        }
    }

    public LoyaltySelectorMenuOptionDto() {
        LoyaltyProgramStateDto loyaltyProgramStateDto = LoyaltyProgramStateDto.DISABLED;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = loyaltyProgramStateDto;
        this.e = "";
        this.f = null;
        this.g = null;
    }
}
