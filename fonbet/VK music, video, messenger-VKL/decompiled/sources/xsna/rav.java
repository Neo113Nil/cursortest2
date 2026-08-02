package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cxi;
import xsna.qav;

/* compiled from: HolidayInteractionFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class rav extends FunctionReferenceImpl implements izs<qav.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(qav.b bVar) {
        qav.b bVar2 = bVar;
        cxi.b bVar3 = bVar2.a;
        qav qavVar = (qav) this.receiver;
        f7q0 f7q0Var = (f7q0) qavVar.b.b;
        L.e("on both client ready");
        qavVar.f();
        if (qavVar.e()) {
            qavVar.k = bVar2;
            String str = bVar3.a;
            SharedPreferences e = Preference.e(((UserId) f7q0Var.invoke()).b, "holiday_interaction_preferences");
            qavVar.j = !e.getBoolean("hint_shown" + str, false);
            qavVar.i = bVar3.d;
            qaj0.c(Preference.e(((UserId) f7q0Var.invoke()).b, "holiday_interaction_preferences"), go9.b("hint_shown", bVar3.a), Boolean.TRUE);
            qavVar.i(qavVar.b());
        }
        return s3q0.a;
    }
}
