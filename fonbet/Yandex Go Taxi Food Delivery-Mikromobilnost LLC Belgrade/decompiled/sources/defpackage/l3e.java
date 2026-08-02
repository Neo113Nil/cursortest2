package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.superapp.a;
import com.yandex.messenger.websdk.api.WebMessenger;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.logistics.sdk.l;

/* loaded from: classes8.dex */
public final class l3e implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final n3w e;

    public /* synthetic */ l3e(int i, v7p v7pVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = i;
        this.b = v7pVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        n3w n3wVar = this.e;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new k3e((j3e) xvf0Var3.get(), (i3e) n3wVar.a, (bia0) xvf0Var2.get(), (se8) xvf0Var.get());
            case 1:
                return new v7n((w030) xvf0Var3.get(), (i7n) xvf0Var2.get(), (m7n) xvf0Var.get(), (p7n) n3wVar.a);
            case 2:
                return new b3i((w030) xvf0Var3.get(), (FragmentActivity) xvf0Var2.get(), (WebMessenger) xvf0Var.get(), (acn) n3wVar.a);
            case 3:
                return new l((tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (gkz) n3wVar.a, (tj60) xvf0Var.get());
            case 4:
                return new kk5((w030) xvf0Var3.get(), (zqz) xvf0Var2.get(), this.d, (drz) n3wVar.a, 5);
            case 5:
                return new a((tse) n3wVar.a, (tt2) xvf0Var3.get(), (ryz) xvf0Var2.get(), (nfa0) xvf0Var.get());
            case 6:
                return new c(xvf0Var3, xvf0Var2, (frd0) xvf0Var.get(), (f5c) n3wVar.a);
            case 7:
                return new ycl0((Context) xvf0Var3.get(), (tse) xvf0Var2.get(), (ldl0) n3wVar.a, (sgu0) xvf0Var.get());
            case 8:
                return new f28(xvf0Var2.get(), xvf0Var.get(), (w030) xvf0Var3.get(), n3wVar.a, 11);
            case 9:
                return new d7u0((e7u0) n3wVar.a, (b7u0) xvf0Var3.get(), (g6u0) xvf0Var2.get(), (tj21) xvf0Var.get());
            case 10:
                return new b9y0((w030) xvf0Var3.get(), (p8y0) xvf0Var2.get(), (z8y0) n3wVar.a, (dqt) xvf0Var.get());
            case 11:
                return new f28(xvf0Var2.get(), n3wVar.a, (w030) xvf0Var3.get(), xvf0Var.get(), 16);
            default:
                return new kk5(xvf0Var3.get(), n3wVar.a, (w030) xvf0Var2.get(), (Object) this.d, 9);
        }
    }

    public /* synthetic */ l3e(n3w n3wVar, n3w n3wVar2, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = n3wVar;
        this.e = n3wVar2;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    public /* synthetic */ l3e(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.e = n3wVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ l3e(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = n3wVar;
        this.d = xvf0Var3;
    }
}
