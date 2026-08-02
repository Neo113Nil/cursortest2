package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wgi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wgi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 d1;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1366705980, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$1366705980.<anonymous> (LinkVKBidScreenContent.kt:66)");
                    }
                    q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), 1.0f);
                    String N = d370.N(R.string.link_vkbid_title, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.C;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, f, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar, 48, 0, 8120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-62512405, intValue2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.ComposableSingletons$PicturePageKt.lambda$-62512405.<anonymous> (PicturePage.kt:109)");
                }
                qka0.b(txj0.d(q630.a.a, 1.0f), aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.j(sQLiteStatement, intValue3, chatSettings != null ? Boolean.valueOf(chatSettings.t) : null);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                ConversationCard conversationCard = ((com.vk.im.engine.models.dialogs.b) obj2).x;
                rdi.m(sQLiteStatement2, intValue4, conversationCard != null ? conversationCard.e : null);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar3.K(1839931523);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1839931523, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.TopPlayerControls.Right.AdvertisementButtons.Content.<anonymous>.<anonymous> (TopPlayerControls.kt:549)");
                }
                if (booleanValue) {
                    aVar3.K(-1352330230);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(aVar3);
                } else {
                    aVar3.K(-1352329559);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(aVar3);
                }
                aVar3.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return d1;
        }
    }
}
