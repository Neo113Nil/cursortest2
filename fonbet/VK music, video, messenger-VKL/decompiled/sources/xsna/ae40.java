package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.concurrent.TimeUnit;
import xsna.vha;

/* compiled from: MusicCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class ae40 extends vha {
    public static final CatalogDataType[] g = {CatalogDataType.DATA_TYPE_PLACEHOLDER, CatalogDataType.DATA_TYPE_CATALOG_BANNERS, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_CENTER_ALIGNED, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ALIGNED_TO_IMAGE, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_ROUNDED_SMALL_IMAGE};
    public final s1v f;

    public ae40(boolean z, s1v s1vVar, dha dhaVar) {
        super(z, s1vVar, dhaVar, 8);
        this.f = s1vVar;
    }

    @Override // xsna.d680, xsna.fb80.b
    public final void n(Object obj, long j, long j2) {
        MobileOfficialAppsCoreNavStat$EventScreen c;
        if (obj instanceof vha.b) {
            vha.b bVar = (vha.b) obj;
            UIBlock uIBlock = bVar.a;
            UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
            if (uIBlockPlaceholder != null && rl3.G(g, uIBlockPlaceholder.e)) {
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_BANNER, cqm0.k(uIBlockPlaceholder.z), null, s1v.f(uIBlockPlaceholder), this.f.e(uIBlockPlaceholder), null, 36, null);
                dha dhaVar = this.c;
                if (dhaVar == null || (c = dhaVar.a()) == null) {
                    UiTracker uiTracker = UiTracker.a;
                    c = UiTracker.c();
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                new bvt0(c, SchemeStat$TypeView.a(SchemeStat$TypeView.a.b(schemeStat$EventItem, String.valueOf(timeUnit.toMicros(j)), String.valueOf(timeUnit.toMicros(j2)), Integer.valueOf(bVar.b), null, 16), SchemeStat$TypeView.Type.TYPE_CATALOG_BANNER_EVENT_ITEM)).q();
                return;
            }
        }
        super.n(obj, j, j2);
    }
}
