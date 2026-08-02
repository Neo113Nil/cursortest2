package xsna;

import android.content.Intent;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.apps.dto.AppsInviteMultipleFriendResponseDto;
import com.vk.api.generated.identity.dto.IdentityPhoneResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView$DownloadedSliderState;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenInfoPopup;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.a;
import com.vk.clips.playlists.folders.root.g;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.pipeline.model.effect.VideoEffect;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.gm50;
import xsna.j7u;
import xsna.m1j;
import xsna.pms0;
import xsna.qn60;
import xsna.tj50;
import xsna.tra0;
import xsna.vyh;
import xsna.wwh;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class n1d implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1d(FirstPinnedTabLayoutVh firstPinnedTabLayoutVh, UIBlockActionOpenInfoPopup uIBlockActionOpenInfoPopup) {
        this.b = 17;
        this.c = firstPinnedTabLayoutVh;
    }

    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 10;
        int i2 = 7;
        int i3 = 8;
        switch (this.b) {
            case 0:
                o1d o1dVar = (o1d) this.c;
                o1dVar.getClass();
                xn50.a.c(o1dVar, (ClipItemAction.e) obj);
                return s3q0.a;
            case 1:
                jpd jpdVar = (jpd) this.c;
                jpdVar.x.M = (String) obj;
                jpdVar.o();
                return s3q0.a;
            case 2:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                int i4 = ClipsEntryPointsFragment.i0;
                clipsEntryPointsFragment.finish();
                return s3q0.a;
            case 3:
                com.vk.clips.favorites.impl.ui.folders.list.d dVar = (com.vk.clips.favorites.impl.ui.folders.list.d) this.c;
                ClipsFavoriteFoldersListState.Content content = (ClipsFavoriteFoldersListState.Content) obj;
                z3e z3eVar = dVar.d;
                boolean z = dVar.e;
                z3eVar.getClass();
                ClipsFavoriteFoldersListState.Content.LoadingState loadingState = content.e;
                ArrayList arrayList = new ArrayList();
                if (z) {
                    r6 = content.f < content.g;
                    arrayList.add(new u3e(r6 ? a.b.C0597a.b : a.b.C0598b.b, r6));
                }
                arrayList.add(z3e.a(content.b));
                List<u2e> list = content.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((u2e) obj2).a instanceof FavoriteFolderId.Alias.AllClips)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(z3e.a((u2e) it.next()));
                }
                g5g.y(arrayList3, arrayList);
                if (loadingState == ClipsFavoriteFoldersListState.Content.LoadingState.LOADING_NEXT) {
                    arrayList.add(x3e.b);
                }
                if (loadingState == ClipsFavoriteFoldersListState.Content.LoadingState.ERROR_NEXT) {
                    arrayList.add(w3e.b);
                }
                return arrayList;
            case 4:
                com.vk.clips.viewer.impl.grid.b bVar = (com.vk.clips.viewer.impl.grid.b) this.c;
                ClipGridParams.OnlyId.Profile profile = new ClipGridParams.OnlyId.Profile(((b25) obj).c());
                return new a590(profile, bVar.n, bVar.e, profile, bVar.g, bVar.p, bVar.q, bVar.o);
            case 5:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) this.c;
                int i5 = ClipsInterestsFragment.Y;
                a.f fVar = a.f.b;
                clipsInterestsFragment.getClass();
                xn50.a.c(clipsInterestsFragment, fVar);
                return s3q0.a;
            case 6:
                return new g.a(((tj50.a) obj).a(new com.vk.clips.playlists.folders.root.d(1, (com.vk.clips.playlists.folders.root.e) this.c, com.vk.clips.playlists.folders.root.e.class, "mapStateToViewState", "mapStateToViewState(Lcom/vk/clips/playlists/folders/root/ClipsPlaylistsFoldersRootState;)Lcom/vk/clips/playlists/folders/root/ClipsPlaylistsFoldersRootViewState$Render$BottomSheet;", 0), ao8.d));
            case 7:
                ClipsDraftVk clipsDraftVk = (ClipsDraftVk) this.c;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftPersistentStore.b(clipsDraftVk);
                ClipsDraftPersistentStore.s();
                return s3q0.a;
            case 8:
                z5h z5hVar = (z5h) this.c;
                int i6 = z5h.j1;
                cvk.u(R.string.error, false);
                z5hVar.dismiss();
                return s3q0.a;
            case 9:
                tj50.a aVar = (tj50.a) obj;
                td5 td5Var = new td5(((uwh) this.c).d, 8);
                ao8 ao8Var = ao8.d;
                int i7 = 17;
                return new wwh.a(aVar.a(td5Var, ao8Var), aVar.a(new rl2(13), ao8Var), aVar.a(new x90(i), ao8Var), aVar.a(new ci7(i7), ao8Var), aVar.a(new y90(i7), ao8Var), aVar.a(new com.vk.movika.sdk.base.logic.interactor.f(14), ao8Var));
            case 10:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar2 = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c;
                dVar2.b0(false);
                dVar2.p.b(new vyh.f(tq.h(tlo0.Companion, R.string.default_network_error)));
                return s3q0.a;
            case 11:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.b) this.c).T(new d.b((Throwable) obj));
                return s3q0.a;
            case 12:
                return Boolean.valueOf(!epx.f(((lvi0) obj).a.a, ((m1j.e.b.c) ((m1j.e.b) this.c)).a));
            case 13:
                rql rqlVar = (rql) this.c;
                mzf0 mzf0Var = (mzf0) obj;
                sjp0 sjp0Var = rqlVar.k;
                VideoEffect videoEffect = mzf0Var.a.b;
                pms0 pms0Var = rqlVar.c;
                if (pms0Var != null) {
                    FilterItem filterItem = videoEffect != null ? videoEffect.c : null;
                    float[] fArr = sjp0Var.h;
                    pms0Var.c(filterItem, Arrays.copyOf(fArr, fArr.length), new pms0.a(rqlVar.l, rqlVar.m));
                }
                f100 f100Var = rqlVar.a.d;
                if (f100Var != null) {
                    f100Var.v("DefaultVideoDecoderFrameHandler", mzf0Var.toString());
                }
                return s3q0.a;
            case 14:
                h8n h8nVar = (h8n) this.c;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                e9n e9nVar = h8nVar.f;
                return new io.reactivex.rxjava3.internal.operators.single.b(new g8n(e9nVar.a, new qn60.b[]{new xc3(newsEntriesContainer.c, null, e9nVar.b, h8nVar.h, null, false, null)})).l(new xl0(new wcj(newsEntriesContainer, i2), 19));
            case 15:
                return DownloadedSliderView$DownloadedSliderState.a((DownloadedSliderView$DownloadedSliderState) obj, (List) this.c);
            case 16:
                gwo gwoVar = (gwo) this.c;
                ((Boolean) obj).getClass();
                ((gzs) ((zak0) gwoVar.b).getValue()).invoke();
                return s3q0.a;
            case 17:
                x8c x8cVar = ((FirstPinnedTabLayoutVh) this.c).l;
                if (x8cVar != null) {
                    ((l7a) ((VideoCatalogFragment) x8cVar.b).j0.getValue()).getClass();
                    ((com.vk.catalog.info.popup.api.di.a) ((VideoCatalogFragment) x8cVar.b).i0.getValue()).getClass();
                }
                return s3q0.a;
            case 18:
                ArrayList arrayList4 = (ArrayList) this.c;
                Integer d = ((AppsInviteMultipleFriendResponseDto) obj).d();
                return Boolean.valueOf(d != null && d.intValue() == arrayList4.size());
            case 19:
                IdentityPhoneResponseDto identityPhoneResponseDto = (IdentityPhoneResponseDto) obj;
                return new WebIdentityPhone((WebIdentityLabel) this.c, identityPhoneResponseDto.d(), identityPhoneResponseDto.getId());
            case 20:
                return new q6u((ViewGroup) obj, (sop) this.c);
            case 21:
                i7u i7uVar = (i7u) this.c;
                gm50.a.a(i7uVar, ((j7u.a) obj).a, new hxl(i7uVar, i3));
                i7uVar.l.setRefreshing(false);
                i7uVar.j.setVisibility(0);
                View view = i7uVar.i;
                if (view != null) {
                    view.setVisibility(8);
                }
                RecyclerView recyclerView = i7uVar.h;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                i7uVar.g.setVisibility(8);
                return s3q0.a;
            case 22:
                tra0.a.x((tra0.a) obj, (tra0) this.c, 0, 0);
                return s3q0.a;
            case 23:
                qdw qdwVar = (qdw) this.c;
                Set set = (Set) obj;
                return set.isEmpty() ? io.reactivex.rxjava3.core.x.k(jgp.b) : qdwVar.b.C(qdwVar, new wvt(set));
            case 24:
                brw brwVar = (brw) this.c;
                mrw mrwVar = new mrw((AppCompatActivity) obj, brwVar);
                brwVar.d = new bm01(mrwVar.g);
                return mrwVar;
            case 25:
                return (Intent) this.c;
            case 26:
                ((p7y) this.c).a.z(JsApiMethodType.MY_TRACKER_ID, (Throwable) obj);
                return s3q0.a;
            case 27:
                q410 q410Var = (q410) this.c;
                float intValue = ((Integer) obj).intValue();
                Long l = q410Var.m;
                if (l != null) {
                    long longValue = l.longValue();
                    UserId userId = q410Var.n;
                    if (userId != null) {
                        q410Var.l.invoke(Long.valueOf(longValue), userId, Float.valueOf(intValue));
                    }
                }
                return s3q0.a;
            case 28:
                final m710 m710Var = (m710) this.c;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new cf00(m710Var, r6 ? 1 : 0), f9t.z(m710Var), new oqu(i2));
                l370.n(g47Var, f9t.w(m710Var), new bqt(4));
                g47Var.d(new xy() { // from class: xsna.i710
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        m710.this.b((q610) lj50Var);
                    }
                });
                return s3q0.a;
            default:
                gvw0 gvw0Var = ((MiniAppCallPiPOverlayService) this.c).c;
                return Boolean.valueOf(Settings.canDrawOverlays((gvw0Var != null ? gvw0Var : null).a));
        }
    }

    public /* synthetic */ n1d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
