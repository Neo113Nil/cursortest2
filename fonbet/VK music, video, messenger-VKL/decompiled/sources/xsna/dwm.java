package xsna;

import android.view.View;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dwm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ dwm(Object obj, Object obj2, Object obj3, xzs xzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = xzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                fwm fwmVar = (fwm) this.c;
                View view = (View) this.d;
                x9l0 x9l0Var = (x9l0) this.e;
                gzs gzsVar = (gzs) this.f;
                VkOnboardingCampaign e = fwmVar.a.e("im:dialogs_calls_promotion");
                if (e == null) {
                    return s3q0.a;
                }
                if (fwmVar.a.d(e)) {
                    view.post(new ewm(fwmVar, gzsVar, e, view, view.getContext().getString(R.string.vkm_dialogs_toolbar_calls_onboarding_title), x9l0Var));
                }
                return s3q0.a;
            default:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                String str = (String) this.e;
                izs izsVar = (izs) this.f;
                c7xVar.f(th);
                return c7xVar.e(th).a(str, izsVar);
        }
    }
}
