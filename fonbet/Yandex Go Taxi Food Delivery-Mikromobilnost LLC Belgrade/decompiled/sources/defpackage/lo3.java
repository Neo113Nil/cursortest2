package defpackage;

import com.yandex.messaging.core.net.entities.CreateInviteLinkTokenParams;
import com.yandex.messaging.core.net.entities.CreateInviteLinkTokenResponse;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import io.appmetrica.analytics.AppMetricaYandex;
import ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl;

/* loaded from: classes15.dex */
public final class lo3 extends w920 {
    public final /* synthetic */ int a;
    public final /* synthetic */ to3 b;
    public final /* synthetic */ bp5 c;

    public /* synthetic */ lo3(to3 to3Var, bp5 bp5Var, int i) {
        this.a = i;
        this.b = to3Var;
        this.c = bp5Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        int i = this.a;
        to3 to3Var = this.b;
        switch (i) {
            case 0:
                return ouu.b(to3Var.b, "create_token", CreateInviteLinkTokenResponse.class, kvj0Var);
            default:
                return ouu.b(to3Var.b, "get_experiments", GetExperimentsResponse.class, kvj0Var);
        }
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        int i = this.a;
        bp5 bp5Var = this.c;
        switch (i) {
            case 0:
                bp5Var.mo103c(ngzVar.b);
                break;
            default:
                bp5Var.mo103c(ngzVar.b);
                break;
        }
        return true;
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        bp5 bp5Var = this.c;
        switch (i) {
            case 0:
                bp5Var.D((CreateInviteLinkTokenResponse) obj);
                break;
            default:
                bp5Var.D((GetExperimentsResponse) obj);
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        to3 to3Var = this.b;
        switch (i) {
            case 0:
                return to3Var.b.a(new CreateInviteLinkTokenParams(null, 1, null), "create_token");
            default:
                t4j0 a = to3Var.b.a(null, "get_experiments");
                String deviceId = AppMetricaYandex.getDeviceId(((gm51) to3Var.i).a);
                if (deviceId != null) {
                    a.a(ManifestApiImpl.HEADER_DEVICE_ID, deviceId);
                }
                return a;
        }
    }
}
