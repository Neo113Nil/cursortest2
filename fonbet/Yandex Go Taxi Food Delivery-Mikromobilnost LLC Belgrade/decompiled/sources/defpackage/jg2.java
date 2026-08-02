package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class jg2 implements rfd {
    public final /* synthetic */ int a = 1;
    public final ComposeAnimation b;
    public final Object c;

    public jg2(dy01 dy01Var) {
        this.b = dy01Var;
        this.c = new nax0(dy01Var.a().c(), dy01Var.a().d.getValue());
    }

    @Override // defpackage.rfd
    public final long a() {
        switch (this.a) {
            case 0:
                Object S = a.S(0, ((kg2) this.b).a.j);
                zx01 zx01Var = S instanceof zx01 ? (zx01) S : null;
                if (zx01Var == null) {
                    return 0L;
                }
                long longValue = ((Number) zx01Var.l.getValue()).longValue();
                int i = yx21.a;
                return (longValue + 999999) / 1000000;
            default:
                long longValue2 = ((Number) ((dy01) this.b).a().l.getValue()).longValue();
                int i2 = yx21.a;
                return (longValue2 + 999999) / 1000000;
        }
    }

    @Override // defpackage.rfd
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                zx01 zx01Var = ((kg2) this.b).a;
                Pair pair = jl40.l((String) obj, "Enter") ? new Pair(Boolean.FALSE, Boolean.TRUE) : new Pair(Boolean.TRUE, Boolean.FALSE);
                Boolean bool = (Boolean) pair.getFirst();
                bool.getClass();
                Boolean bool2 = (Boolean) pair.getSecond();
                bool2.getClass();
                zx01Var.j(bool, bool2);
                break;
            default:
                nax0 nax0Var = (nax0) obj;
                ((dy01) this.b).a().j(nax0Var.a, nax0Var.b);
                break;
        }
    }

    public jg2(kg2 kg2Var) {
        String str;
        this.b = kg2Var;
        if (((Boolean) kg2Var.a.c()).booleanValue()) {
            str = "Exit";
        } else {
            str = "Enter";
        }
        this.c = str;
    }
}
