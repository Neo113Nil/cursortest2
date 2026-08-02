package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj3e0;", "", "Companion", "h3e0", "i3e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j3e0 {
    public static final i3e0 Companion = new i3e0();
    public static final i3y[] f = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(8)), null};
    public final u3e0 a;
    public final String b;
    public final m3e0 c;
    public final List d;
    public final c79 e;

    public /* synthetic */ j3e0(int i, u3e0 u3e0Var, String str, m3e0 m3e0Var, List list, c79 c79Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = u3e0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m3e0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = c79Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final c79 getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final m3e0 getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public j3e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
