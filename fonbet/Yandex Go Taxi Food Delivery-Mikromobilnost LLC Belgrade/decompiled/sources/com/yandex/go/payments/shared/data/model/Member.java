package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w410;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.gopayments.dto.MemberRole;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/Member;", "", "Companion", "Limits", "$serializer", "com/yandex/go/payments/shared/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Member {
    public static final i Companion = new i();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(13)), null, null, null, null};
    public final String a;
    public final MemberRole b;
    public final MemberDetails c;
    public final String d;
    public final boolean e;
    public final Limits f;

    public Member(int i, String str, MemberRole memberRole, MemberDetails memberDetails, String str2, boolean z, Limits limits) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = memberRole;
        }
        if ((i & 4) == 0) {
            MemberDetails.Companion.getClass();
            this.c = new MemberDetails(0);
        } else {
            this.c = memberDetails;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = limits;
        }
    }

    public final Long a() {
        Limits limits = this.f;
        if (limits != null) {
            return limits.a;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/Member$Limits;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Limits {
        public static final j Companion = new j();
        public final Long a;
        public final boolean b;

        public /* synthetic */ Limits(int i, Long l, boolean z) {
            this.a = (i & 1) == 0 ? null : l;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public Limits() {
            this.a = null;
            this.b = false;
        }
    }

    public Member() {
        MemberDetails.Companion.getClass();
        MemberDetails memberDetails = new MemberDetails(0);
        this.a = "";
        this.b = null;
        this.c = memberDetails;
        this.d = "";
        this.e = false;
        this.f = null;
    }
}
