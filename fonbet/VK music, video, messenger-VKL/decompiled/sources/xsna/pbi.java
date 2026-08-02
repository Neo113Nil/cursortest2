package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.messages.PinnedMsg;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.ldj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pbi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pbi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(382385051, intValue, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.author_selection.ComposableSingletons$AuthorSelectionViewKt.lambda$382385051.<anonymous> (AuthorSelectionView.kt:90)");
                    }
                    SeparatorDpi separatorDpi = SeparatorDpi.At2x;
                    q630.a aVar2 = q630.a.a;
                    ijv0.a(separatorDpi, SeparatorAppearance.Secondary, true, txj0.f(aVar2, 1.0f), null, aVar, 3510, 16);
                    if (a690.d(aVar2, kqu0.r, aVar, 0)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-315893904, intValue2, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.ComposableSingletons$CommunityProfileContentServicesViewHolderKt.lambda$-315893904.<anonymous> (CommunityProfileContentServicesViewHolder.kt:291)");
                    }
                    iih.a(0, 0L, aVar3, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.l(sQLiteStatement, intValue3, chatSettings != null ? Long.valueOf(chatSettings.I) : null);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                rdi.j(sQLiteStatement2, intValue4, pinnedMsg != null ? Boolean.valueOf(pinnedMsg.m) : null);
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar4.K(-991936565);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-991936565, intValue5, -1, "com.vk.ecomm.cart.impl.common.ui.compose.vkuiShimmer.<anonymous> (Shimmer.kt:58)");
                }
                q630 a = wdj0.a(q630Var, xx1.D(ldj0.b.a, tjv0.a((tjv0) aVar4.r(ujv0.b), null, 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 59), aVar4, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return a;
        }
    }
}
