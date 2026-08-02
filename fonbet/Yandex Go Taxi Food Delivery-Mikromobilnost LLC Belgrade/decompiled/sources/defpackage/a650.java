package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La650;", "", "Companion", "y550", "z550", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a650 {
    public static final z550 Companion = new z550();
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public /* synthetic */ a650(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
    }

    public a650() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
