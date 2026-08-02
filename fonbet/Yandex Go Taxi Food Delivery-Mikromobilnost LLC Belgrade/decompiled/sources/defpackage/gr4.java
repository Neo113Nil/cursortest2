package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgr4;", "", "Companion", "er4", "fr4", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class gr4 {
    public static final fr4 Companion = new fr4();
    public final String a;
    public final boolean b;

    public /* synthetic */ gr4(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public gr4(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public gr4() {
        this("", false);
    }
}
