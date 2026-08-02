package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bsf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ bsf(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((wsf) obj).a, this.c));
            case 1:
                qgi0.k((tgi0) obj, this.c);
                return s3q0.a;
            case 2:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if ((uIBlock instanceof UIBlockList) || (uIBlock instanceof UIBlockButtons)) {
                            List<String> Ib = uIBlock.Ib();
                            if (!(Ib instanceof Collection) || !Ib.isEmpty()) {
                                Iterator<T> it = Ib.iterator();
                                while (it.hasNext()) {
                                    if (epx.f((String) it.next(), this.c)) {
                                        z = true;
                                        return Boolean.valueOf(z);
                                    }
                                }
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
