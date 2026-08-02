package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackVerticalListItemVh;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.vkclient.js.bridge.api.events.ShowStoryBox$Parameters;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.duw0;
import xsna.e8v0;
import xsna.ejm0;
import xsna.fjm0;
import xsna.gm50;
import xsna.h7u0;
import xsna.o0r0;
import xsna.rye;
import xsna.vfg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ufg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ufg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object[] objArr = 0;
        int i2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((ogs0) obj3).invoke(new vfg0.a.b());
                ((vfg0) obj2).c.t();
                lyd.a.b((Throwable) obj);
                return s3q0.a;
            case 1:
                i0q0.f(new hf80((rye.b) obj3, (gtl) obj2, (io.reactivex.rxjava3.disposables.c) obj, i2));
                return s3q0.a;
            case 2:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                n8j0 n8j0Var = (n8j0) obj2;
                VKList<Narrative> vKList = (VKList) obj;
                cVar.s(vKList.j());
                cVar.r(vKList.j() != null);
                n8j0Var.d.invoke(vKList);
                return s3q0.a;
            case 3:
                Throwable th = (Throwable) obj;
                pvp pvpVar = ((ojj0) obj3).d;
                String h = ((ShowStoryBox$Parameters) obj2).h();
                pvpVar.getClass();
                if (fco0.d(th)) {
                    pvpVar.j(fco0.h(h, th));
                } else {
                    pvpVar.i(fco0.g(th), h);
                }
                return s3q0.a;
            case 4:
                ((npk0) obj3).U6((StarsFeedback) obj2);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 5:
                StickerPackVerticalListItemVh stickerPackVerticalListItemVh = (StickerPackVerticalListItemVh) obj3;
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj2;
                f9l0 f9l0Var = stickerPackVerticalListItemVh.c;
                Context context = stickerPackVerticalListItemVh.i;
                f9l0Var.e(context != null ? context : null, stickerPackPreview, stickerPackVerticalListItemVh.d, stickerPackVerticalListItemVh.e.b);
                return s3q0.a;
            case 6:
                ajm0 ajm0Var = (ajm0) obj3;
                ajm0Var.g.a.c(StoryPublishEvent.APPLY_TEMPLATE, new c6m0(((ejm0.a) obj2).a.b, objArr == true ? 1 : 0));
                ajm0Var.h.b(new fjm0.a((StoryBoxPrepared) obj));
                return s3q0.a;
            case 7:
                ((awp0) obj3).b.h((hyg0) obj, (bwp0) obj2);
                return s3q0.a;
            case 8:
                ((q7v0) ((wwq0) obj3).c.getValue()).a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            case 9:
                final VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign = (VideoCatalogAlbumBottomSheetRedesign) obj3;
                final FragmentActivity fragmentActivity = (FragmentActivity) obj2;
                VideoCatalogAlbumBottomSheetRedesign.a aVar = videoCatalogAlbumBottomSheetRedesign.a;
                w8s0 w8s0Var = aVar.e;
                VideoAlbum videoAlbum = aVar.a;
                switch (VideoCatalogAlbumBottomSheetRedesign.b.$EnumSwitchMapping$0[((VideoAlbumActionItem) obj).ordinal()]) {
                    case 1:
                        fxc0.B().g(fragmentActivity, videoAlbum, true);
                        break;
                    case 2:
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: xsna.x8s0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                g7s0 B = fxc0.B();
                                VideoCatalogAlbumBottomSheetRedesign videoCatalogAlbumBottomSheetRedesign2 = videoCatalogAlbumBottomSheetRedesign;
                                VideoAlbum videoAlbum2 = videoCatalogAlbumBottomSheetRedesign2.a.a;
                                B.v0(FragmentActivity.this, videoAlbum2.b, videoAlbum2.c, new irc0(videoCatalogAlbumBottomSheetRedesign2, 24));
                            }
                        };
                        int i3 = h7u0.p;
                        h7u0.a c = h7u0.b.c(fragmentActivity);
                        c.g0(R.string.video_alert_title);
                        c.U(R.string.video_playlist_confirm_remove);
                        c.c0(R.string.delete, onClickListener);
                        c.W(R.string.cancel, null);
                        c.m();
                        break;
                    case 3:
                    case 4:
                        w8s0Var.b(VideoCatalogAlbumBottomSheetRedesign.Action.CopyLink);
                        ClipboardManager clipboardManager = (ClipboardManager) fragmentActivity.getSystemService("clipboard");
                        com.vk.video.ui.share.api.b bVar = aVar.g;
                        String Eb = videoAlbum.Eb();
                        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                        videoFeatures.getClass();
                        if (com.vk.toggle.b.A.a(videoFeatures) && bVar != null) {
                            Eb = bVar.c(Eb);
                        }
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(Eb, Eb));
                        cvk.u(R.string.link_copied, false);
                        break;
                    case 5:
                    case 6:
                        w8s0Var.b(VideoCatalogAlbumBottomSheetRedesign.Action.Share);
                        if (!BuildInfo.q()) {
                            VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_PLAYLIST_SHARING;
                            videoFeatures2.getClass();
                            if (!com.vk.toggle.b.A.a(videoFeatures2)) {
                                bpn0 bpn0Var = nr4.m;
                                kbj0.c((kbj0) (bpn0Var != null ? bpn0Var : null).getValue(), fragmentActivity, videoAlbum.Eb(), false, null, null, false, 120);
                                break;
                            }
                        }
                        bpn0 bpn0Var2 = nr4.m;
                        ((kbj0) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).s(fragmentActivity, videoAlbum, false);
                        break;
                    case 7:
                        videoCatalogAlbumBottomSheetRedesign.d(fragmentActivity, false);
                        break;
                    case 8:
                        videoCatalogAlbumBottomSheetRedesign.d(fragmentActivity, true);
                        break;
                    case 9:
                        w8s0Var.b(VideoCatalogAlbumBottomSheetRedesign.Action.GoToOwner);
                        bpn0 bpn0Var3 = xwk.b;
                        ((o0r0) (bpn0Var3 != null ? bpn0Var3 : null).getValue()).m(fragmentActivity, videoAlbum.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                        break;
                    case 10:
                        fxc0.B().getClass();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            default:
                qtw0 qtw0Var = (qtw0) obj3;
                int i4 = qtw0.l1;
                yzt0<duw0.a> yzt0Var = ((duw0.b) obj).a;
                rtw0 rtw0Var = new rtw0(1, (cuw0) obj2, cuw0.class, "accept", "accept(Lcom/vk/voip/ui/settings/participant/presentation/ui/state/VoipParticipantSettingsViewState$Content;)V", 0);
                qtw0Var.getClass();
                gm50.a.a(qtw0Var, yzt0Var, rtw0Var);
                return s3q0.a;
        }
    }
}
