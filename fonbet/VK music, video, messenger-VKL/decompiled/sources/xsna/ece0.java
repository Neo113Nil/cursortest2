package xsna;

import android.content.Context;
import android.view.View;
import com.ironsource.B5;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.photos.root.albumssettings.presentation.view.AlbumsSettingsRecyclerPaginatedView;
import com.vk.photos.root.selectalbum.domain.h;
import com.vk.queue.sync.utils.RecoverableException;
import com.vk.queue.sync.utils.UnRecoverableException;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.g;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.f;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.media.StreamerBase;
import xsna.dbe0;
import xsna.gm50;
import xsna.ibk0;
import xsna.loh0;
import xsna.svq0;
import xsna.tj50;
import xsna.xn50;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ece0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ece0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c4, code lost:
    
        if (r0.k1() == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0220, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f1, code lost:
    
        if (r0.k1() == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021e, code lost:
    
        if (r0 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0224, code lost:
    
        if ((r0 instanceof xsna.uxr0) != false) goto L81;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s3q0 startLinkTracker$lambda$15;
        int i;
        Owner s;
        boolean z = false;
        int i2 = 17;
        int i3 = 28;
        int i4 = 1;
        switch (this.b) {
            case 0:
                return PublishState.a((PublishState) obj, null, null, null, null, ((dbe0.o.b) ((dbe0.o) this.c)).b, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -17, 2047);
            case 1:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof RecoverableException) {
                    th.getCause();
                    if (!Boolean.TRUE.booleanValue()) {
                        rVar.onError(th);
                    }
                } else if (th instanceof UnRecoverableException) {
                    rVar.onError(th);
                }
                return s3q0.a;
            case 2:
                d0g0 d0g0Var = (d0g0) this.c;
                tdu tduVar = (tdu) obj;
                boolean v = d0g0Var.v();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                tduVar.o(!v ? d0g0Var.g() : 0.0f);
                if (d0g0Var.v()) {
                    f = d0g0Var.h();
                }
                tduVar.n(f);
                return s3q0.a;
            case 3:
                eoh0 eoh0Var = (eoh0) this.c;
                tj50.a aVar = (tj50.a) obj;
                int i5 = 23;
                gky gkyVar = new gky(i5);
                ao8 ao8Var = ao8.d;
                return new loh0.e.a(aVar.a(gkyVar, ao8Var), aVar.a(new f6w(i5), ao8Var), aVar.a(new oey(eoh0Var), ao8Var), aVar.a(new fo20(i2), ao8Var), aVar.a(new k220(eoh0Var), ao8Var), aVar.a(new zos(eoh0Var), ao8Var), aVar.a(new bk30(eoh0Var, i3), ao8Var));
            case 4:
                SearchEntityVideoPlaylistAnswerVh.a((VideoAlbum) this.c, true);
                return s3q0.a;
            case 5:
                n6i0 n6i0Var = (n6i0) this.c;
                h.b bVar = (h.b) obj;
                AlbumsSettingsRecyclerPaginatedView albumsSettingsRecyclerPaginatedView = n6i0Var.e;
                bwt0.p0(albumsSettingsRecyclerPaginatedView, true);
                Throwable th2 = bVar.d;
                if (th2 != null) {
                    albumsSettingsRecyclerPaginatedView.fj(th2, null);
                    return s3q0.a;
                }
                n6i0Var.f.submitList(bVar.b);
                h.b.a aVar2 = bVar.c;
                if (aVar2 instanceof h.b.a.C1514a) {
                    albumsSettingsRecyclerPaginatedView.Fe();
                } else if (epx.f(aVar2, h.b.a.C1515b.a)) {
                    albumsSettingsRecyclerPaginatedView.lb();
                } else {
                    if (aVar2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    albumsSettingsRecyclerPaginatedView.t();
                }
                s3q0 s3q0Var = s3q0.a;
                if (bVar.a) {
                    albumsSettingsRecyclerPaginatedView.K9();
                } else {
                    albumsSettingsRecyclerPaginatedView.Mk();
                }
                n6i0Var.h = bVar.e;
                return s3q0Var;
            case 6:
                ((kxi0) this.c).g.onNext((izs) obj);
                return s3q0.a;
            case 7:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ((Ref$ObjectRef) this.c).element;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 8:
                ibk0 ibk0Var = (ibk0) this.c;
                synchronized (ibk0Var.g) {
                    ibk0.a aVar3 = ibk0Var.i;
                    Object obj2 = aVar3.b;
                    int i6 = aVar3.d;
                    eh50<Object> eh50Var = aVar3.c;
                    if (eh50Var == null) {
                        eh50Var = new eh50<>((Object) null);
                        aVar3.c = eh50Var;
                        aVar3.f.p(obj2, eh50Var);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    aVar3.b(obj, i6, obj2, eh50Var);
                }
                return s3q0.a;
            case 9:
                startLinkTracker$lambda$15 = StreamerBase.startLinkTracker$lambda$15((StreamerBase) this.c, (qox) obj);
                return startLinkTracker$lambda$15;
            case 10:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                ((SwipeDrawableRefreshLayout) this.c).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 11:
                SuperAppFragment superAppFragment = (SuperAppFragment) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                int i7 = SuperAppFragment.o0;
                qgi0.h(tgi0Var, superAppFragment.requireContext().getString(R.string.accessibility_super_app_avatar_icon));
                qgi0.r(tgi0Var, "SuperAppHeaderProfileIcon");
                return s3q0.a;
            case 12:
                vtn0 vtn0Var = (vtn0) this.c;
                try {
                    ((View) obj).performHapticFeedback(16);
                } catch (Throwable unused) {
                }
                vtn0Var.hide();
                return s3q0.a;
            case 13:
                com.vk.im.ui.components.theme_chooser.b bVar2 = (com.vk.im.ui.components.theme_chooser.b) this.c;
                ThemeChooserState themeChooserState = (ThemeChooserState) ((izs) obj).invoke(bVar2.Z0());
                com.vk.im.ui.components.theme_chooser.a aVar4 = bVar2.o;
                aVar4.getClass();
                ThemeChooserState themeChooserState2 = themeChooserState.b() ? aVar4.a : aVar4.b;
                return ThemeChooserState.a(themeChooserState, null, null, null, null, epx.f(themeChooserState2.d, themeChooserState.d) && epx.f(themeChooserState2.c, themeChooserState.c) && (!themeChooserState.b() || epx.f(themeChooserState2.b, themeChooserState.b)), null, null, null, 239);
            case 14:
                ((ToolbarRedesignVh) this.c).d(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 15:
                mnq0 mnq0Var = (mnq0) this.c;
                r0e0 r0e0Var = mnq0Var.c;
                bwr0 bwr0Var = (bwr0) obj;
                if (!(bwr0Var instanceof wxr0)) {
                    if (!(bwr0Var instanceof fyr0)) {
                        if (!(bwr0Var instanceof cwr0)) {
                            break;
                        } else {
                            VideoFile videoFile = ((cwr0) bwr0Var).a;
                            if (mnq0Var.C(videoFile)) {
                                if (videoFile != null && (s = videoFile.s()) != null) {
                                    r7 = s.b;
                                }
                                if (epx.f(r7, r0e0Var.a())) {
                                    if (videoFile == null) {
                                        i = 0;
                                        break;
                                    } else {
                                        i = videoFile.k1();
                                        break;
                                    }
                                }
                            }
                            return Boolean.valueOf(z);
                        }
                    } else {
                        VideoFile videoFile2 = ((fyr0) bwr0Var).a;
                        if (mnq0Var.C(videoFile2)) {
                            Owner s2 = videoFile2.s();
                            if (epx.f(s2 != null ? s2.b : null, r0e0Var.a())) {
                                if (!videoFile2.v()) {
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                } else {
                    VideoFile videoFile3 = ((wxr0) bwr0Var).a;
                    if (mnq0Var.C(videoFile3)) {
                        Owner s3 = videoFile3.s();
                        if (epx.f(s3 != null ? s3.b : null, r0e0Var.a())) {
                            break;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                break;
            case 16:
                ((zvq0) this.c).c(new svq0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 17:
                vxq0 vxq0Var = (vxq0) this.c;
                gom0 gom0Var = (gom0) obj;
                gom0.a(gom0Var, new h3e0(11), new phg(vxq0Var, 10));
                gom0.a(gom0Var, new j5n(29), new com.vk.movika.tools.controls.seekbar.i(vxq0Var, 20));
                gom0Var.a.add(new scr(new q8w(27), wxq0.a, new com.vk.movika.tools.controls.seekbar.k(vxq0Var, 12)));
                gom0.a(gom0Var, new puq0(i4), new com.vk.movika.tools.controls.seekbar.m(vxq0Var, 15));
                gom0.a(gom0Var, new k990(24), new com.vk.movika.tools.controls.seekbar.p(vxq0Var, i2));
                return s3q0.a;
            case 18:
                awt0.f((am) obj, (Context) this.c, R.string.vk_accessibility_scroll_to_top);
                return s3q0.a;
            case 19:
                ((bdr0) this.c).c = null;
                return s3q0.a;
            case 20:
                ((fsr0) this.c).l.g();
                return s3q0.a;
            case 21:
                VideoAboutFragment videoAboutFragment = (VideoAboutFragment) this.c;
                int i8 = VideoAboutFragment.S;
                gm50.a.a(videoAboutFragment, ((g.a) obj).a, new emh0(videoAboutFragment, 14));
                return s3q0.a;
            case 22:
                ((qhg0) this.c).invoke((Throwable) obj);
                return s3q0.a;
            case 23:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) this.c;
                int i9 = VideoEpisodesFragment.V;
                gm50.a.a(videoEpisodesFragment, ((f.a) obj).a, new alj0(videoEpisodesFragment, 21));
                return s3q0.a;
            case 24:
                ((com.vk.video.ui.discovery.minimizable.g) this.c).T(new n.k0((lat0) obj));
                return s3q0.a;
            case 25:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null && mVar.s != booleanValue) {
                    mVar.s = booleanValue;
                    mVar.p();
                }
                return s3q0.a;
            case 26:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) this.c;
                int i10 = VideoRelatedVideosFragment.n0;
                xn50.a.c(videoRelatedVideosFragment, new b.e((com.vk.video.ui.discovery.minimizable.related_videos.h) obj));
                return s3q0.a;
            case 27:
                VkConsentView vkConsentView = ((com.vk.auth.ui.consent.i) this.c).a;
                eah0 eah0Var = vkConsentView.g;
                ArrayList arrayList = eah0Var.c;
                arrayList.clear();
                arrayList.addAll((List) obj);
                eah0Var.notifyDataSetChanged();
                vkConsentView.d.postDelayed(new a72(vkConsentView, i3), 100L);
                return s3q0.a;
            case 28:
                return ((wpp) obj).e(Long.valueOf(((l5v0) this.c).a));
            default:
                String str = (String) obj;
                try {
                    return str + B5.U + brm0.y(URLEncoder.encode(((JSONObject) this.c).get(str).toString(), B5.O), "+", "%20");
                } catch (JSONException e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return null;
                }
        }
    }

    public /* synthetic */ ece0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
