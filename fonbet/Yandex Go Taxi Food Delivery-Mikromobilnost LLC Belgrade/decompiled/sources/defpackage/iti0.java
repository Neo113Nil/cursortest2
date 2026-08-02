package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Liti0;", "", "Companion", "gti0", "hti0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class iti0 {
    public static final hti0 Companion = new hti0();
    public final d6j0 a;
    public final String b;
    public final String c;

    public /* synthetic */ iti0(int i, d6j0 d6j0Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d6j0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public iti0() {
        this(null, 7);
    }

    public iti0(String str, int i) {
        str = (i & 2) != 0 ? null : str;
        this.a = null;
        this.b = str;
        this.c = null;
    }
}
