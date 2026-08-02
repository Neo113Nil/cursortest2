package yads;

import android.content.Context;
import com.ironsource.B5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Lambda;
import xsna.drm0;
import xsna.izs;

/* loaded from: classes10.dex */
public final class ce3 extends Lambda implements izs {
    public final /* synthetic */ de3 b;
    public final /* synthetic */ vd3 c;
    public final /* synthetic */ d4 d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce3(de3 de3Var, vd3 vd3Var, d4 d4Var, Context context) {
        super(1);
        this.b = de3Var;
        this.c = vd3Var;
        this.d = d4Var;
        this.e = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        om2 om2Var = (om2) obj;
        de3 de3Var = this.b;
        vd3 vd3Var = this.c;
        d4 d4Var = this.d;
        Context context = this.e;
        om2Var.a(B5.N, C.UTF8_NAME);
        de3Var.a.getClass();
        om2Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map a = vd3Var.a();
        if (a != null) {
            for (Map.Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!drm0.N(str)) {
                    om2Var.a(str, str2);
                }
            }
        }
        km0 km0Var = d4Var.b.a;
        de3Var.c.getClass();
        if (!sy2.a(context)) {
            om2Var.a("uuid", km0Var.b());
            om2Var.a("mauid", km0Var.d);
        }
        de3Var.b.getClass();
        uw uwVar = new uw(om2Var);
        xw.a.getClass();
        zw zwVar = (zw) ww.a(context);
        uwVar.invoke("gdpr", zwVar.c());
        uwVar.invoke("gdpr_consent", zwVar.b());
        uwVar.invoke("parsed_purpose_consents", zwVar.d());
        uwVar.invoke("parsed_vendor_consents", zwVar.e());
        uwVar.invoke("cmp_present", Integer.valueOf(zwVar.a() ? 1 : 0).toString());
        new pm0(context, d4Var).a(context, new om0(om2Var));
        return om2Var;
    }
}
