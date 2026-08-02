package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonFilters;
import com.vk.catalog2.common.dto.api.CatalogButtonGoToAuthor;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockProfileClipDrafts;
import com.vk.catalog2.common.dto.ui.UIBlockProfileVideoUploads;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: VideoNestedListTransformer.kt */
/* loaded from: classes16.dex */
public final class zxs0 extends w060 {
    public static final List<CatalogDataType> h = e43.l(CatalogDataType.DATA_TYPE_ACTION, CatalogDataType.DATA_TYPE_GROUPS_ITEMS);
    public final ias0 e;
    public final wot0 f;
    public final UserId g;

    /* compiled from: VideoNestedListTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.PUBLISH_LOADING_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DELAYED_LOADING_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_CLIP_DRAFTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zxs0(ias0 ias0Var, wot0 wot0Var, UserId userId) {
        super(0);
        this.e = ias0Var;
        this.f = wot0Var;
        this.g = userId;
    }

    @Override // xsna.w060
    public final List<UIBlock> N0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, boolean z) {
        return S0(catalogBlock, catalogExtendedData, EmptyList.b, null);
    }

    @Override // xsna.w060
    public final List<UIBlock> S0(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, List<CatalogBlock> list, String str) {
        Object obj;
        CatalogFilterData catalogFilterData;
        boolean z;
        Object obj2;
        ArrayList<CatalogButton> arrayList = catalogBlock.j;
        int i = a.$EnumSwitchMapping$0[catalogBlock.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    bi20 e = e(catalogBlock, catalogExtendedData);
                    return Collections.singletonList(new UIBlockProfileVideoUploads(new com.vk.catalog2.common.dto.api.ui.a(e.a, e.b, CatalogViewType.PUBLISH_LOADING_VIDEOS, e.c, e.k, this.g, e.j, e.m, e.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), false));
                }
                if (i == 4) {
                    bi20 e2 = e(catalogBlock, catalogExtendedData);
                    return Collections.singletonList(new UIBlockProfileVideoUploads(new com.vk.catalog2.common.dto.api.ui.a(e2.a, e2.b, CatalogViewType.DELAYED_LOADING_VIDEOS, e2.c, e2.k, this.g, e2.j, e2.m, e2.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), true));
                }
                if (i != 5) {
                    return super.S0(catalogBlock, catalogExtendedData, list, str);
                }
                bi20 e3 = e(catalogBlock, catalogExtendedData);
                return Collections.singletonList(new UIBlockProfileClipDrafts(new com.vk.catalog2.common.dto.api.ui.a(e3.a, e3.b, CatalogViewType.CLIP_DRAFTS, e3.c, e3.k, this.g, e3.j, e3.m, e3.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680)));
            }
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((CatalogButton) obj2) instanceof CatalogButtonGoToAuthor) {
                    break;
                }
            }
            CatalogButtonGoToAuthor catalogButtonGoToAuthor = obj2 instanceof CatalogButtonGoToAuthor ? (CatalogButtonGoToAuthor) obj2 : null;
            if (catalogButtonGoToAuthor == null || !fxc0.B().J().L()) {
                return super.S0(catalogBlock, catalogExtendedData, list, str);
            }
            bi20 e4 = e(catalogBlock, catalogExtendedData);
            List<UIBlock> S0 = super.S0(catalogBlock, catalogExtendedData, list, str);
            Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_GROUPS_ITEMS, String.valueOf(fkq0.e(catalogButtonGoToAuthor.f).b));
            Group group = Ab instanceof Group ? (Group) Ab : null;
            return group == null ? S0 : j5g.u0(S0, Collections.singletonList(new UIBlockActionGoToAuthor(new com.vk.catalog2.common.dto.api.ui.a(e4.a, e4.b, CatalogViewType.VIDEO_GO_TO_AUTHOR, e4.c, e4.k, catalogButtonGoToAuthor.f, e4.j, e4.m, e4.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), catalogButtonGoToAuthor.g, catalogButtonGoToAuthor.e, group)));
        }
        Iterator<T> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((CatalogButton) obj) instanceof CatalogButtonFilters) {
                break;
            }
        }
        CatalogButtonFilters catalogButtonFilters = obj instanceof CatalogButtonFilters ? (CatalogButtonFilters) obj : null;
        if (catalogButtonFilters == null) {
            return super.S0(catalogBlock, catalogExtendedData, list, str);
        }
        List<CatalogFilterData> list2 = catalogButtonFilters.g;
        bi20 e5 = e(catalogBlock, catalogExtendedData);
        ArrayList Gb = catalogBlock.Gb(catalogExtendedData);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = Gb.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Group group2 = next instanceof Group ? (Group) next : null;
            if (group2 != null) {
                arrayList2.add(group2);
            }
        }
        CatalogBlockItemsData catalogBlockItemsData = catalogBlock.m;
        String str2 = catalogBlock.b;
        if (list2 == null || (catalogFilterData = (CatalogFilterData) j5g.a0(list2)) == null) {
            return EmptyList.b;
        }
        List S = j5g.S(list2, 1);
        if (S == null) {
            S = EmptyList.b;
        }
        List list3 = S;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                if (((CatalogFilterData) it4.next()).e) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int size = arrayList2.size();
        int size2 = S.size();
        int i2 = size > size2 ? size2 : size;
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        while (i3 < i2) {
            String str3 = e5.a + '_' + i3;
            CatalogViewType catalogViewType = e5.d;
            CatalogDataType catalogDataType = e5.c;
            String str4 = e5.k;
            UserId userId = e5.e;
            List<String> list4 = e5.j;
            Set<UIBlockDragDropAction> set = e5.m;
            UIBlockHint uIBlockHint = e5.o;
            Group group3 = (Group) arrayList2.get(i3);
            Object zb = catalogBlockItemsData.zb(((Group) arrayList2.get(i3)).c);
            boolean z2 = z;
            GroupCatalogItem groupCatalogItem = zb instanceof GroupCatalogItem ? (GroupCatalogItem) zb : null;
            String string = e5.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
            UIBlockGroup uIBlockGroup = new UIBlockGroup(str3, catalogViewType, catalogDataType, str4, userId, list4, set, uIBlockHint, group3, groupCatalogItem, false, null, null, null, string != null ? new VideoCatalogViewStyle(string) : null, 14336, null);
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(new UIBlockGroupFilter(uIBlockGroup, (CatalogFilterData) S.get(i3), catalogFilterData, str2, !((CatalogFilterData) S.get(i3)).e && z2));
            i3++;
            z = z2;
            arrayList3 = arrayList4;
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    public final void U0(String str, List list, List list2) {
        UIBlockList uIBlockList;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                uIBlockList = 0;
                break;
            } else {
                uIBlockList = it.next();
                if (((UIBlock) uIBlockList) instanceof UIBlockList) {
                    break;
                }
            }
        }
        UIBlockList uIBlockList2 = uIBlockList instanceof UIBlockList ? uIBlockList : null;
        if (uIBlockList2 == null) {
            return;
        }
        this.f.getClass();
        boolean a2 = wot0.a(str);
        if (a2 || fkq0.b(this.g)) {
            wot0.b(uIBlockList2, list2, a2);
        }
    }

    @Override // xsna.w060, xsna.jda
    public final List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
        List<UIBlock> b = super.b(obj, catalogExtendedData, z, z2);
        if (obj instanceof CatalogBlock) {
            CatalogBlock catalogBlock = (CatalogBlock) obj;
            if (h.contains(catalogBlock.c)) {
                CatalogViewType catalogViewType = catalogBlock.i.b;
                CatalogViewType catalogViewType2 = CatalogViewType.SLIDER;
                if (catalogViewType == catalogViewType2) {
                    bi20 e = e(catalogBlock, catalogExtendedData);
                    if (!b.isEmpty() && (e.c != CatalogDataType.DATA_TYPE_GROUPS_ITEMS || e.d != catalogViewType2 || !(j5g.a0(b) instanceof UIBlockGroup))) {
                        b = Collections.singletonList(K(b, e));
                    }
                }
            }
        }
        ias0 ias0Var = this.e;
        ias0Var.a(obj);
        if (z) {
            CatalogSection catalogSection = obj instanceof CatalogSection ? (CatalogSection) obj : null;
            if (catalogSection != null) {
                List<VideoUploadEvent> list = ias0Var.c().get(catalogSection.b);
                if (list == null) {
                    list = EmptyList.b;
                }
                U0(catalogSection.f, b, list);
            }
            CatalogCatalog catalogCatalog = obj instanceof CatalogCatalog ? (CatalogCatalog) obj : null;
            if (catalogCatalog != null) {
                for (CatalogSection catalogSection2 : catalogCatalog.b) {
                    List<VideoUploadEvent> list2 = ias0Var.c().get(catalogSection2.b);
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    U0(catalogSection2.f, b, list2);
                }
            }
        }
        return b;
    }
}
