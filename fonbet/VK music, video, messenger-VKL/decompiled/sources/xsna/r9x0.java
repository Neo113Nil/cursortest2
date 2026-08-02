package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsChoicesOptionsDto;
import com.vk.api.generated.ads.dto.AdsHideReasonsDto;
import com.vk.api.generated.ads.dto.AdsHtml5GameDto;
import com.vk.api.generated.ads.dto.AdsHtml5GameInappActionDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdAppDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdBannerBaseLinkDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdBannerBaseLinksDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdCardDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdItemDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdPhotoMainDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemWallpostFeedbackDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.AdsChoicesOptions;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Link;
import com.vk.dto.newsfeed.Links;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Action;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ej90;
import xsna.ru0;
import xsna.uij0;

/* compiled from: WallItemDtoToNewsEntryMapper.kt */
/* loaded from: classes3.dex */
public final class r9x0 {
    public final zax0 a;
    public final ru0 b;

    public r9x0(zax0 zax0Var, ru0 ru0Var) {
        this.a = zax0Var;
        this.b = ru0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0343  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v37, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NewsEntry a(WallWallItemDto wallWallItemDto, ArrayMap<String, ReactionSet> arrayMap, SparseArray<BadgeItem> sparseArray, Map<UserId, Owner> map) {
        Links links;
        String str;
        String str2;
        String str3;
        float f;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        VideoAttachment videoAttachment;
        PhotoAttachment photoAttachment;
        EntryHeader entryHeader;
        String str9;
        String str10;
        ArrayList arrayList;
        AdsChoices adsChoices;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ShitAttachment shitAttachment;
        List list;
        int i2;
        EntryHeader entryHeader2;
        String str11;
        ArrayList<Pair> arrayList4;
        int intValue;
        Action b;
        AdsHtml5GameDto D;
        EntryHeader entryHeader3;
        AdsChoices adsChoices2;
        ArrayList<Pair> arrayList5;
        Html5Entry html5Entry;
        List list2;
        if (wallWallItemDto instanceof WallWallItemDto.WallItemAdsBlockDto) {
            WallWallItemDto.WallItemAdsBlockDto wallItemAdsBlockDto = (WallWallItemDto.WallItemAdsBlockDto) wallWallItemDto;
            ru0 ru0Var = this.b;
            ru0Var.getClass();
            AdsItemBlockAdItemDto adsItemBlockAdItemDto = (AdsItemBlockAdItemDto) j5g.a0(wallItemAdsBlockDto.g());
            AdsItemBlockAdItemDto.TypeDto w0 = adsItemBlockAdItemDto != null ? adsItemBlockAdItemDto.w0() : null;
            switch (w0 == null ? -1 : ru0.a.$EnumSwitchMapping$0[w0.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    uu0 uu0Var = ru0Var.a;
                    uu0Var.getClass();
                    List<AdsItemBlockAdItemDto> g = wallItemAdsBlockDto.g();
                    if (g.isEmpty()) {
                        shitAttachment = null;
                    } else {
                        int j = wallItemAdsBlockDto.j();
                        int k = wallItemAdsBlockDto.k();
                        String n = wallItemAdsBlockDto.n();
                        String i3 = wallItemAdsBlockDto.i();
                        String str12 = i3 == null ? "" : i3;
                        NewsfeedNewsfeedItemHeaderDto p = wallItemAdsBlockDto.p();
                        EntryHeader j2 = p != null ? skd.j(p, map) : null;
                        AdsItemBlockAdItemDto adsItemBlockAdItemDto2 = (AdsItemBlockAdItemDto) j5g.Y(g);
                        String o = wallItemAdsBlockDto.o();
                        String e = wallItemAdsBlockDto.e();
                        String str13 = e == null ? "" : e;
                        Integer v0 = adsItemBlockAdItemDto2.v0();
                        int intValue2 = v0 != null ? v0.intValue() : 0;
                        if (intValue2 != 0 && intValue2 < 2592000) {
                            intValue2 += pvo0.a();
                        }
                        int i4 = intValue2;
                        Float Z = adsItemBlockAdItemDto2.Z();
                        NewsEntryWithAttachments.Cut cut = new NewsEntryWithAttachments.Cut(-1, -1, Z != null ? Z.floatValue() : 1.0f, false, 8, null);
                        String description = adsItemBlockAdItemDto2.getDescription();
                        if (description == null) {
                            description = "";
                        }
                        ej90.b bVar = new ej90.b(null, cut.d, uij0.c.a, o25.a().i().U, null, 0, 0, null, null, 496);
                        ej90.c cVar = new ej90.c(0);
                        ej90 a = ej90.a.a(description, bVar, cVar);
                        boolean z = cVar.a;
                        WallWallItemDto.WallItemAdsBlockDto.AdSourceDto f2 = wallItemAdsBlockDto.f();
                        int i5 = f2 == null ? -1 : ii0.$EnumSwitchMapping$0[f2.ordinal()];
                        AdSource adSource = i5 != 1 ? i5 != 2 ? AdSource.UNKNOWN : AdSource.VK_FEED : AdSource.VKONTAKTE;
                        AdsHideReasonsDto u = wallItemAdsBlockDto.u();
                        ArrayList D2 = u != null ? dz5.D(u) : null;
                        NewsfeedItemWallpostFeedbackDto p2 = adsItemBlockAdItemDto2.p();
                        Feedback a2 = p2 != null ? nn60.a(p2) : null;
                        AdsItemBlockAdBannerBaseLinksDto M = adsItemBlockAdItemDto2.M();
                        if (M != null) {
                            AdsItemBlockAdBannerBaseLinkDto f3 = M.f();
                            Link a3 = f3 != null ? gw0.a(f3) : null;
                            AdsItemBlockAdBannerBaseLinkDto i6 = M.i();
                            Link a4 = i6 != null ? gw0.a(i6) : null;
                            AdsItemBlockAdBannerBaseLinkDto g2 = M.g();
                            Link a5 = g2 != null ? gw0.a(g2) : null;
                            AdsItemBlockAdBannerBaseLinkDto e2 = M.e();
                            Link a6 = e2 != null ? gw0.a(e2) : null;
                            AdsItemBlockAdBannerBaseLinkDto d = M.d();
                            links = new Links(a3, a4, a5, a6, d != null ? gw0.a(d) : null);
                        } else {
                            links = null;
                        }
                        String i7 = adsItemBlockAdItemDto2.w0().i();
                        if (j2 == null) {
                            j2 = pwu.a();
                        }
                        String u2 = adsItemBlockAdItemDto2.u();
                        String str14 = u2 == null ? "" : u2;
                        String a0 = adsItemBlockAdItemDto2.a0();
                        String str15 = a0 == null ? "" : a0;
                        String j3 = adsItemBlockAdItemDto2.j();
                        String str16 = j3 == null ? "" : j3;
                        String G = adsItemBlockAdItemDto2.G();
                        String str17 = G == null ? "" : G;
                        AdsItemBlockAdItemDto.LinkTypeDto F = adsItemBlockAdItemDto2.F();
                        String i8 = F != null ? F.i() : null;
                        String str18 = i8 == null ? "" : i8;
                        Float W = adsItemBlockAdItemDto2.W();
                        if (W != null) {
                            str = i7;
                            str2 = str15;
                            str3 = str17;
                            f = W.floatValue();
                        } else {
                            str = i7;
                            str2 = str15;
                            str3 = str17;
                            f = 0.0f;
                        }
                        String k2 = adsItemBlockAdItemDto2.k();
                        String str19 = k2 == null ? "" : k2;
                        String e3 = adsItemBlockAdItemDto2.e();
                        AdsItemBlockAdAppDto i9 = adsItemBlockAdItemDto2.i();
                        String d2 = i9 != null ? i9.d() : null;
                        String str20 = d2 == null ? "" : d2;
                        AdsItemBlockAdAppDto i10 = adsItemBlockAdItemDto2.i();
                        String e4 = i10 != null ? i10.e() : null;
                        String str21 = e4 == null ? "" : e4;
                        AdsItemBlockAdItemDto.LinkUrlTargetDto K = adsItemBlockAdItemDto2.K();
                        int i11 = K == null ? -1 : dbz.$EnumSwitchMapping$1[K.ordinal()];
                        if (i11 == 1) {
                            str4 = str14;
                            str5 = str16;
                            str6 = str18;
                            str7 = str19;
                            str8 = str20;
                            i = 2;
                        } else if (i11 == 2 || i11 != 3) {
                            str4 = str14;
                            str5 = str16;
                            str6 = str18;
                            str7 = str19;
                            str8 = str20;
                            i = 0;
                        } else {
                            str4 = str14;
                            str5 = str16;
                            str6 = str18;
                            str7 = str19;
                            str8 = str20;
                            i = 1;
                        }
                        String n2 = adsItemBlockAdItemDto2.n();
                        String str22 = n2 == null ? "" : n2;
                        String B = adsItemBlockAdItemDto2.B();
                        String str23 = B == null ? "" : B;
                        String o2 = adsItemBlockAdItemDto2.o();
                        String str24 = o2 == null ? "" : o2;
                        String title = adsItemBlockAdItemDto2.getTitle();
                        String str25 = title == null ? "" : title;
                        Image u3 = s101.u(adsItemBlockAdItemDto2.R());
                        List<AdsItemBlockAdPhotoMainDto> T = adsItemBlockAdItemDto2.T();
                        PhotoAttachment photoAttachment2 = T != null ? new PhotoAttachment(new Photo(s101.v(T))) : null;
                        VideoVideoFullDto y0 = adsItemBlockAdItemDto2.y0();
                        if (y0 != null) {
                            VideoAttachment a7 = uu0Var.a.a(y0, null);
                            a7.k.n8(true);
                            videoAttachment = a7;
                        } else {
                            videoAttachment = null;
                        }
                        String g3 = adsItemBlockAdItemDto2.g();
                        String str26 = g3 == null ? "" : g3;
                        List<AdsItemBlockAdCardDto> l = adsItemBlockAdItemDto2.l();
                        if (l != null) {
                            List<AdsItemBlockAdCardDto> list3 = l;
                            photoAttachment = photoAttachment2;
                            ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                AdsItemBlockAdCardDto adsItemBlockAdCardDto = (AdsItemBlockAdCardDto) it.next();
                                String l2 = adsItemBlockAdCardDto.l();
                                String str27 = l2 == null ? "" : l2;
                                String title2 = adsItemBlockAdCardDto.getTitle();
                                String str28 = title2 == null ? "" : title2;
                                AdsItemBlockAdAppDto d3 = adsItemBlockAdCardDto.d();
                                String e5 = d3 != null ? d3.e() : null;
                                String str29 = e5 == null ? "" : e5;
                                AdsItemBlockAdAppDto d4 = adsItemBlockAdCardDto.d();
                                String d5 = d4 != null ? d4.d() : null;
                                String str30 = d5 == null ? "" : d5;
                                String description2 = adsItemBlockAdCardDto.getDescription();
                                String str31 = description2 == null ? "" : description2;
                                String j4 = adsItemBlockAdCardDto.j();
                                String str32 = (j4 == null && (j4 = adsItemBlockAdCardDto.C()) == null) ? "" : j4;
                                String e6 = adsItemBlockAdCardDto.e();
                                String str33 = e6 == null ? "" : e6;
                                String f4 = adsItemBlockAdCardDto.f();
                                String str34 = f4 == null ? "" : f4;
                                Float B2 = adsItemBlockAdCardDto.B();
                                float floatValue = B2 != null ? B2.floatValue() : 0.0f;
                                AdsItemBlockAdCardDto.LinkUrlTargetDto n3 = adsItemBlockAdCardDto.n();
                                int i12 = n3 == null ? -1 : dbz.$EnumSwitchMapping$0[n3.ordinal()];
                                Iterator it2 = it;
                                if (i12 != 1) {
                                    if (i12 != 2 && i12 == 3) {
                                        i2 = 1;
                                    }
                                    i2 = 0;
                                } else {
                                    i2 = 2;
                                }
                                List<AdsItemBlockAdPhotoMainDto> p3 = adsItemBlockAdCardDto.p();
                                PhotoAttachment photoAttachment3 = p3 != null ? new PhotoAttachment(new Photo(s101.v(p3))) : null;
                                String u4 = adsItemBlockAdCardDto.u();
                                String str35 = u4 == null ? "" : u4;
                                String o3 = adsItemBlockAdCardDto.o();
                                ShitAttachment.Card card = new ShitAttachment.Card(str27, str28, str29, str30, str31, str32, str33, str34, floatValue, i2, photoAttachment3, str35, o3 == null ? "" : o3, adsItemBlockAdCardDto.o(), null, null, false, null, 114688, null);
                                List<AdsItemBlockAdStatPixelDto> D3 = adsItemBlockAdCardDto.D();
                                if (D3 != null) {
                                    List<AdsItemBlockAdStatPixelDto> list4 = D3;
                                    entryHeader2 = j2;
                                    str11 = str4;
                                    arrayList4 = new ArrayList(c5g.u(list4, 10));
                                    Iterator it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto = (AdsItemBlockAdStatPixelDto) it3.next();
                                        Iterator it4 = it3;
                                        String url = adsItemBlockAdStatPixelDto.getUrl();
                                        AdsItemBlockAdStatPixelDto.TypeDto i13 = adsItemBlockAdStatPixelDto.i();
                                        arrayList4.add(new Pair(url, i13 != null ? i13.i() : null));
                                        it3 = it4;
                                    }
                                } else {
                                    entryHeader2 = j2;
                                    str11 = str4;
                                    arrayList4 = null;
                                }
                                if (arrayList4 != null) {
                                    for (Pair pair : arrayList4) {
                                        String str36 = (String) pair.i();
                                        String str37 = str36 == null ? "" : str36;
                                        String str38 = (String) pair.j();
                                        if (str38 == null) {
                                            str38 = "";
                                        }
                                        card.h(new DeprecatedStatisticUrl(str37, str38, j, k, card.Y7(str38), card));
                                        description = description;
                                    }
                                }
                                arrayList6.add(card);
                                description = description;
                                it = it2;
                                j2 = entryHeader2;
                                str4 = str11;
                            }
                            entryHeader = j2;
                            str9 = str4;
                            str10 = description;
                            arrayList = p4g.q(arrayList6);
                        } else {
                            photoAttachment = photoAttachment2;
                            entryHeader = j2;
                            str9 = str4;
                            str10 = description;
                            arrayList = null;
                        }
                        Boolean D0 = adsItemBlockAdItemDto2.D0();
                        boolean booleanValue = D0 != null ? D0.booleanValue() : true;
                        NewsEntry.TrackData trackData = new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null);
                        UserId C = adsItemBlockAdItemDto2.C();
                        if (C == null) {
                            C = UserId.d;
                        }
                        UserId userId = C;
                        ArrayList q = D2 != null ? p4g.q(D2) : null;
                        AdsChoicesDto d6 = wallItemAdsBlockDto.d();
                        if (d6 != null) {
                            String g4 = d6.g();
                            String d7 = d6.d();
                            String f5 = d6.f();
                            String e7 = d6.e();
                            List<AdsChoicesOptionsDto> i14 = d6.i();
                            if (i14 != null) {
                                List<AdsChoicesOptionsDto> list5 = i14;
                                list = new ArrayList(c5g.u(list5, 10));
                                for (AdsChoicesOptionsDto adsChoicesOptionsDto : list5) {
                                    list.add(new AdsChoicesOptions(adsChoicesOptionsDto.d(), adsChoicesOptionsDto.getType(), adsChoicesOptionsDto.i(), adsChoicesOptionsDto.e(), adsChoicesOptionsDto.j(), adsChoicesOptionsDto.f(), adsChoicesOptionsDto.g()));
                                }
                            } else {
                                list = EmptyList.b;
                            }
                            adsChoices = new AdsChoices(g4, d7, f5, e7, list);
                        } else {
                            adsChoices = null;
                        }
                        ShitAttachment shitAttachment2 = new ShitAttachment(j, k, str, n, entryHeader, str9, str2, str5, str3, links, str6, f, str7, e3, null, str8, str21, i, str10, str22, str23, str24, i4, str25, u3, photoAttachment, videoAttachment, str26, arrayList, a, null, cut, booleanValue, str12, trackData, userId, null, o, str13, z, q, adSource, null, null, null, null, null, null, null, adsChoices, false, null, null, null, null, 0, 391184, null);
                        shitAttachment2.g = a2;
                        List<AdsItemBlockAdStatPixelDto> l3 = wallItemAdsBlockDto.l();
                        if (l3 != null) {
                            List<AdsItemBlockAdStatPixelDto> list6 = l3;
                            arrayList2 = new ArrayList(c5g.u(list6, 10));
                            for (AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto2 : list6) {
                                String url2 = adsItemBlockAdStatPixelDto2.getUrl();
                                AdsItemBlockAdStatPixelDto.TypeDto i15 = adsItemBlockAdStatPixelDto2.i();
                                arrayList2.add(new Pair(url2, i15 != null ? i15.i() : null));
                            }
                        } else {
                            arrayList2 = null;
                        }
                        List<AdsItemBlockAdStatPixelDto> l0 = adsItemBlockAdItemDto2.l0();
                        if (l0 != null) {
                            List<AdsItemBlockAdStatPixelDto> list7 = l0;
                            arrayList3 = new ArrayList(c5g.u(list7, 10));
                            for (AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto3 : list7) {
                                String url3 = adsItemBlockAdStatPixelDto3.getUrl();
                                AdsItemBlockAdStatPixelDto.TypeDto i16 = adsItemBlockAdStatPixelDto3.i();
                                arrayList3.add(new Pair(url3, i16 != null ? i16.i() : null));
                            }
                        } else {
                            arrayList3 = null;
                        }
                        ydj0.b(arrayList2, shitAttachment2, j, k);
                        ydj0.b(arrayList3, shitAttachment2, j, k);
                        Serializer.c<PixelStats> cVar2 = PixelStats.CREATOR;
                        AdsItemBlockAdStatPixelDto.TypeDto typeDto = AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION;
                        shitAttachment2.a0.c = new PixelStats(adsItemBlockAdItemDto2.f(), typeDto, PixelStats.a.a(typeDto, j, k, 0, 24));
                        shitAttachment2.w = new DeprecatedStatisticUrl(adsItemBlockAdItemDto2.f(), "impression", j, k, -1, shitAttachment2);
                        VideoAttachment videoAttachment2 = shitAttachment2.I;
                        if (videoAttachment2 != null) {
                            videoAttachment2.Mb(shitAttachment2);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        if (videoAttachment2 != null) {
                            videoAttachment2.o = shitAttachment2;
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        if (videoAttachment2 != null) {
                            videoAttachment2.b = true;
                            s3q0 s3q0Var3 = s3q0.a;
                        }
                        PhotoAttachment photoAttachment4 = shitAttachment2.H;
                        if (photoAttachment4 != null) {
                            photoAttachment4.b = true;
                            s3q0 s3q0Var4 = s3q0.a;
                        }
                        shitAttachment2.l0 = dy2.i(shitAttachment2.x);
                        shitAttachment = shitAttachment2;
                    }
                    if (shitAttachment != null) {
                        ru0Var.a(shitAttachment, new su0(0, shitAttachment, ShitAttachment.class, "trackLoaded", "trackLoaded()V", 0));
                        return shitAttachment;
                    }
                    break;
                case 6:
                    List<AdsItemBlockAdItemDto> g5 = wallItemAdsBlockDto.g();
                    if (!g5.isEmpty()) {
                        Integer v02 = ((AdsItemBlockAdItemDto) j5g.Y(g5)).v0();
                        intValue = v02 != null ? v02.intValue() : 0;
                        if (intValue != 0 && intValue < 2592000) {
                            pvo0.a();
                        }
                        NewsfeedNewsfeedItemHeaderDto p4 = wallItemAdsBlockDto.p();
                        if (p4 != null) {
                            skd.j(p4, map);
                            return null;
                        }
                    }
                    return null;
                case 7:
                    List<AdsItemBlockAdItemDto> g6 = wallItemAdsBlockDto.g();
                    if (!g6.isEmpty()) {
                        int j5 = wallItemAdsBlockDto.j();
                        int k3 = wallItemAdsBlockDto.k();
                        String n4 = wallItemAdsBlockDto.n();
                        AdsItemBlockAdItemDto adsItemBlockAdItemDto3 = (AdsItemBlockAdItemDto) j5g.Y(g6);
                        String o4 = wallItemAdsBlockDto.o();
                        String e8 = wallItemAdsBlockDto.e();
                        String str39 = e8 == null ? "" : e8;
                        Integer v03 = adsItemBlockAdItemDto3.v0();
                        intValue = v03 != null ? v03.intValue() : 0;
                        if (intValue != 0 && intValue < 2592000) {
                            intValue += pvo0.a();
                        }
                        NewsfeedNewsfeedItemHeaderDto p5 = wallItemAdsBlockDto.p();
                        EntryHeader j6 = p5 != null ? skd.j(p5, map) : null;
                        WallWallItemDto.WallItemAdsBlockDto.AdSourceDto f6 = wallItemAdsBlockDto.f();
                        int i17 = f6 == null ? -1 : ii0.$EnumSwitchMapping$0[f6.ordinal()];
                        AdSource adSource2 = i17 != 1 ? i17 != 2 ? AdSource.UNKNOWN : AdSource.VK_FEED : AdSource.VKONTAKTE;
                        AdsHideReasonsDto u5 = wallItemAdsBlockDto.u();
                        ArrayList D4 = u5 != null ? dz5.D(u5) : null;
                        BaseLinkButtonActionDto d8 = adsItemBlockAdItemDto3.d();
                        if (d8 != null && (b = wf6.b(d8)) != null && (D = adsItemBlockAdItemDto3.D()) != null) {
                            String r = D.r();
                            String f7 = D.f();
                            boolean d9 = D.d();
                            String g7 = D.g();
                            float j7 = D.j();
                            new ne6();
                            Image a8 = ne6.a(D.i());
                            List<AdsHtml5GameInappActionDto> e9 = D.e();
                            ArrayList arrayList7 = new ArrayList(c5g.u(e9, 10));
                            for (AdsHtml5GameInappActionDto adsHtml5GameInappActionDto : e9) {
                                String e10 = adsHtml5GameInappActionDto.e();
                                Action b2 = wf6.b(adsHtml5GameInappActionDto.d());
                                if (b2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                arrayList7.add(new Html5Action(e10, b2));
                            }
                            Html5Entry.Html5App html5App = new Html5Entry.Html5App(r, f7, d9, g7, j7, a8, p4g.q(arrayList7));
                            String title3 = adsItemBlockAdItemDto3.getTitle();
                            String str40 = title3 == null ? "" : title3;
                            String description3 = adsItemBlockAdItemDto3.getDescription();
                            String str41 = description3 == null ? "" : description3;
                            String n5 = adsItemBlockAdItemDto3.n();
                            String str42 = n5 == null ? "" : n5;
                            if (j6 == null) {
                                Image u6 = s101.u(adsItemBlockAdItemDto3.R());
                                Serializer.c<Owner> cVar3 = Owner.CREATOR;
                                SourcePhoto sourcePhoto = new SourcePhoto(null, u6, Owner.a.a(iah0.a(40), u6));
                                String title4 = adsItemBlockAdItemDto3.getTitle();
                                entryHeader3 = new EntryHeader(sourcePhoto, new HeaderTitle(null, title4 != null ? Collections.singletonList(new Text(title4, null, 2, null)) : null, null, new VerifyInfo(false, false, false, false, false, false, 63, null), false, false, false), null, null, null, null, null, null, null);
                            } else {
                                entryHeader3 = j6;
                            }
                            AdsItemBlockAdItemDto.LinkUrlTargetDto K2 = adsItemBlockAdItemDto3.K();
                            String i18 = K2 != null ? K2.i() : null;
                            String str43 = i18 == null ? "" : i18;
                            String G2 = adsItemBlockAdItemDto3.G();
                            String str44 = G2 == null ? "" : G2;
                            String g8 = adsItemBlockAdItemDto3.g();
                            String str45 = g8 == null ? "" : g8;
                            Image u7 = s101.u(adsItemBlockAdItemDto3.R());
                            Image v = s101.v(adsItemBlockAdItemDto3.T());
                            String e11 = adsItemBlockAdItemDto3.e();
                            NewsEntry.TrackData trackData2 = new NewsEntry.TrackData(null, 0, 0L, false, false, null, null, 0, 255, null);
                            ArrayList q2 = D4 != null ? p4g.q(D4) : null;
                            AdsChoicesDto d10 = wallItemAdsBlockDto.d();
                            if (d10 != null) {
                                String g9 = d10.g();
                                String d11 = d10.d();
                                String f8 = d10.f();
                                String e12 = d10.e();
                                List<AdsChoicesOptionsDto> i19 = d10.i();
                                if (i19 != null) {
                                    List<AdsChoicesOptionsDto> list8 = i19;
                                    list2 = new ArrayList(c5g.u(list8, 10));
                                    for (AdsChoicesOptionsDto adsChoicesOptionsDto2 : list8) {
                                        list2.add(new AdsChoicesOptions(adsChoicesOptionsDto2.d(), adsChoicesOptionsDto2.getType(), adsChoicesOptionsDto2.i(), adsChoicesOptionsDto2.e(), adsChoicesOptionsDto2.j(), adsChoicesOptionsDto2.f(), adsChoicesOptionsDto2.g()));
                                    }
                                } else {
                                    list2 = EmptyList.b;
                                }
                                adsChoices2 = new AdsChoices(g9, d11, f8, e12, list2);
                            } else {
                                adsChoices2 = null;
                            }
                            Html5Entry html5Entry2 = new Html5Entry(j5, k3, intValue, n4, str45, str40, str41, str42, entryHeader3, str43, str44, u7, v, b, html5App, e11, null, trackData2, null, o4, str39, q2, adSource2, null, null, null, adsChoices2, 58982400, null);
                            List<AdsItemBlockAdStatPixelDto> l4 = wallItemAdsBlockDto.l();
                            if (l4 != null) {
                                List<AdsItemBlockAdStatPixelDto> list9 = l4;
                                arrayList5 = new ArrayList(c5g.u(list9, 10));
                                for (AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto4 : list9) {
                                    String url4 = adsItemBlockAdStatPixelDto4.getUrl();
                                    AdsItemBlockAdStatPixelDto.TypeDto i20 = adsItemBlockAdStatPixelDto4.i();
                                    arrayList5.add(new Pair(url4, i20 != null ? i20.i() : null));
                                }
                            } else {
                                arrayList5 = null;
                            }
                            if (arrayList5 != null) {
                                for (Pair pair2 : arrayList5) {
                                    String str46 = (String) pair2.i();
                                    String str47 = str46 == null ? "" : str46;
                                    String str48 = (String) pair2.j();
                                    if (str48 == null) {
                                        str48 = "";
                                    }
                                    Html5Entry html5Entry3 = html5Entry2;
                                    int i21 = k3;
                                    DeprecatedStatisticUrl deprecatedStatisticUrl = new DeprecatedStatisticUrl(str47, str48, j5, i21, html5Entry2.A.c(str48), html5Entry3);
                                    k3 = i21;
                                    html5Entry2 = html5Entry3;
                                    html5Entry2.h(deprecatedStatisticUrl);
                                }
                            }
                            Html5Entry html5Entry4 = html5Entry2;
                            html5Entry4.y = new DeprecatedStatisticUrl(adsItemBlockAdItemDto3.f(), "impression", j5, k3, -1, html5Entry4);
                            html5Entry = html5Entry4;
                            if (html5Entry != null) {
                                ru0Var.a(html5Entry, new tu0(0, html5Entry, Html5Entry.class, "trackLoaded", "trackLoaded()V", 0));
                                return html5Entry;
                            }
                            return null;
                        }
                    }
                    html5Entry = null;
                    if (html5Entry != null) {
                    }
                    return null;
                default:
                    return null;
            }
        } else if (wallWallItemDto instanceof WallWallItemDto.WallWallpostFullDto) {
            return zax0.a(this.a, (WallWallItemDto.WallWallpostFullDto) wallWallItemDto, arrayMap, sparseArray, map);
        }
        return null;
    }
}
