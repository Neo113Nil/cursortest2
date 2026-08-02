package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.zzw0;

/* compiled from: VoipSelectVideoAdapter.kt */
/* loaded from: classes7.dex */
public final class uzw0 extends sxm {
    public final s0x0<vzw0> i;

    /* compiled from: VoipSelectVideoAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ViewGroup, r0x0> {
        public static final a b = new a(1, r0x0.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final r0x0 invoke(ViewGroup viewGroup) {
            return new r0x0(R.layout.voip_item_divider, viewGroup);
        }
    }

    /* compiled from: VoipSelectVideoAdapter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ViewGroup, d0x0> {
        public static final b b = new b(1, d0x0.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final d0x0 invoke(ViewGroup viewGroup) {
            return new d0x0(viewGroup);
        }
    }

    /* compiled from: VoipSelectVideoAdapter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ViewGroup, a0x0> {
        public static final c b = new c(1, a0x0.class, "<init>", "<init>(Landroid/view/ViewGroup;)V", 0);

        @Override // xsna.izs
        public final a0x0 invoke(ViewGroup viewGroup) {
            return new a0x0(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uzw0(s0x0<? super vzw0> s0x0Var) {
        this.i = s0x0Var;
        H0(new Pair(fpf0.a(zzw0.h.class), new anw0(this, 2)));
        H0(new Pair(fpf0.a(zzw0.g.class), a.b));
        H0(new Pair(fpf0.a(zzw0.a.class), b.b));
        H0(new Pair(fpf0.a(zzw0.e.class), new fda0(this, 29)));
        H0(new Pair(fpf0.a(zzw0.d.class), new z4t0(this, 13)));
        H0(new Pair(fpf0.a(zzw0.b.class), new iyd0(this, 26)));
        H0(new Pair(fpf0.a(zzw0.c.class), c.b));
    }
}
