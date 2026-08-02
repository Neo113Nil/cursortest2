package defpackage;

import android.content.Context;
import defpackage.ir40;
import ru.yandex.taxi.multiexit.notification.MultiexitEntranceChangeNotification;

/* loaded from: classes6.dex */
public final class dr40 {
    public final Context a;
    public final tj60 b;
    public final pav c;
    public final k7x0 d;
    public final qqo e;

    public dr40(rqo rqoVar, Context context, tj60 tj60Var, pav pavVar, k7x0 k7x0Var) {
        this.a = context;
        this.b = tj60Var;
        this.c = pavVar;
        this.d = k7x0Var;
        ir40.Companion.getClass();
        this.e = ((jbh) rqoVar).c(ir40.k);
    }

    public final MultiexitEntranceChangeNotification a(ir40 ir40Var, ir40.a aVar) {
        String Y = d6z.Y(ir40Var, aVar.a);
        if (!ir40Var.b || Y.length() == 0) {
            return null;
        }
        MultiexitEntranceChangeNotification multiexitEntranceChangeNotification = new MultiexitEntranceChangeNotification(this.a, this.c, new g3o(Y, d6z.Y(ir40Var, aVar.b), ((m7x0) this.d).a(aVar.d), aVar.c));
        multiexitEntranceChangeNotification.setExpiresListener(new wz1(9, this));
        return multiexitEntranceChangeNotification;
    }
}
