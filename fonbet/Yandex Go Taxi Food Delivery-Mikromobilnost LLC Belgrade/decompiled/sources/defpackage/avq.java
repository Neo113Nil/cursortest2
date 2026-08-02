package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lavq;", "", "Companion", "yuq", "zuq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class avq {
    public static final zuq Companion = new zuq();
    public static final i3y[] e;
    public final List a;
    public final List b;
    public final juq c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new nsq(15)), a.b(lazyThreadSafetyMode, new nsq(16)), null, a.b(lazyThreadSafetyMode, new nsq(17))};
    }

    public /* synthetic */ avq(int i, List list, List list2, juq juqVar, List list3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = juqVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public avq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
