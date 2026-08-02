package defpackage;

import android.text.Editable;
import androidx.emoji2.text.EmojiSpan;
import com.yandex.messaging.internal.view.messagemenu.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class eu10 implements e1k, rmt0 {
    public static final /* synthetic */ kgx[] w = {new MutablePropertyReference1Impl("urlSubscription", 0, "getUrlSubscription()Lcom/yandex/alicekit/core/Disposable;", eu10.class), oyr.B(qoi0.a, eu10.class, "mentionsSubscription", "getMentionsSubscription()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final a a;
    public final qp3 b;
    public final qp3 c;

    public eu10(mu10 mu10Var, String str, a aVar) {
        this.a = aVar;
        qp3 qp3Var = new qp3();
        this.b = qp3Var;
        qp3 qp3Var2 = new qp3();
        this.c = qp3Var2;
        str = (str == null || !(evu0.J(str) ^ true)) ? null : str;
        if (str != null) {
            th21 th21Var = new th21(str, true, null);
            com.yandex.messaging.internal.urlpreview.a aVar2 = mu10Var.g;
            k9b k9bVar = new k9b(9, this);
            aVar2.getClass();
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            uds0 uds0Var = new uds0(bvf0.a(cvw.U(a, o400.a.x)), k9bVar, aVar2, th21Var);
            kgx[] kgxVarArr = w;
            kgx kgxVar = kgxVarArr[0];
            qp3Var.b(uds0Var);
            smt0 a2 = tmt0.a(mu10Var.a, aVar.s(((v3k0) mu10Var.f).b(0, str)), tmt0.e, this);
            kgx kgxVar2 = kgxVarArr[1];
            qp3Var2.b(a2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kgx[] kgxVarArr = w;
        kgx kgxVar = kgxVarArr[0];
        this.b.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.c.b(null);
    }

    @Override // defpackage.rmt0
    public final void o(Editable editable) {
        if (editable.getSpans(0, editable.length(), EmojiSpan.class).length == 0) {
            return;
        }
        this.a.s(editable);
    }
}
