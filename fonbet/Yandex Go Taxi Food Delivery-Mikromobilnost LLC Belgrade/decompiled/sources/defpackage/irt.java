package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;

/* loaded from: classes14.dex */
public final class irt implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Session b;

    public /* synthetic */ irt(Session session, int i) {
        this.a = i;
        this.b = session;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Session session = this.b;
        switch (i) {
            case 0:
                session.cancel();
                break;
            default:
                qyy0.b(new pw30(session, 8));
                break;
        }
        return zy11Var;
    }
}
