package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import xsna.dbe0;
import xsna.nw;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ uw(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new nw.d((ActionButton) obj));
                break;
            case 1:
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockMarketItem) {
                    UIBlockMarketItem uIBlockMarketItem = (UIBlockMarketItem) uIBlock;
                    break;
                }
                break;
            case 2:
                this.c.invoke(obj);
                break;
            case 3:
                this.c.invoke(dbe0.h.c.b);
                break;
            default:
                this.c.invoke(new o9t.b((uet) obj));
                break;
        }
        return s3q0.a;
    }
}
