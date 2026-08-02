package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg59;", "Lgo11;", "Companion", "e59", "f59", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class g59 implements go11 {
    public static final f59 Companion = new f59();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new r66(28))};
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ g59(int i, FormattedText formattedText, FormattedText formattedText2, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g59)) {
            return false;
        }
        g59 g59Var = (g59) obj;
        return jl40.l(this.a, g59Var.a) && jl40.l(this.b, g59Var.b) && jl40.l(this.c, g59Var.c) && jl40.l(this.d, g59Var.d) && jl40.l(this.e, g59Var.e);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("CatchingUpCashbackTypedScreenDto(title=", this.a, ", text=", this.b, ", backroundImageUrl=");
        g8e.D(r, this.c, ", imageUrl=", this.d, ", templates=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }

    public g59() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
    }
}
