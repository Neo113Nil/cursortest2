package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ozr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ ozr(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                return vzr.a((vzr) obj, null, null, null, null, null, false, null, null, null, this.c, 4095);
            default:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        String str = uIBlock.b;
                        List list = this.c;
                        if (list.contains(str) || ((uIBlock instanceof UIBlockVideoHide) && ((UIBlockVideoHide) uIBlock).Pb().equals(list))) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
