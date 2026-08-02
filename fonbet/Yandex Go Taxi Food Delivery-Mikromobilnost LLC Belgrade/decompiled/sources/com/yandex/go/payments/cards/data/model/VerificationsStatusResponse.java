package com.yandex.go.payments.cards.data.model;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nc5;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/VerificationsStatusResponse;", "Lnc5;", "Companion", "com/yandex/go/payments/cards/data/model/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerificationsStatusResponse extends nc5 {
    public static final r Companion = new r();
    public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(3)), null, null, null, null, null, null};
    public final VerificationStatus a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public /* synthetic */ VerificationsStatusResponse(int i, VerificationStatus verificationStatus, String str, String str2, String str3, String str4, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = verificationStatus;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }

    @Override // defpackage.nc5
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // defpackage.nc5
    /* renamed from: c, reason: from getter */
    public final Integer getF() {
        return this.f;
    }

    @Override // defpackage.nc5
    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    @Override // defpackage.nc5
    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.nc5
    /* renamed from: f, reason: from getter */
    public final VerificationStatus getA() {
        return this.a;
    }

    public VerificationsStatusResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
