package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CategoriesListViewStyle;
import com.vk.catalog2.common.dto.api.style.LinkSliderViewStyle;
import com.vk.catalog2.common.ui.core.cache.CatalogCacheEntry;
import com.vk.catalog2.common.ui.core.cache.CatalogCatalogCacheEntry;
import com.vk.catalog2.common.ui.core.cache.CatalogSectionCacheEntry;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicSkeletonCatalogCache.kt */
/* loaded from: classes16.dex */
public final class u550 implements w2a {
    public static final List<CatalogViewType> f;
    public static final List<CatalogViewType> g;
    public static final CatalogExtendedData h;
    public final List<CatalogViewType> a;
    public final List<CatalogViewType> b;
    public final boolean c;
    public final String d;
    public final String e;

    /* compiled from: MusicSkeletonCatalogCache.kt */
    public static final class a {
        public final CatalogCacheEntry a;
        public final CatalogCacheEntry b;

        public a(CatalogCacheEntry catalogCacheEntry, CatalogCacheEntry catalogCacheEntry2) {
            this.a = catalogCacheEntry;
            this.b = catalogCacheEntry2;
        }
    }

    /* compiled from: MusicSkeletonCatalogCache.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MusicSkeletonCatalogCache.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogCacheEntry, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCacheEntry catalogCacheEntry) {
            CatalogCacheEntry catalogCacheEntry2 = catalogCacheEntry;
            u550 u550Var = (u550) this.receiver;
            List<CatalogViewType> list = u550.f;
            u550Var.getClass();
            return new hda(catalogCacheEntry2.b, catalogCacheEntry2.c, null);
        }
    }

    static {
        CatalogViewType catalogViewType = CatalogViewType.HEADER;
        CatalogViewType catalogViewType2 = CatalogViewType.HEADER_EXTENDED;
        CatalogViewType catalogViewType3 = CatalogViewType.HEADER_LARGE;
        CatalogViewType catalogViewType4 = CatalogViewType.HEADER_COMPACT;
        CatalogViewType catalogViewType5 = CatalogViewType.SEPARATOR;
        CatalogViewType catalogViewType6 = CatalogViewType.SUBSECTION_TABS;
        CatalogViewType catalogViewType7 = CatalogViewType.CATEGORIES_GRID;
        CatalogViewType catalogViewType8 = CatalogViewType.CATEGORIES_LIST;
        f = e43.l(catalogViewType, catalogViewType2, catalogViewType3, catalogViewType4, catalogViewType5, catalogViewType6, catalogViewType7, catalogViewType8);
        g = e43.l(CatalogViewType.TRIPLE_STACKED_SLIDER, CatalogViewType.RECOMMS_SLIDER, CatalogViewType.ARTISTS_SLIDER, CatalogViewType.CROP_SLIDER, CatalogViewType.AUDIO_STREAM_MIX, CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE, CatalogViewType.PLAYLIST_SMALL, CatalogViewType.ENTITY_DOUBLE_GRID, CatalogViewType.FEATURED_LIST, CatalogViewType.BUTTONS_HORIZONTAL, CatalogViewType.LARGE_SLIDER, CatalogViewType.LARGE_LIST, CatalogViewType.BANNER, CatalogViewType.SNIPPETS_BANNER, CatalogViewType.PODCAST_EXTENDED_SLIDER, CatalogViewType.MUSIC_MAIN_NAVIGATION, CatalogViewType.PODCAST_FAVORITES, CatalogViewType.KIDS_COLLECTION, CatalogViewType.KIDS_CATALOG, catalogViewType8, CatalogViewType.SLIDER);
        h = new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u550(String str, List<? extends CatalogViewType> list, List<? extends CatalogViewType> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = fo8.a(str, "_online");
        this.e = fo8.a(str, "_offline");
    }

    @Override // xsna.w2a
    public final io.reactivex.rxjava3.core.q<hda> a() {
        wmi0 wmi0Var = wmi0.a;
        com.vk.core.utils.newtork.b.a.getClass();
        return wmi0Var.h(com.vk.core.utils.newtork.b.d() ? this.d : this.e).U(new mau(new c(1, this, u550.class, "toCatalogResponse", "toCatalogResponse(Lcom/vk/catalog2/common/ui/core/cache/CatalogCacheEntry;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 7));
    }

    @Override // xsna.w2a
    public final void b(hda hdaVar) {
        a aVar;
        Object obj = hdaVar.a;
        CatalogExtendedData catalogExtendedData = hdaVar.b;
        if (obj instanceof CatalogCatalog) {
            ArrayList arrayList = new ArrayList();
            CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
            for (CatalogSection catalogSection : catalogCatalog.b) {
                arrayList.add(CatalogSection.zb(catalogSection, null, null, null, c(catalogSection), 16255));
            }
            CatalogCatalogCacheEntry catalogCatalogCacheEntry = new CatalogCatalogCacheEntry(CatalogCatalog.zb(catalogCatalog, arrayList, null, 62), new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, catalogExtendedData.Fb(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 7, null), 0L, 4, null);
            aVar = new a(catalogCatalogCacheEntry, catalogCatalogCacheEntry);
        } else if (obj instanceof CatalogSection) {
            CatalogSection catalogSection2 = (CatalogSection) obj;
            aVar = new a(new CatalogSectionCacheEntry(CatalogSection.zb(catalogSection2, null, null, null, c(catalogSection2), 16255), new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, catalogExtendedData.q, null, null, null, null, null, null, null, null, catalogExtendedData.Fb(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16809985, -1, 7, null), 0L, 4, null), new CatalogSectionCacheEntry(catalogSection2, new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, catalogExtendedData.q, null, null, null, null, null, null, null, null, catalogExtendedData.Fb(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16809985, -1, 7, null), 0L, 4, null));
        } else {
            L.i(new RuntimeException("Unknown item <" + obj.getClass().getCanonicalName() + "> in CatalogResponse, please add new CatalogCacheEntry for this type!"));
            CatalogCatalogCacheEntry catalogCatalogCacheEntry2 = new CatalogCatalogCacheEntry(new CatalogCatalog(EmptyList.b, "", null, null, null, null, false, 96, null), h, 0L, 4, null);
            aVar = new a(catalogCatalogCacheEntry2, catalogCatalogCacheEntry2);
        }
        wmi0 wmi0Var = wmi0.a;
        wmi0Var.a(this.d, aVar.a);
        wmi0Var.a(this.e, aVar.b);
    }

    public final ArrayList c(CatalogSection catalogSection) {
        List<CatalogViewType> list;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator<CatalogBlock> it = catalogSection.i.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.a;
            if (!hasNext) {
                break;
            }
            CatalogBlock next = it.next();
            CatalogLayout catalogLayout = next.i;
            CatalogBlockItemsData catalogBlockItemsData = next.m;
            if (list.contains(catalogLayout.b) && !epx.f(catalogLayout.h.getString(TtmlNode.TAG_STYLE), CategoriesListViewStyle.Style.KIDS_MODE.i())) {
                arrayList.add(next);
            } else if (this.b.contains(catalogLayout.b) && (!this.c || !catalogBlockItemsData.c.isEmpty() || catalogLayout.b == CatalogViewType.MUSIC_MAIN_NAVIGATION)) {
                if (catalogLayout.b != CatalogViewType.SLIDER || epx.f(catalogLayout.h.getString(TtmlNode.TAG_STYLE), LinkSliderViewStyle.Style.Large.i())) {
                    CatalogViewType catalogViewType = catalogLayout.b;
                    if (catalogViewType == CatalogViewType.PLAYLIST_SMALL) {
                        ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i = -1;
                                break;
                            }
                            if (((CatalogBlock) listIterator.previous()).i.b.l()) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        }
                        if (i == e43.h(arrayList)) {
                            g5g.J(arrayList);
                        }
                    } else if (catalogViewType == CatalogViewType.LIST) {
                        int i2 = b.$EnumSwitchMapping$0[next.c.ordinal()];
                        if (i2 == 1) {
                            arrayList.add(CatalogBlock.zb(next, CatalogDataType.DATA_SYNTHETIC_LOADING, CatalogLayout.zb(catalogLayout, CatalogViewType.SYNTHETIC_MUSIC_OFFLINE_PLAYLISTS_LIST, null, 2), null, 2097021));
                        } else if (i2 == 2) {
                            arrayList.add(CatalogBlock.zb(next, CatalogDataType.DATA_SYNTHETIC_LOADING, CatalogLayout.zb(catalogLayout, CatalogViewType.SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST, null, 2), null, 2097021));
                        }
                    } else {
                        CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_LOADING;
                        arrayList.add(CatalogBlock.zb(next, catalogDataType, null, new CatalogBlockItemsData(catalogDataType, catalogBlockItemsData.c, catalogBlockItemsData.d, catalogBlockItemsData.e, catalogBlockItemsData.f, catalogBlockItemsData.g, catalogBlockItemsData.h, catalogBlockItemsData.i, catalogBlockItemsData.j, catalogBlockItemsData.k, catalogBlockItemsData.l, catalogBlockItemsData.m), 2095101));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!list.contains(((CatalogBlock) it2.next()).i.b)) {
                    return arrayList;
                }
            }
        }
        return new ArrayList();
    }

    @Override // xsna.w2a
    public final void clear() {
        wmi0.a.c(this.d, this.e);
    }

    public /* synthetic */ u550(String str) {
        this(str, f, g, true);
    }
}
