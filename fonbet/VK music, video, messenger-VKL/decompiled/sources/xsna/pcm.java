package xsna;

import androidx.compose.animation.core.RepeatMode;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.ldj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pcm implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pcm(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).I != null ? r0.j() : r10.F.j());
                return s3q0.a;
            default:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(1469938556);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1469938556, intValue, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.vkUIShimmer.<anonymous> (SubscriptionMenuItem.kt:132)");
                }
                q630 a = wdj0.a(q630Var, xx1.D(ldj0.b.a, tjv0.a((tjv0) aVar.r(ujv0.b), jq2.a(4, 0L, RepeatMode.Restart, new dtp0(600, 300, luo.d)), 0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 58), aVar, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a;
        }
    }
}
