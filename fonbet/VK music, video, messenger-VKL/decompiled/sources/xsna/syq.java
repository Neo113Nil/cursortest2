package xsna;

import android.widget.TextView;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.rmw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class syq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ syq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                tyq tyqVar = (tyq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(716616803, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedEnhancedLinkCardScreenContent.ItemList.<anonymous>.<anonymous>.<anonymous> (FeedEnhancedLinkCardScreenContent.kt:84)");
                    }
                    tyqVar.j("Image + Description Footer", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) this.c;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                TabLayout.g gVar = (TabLayout.g) obj3;
                CharSequence charSequence = gVar.c;
                ce40 ce40Var = new ce40(gVar.h.getContext(), musicOfflineCatalogRootVh.x);
                ce40Var.setText(charSequence);
                int a = iah0.a(40);
                TextView textView = ce40Var.N;
                if (textView != null) {
                    textView.setMinWidth(a);
                }
                ce40Var.setMode(Tab$Mode.Default);
                if (textView != null) {
                    textView.setTextAlignment(4);
                }
                ce40Var.setVisibility(charSequence != null ? 0 : 8);
                return ce40Var;
            case 2:
                SkeletonScreenContent skeletonScreenContent = (SkeletonScreenContent) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-741130882, intValue2, -1, "com.vk.design.demo.presentation.screens.SkeletonScreenContent.ComposeContent.<anonymous> (SkeletonScreenContent.kt:109)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630.a aVar3 = q630.a.a;
                    q630 c = qri.c(aVar2, aVar3);
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
                    k9q0.w(aVar2, a2, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    skeletonScreenContent.c(SkeletonType.Block, aVar2, 70);
                    skeletonScreenContent.c(SkeletonType.Circle, aVar2, 70);
                    String str = skeletonScreenContent.d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    erv0.b(str, s200.D(txj0.f(aVar3, 1.0f), 4.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, 0, 0, null, wuv0Var.T, aVar2, 48, 0, 2044);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                VideoMetaViewState.DownloadStatus downloadStatus = (VideoMetaViewState.DownloadStatus) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1326937914, intValue3, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.DownloadStatusView.<anonymous>.<anonymous>.<anonymous> (VideoMetaView.kt:273)");
                    }
                    pzu0.b(rmw.b.a(null, downloadStatus.i(), aVar5, 0, 3), null, null, downloadStatus.h().a(0, aVar5), aVar5, 56, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}
