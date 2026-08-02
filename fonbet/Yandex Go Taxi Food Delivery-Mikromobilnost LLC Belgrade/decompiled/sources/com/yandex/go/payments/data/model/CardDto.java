package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.we8;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/CardDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "$serializer", "com/yandex/go/payments/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardDto extends u {
    public static final f Companion = new f();
    public static final i3y[] r;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final VerifyStrategy l;
    public final UserCardProfileDto m;
    public final List n;
    public final CardFamilyDto o;
    public final String p;
    public final Boolean q;

    static {
        w0 w0Var = UserCardProfileDto.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        r = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ij7(29)), null, kotlin.a.b(lazyThreadSafetyMode, new we8(0)), null, null, null};
    }

    public CardDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, String str3, boolean z, String str4, String str5, String str6, int i2, int i3, String str7, VerifyStrategy verifyStrategy, UserCardProfileDto userCardProfileDto, List list, CardFamilyDto cardFamilyDto, String str8, Boolean bool) {
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
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i2;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = verifyStrategy;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = userCardProfileDto;
        }
        this.n = (i & 8192) == 0 ? EmptyList.a : list;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = cardFamilyDto;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str8;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = bool;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public CardDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = EmptyList.a;
        this.o = null;
        this.p = null;
        this.q = null;
    }
}
