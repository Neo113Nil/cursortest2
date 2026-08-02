package xsna;

import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.music.navigation.VkMusicNavigationTab;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: CatalogAutoDownloadBannerProcessor.kt */
/* loaded from: classes16.dex */
public final class c1a extends ida {
    public final g950 a;
    public final df5 b;
    public final b25 c;
    public final Set<VkMusicNavigationTab> d;
    public final io.reactivex.rxjava3.disposables.g e;
    public final bpn0 f;
    public final bpn0 g;

    public c1a() {
        throw null;
    }

    public c1a(g950 g950Var, df5 df5Var, b25 b25Var) {
        Set<VkMusicNavigationTab> singleton = Collections.singleton(VkMusicNavigationTab.GENERAL);
        this.a = g950Var;
        this.b = df5Var;
        this.c = b25Var;
        this.d = singleton;
        this.e = new io.reactivex.rxjava3.disposables.g();
        this.f = new bpn0(new t61(8));
        this.g = new bpn0(new y6(this, 10));
    }

    public static UIBlockActionOpenUrl f(CatalogButtonOpenUrl catalogButtonOpenUrl) {
        return new UIBlockActionOpenUrl(new com.vk.catalog2.common.dto.api.ui.a("synthetic_music_auto_download_banner_block", "synthetic_offline_music_autodownload_all", CatalogViewType.SYNTHETIC_ACTION_OPEN_URL, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), catalogButtonOpenUrl.g, catalogButtonOpenUrl.k, catalogButtonOpenUrl.e, catalogButtonOpenUrl.f, catalogButtonOpenUrl.h, catalogButtonOpenUrl.i, catalogButtonOpenUrl.j);
    }

    @Override // xsna.ida
    public final hda c(hda hdaVar, CatalogCatalog catalogCatalog, CatalogExtendedData catalogExtendedData) {
        Iterator<T> it = catalogCatalog.b.iterator();
        while (it.hasNext()) {
            e(hdaVar, (CatalogSection) it.next(), catalogExtendedData);
        }
        return hdaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ida
    public final hda e(hda hdaVar, CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
        CatalogViewType catalogViewType;
        List<CatalogBlock> list = catalogSection.i;
        Map<String, CatalogStateInfo> map = catalogExtendedData.z;
        String str = catalogSection.f;
        VkMusicNavigationTab.Companion.getClass();
        Object obj = null;
        r5 = null;
        r5 = null;
        r5 = null;
        Integer num = null;
        if (j5g.P(this.d, VkMusicNavigationTab.a.a(str))) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (g(com.vk.core.utils.newtork.b.d())) {
                if (!map.containsKey("synthetic_music_auto_download_banner")) {
                    Iterator<CatalogBlock> it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (it.next().c == CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES) {
                            break;
                        }
                        i++;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (i == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        while (true) {
                            intValue++;
                            Object b0 = j5g.b0(intValue, list);
                            if ((b0 != null ? ((CatalogBlock) b0).c : null) != CatalogDataType.DATA_TYPE_NONE) {
                                break;
                            }
                            CatalogBlock catalogBlock = (CatalogBlock) b0;
                            if (!catalogBlock.i.b.l() && (catalogViewType = catalogBlock.i.b) != CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT && catalogViewType != CatalogViewType.SYNTHETIC_SEPARATOR_THIN && catalogViewType != CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND && catalogViewType != CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT && catalogViewType != CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP) {
                                break;
                            }
                        }
                        if (intValue >= 0 && intValue < list.size() && list.get(intValue).c != CatalogDataType.DATA_TYPE_CATALOG_BANNERS) {
                            num = Integer.valueOf(intValue);
                        }
                    }
                    if (num == null) {
                        bn40.h("Can't find position for autodownloads banner in CatalogSection");
                        return hdaVar;
                    }
                    CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_CATALOG_BANNERS;
                    Map map2 = null;
                    Map map3 = null;
                    Map map4 = null;
                    Map map5 = null;
                    Map map6 = null;
                    Map map7 = null;
                    Map map8 = null;
                    list.add(num.intValue(), new CatalogBlock("synthetic_music_auto_download_banner_block", catalogDataType, null, null, null, null, null, new CatalogLayout(CatalogViewType.SMALL_LIST, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, e43.o("synthetic_music_auto_download_banner"), map6, map2, map3, map4, null, map7, null, map5, null, map8, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
                    catalogExtendedData.zb(new CatalogExtendedData(null, null, map6, map2, map3, map4, null, map7, 0 == true ? 1 : 0, map5, null, map8, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, pn00.m(new Pair("synthetic_music_auto_download_banner", (CatalogStateInfo) this.f.getValue())), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 7, null));
                    return hdaVar;
                }
                return hdaVar;
            }
        }
        if (map.containsKey("synthetic_music_auto_download_banner")) {
            map.remove("synthetic_music_auto_download_banner");
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((CatalogBlock) next).b, "synthetic_music_auto_download_banner_block")) {
                    obj = next;
                    break;
                }
            }
            CatalogBlock catalogBlock2 = (CatalogBlock) obj;
            if (catalogBlock2 != null) {
                CatalogBlockItemsData catalogBlockItemsData = catalogBlock2.m;
                Map<String, ?> Ab = catalogBlockItemsData.Ab();
                List<String> list2 = catalogBlockItemsData.c;
                if (Ab != null) {
                    Ab.remove("synthetic_music_auto_download_banner");
                }
                list2.remove("synthetic_music_auto_download_banner");
                if (list2.isEmpty()) {
                    list.remove(catalogBlock2);
                }
            }
        }
        return hdaVar;
    }

    public final boolean g(boolean z) {
        if (z) {
            return false;
        }
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        if (com.vk.toggle.d.a(this.a.c())) {
            return this.b.n(String.valueOf(this.c.c().b));
        }
        return false;
    }

    @Override // xsna.ida
    public final hda b(hda hdaVar, CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData) {
        return hdaVar;
    }
}
