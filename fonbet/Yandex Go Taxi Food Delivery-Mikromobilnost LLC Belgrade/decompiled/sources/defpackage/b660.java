package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb660;", "Lvn11;", "Companion", "a660", "z560", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b660 implements vn11 {
    public static final a660 Companion = new a660();
    public static final b660 d = new b660(0);
    public final String b;
    public final String c;

    public /* synthetic */ b660(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, z560.a.getDescriptor());
            throw null;
        }
        this.b = str;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public b660(int i) {
        this.b = "";
        this.c = "";
    }

    public b660() {
        this(0);
    }
}
