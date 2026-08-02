package xsna;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PrefetchByTrackListUpdatePlugin.kt */
/* loaded from: classes.dex */
public final class lzc0 implements pr4 {
    public static final a f = new a();
    public final gzs<Boolean> a;
    public final z58 b;
    public final b c = new b();
    public final atr d = new atr();
    public List<ur4> e = EmptyList.b;

    /* compiled from: PrefetchByTrackListUpdatePlugin.kt */
    public static final class a implements bgk0 {
        public final String toString() {
            return "PREFETCH_BY_TRACKLIST_UPDATE";
        }
    }

    /* compiled from: PrefetchByTrackListUpdatePlugin.kt */
    public final class b extends o56 {
        public b() {
        }

        @Override // xsna.o56, xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            lzc0.this.a(ir4Var);
        }
    }

    public lzc0(gzs gzsVar, z58 z58Var) {
        this.a = gzsVar;
        this.b = z58Var;
    }

    public final synchronized void a(ir4 ir4Var) {
        boolean booleanValue = this.a.invoke().booleanValue();
        this.b.invoke();
        Integer num = 3;
        int intValue = num.intValue();
        if (booleanValue && intValue > 0) {
            List<ur4> n = ir4Var.n();
            ur4 b2 = ir4Var.b();
            if (!n.isEmpty() && b2 != null) {
                int indexOf = n.indexOf(b2);
                if (indexOf < 0) {
                    return;
                }
                List<ur4> subList = n.subList(indexOf, Math.min(intValue + indexOf, n.size()));
                LinkedHashSet E0 = j5g.E0(this.e, subList);
                a aVar = f;
                ir4Var.x(this.d, E0);
                ir4Var.F(aVar, this.d, subList);
                this.e = subList;
            }
        }
    }

    @Override // xsna.pr4
    public final synchronized void u(ir4 ir4Var) {
        ir4Var.v(this.c);
        a(ir4Var);
    }
}
