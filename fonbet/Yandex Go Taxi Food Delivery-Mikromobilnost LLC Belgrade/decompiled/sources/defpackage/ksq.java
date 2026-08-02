package defpackage;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import java.util.List;

/* loaded from: classes9.dex */
public final class ksq {
    public final String a;
    public final List b;
    public final wrq c;
    public final List d;
    public final boolean e;
    public final String f;
    public final TipsType g;
    public final boolean h;
    public final int i;
    public final String j;
    public final Boolean k;
    public final List l;

    public ksq(isq isqVar) {
        this.a = isqVar.a;
        this.b = isqVar.c;
        this.c = isqVar.e;
        this.d = isqVar.d;
        this.e = isqVar.f;
        this.f = isqVar.h;
        this.g = isqVar.g;
        this.h = isqVar.i;
        this.i = isqVar.j;
        this.j = isqVar.k;
        this.k = isqVar.b;
        this.l = isqVar.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackData{orderId='");
        sb.append(this.a);
        sb.append("', feedbackBadges=");
        sb.append(this.c);
        sb.append(", ratingReasons=");
        nzs.p(sb, this.b, ", tipsAvailable=", this.e, ", tipsValue=");
        b64.A(this.i, this.f, ", rating=", ", comment='", sb);
        return oyr.t(sb, this.j, "'}");
    }
}
