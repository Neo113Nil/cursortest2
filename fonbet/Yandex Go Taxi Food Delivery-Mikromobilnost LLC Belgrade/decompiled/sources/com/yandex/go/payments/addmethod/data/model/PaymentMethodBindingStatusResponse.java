package com.yandex.go.payments.addmethod.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nk90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusResponse;", "", "Companion", "BindingStatus", "com/yandex/go/payments/addmethod/data/model/m0", "AsyncApplicationUserInteraction", "$serializer", "com/yandex/go/payments/addmethod/data/model/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentMethodBindingStatusResponse {
    public static final k0 Companion = new k0();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(27)), null, null, null};
    public final BindingStatus a;
    public final String b;
    public final m0 c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusResponse$BindingStatus;", "", "Companion", "com/yandex/go/payments/addmethod/data/model/j0", "SUCCESS", "FAIL", "PROCESSING", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BindingStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BindingStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final j0 Companion;
        public static final BindingStatus FAIL;
        public static final BindingStatus PROCESSING;
        public static final BindingStatus SUCCESS;
        public static final BindingStatus UNKNOWN;

        static {
            BindingStatus bindingStatus = new BindingStatus("SUCCESS", 0);
            SUCCESS = bindingStatus;
            BindingStatus bindingStatus2 = new BindingStatus("FAIL", 1);
            FAIL = bindingStatus2;
            BindingStatus bindingStatus3 = new BindingStatus("PROCESSING", 2);
            PROCESSING = bindingStatus3;
            BindingStatus bindingStatus4 = new BindingStatus("UNKNOWN", 3);
            UNKNOWN = bindingStatus4;
            BindingStatus[] bindingStatusArr = {bindingStatus, bindingStatus2, bindingStatus3, bindingStatus4};
            $VALUES = bindingStatusArr;
            $ENTRIES = kotlin.enums.a.a(bindingStatusArr);
            Companion = new j0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(28));
        }

        public static BindingStatus valueOf(String str) {
            return (BindingStatus) Enum.valueOf(BindingStatus.class, str);
        }

        public static BindingStatus[] values() {
            return (BindingStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentMethodBindingStatusResponse(int i, BindingStatus bindingStatus, String str, m0 m0Var, String str2) {
        this.a = (i & 1) == 0 ? BindingStatus.UNKNOWN : bindingStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final BindingStatus getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final m0 getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodBindingStatusResponse)) {
            return false;
        }
        PaymentMethodBindingStatusResponse paymentMethodBindingStatusResponse = (PaymentMethodBindingStatusResponse) obj;
        return this.a == paymentMethodBindingStatusResponse.a && jl40.l(this.b, paymentMethodBindingStatusResponse.b) && jl40.l(this.c, paymentMethodBindingStatusResponse.c) && jl40.l(this.d, paymentMethodBindingStatusResponse.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        m0 m0Var = this.c;
        int hashCode3 = (hashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethodBindingStatusResponse(status=" + this.a + ", paymentMethodId=" + this.b + ", userInteraction=" + this.c + ", errorMessage=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/addmethod/data/model/PaymentMethodBindingStatusResponse$AsyncApplicationUserInteraction;", "Lcom/yandex/go/payments/addmethod/data/model/m0;", "Companion", "$serializer", "com/yandex/go/payments/addmethod/data/model/i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AsyncApplicationUserInteraction extends m0 {
        public static final i0 Companion = new i0();
        public final String a;
        public final String b;

        public AsyncApplicationUserInteraction(int i, String str, String str2) {
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
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public AsyncApplicationUserInteraction() {
            this.a = "";
            this.b = "";
        }
    }

    public PaymentMethodBindingStatusResponse() {
        this.a = BindingStatus.UNKNOWN;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
