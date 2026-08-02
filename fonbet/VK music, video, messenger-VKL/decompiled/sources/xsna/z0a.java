package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.List;

/* compiled from: CatalogApiBlockPresentationIndexer.kt */
/* loaded from: classes16.dex */
public final class z0a {
    public static void a(int i, int i2, List list) {
        String str;
        UIBlock uIBlock = (UIBlock) j5g.a0(list);
        if (uIBlock == null || (str = uIBlock.b) == null) {
            return;
        }
        int size = list.size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            UIBlock uIBlock2 = (UIBlock) list.get(i4);
            if (!epx.f(uIBlock2.b, str)) {
                i++;
                str = uIBlock2.b;
                i2 = 0;
            }
            uIBlock2.t = i;
            if (i3 >= uIBlock2.Hb()) {
                i2++;
            }
            uIBlock2.u = i2;
            i3 = uIBlock2.Hb();
            if ((uIBlock2 instanceof UIBlockList) && uIBlock2.d.j()) {
                int i5 = 0;
                for (Object obj : ((UIBlockList) uIBlock2).y) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    UIBlock uIBlock3 = (UIBlock) obj;
                    uIBlock3.t = i;
                    uIBlock3.u = i6;
                    i5 = i6;
                }
            }
        }
        if (list.size() == 1) {
            ((UIBlock) j5g.Y(list)).v = true;
        }
    }

    public static /* synthetic */ void b(z0a z0aVar, List list, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        z0aVar.getClass();
        a(i, 0, list);
    }
}
