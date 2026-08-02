package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lemu0;", "", "Companion", "cmu0", "dmu0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class emu0 {
    public static final dmu0 Companion = new dmu0();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bmu0(0)), null, null};
    public final String a;
    public final List b;
    public final Integer c;
    public final ui2 d;

    public /* synthetic */ emu0(int i, String str, List list, Integer num, ui2 ui2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ui2Var;
        }
    }

    public emu0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
