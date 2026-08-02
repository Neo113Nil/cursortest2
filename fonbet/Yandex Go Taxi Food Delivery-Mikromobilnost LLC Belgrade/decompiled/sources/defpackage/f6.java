package defpackage;

import com.yandex.go.about.domain.f;
import com.yandex.go.masstransit.sdk.checkout.impl.stop.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class f6 implements yt11 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public f6(a22 a22Var, qhu0 qhu0Var) {
        this.b = a22Var;
        this.c = new b(qhu0Var.b, this);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return e.F(new f(((s4) obj).a(), this), uyj.a);
            default:
                return (b) obj;
        }
    }

    public f6(zuj0 zuj0Var, tt2 tt2Var, s4 s4Var) {
        this.b = zuj0Var;
        this.c = s4Var;
    }
}
