package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: OfflineCatalogDelegateFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class pt70 implements ot70 {
    public final List<ot70> a;

    public pt70(ot70... ot70VarArr) {
        this.a = e43.l(Arrays.copyOf(ot70VarArr, ot70VarArr.length));
    }

    @Override // xsna.ot70
    public final ArrayList a(mt70 mt70Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ArrayList a = ((ot70) it.next()).a(mt70Var);
            if (!a.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    boolean z = mt70Var.q;
                    CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
                    CatalogViewType catalogViewType = CatalogViewType.SEPARATOR;
                    Bundle bundle = new Bundle();
                    if (z) {
                        bundle.putString(CatalogCustomAttributes$Keys.STYLE.h(), CatalogCustomAttributes$Values.TRANSPARENT.h());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    arrayList.add(new CatalogBlock("synthetic_offline_playlists_separator", catalogDataType, null, null, null, null, null, new CatalogLayout(catalogViewType, null, null, null, null, false, bundle, null, null, 446, null), null, null, null, null, null, null, null, null, null, null, null, null, null, 2097020, null));
                }
                g5g.y(a, arrayList);
            }
        }
        return arrayList;
    }
}
