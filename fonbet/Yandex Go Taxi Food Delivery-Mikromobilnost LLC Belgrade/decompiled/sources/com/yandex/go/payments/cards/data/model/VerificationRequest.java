package com.yandex.go.payments.cards.data.model;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j831;
import defpackage.k831;
import defpackage.m831;
import defpackage.qje;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/VerificationRequest;", "", "Companion", "AntifraudPayload", "$serializer", "com/yandex/go/payments/cards/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerificationRequest {
    public static final o Companion = new o();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(29))};
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final AntifraudPayload e;
    public final String f;
    public final String g;
    public final Set h;

    public VerificationRequest(String str, String str2, String str3, j831 j831Var, Set set) {
        m831 m831Var = j831Var.a;
        String str4 = m831Var.a;
        String str5 = j831Var.b;
        boolean z = j831Var.e;
        k831 k831Var = m831Var instanceof k831 ? (k831) m831Var : null;
        String str6 = k831Var != null ? k831Var.c : null;
        AntifraudPayload antifraudPayload = str6 != null ? new AntifraudPayload(str6) : null;
        this.a = str;
        this.b = str4;
        this.c = str5;
        this.d = z;
        this.e = antifraudPayload;
        this.f = str2;
        this.g = str3;
        this.h = set;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/VerificationRequest$AntifraudPayload;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AntifraudPayload {
        public static final n Companion = new n();
        public final String a;

        public /* synthetic */ AntifraudPayload(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                qje.Z(i, 1, VerificationRequest$AntifraudPayload$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public AntifraudPayload(String str) {
            this.a = str;
        }
    }

    public /* synthetic */ VerificationRequest(int i2, String str, String str2, String str3, boolean z, AntifraudPayload antifraudPayload, String str4, String str5, Set set) {
        if (247 != (i2 & 247)) {
            qje.Z(i2, 247, VerificationRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i2 & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        this.e = antifraudPayload;
        this.f = str4;
        this.g = str5;
        this.h = set;
    }
}
