package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/TopNotification;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TopNotification {
    public static final v0 Companion = new v0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ TopNotification(String str, String str2, String str3, String str4, int i, String str5) {
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
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopNotification)) {
            return false;
        }
        TopNotification topNotification = (TopNotification) obj;
        return jl40.l(this.a, topNotification.a) && jl40.l(this.b, topNotification.b) && jl40.l(this.c, topNotification.c) && jl40.l(this.d, topNotification.d) && jl40.l(this.e, topNotification.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TopNotification(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", iconTag=", this.d, ", status=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public TopNotification() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
