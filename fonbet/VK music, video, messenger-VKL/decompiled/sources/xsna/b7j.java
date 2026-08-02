package xsna;

import android.content.Context;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;

/* compiled from: ConsumeOnboardingJob.kt */
/* loaded from: classes3.dex */
public final class b7j extends tsl implements w8i {
    public final String c;
    public final bpn0 d;

    /* compiled from: ConsumeOnboardingJob.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public b7j(fyx fyxVar) {
        super(fyxVar);
        this.c = fyxVar.a.getString("KEY_ONBOARDING_TYPE");
        this.d = new bpn0(new wzh(this, 5));
    }

    @Override // xsna.tsl
    public final void a(Context context) {
        xga xgaVar = new xga();
        String h = AudioOnboardingScenarioType.CA1.h();
        String str = this.c;
        String str2 = "default:audio:onboarding_window_ca1";
        if (!epx.f(str, h) && epx.f(str, AudioOnboardingScenarioType.CA3.h())) {
            str2 = "default:audio:onboarding_window_ca3";
        }
        itg0.m(rsg0.a0(yfb.x(xgaVar.m(str2, null))).C(new gt0(this, 2)).F(new lf1(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 18)));
    }
}
