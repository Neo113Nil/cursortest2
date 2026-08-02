package com.yandex.go.taxi.order.models.api.preorder;

import defpackage.gsq0;
import defpackage.jl40;
import java.util.Calendar;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/Transfer;", "", "Companion", "ManualLookup", "com/yandex/go/taxi/order/models/api/preorder/e", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Transfer {
    public static final e Companion = new e();
    public final Calendar a;
    public final String b;
    public final ManualLookup c;
    public final Integer d;

    public /* synthetic */ Transfer(int i, Calendar calendar, String str, ManualLookup manualLookup, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = calendar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = manualLookup;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Calendar getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transfer)) {
            return false;
        }
        Transfer transfer = (Transfer) obj;
        return jl40.l(this.a, transfer.a) && jl40.l(this.b, transfer.b) && jl40.l(this.c, transfer.c) && jl40.l(this.d, transfer.d);
    }

    public final int hashCode() {
        Calendar calendar = this.a;
        int hashCode = (calendar == null ? 0 : calendar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ManualLookup manualLookup = this.c;
        int hashCode3 = (hashCode2 + (manualLookup == null ? 0 : manualLookup.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Transfer(due=" + this.a + ", transferId=" + this.b + ", manualLookup=" + this.c + ", lookupTtl=" + this.d + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/Transfer$ManualLookup;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/preorder/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class ManualLookup {
        public static final f Companion = new f();
        public final Boolean a;

        public /* synthetic */ ManualLookup(Boolean bool, int i) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManualLookup) && jl40.l(this.a, ((ManualLookup) obj).a);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return "ManualLookup(enabled=" + this.a + Extension.C_BRAKE;
        }

        public ManualLookup(Boolean bool) {
            this.a = bool;
        }

        public ManualLookup() {
            this(null);
        }
    }

    public Transfer(Calendar calendar, String str, ManualLookup manualLookup, Integer num) {
        this.a = calendar;
        this.b = str;
        this.c = manualLookup;
        this.d = num;
    }

    public Transfer() {
        this(null, null, null, null);
    }
}
