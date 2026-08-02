package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lknm;", "", "Companion", "inm", "jnm", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class knm {
    public static final jnm Companion = new jnm();
    public final String a;
    public final pud0 b;
    public final String c;

    public /* synthetic */ knm(int i, pud0 pud0Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        this.b = (i & 2) == 0 ? new pud0(0) : pud0Var;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public knm() {
        this(0);
    }

    public knm(int i) {
        pud0 pud0Var = new pud0(0);
        this.a = "";
        this.b = pud0Var;
        this.c = "";
    }
}
