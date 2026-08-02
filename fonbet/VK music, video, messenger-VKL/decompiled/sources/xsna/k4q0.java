package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.search.params.api.domain.model.education.University;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: UniversitySearchDatabaseRequestFactory.kt */
/* loaded from: classes5.dex */
public final class k4q0 implements tph0<University> {
    public final int a;
    public final qd50 b;

    public k4q0(int i, qd50 qd50Var) {
        this.a = i;
        this.b = qd50Var;
    }

    @Override // xsna.tph0
    public final io.reactivex.rxjava3.core.x a(int i, String str) {
        qd50 qd50Var = this.b;
        edi ediVar = (edi) ((mcc0) qd50Var.b).b;
        Integer valueOf = Integer.valueOf(this.a);
        Integer valueOf2 = Integer.valueOf(i);
        Integer num = 100;
        ediVar.getClass();
        tfx tfxVar = new tfx("database.getUniversities", new dn(11), new en(15));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        tfx.l(tfxVar, "city_id", valueOf.intValue(), 0, 0, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf2.intValue(), 0, 0, 8);
        tfxVar.f(num.intValue(), 0, 10000, "count");
        dz2 x = yfb.x(tfxVar);
        ahn.D(x);
        return rsg0.w0(x).l(new nlf0(new wv2((h4q0) qd50Var.c, 11), 6));
    }
}
