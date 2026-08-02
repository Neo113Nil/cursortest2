package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedFromScreen;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class b3b1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-361453782);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (btsVar.a(z) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z;
            k750 k750Var = (k750) btsVar.m(w3z.a);
            if (k750Var == null) {
                btsVar.e0(950836184);
                View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                while (true) {
                    if (view == null) {
                        k750Var = null;
                        break;
                    }
                    Object tag = view.getTag(bbh0.view_tree_navigation_event_dispatcher_owner);
                    k750 k750Var2 = tag instanceof k750 ? (k750) tag : null;
                    if (k750Var2 != null) {
                        k750Var = k750Var2;
                        break;
                    } else {
                        Object p = qke.p(view);
                        view = p instanceof View ? (View) p : null;
                    }
                }
                btsVar.t(false);
            } else {
                btsVar.e0(950834231);
                btsVar.t(false);
            }
            rx60 a = d4z.a(btsVar);
            k750 k750Var3 = k750Var == null ? a : k750Var;
            if (k750Var3 == null) {
                ny61.g("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = new qe4(k750Var != null ? k750Var.getNavigationEventDispatcher() : null, a != 0 ? a.getOnBackPressedDispatcher() : null);
                btsVar.o0(Q);
            }
            Object obj2 = (qe4) Q;
            long j = btsVar.T;
            boolean k = btsVar.k(obj2) | btsVar.d(j);
            Object Q2 = btsVar.Q();
            Object obj3 = Q2;
            if (k || Q2 == obj) {
                sfd sfdVar = new sfd(new re4(j, k750Var3));
                sfdVar.c = new bgc(12);
                btsVar.o0(sfdVar);
                obj3 = sfdVar;
            }
            Object obj4 = (sfd) obj3;
            btsVar.e0(-585289004);
            boolean e = ((i3 & 112) == 32) | btsVar.e(obj4);
            Object Q3 = btsVar.Q();
            if (e || Q3 == obj) {
                Q3 = new mw2(11, obj4, slsVar);
                btsVar.o0(Q3);
            }
            zpn.i((sls) Q3, btsVar);
            Boolean valueOf = Boolean.valueOf(z3);
            int i6 = i3 & 14;
            boolean e2 = (i6 == 4) | btsVar.e(obj4);
            Object Q4 = btsVar.Q();
            if (e2 || Q4 == obj) {
                Q4 = new xz3(obj4, z3, 1);
                btsVar.o0(Q4);
            }
            ydy.c(valueOf, obj4, null, (tls) Q4, btsVar, i6);
            boolean e3 = btsVar.e(obj2) | btsVar.e(obj4);
            Object Q5 = btsVar.Q();
            if (e3 || Q5 == obj) {
                Q5 = new w04(i5, obj2, obj4);
                btsVar.o0(Q5);
            }
            zpn.b(obj2, obj4, (tls) Q5, btsVar);
            btsVar.t(false);
            z2 = z3;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yo2(z2, slsVar, i, i2, 1);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final ScootersAnalytics$ScootersPassesOpenedFromScreen c(ScootersPassesFromScreen scootersPassesFromScreen) {
        int i = z6o0.a[scootersPassesFromScreen.ordinal()];
        if (i == 1) {
            return ScootersAnalytics$ScootersPassesOpenedFromScreen.Discovery;
        }
        if (i == 2) {
            return ScootersAnalytics$ScootersPassesOpenedFromScreen.OfferCard;
        }
        if (i == 3) {
            return ScootersAnalytics$ScootersPassesOpenedFromScreen.Discovery;
        }
        w511.b();
        return null;
    }

    public static final ScootersAnalytics$ScootersPassesTappedFromScreen d(ScootersPassesFromScreen scootersPassesFromScreen) {
        int i = z6o0.a[scootersPassesFromScreen.ordinal()];
        if (i == 1) {
            return ScootersAnalytics$ScootersPassesTappedFromScreen.Discovery;
        }
        if (i == 2) {
            return ScootersAnalytics$ScootersPassesTappedFromScreen.OfferCard;
        }
        if (i == 3) {
            return ScootersAnalytics$ScootersPassesTappedFromScreen.Discovery;
        }
        w511.b();
        return null;
    }
}
