package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.api.generated.catalog.dto.CatalogButtonOptionsDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkMetaDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.catalog.mvi.domain.CatalogLinkActionStyle;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog.mvi.section.domain.CatalogButtonLinkDo;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.catalog.mvi.section.domain.CatalogImageDo;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* compiled from: CatalogDtoMapperExtensions.kt */
/* loaded from: classes16.dex */
public final class p4a {

    /* compiled from: CatalogDtoMapperExtensions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BaseLinkButtonActionTypeDto.values().length];
            try {
                iArr[BaseLinkButtonActionTypeDto.SHOW_FILTERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.BLOCK_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.VIDEO_SEASONS_BLOCK_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.UPLOAD_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ADD_VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.UPLOAD_CLIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.TOGGLE_VIDEO_ALBUM_SUBSCRIPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_SECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_URL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLEAR_VIDEO_HISTORY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OWNER_GROUPS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.BECOME_AUTHOR_HOWTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.AUTHOR_PAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CREATE_ALBUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SWITCH_SECTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PLAY_VIDEOS_FROM_BLOCK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.TOGGLE_ALBUM_SUBSCRIPTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.TOGGLE_ALBUM_SHUFFLE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseLinkButtonStyleDto.values().length];
            try {
                iArr2[BaseLinkButtonStyleDto.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[BaseLinkButtonStyleDto.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    public static final ArrayList a(CatalogBlockDto catalogBlockDto, BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto) {
        CatalogButtonOptionsDto catalogButtonOptionsDto;
        Integer num;
        List list;
        Collection singletonList;
        CatalogButtonOptionsDto.IconDto iconDto;
        Object obj;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_sort_outline_16);
        List<CatalogButtonDto> e = catalogBlockDto.e();
        EmptyList emptyList = null;
        if (e != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : e) {
                BaseLinkButtonActionDto d = ((CatalogButtonDto) obj2).d();
                if ((d != null ? d.C() : null) == baseLinkButtonActionTypeDto) {
                    arrayList.add(obj2);
                }
            }
            ?? arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CatalogButtonDto catalogButtonDto = (CatalogButtonDto) it.next();
                BaseLinkButtonActionDto d2 = catalogButtonDto.d();
                BaseLinkButtonActionTypeDto C = d2 != null ? d2.C() : null;
                int i = C == null ? -1 : a.$EnumSwitchMapping$0[C.ordinal()];
                if (i == 1) {
                    List<CatalogButtonOptionsDto> F = catalogButtonDto.F();
                    if (F != null) {
                        Iterator it2 = F.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((CatalogButtonOptionsDto) obj).j() == BaseBoolIntDto.YES) {
                                break;
                            }
                        }
                        catalogButtonOptionsDto = (CatalogButtonOptionsDto) obj;
                    } else {
                        catalogButtonOptionsDto = null;
                    }
                    String k = catalogButtonOptionsDto != null ? catalogButtonOptionsDto.k() : null;
                    if (k == null) {
                        k = "";
                    }
                    String str = k;
                    List<CatalogButtonOptionsDto> F2 = catalogButtonDto.F();
                    if (F2 != null) {
                        Iterator it3 = F2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                iconDto = null;
                                break;
                            }
                            iconDto = ((CatalogButtonOptionsDto) it3.next()).f();
                            if (iconDto != null) {
                                break;
                            }
                        }
                        if (iconDto == null) {
                            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
                        }
                        num = xqv.$EnumSwitchMapping$0[iconDto.ordinal()] == 1 ? valueOf : null;
                    } else {
                        num = null;
                    }
                    List<CatalogButtonOptionsDto> F3 = catalogButtonDto.F();
                    if (F3 != null) {
                        List<CatalogButtonOptionsDto> list2 = F3;
                        list = new ArrayList(c5g.u(list2, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto2 : list2) {
                            list.add(new CatalogFilterOptionDo(catalogButtonOptionsDto2.l(), catalogButtonOptionsDto2.j() == BaseBoolIntDto.YES, catalogButtonOptionsDto2.i()));
                        }
                    } else {
                        list = 0;
                    }
                    if (list == 0) {
                        list = EmptyList.b;
                    }
                    singletonList = Collections.singletonList(new CatalogFilterDo(str, false, num, null, list));
                } else if (i == 2) {
                    List<CatalogButtonOptionsDto> F4 = catalogButtonDto.F();
                    if (F4 != null) {
                        List<CatalogButtonOptionsDto> list3 = F4;
                        ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto3 : list3) {
                            String l = catalogButtonOptionsDto3.l();
                            CatalogButtonOptionsDto.IconDto f = catalogButtonOptionsDto3.f();
                            arrayList3.add(new CatalogFilterDo(l, catalogButtonOptionsDto3.j() == BaseBoolIntDto.YES, f != null ? xqv.$EnumSwitchMapping$0[f.ordinal()] == 1 ? valueOf : null : null, catalogButtonOptionsDto3.i(), null));
                        }
                        singletonList = arrayList3;
                    } else {
                        singletonList = null;
                    }
                    if (singletonList == null) {
                        singletonList = EmptyList.b;
                    }
                } else if (i != 3) {
                    singletonList = EmptyList.b;
                } else {
                    List<CatalogButtonOptionsDto> F5 = catalogButtonDto.F();
                    if (F5 != null) {
                        List<CatalogButtonOptionsDto> list4 = F5;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                        for (CatalogButtonOptionsDto catalogButtonOptionsDto4 : list4) {
                            arrayList4.add(new CatalogFilterDo(catalogButtonOptionsDto4.l(), catalogButtonOptionsDto4.j() == BaseBoolIntDto.YES, null, catalogButtonOptionsDto4.i(), null));
                        }
                        singletonList = arrayList4;
                    } else {
                        singletonList = null;
                    }
                    if (singletonList == null) {
                        singletonList = EmptyList.b;
                    }
                }
                arrayList2.add(singletonList);
            }
            emptyList = arrayList2;
        }
        if (emptyList == null) {
            emptyList = EmptyList.b;
        }
        return c5g.v(emptyList);
    }

    public static final CatalogLinkButtonActionDo b(String str, CatalogButtonDto catalogButtonDto) {
        CatalogLinkActionStyle catalogLinkActionStyle;
        BaseLinkButtonStyleDto u;
        BaseLinkButtonActionDto d = catalogButtonDto.d();
        BaseLinkButtonActionTypeDto C = d != null ? d.C() : null;
        int i = C == null ? -1 : a.$EnumSwitchMapping$0[C.ordinal()];
        if (i == 5) {
            UserId q = catalogButtonDto.q();
            if (q == null) {
                q = UserId.d;
            }
            Integer e = catalogButtonDto.e();
            return new CatalogLinkButtonActionDo.OpenAddVideosToAlbum(q, e != null ? e.intValue() : 0);
        }
        switch (i) {
            case 8:
                String W = catalogButtonDto.W();
                if (W == null) {
                    W = "";
                }
                if (str == null) {
                    str = "";
                }
                String R = catalogButtonDto.R();
                BaseLinkButtonActionDto d2 = catalogButtonDto.d();
                if (d2 == null || (u = d2.u()) == null) {
                    catalogLinkActionStyle = null;
                } else {
                    int i2 = a.$EnumSwitchMapping$1[u.ordinal()];
                    catalogLinkActionStyle = i2 != 1 ? i2 != 2 ? CatalogLinkActionStyle.Default.b : CatalogLinkActionStyle.Primary.b : CatalogLinkActionStyle.Secondary.b;
                }
                return new CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection(W, str, R, null, catalogLinkActionStyle, 8, null);
            case 9:
                BaseLinkButtonActionDto d3 = catalogButtonDto.d();
                String url = d3 != null ? d3.getUrl() : null;
                if (url == null) {
                    url = "";
                }
                return new CatalogLinkButtonActionDo.OpenLink(url, null, null, 6, null);
            case 10:
                return CatalogLinkButtonActionDo.ClearVideoHistory.b;
            case 11:
                return CatalogLinkButtonActionDo.OpenGroups.b;
            case 12:
                return CatalogLinkButtonActionDo.OpenHowBecomeAuthor.b;
            case 13:
                return CatalogLinkButtonActionDo.OpenAuthorCabinet.b;
            case 14:
                return CatalogLinkButtonActionDo.CreateAlbum.b;
            case 15:
                String W2 = catalogButtonDto.W();
                return new CatalogLinkButtonActionDo.SwitchSection(W2 != null ? W2 : "", catalogButtonDto.i());
            case 16:
                return CatalogLinkButtonActionDo.PlayVideosFromBlock.b;
            case 17:
                return CatalogLinkButtonActionDo.ToggleAlbumSubscription.b;
            case 18:
                return CatalogLinkButtonActionDo.ToggleAlbumShuffle.b;
            default:
                return null;
        }
    }

    public static final CatalogButtonDo c(CatalogButtonDto catalogButtonDto, CatalogBlockDto catalogBlockDto) {
        String title = catalogButtonDto.getTitle();
        if (title == null) {
            title = "";
        }
        return new CatalogButtonDo(title, b(catalogBlockDto.getTitle(), catalogButtonDto));
    }

    public static final CatalogButtonDo d(CatalogButtonDto catalogButtonDto, CatalogSectionDto catalogSectionDto) {
        String title = catalogButtonDto.getTitle();
        if (title == null) {
            title = "";
        }
        return new CatalogButtonDo(title, b(catalogSectionDto.getTitle(), catalogButtonDto));
    }

    public static final CatalogButtonLinkDo e(BaseLinkButtonDto baseLinkButtonDto) {
        CatalogLinkButtonActionDo openUploadVideo;
        CatalogLinkButtonActionDo catalogLinkButtonActionDo;
        BaseLinkButtonActionDto e = baseLinkButtonDto.e();
        BaseLinkButtonActionTypeDto C = e != null ? e.C() : null;
        int i = C == null ? -1 : a.$EnumSwitchMapping$0[C.ordinal()];
        if (i == 4) {
            UserId q = baseLinkButtonDto.q();
            if (q == null) {
                q = UserId.d;
            }
            Integer f = baseLinkButtonDto.f();
            openUploadVideo = new CatalogLinkButtonActionDo.OpenUploadVideo(q, f != null ? f.intValue() : 0);
        } else {
            if (i != 5) {
                if (i == 6) {
                    UserId q2 = baseLinkButtonDto.q();
                    if (q2 == null) {
                        q2 = UserId.d;
                    }
                    catalogLinkButtonActionDo = new CatalogLinkButtonActionDo.OpenUploadClip(q2);
                } else if (i != 7) {
                    BaseLinkButtonActionDto e2 = baseLinkButtonDto.e();
                    String url = e2 != null ? e2.getUrl() : null;
                    if (url == null) {
                        url = "";
                    }
                    catalogLinkButtonActionDo = new CatalogLinkButtonActionDo.OpenLink(url, null, null, 6, null);
                } else {
                    UserId q3 = baseLinkButtonDto.q();
                    if (q3 == null) {
                        q3 = UserId.d;
                    }
                    catalogLinkButtonActionDo = new CatalogLinkButtonActionDo.ToggleVideoAlbumSubscription(q3);
                }
                return new CatalogButtonLinkDo(catalogLinkButtonActionDo);
            }
            UserId q4 = baseLinkButtonDto.q();
            if (q4 == null) {
                q4 = UserId.d;
            }
            Integer f2 = baseLinkButtonDto.f();
            openUploadVideo = new CatalogLinkButtonActionDo.OpenAddVideosToAlbum(q4, f2 != null ? f2.intValue() : 0);
        }
        catalogLinkButtonActionDo = openUploadVideo;
        return new CatalogButtonLinkDo(catalogLinkButtonActionDo);
    }

    public static final CatalogImageDo f(BaseImageDto baseImageDto) {
        return new CatalogImageDo(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static final CatalogLinkDo g(CatalogCatalogLinkDto catalogCatalogLinkDto) {
        ?? r1;
        CatalogCatalogLinkMetaDto.ContentTypeDto d;
        String url = catalogCatalogLinkDto.getUrl();
        if (url == null) {
            url = "";
        }
        String str = url;
        String title = catalogCatalogLinkDto.getTitle();
        String n = catalogCatalogLinkDto.n();
        List<BaseImageDto> i = catalogCatalogLinkDto.i();
        if (i != null) {
            List<BaseImageDto> list = i;
            r1 = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r1.add(f((BaseImageDto) it.next()));
            }
        } else {
            r1 = EmptyList.b;
        }
        List list2 = r1;
        CatalogCatalogLinkMetaDto l = catalogCatalogLinkDto.l();
        String str2 = null;
        String r = l != null ? l.r() : null;
        CatalogCatalogLinkMetaDto l2 = catalogCatalogLinkDto.l();
        if (l2 != null && (d = l2.d()) != null) {
            str2 = d.i();
        }
        return new CatalogLinkDo(str, title, n, list2, r, str2);
    }
}
