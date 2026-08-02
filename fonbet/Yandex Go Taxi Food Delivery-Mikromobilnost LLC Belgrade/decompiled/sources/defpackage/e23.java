package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le23;", "", "Companion", "c23", "d23", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e23 {
    public static final d23 Companion = new d23();
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public /* synthetic */ e23(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
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

    public e23() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
