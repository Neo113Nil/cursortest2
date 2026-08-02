package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class lcc0 {
    public final wnt a;
    public final mcc0 b;
    public final pcc0 c;

    public lcc0(wnt wntVar, mcc0 mcc0Var, pcc0 pcc0Var) {
        this.a = wntVar;
        this.b = mcc0Var;
        this.c = pcc0Var;
    }

    public final Object a(tls tlsVar, SuspendLambda suspendLambda) {
        pcc0 pcc0Var = this.c;
        zzs zzsVar = pcc0Var.i;
        if (zzsVar == null) {
            return zy11.a;
        }
        lea0 lea0Var = pcc0Var.g;
        return this.b.a.emit(new y650(zzsVar, lea0Var != null ? new m6a0(lea0Var.c(), lea0Var.getId(), null) : null, new gv40(12, tlsVar)), suspendLambda);
    }

    public final String b(String str) {
        pcc0 pcc0Var = this.c;
        lea0 lea0Var = pcc0Var.g;
        Context context = pcc0Var.a;
        return lea0Var == null ? context.getString(kyh0.credit_cards_add) : g8e.p(context.getString(kyh0.payment_methods_add_card_success), "• ", str);
    }

    public final String c(String str, boolean z) {
        String str2;
        fl8 a = this.c.b.a(str);
        String str3 = null;
        String str4 = a != null ? a.e : null;
        if (a != null && (str2 = a.d) != null) {
            if (str2.length() < 4) {
                str2 = null;
            }
            if (str2 != null) {
                str3 = gvu0.B0(4, str2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (z && str4 != null) {
            sb.append(str4);
            sb.append(" ");
        }
        if (str3 != null) {
            sb.append("• ");
            sb.append(str3);
        }
        return sb.toString();
    }

    public final Object d(zzs zzsVar, Continuation continuation) {
        return ((by90) this.c.c.b.getValue()).b().c(new h0a0(zzsVar), "no_feature", false, (ContinuationImpl) continuation);
    }

    public final Object e(SuspendLambda suspendLambda) {
        String id;
        String str;
        zzs zzsVar;
        String str2;
        pcc0 pcc0Var = this.c;
        lea0 lea0Var = pcc0Var.g;
        if (lea0Var != null && (id = lea0Var.getId()) != null) {
            PaymentMethod$Type c = lea0Var.c();
            if (!evu0.J(id) && (str = pcc0Var.k) != null && (zzsVar = pcc0Var.i) != null && (str2 = pcc0Var.l) != null) {
                return this.b.a.emit(new x650(str, id, c, zzsVar, str2), suspendLambda);
            }
        }
        return zy11.a;
    }
}
