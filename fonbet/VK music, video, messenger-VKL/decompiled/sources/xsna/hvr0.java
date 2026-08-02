package xsna;

import android.app.Activity;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.vk.auth.oauth.VkBaseOAuthActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.impl.VideoPersistedUpload;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemProfileButtonView;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vk.video.focus.api.VideoFocusComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import java.io.File;
import one.video.controls20.SimpleControlsView;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hvr0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hvr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ww50 v;
        String str;
        int i = 1;
        switch (this.b) {
            case 0:
                pk30 pk30Var = (pk30) this.c;
                if (pk30Var != null) {
                    pk30Var.E();
                }
                return s3q0.a;
            case 1:
                VideoAlbum videoAlbum = (VideoAlbum) this.c;
                int i2 = VideoAlbumEditorFragment.l0;
                c63 c63Var = c63.a;
                if (c63.f) {
                    zyl0 zyl0Var = new zyl0(videoAlbum, 13);
                    Activity b = c63.b();
                    if (b == null || (v = s200.v(b)) == null) {
                        c63.a(new pz50(zyl0Var));
                    } else {
                        zyl0Var.invoke(v);
                    }
                }
                return s3q0.a;
            case 2:
                return ((VideoFocusComponent) ((k7m) m7m.f((b9s0) this.c)).a(fpf0.a(VideoFocusComponent.class))).b();
            case 3:
                u3g0 u3g0Var = (u3g0) this.c;
                int i3 = VideoCommentThreadFragment.B0;
                u3g0Var.b();
                u3g0Var.r();
                return s3q0.a;
            case 4:
                VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment = (VideoCommentsTreeInPlayerFragment) this.c;
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return ((BridgeComponent) m7m.d(videoCommentsTreeInPlayerFragment).a(fpf0.a(BridgeComponent.class))).s();
            case 5:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i4 = VideoMinimizableDiscoveryFragment.p1;
                c.l.b bVar = c.l.b.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, bVar);
                return s3q0.a;
            case 6:
                return (VideoSubscriptionComponent) ((f8m) this.c).c(fpf0.a(VideoSubscriptionComponent.class));
            case 7:
                ((VideoProfileFragmentOld.c) ((cys0) this.c).W.c).invoke();
                return s3q0.a;
            case 8:
                VideoPersistedUpload videoPersistedUpload = (VideoPersistedUpload) this.c;
                VideoUploadTaskNew videoUploadTaskNew = videoPersistedUpload.w;
                int i5 = videoUploadTaskNew.d;
                String str2 = videoPersistedUpload.b;
                long longValue = ((Number) videoUploadTaskNew.H.getValue()).longValue();
                VideoPersistedUpload.State state = videoPersistedUpload.m;
                boolean z = state == VideoPersistedUpload.State.FAILED;
                boolean z2 = state == VideoPersistedUpload.State.CANCELLED;
                boolean z3 = state == VideoPersistedUpload.State.DONE;
                UserId userId = videoPersistedUpload.f;
                String str3 = videoUploadTaskNew.j;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                long j = videoPersistedUpload.q;
                String str5 = videoPersistedUpload.r;
                Long l = videoPersistedUpload.t;
                String str6 = videoPersistedUpload.v;
                OrdData ordData = videoPersistedUpload.n;
                return new VideoUpload(i5, str2, userId, longValue, str4, (ordData != null ? ordData.c : null) != null && ordData.d == null, z, z2, z3, false, null, null, j, str5, l, str6, 3584, null);
            case 9:
                fxc0.B().d(((mbt0) this.c).b);
                return s3q0.a;
            case 10:
                kkt0 kkt0Var = (kkt0) this.c;
                gpt0 gpt0Var = gpt0.a;
                Preference.F(2L, "video_tooltip_prefs", "video_as_clip_tooltip");
                kkt0Var.i.show();
                File e = PrivateFiles.e(e8r.a, PrivateSubdir.CLIPS_VIDEO, null, "mp4", 24);
                kkt0Var.k = e;
                kkt0Var.j = dug0.a(e, kkt0Var.b.a).a0(asu0.a.d()).subscribe(new gyq0(new j6l0(kkt0Var, 22), i), new h8l0(new wgm0(kkt0Var, 15), 8));
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((VideoView) this.c).R);
            case 12:
                return ((uqt0) this.c).a.X4(SimpleControlsView.ViewType.SETTINGS);
            case 13:
                tau0 tau0Var = (tau0) this.c;
                rxi0 rxi0Var = rxi0.a;
                long j2 = tau0Var.a;
                rxi0Var.getClass();
                return rxi0.b(j2);
            case 14:
                VkBaseOAuthActivity vkBaseOAuthActivity = (VkBaseOAuthActivity) this.c;
                int i6 = VkBaseOAuthActivity.k;
                vkBaseOAuthActivity.T1();
                return s3q0.a;
            case 15:
                return ((PodcastComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) this.c)).a(fpf0.a(PodcastComponent.class))).x2();
            case 16:
                VkEcosystemProfileButtonView vkEcosystemProfileButtonView = (VkEcosystemProfileButtonView) this.c;
                int i7 = VkEcosystemProfileButtonView.e;
                return ((SessionManagementComponent) ((k7m) m7m.c(vkEcosystemProfileButtonView)).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 17:
                VkRichCellMiddle vkRichCellMiddle = (VkRichCellMiddle) this.c;
                int i8 = VkRichCellMiddle.p;
                return new VkButton(vkRichCellMiddle.getContext(), null, 6, 0);
            case 18:
                ((PopupWindow) this.c).dismiss();
                return s3q0.a;
            case 19:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) this.c;
                UIBlockList uIBlockList = vkTopBarVh.q;
                if (uIBlockList == null || (str = uIBlockList.b) == null) {
                    return s3q0.a;
                }
                vkTopBarVh.c.b(new dq80(str), true);
                return s3q0.a;
            case 20:
                String str7 = (String) this.c;
                i0w0 i0w0Var = i0w0.b;
                if (str7 != null) {
                    ((VideoGrowthComponent) i0w0.e.getValue()).Z7().b(str7);
                }
                ((com.vk.libvideo.api.promo.stats.b) i0w0.d.getValue()).b();
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((r4x0) this.c).j());
            default:
                return (TextView) ((y0y0) this.c).a.findViewById(R.id.comment_disable_text);
        }
    }
}
