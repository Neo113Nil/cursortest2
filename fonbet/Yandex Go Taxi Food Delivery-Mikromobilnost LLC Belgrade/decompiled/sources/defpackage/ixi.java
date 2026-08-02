package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lixi;", "Lvqo;", "Companion", "gxi", "hxi", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ixi implements vqo {
    public static final hxi Companion = new hxi();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(29))};
    public final Boolean a;
    public final List b;

    public /* synthetic */ ixi(int i, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    @Override // defpackage.vqo
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public ixi() {
        this.a = null;
        this.b = null;
    }
}
