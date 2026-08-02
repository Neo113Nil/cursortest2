package xsna;

import android.util.TypedValue;
import java.util.List;
import xsna.ene;

/* compiled from: ClipsNotInterestedModalCard.kt */
/* loaded from: classes17.dex */
public final class gne extends jmu0 {
    public static final /* synthetic */ int j1 = 0;
    public List<cne> h1;
    public ix2 i1;

    /* compiled from: ClipsNotInterestedModalCard.kt */
    public static final class a extends kmu0 {
        public final List<cne> h;
        public final ix2 i;

        public a(l7s l7sVar, ene.a aVar, List list, ix2 ix2Var) {
            super(l7sVar, aVar);
            this.h = list;
            this.i = ix2Var;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            gne gneVar = new gne();
            gneVar.h1 = this.h;
            gneVar.i1 = this.i;
            return gneVar;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-442051842);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-442051842, 8, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.card.ClipsNotInterestedModalCard.ThemedContent (ClipsNotInterestedModalCard.kt:29)");
        }
        TypedValue typedValue = krv0.a;
        int i2 = this.A0;
        dhr0 dhr0Var = krv0.b;
        rrv0.e(epx.f(dhr0Var != null ? Boolean.valueOf(dhr0Var.O(i2)) : null, Boolean.TRUE), null, null, null, null, null, kai.c(1497571489, new fne(this, 0), aVar), aVar, 1572864, 62);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
