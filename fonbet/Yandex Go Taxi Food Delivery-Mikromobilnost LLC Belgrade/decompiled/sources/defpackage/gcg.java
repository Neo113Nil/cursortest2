package defpackage;

import android.app.Activity;
import ru.yandex.taxi.h;

/* loaded from: classes10.dex */
public final class gcg implements xvf0 {
    public final /* synthetic */ int a;
    public final yuf0 b;

    public /* synthetic */ gcg(yuf0 yuf0Var, int i) {
        this.a = i;
        this.b = yuf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yuf0 yuf0Var = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) yuf0Var.b;
                q5z.h(activity);
                return activity;
            case 1:
                rs2 rs2Var = (rs2) yuf0Var.f;
                q5z.h(rs2Var);
                return rs2Var;
            case 2:
                tst tstVar = (tst) yuf0Var.e;
                q5z.h(tstVar);
                return tstVar;
            default:
                h hVar = (h) yuf0Var.d;
                q5z.h(hVar);
                return hVar;
        }
    }
}
