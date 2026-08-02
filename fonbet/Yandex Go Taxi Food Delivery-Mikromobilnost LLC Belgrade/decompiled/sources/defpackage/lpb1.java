package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.tickets.c;

/* loaded from: classes11.dex */
public abstract class lpb1 {
    public static final void a(m940 m940Var, c cVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        c cVar2;
        tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1991514506);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(m940Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cVar2 = cVar;
            i2 |= btsVar.k(cVar2) ? 32 : 16;
        } else {
            cVar2 = cVar;
        }
        if ((i & 384) == 0) {
            tlsVar3 = tlsVar;
            i2 |= btsVar.e(tlsVar3) ? 256 : 128;
        } else {
            tlsVar3 = tlsVar;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(null);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean k = ((i2 & 14) == 4) | btsVar.k((String) oz40Var.getValue());
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = f.d(new ve30(13, m940Var, oz40Var));
                btsVar.o0(Q2);
            }
            m3u0 m3u0Var = (m3u0) Q2;
            j940 j940Var = m940Var instanceof j940 ? (j940) m940Var : null;
            b(j940Var != null ? j940Var.h : null, ((Boolean) m3u0Var.getValue()).booleanValue(), btsVar, 0);
            qy20.a(null, null, null, false, wwg.S(404283288, true, new vg0((Object) m940Var, tlsVar3, (Object) cVar2, tlsVar2, (Object) oz40Var, 9), btsVar), btsVar, 27648, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(m940Var, cVar, tlsVar, tlsVar2, i, 18);
        }
    }

    public static final void b(final Integer num, final boolean z, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        Activity activity;
        bts btsVar = (bts) fidVar;
        btsVar.g0(913907528);
        int i2 = (btsVar.k(num) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16);
        final int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
            if (activity == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(num, z, i, r4) { // from class: c840
                        public final /* synthetic */ int a;
                        public final /* synthetic */ Integer b;
                        public final /* synthetic */ boolean c;

                        {
                            this.a = r4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            boolean z2 = this.c;
                            Integer num2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    lpb1.b(num2, z2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    lpb1.b(num2, z2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            final Window window = activity.getWindow();
            final float d = y6i0.d(num != null ? num.intValue() : 100, 0, 100) / 100.0f;
            boolean k = btsVar.k(activity);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (k || Q == o430Var) {
                tx40 f = f.f(window.getAttributes().screenBrightness);
                btsVar.o0(f);
                obj = f;
            }
            final tx40 tx40Var = (tx40) obj;
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(d);
            int i4 = (btsVar.e(window) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : 0) | (btsVar.b(d) ? 1 : 0) | (btsVar.k(tx40Var) ? 1 : 0);
            Object Q2 = btsVar.Q();
            Object obj2 = Q2;
            if (i4 != 0 || Q2 == o430Var) {
                tls tlsVar = new tls() { // from class: d840
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        boolean z2 = z;
                        Window window2 = window;
                        tx40 tx40Var2 = tx40Var;
                        if (z2) {
                            WindowManager.LayoutParams attributes = window2.getAttributes();
                            attributes.screenBrightness = d;
                            window2.setAttributes(attributes);
                        } else {
                            float floatValue = tx40Var2.getFloatValue();
                            WindowManager.LayoutParams attributes2 = window2.getAttributes();
                            attributes2.screenBrightness = floatValue;
                            window2.setAttributes(attributes2);
                        }
                        return new te4(11, tx40Var2, window2);
                    }
                };
                btsVar.o0(tlsVar);
                obj2 = tlsVar;
            }
            zpn.c(activity, valueOf, valueOf2, (tls) obj2, btsVar);
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(num, z, i, i3) { // from class: c840
                public final /* synthetic */ int a;
                public final /* synthetic */ Integer b;
                public final /* synthetic */ boolean c;

                {
                    this.a = i3;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj22) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    boolean z2 = this.c;
                    Integer num2 = this.b;
                    fid fidVar2 = (fid) obj3;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            lpb1.b(num2, z2, fidVar2, vng.O(1));
                            break;
                        default:
                            lpb1.b(num2, z2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void c(v0f v0fVar, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(760673585);
        int i2 = i | (btsVar.k(v0fVar) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            rsb1.a(an91.m(ljs0.c(c530.a, 1.0f), 16.0f, 0.0f, 2), v0fVar.a, slsVar, slsVar2, v0fVar.c, v0fVar.b, 0L, 0L, null, btsVar, (i3 & 896) | 6 | (i3 & 7168), 448);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(v0fVar, slsVar, slsVar2, i, 15);
        }
    }

    public static final boolean d(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1250517184);
        boolean z = ((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).orientation == 2;
        btsVar.t(false);
        return z;
    }
}
