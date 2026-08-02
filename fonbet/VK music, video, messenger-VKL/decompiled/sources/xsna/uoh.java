package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import com.vk.api.generated.users.dto.UsersGetContentTabsResponseDto;
import com.vk.api.generated.users.dto.UsersScrollableContentTabDto;
import com.vk.api.generated.users.dto.UsersTabSettingsDto;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.dto.stories.model.clickable.ClickableMusicPlaylist;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.design.view.deletedreview.DeletedReviewView;
import com.vk.fullscreenbanners.api.dto.blocks.common.ImageFullScreenBannerBlock;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.bex0;
import xsna.fss;
import xsna.hls;
import xsna.ppv;
import xsna.uns;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class uoh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uoh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ExtendedUserProfile.m mVar;
        String i;
        Playlist playlist;
        int i2 = this.b;
        boolean z = false;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                int i3 = CommunityProfileFragment.k0;
                ((CommunityProfileFragment) obj2).getFeature().C((CommunityProfileAction) obj);
                return s3q0.a;
            case 1:
                VkTopBar vkTopBar = (VkTopBar) obj2;
                qgi0.r((tgi0) obj, "CommunityScheduledClipsGridViewToolbarNavButton");
                vkTopBar.setContentDescription(vkTopBar.getContext().getString(R.string.vkim_accessibility_toolbar_back_exit));
                return s3q0.a;
            case 2:
                ((zt4) obj2).invoke((e0o) obj);
                return s3q0.a;
            case 3:
                ((v940) obj).b((ax1) obj2);
                return s3q0.a;
            case 4:
                ((DeletedReviewView) obj2).b.invoke();
                return s3q0.a;
            case 5:
                com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b bVar = (com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b.j1;
                h1m l = tci.l(bVar.eo());
                nwy nwyVar = ((DescriptionModalInternalComponent) bVar.h1.getValue()).b;
                qcy<Object> qcyVar = DescriptionModalInternalComponent.d[0];
                g47Var.e(l, (v2m) nwyVar.c());
                g47Var.a(tci.k(bVar.eo()));
                g47Var.d(new b.C2001b(bVar.eo()));
                return s3q0.a;
            case 6:
                mjm mjmVar = (mjm) obj2;
                final hpm e = ((xgl0) obj).b().e();
                final long j = mjmVar.c;
                e.W(-1, j);
                final int i4 = mjmVar.d;
                e.b.b().h(new izs(i4, j, e) { // from class: xsna.qnm
                    public final /* synthetic */ long b;
                    public final /* synthetic */ int c;

                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        hpm.d0((e0w) obj3, this.b, this.c);
                        return s3q0.a;
                    }
                });
                return s3q0.a;
            case 7:
                List list = (List) obj2;
                com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list2 = bVar2.V;
                if (!p4g.b(list2, list)) {
                    return bVar2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!list.contains(Integer.valueOf(((Number) obj3).intValue()))) {
                        arrayList.add(obj3);
                    }
                }
                return com.vk.im.engine.models.dialogs.b.a(bVar2, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, arrayList, 0, null, 0, -1, 2080767);
            case 8:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj2;
                cVar.h.v = (rts) obj;
                cVar.B(cVar);
                return s3q0.a;
            case 9:
                ((ikv0) obj).a();
                m9n m9nVar = m9n.b;
                itg0.k(((bsl0) m9n.e.getValue()).c(true), null, new dz(22), 1);
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 10:
                ((b5p) obj2).a = true;
                return s3q0.a;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((c9q) obj2).c).setValue(bool);
                return s3q0.a;
            case 12:
                ((bcq) obj2).getClass();
                List<UsersTabSettingsDto> d = ((UsersGetContentTabsResponseDto) obj).d();
                if (d == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (UsersTabSettingsDto usersTabSettingsDto : d) {
                    UsersScrollableContentTabDto i5 = usersTabSettingsDto.i();
                    if (i5 == null || (i = i5.i()) == null) {
                        mVar = null;
                    } else {
                        Boolean Q = usersTabSettingsDto.Q();
                        boolean booleanValue = Q != null ? Q.booleanValue() : false;
                        Boolean e2 = usersTabSettingsDto.e();
                        boolean booleanValue2 = e2 != null ? e2.booleanValue() : false;
                        Boolean k = usersTabSettingsDto.k();
                        mVar = new ExtendedUserProfile.m(i, booleanValue, booleanValue2, k != null ? k.booleanValue() : false, usersTabSettingsDto.g(), usersTabSettingsDto.d(), usersTabSettingsDto.f(), usersTabSettingsDto.j());
                    }
                    if (mVar != null) {
                        arrayList2.add(mVar);
                    }
                }
                return arrayList2;
            case 13:
                ((m6r) obj2).a.a(new com.vk.newsfeed.posting.impl.domain.model.f(PlacesLoadingState.Error));
                return s3q0.a;
            case 14:
                tcr tcrVar = (tcr) obj;
                int i6 = FiltersRecyclerView.j;
                return new tcr(tcrVar.a, (Bitmap) obj2, tcrVar.c, tcrVar.d, tcrVar.e, tcrVar.f);
            case 15:
                i2s i2sVar = (i2s) obj2;
                t2s t2sVar = (t2s) obj;
                int i7 = t2sVar.i - 1;
                if (i7 != 0) {
                    return t2s.a(t2sVar, null, false, null, null, false, null, null, false, i7, 255);
                }
                i2sVar.h.a();
                return t2s.a(t2sVar, null, false, null, null, false, null, null, false, i7, 255);
            case 16:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((zak0) ((v1z) obj2).m).setValue(bool2);
                return s3q0.a;
            case 17:
                yis yisVar = (yis) obj2;
                yisVar.n.a(new fss.b.e((RequestUserProfile) yisVar.m));
                return s3q0.a;
            case 18:
                ((gls) obj2).T(new hls.a.C3006a((Throwable) obj));
                return s3q0.a;
            case 19:
                ((xms) obj2).j.b(new uns.c.a((Throwable) obj));
                return s3q0.a;
            case 20:
                bzt bztVar = (bzt) obj2;
                czt cztVar = bztVar.a;
                afi0 afi0Var = (afi0) bztVar.f.c;
                cztVar.b = GifWithQueryData.zb(cztVar.b, (String) obj, null, 2);
                if (((Boolean) bztVar.e.invoke()).booleanValue()) {
                    com.vk.lists.c cVar2 = afi0Var.p;
                    if (cVar2 != null) {
                        cVar2.o();
                    }
                    com.vk.lists.c cVar3 = afi0Var.p;
                    if (cVar3 != null) {
                        cVar3.p(false);
                    }
                }
                return s3q0.a;
            case 21:
                ((g8u) obj2).n.d();
                return s3q0.a;
            case 22:
                ((aiu) obj2).c();
                return s3q0.a;
            case 23:
                return Boolean.valueOf(epx.f(((Photo) obj).e, ((Photo) obj2).e));
            case 24:
                qgi0.h((tgi0) obj, ((m5v) obj2).q6().d);
                return s3q0.a;
            case 25:
                tgv tgvVar = (tgv) obj2;
                tgvVar.m.invoke(Integer.valueOf(tgvVar.getBindingAdapterPosition()));
                return s3q0.a;
            case 26:
                ListBuilder listBuilder = (ListBuilder) obj2;
                wow wowVar = new wow(listBuilder);
                ((nvy) obj).e(listBuilder.size(), new ppv.b(new d37(21), wowVar), new ppv.c(wowVar), new jai(802480018, new ppv.d(wowVar), true));
                return s3q0.a;
            case 27:
                ((w9y) obj).e(((ImageFullScreenBannerBlock) obj2).d, "url");
                return s3q0.a;
            case 28:
                bex0.a.a((x6y) obj2, JsApiMethodType.DOWNLOAD_FILE, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                return s3q0.a;
            default:
                ClickableMusicPlaylist clickableMusicPlaylist = (ClickableMusicPlaylist) obj;
                gmm0 gmm0Var = ((p5z) obj2).a.S;
                if (gmm0Var != null) {
                    uov uovVar = gmm0Var.b;
                    if (gmm0Var.f && clickableMusicPlaylist.f == null && !gmm0Var.d) {
                        uovVar.pause();
                        Activity h = e3m.h(uovVar.getCtx());
                        if (h != null && (playlist = clickableMusicPlaylist.e) != null) {
                            fl4.p(lyd.g(), h, MusicPlaybackLaunchContext.d, playlist, MusicBottomSheetLaunchPoint.Stories.b, null, 16);
                            gmm0Var.e = true;
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
