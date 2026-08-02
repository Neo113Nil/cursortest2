package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lol10;", "", "Companion", "ml10", "nl10", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ol10 {
    public static final nl10 Companion = new nl10();
    public final rl10 a;
    public final rl10 b;
    public final il10 c;
    public final Boolean d;

    public /* synthetic */ ol10(int i, rl10 rl10Var, rl10 rl10Var2, il10 il10Var, Boolean bool) {
        this.a = (i & 1) == 0 ? new rl10(0) : rl10Var;
        if ((i & 2) == 0) {
            this.b = new rl10(0);
        } else {
            this.b = rl10Var2;
        }
        if ((i & 4) == 0) {
            this.c = new il10(0);
        } else {
            this.c = il10Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
    }

    public ol10() {
        rl10 rl10Var = new rl10(0);
        rl10 rl10Var2 = new rl10(0);
        il10 il10Var = new il10(0);
        this.a = rl10Var;
        this.b = rl10Var2;
        this.c = il10Var;
        this.d = null;
    }
}
