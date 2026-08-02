package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsBanInfoDto;
import com.vk.api.generated.groups.dto.GroupsBanInfoReasonDto;
import com.vk.api.generated.groups.dto.GroupsOwnerXtrBanInfoDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.helpers.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Triple;
import xsna.pb60;
import xsna.q630;
import xsna.qjh;
import xsna.tt9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z85(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ImageSize Fb;
        UserProfile userProfile;
        UserProfile userProfile2;
        List singletonList;
        s1c0 s1c0Var;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                d95.h((qja0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                GoodAlbum goodAlbum = (GoodAlbum) this.c;
                qjh.b bVar = (qjh.b) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(771369193, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.CommunityProfileContentMarketAlbumsAdapter.ViewHolder.onBind.<anonymous>.<anonymous> (CommunityProfileContentMarketAlbumsAdapter.kt:41)");
                    }
                    azl azlVar = (azl) aVar.r(uvi.h);
                    float f = 154;
                    Photo photo = goodAlbum.e;
                    String str = goodAlbum.d;
                    boolean J = aVar.J(photo) | aVar.J(azlVar);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        int I0 = (int) azlVar.I0(f);
                        Photo photo2 = goodAlbum.e;
                        x = (photo2 == null || (Fb = photo2.Fb(I0, false)) == null) ? null : Fb.d.d;
                        aVar.R(x);
                    }
                    String str2 = (String) x;
                    boolean z = bVar.o;
                    q630.a aVar2 = q630.a.a;
                    if (z) {
                        aVar.K(1785088616);
                        q630 v = txj0.v(s200.H(s200.F(kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7), f);
                        boolean y = aVar.y(bVar) | aVar.y(goodAlbum);
                        Object x2 = aVar.x();
                        if (y || x2 == c0012a) {
                            x2 = new defpackage.f0(9, bVar, goodAlbum);
                            aVar.R(x2);
                        }
                        xi1.d(0, aVar, str2, str, ojc.c(v, false, null, null, (gzs) x2, 15));
                        aVar.j();
                    } else {
                        aVar.K(1785650863);
                        q630 v2 = txj0.v(s200.H(s200.F(kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, 7), f);
                        boolean y2 = aVar.y(bVar) | aVar.y(goodAlbum);
                        Object x3 = aVar.x();
                        if (y2 || x3 == c0012a) {
                            x3 = new rs0(6, bVar, goodAlbum);
                            aVar.R(x3);
                        }
                        xi1.b(0, aVar, str2, str, ojc.c(v2, false, null, null, (gzs) x3, 15));
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                nzh.a((xig0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                com.vk.newsfeed.impl.helpers.a aVar3 = (com.vk.newsfeed.impl.helpers.a) this.c;
                List<GroupsOwnerXtrBanInfoDto> list = (List) this.d;
                a.C1382a c1382a = (a.C1382a) obj2;
                List<UsersUserFullDto> list2 = (List) obj;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (UsersUserFullDto usersUserFullDto : list2) {
                    Long valueOf = Long.valueOf(usersUserFullDto.s1().b);
                    aVar3.c.getClass();
                    linkedHashMap.put(valueOf, j2r0.a(usersUserFullDto));
                }
                ArrayList arrayList = new ArrayList();
                for (GroupsOwnerXtrBanInfoDto groupsOwnerXtrBanInfoDto : list) {
                    UsersUserDto e2 = groupsOwnerXtrBanInfoDto.e();
                    if (e2 == null) {
                        userProfile = null;
                    } else {
                        UserProfile a = i2r0.a(e2);
                        GroupsBanInfoDto d = groupsOwnerXtrBanInfoDto.d();
                        if (d != null) {
                            Bundle bundle = a.s;
                            if (d.d() != null && (userProfile2 = (UserProfile) linkedHashMap.get(Long.valueOf(r8.intValue()))) != null) {
                                bundle.putParcelable("ban_admin", userProfile2);
                            }
                            Integer g = d.g();
                            if (g != null) {
                                bundle.putInt("ban_date", g.intValue());
                            }
                            Integer i = d.i();
                            if (i != null) {
                                bundle.putInt("ban_end_date", i.intValue());
                            }
                            GroupsBanInfoReasonDto j = d.j();
                            if (j != null) {
                                bundle.putInt("ban_reason", j.i());
                            }
                            String e3 = d.e();
                            if (e3 != null) {
                                bundle.putString("ban_comment", e3);
                            }
                            Boolean f2 = d.f();
                            if (f2 != null) {
                                bundle.putBoolean("ban_comment_visible", f2.booleanValue());
                            }
                        }
                        userProfile = a;
                    }
                    if (userProfile != null) {
                        arrayList.add(userProfile);
                    }
                }
                if (!arrayList.isEmpty() || !c1382a.a) {
                    break;
                } else {
                    UserProfile userProfile3 = new UserProfile();
                    userProfile3.s.putBoolean("is_group_member", c1382a.b);
                    break;
                }
                break;
            case 4:
                jai jaiVar = (jai) this.c;
                anx anxVar = (anx) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1934988955, intValue2, -1, "com.vk.core.compose.component.internal.InternalScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:324)");
                    }
                    jaiVar.invoke(anxVar, aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((uiy) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((lb40) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                x050.a((UIBlockMusicPlaylist) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                Parcelable parcelable = (NewsEntry) this.c;
                pb60.b bVar2 = (pb60.b) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList2 = uIBlockList.y;
                ArrayList arrayList3 = new ArrayList();
                for (UIBlock uIBlock : arrayList2) {
                    if (uIBlock.e.i()) {
                        UIBlockFeed uIBlockFeed = (UIBlockFeed) uIBlock;
                        u1c0 u1c0Var = uIBlockFeed.y;
                        if (epx.f(u1c0Var.a, parcelable)) {
                            azp0 azp0Var = bVar2.d;
                            NewsEntry newsEntry = u1c0Var.b;
                            int f3 = u1c0Var.f();
                            if (f3 == 1) {
                                s1c0 s1c0Var2 = u1c0Var.n;
                                if (s1c0Var2 != null) {
                                    u1c0Var.h = (ol60) j5g.a0(new uy9((h170) azp0Var.a).l(0, new Triple(parcelable, newsEntry, s1c0Var2)));
                                }
                            } else if (f3 == 302 && (s1c0Var = u1c0Var.n) != null) {
                                u1c0Var.h = (ol60) j5g.a0(new q5w().a(0, new Triple(parcelable, newsEntry, s1c0Var)));
                            }
                            Parcelable parcelable2 = u1c0Var.a;
                            if ((parcelable instanceof c6z) && (parcelable2 instanceof c6z)) {
                                ((d2f0) bVar2.e.getValue()).getClass();
                                d2f0.d((c6z) parcelable2, (c6z) parcelable);
                            }
                            singletonList = Collections.singletonList(new UIBlockFeed(sua.l(uIBlockFeed), uIBlockFeed.j, uIBlockFeed.y, uIBlockFeed.A, uIBlockFeed.B, uIBlockFeed.k, uIBlockFeed.Qb()));
                        } else {
                            singletonList = Collections.singletonList(uIBlock);
                        }
                    } else {
                        singletonList = Collections.singletonList(uIBlock);
                    }
                    g5g.y(singletonList, arrayList3);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                nud0.b((tt9.a) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.c.e((d.c) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ z85(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = q630Var;
    }
}
