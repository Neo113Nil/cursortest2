package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lebj0;", "", "Companion", "cbj0", "dbj0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ebj0 {
    public static final dbj0 Companion = new dbj0();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new vci0(15))};
    public final String a;
    public final adj b;
    public final String c;
    public final List d;

    public /* synthetic */ ebj0(int i, String str, adj adjVar, String str2, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new adj(0);
        } else {
            this.b = adjVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public ebj0() {
        adj adjVar = new adj(0);
        this.a = "";
        this.b = adjVar;
        this.c = null;
        this.d = null;
    }
}
