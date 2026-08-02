package defpackage;

import android.app.Application;
import android.content.Intent;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.d1;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.j;
import com.yandex.passport.internal.autologin.ui.h;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import com.yandex.passport.internal.properties.b0;

/* loaded from: classes9.dex */
public final class no90 {
    public final Application a;
    public final u02 b;
    public final vo90 c;
    public final hqe d;
    public final go90 e;
    public final ep90 f;
    public final VisualProperties g;
    public final VisualProperties h;

    public no90(Application application, u02 u02Var, vo90 vo90Var, hqe hqeVar, go90 go90Var, ep90 ep90Var) {
        this.a = application;
        this.b = u02Var;
        this.c = vo90Var;
        this.d = hqeVar;
        this.e = go90Var;
        this.f = ep90Var;
        vo90Var.getClass();
        VisualProperties.a aVar = new VisualProperties.a();
        i3y i3yVar = vo90Var.e;
        aVar.F = (j) i3yVar.getValue();
        aVar.a = true;
        aVar.G = vo90Var.c();
        aVar.H = true;
        VisualProperties.Companion.getClass();
        this.g = b0.a(aVar);
        VisualProperties.a aVar2 = new VisualProperties.a();
        aVar2.F = (j) i3yVar.getValue();
        aVar2.a = true;
        aVar2.G = vo90Var.c();
        aVar2.H = true;
        aVar2.C = true;
        this.h = b0.a(aVar2);
    }

    public final Intent a(final long j, final boolean z, final boolean z2, final String str) {
        h b = this.f.b();
        return b.b.i(this.a, this.c.b(this.e.a(new yce(z, 17)), new tls() { // from class: mo90
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                d1 d1Var = (d1) obj;
                boolean z3 = z;
                no90 no90Var = this;
                VisualProperties visualProperties = z3 ? no90Var.g : no90Var.h;
                VisualProperties.a aVar = new VisualProperties.a();
                aVar.a(visualProperties);
                aVar.a = z2;
                VisualProperties.Companion.getClass();
                LoginProperties.a aVar2 = (LoginProperties.a) d1Var;
                aVar2.k(b0.a(aVar));
                no90Var.c.getClass();
                WebAmProperties.a aVar3 = new WebAmProperties.a();
                aVar3.b();
                aVar3.d();
                aVar3.e();
                aVar3.c();
                aVar2.l(aVar3.a());
                long j2 = j;
                if (j2 > 0) {
                    aVar2.A = no90Var.c(j2);
                }
                String str2 = str;
                if (str2 != null) {
                    aVar2.R = str2;
                }
                return zy11.a;
            }
        }));
    }

    public final Intent b(kj kjVar) {
        h b = this.f.b();
        return b.b.i(this.a, this.c.b(this.e.a(new bd90(7)), new zl50(29, this, kjVar)));
    }

    public final PassportUidImpl c(long j) {
        this.b.getClass();
        return new PassportUidImpl(PassportEnvironmentImpl.from(KPassportEnvironment.PRODUCTION), j);
    }
}
