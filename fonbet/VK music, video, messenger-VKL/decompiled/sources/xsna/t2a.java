package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionMarketEditAlbumInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogButtonOptionsDto;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonAddFriends;
import com.vk.catalog2.common.dto.api.CatalogButtonAllFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonClearDownloadsHistory;
import com.vk.catalog2.common.dto.api.CatalogButtonClearRecent;
import com.vk.catalog2.common.dto.api.CatalogButtonCloseNotification;
import com.vk.catalog2.common.dto.api.CatalogButtonCreatePlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonDownloadAll;
import com.vk.catalog2.common.dto.api.CatalogButtonDragAndRemove;
import com.vk.catalog2.common.dto.api.CatalogButtonEnterEditMode;
import com.vk.catalog2.common.dto.api.CatalogButtonExpandBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonFriendsCleanup;
import com.vk.catalog2.common.dto.api.CatalogButtonImportContacts;
import com.vk.catalog2.common.dto.api.CatalogButtonLogout;
import com.vk.catalog2.common.dto.api.CatalogButtonMakeCall;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketEditAlbum;
import com.vk.catalog2.common.dto.api.CatalogButtonMarketOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonMyAudiosSectionOptions;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenChallenge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenDialog;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenInfoPopup;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreen;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenScreenLarge;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenSection;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudio;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayAudioFromBlock;
import com.vk.catalog2.common.dto.api.CatalogButtonPlayMix;
import com.vk.catalog2.common.dto.api.CatalogButtonRemoveFriend;
import com.vk.catalog2.common.dto.api.CatalogButtonResetFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonSaveAsPlaylist;
import com.vk.catalog2.common.dto.api.CatalogButtonSearchMode;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchAccount;
import com.vk.catalog2.common.dto.api.CatalogButtonSwitchSection;
import com.vk.catalog2.common.dto.api.CatalogButtonUpdateNonActiveGroups;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.ActionOpenEditMarketAlbum;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.commons.http.Http;

/* compiled from: CatalogButtonMapper.kt */
/* loaded from: classes16.dex */
public final class t2a {
    public final bpn0 a = new bpn0(new vv0(6));
    public final bpn0 b = new bpn0(new iz3(2));

