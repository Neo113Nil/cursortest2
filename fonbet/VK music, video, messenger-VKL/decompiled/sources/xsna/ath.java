package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ath implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ath(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                CommunityProfileContent communityProfileContent = (CommunityProfileContent) obj;
                xrh xrhVar = (xrh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj3;
                if (communityProfileContent == null) {
                    return null;
                }
                return new CommunityProfileViewState.Data.b(communityProfileContent, xrhVar instanceof xrh.d ? (xrh.d) xrhVar : null, extendedCommunityProfile);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1774372156, intValue, -1, "com.vk.design.demo.presentation.screens.feed.ComposableSingletons$FeedInlineCommentsScreenContentKt.lambda$-1774372156.<anonymous> (FeedInlineCommentsScreenContent.kt:159)");
                    }
                    f9t.e(txj0.q(q630.a.a, 32), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1380439993, intValue2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.ComposableSingletons$MusicPickerItemsKt.lambda$1380439993.<anonymous> (MusicPickerItems.kt:647)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 j = txj0.j(158, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f));
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, j);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar3, dt1.a.f), null, 0L, null, null, aVar2, 6, 60);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).O);
                return s3q0.a;
        }
    }
}
