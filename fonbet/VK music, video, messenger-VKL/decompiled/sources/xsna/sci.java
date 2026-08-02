package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sci(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Peer peer;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-381519788, intValue, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.ComposableSingletons$ClipMetaCenteredViewKt.lambda$-381519788.<anonymous> (ClipMetaCenteredView.kt:75)");
                    }
                    qzu0.a.getClass();
                    lg90 E1 = qzu0.E1(aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(E1, null, null, ylu0Var.getIcon().c, aVar, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(ksyVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1282351433, intValue2, -1, "com.vk.profile.community.members.impl.ui.ComposableSingletons$MembersScreenKt.lambda$1282351433.<anonymous> (MembersScreen.kt:161)");
                    }
                    com.vk.profile.community.members.impl.ui.d.b(ksyVar, null, aVar2, intValue2 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1355333824, intValue3, -1, "com.vk.donut.privacy.levels.ComposableSingletons$PrivacyEditDonutLevelsViewKt.lambda$1355333824.<anonymous> (PrivacyEditDonutLevelsView.kt:97)");
                    }
                    String N = d370.N(R.string.donut_levels_subhead_video_privacy_without_all_dons, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.d0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), ylu0Var2.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar3, 48, 0, 8184);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                wzs wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar4.y(wzsVar) ? 4 : 2;
                }
                if (aVar4.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1416872206, intValue4, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$SubnavigationBarScreenContentKt.lambda$1416872206.<anonymous> (SubnavigationBarScreenContent.kt:478)");
                    }
                    o9v0.a("Оппа", rdi.z(true, null, null, aVar4, 6, 6), null, null, null, null, null, null, null, null, null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(-2118324901, new bo3(wzsVar, 7), aVar4), aVar4, 6, 805306368, 524284);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1498106260, intValue5, -1, "com.vk.core.compose.component.ComposableSingletons$VkTopBarKt.lambda$-1498106260.<anonymous> (VkTopBar.kt:79)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue6 = ((Integer) obj3).intValue();
                BotKeyboard botKeyboard = ((com.vk.im.engine.models.dialogs.b) obj2).D;
                rdi.k(sQLiteStatement, intValue6, botKeyboard != null ? Integer.valueOf(botKeyboard.e) : null);
                return s3q0.a;
            case 6:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue7 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.l(sQLiteStatement2, intValue7, (chatSettings == null || (peer = chatSettings.d) == null) ? null : Long.valueOf(peer.d));
                return s3q0.a;
            default:
                bv6 bv6Var = (bv6) obj2;
                bv6 bv6Var2 = (bv6) obj3;
                dk70[] dk70VarArr = (dk70[]) ((bv6) obj).a;
                if (dk70VarArr == null) {
                    dk70VarArr = new dk70[0];
                }
                return new kj70(dk70VarArr);
        }
    }
}
