package xsna;

import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.poll.views.PollFilterBottomView;
import com.vk.voip.ui.view.VoipActionSectionPlaceholder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bd10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ bd10(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                int i2 = MarketProductTileView.L;
                gzsVar.invoke();
                break;
            case 1:
                int i3 = PollFilterBottomView.g;
                gzsVar.invoke();
                break;
            default:
                int i4 = VoipActionSectionPlaceholder.w;
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
