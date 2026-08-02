package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.impl.i;
import com.yandex.passport.internal.warm.WarmUpWebViewActivity;
import com.yandex.passport.internal.warm.b;

/* loaded from: classes2.dex */
public final class k941 {
    public final ep90 a;
    public final ComponentActivity b;
    public final u02 c;

    public k941(ep90 ep90Var, ComponentActivity componentActivity, u02 u02Var) {
        this.a = ep90Var;
        this.b = componentActivity;
        this.c = u02Var;
    }

    public final void a() {
        i a = this.a.a().a();
        this.c.getClass();
        KPassportEnvironment kPassportEnvironment = KPassportEnvironment.PRODUCTION;
        a.getClass();
        b bVar = WarmUpWebViewActivity.Companion;
        PassportEnvironmentImpl environment = kPassportEnvironment.getEnvironment();
        bVar.getClass();
        ComponentActivity componentActivity = this.b;
        Intent intent = new Intent(componentActivity, (Class<?>) WarmUpWebViewActivity.class);
        intent.putExtra("environment_integer_key", environment.getInteger());
        intent.putExtra("time_out_for_closing_web_view", 60L);
        componentActivity.startActivity(intent);
    }
}
