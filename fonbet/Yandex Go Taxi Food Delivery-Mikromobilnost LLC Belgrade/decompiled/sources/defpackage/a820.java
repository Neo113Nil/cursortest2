package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.WebChromeClientConfig;

/* loaded from: classes15.dex */
public final class a820 {
    public final qh41 a;

    public a820(qh41 qh41Var) {
        this.a = qh41Var;
    }

    public final heb a() {
        qh41 qh41Var = this.a;
        Context context = qh41Var.a;
        drw drwVar = (drw) qh41Var.p.getValue();
        Looper looper = (Looper) this.a.n.getValue();
        jm3 jm3Var = (jm3) this.a.k.getValue();
        vh60 vh60Var = (vh60) this.a.m.getValue();
        qh41 qh41Var2 = this.a;
        ew2 ew2Var = qh41Var2.r;
        MessengerParams messengerParams = qh41Var2.g;
        qh41 qh41Var3 = this.a;
        WebChromeClientConfig webChromeClientConfig = qh41Var3.e;
        bo41 bo41Var = qh41Var3.t;
        qsx qsxVar = (qsx) qh41Var3.v.getValue();
        sw50 sw50Var = (sw50) this.a.D.getValue();
        aw41 aw41Var = (aw41) this.a.C.getValue();
        gc3 gc3Var = (gc3) this.a.z.getValue();
        krw krwVar = (krw) this.a.A.getValue();
        qh41 qh41Var4 = this.a;
        return new heb(qh41Var, context, drwVar, jm3Var, vh60Var, looper, ew2Var, messengerParams, webChromeClientConfig, bo41Var, sw50Var, qsxVar, aw41Var, gc3Var, krwVar, qh41Var4.f, qh41Var4.s.a);
    }
}
