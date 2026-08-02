package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: SubscriptionOfflineCatalogContentBlocksFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class yym0 implements ot70 {
    public final a a;

    /* compiled from: SubscriptionOfflineCatalogContentBlocksFactoryImpl.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public yym0(a aVar) {
        this.a = aVar;
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        a aVar = this.a;
        Pair pair = aVar.a ? new Pair(CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL, "subscription_placeholder_small") : new Pair(CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG, "subscription_placeholder_big");
        CatalogViewType catalogViewType = (CatalogViewType) pair.d();
        String str = (String) pair.g();
        CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_PLACEHOLDER;
        ArrayList o = e43.o(new CatalogBlock("synthetic_offline_subs_placeholder", catalogDataType, null, null, null, null, null, new CatalogLayout(catalogViewType, null, null, null, null, false, null, null, null, 510, null), null, null, null, new CatalogBlockItemsData(catalogDataType, e43.o(str), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2094972, null));
        if (aVar.b) {
            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_NONE;
            CatalogViewType catalogViewType2 = CatalogViewType.SEPARATOR;
            Bundle bundle = new Bundle();
            bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), CatalogCustomAttributes$Values.ISLAND_TRANSPARENT.h());
            s3q0 s3q0Var = s3q0.a;
            o.add(new CatalogBlock("synthetic_offline_playlists_separator", catalogDataType2, null, null, null, null, null, new CatalogLayout(catalogViewType2, null, null, null, null, false, bundle, null, null, 446, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097020, null));
        }
        return o;
    }
}
