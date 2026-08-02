package xsna;

import android.view.Choreographer;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.widget.LifecycleHandler;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.podcast.impl.di.PodcastComponentImpl;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.d;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import xsna.rfa0.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jw30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jw30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.core.x xVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new bzb0(((rw30) obj).k);
            case 1:
                return new com.vk.im.popup.b(((m140) obj).b);
            case 2:
                return ((PlayerUIComponent) ((k7m) m7m.f((uo40) obj)).a(fpf0.a(PlayerUIComponent.class))).ub();
            case 3:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                StringBuilder sb = new StringBuilder("Playlists to import: ");
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(((Number) entry.getKey()).intValue() + " -> " + ((Playlist) entry.getValue()).Ib());
                }
                sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
                return sb.toString();
            case 4:
                ((vtu) obj).a(0);
                return s3q0.a;
            case 5:
                return ((NewsFeedComponent) ((k7m) m7m.c(((hs50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 6:
                return (ClassifiedsComponent) ((mo60) obj).c().a(fpf0.a(ClassifiedsComponent.class));
            case 7:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return ((NewsfeedSearchFragment) obj).fo();
            case 8:
                o6a0 o6a0Var = (o6a0) obj;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(o6a0Var.c(), o6a0Var.b.a(), null, MobileOfficialAppsCorePhotoEditorStat$EditorEvent.OPEN_EDITOR, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
            case 9:
                return ((rfa0) obj).new i();
            case 10:
                return ((PodcastComponentImpl) obj).a.s();
            case 11:
                int i2 = PodcastFragment.m0;
                return ((MusicAnalyticsComponent) m7m.d((PodcastFragment) obj).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 12:
                return PollsWebView.a((PollsWebView) obj);
            case 13:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 14:
                return ((DonutPriceComponent) ((k7m) m7m.f((com.vk.newsfeed.common.util.j) obj)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 15:
                ((z7c0) obj).p();
                return s3q0.a;
            case 16:
                String[] strArr = PostViewFragment.T0;
                c9c0 Co = ((PostViewFragment) obj).Co();
                if (Co != null) {
                    ((com.vk.newsfeed.impl.presenters.b) Co).i1(R.id.postviewfragment_options);
                }
                return s3q0.a;
            case 17:
                int i3 = PostingFragment.L0;
                return ((SessionManagementComponent) ((k7m) m7m.f((PostingFragment) obj)).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 18:
                return ((ggc0) obj).a;
            case 19:
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                return new crc0(new nuv((PostponedPostsFragment) obj, 28));
            case 20:
                ((omo) obj).onCancel();
                return s3q0.a;
            case 21:
                int i4 = ProfileFriendsFragment.k0;
                return (ClipEditComponent) m7m.d((ProfileFriendsFragment) obj).a(fpf0.a(ClipEditComponent.class));
            case 22:
                qcy<Object>[] qcyVarArr3 = PublishFragment.Q;
                ((PublishFragment) obj).kn().getSupportFragmentManager().f("AuthorResult.MODAL_RESULT_REQUEST_KEY");
                return s3q0.a;
            case 23:
                xVar = RemoteSettingsImplV2.settingsSource_delegate$lambda$0((RemoteSettingsImplV2) obj);
                return xVar;
            case 24:
                return (Choreographer) obj;
            case 25:
                return Boolean.valueOf(((afi0) obj).w == SearchMode.FULL);
            case 26:
                return zvj.a(d.a.a(whn0.a(), (ovj) ((ytj0) obj).b.getValue()));
            case 27:
                return LifecycleHandler.c(((odk0) obj).kn());
            case 28:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) obj;
                return new awk0(cVar, cVar.i, cVar.m.d(), cVar.B);
            default:
                ((izs) ((zak0) ((nwm0) obj).f).getValue()).invoke(CommunityProfileAction.e.i.b.b);
                return s3q0.a;
        }
    }
}
