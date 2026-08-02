package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ll9u;", "", "Companion", "k9u", "j9u", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l9u {
    public static final k9u Companion = new k9u();
    public static final l9u d = new l9u(0);
    public final boolean a;
    public final String b;
    public final String c;

    public /* synthetic */ l9u(String str, int i, String str2, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public l9u(int i) {
        this.a = false;
        this.b = "";
        this.c = "";
    }

    public l9u() {
        this(0);
    }
}
