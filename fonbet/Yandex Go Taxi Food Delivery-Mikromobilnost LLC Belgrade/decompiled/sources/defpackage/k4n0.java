package defpackage;

import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class k4n0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersCardBottomComponent b;

    public /* synthetic */ k4n0(ScootersCardBottomComponent scootersCardBottomComponent, int i) {
        this.a = i;
        this.b = scootersCardBottomComponent;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 superPassComponentLazy$lambda$0$0;
        zy11 superPassComponentLazy$lambda$0$1;
        zy11 zy11Var;
        int i = this.a;
        ScootersCardBottomComponent scootersCardBottomComponent = this.b;
        switch (i) {
            case 0:
                superPassComponentLazy$lambda$0$0 = ScootersCardBottomComponent.superPassComponentLazy$lambda$0$0(scootersCardBottomComponent, (rco0) obj);
                return superPassComponentLazy$lambda$0$0;
            case 1:
                superPassComponentLazy$lambda$0$1 = ScootersCardBottomComponent.superPassComponentLazy$lambda$0$1(scootersCardBottomComponent, (rco0) obj);
                return superPassComponentLazy$lambda$0$1;
            default:
                zy11Var = ScootersCardBottomComponent.setupLegalTermsText$lambda$0(scootersCardBottomComponent, (String) obj);
                return zy11Var;
        }
    }
}
