package xsna;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.music.snippet.api.player.SnippetPlayerMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AudioSnippetQueueComposite.kt */
/* loaded from: classes3.dex */
public final class qx4 {
    public final SnippetPlayerMode a;
    public final Context b;
    public final r9c0 c;
    public final lx4 d;
    public final mlf0 e;
    public final a2a f;
    public final Object g;
    public final Object h;

    /* compiled from: AudioSnippetQueueComposite.kt */
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

    public qx4(SnippetPlayerMode snippetPlayerMode, Context context, r9c0 r9c0Var, lx4 lx4Var, mlf0 mlf0Var, a2a a2aVar) {
        this.a = snippetPlayerMode;
        this.b = context;
        this.c = r9c0Var;
        this.d = lx4Var;
        this.e = mlf0Var;
        this.f = a2aVar;
        sa0 sa0Var = new sa0(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, sa0Var);
        this.h = msy.a(lazyThreadSafetyMode, new im0(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dq4 a() {
        return (dq4) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tx4 b() {
        return (tx4) this.h.getValue();
    }

    public final tx4 c() {
        SnippetPlayerMode snippetPlayerMode = SnippetPlayerMode.SNIPPET;
        if (this.a == snippetPlayerMode) {
            return b();
        }
        throw new IllegalStateException("This action is only applicable to the player mode " + snippetPlayerMode);
    }

    public final void d(bck0 bck0Var) {
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b().a.invoke();
            return;
        }
        a();
        dq4 a2 = a();
        rx4 rx4Var = a2.b;
        if (a2.a().c().e) {
            rx4Var.invoke();
            return;
        }
        i600 a3 = a2.a().a();
        long j = a3.c;
        long j2 = a3.b;
        if (0 > j2 || j2 >= j) {
            a3 = null;
        }
        if (a3 != null) {
            a2.a.invoke(bck0.a(bck0Var, kx40.a(bck0Var.a, new uz4(a3.d, 4), new wva0(a3.b, a3.c), null, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE)));
        } else {
            rx4Var.invoke();
        }
    }

    public final void e() {
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        if (i == 1) {
            a().a().release();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b().a().release();
        }
    }
}
