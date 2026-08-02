package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class fb6 extends ky4 {
    public static final /* synthetic */ kgx[] E;
    public final long A;
    public final ServerDirective B;
    public final BotRequest.Error[] C;
    public final op3 D;
    public final String y;
    public final String z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("call", 0, "getCall()Lcom/yandex/messaging/Cancelable;", fb6.class);
        qoi0.a.getClass();
        E = new kgx[]{mutablePropertyReference1Impl};
    }

    public fb6(ChatRequest chatRequest, String str, String str2, long j, ServerDirective serverDirective, BotRequest.Error[] errorArr) {
        super(chatRequest);
        this.y = str;
        this.z = str2;
        this.A = j;
        this.B = serverDirective;
        this.C = errorArr;
        this.D = new op3();
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        kgx kgxVar = E[0];
        this.D.b(null);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        kgx[] kgxVarArr = E;
        kgx kgxVar = kgxVarArr[0];
        op3 op3Var = this.D;
        z83.f(op3Var.a(), null);
        cb6 c = ((m8g) s020Var).c();
        ServerDirective serverDirective = this.B;
        x08 f = c.b.f(new bb6(c, this.y, this.A, this.z, new BotRequest.ServerAction(serverDirective.a, serverDirective.b), this.C, new js4(14, this)));
        kgx kgxVar2 = kgxVarArr[0];
        op3Var.b(f);
    }
}
