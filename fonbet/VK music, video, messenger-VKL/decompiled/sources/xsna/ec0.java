package xsna;

import androidx.compose.ui.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ec0 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ec0(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                Path path = (Path) obj;
                long j = ((mxj0) obj2).a;
                int i = (int) (4294967295L & j);
                path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i));
                int i2 = (int) (j >> 32);
                path.b(0.25f * Float.intBitsToFloat(i2), Float.intBitsToFloat(i) * 0.85f, 0.34f * Float.intBitsToFloat(i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.b(0.66f * Float.intBitsToFloat(i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) * 0.75f, Float.intBitsToFloat(i) * 0.85f, Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
                break;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1209496885, intValue, -1, "com.vk.profile.core.scheduled_clips.ComposableSingletons$CommunityScheduledClipsGridViewKt.lambda$-1209496885.<anonymous> (CommunityScheduledClipsGridView.kt:123)");
                    }
                    ngh.b(CommunityProfileContentItem.ContentType.ITEMS, null, 0, 0, 0L, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-700786828, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$-700786828.<anonymous> (LinkVKBidScreenContent.kt:52)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    qzu0.a.getClass();
                    vjw.a(qzu0.q0(aVar2), null, f, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 25016, 104);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(866230231, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontLoadingKt.lambda$866230231.<anonymous> (StorefrontLoading.kt:104)");
                    }
                    com.vk.ecomm.design.compose.tile.b.a(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, MarketProductTileConfig.DisplayCtaButtonType.BOTTOM, aVar3, 27648, 7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue4, chatSettings != null ? Boolean.valueOf(chatSettings.r) : null);
                break;
            default:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                rdi.m(sQLiteStatement2, intValue5, conversationCard != null ? conversationCard.c : null);
                break;
        }
        return s3q0.a;
    }
}
