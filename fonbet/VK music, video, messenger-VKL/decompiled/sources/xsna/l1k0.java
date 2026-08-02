package xsna;

import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.verification.account.b;
import com.vk.voip.ui.history.friends.ui.a;
import java.util.ArrayList;
import java.util.List;
import xsna.bqw0;
import xsna.dai;
import xsna.f6x0;
import xsna.gm50;
import xsna.h6x0;
import xsna.o0r0;
import xsna.sum0;
import xsna.wyv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l1k0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l1k0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dai.c a;
        kbe kbeVar;
        List list;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                SliderView.c cVar = (SliderView.c) obj2;
                bwj bwjVar = (bwj) ((izs) obj3).invoke((dwj) obj);
                if (bwjVar == null) {
                    return null;
                }
                cVar.c.add(bwjVar);
                return bwjVar;
            case 1:
                ((izs) obj3).invoke(sum0.d.a((sum0.d) obj2, null, null, null, false, null, false, null, false, 0, (sum0.b) obj, false, false, 3583));
                return s3q0.a;
            case 2:
                ymq0 ymq0Var = (ymq0) obj3;
                Clips clips = (Clips) obj2;
                VKList vKList = (VKList) ((it80) obj).a;
                if (vKList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : vKList) {
                        if (((ClipsPlaylist) obj4).e != 0) {
                            arrayList.add(obj4);
                        }
                    }
                    Clips i3 = Clips.i(clips, null, null, null, null, false, false, null, null, null, null, null, null, false, 524287);
                    int i4 = dnq0.a;
                    ymq0Var.z(dnq0.b(i3, arrayList, vKList.j(), false));
                }
                return s3q0.a;
            case 3:
                VideoFile videoFile = (VideoFile) obj3;
                gzs gzsVar = (gzs) obj2;
                wjs0.a(videoFile.O9() ? new hxr0(videoFile, ((d7z) obj).d) : new dyr0(videoFile));
                if (gzsVar != null) {
                    return (s3q0) gzsVar.invoke();
                }
                return null;
            case 4:
                ((Boolean) obj).getClass();
                ((VideoAuthorView) obj3).i = null;
                ((y4) obj2).invoke();
                return s3q0.a;
            case 5:
                int i5 = VideoBottomPanelView.Q;
                xwk.e().m(((VideoBottomPanelView) obj3).getContext(), ((VideoFile) obj2).I0(), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 6:
                m9o m9oVar = (m9o) obj3;
                String str = (String) obj2;
                Object tag = ((View) obj).getTag();
                j8o j8oVar = tag instanceof j8o ? (j8o) tag : null;
                if (j8oVar == null) {
                    return s3q0.a;
                }
                VideoFile videoFile2 = m9oVar.c;
                String str2 = m9oVar.a;
                if (videoFile2 != null) {
                    j8oVar.a(videoFile2);
                    if (epx.f(str2, str != null ? j8oVar.c(str) : null)) {
                        j8oVar.b(m9oVar.b, str2);
                    }
                }
                return s3q0.a;
            case 7:
                String str3 = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                VideoCellViewState.c a2 = ((VideoLargeListTabletView.d) obj3).c.a();
                if (a2 != null && (a = a2.a()) != null && (kbeVar = a.c) != null) {
                    bgi0.c(tgi0Var, kbeVar);
                }
                if (str3 != null) {
                    bgi0.d(tgi0Var, str3);
                }
                qgi0.r(tgi0Var, "mvi_catalog_large_video_card_test_tag");
                return s3q0.a;
            case 8:
                tzu0 tzu0Var = (tzu0) obj3;
                tzu0Var.c((WebIdentityContext) obj2);
                tzu0Var.a();
                return s3q0.a;
            case 9:
                wyv0 wyv0Var = (wyv0) obj3;
                List list2 = (List) obj2;
                com.vk.superapp.verification.account.d dVar = wyv0Var.e;
                if (dVar != null) {
                    dVar.I = true;
                }
                wyv0.a aVar = wyv0Var.h;
                wyv0Var.n((aVar == null || !aVar.c || (list = list2) == null || list.isEmpty()) ? b.k.h : new b.c(list2));
                return s3q0.a;
            case 10:
                ((jaw0) obj3).b.h((hyg0) obj, (kaw0) obj2);
                return s3q0.a;
            case 11:
                ((opw0) obj3).l.a(new a.b.c((bqw0.b) obj2));
                return s3q0.a;
            case 12:
                f6x0 f6x0Var = (f6x0) obj3;
                y5x0 y5x0Var = (y5x0) obj2;
                h6x0.e eVar = (h6x0.e) obj;
                int i6 = y5x0.l1;
                f6x0Var.n.onNext(f6x0.b.VMOJI_PRESENT);
                gm50.a.a(y5x0Var, eVar.a, new pst0(f6x0Var, 7));
                gm50.a.a(y5x0Var, eVar.b, new x5x0(f6x0Var, i2));
                return s3q0.a;
            default:
                ngl nglVar = (ngl) obj2;
                Throwable th = (Throwable) obj;
                ygg yggVar = ((xkx0) obj3).s;
                return yggVar != null ? yggVar.b(th, nglVar) : new xjq(th);
        }
    }
}
