package xsna;

import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.catalog2.common.dto.api.di.CatalogComponentImpl;
import com.vk.ecomm.orders.impl.di.MarketOrdersComponentImpl;
import com.vk.im.engine.di.event.ImRxEventObserverScopedComponentImpl;
import com.vk.protect.di.ProtectAppComponentImpl;
import com.vk.superapp.dating.js.bridge.impl.di.JsDatingDelegateComponentImpl;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vkontakte.android.VKApplication;
import kotlin.random.Random;
import xsna.asu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g58 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g58(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new es();
            case 1:
                return com.vk.core.utils.newtork.b.a;
            case 2:
                return i2w.f;
            case 3:
                return new ImRxEventObserverScopedComponentImpl.a();
            case 4:
                return ((SuperAppServicesComponent) ((k7m) m7m.f(new w7m())).mo408a(fpf0.a(SuperAppServicesComponent.class))).a6();
            case 5:
                return new b0d0();
            case 6:
                qcy<Object>[] qcyVarArr = ProtectAppComponentImpl.i;
                return new w7e0();
            case 7:
                return new qug();
            case 8:
                return new MarketOrdersComponentImpl.a();
            case 9:
                Random.b.getClass();
                return Boolean.valueOf(Random.c.i() < 0.01f);
            case 10:
                VKApplication.a aVar = VKApplication.c;
                return ((AccountManagerComponent) m7m.e().a(fpf0.a(AccountManagerComponent.class))).c();
            case 11:
                return new JsDatingDelegateComponentImpl.a();
            case 12:
                return new CatalogComponentImpl.a();
            case 13:
                asu0 asu0Var = asu0.a;
                asu0.a aVar2 = asu0.g;
                asu0Var.getClass();
                return asu0.E(aVar2, "vk-coroutines-io-pool-thread-");
            case 14:
                return m1u.a("vk-network-knet-cronet");
            default:
                return new hr80();
        }
    }

    public /* synthetic */ g58(Object obj, int i) {
        this.b = i;
    }
}
