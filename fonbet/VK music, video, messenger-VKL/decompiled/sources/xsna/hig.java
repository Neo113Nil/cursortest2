package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.common.links.LaunchContext;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NotImplementedError;

/* compiled from: CatalogMviVh.kt */
/* loaded from: classes16.dex */
public class hig {
    public final q3a a;
    public final SearchStatInfoProvider b;

    public hig(q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.a = q3aVar;
        this.b = searchStatInfoProvider;
    }

    public static void c() {
        throw new NotImplementedError("This action is not implemented in legacy catalog yet, please implement it yourself or don't use it.");
    }

    public final void b(Context context, String str, String str2, String str3) {
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
        if (str3 == null) {
            str3 = "";
        }
        SearchStatsLoggingInfo b = this.b.b(type, str3, false);
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = str2;
        if (b != null) {
            aVar.m = b;
        }
        maz.c(xwk.d().e(), context, str, aVar.a(), null, null, 24);
    }

    public void a(Context context, UIBlock uIBlock, wnk wnkVar) {
    }
}
