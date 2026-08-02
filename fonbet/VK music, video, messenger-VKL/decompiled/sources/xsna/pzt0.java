package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.VoipService;
import com.vk.voip.ui.history.friends.ui.b;
import org.json.JSONObject;
import xsna.dd9;
import xsna.h6x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pzt0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pzt0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.e, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 3:
                ((Integer) obj).getClass();
                int i = qlv0.g;
                return "?";
            case 4:
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((dd9.a) obj) instanceof dd9.a.b);
            case 6:
                int i2 = ylw0.x1;
                return ((pno0) obj).d().toString();
            case 7:
                return b.d.a;
            case 8:
                Object obj2 = VoipService.q;
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                return (dhw0Var == null || (str = dhw0Var.d) == null) ? "" : str;
            case 9:
                return h6x0.b.a;
            default:
                return ((JSONObject) obj).getJSONArray("response");
        }
    }
}
