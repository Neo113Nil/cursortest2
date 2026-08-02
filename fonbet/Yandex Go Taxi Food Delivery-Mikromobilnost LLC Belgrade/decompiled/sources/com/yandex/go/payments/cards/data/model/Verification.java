package com.yandex.go.payments.cards.data.model;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nc5;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/Verification;", "Lnc5;", "Companion", "com/yandex/go/payments/cards/data/model/m", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Verification extends nc5 {
    public static final m Companion = new m();
    public static final i3y[] k = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(22)), null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final VerificationStatus c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final String j;

    public /* synthetic */ Verification(int i, String str, String str2, VerificationStatus verificationStatus, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7) {
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
            this.c = verificationStatus;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
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
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
    }

    @Override // defpackage.nc5
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.g;
    }

    @Override // defpackage.nc5
    /* renamed from: c, reason: from getter */
    public final Integer getF() {
        return this.h;
    }

    @Override // defpackage.nc5
    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.e;
    }

    @Override // defpackage.nc5
    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.d;
    }

    @Override // defpackage.nc5
    /* renamed from: f, reason: from getter */
    public final VerificationStatus getA() {
        return this.c;
    }

    public Verification() {
        this((String) null, (String) null, (VerificationStatus) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 1023);
    }

    public Verification(String str, String str2, VerificationStatus verificationStatus, String str3, String str4, String str5, String str6, Integer num, Integer num2, String str7, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        verificationStatus = (i & 4) != 0 ? null : verificationStatus;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        str6 = (i & 64) != 0 ? null : str6;
        num = (i & 128) != 0 ? null : num;
        num2 = (i & 256) != 0 ? null : num2;
        str7 = (i & 512) != 0 ? null : str7;
        this.a = str;
        this.b = str2;
        this.c = verificationStatus;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = num;
        this.i = num2;
        this.j = str7;
    }
}
