package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Liae0;", "Ln96;", "Lc6z;", "Companion", "hae0", "gae0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class iae0 extends n96 implements c6z {
    public static final hae0 Companion = new hae0();
    public static final i3y[] f = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new mlc0(25)), null, null};
    public static final iae0 g = new iae0(0);
    public final boolean b;
    public final Map c;
    public final f4g0 d;
    public final o1g0 e;

    public /* synthetic */ iae0(int i, boolean z, Map map, f4g0 f4g0Var, o1g0 o1g0Var) {
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
            this.d = new f4g0(0);
        } else {
            this.d = f4g0Var;
        }
        if ((i & 8) == 0) {
            this.e = new o1g0(0);
        } else {
            this.e = o1g0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean c(String str) {
        CharSequence charSequence = (CharSequence) this.c.get(str);
        return !(charSequence == null || evu0.J(charSequence));
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public iae0() {
        this(0);
    }

    public iae0(int i) {
        Map f2 = b.f();
        f4g0 f4g0Var = new f4g0(0);
        o1g0 o1g0Var = new o1g0(0);
        this.b = false;
        this.c = f2;
        this.d = f4g0Var;
        this.e = o1g0Var;
    }
}
