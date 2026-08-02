package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.qr.ui.a;
import java.util.Collections;
import java.util.List;
import xsna.l5v0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pmp0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pmp0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                z3i0 z3i0Var = (z3i0) obj;
                ibk0 ibk0Var = z3i0Var.e;
                if (ibk0Var != null) {
                    ibk0Var.d(z3i0Var, ump0.a, null);
                }
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return s3q0.a;
            case 3:
                return drm0.p0(((pno0) obj).d()).toString();
            case 4:
                VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = (VideoDiscoveryCatalogRepository$Section) obj;
                return new sfs0(videoDiscoveryCatalogRepository$Section, Collections.singletonList(videoDiscoveryCatalogRepository$Section));
            case 5:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 6:
                return s3q0.a;
            case 7:
                return new l5v0.a.b((xpp) obj);
            case 8:
                return new a.d(((tj50.a) obj).a(yvw0.b, ao8.d));
            case 9:
                com.vk.voip.ui.c.b.getClass();
                if (com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer && !com.vk.voip.ui.c.f) {
                    com.vk.voip.ui.notifications.incoming.b bVar = (com.vk.voip.ui.notifications.incoming.b) com.vk.voip.ui.c.v0.getValue();
                    dhw0 dhw0Var = com.vk.voip.ui.c.O;
                    if (dhw0Var == null || (str = dhw0Var.h()) == null) {
                        str = "";
                    }
                    bVar.c(str, com.vk.voip.ui.c.N, false);
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(brm0.B(((StackTraceElement) obj).getClassName(), "sun.misc", false));
        }
    }
}
