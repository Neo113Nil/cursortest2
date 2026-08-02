package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.profile.community.suggestions.api.di.CommunitySuggestionsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ h1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).Le();
            case 1:
                return ((CommunitySuggestionsComponent) this.c.mo408a(fpf0.a(CommunitySuggestionsComponent.class))).a();
            default:
                return (DonutPriceComponent) this.c.a(fpf0.a(DonutPriceComponent.class));
        }
    }
}
