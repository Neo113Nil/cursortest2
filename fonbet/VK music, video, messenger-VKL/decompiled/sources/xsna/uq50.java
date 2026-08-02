package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.feed.settings.api.di.NewsfeedSettingsComponent;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomToolbarFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.HashSet;
import xsna.cqc0;
import xsna.ejd0;
import xsna.gth0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uq50 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uq50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        LinkButton linkButton;
        UserId userId;
        int i = this.b;
        Action action = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) obj;
                int width = viewGroup.getWidth();
                Context context = viewGroup.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    width -= gjf0.a(viewGroup.getContext(), true) * 2;
                }
                return Integer.valueOf((int) (width * 0.58f));
            case 1:
                long j = CodeState.d;
                ((i060) obj).getClass();
                return new CodeState.CallResetWait(System.currentTimeMillis(), j, 0, 4, null);
            case 2:
                int i2 = NewsfeedCustomToolbarFragment.W;
                h3p0.b((NewsfeedCustomToolbarFragment) obj);
                return s3q0.a;
            case 3:
                int i3 = NewsfeedFilteredSourcesFragment.a0;
                return ((NewsfeedSettingsComponent) ((k7m) m7m.f((NewsfeedFilteredSourcesFragment) obj)).a(fpf0.a(NewsfeedSettingsComponent.class))).j0();
            case 4:
                ((wo60) obj).g = null;
                return s3q0.a;
            case 5:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 6:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((com.vk.media.ok.b) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 7:
                ((com.vk.donut.impl.a) obj).b.jo();
                return s3q0.a;
            case 8:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.CHANNEL_OPEN_TO_RENDER));
            case 9:
                return (FrescoImageView) ((x2a0) obj).itemView.findViewById(R.id.video_preview);
            case 10:
                f5a0 f5a0Var = ((PhotoAlbumFragment) obj).p0;
                if (f5a0Var != null) {
                    return f5a0Var.g;
                }
                return null;
            case 11:
                Attachment attachment = ((y9a0) obj).d;
                if (attachment instanceof PhotoAttachment) {
                    return (PhotoAttachment) attachment;
                }
                return null;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.L) {
                    photoViewer.i();
                } else {
                    photoViewer.g(true);
                }
                return s3q0.a;
            case 13:
                e2b0 e2b0Var = (e2b0) obj;
                if (e2b0Var.y.getSize() == 1) {
                    e2b0Var.c0();
                }
                return s3q0.a;
            case 14:
                ffb0 ffb0Var = ffb0.this;
                PlaylistsCarousel q6 = ffb0Var.q6();
                if (q6 != null && (linkButton = q6.i) != null) {
                    action = linkButton.c;
                }
                di60.w(action, ffb0Var.itemView.getContext(), null, null, null, null, 62);
                iab0 R6 = ffb0Var.R6();
                if (R6 != null) {
                    ffb0Var.E.J0(R6);
                }
                return s3q0.a;
            case 15:
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) obj;
                u2b0 u2b0Var = podcastEpisodeFragment.d0;
                com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) podcastEpisodeFragment.S;
                return new zkb0(podcastEpisodeFragment, u2b0Var, bVar != null ? bVar.d : "unknown");
            case 16:
                return (TextView) ((hpb0) obj).g(R.id.poll_editor_question_symbols_left_text);
            case 17:
                int i4 = PollPickerFragment.W;
                Bundle arguments = ((PollPickerFragment) obj).getArguments();
                return (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) ? o25.a().c() : userId;
            case 18:
                String[] strArr = PostViewFragment.T0;
                return ((PostViewFragment) obj).requireContext();
            case 19:
                return (NewsfeedMappersComponent) ((e7m) obj).b(fpf0.a(NewsfeedMappersComponent.class));
            case 20:
                int i5 = PostingFragment.L0;
                return ((BridgeComponent) ((k7m) m7m.f((PostingFragment) obj)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 21:
                return ((NewsFeedComponent) ((k7m) m7m.f((pgc0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 22:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_friends);
                return modalSettingsPrivacyOption;
            case 23:
                ((jkd0) obj).n.invoke(ejd0.b.c.b);
                return s3q0.a;
            case 24:
                return ((BridgeComponent) ((zqd0) obj).d.getValue()).p();
            case 25:
                return ((u6g0) obj).c;
            case 26:
                ((jth0) obj).g.C(gth0.a.b);
                return s3q0.a;
            case 27:
                vbr0 vbr0Var = (vbr0) obj;
                ubr0 ubr0Var = vbr0Var.a;
                UserId userId2 = vbr0Var.b;
                String str = vbr0Var.c;
                io.reactivex.rxjava3.disposables.b bVar2 = ubr0Var.b.r;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                int i6 = 25;
                hg1.e(bVar2, bug0.d(vdx0Var.d().S(ubr0Var.a.getAppId(), userId2, str), ((ggu0) ubr0Var.g.c).b, null, 6).subscribe(new p350(new j5b0(ubr0Var, i6), i6), new r7a0(new n3b0(ubr0Var, 19), 18)));
                return s3q0.a;
            case 28:
                defpackage.s sVar = ((nzk0) obj).j;
                if (sVar != null) {
                    sVar.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            default:
                return (MusicPrefsComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(MusicPrefsComponent.class));
        }
    }
}
