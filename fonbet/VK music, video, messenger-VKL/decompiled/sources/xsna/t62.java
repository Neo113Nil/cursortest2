package xsna;

import android.database.Cursor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t62 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ t62(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList<UIBlock> arrayList;
        CatalogFilterData catalogFilterData;
        int i = this.b;
        boolean z = false;
        String str = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(epx.f(fl3.F((Cursor) obj, "account_type"), str));
            case 1:
                qgi0.r((tgi0) obj, str);
                return s3q0.a;
            case 2:
                UIBlock uIBlock = (UIBlock) obj;
                UIBlockButtons uIBlockButtons = uIBlock instanceof UIBlockButtons ? (UIBlockButtons) uIBlock : null;
                if (uIBlockButtons != null && (arrayList = uIBlockButtons.y) != null && !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            UIBlock uIBlock2 = (UIBlock) it.next();
                            UIBlockActionFilter uIBlockActionFilter = uIBlock2 instanceof UIBlockActionFilter ? (UIBlockActionFilter) uIBlock2 : null;
                            if (epx.f((uIBlockActionFilter == null || (catalogFilterData = uIBlockActionFilter.z) == null) ? null : catalogFilterData.b, str)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "product_preview_search");
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                return s3q0.a;
            default:
                HashMap hashMap = q700.a;
                e8f0 e8f0Var = new e8f0(mq9.d(new ByteArrayInputStream(((String) obj).getBytes())));
                String[] strArr = JsonReader.f;
                u800 g = q700.g(new com.airbnb.lottie.parser.moshi.a(e8f0Var), str, true);
                Throwable th = g.b;
                if (th == null) {
                    return g.a;
                }
                throw th;
        }
    }
}
