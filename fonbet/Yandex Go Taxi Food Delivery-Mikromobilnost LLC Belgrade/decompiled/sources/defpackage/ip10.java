package defpackage;

import com.ybsdk.feature.merchant.offers.internal.domain.interactor.a;
import com.ybsdk.feature.merchant.offers.internal.domain.interactor.b;

/* loaded from: classes5.dex */
public final class ip10 implements v7p {
    public final /* synthetic */ int a;
    public final wvq b;

    public /* synthetic */ ip10(wvq wvqVar, int i) {
        this.a = i;
        this.b = wvqVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wvq wvqVar = this.b;
        switch (i) {
            case 0:
                return new a((com.ybsdk.feature.merchant.offers.internal.data.a) wvqVar.get());
            default:
                return new b((com.ybsdk.feature.merchant.offers.internal.data.a) wvqVar.get());
        }
    }
}
