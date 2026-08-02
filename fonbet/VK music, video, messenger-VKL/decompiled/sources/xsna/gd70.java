package xsna;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.common.Image;
import com.vk.fave.di.FaveComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.posting.di.PostingComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.HashSet;
import kotlin.Result;
import ru.ok.media.OkmpStreamPublisher;
import xsna.rfa0.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gd70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd70(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 prepare$lambda$20$lambda$19;
        HandleOpenUrl initialize$lambda$220$lambda$87;
        switch (this.b) {
            case 0:
                id70 id70Var = (id70) this.c;
                int i = id70.q1;
                return ((NotificationsSettingsComponent) m7m.d(id70Var).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 1:
                prepare$lambda$20$lambda$19 = OkmpStreamPublisher.prepare$lambda$20$lambda$19((OkmpStreamPublisher) this.c);
                return prepare$lambda$20$lambda$19;
            case 2:
                mj80 mj80Var = (mj80) this.c;
                return new j1d0(mj80Var.b, mj80Var.d, null, 28);
            case 3:
                gp80 gp80Var = (gp80) this.c;
                return new k6r(gp80Var.a, gp80Var.b);
            case 4:
                return (StoryProgressView) ((u2a0) this.c).itemView.findViewById(R.id.video_single_clip_song_progress);
            case 5:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i2 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().r1();
            case 6:
                Context context = ((x9a0) this.c).l;
                HashSet hashSet = iah0.a;
                Point point = new Point();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
                return point.y > point.x ? point : new Point(point.y, point.x);
            case 7:
                return ((rfa0) this.c).new g();
            case 8:
                ((com.vk.core.utils.newtork.b) this.c).getClass();
                return Boolean.valueOf(com.vk.core.utils.newtork.b.d());
            case 9:
                PodcastFragment podcastFragment = (PodcastFragment) this.c;
                int i3 = PodcastFragment.m0;
                return ((MusicKidsModeComponent) m7m.d(podcastFragment).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 10:
                return izb0.a((izb0) this.c);
            case 11:
                lfg lfgVar = ((a1c0) this.c).i;
                if (lfgVar != null) {
                    lfgVar.p0();
                }
                return s3q0.a;
            case 12:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i4 = PostingFragment.s0;
                return ((PostingComponent) m7m.d(postingFragment).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 13:
                return ((AttachmentMappersComponent) ((k7m) m7m.f((ikc0) this.c)).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 14:
                return ((PostingComponent) ((k7m) m7m.f((cqc0) this.c)).mo408a(fpf0.a(PostingComponent.class))).H6().f();
            case 15:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                return new uq60(postponedPostsFragment, postponedPostsFragment.W, postponedPostsFragment.eo().a.Y, postponedPostsFragment.eo().f);
            case 16:
                lwc0 lwc0Var = ((pvc0) this.c).f;
                return new Result(lwc0Var.a.f(new txf0(), new kjj0(lwc0Var.b)));
            case 17:
                ((jmd0) this.c).dismiss();
                return s3q0.a;
            case 18:
                return ((FaveComponent) ((zqd0) this.c).a.getValue()).xf();
            case 19:
                return ((NewsFeedComponent) ((k7m) m7m.f((xwd0) this.c)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 20:
                PublishFragment publishFragment = (PublishFragment) this.c;
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                return new bce0(new PublishFragment.b(1, publishFragment.fo(), bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0));
            case 21:
                zfe0 zfe0Var = (zfe0) this.c;
                return Float.valueOf(zfe0Var.a() / zfe0Var.b() < 1.0f ? 0.3f : 1.0f);
            case 22:
                Image image = (Image) this.c;
                return ixj0.n(image != null ? image.b : null);
            case 23:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
                int i5 = SearchDocumentsListFragment.h0;
                return ((SearchUiComponent) m7m.d(searchDocumentsListFragment).a(fpf0.a(SearchUiComponent.class))).Ga();
            case 24:
                SelectAlbumBottomSheet selectAlbumBottomSheet = (SelectAlbumBottomSheet) this.c;
                int i6 = SelectAlbumBottomSheet.p1;
                return ((NewsFeedComponent) ((k7m) m7m.f(selectAlbumBottomSheet)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 25:
                return (tny) ((jci0) this.c).e.b;
            case 26:
                return Boolean.valueOf(((afi0) this.c).w == SearchMode.GIF);
            case 27:
                initialize$lambda$220$lambda$87 = ServiceProvider.initialize$lambda$220$lambda$87((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$87;
            case 28:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
                settingsGeneralFragment.m0.b(hg1.k(q1w.a.F(settingsGeneralFragment, new e9g0()), settingsGeneralFragment.kn()).subscribe(new bqs(settingsGeneralFragment, 24), new skz(settingsGeneralFragment, 25)));
                return null;
            default:
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((com.vk.pushes.notifications.base.a) this.c)).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
        }
    }
}
