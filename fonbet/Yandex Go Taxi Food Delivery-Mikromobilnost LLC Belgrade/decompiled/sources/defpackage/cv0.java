package defpackage;

import com.yandex.mapkit.search.Session;

/* loaded from: classes15.dex */
public final class cv0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Session b;

    public /* synthetic */ cv0(Session session, int i) {
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
            case 1:
                session.cancel();
                break;
            default:
                session.cancel();
                break;
        }
        return zy11Var;
    }
}
