package defpackage;

import com.yandex.messaging.SendAction;
import com.yandex.messaging.input.bricks.writing.d;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final /* synthetic */ class e1w implements sbu0, fb90, jb90 {
    public final /* synthetic */ d a;

    public /* synthetic */ e1w(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.sbu0
    public void i(String str, String str2) {
        d dVar = this.a;
        dVar.w(new t7j(19, dVar, str, str2));
    }

    @Override // defpackage.fb90
    public void m(ServerMessageRef[] serverMessageRefArr) {
        d dVar = this.a;
        if (dVar.j0 != null) {
            sfl0 sfl0Var = dVar.D;
            f620 f620Var = f620.d;
            SendAction sendAction = SendAction.NO_ACTION;
            j73.d0(serverMessageRefArr);
            sfl0Var.getClass();
            new cqr0(f620Var);
        }
    }
}
