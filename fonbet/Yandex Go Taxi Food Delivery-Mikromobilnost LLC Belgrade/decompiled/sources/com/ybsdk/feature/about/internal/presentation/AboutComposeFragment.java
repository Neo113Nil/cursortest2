package com.ybsdk.feature.about.internal.presentation;

import com.ybsdk.core.compose.ComposeFragment;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.tls;
import defpackage.vfc;
import defpackage.vng;
import defpackage.w8f;
import defpackage.y4;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.z4;
import defpackage.zwv;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/about/internal/presentation/AboutComposeFragment;", "Lcom/ybsdk/core/compose/ComposeFragment;", "Lyvf0;", "Lcom/ybsdk/feature/about/internal/presentation/b;", "viewModelProvider", "<init>", "(Lyvf0;)V", "Lzy11;", "Content", "(Lfid;I)V", "Lyvf0;", "feature-about_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AboutComposeFragment extends ComposeFragment {
    public static final int $stable = 8;
    private final yvf0 viewModelProvider;

    public AboutComposeFragment(yvf0 yvf0Var) {
        this.viewModelProvider = yvf0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b Content$lambda$1$lambda$0(AboutComposeFragment aboutComposeFragment, y8f y8fVar) {
        return (b) aboutComposeFragment.viewModelProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$2(AboutComposeFragment aboutComposeFragment, int i, fid fidVar, int i2) {
        aboutComposeFragment.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    @Override // com.ybsdk.core.compose.ComposeFragment
    public void Content(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1623493983);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            btsVar.e0(5004770);
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new y4(i3, this);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            btsVar.t(false);
            btsVar.f0(419377738);
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                yr31 G = ooc.G(qoi0.a(b.class), a, null, vfc.h(b.class, new zwv(), tlsVar), a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                a.c((b) G, btsVar, 0);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(this, i, i3);
        }
    }
}
