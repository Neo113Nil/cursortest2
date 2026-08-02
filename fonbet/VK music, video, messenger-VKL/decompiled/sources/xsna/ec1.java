package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.wall.dto.WallGetResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashSet;
import kotlin.Triple;
import xsna.efu;
import xsna.ldj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ec1 implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ec1(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Peer peer;
        MsgTextFormat msgTextFormat;
        int i = this.b;
        q630.a aVar = q630.a.a;
        Long l = null;
        r6 = null;
        String str = null;
        l = null;
        switch (i) {
            case 0:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar2.K(1557696021);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1557696021, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.loadingShimmer.<anonymous> (AiAssistantCard.kt:442)");
                }
                ldj0.b bVar = ldj0.b.a;
                tjv0 tjv0Var = (tjv0) aVar2.r(ujv0.b);
                long j = l5g.d;
                q630 a = wdj0.a(q630Var, xx1.D(bVar, tjv0.a(tjv0Var, null, 9, e43.l(new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(l5g.c(14, j, 0.8f)), new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), e43.l(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(0.5f), Float.valueOf(1.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 37), aVar2, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
            case 1:
                return new Triple((WallGetResponseDto) obj, (it80) obj2, (it80) obj3);
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(571304369, intValue2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.ComposableSingletons$OrderContentKt.lambda$571304369.<anonymous> (OrderContent.kt:68)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    float f = kqu0.b;
                    jqu0.a(s200.H(hr80.m(aVar, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, (float) 0.5d, 2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 0, 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(182979664, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontAlbumsLoadingKt.lambda$182979664.<anonymous> (StorefrontAlbumsLoading.kt:22)");
                    }
                    dsy a2 = gsy.a(0, 3, aVar4);
                    Context context = (Context) aVar4.r(AndroidCompositionLocals_androidKt.b);
                    HashSet hashSet = iah0.a;
                    int i2 = fnj.d(context) ? 3 : 2;
                    q630 f2 = txj0.f(aVar, 1.0f);
                    efu.b bVar2 = new efu.b(i2);
                    float f3 = 12;
                    float f4 = 16;
                    u890 u890Var = new u890(f4, f3, f4, f4);
                    a.j g = androidx.compose.foundation.layout.a.g(f3);
                    a.j g2 = androidx.compose.foundation.layout.a.g(f3);
                    Object x = aVar4.x();
                    if (x == a.C0011a.a) {
                        x = new sm0(13);
                        aVar4.R(x);
                    }
                    uqy.b(bVar2, f2, a2, u890Var, g, g2, null, false, null, (izs) x, aVar4, 102432816, 6, 656);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue4 = ((Integer) obj3).intValue();
                BotKeyboard botKeyboard = ((com.vk.im.engine.models.dialogs.b) obj2).D;
                if (botKeyboard != null && (peer = botKeyboard.b) != null) {
                    l = Long.valueOf(peer.d);
                }
                rdi.l(sQLiteStatement, intValue4, l);
                return s3q0.a;
            case 5:
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                PinnedMsg pinnedMsg = ((com.vk.im.engine.models.dialogs.b) obj2).t;
                if (pinnedMsg != null && (msgTextFormat = pinnedMsg.h) != null) {
                    str = msgTextFormat.zb();
                }
                rdi.m(sQLiteStatement2, intValue5, str);
                return s3q0.a;
            default:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj;
                GroupCallViewModel.GroupCallViewMode groupCallViewMode = (GroupCallViewModel.GroupCallViewMode) obj3;
                dhw0 dhw0Var = (dhw0) ((it80) obj2).a;
                return new pna0(voipViewModelState, groupCallViewMode, (dhw0Var != null ? dhw0Var.z : null) != null, (dhw0Var != null ? dhw0Var.y : null) != null);
        }
    }
}
