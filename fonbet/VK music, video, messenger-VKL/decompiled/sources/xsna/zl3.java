package xsna;

import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dialogtags.api.a;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistActionItem;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import kotlin.collections.builders.ListBuilder;
import xsna.hm3;
import xsna.q630;
import xsna.sga;
import xsna.w1o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zl3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zl3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        b0a0 q;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hm3) this.c).c((hm3.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                jai jaiVar = (jai) this.c;
                sga sgaVar = (sga) this.d;
                tpr tprVar = (tpr) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1241346516, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.Content.<anonymous>.<anonymous> (CatalogSectionViewImpl.kt:154)");
                    }
                    jaiVar.invoke(((sga.a) sgaVar).f, tprVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((nye) this.c).j((pye) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ms40) this.c).h((xu40) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((k150) this.c).g((String) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((a4b0) this.c).n((m3b0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                NewsComment newsComment = (NewsComment) this.d;
                aa aaVar = (aa) this.e;
                e520 e520Var = (e520) obj2;
                lfg lfgVar = postViewFragment.C0;
                if (lfgVar == null) {
                    lfgVar = null;
                }
                lfgVar.f8(e520Var.a, newsComment, aaVar);
                break;
            case 7:
                j2o0 j2o0Var = (j2o0) this.c;
                a.b bVar = ((dk3) this.d).c;
                bn50 bn50Var = (bn50) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1515608148, intValue2, -1, "com.vk.dialogtags.impl.TagsFactoryImpl.ScreenContent.<anonymous>.<anonymous> (TagsFactoryImpl.kt:74)");
                    }
                    iyk0 iyk0Var = uvi.h;
                    float j1 = ((azl) aVar2.r(iyk0Var)).j1(bVar.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1732080659, 0, -1, "com.vk.dialogtags.impl.TagsFactoryImpl.getViewOffset (TagsFactoryImpl.kt:99)");
                    }
                    azl azlVar = (azl) aVar2.r(iyk0Var);
                    long floatToRawIntBits = (Float.floatToRawIntBits(azlVar.j1(bVar.b)) << 32) | (Float.floatToRawIntBits(azlVar.j1(bVar.c)) & 4294967295L);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean y = aVar2.y(bn50Var);
                    Object x = aVar2.x();
                    if (y || x == a.C0011a.a) {
                        w1o0.c cVar = new w1o0.c(1, bn50Var, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar2.R(cVar);
                        x = cVar;
                    }
                    i2o0.a(j2o0Var, floatToRawIntBits, (izs) ((fcy) x), txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j1, 1, q630.a.a), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1593305908, intValue3, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign.Content.<anonymous>.<anonymous> (VideoPlaylistBottomSheetRedesign.kt:79)");
                    }
                    VideoPlaylistBottomSheetRedesign.a aVar4 = videoPlaylistBottomSheetRedesign.a;
                    bpn0 bpn0Var = xg5.a;
                    if (bpn0Var == null) {
                        bpn0Var = null;
                    }
                    cpu cpuVar = (cpu) bpn0Var.getValue();
                    VideoAlbum videoAlbum = aVar4.a;
                    boolean a = cpuVar.a(videoAlbum.c);
                    if (videoAlbum.b < 0) {
                        q = hg10.q(VideoPlaylistActionItem.SHARE, VideoPlaylistActionItem.COPY_LINK);
                    } else if (BuildInfo.r()) {
                        q = hg10.q(VideoPlaylistActionItem.SHARE, VideoPlaylistActionItem.COPY_LINK);
                    } else if (a) {
                        bpn0 bpn0Var2 = fxc0.a;
                        if (((g7s0) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).J().l1()) {
                            q = sua.p(videoAlbum) ? hg10.q(VideoPlaylistActionItem.SHARE_PLAYLIST, VideoPlaylistActionItem.COPY_PLAYLIST_LINK, VideoPlaylistActionItem.REMOVE_PLAYLIST) : hg10.q(VideoPlaylistActionItem.EDIT_PLAYLIST, VideoPlaylistActionItem.SHARE, VideoPlaylistActionItem.COPY_LINK, VideoPlaylistActionItem.REMOVE_PLAYLIST);
                        } else if (videoAlbum.f == 0) {
                            ListBuilder e = e43.e();
                            e.add(VideoPlaylistActionItem.UPLOAD);
                            UserId userId = videoAlbum.c;
                            if (!fxc0.B().J().r0() || (!BuildInfo.q() && fkq0.d(userId))) {
                                e.add(VideoPlaylistActionItem.ADD_VIDEO_BY_LINK);
                            }
                            e.add(VideoPlaylistActionItem.EDIT_PLAYLIST);
                            e.add(VideoPlaylistActionItem.SHARE);
                            e.add(VideoPlaylistActionItem.COPY_LINK);
                            e.add(VideoPlaylistActionItem.REMOVE_PLAYLIST);
                            q = hg10.t(e.g());
                        } else {
                            q = hg10.q(VideoPlaylistActionItem.UPLOAD, VideoPlaylistActionItem.SHARE, VideoPlaylistActionItem.COPY_LINK, VideoPlaylistActionItem.EDIT_PLAYLIST, VideoPlaylistActionItem.REMOVE_PLAYLIST);
                        }
                    } else {
                        q = hg10.q(VideoPlaylistActionItem.GO_TO_AUTHOR, VideoPlaylistActionItem.SHARE, VideoPlaylistActionItem.COPY_LINK);
                    }
                    boolean y2 = aVar3.y(videoPlaylistBottomSheetRedesign) | aVar3.y(fragmentActivity) | aVar3.J(gzsVar);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == a.C0011a.a) {
                        x2 = new c3b(videoPlaylistBottomSheetRedesign, fragmentActivity, gzsVar, 5);
                        aVar3.R(x2);
                    }
                    y4t0.b(q, (izs) x2, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zl3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ zl3(j2o0 j2o0Var, w1o0 w1o0Var, dk3 dk3Var, bn50 bn50Var) {
        this.b = 7;
        this.c = j2o0Var;
        this.d = dk3Var;
        this.e = bn50Var;
    }
}
