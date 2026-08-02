package xsna;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.im.ui.views.msg.ViewsCountView;
import com.vk.libvideo.ui.vkvideopromo.VkVideoPromoFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.mail.libverify.controls.VerificationController;
import xsna.dji0;
import xsna.e6w0;
import xsna.nnj0;
import xsna.tzp0;
import xsna.us80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b6f0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean lambda$isNumericCode$8;
        VideoFile A;
        int i = this.b;
        Object obj = null;
        Object[] objArr = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((c6f0) obj2).b.k;
            case 1:
                return (TextView) ((prf0) obj2).a.findViewById(R.id.nativeads_age_restrictions);
            case 2:
                SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = (SearchCommunitiesOnMapFragment) obj2;
                int i2 = SearchCommunitiesOnMapFragment.e0;
                SearchCommunitiesOnMapFragment.a jo = searchCommunitiesOnMapFragment.jo();
                jo.getClass();
                Iterator<E> it = SearchCommunitiesOnMapRouter.MapEntrypoint.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((SearchCommunitiesOnMapRouter.MapEntrypoint) next).ordinal() == jo.a.getInt("entrypoint")) {
                            obj = next;
                        }
                    }
                }
                return new com.vk.search.communities.map.impl.ui.map.d((SearchCommunitiesOnMapRouter.MapEntrypoint) obj, searchCommunitiesOnMapFragment.jo().b());
            case 3:
                s8i0 s8i0Var = (s8i0) obj2;
                HashSet hashSet = s8i0Var.t;
                LinkedHashSet<Narrative> linkedHashSet = s8i0Var.h;
                StoryEntry storyEntry = s8i0Var.e;
                if (storyEntry != null) {
                    Set g = izi0.g(linkedHashSet, hashSet);
                    Set set = g;
                    ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new us80.a(storyEntry.c, ((Narrative) it2.next()).b));
                    }
                    Set g2 = izi0.g(hashSet, linkedHashSet);
                    Set set2 = g2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(set2, 10));
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new us80.c(storyEntry.c, ((Narrative) it3.next()).b));
                    }
                    ArrayList u0 = j5g.u0(arrayList2, arrayList);
                    if (!u0.isEmpty()) {
                        hg1.n(((vu50) s8i0Var.l.getValue()).h(s8i0Var.d, u0).m(io.reactivex.rxjava3.android.schedulers.a.b()), s8i0Var.b, false, null, 62).subscribe(new c2y(new t3b(g2, s8i0Var, g, 7), 26), new xk30(new q8i0(s8i0Var, objArr == true ? 1 : 0), 18));
                    }
                } else {
                    s8i0Var.f.invoke(linkedHashSet, Boolean.TRUE, EmptyList.b);
                }
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((afi0) obj2).w == SearchMode.GIF);
            case 5:
                return ((dji0.d) ((dji0) obj2)).a;
            case 6:
                return new sbj0(((SharingImEngineComponentImpl) obj2).a.s());
            case 7:
                ((znj0) obj2).j(nnj0.b.a);
                return s3q0.a;
            case 8:
                return ((StoryViewerComponent) ((k7m) m7m.f((ctl0) obj2)).a(fpf0.a(StoryViewerComponent.class))).M1();
            case 9:
                ((c4m0) obj2).e.o5().i(StoryEditorEvents.GEO_ACCESS_ALLOW);
                return s3q0.a;
            case 10:
                tzp0.c.a aVar = com.vk.newsfeed.impl.views.a.l1;
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.views.a) obj2)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 11:
                int i3 = zfp0.x1;
                return ((AudioModelsComponent) m7m.d((zfp0) obj2).a(fpf0.a(AudioModelsComponent.class))).r();
            case 12:
                qcy<Object>[] qcyVarArr = ipp0.m1;
                return new mqm0(((ipp0) obj2).requireContext());
            case 13:
                int i4 = UserProfileFragment.p0;
                return (StickersBridgeComponent) ((k7m) m7m.f((UserProfileFragment) obj2)).a(fpf0.a(StickersBridgeComponent.class));
            case 14:
                lambda$isNumericCode$8 = ((VerificationController) obj2).lambda$isNumericCode$8();
                return lambda$isNumericCode$8;
            case 15:
                return ((BridgeComponent) ((k7m) m7m.f((b9s0) obj2)).a(fpf0.a(BridgeComponent.class))).F();
            case 16:
                return (LinksBridgeComponent) ((g8m) obj2).a(fpf0.a(LinksBridgeComponent.class));
            case 17:
                return (AdPixelStatsComponent) ((f8m) obj2).a(fpf0.a(AdPixelStatsComponent.class));
            case 18:
                yg5 yg5Var = ((h4t0) obj2).i;
                if (yg5Var == null || (A = yg5Var.A()) == null) {
                    return null;
                }
                return new slt0(A, A.r());
            case 19:
                int i5 = ViewsCountView.d;
                return (AppCompatTextView) ((ViewsCountView) obj2).findViewById(R.id.im_views_count);
            case 20:
                com.vk.superapp.browser.ui.a aVar2 = (com.vk.superapp.browser.ui.a) obj2;
                return new kgu0((tpn0) aVar2.t.getValue(), (ovv0) aVar2.v.getValue());
            case 21:
                VkPhotoPickerFragment vkPhotoPickerFragment = (VkPhotoPickerFragment) obj2;
                return new em1(((PhotosComponent) vkPhotoPickerFragment.o0.getValue()).d3(), false, new VkPhotoPickerFragment.b(1, vkPhotoPickerFragment, VkPhotoPickerFragment.class, "openPhotoAlbumFragment", "openPhotoAlbumFragment(Lcom/vk/dto/photo/PhotoAlbum;)V", 0));
            case 22:
                int i6 = VkVideoPromoFragment.Q;
                return (VideoGrowthComponent) ((k7m) m7m.f((VkVideoPromoFragment) obj2)).a(fpf0.a(VideoGrowthComponent.class));
            case 23:
                ((VmojiCharacterFragment.c) obj2).invoke(e6w0.h.a.b);
                return s3q0.a;
            default:
                int i7 = WriteBarButtonsBubbleView.h;
                return (ImageView) ((WriteBarButtonsBubbleView) obj2).findViewById(R.id.writebar_collapse);
        }
    }
}
