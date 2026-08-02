package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;
import java.util.List;

/* loaded from: classes14.dex */
public final /* synthetic */ class kyv0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ kyv0(Object obj, float f, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        a76 updateStatusBarBlur$lambda$1;
        int i = this.a;
        int i2 = this.c;
        float f = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                updateStatusBarBlur$lambda$1 = SuperAppDiscoveryMapV2ModalView.updateStatusBarBlur$lambda$1((SuperAppDiscoveryMapV2ModalView) obj2, f, i2, (a76) obj);
                return updateStatusBarBlur$lambda$1;
            default:
                List list = (List) obj2;
                ((m6y) ((u6y) obj)).f(list.size(), null, av0.C, new a(983640207, new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.a(f, i2, list), true));
                return zy11.a;
        }
    }
}
