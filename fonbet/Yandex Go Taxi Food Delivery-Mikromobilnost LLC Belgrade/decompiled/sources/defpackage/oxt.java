package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Loxt;", "Lsxt;", "Companion", "mxt", "nxt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class oxt extends sxt {
    public static final nxt Companion = new nxt();
    public final String a;
    public final double b;
    public final String c;
    public final String d;

    public oxt(int i, String str, String str2, double d, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        this.b = (i & 2) == 0 ? 0.0d : d;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public oxt() {
        this.a = "";
        this.b = 0.0d;
        this.c = "";
        this.d = "";
    }
}
