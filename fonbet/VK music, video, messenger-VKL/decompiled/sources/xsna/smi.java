package xsna;

import androidx.compose.animation.core.RepeatMode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import kotlin.Triple;
import xsna.ldj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class smi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ smi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1022750165, intValue, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.ComposableSingletons$VideoProfileCreatorOnboardingItemsViewKt.lambda$-1022750165.<anonymous> (VideoProfileCreatorOnboardingItemsView.kt:117)");
                }
                q630 E = ahn.E(s200.H(txj0.f(q630.a.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5), "video_creators_onboarding_items_title");
                String N = d370.N(R.string.video_profile_creator_onboarding_title, 0, aVar);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.k;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(N, E, ylu0Var.getText().m, null, null, 0, 1, null, 0, false, 0, 0, null, frv0Var, aVar, 48, 0, 8120);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).r);
                return s3q0.a;
            case 2:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aVar2.K(-778455486);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-778455486, intValue2, -1, "com.vk.music.playlist.display.presentation.vkUIShimmer.<anonymous> (MusicPlaylistLoading.kt:354)");
                }
                q630 a = wdj0.a(q630Var, xx1.D(ldj0.b.a, tjv0.a((tjv0) aVar2.r(ujv0.b), jq2.a(4, 0L, RepeatMode.Restart, new dtp0(600, 300, luo.d)), 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 58), aVar2, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return a;
            case 3:
                int intValue3 = ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                nov novVar = (nov) obj3;
                novVar.e((intValue3 / 2.0f) - (novVar.getRealWidth() / 2.0f), f2l0.b);
                return s3q0.a;
            default:
                return new Triple((it80) obj, (it80) obj2, (it80) obj3);
        }
    }
}
