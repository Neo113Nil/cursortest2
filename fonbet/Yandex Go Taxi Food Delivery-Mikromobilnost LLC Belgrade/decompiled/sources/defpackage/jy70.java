package defpackage;

import com.yandex.go.superapp.order.multi.old.router.a;
import ru.yandex.taxi.checkin.CheckInStateActionType;

/* loaded from: classes14.dex */
public final class jy70 {
    public final /* synthetic */ ky70 a;
    public final /* synthetic */ m601 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jy70(ky70 ky70Var, m601 m601Var, String str) {
        this.a = ky70Var;
        this.b = m601Var;
        this.c = str;
    }

    public void a(q6y0 q6y0Var, CheckInStateActionType checkInStateActionType) {
        a aVar = this.a.l;
        aVar.getClass();
        q6y0Var.a();
        aVar.h.a(q6y0Var, checkInStateActionType.getAnalyticName(), this.b, this.c);
        aVar.b.a(q6y0Var.c);
    }
}
