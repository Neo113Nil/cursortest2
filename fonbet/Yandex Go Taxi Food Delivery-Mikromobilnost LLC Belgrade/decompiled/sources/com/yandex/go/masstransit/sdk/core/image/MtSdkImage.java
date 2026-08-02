package com.yandex.go.masstransit.sdk.core.image;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/image/MtSdkImage;", "", "Companion", "com/yandex/go/masstransit/sdk/core/image/a", "$serializer", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MtSdkImage {
    public static final a Companion = new a();
    public static final MtSdkImage f = new MtSdkImage(0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MtSdkUrlParts e;

    public /* synthetic */ MtSdkImage(int i, String str, String str2, String str3, String str4, MtSdkUrlParts mtSdkUrlParts) {
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
            this.e = mtSdkUrlParts;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final MtSdkUrlParts getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtSdkImage)) {
            return false;
        }
        MtSdkImage mtSdkImage = (MtSdkImage) obj;
        return jl40.l(this.a, mtSdkImage.a) && jl40.l(this.b, mtSdkImage.b) && jl40.l(this.c, mtSdkImage.c) && jl40.l(this.d, mtSdkImage.d) && jl40.l(this.e, mtSdkImage.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MtSdkUrlParts mtSdkUrlParts = this.e;
        return hashCode4 + (mtSdkUrlParts != null ? mtSdkUrlParts.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtSdkImage(url=", this.a, ", tag=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", sizeHint=", this.d, ", urlParts=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public MtSdkImage(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public MtSdkImage() {
        this(0);
    }
}
