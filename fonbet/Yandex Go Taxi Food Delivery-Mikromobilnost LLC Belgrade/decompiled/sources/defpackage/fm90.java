package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfm90;", "", "Companion", "dm90", "em90", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class fm90 {
    public static final em90 Companion = new em90();
    public final tl90 a;
    public final ief b;

    public /* synthetic */ fm90(int i, tl90 tl90Var, ief iefVar) {
        this.a = (i & 1) == 0 ? null : tl90Var;
        if ((i & 2) == 0) {
            this.b = ief.e;
        } else {
            this.b = iefVar;
        }
    }

    public fm90() {
        this.a = null;
        this.b = ief.e;
    }
}
