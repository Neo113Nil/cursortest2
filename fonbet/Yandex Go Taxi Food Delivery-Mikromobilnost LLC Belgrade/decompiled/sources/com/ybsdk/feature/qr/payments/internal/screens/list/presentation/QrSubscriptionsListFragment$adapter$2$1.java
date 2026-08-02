package com.ybsdk.feature.qr.payments.internal.screens.list.presentation;

import defpackage.g8e;
import defpackage.j1v0;
import defpackage.jl40;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.wj1;
import defpackage.z1v0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class QrSubscriptionsListFragment$adapter$2$1 extends FunctionReferenceImpl implements tls {
    public QrSubscriptionsListFragment$adapter$2$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onSelectorChange", "onSelectorChange(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        r0 r0Var;
        Object value;
        j1v0 j1v0Var;
        u8j0 t8j0Var;
        String str = (String) obj;
        a aVar = (a) this.receiver;
        Object a = ((j1v0) aVar.X()).a.a();
        z1v0 z1v0Var = a instanceof z1v0 ? (z1v0) a : null;
        if (z1v0Var != null) {
            Iterator it = z1v0Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((wj1) obj2).a, str)) {
                    break;
                }
            }
            wj1 wj1Var = (wj1) obj2;
            if (wj1Var != null) {
                String str2 = wj1Var.a;
                aVar.D.a.Y.a.a("qr.agreements_subscriptions.select_agreement", g8e.w(1, "agreement_id", str2));
                pz40 Y = aVar.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    j1v0Var = (j1v0) value;
                    u8j0 u8j0Var = j1v0Var.a;
                    if (u8j0Var instanceof r8j0) {
                        r8j0 r8j0Var = (r8j0) u8j0Var;
                        t8j0Var = new r8j0(z1v0.a(z1v0Var, null, str2, 3), r8j0Var.b, r8j0Var.c, r8j0Var.d);
                    } else if (u8j0Var instanceof s8j0) {
                        t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                    } else {
                        if (!(u8j0Var instanceof t8j0)) {
                            w511.b();
                            return null;
                        }
                        t8j0Var = new t8j0();
                    }
                } while (!r0Var.k(value, j1v0.a(j1v0Var, t8j0Var)));
            }
        }
        return zy11.a;
    }
}
