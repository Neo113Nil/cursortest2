package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class eki implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eki(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1475961000, intValue, -1, "com.vk.im.reactions.impl.reacted_peers.ComposableSingletons$ReactedPeersModalKt.lambda$1475961000.<anonymous> (ReactedPeersModal.kt:234)");
                    }
                    vjw.a(lg90Var, null, txj0.q(q630.a.a, 28), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 440 | (intValue & 14), 120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                BusinessNotifyInfo businessNotifyInfo = ((com.vk.im.engine.models.dialogs.b) obj2).M;
                rdi.l(sQLiteStatement, intValue2, businessNotifyInfo != null ? Long.valueOf(businessNotifyInfo.b) : null);
                break;
        }
        return s3q0.a;
    }
}
