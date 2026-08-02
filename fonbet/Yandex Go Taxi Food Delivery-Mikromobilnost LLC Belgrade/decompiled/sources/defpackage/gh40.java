package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgh40;", "", "Companion", "eh40", "fh40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class gh40 {
    public static final fh40 Companion = new fh40();
    public final ief a;
    public final FormattedText b;
    public final vg40 c;
    public final ne40 d;
    public final nh40 e;
    public final pf40 f;
    public final bg40 g;

    public gh40(int i, ief iefVar, FormattedText formattedText, vg40 vg40Var, ne40 ne40Var, nh40 nh40Var, pf40 pf40Var, bg40 bg40Var) {
        this.a = (i & 1) == 0 ? ief.e : iefVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            vg40.Companion.getClass();
            this.c = vg40.e;
        } else {
            this.c = vg40Var;
        }
        if ((i & 8) == 0) {
            ne40.Companion.getClass();
            this.d = ne40.f;
        } else {
            this.d = ne40Var;
        }
        if ((i & 16) == 0) {
            nh40.Companion.getClass();
            this.e = nh40.c;
        } else {
            this.e = nh40Var;
        }
        if ((i & 32) == 0) {
            pf40.Companion.getClass();
            this.f = pf40.d;
        } else {
            this.f = pf40Var;
        }
        if ((i & 64) != 0) {
            this.g = bg40Var;
        } else {
            bg40.Companion.getClass();
            this.g = bg40.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh40)) {
            return false;
        }
        gh40 gh40Var = (gh40) obj;
        return jl40.l(this.a, gh40Var.a) && jl40.l(this.b, gh40Var.b) && jl40.l(this.c, gh40Var.c) && jl40.l(this.d, gh40Var.d) && jl40.l(this.e, gh40Var.e) && jl40.l(this.f, gh40Var.f) && jl40.l(this.g, gh40Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.g.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MtTrainSchedulerResponse(currencyRulesDto=" + this.a + ", name=" + this.b + ", dateButtonsBar=" + this.c + ", dateSelector=" + this.d + ", stations=" + this.e + ", filters=" + this.f + ", scheduler=" + this.g + Extension.C_BRAKE;
    }

    public gh40() {
        vg40.Companion.getClass();
        vg40 vg40Var = vg40.e;
        ne40.Companion.getClass();
        ne40 ne40Var = ne40.f;
        nh40.Companion.getClass();
        nh40 nh40Var = nh40.c;
        pf40.Companion.getClass();
        pf40 pf40Var = pf40.d;
        bg40.Companion.getClass();
        bg40 bg40Var = bg40.c;
        this.a = ief.e;
        this.b = null;
        this.c = vg40Var;
        this.d = ne40Var;
        this.e = nh40Var;
        this.f = pf40Var;
        this.g = bg40Var;
    }
}
