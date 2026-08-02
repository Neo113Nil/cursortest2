package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.kve;
import xsna.psn0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ive implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ive(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        boolean z = false;
        Object obj4 = a.C0011a.a;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj6;
                izs izsVar = (izs) obj5;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1789726498, intValue, -1, "com.vk.clips.playlists.folders.gridlist.ClipsPlaylistsSmallFoldersView.ThemedContent.<anonymous> (ClipsPlaylistsSmallFoldersView.kt:46)");
                }
                kve.a aVar2 = (kve.a) mtk0Var.getValue();
                if (aVar2 instanceof kve.a.b) {
                    aVar.K(-17957963);
                    kve.a.b bVar = (kve.a.b) aVar2;
                    q630 E = ahn.E(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Boolean) jk50.d(bVar.d, Boolean.TRUE, aVar, 48).getValue()).booleanValue() ? 16 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "PlaylistsSmallFoldersContainer");
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    ave.a(bVar, izsVar, aVar, 0);
                    aVar.G();
                    aVar.j();
                } else {
                    aVar.K(-17518910);
                    aVar.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                rg50 rg50Var = (rg50) obj6;
                wh50 wh50Var = (wh50) obj5;
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar4.J(colVar) ? 4 : 2;
                }
                if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-15241515, intValue2, -1, "com.vk.design.demo.presentation.screens.DefaultContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:217)");
                    }
                    q630 C = txj0.C(q630.a.a, null, 3);
                    if (rg50Var.getIntValue() == 0 && ((Boolean) wh50Var.getValue()).booleanValue()) {
                        z = true;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                    }
                    Object x = aVar4.x();
                    if (x == obj4) {
                        x = new psn0.a("Fixed");
                        aVar4.R(x);
                    }
                    psn0.a aVar5 = (psn0.a) x;
                    ((zak0) aVar5.b).setValue("Fixed");
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object x2 = aVar4.x();
                    if (x2 == obj4) {
                        x2 = new com.vk.movika.sdk.base.ui.k(23, rg50Var, wh50Var);
                        aVar4.R(x2);
                    }
                    colVar.c(z, (gzs) x2, C, aVar5, null, null, null, aVar4, ((intValue2 << 21) & 29360128) | Tensorflow.FRAME_WIDTH, 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                VideoProfileCreatorOnboardingVideoCounterView videoProfileCreatorOnboardingVideoCounterView = (VideoProfileCreatorOnboardingVideoCounterView) obj6;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj5;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                int i2 = VideoProfileCreatorOnboardingVideoCounterView.o;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-319552033, intValue3, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.ThemedContent.<anonymous> (VideoProfileCreatorOnboardingVideoCounterView.kt:78)");
                }
                Object x3 = aVar6.x();
                if (x3 == obj4) {
                    x3 = new fvq0(snapshotStateList, 11);
                    aVar6.R(x3);
                }
                videoProfileCreatorOnboardingVideoCounterView.B((izs) x3, aVar6, 70);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
