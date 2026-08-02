package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.TextAlign;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lht1;", "", "Companion", "gt1", "ft1", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ht1 {
    public static final gt1 Companion = new gt1();
    public static final i3y[] c;
    public static final ht1 d;
    public final List a;
    public final TextAlign b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new ro1(6)), a.b(lazyThreadSafetyMode, new ro1(7))};
        d = new ht1(0);
    }

    public /* synthetic */ ht1(int i, List list, TextAlign textAlign) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = textAlign;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht1)) {
            return false;
        }
        ht1 ht1Var = (ht1) obj;
        return jl40.l(this.a, ht1Var.a) && this.b == ht1Var.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        TextAlign textAlign = this.b;
        return hashCode + (textAlign == null ? 0 : textAlign.hashCode());
    }

    public final String toString() {
        return "AlignedText(items=" + this.a + ", align=" + this.b + Extension.C_BRAKE;
    }

    public ht1(int i) {
        this.a = EmptyList.a;
        this.b = null;
    }

    public ht1() {
        this(0);
    }
}
