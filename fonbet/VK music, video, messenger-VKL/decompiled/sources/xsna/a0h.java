package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: CommunityCreationOnboardingItem.kt */
/* loaded from: classes5.dex */
public final class a0h extends we6 {
    public final c0h g;
    public final boolean h;
    public final i5f i;
    public final pff j;
    public final int k = -247;

    /* compiled from: CommunityCreationOnboardingItem.kt */
    public static final class a extends vif0<a0h> {
        public final gzs<s3q0> n;
        public final gzs<s3q0> o;
        public final wh50<a0h> p;

        public a(ComposeView composeView, boolean z, i5f i5fVar, pff pffVar) {
            super(composeView);
            this.n = i5fVar;
            this.o = pffVar;
            this.p = androidx.compose.runtime.k.b(null);
            composeView.setContent(new jai(-1103954792, new wzg(this, z, 0), true));
        }

        @Override // xsna.vif0
        public final void i6(a0h a0hVar) {
            ((zak0) this.p).setValue(a0hVar);
        }
    }

    public a0h(c0h c0hVar, boolean z, i5f i5fVar, pff pffVar) {
        this.g = c0hVar;
        this.h = z;
        this.i = i5fVar;
        this.j = pffVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setTag("community_creation_onboarding_block");
        return new a(composeView, this.h, this.i, this.j);
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
