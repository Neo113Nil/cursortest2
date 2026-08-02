package xsna;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.im.engine.models.dialogs.TransitionData;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.List;
import org.json.JSONObject;
import xsna.cri;
import xsna.dt1;
import xsna.ldj0;
import xsna.q630;
import xsna.vas0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sth implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sth(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(1280271416);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1280271416, intValue, -1, "com.vk.community.design.compose.communityUIShimmer.<anonymous> (CommunityProfileShimmer.kt:41)");
                }
                ldj0.b bVar = ldj0.b.a;
                tjv0 tjv0Var = (tjv0) aVar.r(ujv0.b);
                yuw a = jq2.a(4, 0L, RepeatMode.Restart, new dtp0(1200, 800, luo.a));
                long j = l5g.k;
                q630 a2 = wdj0.a(q630Var, xx1.D(bVar, tjv0.a(tjv0Var, a, 0, e43.l(new l5g(l5g.c(14, j, 1.0f)), new l5g(l5g.c(14, j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(l5g.c(14, j, 1.0f))), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 50), aVar, 64, 0));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a2;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(191175058, intValue2, -1, "com.vk.games.presentation.components.ComposableSingletons$GamesCatalogFooterLoaderKt.lambda$191175058.<anonymous> (GamesCatalogFooterLoader.kt:26)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 f = txj0.f(txj0.h(aVar3, 60), 1.0f);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.f;
                    cp10 d = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    zfr0.f(SpinnerState.Loading, ra8.a.b(aVar3, ty6Var), null, 0L, null, null, aVar2, 6, 60);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-830588921, intValue3, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$ServicesItemKt.lambda$-830588921.<anonymous> (ServicesItem.kt:113)");
                    }
                    if (a690.d(q630.a.a, 10, aVar5, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                vas0.a.C3879a c3879a = (vas0.a.C3879a) obj;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar6.J(c3879a) ? 4 : 2;
                }
                if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1063811832, intValue4, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoCellScreenContentKt.lambda$1063811832.<anonymous> (VideoCellScreenContent.kt:73)");
                    }
                    c3879a.a.f().c(VideoCellViewState.Size.Small, aVar6, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 4:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue5 = ((Integer) obj3).intValue();
                TransitionData transitionData = ((com.vk.im.engine.models.dialogs.b) obj2).a0;
                String str = null;
                if (transitionData != null) {
                    JSONObject jSONObject = new JSONObject();
                    List<Long> list = transitionData.b;
                    jSONObject.put("user_ids", list != null ? kvf.a(list) : null);
                    jSONObject.put("link", transitionData.c);
                    str = jSONObject.toString();
                }
                rdi.m(sQLiteStatement, intValue5, str);
                return s3q0.a;
            default:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                ((nov) obj3).e(f2l0.a, f2l0.b);
                return s3q0.a;
        }
    }
}
