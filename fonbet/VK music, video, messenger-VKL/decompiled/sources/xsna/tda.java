package xsna;

import com.vk.catalog.mvi.section.api.CatalogSearchStatInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.t0a;

/* compiled from: CatalogSearchStatProvider.kt */
/* loaded from: classes16.dex */
public interface tda {
    SearchStatsLoggingInfo a(SchemeStat$EventItem.Type type, String str);

    boolean b(t0a.a.d dVar, String str);

    CatalogSearchStatInfo c();
}
