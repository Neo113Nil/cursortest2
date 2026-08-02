package xsna;

import com.vk.core.view.components.progress.VkProgress;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ ko0(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            case 1:
                this.c.setValue((MarketPaginationDotsSize) obj);
                break;
            default:
                ((VkProgress) obj).setProgress((int) (((Number) this.c.getValue()).floatValue() * 100), true);
                break;
        }
        return s3q0.a;
    }
}
