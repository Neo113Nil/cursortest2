package xsna;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ybi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ybi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s3q0 a;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(289167381, intValue, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.ComposableSingletons$CartContentKt.lambda$289167381.<anonymous> (CartContent.kt:120)");
                }
                jw9.a(null, aVar, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(937047674, intValue2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.ComposableSingletons$LinkVKBidScreenContentKt.lambda$937047674.<anonymous> (LinkVKBidScreenContent.kt:82)");
                    }
                    q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a), 1.0f);
                    String N = d370.N(R.string.link_vkbid_description, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.T;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, f, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).l);
                return s3q0.a;
            case 3:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                vjm vjmVar = ((com.vk.im.engine.models.dialogs.b) obj2).e;
                rdi.l(sQLiteStatement, intValue3, vjmVar != null ? Long.valueOf(vjmVar.a()) : null);
                return s3q0.a;
            default:
                a = com.ironsource.mediationsdk.s.a((LevelPlay.AdFormat) obj, (Integer) obj2, (String) obj3);
                return a;
        }
    }
}
