package defpackage;

import com.ybsdk.feature.card.api.RetrofitProvider$Type;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;

/* loaded from: classes3.dex */
public final class bj8 implements v7p {
    public final /* synthetic */ int a;
    public final owf b;

    public /* synthetic */ bj8(owf owfVar, int i) {
        this.a = i;
        this.b = owfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        owf owfVar = this.b;
        switch (i) {
            case 0:
                return (CardApi) ((e90) owfVar.get()).h(RetrofitProvider$Type.REGULAR).b(CardApi.class);
            default:
                return (PciDssCardApi) ((e90) owfVar.get()).h(RetrofitProvider$Type.PCI_DSS).b(PciDssCardApi.class);
        }
    }
}
