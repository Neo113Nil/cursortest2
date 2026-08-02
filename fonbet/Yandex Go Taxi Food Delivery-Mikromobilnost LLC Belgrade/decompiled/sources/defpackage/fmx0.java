package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfmx0;", "Ln96;", "Lc6z;", "Companion", "emx0", "dmx0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class fmx0 extends n96 implements c6z {
    public static final emx0 Companion = new emx0();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(2)), null};
    public static final fmx0 f = new fmx0(0);
    public final boolean b;
    public final Map c;
    public final vjj0 d;

    public /* synthetic */ fmx0(int i, boolean z, Map map, vjj0 vjj0Var) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new vjj0(0);
        } else {
            this.d = vjj0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public fmx0() {
        this(0);
    }

    public fmx0(int i) {
        Map f2 = b.f();
        vjj0 vjj0Var = new vjj0(0);
        this.b = false;
        this.c = f2;
        this.d = vjj0Var;
    }
}
