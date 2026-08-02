package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.go.ai_widget.data.b;
import com.yandex.go.chargers.passes.data.r0;
import com.yandex.go.payments.domain.k;
import com.yandex.go.route.interactor.c;
import com.yandex.go.shortcuts.impl.repository.s;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.apprate.common.domain.a;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes15.dex */
public final class js0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ js0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    public static js0 a(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, pl plVar) {
        return new js0(xvf0Var, xvf0Var2, xvf0Var3, plVar, 2);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new is0((o3s) xvf0Var4.get(), (ms0) xvf0Var3.get(), (String) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 1:
                return new m2v((String) xvf0Var4.get(), (dv8) xvf0Var3.get(), (p6s) xvf0Var2.get(), (c7s) xvf0Var.get());
            case 2:
                return new b((bg5) xvf0Var4.get(), (u) xvf0Var3.get(), (com.yandex.go.route.interactor.b) xvf0Var2.get(), (s) xvf0Var.get());
            case 3:
                return new bq1((o3s) xvf0Var4.get(), (dq1) xvf0Var3.get(), (String) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 4:
                return new a((iw2) xvf0Var4.get(), (lw2) xvf0Var3.get(), (y631) xvf0Var2.get(), (tse) xvf0Var.get());
            case 5:
                return new com.yandex.messaging.ui.yadisk.a((Activity) xvf0Var4.get(), (sfl0) xvf0Var3.get(), (kse) xvf0Var2.get(), (b00) xvf0Var.get());
            case 6:
                qs20 qs20Var = (qs20) xvf0Var4.get();
                rwo rwoVar = (rwo) xvf0Var3.get();
                return new m3v(qs20Var, rwoVar, (pgb) xvf0Var.get());
            case 7:
                return new w9i0((qs20) xvf0Var4.get(), (ShowSbpTokensFlag) xvf0Var3.get(), (rwo) xvf0Var.get(), (y9a0) xvf0Var2.get());
            case 8:
                xw5 xw5Var = (xw5) xvf0Var4.get();
                bx5 bx5Var = (bx5) xvf0Var3.get();
                ox90 ox90Var = (ox90) xvf0Var2.get();
                return new nu5(xw5Var, bx5Var, ox90Var);
            case 9:
                return new ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.b((fza0) xvf0Var4.get(), (yuj0) xvf0Var3.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var2.get(), (y30) xvf0Var.get());
            case 10:
                return new ou7((g) xvf0Var4.get(), (c) xvf0Var3.get(), (b0j) xvf0Var2.get(), i5m.a(xvf0Var));
            case 11:
                return new com.yandex.go.taxi.order.cancel.similar.notification.a((Context) xvf0Var4.get(), (tj60) xvf0Var3.get(), (e) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 12:
                return new k((qea0) xvf0Var4.get(), (lw90) xvf0Var3.get(), (xhq0) xvf0Var2.get(), (tea0) xvf0Var.get());
            case 13:
                return new com.yandex.go.chargers.passes.ui.b((r0) xvf0Var4.get(), (rja) xvf0Var3.get(), (qka) xvf0Var2.get(), (kka) xvf0Var.get());
            case 14:
                return new r0b((o1b0) xvf0Var4.get(), (n5t0) xvf0Var3.get(), (Looper) xvf0Var2.get(), (k020) xvf0Var.get());
            case 15:
                return new n3b((k020) xvf0Var4.get(), (Looper) xvf0Var3.get(), (to3) xvf0Var2.get(), (h9b) xvf0Var.get());
            case 16:
                return new com.yandex.messaging.input.bricks.writing.a(i5m.a(xvf0Var4), (com.yandex.messaging.input.bricks.writing.e) xvf0Var3.get(), (xb3) xvf0Var2.get(), (InputTextController) xvf0Var.get());
            case 17:
                return new u4b("chatlist_scroll_framerate", (Activity) xvf0Var4.get(), (x22) xvf0Var3.get(), (String) xvf0Var2.get(), (o5e) xvf0Var.get());
            case 18:
                return new zoy0((o1b0) xvf0Var4.get(), (sb7) xvf0Var3.get(), (k020) xvf0Var2.get(), (c8b) xvf0Var.get());
            case 19:
                return new b5b((naz0) xvf0Var4.get(), (x0j0) xvf0Var3.get(), i5m.a(xvf0Var2), (ks10) xvf0Var.get());
            case 20:
                return new p5b((sb7) xvf0Var4.get(), (k020) xvf0Var3.get(), (o1b0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 21:
                return new u5b((to3) xvf0Var4.get(), (k020) xvf0Var3.get(), (Looper) xvf0Var2.get(), (x22) xvf0Var.get());
            case 22:
                return new w7b((ChatRequest) xvf0Var4.get(), (ax80) xvf0Var3.get(), (b00) xvf0Var2.get(), i5m.a(xvf0Var));
            case 23:
                return new pbb(i5m.a(xvf0Var4), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var3.get(), (x22) xvf0Var2.get(), (fbb) xvf0Var.get());
            case 24:
                return new o501(13);
            case 25:
                return new e3c((Context) xvf0Var4.get(), (f3c) xvf0Var3.get(), (com.yandex.messaging.input.g) xvf0Var2.get(), (x22) xvf0Var.get());
            case 26:
                return new r4e((w3c) xvf0Var4.get(), (wff0) xvf0Var3.get(), (x22) xvf0Var2.get(), i5m.a(xvf0Var));
            case 27:
                return new fzg(i5m.a(xvf0Var4), (h9b) xvf0Var3.get(), (lcz0) xvf0Var2.get(), (x22) xvf0Var.get());
            case 28:
                return new kki((y5i) xvf0Var4.get(), (cpf) xvf0Var3.get(), (nki) xvf0Var2.get(), (cpi) xvf0Var.get());
            default:
                return new gni((dqe0) xvf0Var4.get(), (cpf) xvf0Var3.get(), (y5i) xvf0Var2.get(), (ozt0) xvf0Var.get());
        }
    }

    public /* synthetic */ js0(Object obj, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
