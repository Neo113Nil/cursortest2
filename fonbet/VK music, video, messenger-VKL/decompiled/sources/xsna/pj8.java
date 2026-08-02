package xsna;

import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentFrameLayout;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.auth.ui.password.askpassword.VkAskPasswordView;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.im.ui.components.chat_profile.ProfileLinkActionChooser;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.sharing.core.view.l;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsDomainFragment;
import xsna.yho;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pj8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pj8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((rj8) obj).c.setChecked(!r6.isChecked());
                return;
            case 1:
                ((no8) obj).m.q();
                return;
            case 2:
                com.vk.im.ui.components.chat_profile.a aVar = (com.vk.im.ui.components.chat_profile.a) obj;
                aVar.s().b(new ProfileLinkActionChooser(), new com.vk.movika.sdk.base.observable.a(aVar, 23), null);
                return;
            case 3:
                ((ComponentFrameLayout) obj).a(view);
                return;
            case 4:
                iio iioVar = ((wio) obj).e.c;
                (iioVar != null ? iioVar : null).a(yho.b.b);
                return;
            case 5:
                rwi.d().j0().a(((r2r) obj).c);
                return;
            case 6:
                ((com.vk.newsfeed.common.recycler.holders.d) obj).n.invoke(LeadFormHolder.ButtonAction.NEXT_PAGE);
                return;
            case 7:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj;
                GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = photoVideoAttachActivity.W;
                if (galleryPickerSourceConfiguration == null || !galleryPickerSourceConfiguration.c) {
                    photoVideoAttachActivity.V1();
                    return;
                }
                com.vk.attachpicker.a aVar2 = photoVideoAttachActivity.c0;
                if (aVar2 != null) {
                    aVar2.c(true);
                    return;
                }
                return;
            case 8:
                SettingsDomainFragment settingsDomainFragment = (SettingsDomainFragment) obj;
                int i2 = SettingsDomainFragment.j0;
                try {
                    mhy.a(settingsDomainFragment.requireContext(), settingsDomainFragment.d0.getText());
                    cvk.u(R.string.link_copied, false);
                    return;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                    return;
                }
            case 9:
                l.a aVar3 = ((com.vk.sharing.core.view.f) obj).D;
                if (aVar3 != null) {
                    aVar3.b();
                    return;
                }
                return;
            case 10:
                StoryReactionViewGroup.c((StoryReactionViewGroup) obj);
                return;
            case 11:
                bpn0 bpn0Var = VideoOverlayView.I;
                ((VideoOverlayView.c.d) obj).f.invoke();
                return;
            case 12:
                VideoRelatedVideosFragment.lo((VideoRelatedVideosFragment) obj);
                return;
            default:
                com.vk.auth.ui.password.askpassword.a aVar4 = ((VkAskPasswordView) obj).y;
                aVar4.getClass();
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.a(new vf1(15, r2, r2));
                aVar4.c.d1();
                throw null;
        }
    }
}
