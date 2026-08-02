package xsna;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.xc;

/* compiled from: ButtonListCatalogTransformerImpl.kt */
/* loaded from: classes16.dex */
public final class oq8 implements nq8 {
    public final xc.a a;

    public oq8(xc.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.nq8
    public final ArrayList a(CatalogExtendedData catalogExtendedData, List list, bi20 bi20Var) {
        CatalogHint Cb;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogButton catalogButton = (CatalogButton) it.next();
            String zb = catalogButton.zb();
            bi20 bi20Var2 = bi20Var;
            UIBlockAction d = this.a.d(catalogButton, bi20.a(bi20Var2, null, null, null, null, (zb == null || (Cb = catalogExtendedData.Cb(zb)) == null) ? null : fo50.K(bi20Var, Cb, catalogExtendedData, this), null, 33538047), catalogExtendedData);
            if (d != null) {
                arrayList.add(d);
            }
            bi20Var = bi20Var2;
        }
        return arrayList;
    }
}
