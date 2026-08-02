package xsna;

import android.content.Context;
import android.content.Intent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.voip.ui.auth.CallsBridgeTrampolineActivity;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class n19 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n19(long j, mtk0 mtk0Var) {
        this.c = j;
        this.d = mtk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                long j = this.c;
                if (booleanValue) {
                    int i2 = CallsBridgeTrampolineActivity.b;
                    bc6 L = xa4.L(context);
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) CallsBridgeTrampolineActivity.class);
                    intent.setAction("open_chat");
                    intent.putExtra("dialog_id", j);
                    L.E(intent);
                } else {
                    com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                    Context applicationContext = context.getApplicationContext();
                    o0w b = ((ImBridgeComponent) ((k7m) m7m.f(cVar)).a(fpf0.a(ImBridgeComponent.class))).g5().b();
                    Intent j2 = o0w.j(b, applicationContext, null, j, null, null, "voip", b.D(), null, 100261882);
                    j2.setFlags(335544320);
                    applicationContext.startActivity(j2);
                }
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().A0();
                break;
            default:
                oio oioVar = (oio) obj;
                oio.V1(oioVar, this.c, ((Number) ((mtk0) obj2).getValue()).floatValue() * (mxj0.c(oioVar.d()) / 2), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n19(Context context, long j) {
        this.d = context;
        this.c = j;
    }
}
