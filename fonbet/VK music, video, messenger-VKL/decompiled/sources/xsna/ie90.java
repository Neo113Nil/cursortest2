package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.validation.fullscreen.success.PhoneValidationSuccessFragment;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.channels.impl.post_settings.adapter.PostSettingType;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.progress.VideoProgressView;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.f;
import com.vk.stories.StorySettingsActivity;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.efc0;
import xsna.fmc0;
import xsna.fpv0;
import xsna.ipp0;
import xsna.l7h0;
import xsna.mot0;
import xsna.nnj0;
import xsna.pfm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ie90 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ie90(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((je90) obj2).l.invoke();
                break;
            case 1:
                Object obj3 = ((PhoneValidationSuccessFragment) obj2).o;
                if (obj3 == null) {
                    obj3 = null;
                }
                f4a0 f4a0Var = (f4a0) obj3;
                f4a0Var.getClass();
                frf0.g(null, null, null, null, 12);
                f4a0Var.x.n4();
                break;
            case 2:
                if (((tla0) obj2).d != null) {
                    GroupCallViewModel.b.getClass();
                    liu liuVar = GroupCallViewModel.r;
                    if (liuVar.e == null) {
                        liuVar.c = null;
                        liuVar.f = null;
                        liuVar.a.o1();
                        liuVar.a();
                    }
                }
                break;
            case 3:
                Pair pair = (Pair) obj;
                ((wzs) obj2).invoke(pair.i(), pair.j());
                break;
            case 4:
                PodcastCatalogRootVh podcastCatalogRootVh = (PodcastCatalogRootVh) obj2;
                String str = (String) obj;
                podcastCatalogRootVh.i8(vyh0.a);
                podcastCatalogRootVh.p = str;
                SearchResultsVh.cb(podcastCatalogRootVh.u, str, podcastCatalogRootVh.q, null, false, null, false, 60);
                break;
            case 5:
                mzp0 mzp0Var = ((com.vk.music.podcast.impl.ui.list.a) obj2).b;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                break;
            case 6:
                break;
            case 7:
                ((i7c0) obj2).l.h(PostSettingType.MARK_ADVERTISEMENT);
                break;
            case 8:
                ArrayList arrayList = (ArrayList) obj2;
                Object[] objArr = (Object[]) obj;
                float f = PrimaryActionsView.t;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                int length = objArr.length;
                int i3 = 0;
                while (i2 < length) {
                    arrayList2.add(new Pair(arrayList.get(i3), objArr[i2]));
                    i2++;
                    i3++;
                }
                break;
            case 9:
                tgi0 tgi0Var = (tgi0) obj;
                int i4 = ProfileFriendsFragment.k0;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, ((ProfileFriendsFragment) obj2).getString(R.string.delete_friends_list_desc));
                break;
            case 10:
                Throwable b = ube0.b((Throwable) obj);
                efc0.a aVar = ((ube0) obj2).a;
                aVar.e(new fmc0.m.b(b));
                aVar.a(new e.g(PublicationState.Failure));
                break;
            case 11:
                ((c7h0) obj2).T(new l7h0.a((Throwable) obj));
                break;
            case 12:
                ixi0 ixi0Var = (ixi0) obj2;
                int i5 = r9i0.j1;
                ixi0Var.h = (List) obj;
                ixi0Var.b();
                break;
            case 13:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                break;
            case 14:
                ((w8j0) obj2).d.setItems((List) obj);
                break;
            case 15:
                ((znj0) obj2).j(new nnj0.d((String) obj));
                break;
            case 16:
                o6k0 o6k0Var = (o6k0) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 9) {
                    String str2 = wbu0.a(o6k0Var.b, th, true).a;
                    l6k0 l6k0Var = (l6k0) o6k0Var.a;
                    if (l6k0Var != null) {
                        l6k0Var.Of(str2);
                    }
                } else {
                    vggVar.c();
                }
                break;
            case 17:
                break;
            case 18:
                ((qvl0) obj2).b();
                break;
            case 19:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.r(tgi0Var2, "close_button");
                qgi0.h(tgi0Var2, ((VkTopBar) obj2).getContext().getString(R.string.picker_accessibility_close));
                break;
            case 20:
                int i6 = StorySettingsActivity.P;
                ((med0) obj2).setModel((ned0) obj);
                break;
            case 21:
                pfm0.a aVar2 = ((pfm0) obj2).D;
                if (aVar2 != null) {
                    aVar2.b();
                }
                break;
            case 22:
                final izs izsVar = (izs) obj2;
                final fpv0 fpv0Var = new fpv0((Context) obj);
                fpv0Var.d.add(new fpv0.c() { // from class: xsna.zrn0
                    @Override // xsna.fpv0.c
                    public final void c(int i7) {
                        izs.this.invoke(Integer.valueOf(i7));
                    }
                });
                fpv0Var.e.add(new fpv0.b() { // from class: xsna.bsn0
                    @Override // xsna.fpv0.b
                    public final void a(int i7) {
                        View childAt = fpv0.this.getChildAt(i7);
                        int l = krv0.l(R.attr.vk_ui_icon_accent);
                        childAt.getContext();
                        e.b bVar = new e.b(childAt, null, null, l, 6);
                        bVar.w = R.layout.ds_internal_context_menu_item;
                        Pair[] pairArr = {new Pair("Действие 1", new i13(29)), new Pair("Действие 2", new iud0(6))};
                        for (int i8 = 0; i8 < 2; i8++) {
                            Pair pair2 = pairArr[i8];
                            bVar.f.add(new com.vk.core.view.components.context.menu.b(new VkContextMenu.a((CharSequence) pair2.i(), null, null, false, false, (gzs) pair2.j())));
                        }
                        bVar.j();
                    }
                });
                break;
            case 23:
                ipp0 ipp0Var = (ipp0) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = ipp0.m1;
                g47Var.e(tci.l(ipp0Var.eo()), new fd10((lqm0) ipp0Var.j1.getValue()));
                g47Var.a(tci.k(ipp0Var.eo()));
                g47Var.d(new ipp0.b(ipp0Var.eo()));
                break;
            case 24:
                ((UserProfileDialogs) obj2).h.B(new f.c.m());
                break;
            case 25:
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.k(wallWithCounters), new i3u(new svk0((isq0) obj2, 15), 16));
                int i7 = 18;
                break;
            case 26:
                int i8 = VideoNewProfileToolbarV2.m;
                ((hvr0) obj2).invoke();
                break;
            case 27:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj2;
                tgi0 tgi0Var3 = (tgi0) obj;
                int i9 = VideoOfflineFragment.f1;
                qgi0.r(tgi0Var3, "VideoOfflineTopBarTitle");
                qgi0.h(tgi0Var3, videoOfflineFragment.requireContext().getString((videoOfflineFragment.N0 || !videoOfflineFragment.Y0) ? R.string.video_downloaded_title : R.string.video_offline_title));
                break;
            case 28:
                Context context = (Context) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarComposeVh) obj2).i;
                VideoAlbum videoAlbum2 = videoAlbum != null ? videoAlbum : null;
                mot0.b(mot0.a.a, context, videoAlbum2.c, videoAlbum2.b, null, 24);
                break;
            default:
                gzs<s3q0> gzsVar = ((VideoProgressView) obj2).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
