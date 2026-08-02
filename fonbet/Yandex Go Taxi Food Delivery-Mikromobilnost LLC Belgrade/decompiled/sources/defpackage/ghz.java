package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.CreateLimitUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;

/* loaded from: classes15.dex */
public final class ghz extends w920 {
    public final /* synthetic */ no6 a;
    public final /* synthetic */ hdu b;

    public ghz(hdu hduVar, no6 no6Var) {
        this.b = hduVar;
        this.a = no6Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        return ouu.b((ouu) this.b.a, "request_user", CreateLimitUserData.class, kvj0Var);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        CreateLimitUserData createLimitUserData = (CreateLimitUserData) obj;
        String str = createLimitUserData.user.guid;
        String str2 = createLimitUserData.yambToken;
        no6 no6Var = this.a;
        z83.g(null, ((Handler) no6Var.x).getLooper(), Looper.myLooper());
        ((Handler) no6Var.w).post(new p7h(25, no6Var, str, str2));
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        hdu hduVar = this.b;
        t4j0 a = ((ouu) hduVar.a).a(new RequestUserParams(), "request_user");
        ((bbj) hduVar.b).b(a);
        return a;
    }
}
