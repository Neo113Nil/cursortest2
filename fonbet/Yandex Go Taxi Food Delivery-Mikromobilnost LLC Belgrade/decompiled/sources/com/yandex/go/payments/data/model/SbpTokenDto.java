package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.response.CardProfile;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v4m0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/SbpTokenDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "$serializer", "com/yandex/go/payments/data/model/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SbpTokenDto extends u {
    public static final j0 Companion = new j0();
    public static final i3y[] i;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final VerifyStrategy g;
    public final CardProfile h;

    static {
        com.yandex.go.payments.data.model.response.v vVar = CardProfile.Companion;
        i = new i3y[]{null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(7)), null};
    }

    public SbpTokenDto(int i2, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, String str3, String str4, String str5, VerifyStrategy verifyStrategy, CardProfile cardProfile) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i2 & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = verifyStrategy;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = cardProfile;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public SbpTokenDto() {
        this.a = null;
        this.b = null;
        this.c = "";
        this.d = "";
        this.e = null;
        this.f = "";
        this.g = null;
        this.h = null;
    }
}
