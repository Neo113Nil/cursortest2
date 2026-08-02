package xsna;

import com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.SuperAppFeatures;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rcv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rcv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new HorizontalButtonsWithScrollView.c((b2a) obj, (h7v) this.c);
            default:
                dun0 dun0Var = (dun0) this.c;
                eun0 eun0Var = dun0Var.a;
                eun0Var.g((UserId) obj);
                return eun0Var.j(dun0Var.c.a(SuperAppFeatures.RequestName.GET_TABBAR));
        }
    }
}
