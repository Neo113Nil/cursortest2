package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.authorized.chat.notifications.a;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* loaded from: classes15.dex */
public final /* synthetic */ class fn3 implements vff0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vff0
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((uds0) obj).close();
                break;
            case 1:
                i4b i4bVar = (i4b) obj;
                ixj0 ixj0Var = i4bVar.f;
                if (ixj0Var != null) {
                    ixj0Var.cancel();
                    i4bVar.f = null;
                    break;
                }
                break;
            case 2:
                a.a((a) obj);
                break;
            case 3:
                ((u7b) obj).a(null);
                break;
            case 4:
                zbf zbfVar = (zbf) obj;
                qp3 qp3Var = zbfVar.g;
                kgx[] kgxVarArr = zbf.h;
                kgx kgxVar = kgxVarArr[0];
                if (((e1k) qp3Var.a()) != null) {
                    kgx kgxVar2 = kgxVarArr[0];
                    qp3Var.b(null);
                    zbfVar.a("go offline", new Pair[0]);
                    break;
                }
                break;
            case 5:
                vgu vguVar = (vgu) obj;
                vguVar.g = true;
                xo3 xo3Var = vguVar.e;
                if (xo3Var != null) {
                    xo3Var.cancel();
                }
                vguVar.e = null;
                xo3 xo3Var2 = vguVar.f;
                if (xo3Var2 != null) {
                    xo3Var2.cancel();
                }
                vguVar.f = null;
                break;
            case 6:
                ((zgu) obj).e = true;
                break;
            case 7:
                xav xavVar = (xav) obj;
                xavVar.a();
                xavVar.d();
                break;
            case 8:
                op3 op3Var = ((rsx) obj).g;
                kgx kgxVar3 = rsx.h[0];
                op3Var.b(null);
                break;
            case 9:
                py10 py10Var = (py10) obj;
                py10Var.a.getLooper();
                Looper.myLooper();
                z83.i();
                oy10 oy10Var = py10Var.g;
                op3 op3Var2 = oy10Var.b;
                kgx[] kgxVarArr2 = oy10.e;
                kgx kgxVar4 = kgxVarArr2[0];
                op3Var2.b(null);
                oy10Var.c.removeCallbacksAndMessages(null);
                oy10 oy10Var2 = py10Var.h;
                op3 op3Var3 = oy10Var2.b;
                kgx kgxVar5 = kgxVarArr2[0];
                op3Var3.b(null);
                oy10Var2.c.removeCallbacksAndMessages(null);
                break;
            case 10:
                o150 o150Var = (o150) obj;
                o150Var.e = true;
                kotlinx.coroutines.a.g(o150Var.c.a, null);
                break;
            case 11:
                ((xw50) obj).close();
                break;
            case 12:
                ((xdf0) obj).a.a(null);
                break;
            case 13:
                ((f7i0) obj).a.removeCallbacksAndMessages(null);
                break;
            case 14:
                kotlinx.coroutines.a.e(((vmi0) obj).e.a, null);
                break;
            case 15:
                jdu0 jdu0Var = (jdu0) obj;
                vbu0 vbu0Var = jdu0Var.c;
                if (vbu0Var != null) {
                    vbu0Var.b = null;
                    xo3 xo3Var3 = vbu0Var.a;
                    if (xo3Var3 != null) {
                        xo3Var3.cancel();
                        vbu0Var.a = null;
                    }
                    jdu0Var.c = null;
                    break;
                }
                break;
            case 16:
                ((piv0) obj).a.removeCallbacks(null);
                break;
            default:
                qro qroVar = ((tgy0) obj).b;
                qroVar.a.a(EmptySet.a);
                break;
        }
    }
}
