package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class db6 extends ky4 {
    public static final /* synthetic */ kgx[] D;
    public final long A;
    public final BotRequest.Error[] B;
    public final op3 C;
    public final String y;
    public final String z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("call", 0, "getCall()Lcom/yandex/messaging/Cancelable;", db6.class);
        qoi0.a.getClass();
        D = new kgx[]{mutablePropertyReference1Impl};
    }

    public db6(ChatRequest chatRequest, String str, String str2, long j, BotRequest.Error[] errorArr) {
        super(chatRequest);
        this.y = str;
        this.z = str2;
        this.A = j;
        this.B = errorArr;
        this.C = new op3();
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        kgx kgxVar = D[0];
        this.C.b(null);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        kgx[] kgxVarArr = D;
        kgx kgxVar = kgxVarArr[0];
        op3 op3Var = this.C;
        z83.f(op3Var.a(), null);
        cb6 c = ((m8g) s020Var).c();
        x08 f = c.b.f(new bb6(c, this.y, this.A, this.z, null, this.B, new js4(12, this)));
        kgx kgxVar2 = kgxVarArr[0];
        op3Var.b(f);
    }
}
