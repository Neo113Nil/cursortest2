package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.libvideo.video.queue.api.di.VideoQueueComponent;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.webapp.fragments.ReportFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.c0s0;
import xsna.l9s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nrq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nrq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((orq0) obj).e.f());
            case 1:
                return (Activity) ((vxq0) obj).n.get();
            case 2:
                c0s0 c0s0Var = (c0s0) obj;
                c0s0.b bVar = c0s0Var.i1;
                if (bVar != null) {
                    bVar.c();
                }
                c0s0Var.dismiss();
                return s3q0.a;
            case 3:
                int i2 = VideoCatalogFragment.l0;
                return ((VideoAutologinComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(VideoAutologinComponent.class))).S6();
            case 4:
                int i3 = VideoCatalogRootVh.M0;
                l9s0.a.a((Context) obj, null);
                return s3q0.a;
            case 5:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                return new bus0(new i6m0(videoMinimizableDiscoveryFragment, 13), videoMinimizableDiscoveryFragment.requireContext());
            case 6:
                return ((com.vk.libvideo.screen.a) obj).p;
            case 7:
                int i5 = VideoSkippablePartView.C;
                return ((VideoQueueComponent) ((k7m) m7m.c((VideoSkippablePartView) obj)).mo408a(fpf0.a(VideoQueueComponent.class))).fc();
            case 8:
                ggu0 ggu0Var = (ggu0) obj;
                BrowserPerfState browserPerfState = ggu0Var.B;
                if (browserPerfState != null) {
                    browserPerfState.k = BrowserPerfState.a.a(BrowserPerfState.CREATOR);
                }
                ggu0Var.C.R().l0();
                return s3q0.a;
            case 9:
                return (Toolbar) ((oxw0) obj).findViewById(R.id.toolbar);
            default:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                int i6 = WebViewFragment.O0;
                int i7 = ReportFragment.a0;
                ReportFragment.a a = ReportFragment.b.a();
                a.K(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                a.G((UserId) webViewFragment.requireArguments().getParcelable("ownerID"));
                a.B(webViewFragment.requireArguments().getLong(InneractiveMediationDefs.REMOTE_KEY_APP_ID));
                a.k(webViewFragment.requireContext());
                return null;
        }
    }
}
