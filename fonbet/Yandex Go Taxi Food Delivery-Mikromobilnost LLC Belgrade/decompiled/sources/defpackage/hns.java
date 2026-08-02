package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.FundRequestStatusSuccessResponseEntity$ResultScreen$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hns {
    public final FundRequestStatusSuccessResponseEntity$ResultScreen$Type a;
    public final Text b;
    public final Text c;
    public final rbv d;
    public final ms e;

    public hns(FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type, Text text, Text text2, rbv rbvVar, ms msVar) {
        this.a = fundRequestStatusSuccessResponseEntity$ResultScreen$Type;
        this.b = text;
        this.c = text2;
        this.d = rbvVar;
        this.e = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hns)) {
            return false;
        }
        hns hnsVar = (hns) obj;
        return this.a == hnsVar.a && this.b.equals(hnsVar.b) && jl40.l(this.c, hnsVar.c) && this.d.equals(hnsVar.d) && this.e.equals(hnsVar.e);
    }

    public final int hashCode() {
        FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type = this.a;
        int c = n.c(this.b, (fundRequestStatusSuccessResponseEntity$ResultScreen$Type == null ? 0 : fundRequestStatusSuccessResponseEntity$ResultScreen$Type.hashCode()) * 31, 31);
        Text text = this.c;
        return this.e.hashCode() + ly3.c(this.d, (c + (text != null ? text.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "StatusScreen(type=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", icon=" + this.d + ", button=" + this.e + Extension.C_BRAKE;
    }
}
