package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.dto.common.id.UserId;

/* compiled from: SearchInCommunityCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class mvh0 extends smh0 {
    public mvh0(Bundle bundle) {
        super(new UserId(bundle.getLong("owner_id")), bundle.getString("ref"));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, K(u4aVar), null, null, null, null, u4aVar.b.H, null, null, 32504);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final ayn0 W(RecyclerView recyclerView) {
        return new ayn0(recyclerView, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        return new kea(cVar, K(u4aVar), u4aVar, a0(u4aVar), false, uIBlockList, str, uIBlockList == null, null, null, u4aVar.b.H, null, null, false, null, 126720);
    }
}
