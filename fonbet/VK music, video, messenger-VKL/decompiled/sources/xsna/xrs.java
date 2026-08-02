package xsna;

import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xrs implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ xrs(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                int i = FriendsRecommendationsFragment.b0;
                return com.vk.contacts.d.a.U0();
            default:
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                return superappUiRouterBridge.x(false);
        }
    }
}
