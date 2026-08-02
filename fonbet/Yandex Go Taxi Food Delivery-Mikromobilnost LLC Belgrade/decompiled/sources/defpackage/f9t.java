package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.payments.domain.r0;
import com.yandex.go.tariffcard.ui.adapter.header.e;
import com.yandex.messaging.domain.privacy.blocked.a;
import com.yandex.messaging.internal.authorized.chat.b;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.t;
import com.yandex.messaging.internal.v;

/* loaded from: classes15.dex */
public final class f9t implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ f9t(int i, n3w n3wVar, xvf0 xvf0Var, Object obj) {
        this.a = i;
        this.b = n3wVar;
        this.c = xvf0Var;
    }

    public static f9t a(eqh eqhVar, xvf0 xvf0Var) {
        return new f9t(eqhVar, xvf0Var, 28);
    }

    public static f9t b(xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new f9t(xvf0Var, xvf0Var2, 11);
    }

    public static f9t c(xvf0 xvf0Var, xvf0 xvf0Var2) {
        return new f9t(xvf0Var, xvf0Var2, 29);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new e9t((kse) xvf0Var.get(), (b) xvf0Var2.get());
            case 1:
                return new t((kse) xvf0Var.get(), (b) xvf0Var2.get());
            case 2:
                return new nat((kse) xvf0Var2.get(), (p4t) xvf0Var.get());
            case 3:
                return new bbt();
            case 4:
                return new zrm(25, (v) xvf0Var2.get(), (lqo) xvf0Var.get());
            case 5:
                return new ubt((kse) xvf0Var.get(), (j) xvf0Var2.get());
            case 6:
                return new dct((kse) xvf0Var.get(), (b) xvf0Var2.get());
            case 7:
                return new a((kse) xvf0Var2.get(), (eyj0) xvf0Var.get());
            case 8:
                return new com.yandex.messaging.internal.storage.stickers.b((odu0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 9:
                return new hft((kse) xvf0Var2.get(), (j) xvf0Var.get());
            case 10:
                return new rft((kse) xvf0Var.get(), (j) xvf0Var2.get());
            case 11:
                return new uot((ep90) xvf0Var2.get(), (hs50) xvf0Var.get());
            case 12:
                return new avt((z22) xvf0Var2.get(), (DefaultEnvironment) xvf0Var.get());
            case 13:
                return new yvt((Context) xvf0Var2.get(), (pcy) xvf0Var.get());
            case 14:
                i7u i7uVar = (i7u) ((kg51) xvf0Var.get()).h.invoke((tw51) xvf0Var2.get());
                q5z.i(i7uVar);
                return i7uVar;
            case 15:
                return new zx6((kse) xvf0Var2.get(), (key0) xvf0Var.get());
            case 16:
                return new hcu((ecu) xvf0Var2.get(), (ck31) xvf0Var.get());
            case 17:
                return new hdu((pev0) xvf0Var2.get(), (fwu0) xvf0Var.get());
            case 18:
                return new e((iix0) xvf0Var2.get(), (yhx0) xvf0Var.get());
            case 19:
                return new zeu((ml21) xvf0Var2.get(), (Handler) xvf0Var.get());
            case 20:
                return new vmu((x22) xvf0Var2.get(), i5m.a(xvf0Var));
            case 21:
                return new o1v((Context) xvf0Var2.get(), (b2l0) xvf0Var.get());
            case 22:
                return new com.yandex.go.payments.order.domain.a((n20) xvf0Var2.get(), (r0) xvf0Var.get());
            case 23:
                return new apv((dpv) xvf0Var2.get(), (gpv) xvf0Var.get());
            case 24:
                return new bn90((Activity) xvf0Var2.get(), (x22) xvf0Var.get());
            case 25:
                return new uzw();
            case 26:
                return new c9v(4, (mg50) xvf0Var2.get(), (zuj0) xvf0Var.get());
            case 27:
                return new joy((Context) xvf0Var2.get(), (k48) xvf0Var.get());
            case 28:
                return new yuy((ac20) xvf0Var2.get(), (czf0) xvf0Var.get());
            default:
                return new com.yandex.go.litert.service.a((i7n) xvf0Var2.get(), (yuy) xvf0Var.get());
        }
    }

    public /* synthetic */ f9t(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }
}
