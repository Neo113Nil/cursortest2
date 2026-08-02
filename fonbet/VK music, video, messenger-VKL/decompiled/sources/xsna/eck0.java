package xsna;

import android.content.Context;
import com.vk.dto.music.MusicTrack;
import com.vk.music.snippet.api.player.SnippetPlayerMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.qx4;

/* compiled from: SnippetPlayer.kt */
/* loaded from: classes3.dex */
public final class eck0 extends vn6 {
    public final fck0 e;
    public final Context f;
    public final SnippetPlayerMode g;
    public final lx4 h;
    public final tn6 i;
    public final Object j;

    /* compiled from: SnippetPlayer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetPlayerMode.values().length];
            try {
                iArr[SnippetPlayerMode.LONGTAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetPlayerMode.SNIPPET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eck0(dx40 dx40Var, fck0 fck0Var, Context context, SnippetPlayerMode snippetPlayerMode, lx4 lx4Var, ca50 ca50Var) {
        super(dx40Var, fck0Var);
        tn6 h600Var;
        tn6 tn6Var;
        this.e = fck0Var;
        this.f = context;
        this.g = snippetPlayerMode;
        this.h = lx4Var;
        int i = a.$EnumSwitchMapping$0[snippetPlayerMode.ordinal()];
        if (i == 1) {
            h600Var = new h600(dx40Var, ca50Var);
        } else {
            if (i != 2) {
                tn6Var = new w370();
                this.i = tn6Var;
                this.j = msy.a(LazyThreadSafetyMode.NONE, new dck0(this, 0));
                n(new obk0(tn6Var, new mqe0(this, 10), new dbj0(this, 3), null));
            }
            h600Var = new qbk0(dx40Var, ca50Var);
        }
        tn6Var = h600Var;
        this.i = tn6Var;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new dck0(this, 0));
        n(new obk0(tn6Var, new mqe0(this, 10), new dbj0(this, 3), null));
    }

    public static s3q0 p(eck0 eck0Var, bck0 bck0Var) {
        super.k(bck0Var);
        return s3q0.a;
    }

    @Override // xsna.zbk0
    public final MusicTrack i() {
        qx4 r = r();
        int i = qx4.a.$EnumSwitchMapping$0[r.a.ordinal()];
        if (i == 1) {
            return r.a().a().d();
        }
        if (i == 2) {
            return r.b().a().c().h.c;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.zbk0
    public final void k(bck0 bck0Var) {
        qx4 r = r();
        int i = qx4.a.$EnumSwitchMapping$0[r.a.ordinal()];
        if (i == 1) {
            dq4 a2 = r.a();
            a2.a().b(bck0Var.a.b, new fh1(1, a2, bck0Var), a2.b);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            r.c.invoke(r.b().a().d(bck0Var));
        }
    }

    @Override // xsna.zbk0
    public final void l(int i) {
        r().e();
        super.l(i);
    }

    @Override // xsna.zbk0
    public final void n(px40 px40Var) {
        super.n(new obk0(this.i, new hk70(this, 21), new cck0(this, 0), px40Var));
    }

    @Override // xsna.zbk0
    public final void o(int i) {
        r().e();
        super.o(i);
    }

    public final jx4 q() {
        qx4 r = r();
        int i = qx4.a.$EnumSwitchMapping$0[r.a.ordinal()];
        if (i == 1) {
            return r.a().a().c();
        }
        if (i == 2) {
            return r.b().a().c();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qx4 r() {
        return (qx4) this.j.getValue();
    }
}