    /* compiled from: CatalogButtonMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BaseLinkButtonActionTypeDto.values().length];
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SWITCH_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.RESET_SEARCH_FILTERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SEARCH_FILTERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SECTION_SLIDER_CELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_RECENT_GROUPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PODCASTS_SUBSECTION_TABS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MY_MUSIC_SUBSECTION_TABS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SELECT_SORTING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.GROUPS_MY_GROUPS_TABS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MY_MUSIC_FILTER_SAVE_AS_PLAYLIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_URL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.IMPORT_CONTACTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ADD_FRIENDS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_CLEANUP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_LISTS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_SORT_MODES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SCREEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SCREEN_LARGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_CALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_MESSAGE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.FRIENDS_REMOVE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.GROUPS_NON_ACTIVE_GROUPS_UPDATE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MARKET_OPTIONS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.EXPAND_BLOCK_LOCAL.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SEARCH_MODE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_SHUFFLED_AUDIOS_FROM_BLOCK.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_AUDIOS_FROM_BLOCK.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ENTER_EDIT_MODE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CREATE_PLAYLIST.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.EDIT_ITEMS.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MY_AUDIOS_SECTION_OPTIONS.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.DOWNLOAD_ALL.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_DOWNLOAD_HISTORY.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MARKET_EDIT_ALBUM.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SWITCH_ACCOUNT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.LOGOUT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_INFO_POPUP.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_VK_MIX.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLOSE_CATALOG_BANNER.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_SEARCH_HISTORY.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_AUDIO.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_CHALLENGE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ADD_FRIEND.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseOwnerButtonActionTargetDto.values().length];
            try {
                iArr2[BaseOwnerButtonActionTargetDto.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr2[BaseOwnerButtonActionTargetDto.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr2[BaseOwnerButtonActionTargetDto.AUTHORIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused47) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static CatalogButton b(BaseLinkButtonDto baseLinkButtonDto) {
        BaseLinkButtonActionDto e;
        BaseLinkButtonActionTypeDto C;
        if (baseLinkButtonDto != null && (e = baseLinkButtonDto.e()) != null) {
            BaseLinkButtonActionTypeDto C2 = e.C();
            int i = a.$EnumSwitchMapping$0[C2.ordinal()];
            if (i != 1) {
                if (i == 35) {
                    return d(baseLinkButtonDto.getTitle(), baseLinkButtonDto.k(), e);
                }
                if (i == 12) {
                    String title = baseLinkButtonDto.getTitle();
                    String l = baseLinkButtonDto.l();
                    BaseLinkButtonStyleDto o = baseLinkButtonDto.o();
                    return e(title, null, e, l, o != null ? o.i() : null);
                }
                if (i == 13) {
                    String j = e.C().j();
                    String k = baseLinkButtonDto.k();
                    String title2 = baseLinkButtonDto.getTitle();
                    return new CatalogButtonImportContacts(j, k, title2 != null ? title2 : "", e.g());
                }
                switch (i) {
                    case 42:
                        String j2 = C2.j();
                        String i2 = baseLinkButtonDto.i();
                        String str = i2 == null ? "" : i2;
                        Integer g = baseLinkButtonDto.g();
                        int intValue = g != null ? g.intValue() : -1;
                        UserId q = baseLinkButtonDto.q();
                        if (q == null) {
                            q = UserId.d;
                        }
                        return new CatalogButtonPlayAudio(j2, "", str, intValue, q, e.g());
                    case 43:
                        String j3 = C2.j();
                        String i3 = baseLinkButtonDto.i();
                        String str2 = i3 == null ? "" : i3;
                        String j4 = baseLinkButtonDto.j();
                        return new CatalogButtonOpenChallenge(j3, null, str2, j4 == null ? "" : j4, e.g());
                    case 44:
                        String j5 = C2.j();
                        String title3 = baseLinkButtonDto.getTitle();
                        return new CatalogButtonAddFriend(j5, null, title3 != null ? title3 : "", e.g());
                }
            }
            BaseLinkButtonActionDto e2 = baseLinkButtonDto.e();
            if (e2 != null && (C = e2.C()) != null) {
                String j6 = C.j();
                String title4 = baseLinkButtonDto.getTitle();
                String str3 = title4 == null ? "" : title4;
                String n = baseLinkButtonDto.n();
                String str4 = n == null ? "" : n;
                String l2 = baseLinkButtonDto.l();
                BaseLinkButtonStyleDto o2 = baseLinkButtonDto.o();
                return new CatalogButtonOpenSection(j6, null, str3, str4, null, null, l2, null, null, o2 != null ? o2.i() : null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE, null);
            }
        }
        return null;
    }

    public static CatalogButtonMarketEditAlbum d(String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        ActionOpenEditMarketAlbum actionOpenEditMarketAlbum;
        String j = baseLinkButtonActionDto.C().j();
        if (str == null) {
            str = "";
        }
        BaseLinkButtonActionMarketEditAlbumInfoDto k = baseLinkButtonActionDto.k();
        if (k != null) {
            UserId q = k.q();
            if (q == null) {
                q = UserId.d;
            }
            Integer d = k.d();
            actionOpenEditMarketAlbum = new ActionOpenEditMarketAlbum(q, d != null ? d.intValue() : 0);
        } else {
            actionOpenEditMarketAlbum = null;
        }
        return new CatalogButtonMarketEditAlbum(j, str2, str, actionOpenEditMarketAlbum);
    }

    public static CatalogButtonOpenUrl e(String str, String str2, BaseLinkButtonActionDto baseLinkButtonActionDto, String str3, String str4) {
        ActionOpenUrl.Target target;
        BaseOwnerButtonActionTargetDto B = baseLinkButtonActionDto.B();
        int i = B == null ? -1 : a.$EnumSwitchMapping$1[B.ordinal()];
        if (i == -1) {
            target = ActionOpenUrl.Target.f30default;
        } else if (i == 1) {
            target = ActionOpenUrl.Target.f88internal;
        } else if (i == 2) {
            target = ActionOpenUrl.Target.external;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            target = ActionOpenUrl.Target.authorize;
        }
        String url = baseLinkButtonActionDto.getUrl();
        if (url == null) {
            url = "";
        }
        return new CatalogButtonOpenUrl(baseLinkButtonActionDto.C().j(), str2, str == null ? "" : str, new ActionOpenUrl(url, target), null, str3, null, null, str4, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, null);
    }

    public final ne6 a() {
        return (ne6) this.b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CatalogButton c(CatalogButtonDto catalogButtonDto) {
        BaseLinkButtonActionDto d;
        BaseLinkButtonActionTypeDto C;
        BaseLinkButtonActionDto d2;
        ArrayList arrayList;
        Image image;
        CatalogBadge catalogBadge;
        String i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (catalogButtonDto != null && (d = catalogButtonDto.d()) != null && (C = d.C()) != null && (d2 = catalogButtonDto.d()) != null) {
            int i2 = a.$EnumSwitchMapping$0[C.ordinal()];
            bpn0 bpn0Var = this.a;
            switch (i2) {
                case 1:
                    String j = C.j();
                    String o = catalogButtonDto.o();
                    String title = catalogButtonDto.getTitle();
                    String str = title == null ? "" : title;
                    String W = catalogButtonDto.W();
                    String str2 = W == null ? "" : W;
                    String r = catalogButtonDto.r();
                    String p = catalogButtonDto.p();
                    ne6 a2 = a();
                    List<BaseImageDto> u = catalogButtonDto.u();
                    a2.getClass();
                    return new CatalogButtonOpenSection(j, o, str, str2, r, d2.g(), p, ne6.a(u), catalogButtonDto.R(), null, catalogButtonDto.G(), 512, null);
                case 2:
                    String j2 = C.j();
                    String o2 = catalogButtonDto.o();
                    String title2 = catalogButtonDto.getTitle();
                    String str3 = title2 == null ? "" : title2;
                    String W2 = catalogButtonDto.W();
                    String str4 = W2 == null ? "" : W2;
                    String i3 = catalogButtonDto.i();
                    String g = d2.g();
                    String j3 = catalogButtonDto.j();
                    BaseLinkButtonStyleDto u2 = d2.u();
                    return new CatalogButtonSwitchSection(j2, o2, str3, str4, i3, g, j3, null, u2 != null ? u2.i() : null, d2.getUrl(), catalogButtonDto.r(), catalogButtonDto.p(), 128, null);
                case 3:
                    return new CatalogButtonResetFilters(C.j(), catalogButtonDto.o(), catalogButtonDto.r(), catalogButtonDto.k());
                case 4:
                    String j4 = C.j();
                    String o3 = catalogButtonDto.o();
                    String title3 = catalogButtonDto.getTitle();
                    return new CatalogButtonAllFilters(j4, o3, title3 == null ? "" : title3, catalogButtonDto.r(), catalogButtonDto.k());
                case 5:
                    String j5 = C.j();
                    String o4 = catalogButtonDto.o();
                    String title4 = catalogButtonDto.getTitle();
                    String str5 = title4 == null ? "" : title4;
                    String W3 = catalogButtonDto.W();
                    String str6 = W3 == null ? "" : W3;
                    String r2 = catalogButtonDto.r();
                    String p2 = catalogButtonDto.p();
                    ne6 a3 = a();
                    List<BaseImageDto> u3 = catalogButtonDto.u();
                    a3.getClass();
                    return new CatalogButtonOpenSection(j5, o4, str5, str6, r2, d2.g(), p2, ne6.a(u3), catalogButtonDto.R(), null, catalogButtonDto.G(), 512, null);
                case 6:
                    String j6 = C.j();
                    String o5 = catalogButtonDto.o();
                    List<String> Z = catalogButtonDto.Z();
                    if (Z == null) {
                        Z = EmptyList.b;
                    }
                    return new CatalogButtonClearRecent(j6, o5, "", Z, d2.g(), catalogButtonDto.r());
                case 7:
                case 8:
                case 9:
                case 10:
                    String j7 = C.j();
                    boolean z = false;
                    String o6 = catalogButtonDto.o();
                    String i4 = catalogButtonDto.i();
                    String str7 = i4 == null ? "" : i4;
                    String title5 = catalogButtonDto.getTitle();
                    String str8 = title5 == null ? "" : title5;
                    List<CatalogButtonOptionsDto> F = catalogButtonDto.F();
                    if (F != null) {
                        List<CatalogButtonOptionsDto> list = F;
                        arrayList = new ArrayList(c5g.u(list, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto : list) {
                            String i5 = catalogButtonOptionsDto.i();
                            String l = catalogButtonOptionsDto.l();
                            CatalogButtonOptionsDto.IconDto f = catalogButtonOptionsDto.f();
                            String str9 = (f == null || (i = f.i()) == null) ? "" : i;
                            String str10 = r0;
                            boolean z2 = catalogButtonOptionsDto.j() == BaseBoolIntDto.YES ? true : z;
                            List<BaseImageDto> g2 = catalogButtonOptionsDto.g();
                            if (g2 != null) {
                                a().getClass();
                                image = ne6.a(g2);
                            } else {
                                image = str10;
                            }
                            CatalogBadgeDto d3 = catalogButtonOptionsDto.d();
                            if (d3 != null) {
                                String d4 = d3.d();
                                catalogBadge = new CatalogBadge(d4 == null ? "" : d4, d3.e().i());
                            } else {
                                catalogBadge = str10;
                            }
                            arrayList.add(new CatalogFilterData(i5, l, str9, z2, image, catalogBadge, catalogButtonOptionsDto.e(), null, null, 384, null));
                            r0 = str10;
                            z = false;
                        }
                    } else {
                        arrayList = null;
                    }
                    return new CatalogButtonFilters(j7, o6, str7, str8, arrayList, catalogButtonDto.G(), null, 64, null);
                case 11:
                    String j8 = C.j();
                    String o7 = catalogButtonDto.o();
                    String title6 = catalogButtonDto.getTitle();
                    String str11 = title6 == null ? "" : title6;
                    String i6 = catalogButtonDto.i();
                    String str12 = i6 == null ? "" : i6;
                    UserId q = catalogButtonDto.q();
                    if (q == null) {
                        q = UserId.d;
                    }
                    UserId userId = q;
                    String g3 = catalogButtonDto.g();
                    return new CatalogButtonSaveAsPlaylist(j8, o7, str11, str12, userId, g3 == null ? "" : g3, d2.g(), catalogButtonDto.T());
                case 12:
                    return e(catalogButtonDto.getTitle(), catalogButtonDto.o(), d2, catalogButtonDto.p(), null);
                case 13:
                    return new CatalogButtonImportContacts(d2.C().j(), catalogButtonDto.o(), null, d2.g(), 4, null);
                case 14:
                    return new CatalogButtonAddFriends(d2.C().j(), catalogButtonDto.o(), d2.g());
                case 15:
                    return new CatalogButtonFriendsCleanup(d2.C().j(), catalogButtonDto.o(), d2.g());
                case 16:
                    String j9 = d2.C().j();
                    String o8 = catalogButtonDto.o();
                    String g4 = d2.g();
                    String i7 = catalogButtonDto.i();
                    String str13 = i7 == null ? "" : i7;
                    String title7 = catalogButtonDto.getTitle();
                    String str14 = title7 == null ? "" : title7;
                    List<CatalogButtonOptionsDto> F2 = catalogButtonDto.F();
                    if (F2 != null) {
                        List<CatalogButtonOptionsDto> list2 = F2;
                        u2a u2aVar = (u2a) bpn0Var.getValue();
                        ArrayList arrayList5 = new ArrayList(c5g.u(list2, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto2 : list2) {
                            u2aVar.getClass();
                            arrayList5.add(u2a.a(catalogButtonOptionsDto2));
                        }
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = null;
                    }
                    return new CatalogButtonFilters(j9, o8, str13, str14, arrayList2, catalogButtonDto.G(), g4);
                case 17:
                    String j10 = d2.C().j();
                    String o9 = catalogButtonDto.o();
                    String g5 = d2.g();
                    String i8 = catalogButtonDto.i();
                    String str15 = i8 == null ? "" : i8;
                    String title8 = catalogButtonDto.getTitle();
                    String str16 = title8 == null ? "" : title8;
                    List<CatalogButtonOptionsDto> F3 = catalogButtonDto.F();
                    if (F3 != null) {
                        List<CatalogButtonOptionsDto> list3 = F3;
                        u2a u2aVar2 = (u2a) bpn0Var.getValue();
                        ArrayList arrayList6 = new ArrayList(c5g.u(list3, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto3 : list3) {
                            u2aVar2.getClass();
                            arrayList6.add(u2a.a(catalogButtonOptionsDto3));
                        }
                        arrayList3 = arrayList6;
                    } else {
                        arrayList3 = null;
                    }
                    return new CatalogButtonFilters(j10, o9, str15, str16, arrayList3, catalogButtonDto.G(), g5);
                case 18:
                    String j11 = d2.C().j();
                    String o10 = catalogButtonDto.o();
                    String g6 = d2.g();
                    String title9 = catalogButtonDto.getTitle();
                    String str17 = title9 == null ? "" : title9;
                    String f2 = catalogButtonDto.f();
                    return new CatalogButtonOpenScreen(j11, o10, str17, f2 == null ? "" : f2, g6, catalogButtonDto.p());
                case 19:
                    String j12 = d2.C().j();
                    String o11 = catalogButtonDto.o();
                    String g7 = d2.g();
                    String title10 = catalogButtonDto.getTitle();
                    String str18 = title10 == null ? "" : title10;
                    String f3 = catalogButtonDto.f();
                    return new CatalogButtonOpenScreenLarge(j12, o11, str18, f3 == null ? "" : f3, g7);
                case 20:
                    String j13 = d2.C().j();
                    String o12 = catalogButtonDto.o();
                    String g8 = d2.g();
                    String r3 = catalogButtonDto.r();
                    String str19 = r3 == null ? "" : r3;
                    Boolean k = catalogButtonDto.k();
                    return new CatalogButtonMakeCall(j13, o12, str19, k != null ? k.booleanValue() : false, g8);
                case 21:
                    String j14 = d2.C().j();
                    String o13 = catalogButtonDto.o();
                    String g9 = d2.g();
                    String r4 = catalogButtonDto.r();
                    String str20 = r4 == null ? "" : r4;
                    Boolean k2 = catalogButtonDto.k();
                    return new CatalogButtonOpenDialog(j14, o13, str20, k2 != null ? k2.booleanValue() : false, g9);
                case 22:
                    String j15 = d2.C().j();
                    String o14 = catalogButtonDto.o();
                    String g10 = d2.g();
                    String r5 = catalogButtonDto.r();
                    String str21 = r5 == null ? "" : r5;
                    Boolean k3 = catalogButtonDto.k();
                    return new CatalogButtonRemoveFriend(j15, o14, str21, k3 != null ? k3.booleanValue() : false, g10);
                case 23:
                    String j16 = d2.C().j();
                    String o15 = catalogButtonDto.o();
                    String g11 = d2.g();
                    List<CatalogButtonOptionsDto> F4 = catalogButtonDto.F();
                    if (F4 != null) {
                        List<CatalogButtonOptionsDto> list4 = F4;
                        u2a u2aVar3 = (u2a) bpn0Var.getValue();
                        ArrayList arrayList7 = new ArrayList(c5g.u(list4, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto4 : list4) {
                            u2aVar3.getClass();
                            arrayList7.add(u2a.a(catalogButtonOptionsDto4));
                        }
                        arrayList4 = arrayList7;
                    } else {
                        arrayList4 = null;
                    }
                    List<String> Z2 = catalogButtonDto.Z();
                    if (Z2 == null) {
                        Z2 = EmptyList.b;
                    }
                    return new CatalogButtonUpdateNonActiveGroups(j16, o15, g11, arrayList4, Z2);
                case 24:
                    String j17 = d2.C().j();
                    String o16 = catalogButtonDto.o();
                    UserId q2 = catalogButtonDto.q();
                    if (q2 == null) {
                        q2 = UserId.d;
                    }
                    Integer e = catalogButtonDto.e();
                    int intValue = e != null ? e.intValue() : 0;
                    List<String> D = catalogButtonDto.D();
                    if (D == null) {
                        D = EmptyList.b;
                    }
                    return new CatalogButtonMarketOptions(j17, o16, q2, intValue, D);
                case 25:
                    String j18 = d2.C().j();
                    String o17 = catalogButtonDto.o();
                    String i9 = catalogButtonDto.i();
                    String str22 = i9 == null ? "" : i9;
                    String title11 = catalogButtonDto.getTitle();
                    String str23 = title11 == null ? "" : title11;
                    String r6 = catalogButtonDto.r();
                    return new CatalogButtonExpandBlock(j18, o17, str22, str23, r6 == null ? "" : r6, 3);
                case 26:
                    String j19 = d2.C().j();
                    String o18 = catalogButtonDto.o();
                    String i10 = catalogButtonDto.i();
                    String str24 = i10 == null ? "" : i10;
                    String T = catalogButtonDto.T();
                    return new CatalogButtonSearchMode(j19, o18, str24, T == null ? "" : T, catalogButtonDto.W(), d2.g(), catalogButtonDto.K(), catalogButtonDto.q(), null, 256, null);
                case 27:
                case 28:
                    String j20 = d2.C().j();
                    String o19 = catalogButtonDto.o();
                    String i11 = catalogButtonDto.i();
                    String str25 = i11 == null ? "" : i11;
                    String title12 = catalogButtonDto.getTitle();
                    return new CatalogButtonPlayAudioFromBlock(j20, o19, title12 == null ? "" : title12, str25, null, C == BaseLinkButtonActionTypeDto.PLAY_SHUFFLED_AUDIOS_FROM_BLOCK, d2.g(), 16, null);
                case 29:
                    String j21 = d2.C().j();
                    String o20 = catalogButtonDto.o();
                    String i12 = catalogButtonDto.i();
                    return new CatalogButtonEnterEditMode(j21, o20, i12 == null ? "" : i12, d2.g());
                case 30:
                    String j22 = d2.C().j();
                    String o21 = catalogButtonDto.o();
                    String title13 = catalogButtonDto.getTitle();
                    String str26 = title13 == null ? "" : title13;
                    UserId q3 = catalogButtonDto.q();
                    if (q3 == null) {
                        q3 = UserId.d;
                    }
                    return new CatalogButtonCreatePlaylist(j22, o21, str26, q3, d2.g());
                case 31:
                    return new CatalogButtonDragAndRemove(C.j());
                case 32:
                    return new CatalogButtonMyAudiosSectionOptions(C.j());
                case 33:
                    return new CatalogButtonDownloadAll(C.j(), catalogButtonDto.o(), catalogButtonDto.i());
                case 34:
                    return new CatalogButtonClearDownloadsHistory(C.j(), catalogButtonDto.o(), catalogButtonDto.i(), catalogButtonDto.M());
                case 35:
                    return d(catalogButtonDto.getTitle(), catalogButtonDto.o(), d2);
                case 36:
                    String j23 = d2.C().j();
                    String o22 = catalogButtonDto.o();
                    String W4 = catalogButtonDto.W();
                    return new CatalogButtonSwitchAccount(j23, o22, W4 == null ? "" : W4, d2.g());
                case 37:
                    String j24 = d2.C().j();
                    String o23 = catalogButtonDto.o();
                    BaseLinkButtonStyleDto u4 = d2.u();
                    String i13 = u4 != null ? u4.i() : null;
                    String W5 = catalogButtonDto.W();
                    return new CatalogButtonLogout(j24, o23, i13, W5 == null ? "" : W5, d2.g());
                case 38:
                    String j25 = d2.C().j();
                    String title14 = catalogButtonDto.getTitle();
                    String str27 = title14 == null ? "" : title14;
                    String description = catalogButtonDto.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    String d5 = d2.d();
                    String str28 = d5 == null ? "" : d5;
                    String p3 = catalogButtonDto.p();
                    ne6 a4 = a();
                    List<BaseImageDto> u5 = catalogButtonDto.u();
                    a4.getClass();
                    return new CatalogButtonOpenInfoPopup(j25, str27, description, str28, p3, ne6.a(u5));
                case 39:
                    String j26 = d2.C().j();
                    String o24 = catalogButtonDto.o();
                    String R = catalogButtonDto.R();
                    ne6 a5 = a();
                    List<BaseImageDto> u6 = catalogButtonDto.u();
                    a5.getClass();
                    Image a6 = ne6.a(u6);
                    ne6 a7 = a();
                    List<BaseImageDto> n = catalogButtonDto.n();
                    a7.getClass();
                    Image a8 = ne6.a(n);
                    String l2 = catalogButtonDto.l();
                    String id = catalogButtonDto.getId();
                    String str29 = id == null ? "" : id;
                    String B = catalogButtonDto.B();
                    String str30 = B == null ? "" : B;
                    String C2 = catalogButtonDto.C();
                    String title15 = catalogButtonDto.getTitle();
                    String str31 = title15 == null ? "" : title15;
                    String description2 = catalogButtonDto.getDescription();
                    BaseLinkButtonStyleDto u7 = d2.u();
                    return new CatalogButtonPlayMix(j26, o24, R, a6, a8, l2, str29, str30, C2, str31, description2, u7 != null ? u7.i() : null, d2.g());
                case 40:
                    return new CatalogButtonCloseNotification(d2.C().j(), catalogButtonDto.o(), d2.g());
                case 41:
                    List<String> Z3 = catalogButtonDto.Z();
                    if (Z3 == null) {
                        Z3 = EmptyList.b;
                    }
                    return new CatalogButtonClearRecent("clear_recent_groups", null, "", j5g.v0("local_block_id", Z3), null, null, 48, null);
            }
        }
        return null;
    }
}
