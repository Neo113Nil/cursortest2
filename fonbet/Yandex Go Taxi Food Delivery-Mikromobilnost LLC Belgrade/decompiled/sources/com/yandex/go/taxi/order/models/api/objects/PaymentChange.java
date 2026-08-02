package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.lv90;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PaymentChange;", "", "Companion", "Reason", "$serializer", "com/yandex/go/taxi/order/models/api/objects/t0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentChange {
    public static final t0 Companion = new t0();
    public final lv90 a;
    public final lv90 b;
    public final Reason c;

    public /* synthetic */ PaymentChange(int i, lv90 lv90Var, lv90 lv90Var2, Reason reason) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = lv90Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = lv90Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = reason;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/PaymentChange$Reason;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/u0", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Reason {
        public static final u0 Companion = new u0();
        public final String a;
        public final String b;

        public /* synthetic */ Reason(int i, String str, String str2) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) obj;
            return jl40.l(this.a, reason.a) && jl40.l(this.b, reason.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return unr0.p("Reason(code=", this.a, ", text=", this.b, Extension.C_BRAKE);
        }

        public Reason() {
            this.a = null;
            this.b = null;
        }
    }

    public PaymentChange() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
