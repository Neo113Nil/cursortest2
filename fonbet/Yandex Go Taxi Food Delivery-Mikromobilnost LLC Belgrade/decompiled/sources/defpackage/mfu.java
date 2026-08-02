package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.d;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.q;
import com.yandex.passport.api.w;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.account_upgrade.j;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.a;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.ui.router.RoadSign;
import com.yandex.passport.internal.ui.router.c;
import com.yandex.passport.internal.ui.router.r;
import com.yandex.passport.internal.ui.router.s;
import com.yandex.passport.internal.ui.router.t;
import com.yandex.passport.internal.ui.router.u;
import com.yandex.passport.internal.ui.router.v;
import com.yandex.passport.internal.ui.social.gimap.MailGIMAPActivity;
import kotlin.jvm.internal.PropertyReference0;

/* loaded from: classes5.dex */
public final class mfu extends x40 {
    public final /* synthetic */ int a;
    public final Object b;

    public mfu(j jVar) {
        this.a = 1;
        this.b = jVar;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (Intent) obj2;
            case 1:
                return (Intent) obj;
            default:
                v vVar = (v) obj;
                ((r) ((PropertyReference0) ((sls) obj2)).get()).getClass();
                if (vVar instanceof s) {
                    c cVar = GlobalRouterActivity.Companion;
                    AuthByQrProperties.a aVar = new AuthByQrProperties.a();
                    LoginProperties loginProperties = ((s) vVar).a;
                    aVar.a = loginProperties.getTheme();
                    PassportEnvironmentImpl primaryEnvironment = loginProperties.getFilter().getPrimaryEnvironment();
                    KPassportEnvironment.Companion.getClass();
                    aVar.b = d.a(primaryEnvironment);
                    aVar.c = false;
                    AuthByQrProperties authByQrProperties = new AuthByQrProperties(aVar.a, aVar.b.getEnvironment(), aVar.c, aVar.w, false, null, null, false, null);
                    cVar.getClass();
                    Intent d = c.d(context, RoadSign.AUTHORIZATION_BY_QR, authByQrProperties.toBundle());
                    d.putExtra(GlobalRouterActivity.EXTERNAL_EXTRA, false);
                    return d;
                }
                if (vVar instanceof u) {
                    u uVar = (u) vVar;
                    return MailGIMAPActivity.createIntent(context, uVar.a, uVar.b);
                }
                if (!(vVar instanceof t)) {
                    w511.b();
                    return null;
                }
                a aVar2 = BouncerActivity.Companion;
                LoginProperties m307copyLjS6rdk$default = LoginProperties.m307copyLjS6rdk$default(((t) vVar).a, null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, true, null, false, null, 2013265919, null);
                aVar2.getClass();
                Bundle[] bundleArr = {m307copyLjS6rdk$default.toBundle()};
                Bundle bundle = new Bundle();
                bundle.putAll(bundleArr[0]);
                return d6z.B(context, BouncerActivity.class, bundle);
        }
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                return new t40(i != -1 ? i != 0 ? new zyj0(i) : yyj0.b : yyj0.c, intent);
            case 1:
                w wVar = (w) ((x40) this.b).c(i, intent);
                if (wVar instanceof com.yandex.passport.api.u) {
                    return new zl3(jjo.e(((com.yandex.passport.api.u) wVar).a));
                }
                if (wVar.equals(q.a)) {
                    return xl3.a;
                }
                if (wVar.equals(com.yandex.passport.api.t.a)) {
                    return xl3.b;
                }
                if (wVar instanceof com.yandex.passport.api.s) {
                    return new yl3(((com.yandex.passport.api.s) wVar).a);
                }
                if (wVar instanceof com.yandex.passport.api.v) {
                    return xl3.c;
                }
                w511.b();
                return null;
            default:
                return new t40(i != -1 ? i != 0 ? new zyj0(i) : yyj0.b : yyj0.c, intent);
        }
    }

    public /* synthetic */ mfu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
