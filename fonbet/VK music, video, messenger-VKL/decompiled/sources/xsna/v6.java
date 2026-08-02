package xsna;

import android.media.AudioManager;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.footer.c;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.gallerypicker.di.GalleryPickerComponent;
import com.vk.libvideo.bottomsheet.about.delegate.i;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vkontakte.android.R;
import xsna.fb7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                i.a aVar = (i.a) obj;
                f4m.t(aVar.l.intValue(), aVar.itemView);
                return s3q0.a;
            case 1:
                return new iih0(((com.vk.clips.sdk.shared.item.ads.c) obj).m);
            case 2:
                return Boolean.valueOf(((x11) obj).a.H1());
            case 3:
                com.vk.attachpicker.impl.a aVar2 = (com.vk.attachpicker.impl.a) obj;
                int i2 = aVar2.b.a;
                return aVar2.n0.b(aVar2.a0, i2, i2, aVar2.C, false, false, false);
            case 4:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 5:
                j96 j96Var = (j96) obj;
                return new obm0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), j96Var.d.b);
            case 6:
                ((ra7) obj).l.b(fb7.d.a);
                return s3q0.a;
            case 7:
                return ((t79) obj).a.kn();
            case 8:
                return new dja(((com.vk.catalog2.common.dto.api.a) obj).q);
            case 9:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i3 = ChannelFragment.a1;
                return new com.vk.channels.impl.channel_screen.footer.c(channelFragment, channelFragment, new c.a(channelFragment.lo(), new com.vk.channels.impl.channel_screen.footer.f(channelFragment.V, (ChannelEntryPoint) channelFragment.w0.getValue(), channelFragment.uo().b()), channelFragment.vo(), g2v.c(), channelFragment.p0, channelFragment.wo()), new c.b(new z4(channelFragment, 18), new mh(channelFragment, 16), new defpackage.f(channelFragment, 9), false));
            case 10:
                return (ViewStub) ((ViewGroup) ((trb) obj).c.getValue()).findViewById(R.id.dialog_header_info_container);
            case 11:
                io.reactivex.rxjava3.disposables.c cVar = ((cxb) obj).x.l;
                if (cVar != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr = ClipCtaWithDonutFragment.T;
                return ((VkOnboardingComponent) m7m.d((ClipCtaWithDonutFragment) obj).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 13:
                int i4 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj).qo().Kf();
            case 14:
                return (AudioManager) ((ufd) obj).a.getSystemService("audio");
            case 15:
                return (VkImageSimple) ((hyd) obj).i().findViewById(R.id.show_preview_image);
            case 16:
                int i5 = ClipsEntryPointsFragment.i0;
                return ((GalleryPickerComponent) m7m.d((ClipsEntryPointsFragment) obj).mo408a(fpf0.a(GalleryPickerComponent.class))).jf();
            case 17:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return ((ClipsUploadVkComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 18:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) obj;
                int i6 = ClipsPlaylistPickerFragment.V;
                return new upe(new ClipsPlaylistPickerFragment.b(1, clipsPlaylistPickerFragment, ClipsPlaylistPickerFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0), ((mhd) clipsPlaylistPickerFragment.R.getValue()).h());
            case 19:
                ClipsPlaylistsComponentImpl clipsPlaylistsComponentImpl = (ClipsPlaylistsComponentImpl) obj;
                qcy<Object>[] qcyVarArr3 = ClipsPlaylistsComponentImpl.h;
                return new com.vk.clips.playlists.di.a(clipsPlaylistsComponentImpl.Df(), clipsPlaylistsComponentImpl.Ef(), clipsPlaylistsComponentImpl.Ff(), clipsPlaylistsComponentImpl.a.e0(), clipsPlaylistsComponentImpl.e());
            case 20:
                return ((CameraClipsComponent) ((k7m) m7m.f((cmf) obj)).a(fpf0.a(CameraClipsComponent.class))).getLogger();
            case 21:
                return ((ClipsViewerComponent) ((k7m) m7m.f((nag) obj)).a(fpf0.a(ClipsViewerComponent.class))).d9();
            case 22:
                cih cihVar = (cih) obj;
                ynh ynhVar = cihVar.f;
                return new gjh((isq) ynhVar.c0.getValue(), (lt00) ynhVar.Y.getValue(), cihVar.c);
            case 23:
                return (a5i) ((ynh) obj).C0.getValue();
            case 24:
                ((mvh) obj).e0();
                return s3q0.a;
            case 25:
                CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) obj;
                int i7 = CommunitySuggestionsFragment.X;
                return ((CommunitySubscriptionComponent) m7m.d(communitySuggestionsFragment).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).c7().a(((SearchUiComponent) m7m.d(communitySuggestionsFragment).a(fpf0.a(SearchUiComponent.class))).Ga(), null);
            case 26:
                ((r4i) obj).c.b();
                return s3q0.a;
            case 27:
                return ((i1j) obj).c.findViewById(R.id.voip_tool_bar_divider);
            case 28:
                ((zak0) ((rfj) obj).i).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            default:
                return fpj.a((fpj) obj);
        }
    }
}
