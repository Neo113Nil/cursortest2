package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorsListVh;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.dto.music.Playlist;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.uxpolls.presentation.view.PollsWebView.f;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.SuperAppBridgeComponentImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.media.OkmpStreamPublisher;
import xsna.fgo0;
import xsna.rfa0.f;
import xsna.u1h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class so40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ so40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 processVideoFrame$lambda$34;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        byte b = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                uo40 uo40Var = (uo40) obj;
                String str = uo40Var.E;
                String str2 = uo40Var.D;
                return (str == null || !drm0.D(str, "kids_section", false)) ? str2 : MusicPlaybackLaunchContext.Fb(str2).Cb("kids_section").Lb();
            case 1:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                StringBuilder sb = new StringBuilder("Albums to import: ");
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(((Number) entry.getKey()).intValue() + " -> " + ((Playlist) entry.getValue()).Ib());
                }
                sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
                return sb.toString();
            case 2:
                return ((NewsFeedComponent) ((k7m) m7m.c(((hs50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 3:
                return (DataRepositoryComponent) ((mo60) obj).c().a(fpf0.a(DataRepositoryComponent.class));
            case 4:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return newsfeedSearchFragment;
            case 5:
                int i2 = NotificationListFragment.a0;
                return ((FriendsRequestsComponent) m7m.d((NotificationListFragment) obj).mo408a(fpf0.a(FriendsRequestsComponent.class))).a();
            case 6:
                processVideoFrame$lambda$34 = OkmpStreamPublisher.processVideoFrame$lambda$34((OkmpStreamPublisher) obj);
                return processVideoFrame$lambda$34;
            case 7:
                m4a0 m4a0Var = (m4a0) obj;
                io.reactivex.rxjava3.subjects.f fVar = new io.reactivex.rxjava3.subjects.f();
                pdw pdwVar = new pdw(new jjx(m4a0Var, 23), 12);
                int i3 = kwg0.a;
                m4a0Var.d.b(fVar.subscribe(pdwVar, new jwg0("PhonebookContactModel")));
                return fVar;
            case 8:
                return ((rfa0) obj).new f();
            case 9:
                return ((PodcastComponentImpl) obj).b.v7();
            case 10:
                int i4 = PodcastFragment.m0;
                return (PodcastBottomSheetHeaderComponent) m7m.d((PodcastFragment) obj).mo408a(fpf0.a(PodcastBottomSheetHeaderComponent.class));
            case 11:
                int i5 = PollsWebView.h;
                return ((PollsWebView) obj).new f();
            case 12:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 13:
                return rl3.u0(((z7c0) obj).getFillPoints());
            case 14:
                return ((NewsFeedComponent) ((k7m) m7m.f((cqc0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 15:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) obj;
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                int i6 = 24;
                return new grc0(new t210(postponedPostsFragment, i6), new sy50(postponedPostsFragment, 16), new bbb0(postponedPostsFragment, 3), new rkt(postponedPostsFragment, i6));
            case 16:
                return ((q1d0) obj).r.getConfig();
            case 17:
                PublishFragment publishFragment = (PublishFragment) obj;
                qcy<Object>[] qcyVarArr3 = PublishFragment.Q;
                Bundle requireArguments = publishFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("arguments", PublishArguments.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("arguments");
                    parcelable = (PublishArguments) (parcelable3 instanceof PublishArguments ? parcelable3 : null);
                }
                cce0 cce0Var = new cce0((PublishArguments) parcelable);
                l7m d = m7m.d(publishFragment);
                PublishFragmentInternalComponent.v.getClass();
                return (PublishFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, cce0Var, fpf0.a(PublishFragmentInternalComponent.class), new xpd(b, 6))).a(fpf0.a(PublishFragmentInternalComponent.class));
            case 18:
                u1h0.a aVar = (u1h0.a) obj;
                androidx.lifecycle.w wVar = aVar.b;
                String str3 = aVar.c;
                Bundle bundle = (Bundle) wVar.a(str3);
                Parcelable parcelable4 = bundle != null ? bundle.getParcelable(str3) : null;
                if (parcelable4 instanceof Parcelable) {
                    return parcelable4;
                }
                return null;
            case 19:
                SearchAuthorsListVh.a((SearchAuthorsListVh) obj);
                return s3q0.a;
            case 20:
                int i7 = SelectAlbumBottomSheet.p1;
                Parcelable parcelable5 = ((SelectAlbumBottomSheet) obj).requireArguments().getParcelable("ARGS");
                if (parcelable5 != null) {
                    return (SelectAlbumBottomSheet.Builder.Arguments) parcelable5;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 21:
                return (tny) ((jci0) obj).e.b;
            case 22:
                return ((afi0) obj).b();
            case 23:
                return ((com.vk.stickers.keyboard.page.a) obj).q;
            case 24:
                return Boolean.valueOf(((rg50) obj).getIntValue() < 0);
            case 25:
                return ((StoriesComponent) ((k7m) m7m.c(((vfm0) obj).b)).a(fpf0.a(StoriesComponent.class))).gd();
            case 26:
                return new p7n0(((SuperAppBridgeComponentImpl) obj).a);
            case 27:
                kcn0 kcn0Var = (kcn0) obj;
                kto0 h6 = kcn0Var.h6();
                Context context = kcn0Var.itemView.getContext();
                h6.getClass();
                return dhr0.M() ? context.getDrawable(R.drawable.vk_icon_verified_dark_24) : context.getDrawable(R.drawable.vk_icon_verified_light_24);
            case 28:
                TabLayoutVh tabLayoutVh = (TabLayoutVh) obj;
                tabLayoutVh.m = null;
                tabLayoutVh.a();
                return s3q0.a;
            default:
                return new pco(q6x.z(fgo0.f, fgo0.g, ((fgo0.b) obj).a()));
        }
    }
}
