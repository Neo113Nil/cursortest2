package xsna;

import android.text.TextUtils;
import com.vk.music.bottomsheets.domain.model.AudioOnboardingScenarioType;
import java.util.concurrent.Callable;
import xsna.w3s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh80 implements Callable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh80(ph80 ph80Var, AudioOnboardingScenarioType audioOnboardingScenarioType) {
        this.c = audioOnboardingScenarioType;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                wsl b = uh.b.b();
                fyx fyxVar = new fyx();
                fyxVar.a.put("KEY_ONBOARDING_TYPE", ((AudioOnboardingScenarioType) obj).h());
                s3q0 s3q0Var = s3q0.a;
                ((xsl) b).a("ConsumeOnboardingJob", new b7j(fyxVar), usl.a(usl.h, null, 251));
                return s3q0.a;
            default:
                CharSequence charSequence = ((w3s0.b) obj).a;
                gpt0 gpt0Var = gpt0.a;
                CharSequence i2 = ucp.i(charSequence);
                return !TextUtils.isEmpty(i2) ? i2 : charSequence;
        }
    }
}
