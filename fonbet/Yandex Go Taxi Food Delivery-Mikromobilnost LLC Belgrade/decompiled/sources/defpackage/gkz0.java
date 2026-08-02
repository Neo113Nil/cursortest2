package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgkz0;", "", "Companion", "ekz0", "fkz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class gkz0 {
    public static final fkz0 Companion = new fkz0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(6)), null, null};
    public final List a;
    public final FormattedText b;
    public final FormattedText c;

    public /* synthetic */ gkz0(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkz0)) {
            return false;
        }
        gkz0 gkz0Var = (gkz0) obj;
        return jl40.l(this.a, gkz0Var.a) && jl40.l(this.b, gkz0Var.b) && jl40.l(this.c, gkz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        return hashCode2 + (formattedText2 != null ? formattedText2.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToggleActions(actions=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        return tse0.m(sb, this.c, Extension.C_BRAKE);
    }

    public gkz0(int i) {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }

    public gkz0() {
        this(0);
    }
}
