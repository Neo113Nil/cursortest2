package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lbmu;", "", "Companion", "zlu", "amu", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class bmu {
    public static final amu Companion = new amu();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(28)), null};
    public final List a;
    public final ief b;

    public /* synthetic */ bmu(int i, List list, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iefVar;
        }
    }

    public bmu() {
        this.a = null;
        this.b = null;
    }
}
