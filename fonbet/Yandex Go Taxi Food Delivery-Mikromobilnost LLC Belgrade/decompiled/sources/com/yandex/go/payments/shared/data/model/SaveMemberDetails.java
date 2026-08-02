package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SaveMemberDetails;", "", "Companion", "Details", "Limits", "com/yandex/go/payments/shared/data/model/m", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaveMemberDetails {
    public static final m Companion = new m();
    public final Details a;
    public final Limits b;

    public /* synthetic */ SaveMemberDetails(int i, Details details, Limits limits) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, SaveMemberDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = details;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = limits;
        }
    }

    public final Long a() {
        Limits limits = this.b;
        if (limits != null) {
            return limits.b;
        }
        return null;
    }

    public final String b() {
        return this.a.a;
    }

    public final String c() {
        return this.a.b;
    }

    public final boolean d() {
        Limits limits = this.b;
        return limits != null && limits.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SaveMemberDetails$Details;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Details {
        public static final n Companion = new n();
        public final String a;
        public final String b;

        public /* synthetic */ Details(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, SaveMemberDetails$Details$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public Details(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SaveMemberDetails$Limits;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Limits {
        public static final o Companion = new o();
        public final boolean a;
        public final Long b;

        public /* synthetic */ Limits(int i, Long l, boolean z) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, SaveMemberDetails$Limits$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = z;
            this.b = l;
        }

        public Limits(Long l, boolean z) {
            this.a = z;
            this.b = l;
        }
    }

    public SaveMemberDetails(Details details, Limits limits) {
        this.a = details;
        this.b = limits;
    }
}
