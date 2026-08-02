package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lklj;", "", "Companion", "jlj", "ilj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class klj {
    public static final jlj Companion = new jlj();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new acj(6))};
    public static final klj d = new klj(0);
    public final FormattedText a;
    public final List b;

    public /* synthetic */ klj(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klj)) {
            return false;
        }
        klj kljVar = (klj) obj;
        return jl40.l(this.a, kljVar.a) && jl40.l(this.b, kljVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "DirectionSelector(title=" + this.a + ", directions=" + this.b + Extension.C_BRAKE;
    }

    public klj() {
        this(0);
    }

    public klj(int i) {
        this.a = FormattedText.c;
        this.b = EmptyList.a;
    }
}
