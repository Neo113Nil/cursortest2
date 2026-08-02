package com.yandex.passport.internal.ui.sloth.webcard;

import android.app.Activity;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.oz40;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class i implements zls {
    public final /* synthetic */ SlothParams a;
    public final /* synthetic */ e b;
    public final /* synthetic */ g0 c;
    public final /* synthetic */ oz40 w;

    public i(SlothParams slothParams, e eVar, g0 g0Var, oz40 oz40Var) {
        this.a = slothParams;
        this.b = eVar;
        this.c = g0Var;
        this.w = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        Object m = btsVar2.m(AndroidCompositionLocals_androidKt.b);
        Activity activity = m instanceof Activity ? (Activity) m : null;
        Window window = activity != null ? activity.getWindow() : null;
        oz40 oz40Var = this.w;
        h0 h0Var = (h0) oz40Var.getValue();
        btsVar2.e0(514537766);
        boolean e = btsVar2.e(window);
        Object Q = btsVar2.Q();
        Object obj4 = did.a;
        if (e || Q == obj4) {
            Q = new WebCardComposeScreenKt$WebCardComposeScreen$4$1$1$1$1(window, oz40Var, null);
            btsVar2.o0(Q);
        }
        final int i = 0;
        btsVar2.t(false);
        zpn.e(btsVar2, (wls) Q, h0Var);
        com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = this.b.getSlothScreenComponentBuilder();
        btsVar2.e0(514554248);
        final g0 g0Var = this.c;
        boolean e2 = btsVar2.e(g0Var);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == obj4) {
            Q2 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                @Override // defpackage.tls
                public final Object invoke(Object obj5) {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    g0 g0Var2 = g0Var;
                    switch (i2) {
                        case 0:
                            g0Var2.W(new e0((com.yandex.passport.sloth.a1) obj5));
                            break;
                        case 1:
                            g0Var2.W(new c0((com.yandex.passport.sloth.i0) obj5));
                            break;
                        default:
                            g0Var2.W(new d0((SlothUiWish) obj5));
                            break;
                    }
                    return zy11Var;
                }
            };
            btsVar2.o0(Q2);
        }
        tls tlsVar = (tls) Q2;
        btsVar2.t(false);
        btsVar2.e0(514557073);
        boolean e3 = btsVar2.e(g0Var);
        Object Q3 = btsVar2.Q();
        if (e3 || Q3 == obj4) {
            final int i2 = 1;
            Q3 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                @Override // defpackage.tls
                public final Object invoke(Object obj5) {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    g0 g0Var2 = g0Var;
                    switch (i22) {
                        case 0:
                            g0Var2.W(new e0((com.yandex.passport.sloth.a1) obj5));
                            break;
                        case 1:
                            g0Var2.W(new c0((com.yandex.passport.sloth.i0) obj5));
                            break;
                        default:
                            g0Var2.W(new d0((SlothUiWish) obj5));
                            break;
                    }
                    return zy11Var;
                }
            };
            btsVar2.o0(Q3);
        }
        tls tlsVar2 = (tls) Q3;
        btsVar2.t(false);
        btsVar2.e0(514560044);
        boolean e4 = btsVar2.e(g0Var);
        Object Q4 = btsVar2.Q();
        if (e4 || Q4 == obj4) {
            final int i3 = 2;
            Q4 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webcard.h
                @Override // defpackage.tls
                public final Object invoke(Object obj5) {
                    int i22 = i3;
                    zy11 zy11Var = zy11.a;
                    g0 g0Var2 = g0Var;
                    switch (i22) {
                        case 0:
                            g0Var2.W(new e0((com.yandex.passport.sloth.a1) obj5));
                            break;
                        case 1:
                            g0Var2.W(new c0((com.yandex.passport.sloth.i0) obj5));
                            break;
                        default:
                            g0Var2.W(new d0((SlothUiWish) obj5));
                            break;
                    }
                    return zy11Var;
                }
            };
            btsVar2.o0(Q4);
        }
        btsVar2.t(false);
        com.yandex.passport.internal.ui.sloth.screen.g.a(this.a, slothScreenComponentBuilder, tlsVar, tlsVar2, (tls) Q4, null, btsVar2, 0, 32);
        return zy11.a;
    }
}
