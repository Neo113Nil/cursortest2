package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.messagetemplates.impl.keyboard.b;
import com.vk.profile.community.members.impl.domain.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import xsna.ipq;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class opq implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ opq(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                e64 e64Var = (e64) this.c;
                e64 e64Var2 = (e64) this.d;
                e64 e64Var3 = (e64) this.e;
                em50 em50Var = (em50) obj;
                ipq ipqVar = (ipq) obj2;
                if (ipqVar instanceof hpq) {
                    return em50Var.a(e64Var, ipqVar);
                }
                if (ipqVar instanceof ipq.a) {
                    return em50Var.a(e64Var2, ipqVar);
                }
                if (ipqVar instanceof ipq.b) {
                    return em50Var.a(e64Var3, ipqVar);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                jai jaiVar = (jai) this.c;
                khx khxVar = (khx) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1187672287, intValue, -1, "com.vk.core.compose.component.internal.InternalTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:235)");
                    }
                    jaiVar.invoke(khxVar, new wow(arrayList), aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.profile.community.members.impl.ui.d.h((User) this.c, (q630) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                xvy xvyVar = (xvy) this.c;
                k150 k150Var = (k150) this.d;
                us2 us2Var = (us2) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-386249618, intValue2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.Component.<anonymous>.<anonymous> (MusicPlaylistListContent.kt:104)");
                    }
                    q630 E = ahn.E(q630.a.a, "musicPlaylistColumn");
                    boolean J = aVar2.J(k150Var) | aVar2.J(us2Var);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new n9(17, k150Var, us2Var);
                        aVar2.R(x);
                    }
                    lqy.a(E, xvyVar, null, null, null, null, false, null, (izs) x, aVar2, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                ue70.e(ne7.I(385), (androidx.compose.runtime.a) obj, list, izsVar, q630Var);
                return s3q0.a;
            case 5:
                return ((Signaling) this.c).a((Signaling.Listener) this.d, (Signaling.Listener) this.e, (SignalingCommand) obj, (Long) obj2);
            case 6:
                ((Integer) obj2).getClass();
                ((lvn0) this.c).k((nwn0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            default:
                com.vk.messagetemplates.impl.keyboard.h hVar = (com.vk.messagetemplates.impl.keyboard.h) this.c;
                bn50 bn50Var = (bn50) this.d;
                ck3 ck3Var = (ck3) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(524214813, intValue3, -1, "com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardFactoryImpl.ScreenContent.<anonymous>.<anonymous> (TemplatesKeyboardFactoryImpl.kt:73)");
                    }
                    float j1 = ((azl) aVar3.r(uvi.h)).j1(ck3Var.d);
                    boolean y = aVar3.y(bn50Var);
                    Object x2 = aVar3.x();
                    if (y || x2 == a.C0011a.a) {
                        x2 = new b.c(1, bn50Var, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar3.R(x2);
                    }
                    m9o0.b(hVar, (izs) ((fcy) x2), txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j1, 1, q630.a.a), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ opq(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
