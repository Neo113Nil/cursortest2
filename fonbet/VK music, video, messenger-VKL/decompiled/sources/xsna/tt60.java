package xsna;

import com.vk.ecomm.fave.api.di.MarketFaveComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedMarketNavigator.kt */
/* loaded from: classes4.dex */
public final class tt60 {
    public final Lazy<MarketFaveComponent> a;

    /* JADX WARN: Multi-variable type inference failed */
    public tt60(Lazy<? extends MarketFaveComponent> lazy) {
        this.a = lazy;
    }

    public final com.vk.ecomm.fave.api.di.a a() {
        return this.a.getValue().u1();
    }
}
