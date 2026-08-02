package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import coil.b;
import coil.c;
import com.yandex.go.taxi.order.chat.data.TaxiOrderChatApi;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import ru.yandex.logistics.cargo_form.send_event.impl.data.FormSendEventApi;
import ru.yandex.taxi.linked_order.models.data.IconType;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes5.dex */
public final class h2b1 implements cv3, nbx, o0p, vfv, u790, bw90, g0a0, c5c0, htl0, uxo0, yqq0, vvv0 {
    public static c A;
    public static tci0 R;
    public static h2b1 a;
    public static qgn0 c;
    public static final oa0 b = new oa0();
    public static final h2b1 w = new h2b1();
    public static final /* synthetic */ h2b1 x = new h2b1();
    public static final vm7 y = new vm7(10);
    public static final h2b1 z = new h2b1();
    public static final h2b1 B = new h2b1();
    public static final h2b1 C = new h2b1();
    public static final h2b1 D = new h2b1();
    public static final h2b1 E = new h2b1();
    public static final h2b1 F = new h2b1();
    public static final h2b1 G = new h2b1();
    public static final tk20 H = new tk20();
    public static final h2b1 I = new h2b1();
    public static final h2b1 J = new h2b1();
    public static final h2b1 K = new h2b1();
    public static final h2b1 L = new h2b1();
    public static final h2b1 M = new h2b1();
    public static final h2b1 N = new h2b1();
    public static final h2b1 O = new h2b1();
    public static final h2b1 P = new h2b1();
    public static final h2b1 Q = new h2b1();
    public static final h2b1 S = new h2b1();

    public static w040 b(qhd0 qhd0Var) {
        return new w040(qhd0Var);
    }

    public static Map c(wnt wntVar, String str, KSerializer kSerializer) {
        return (Map) ((xnt) wntVar).c(str, new k8u(auu0.a, kSerializer, 1));
    }

    public static Set d(wnt wntVar, String str, KSerializer kSerializer) {
        return (Set) ((xnt) wntVar).c(str, new p53(kSerializer, 1));
    }

    public static ii6 e() {
        return Build.VERSION.SDK_INT >= 30 ? ji6.a : xpb1.z;
    }

    public static final c f(Context context) {
        c cVar = A;
        if (cVar != null) {
            return cVar;
        }
        synchronized (z) {
            c cVar2 = A;
            if (cVar2 != null) {
                return cVar2;
            }
            context.getApplicationContext();
            c a2 = new b(context).a();
            A = a2;
            return a2;
        }
    }

    public static s35 g(tly tlyVar, boolean z2) {
        IconType iconType;
        int i = coy.a[tlyVar.c.b.ordinal()];
        if (i == 1) {
            iconType = tlyVar.n;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            iconType = IconType.AMBULANCE;
        }
        IconType iconType2 = iconType;
        zzs zzsVar = tlyVar.k;
        zzs zzsVar2 = tlyVar.m;
        String str = tlyVar.o;
        String str2 = tlyVar.p;
        boolean z3 = tlyVar.v;
        return new s35(zzsVar, zzsVar2, iconType2, z2, str, str2, tlyVar.u, z3, tlyVar.t, tlyVar.c.a);
    }

    public static TaxiOrderChatApi h(on2 on2Var) {
        on2Var.getClass();
        return (TaxiOrderChatApi) on2Var.a(GoApiName.TaxiV3, TaxiOrderChatApi.class);
    }

    public static FormSendEventApi i(t0k0 t0k0Var) {
        return (FormSendEventApi) t0k0Var.b(FormSendEventApi.class);
    }

    public static fki0 j(LinearLayoutManager linearLayoutManager) {
        return new fki0(linearLayoutManager);
    }

    public static synchronized void k() {
        synchronized (h2b1.class) {
            if (a == null) {
                a = new h2b1();
            }
        }
    }

    @Override // defpackage.u790
    public int a(t5y t5yVar, int i) {
        return i;
    }
}
