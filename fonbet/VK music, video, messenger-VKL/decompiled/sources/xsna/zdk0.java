package xsna;

import android.app.Activity;
import android.content.Intent;
import com.vk.fullscreen.promo.core.PromoArguments;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.socialgraph.SocialGraphActivity;
import xsna.azs;
import xsna.c63;

/* compiled from: SocialGraphOnboardingPresenter.kt */
/* loaded from: classes5.dex */
public final class zdk0 extends azs {

    /* compiled from: SocialGraphOnboardingPresenter.kt */
    /* loaded from: classes11.dex */
    public static final class a implements azs.a {
        @Override // xsna.azs.a
        public final azs a(zys zysVar) {
            return new zdk0();
        }
    }

    /* compiled from: FullscreenPromoPresenter.kt */
    public static final class b extends c63.b {
        public final /* synthetic */ PromoSessionInfo b;

        public b(PromoSessionInfo promoSessionInfo) {
            this.b = promoSessionInfo;
        }

        @Override // xsna.c63.b
        public final void p(Activity activity) {
            c63 c63Var = c63.a;
            c63.c(this);
            PromoSessionInfo promoSessionInfo = this.b;
            PromoArguments promoArguments = promoSessionInfo.c;
            PromoArguments.SignUp signUp = promoArguments instanceof PromoArguments.SignUp ? (PromoArguments.SignUp) promoArguments : null;
            boolean z = signUp != null ? signUp.b : true;
            int i = SocialGraphActivity.i;
            activity.startActivity(new Intent(activity, (Class<?>) SocialGraphActivity.class).putExtra("needAvatar", !z).putExtra("promoSessionInfo", promoSessionInfo));
        }
    }

    @Override // xsna.azs
    public final void a(PromoSessionInfo promoSessionInfo) {
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 == null) {
            c63.a(new b(promoSessionInfo));
            return;
        }
        PromoArguments promoArguments = promoSessionInfo.c;
        PromoArguments.SignUp signUp = promoArguments instanceof PromoArguments.SignUp ? (PromoArguments.SignUp) promoArguments : null;
        boolean z = signUp != null ? signUp.b : true;
        int i = SocialGraphActivity.i;
        b2.startActivity(new Intent(b2, (Class<?>) SocialGraphActivity.class).putExtra("needAvatar", !z).putExtra("promoSessionInfo", promoSessionInfo));
    }
}
