package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Li4n0;", "", "Companion", "g4n0", "h4n0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class i4n0 {
    public static final h4n0 Companion = new h4n0();
    public final String a;
    public final String b;

    public /* synthetic */ i4n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public i4n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public i4n0() {
        this("", "");
    }
}
