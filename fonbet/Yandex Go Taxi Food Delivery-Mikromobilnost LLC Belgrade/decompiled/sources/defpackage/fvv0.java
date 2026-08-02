package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import java.util.List;

/* loaded from: classes14.dex */
public final /* synthetic */ class fvv0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppDiscoveryMapModalView b;

    public /* synthetic */ fvv0(SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView, int i) {
        this.a = i;
        this.b = superAppDiscoveryMapModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int onAttachedToWindow$lambda$1;
        v66 mapBlurDelegate_delegate$lambda$0;
        List buttons_delegate$lambda$0;
        int i = this.a;
        SuperAppDiscoveryMapModalView superAppDiscoveryMapModalView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$1 = SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$1(superAppDiscoveryMapModalView);
                break;
            case 1:
                onAttachedToWindow$lambda$1 = SuperAppDiscoveryMapModalView.onAttachedToWindow$lambda$2(superAppDiscoveryMapModalView);
                break;
            case 2:
                mapBlurDelegate_delegate$lambda$0 = SuperAppDiscoveryMapModalView.mapBlurDelegate_delegate$lambda$0(superAppDiscoveryMapModalView);
                return mapBlurDelegate_delegate$lambda$0;
            case 3:
                onAttachedToWindow$lambda$1 = SuperAppDiscoveryMapModalView.categoryFilterEdgeMargin_delegate$lambda$0(superAppDiscoveryMapModalView);
                break;
            case 4:
                onAttachedToWindow$lambda$1 = SuperAppDiscoveryMapModalView.categoryFilterMargin_delegate$lambda$0(superAppDiscoveryMapModalView);
                break;
            default:
                buttons_delegate$lambda$0 = SuperAppDiscoveryMapModalView.buttons_delegate$lambda$0(superAppDiscoveryMapModalView);
                return buttons_delegate$lambda$0;
        }
        return Integer.valueOf(onAttachedToWindow$lambda$1);
    }
}
