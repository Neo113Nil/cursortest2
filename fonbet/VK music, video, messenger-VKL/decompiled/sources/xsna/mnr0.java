package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LaunchContext;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dh6;

/* compiled from: VerificationStatusFragment.kt */
/* loaded from: classes18.dex */
public final class mnr0 extends jmu0 {
    public static final /* synthetic */ int j1 = 0;
    public final ComposeView h1;
    public final bpn0 i1 = new bpn0(new c9m0(this, 8));

    /* compiled from: VerificationStatusFragment.kt */
    public static final class a extends kmu0 {
        public final boolean h;

        public a(Context context, boolean z) {
            super(context, b.b);
            this.h = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            mnr0 mnr0Var = new mnr0(S0());
            mnr0Var.setArguments(yfb.b(new Pair("args_is_premium", Boolean.valueOf(this.h))));
            return mnr0Var;
        }
    }

    /* compiled from: VerificationStatusFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            mnr0.eo((mnr0) this.receiver);
            return s3q0.a;
        }
    }

    public mnr0(ComposeView composeView) {
        this.h1 = composeView;
    }

    public static final void eo(mnr0 mnr0Var) {
        maz.c(xwk.d().e(), mnr0Var.requireContext(), ((Boolean) mnr0Var.i1.getValue()).booleanValue() ? i5s.a(new StringBuilder("https://"), a0a.d, "/@business-otmetky-dlya-biznesa?anchor=otmetka-premium-biznes") : i5s.a(new StringBuilder("https://"), a0a.d, "/@business-otmetky-dlya-biznesa?anchor=otmetka-podtverzhd-nny-biznes"), LaunchContext.A, null, null, 24);
        mnr0Var.dismiss();
    }

    @Override // xsna.vpi
    public final ComposeView ao() {
        return this.h1;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-444823917);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-444823917, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.status.VerificationStatusFragment.ThemedContent (VerificationStatusFragment.kt:58)");
            }
            rrv0.a(null, null, kai.c(1635365099, new wmg(this, 8), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wa5(this, i, 14);
        }
    }

    /* compiled from: VerificationStatusFragment.kt */
    public static final class b implements dh6.a {
        public static final b b = new b();

        @Override // xsna.dh6.a
        public final void a() {
        }

        @Override // xsna.dh6.a
        public final void b() {
        }
    }
}
