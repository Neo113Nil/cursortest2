package xsna;

import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tdk0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tdk0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                qgi0.r((tgi0) obj, "template_text");
                break;
            case 4:
                String str = (String) obj;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                Reef reef = (Reef) obj;
                if (reef != null) {
                    reef.d();
                }
                if (reef != null) {
                    reef.a(new ReefEvent.b());
                }
                break;
            case 9:
                String str2 = (String) obj;
                int P = drm0.P(str2, ':', 0, 6);
                if (P > 0) {
                    String substring = str2.substring(0, P);
                    Long n = arm0.n(str2.substring(P + 1));
                    if (n != null) {
                        break;
                    }
                }
                break;
            case 10:
                break;
            default:
                Throwable th = (Throwable) obj;
                L.C("VoipShareLinkPagerDelegate", th);
                zk70.e(th);
                break;
        }
        return s3q0.a;
    }
}
