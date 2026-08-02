package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc551;", "", "Companion", "a551", "b551", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c551 {
    public static final b551 Companion = new b551();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new z151(3))};
    public final String a;
    public final List b;

    public /* synthetic */ c551(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
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
        if (!(obj instanceof c551)) {
            return false;
        }
        c551 c551Var = (c551) obj;
        return jl40.l(this.a, c551Var.a) && jl40.l(this.b, c551Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("WidgetsConfigDto(screen=", this.a, ", orders=", Extension.C_BRAKE, this.b);
    }

    public c551(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public c551() {
        this(null, EmptyList.a);
    }
}
