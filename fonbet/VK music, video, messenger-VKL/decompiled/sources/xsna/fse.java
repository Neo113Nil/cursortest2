package xsna;

import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;
import xsna.cse;

/* compiled from: RxExt.kt */
/* loaded from: classes16.dex */
public final class fse implements izs {
    public static final fse c = new fse(0);
    public static final fse d = new fse(1);
    public static final fse e = new fse(2);
    public static final fse f = new fse(3);
    public final /* synthetic */ int b;

    public /* synthetic */ fse(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof cse.a.b);
            case 1:
                return Boolean.valueOf(obj instanceof MarketEventGoodCreated);
            case 2:
                return Boolean.valueOf(obj instanceof f480);
            default:
                return Boolean.valueOf(obj instanceof PullFromTopLinearLayout);
        }
    }
}
