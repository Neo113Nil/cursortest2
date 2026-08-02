package xsna;

import kotlin.Pair;

/* compiled from: CommunityCreationOnboardingItem.kt */
/* loaded from: classes5.dex */
public final class zzg {
    public final /* synthetic */ boolean a;

    public zzg(boolean z) {
        this.a = z;
    }

    public final void a(Pair pair, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(180246235);
        if ((i & 6) == 0) {
            i2 = (M.J(pair) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1155) != 1154)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(180246235, i2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityCreationOnboardingItem.CommunityNewOnBoardingHolder.<anonymous>.<anonymous>.<no name provided>.Invoke (CommunityCreationOnboardingItem.kt:71)");
            }
            d8v0.a(pair, null, null, null, false, false, this.a, null, jaiVar, M, (i2 & 14) | ((i2 << 21) & 1879048192), 446);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yzg(this, pair, jaiVar, i);
        }
    }
}
