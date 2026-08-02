package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.auth.captcha.impl.SakCaptchaActivity;
import com.vk.toggle.anonymous.SakFeatures;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.abr0;
import xsna.n7r0;

/* compiled from: SakCaptchaHandlerImpl.kt */
/* loaded from: classes15.dex */
public final class xzg0 implements wzg0 {
    public boolean a;
    public boolean b;
    public n7r0.c c;

    /* compiled from: SakCaptchaHandlerImpl.kt */
    public static final class a implements bbr0 {
        public a() {
        }

        @Override // xsna.bbr0
        public final void a(abr0 abr0Var) {
            boolean z = abr0Var instanceof abr0.b;
            xzg0 xzg0Var = xzg0.this;
            if (z) {
                xzg0Var.c = new n7r0.c(((abr0.b) abr0Var).a, false, true, false);
                yhr0.b();
            } else {
                if (!(abr0Var instanceof abr0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xzg0Var.c = new n7r0.c(null, false, true, false);
                yhr0.b();
            }
        }
    }

    @Override // xsna.yar0
    public final void a(Context context, n7r0.b bVar) {
        String str = bVar.j;
        String str2 = bVar.k;
        String str3 = bVar.l;
        String str4 = bVar.m;
        var0 var0Var = var0.a;
        Locale locale = new Locale(dgn0.c().a.b());
        var0Var.getClass();
        var0.g.set(locale);
        if (str2 != null && str3 != null && SakFeatures.Type.VKC_HITMAN_CAPTCHA_ANDROID.h()) {
            this.b = true;
            String str5 = ((l9y0) var0.e.getValue()).a.get(str3);
            if (str5 == null) {
                var0Var.c(str3, str3.concat(str2), new yzg0(this));
                return;
            } else {
                this.c = new n7r0.c(str5, false, false, true);
                yhr0.b();
                return;
            }
        }
        if (str != null && str4 != null) {
            this.a = true;
            var0Var.c(str4, str, new a());
            return;
        }
        this.a = false;
        int i = SakCaptchaActivity.f;
        Intent intent = new Intent(context, (Class<?>) SakCaptchaActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("url", bVar.a);
        Integer num = bVar.b;
        intent.putExtra("height", num != null ? num.intValue() : -1);
        Integer num2 = bVar.c;
        intent.putExtra("width", num2 != null ? num2.intValue() : -1);
        intent.putExtra("ratio", bVar.d);
        intent.putExtra("is_refresh_enabled", bVar.e);
        intent.putExtra("captcha_sid", bVar.f);
        intent.putExtra("is_sound_captcha_available", bVar.g.booleanValue());
        String str6 = bVar.h;
        if (str6 == null) {
            str6 = "";
        }
        intent.putExtra("captcha_track", str6);
        String str7 = bVar.i;
        intent.putExtra("captcha_token", str7 != null ? str7 : "");
        context.startActivity(intent);
    }

    @Override // xsna.yar0
    public final n7r0.c b() {
        return (this.a || this.b) ? this.c : vzg0.p1;
    }
}
