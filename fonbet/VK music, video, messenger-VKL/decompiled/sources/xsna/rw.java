package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.soloader.MinElf;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryOtherVh;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$ActionIconParams;
import com.vk.music.ui.search.history.SearchHistoryItemViewParams$SubTitleParams;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.albums.presentation.AlbumsSkeletonView;
import com.vk.photos.root.albums.presentation.g;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.avh0;
import xsna.d1x0;
import xsna.d3b;
import xsna.gm50;
import xsna.pj20;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rw(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int intValue;
        us2.d dVar;
        int i = 2;
        int i2 = 1;
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.c;
                kx kxVar = (kx) this.d;
                izs izsVar = (izs) this.e;
                List list = (List) mtk0Var.getValue();
                ((nvy) obj).e(list.size(), null, new lx(new md(i), list), new jai(802480018, new mx(list, kxVar, izsVar), true));
                return s3q0.a;
            case 1:
                AlbumsSkeletonView albumsSkeletonView = (AlbumsSkeletonView) this.c;
                View view = (View) this.d;
                AlbumsFragment albumsFragment = (AlbumsFragment) this.e;
                int i3 = AlbumsFragment.j0;
                albumsSkeletonView.setIsShow(true);
                view.setVisibility(4);
                gm50.a.a(albumsFragment, ((g.c) obj).a, new ym1(albumsSkeletonView, 0));
                return s3q0.a;
            case 2:
                ButtonSize buttonSize = (ButtonSize) this.c;
                VkButton.Size size = (VkButton.Size) this.d;
                wh50 wh50Var = (wh50) this.e;
                VkButton vkButton = new VkButton((Context) obj, null, 6, 0);
                vkButton.setText("Loader + Text - " + buttonSize.name());
                vkButton.setMode(VkButton.Mode.Primary);
                vkButton.setSize(size);
                vkButton.setAppearance(VkButton.Appearance.Accent);
                vkButton.setHideContentOnLoading(false);
                vkButton.setOnClickListener(new i68(i2, wh50Var, vkButton));
                return vkButton;
            case 3:
                laa laaVar = (laa) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                List<Playlist> list2 = (List) obj;
                ld20 ld20Var = laaVar.s;
                ld20Var.getClass();
                nt70 nt70Var = new nt70(str2);
                nt70Var.d = true;
                nt70Var.m = list2;
                List singletonList = Collections.singletonList(new CatalogReplacement(Collections.singletonList(((laa) ((defpackage.h) ld20Var.c).c).h), lu70.c(nt70Var.a(str))));
                List<Playlist> list3 = list2;
                HashMap hashMap = new HashMap(list3.size());
                for (Playlist playlist : list3) {
                    hashMap.put(playlist.Ib(), playlist);
                }
                CatalogReplacementResponse catalogReplacementResponse = new CatalogReplacementResponse(singletonList, new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 7, null), null);
                laaVar.h = str;
                return catalogReplacementResponse;
            case 4:
                d3b d3bVar = (d3b) this.c;
                Context context = (Context) this.d;
                String str3 = (String) this.e;
                int i4 = d3b.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i4 == 2) {
                    fvr.l(context, str3);
                    edw.i(R.string.vkim_copy_to_clipboard_done, context);
                } else if (i4 == 3) {
                    d3bVar.d.a(context, str3);
                }
                return s3q0.a;
            case 5:
                return Integer.valueOf(elb.p((String) this.d, (String) this.e, (elb) this.c));
            case 6:
                r0c r0cVar = (r0c) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                wa6 wa6Var = (wa6) this.e;
                String obj2 = ((pno0) obj).d().toString();
                if (epx.f(obj2, r0cVar.C)) {
                    return s3q0.a;
                }
                r0cVar.C = obj2;
                r0cVar.N0();
                if (r0cVar.C.length() > 0 && ref$BooleanRef.element) {
                    p090 p090Var = r0cVar.F;
                    p090Var.getClass();
                    p090Var.d(new r090(com.vk.registration.funnels.b.a, 0));
                    ref$BooleanRef.element = false;
                }
                fzf fzfVar = wa6Var.A;
                if (fzfVar == null) {
                    fzfVar = null;
                }
                fzfVar.a.setErrorState(false);
                f4m.j(fzfVar.b);
                pj20 pj20Var = wa6Var.C;
                if (pj20Var == null) {
                    pj20Var = null;
                }
                pj20Var.b(pj20.a.a(pj20Var.m, null, false, false, false, 15));
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = wa6Var.y;
                if (vkAuthErrorStatedEditText == null) {
                    vkAuthErrorStatedEditText = null;
                }
                vkAuthErrorStatedEditText.setErrorState(false);
                TextView textView = wa6Var.x;
                f4m.j(textView != null ? textView : null);
                if (r0cVar.y0() > 0 && r0cVar.C.length() == r0cVar.y0()) {
                    r0cVar.O0(r0cVar.C);
                }
                return s3q0.a;
            case 7:
                enj.o((Context) this.c, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, rf3.c(((ExtendedUserProfile.Contact) this.d).d, new StringBuilder("mailto:"))), ((v1h) this.e).r);
                return s3q0.a;
            case 8:
                ((com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) this.c).T(new e.s(com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d.Z((vzh) this.d, ((c.f) this.e).b, true)));
                return s3q0.a;
            case 9:
                FriendsRequestsCommonVh friendsRequestsCommonVh = (FriendsRequestsCommonVh) this.c;
                Context context2 = (Context) this.d;
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.e;
                Integer num = (Integer) obj;
                VkRichCell vkRichCell = friendsRequestsCommonVh.d;
                VkRichCell vkRichCell2 = vkRichCell == null ? null : vkRichCell;
                if (vkRichCell == null) {
                    vkRichCell = null;
                }
                pgv0 middle = vkRichCell.getMiddle();
                vkRichCell2.setMiddle(middle != null ? FriendsRequestsCommonVh.a(middle, context2, uIBlockProfile) : null);
                uIBlockProfile.E = 1;
                n2i0.a(context2, hf8.a, new Intent("com.vkontakte.android.FRIEND_LIST_CHANGED"));
                if (!uIBlockProfile.A.z && ((intValue = num.intValue()) == 1 || intValue == 4)) {
                    zls.o(ams.a(), context2, false, 6);
                }
                return s3q0.a;
            case 10:
                izs izsVar2 = (izs) this.e;
                wh50 wh50Var2 = (wh50) this.c;
                wh50 wh50Var3 = (wh50) this.d;
                tho0 tho0Var = (tho0) obj;
                wh50Var2.setValue(tho0Var);
                String str4 = (String) wh50Var3.getValue();
                us2 us2Var = tho0Var.a;
                boolean f = epx.f(str4, us2Var.c);
                String str5 = us2Var.c;
                wh50Var3.setValue(str5);
                if (!f) {
                    izsVar2.invoke(brm0.y(str5, "\n", " "));
                }
                return s3q0.a;
            case 11:
                String str6 = (String) this.c;
                g0z g0zVar = (g0z) this.d;
                Bundle bundle = (Bundle) this.e;
                VKList vKList = (VKList) obj;
                MusicTrack musicTrack = (MusicTrack) j5g.a0(vKList);
                bn40.f("Search tracks successfully loaded, query:", str6, "count:", Integer.valueOf(vKList.size()));
                g0zVar.f(UUID.randomUUID().toString(), vKList, bundle);
                g0zVar.g(musicTrack, vKList, MusicPlaybackLaunchContext.H, bundle);
                return s3q0.a;
            case 12:
                Playlist playlist2 = (Playlist) this.c;
                return zuh0.a((zuh0) obj, new avh0.c(null, playlist2 != null ? playlist2.Cb() : null, "", 13), new bvh0(playlist2 != null ? playlist2.h : null, playlist2 != null ? Boolean.valueOf(playlist2.k) : null), new SearchHistoryItemViewParams$SubTitleParams(((SearchHistoryOtherVh) this.d).e(R.string.music_search_history_playlist, (String) this.e), null), new SearchHistoryItemViewParams$ActionIconParams(SearchHistoryItemViewParams$ActionIconParams.IconType.Chevron, false, null, 14));
            case 13:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) this.c;
                us2.d dVar2 = (us2.d) this.d;
                hik0 hik0Var = (hik0) this.e;
                us2.d dVar3 = (us2.d) obj;
                if (ref$BooleanRef2.element) {
                    T t = dVar3.a;
                    int i5 = dVar3.c;
                    int i6 = dVar3.b;
                    if ((t instanceof hik0) && i6 == dVar2.b && i5 == dVar2.c) {
                        if (hik0Var == null) {
                            hik0Var = new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, MinElf.PN_XNUM);
                        }
                        dVar = new us2.d(hik0Var, i6, i5);
                        ref$BooleanRef2.element = dVar2.equals(dVar3);
                        return dVar;
                    }
                }
                dVar = dVar3;
                ref$BooleanRef2.element = dVar2.equals(dVar3);
                return dVar;
            default:
                com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a aVar = (com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a) this.c;
                uzw0 uzw0Var = (uzw0) this.d;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.e;
                int i7 = com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.l1;
                gm50.a.a(aVar, ((d1x0.a) obj).a, new p0p0(5, uzw0Var, swipeRefreshLayout));
                return s3q0.a;
        }
    }

    public /* synthetic */ rw(izs izsVar, wh50 wh50Var, wh50 wh50Var2) {
        this.b = 10;
        this.e = izsVar;
        this.c = wh50Var;
        this.d = wh50Var2;
    }
}
