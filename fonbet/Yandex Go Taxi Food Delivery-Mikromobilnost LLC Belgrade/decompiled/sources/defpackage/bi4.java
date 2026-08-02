package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.beginners.flow.e;
import java.util.Set;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.vendor_api.google.bank_card.pci_dss.a;

/* loaded from: classes9.dex */
public final class bi4 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ bi4(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ai4((ky2) xvf0Var.get());
            case 1:
                return new im4((dne0) xvf0Var.get());
            case 2:
                return new to4((b220) xvf0Var.get(), 0);
            case 3:
                return new mq4((pho) xvf0Var.get());
            case 4:
                return new et4((zuj0) xvf0Var.get());
            case 5:
                return new ru4((o3h) xvf0Var.get());
            case 6:
                return new su4((c) xvf0Var.get());
            case 7:
                return new ap9(1, (i6r) xvf0Var.get());
            case 8:
                return new s55((gc80) xvf0Var.get());
            case 9:
                yuf0 yuf0Var = ((hcg) ((ku11) xvf0Var.get()).a.getValue()).a;
                Activity activity = (Activity) yuf0Var.b;
                q5z.h(activity);
                g gVar = (g) yuf0Var.c;
                q5z.h(gVar);
                return new wp4(new a(activity, gVar));
            case 10:
                return ((ku11) xvf0Var.get()).a();
            case 11:
                tst tstVar = (tst) ((x631) xvf0Var.get()).a().b.get();
                q5z.i(tstVar);
                return tstVar;
            case 12:
                return new ru.yandex.taxi.vendor_api.google.location.a(((zzf) ((x631) xvf0Var.get()).a().a).a);
            case 13:
                ((x631) xvf0Var.get()).a().getClass();
                return new k421();
            case 14:
                ((x631) xvf0Var.get()).a().getClass();
                return new l421();
            case 15:
                ((x631) xvf0Var.get()).a().getClass();
                return new ecr();
            case 16:
                g5g0 g5g0Var = (g5g0) ((z5g) ((q0g0) xvf0Var.get()).a.getValue()).d.get();
                q5z.i(g5g0Var);
                return g5g0Var;
            case 17:
                i5g0 i5g0Var = (i5g0) ((z5g) ((q0g0) xvf0Var.get()).a.getValue()).e.get();
                q5z.i(i5g0Var);
                return i5g0Var;
            case 18:
                ((x631) xvf0Var.get()).a().getClass();
                return new b521();
            case 19:
                return new o61((pho) xvf0Var.get());
            case 20:
                return new bg5((Context) xvf0Var.get());
            case 21:
                return new o61((pho) xvf0Var.get());
            case 22:
                return new e((com.yandex.go.agreement.repository.g) xvf0Var.get());
            case 23:
                return new ul5((on2) xvf0Var.get());
            case 24:
                return new rm5((zuj0) xvf0Var.get(), 0);
            case 25:
                return new dj3(i5m.a(xvf0Var));
            case 26:
                return vvb1.w((smp) xvf0Var.get());
            case 27:
                return new tm5((pho) xvf0Var.get());
            case 28:
                return new an5((rqo) xvf0Var.get());
            default:
                return new bn5((Set) xvf0Var.get());
        }
    }
}
