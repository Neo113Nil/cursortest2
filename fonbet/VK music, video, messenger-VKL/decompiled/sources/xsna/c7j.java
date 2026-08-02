package xsna;

import android.content.Context;
import com.vk.api.generated.audio.dto.AudioConsumeSpecialProjectReasonDto;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: ConsumePromoJob.kt */
/* loaded from: classes3.dex */
public final class c7j extends tsl implements w8i {
    public final int c;
    public final String d;
    public final bpn0 e;

    /* compiled from: ConsumePromoJob.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public c7j(fyx fyxVar) {
        super(fyxVar);
        JSONObject jSONObject = fyxVar.a;
        this.c = jSONObject.getInt("KEY_PROMO_ID");
        this.d = jSONObject.getString("KEY_REASON");
        this.e = new bpn0(new m1i(this, 1));
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        ix4 ix4Var = k840.b;
        AudioConsumeSpecialProjectReasonDto valueOf = AudioConsumeSpecialProjectReasonDto.valueOf(cqm0.n(this.d));
        ix4Var.getClass();
        tfx tfxVar = new tfx("audio.consumeSpecialProject", new t11(2), new u11(8));
        tfx.l(tfxVar, "special_project_id", this.c, 0, 0, 12);
        tfx.o(tfxVar, "reason", valueOf.i(), 0, 0, 12);
        itg0.m(rsg0.a0(yfb.x(tfxVar)).C(new bi3(this, 2)).F(new j50(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 15)));
    }
}
