package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/CorpAccountDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "$serializer", "com/yandex/go/payments/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpAccountDto extends u {
    public static final k Companion = new k();
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final double d;
    public final double e;
    public final double f;
    public final String g;
    public final String h;
    public final String i;
    public final CostCenters j;

    static {
        l lVar = CostCenters.Companion;
    }

    public CorpAccountDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, double d, double d2, double d3, String str3, String str4, String str5, CostCenters costCenters) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = 0.0d;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = 0.0d;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = 0.0d;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = costCenters;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public CorpAccountDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
