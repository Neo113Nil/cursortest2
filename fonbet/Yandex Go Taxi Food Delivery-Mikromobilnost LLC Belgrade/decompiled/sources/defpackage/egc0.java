package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.yandex.plus.home.api.lifecycle.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.cashback.l;
import ru.yandex.taxi.h;
import ru.yandex.taxi.plus.sdk.Environment;
import ru.yandex.taxi.plus.sdk.domain.a;
import ru.yandex.taxi.plus.sdk.existing_screens.c;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes8.dex */
public final class egc0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ egc0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new dgc0((rqo) xvf0Var.get());
            case 1:
                return new h((Context) xvf0Var.get());
            case 2:
                return new exc0((Context) xvf0Var.get());
            case 3:
                return new jc4((pho) xvf0Var.get());
            case 4:
                return new s1d0((g) xvf0Var.get());
            case 5:
                return new s6d0((dne0) xvf0Var.get());
            case 6:
                return new wid0((zuj0) xvf0Var.get());
            case 7:
                return new jkd0((l) xvf0Var.get());
            case 8:
                return new b((ComponentActivity) xvf0Var.get());
            case 9:
                return new e1c((a) xvf0Var.get());
            case 10:
                List list = ((x2d0) xvf0Var.get()).f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ppt0) {
                        arrayList.add(obj);
                    }
                }
                ppt0 ppt0Var = (ppt0) kotlin.collections.a.R(arrayList);
                p2c p2cVar = ppt0Var != null ? ppt0Var.a : null;
                q2c q2cVar = new q2c();
                ArrayList arrayList2 = new ArrayList();
                q2cVar.a = arrayList2;
                if (p2cVar != null) {
                    arrayList2.add(p2cVar);
                }
                return q2cVar;
            case 11:
                ((u02) xvf0Var.get()).getClass();
                Environment environment = Environment.PRODUCTION;
                q5z.i(environment);
                return environment;
            case 12:
                return new c((Context) xvf0Var.get());
            case 13:
                final ko21 ko21Var = (ko21) xvf0Var.get();
                return new p5z() { // from class: ukd0
                    @Override // defpackage.p5z
                    public final Locale getLocale() {
                        return ko21.this.a().a;
                    }
                };
            case 14:
                c2d0 c2d0Var = (c2d0) xvf0Var.get();
                return new fo10(c2d0Var.o, new uyi(2, c2d0Var));
            case 15:
                return new rg20((jmo) ((u2d0) xvf0Var.get()).o.getValue());
            case 16:
                return new z1d0((Context) xvf0Var.get());
            case 17:
                return new vjd0((ru.yandex.taxi.plus.repository.c) xvf0Var.get());
            case 18:
                c2d0 c2d0Var2 = (c2d0) xvf0Var.get();
                return new yjd0(c2d0Var2.f, c2d0Var2.g, c2d0Var2.h, c2d0Var2.j, c2d0Var2.s);
            case 19:
                ((hih) xvf0Var.get()).getClass();
                return "go";
            case 20:
                return new com.yandex.go.plus.di.internal.b(new mth(((ekd0) xvf0Var.get()).a, 6));
            case 21:
                return new k7r0(((c2d0) xvf0Var.get()).m);
            case 22:
                return new acr0(((c2d0) xvf0Var.get()).m);
            case 23:
                return new b1v0((xdf) xvf0Var.get());
            case 24:
                return new hld0((Context) xvf0Var.get());
            case 25:
                return new bqd0((Context) xvf0Var.get());
            case 26:
                return new cqd0((bqd0) xvf0Var.get());
            case 27:
                return new frd0((grd0) xvf0Var.get());
            case 28:
                return new kip((rqo) xvf0Var.get(), 4);
            default:
                return new xxd0((at2) xvf0Var.get());
        }
    }
}
