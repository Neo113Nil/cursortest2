package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.data.FeedbackType;

/* loaded from: classes5.dex */
public final class bvq {
    public final FeedbackType a;
    public final String b;
    public final Integer c;
    public final String d;
    public final List e;
    public final ziq0 f;

    public bvq(FeedbackType feedbackType, String str, Integer num, String str2, List list, ziq0 ziq0Var) {
        this.a = feedbackType;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = list;
        this.f = ziq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvq)) {
            return false;
        }
        bvq bvqVar = (bvq) obj;
        return this.a == bvqVar.a && jl40.l(this.b, bvqVar.b) && jl40.l(this.c, bvqVar.c) && jl40.l(this.d, bvqVar.d) && this.e.equals(bvqVar.e) && jl40.l(this.f, bvqVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        ziq0 ziq0Var = this.f;
        return c + (ziq0Var != null ? ziq0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackSnapshot(type=");
        sb.append(this.a);
        sb.append(", actualId=");
        sb.append(this.b);
        sb.append(", actualScore=");
        tse0.w(this.c, ", actualComment=", this.d, ", actualReasons=", sb);
        sb.append(this.e);
        sb.append(", actualTip=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
