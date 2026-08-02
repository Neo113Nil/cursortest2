package com.yandex.go.safety.center.api;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/safety/center/api/SendSosInfoParam;", "", "Companion", "SosLocationData", "$serializer", "com/yandex/go/safety/center/api/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SendSosInfoParam {
    public static final g Companion = new g();
    public final String a;
    public final SosLocationData b;

    public /* synthetic */ SendSosInfoParam(int i, String str, SosLocationData sosLocationData) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sosLocationData;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSosInfoParam)) {
            return false;
        }
        SendSosInfoParam sendSosInfoParam = (SendSosInfoParam) obj;
        return jl40.l(this.a, sendSosInfoParam.a) && jl40.l(this.b, sendSosInfoParam.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SosLocationData sosLocationData = this.b;
        return hashCode + (sosLocationData == null ? 0 : sosLocationData.hashCode());
    }

    public final String toString() {
        return "SendSosInfoParam(orderId=" + this.a + ", location=" + this.b + Extension.C_BRAKE;
    }

    public SendSosInfoParam(String str, SosLocationData sosLocationData) {
        this.a = str;
        this.b = sosLocationData;
    }

    public SendSosInfoParam() {
        this("", null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/SendSosInfoParam$SosLocationData;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SosLocationData {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ SosLocationData(int i, String str, String str2, String str3) {
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
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SosLocationData)) {
                return false;
            }
            SosLocationData sosLocationData = (SosLocationData) obj;
            return jl40.l(this.a, sosLocationData.a) && jl40.l(this.b, sosLocationData.b) && jl40.l(this.c, sosLocationData.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("SosLocationData(lat=", this.a, ", lon=", this.b, ", timestamp="), this.c, Extension.C_BRAKE);
        }

        public SosLocationData(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public SosLocationData() {
            this("", "", "");
        }
    }
}
