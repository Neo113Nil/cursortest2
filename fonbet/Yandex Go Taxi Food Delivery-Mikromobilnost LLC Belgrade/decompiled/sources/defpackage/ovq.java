package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovq;", "", "Companion", "mvq", "nvq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ovq {
    public static final nvq Companion = new nvq();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new nsq(19)), null};
    public final String a;
    public final List b;
    public final boolean c;

    public /* synthetic */ ovq(String str, List list, boolean z, int i) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public ovq() {
        this(null, 7);
    }

    public ovq(String str, int i) {
        this.a = (i & 1) != 0 ? "" : str;
        this.b = EmptyList.a;
        this.c = false;
    }
}
