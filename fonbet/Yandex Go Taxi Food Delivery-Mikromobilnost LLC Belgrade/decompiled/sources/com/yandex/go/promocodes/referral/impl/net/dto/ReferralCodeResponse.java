package com.yandex.go.promocodes.referral.impl.net.dto;

import com.yandex.go.promocodes.referral.api.net.dto.ReferralOverrides;
import com.yandex.go.promocodes.referral.api.net.dto.ReferralService;
import defpackage.gsq0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.ief;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/impl/net/dto/ReferralCodeResponse;", "", "Companion", "$serializer", "com/yandex/go/promocodes/referral/impl/net/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReferralCodeResponse {
    public static final c Companion = new c();
    public static final i3y[] o;
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Integer e;
    public final int f;
    public final String g;
    public final String h;
    public final ief i;
    public final PromoBannerDto j;
    public final ReferralOverrides k;
    public final ReferralService l;
    public final FormattedText m;
    public final List n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new hkg0(26)), null, kotlin.a.b(lazyThreadSafetyMode, new hkg0(27))};
    }

    public /* synthetic */ ReferralCodeResponse(int i, String str, Integer num, String str2, String str3, Integer num2, int i2, String str4, String str5, ief iefVar, PromoBannerDto promoBannerDto, ReferralOverrides referralOverrides, ReferralService referralService, FormattedText formattedText, List list) {
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
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = iefVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = promoBannerDto;
        }
        if ((i & 1024) == 0) {
            this.k = ReferralOverrides.f;
        } else {
            this.k = referralOverrides;
        }
        if ((i & 2048) == 0) {
            this.l = ReferralService.UNKNOWN;
        } else {
            this.l = referralService;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = formattedText;
        }
        this.n = (i & 8192) == 0 ? EmptyList.a : list;
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getM() {
        return this.m;
    }

    /* renamed from: b, reason: from getter */
    public final ief getI() {
        return this.i;
    }

    /* renamed from: c, reason: from getter */
    public final String getG() {
        return this.g;
    }

    /* renamed from: d, reason: from getter */
    public final List getN() {
        return this.n;
    }

    /* renamed from: e, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: f, reason: from getter */
    public final String getH() {
        return this.h;
    }

    /* renamed from: g, reason: from getter */
    public final ReferralOverrides getK() {
        return this.k;
    }

    /* renamed from: h, reason: from getter */
    public final PromoBannerDto getJ() {
        return this.j;
    }

    /* renamed from: i, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: j, reason: from getter */
    public final ReferralService getL() {
        return this.l;
    }

    /* renamed from: k, reason: from getter */
    public final int getF() {
        return this.f;
    }

    public ReferralCodeResponse() {
        ReferralService referralService = ReferralService.UNKNOWN;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = "";
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = ReferralOverrides.f;
        this.l = referralService;
        this.m = null;
        this.n = EmptyList.a;
    }
}
