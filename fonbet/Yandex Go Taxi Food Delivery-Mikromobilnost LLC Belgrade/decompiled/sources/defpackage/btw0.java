package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbtw0;", "", "Companion", "zsw0", "atw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class btw0 {
    public static final atw0 Companion = new atw0();
    public final uqw0 a;
    public final jqw0 b;

    public /* synthetic */ btw0(int i, uqw0 uqw0Var, jqw0 jqw0Var) {
        this.a = (i & 1) == 0 ? new uqw0(0) : uqw0Var;
        if ((i & 2) == 0) {
            this.b = new jqw0(0);
        } else {
            this.b = jqw0Var;
        }
    }

    public btw0() {
        uqw0 uqw0Var = new uqw0(0);
        jqw0 jqw0Var = new jqw0(0);
        this.a = uqw0Var;
        this.b = jqw0Var;
    }
}
