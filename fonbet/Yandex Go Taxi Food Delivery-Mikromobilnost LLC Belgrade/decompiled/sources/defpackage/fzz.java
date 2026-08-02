package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes13.dex */
public final class fzz implements fw90 {
    public final Set a;

    public fzz(Set set) {
        this.a = set;
    }

    @Override // defpackage.fw90
    public final bw90 b(u0k u0kVar) {
        if (u0kVar instanceof lea0) {
            if (this.a.contains(((lea0) u0kVar).c())) {
                return new zv90((String) null);
            }
        }
        return xw91.C;
    }

    public fzz() {
        this(EmptySet.a);
    }
}
