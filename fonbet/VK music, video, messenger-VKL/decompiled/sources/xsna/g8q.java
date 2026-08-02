package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8q implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ g8q(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((ljo0) obj);
                break;
            case 1:
                this.c.setValue((ServicesSort) obj);
                break;
            default:
                this.c.setValue((zhf0) obj);
                break;
        }
        return s3q0.a;
    }
}
