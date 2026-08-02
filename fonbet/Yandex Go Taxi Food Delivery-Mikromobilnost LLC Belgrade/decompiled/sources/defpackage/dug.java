package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.data.model.DebtAvailablePaymentMethod;
import com.yandex.go.overdraft.data.model.TapAction$OpenRidesHistoryAction;
import com.yandex.go.overdraft.data.model.TapAction$OpenUrlAction;
import com.yandex.go.overdraft.data.model.TapAction$PayDebtAction;
import com.yandex.go.overdraft.data.model.TapAction$SwitchPaymentMethodAction;
import com.yandex.go.overdraft.data.model.f0;
import com.yandex.go.overdraft.data.model.g0;
import com.yandex.go.overdraft.data.model.i0;
import com.yandex.go.overdraft.data.model.j0;
import com.yandex.go.overdraft.data.model.o0;
import com.yandex.go.overdraft.data.model.q0;
import com.yandex.go.overdraft.data.model.r0;
import com.yandex.go.overdraft.data.model.t0;
import com.yandex.go.overdraft.domain.e;
import com.yandex.go.overdraft.domain.h;
import com.yandex.go.overdraft.domain.k;
import com.yandex.go.overdraft.g;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.domain.o;
import java.math.BigDecimal;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class dug extends ad5 {
    public final k A;
    public final h B;
    public final aq80 C;
    public final o D;
    public final e E;
    public final OverdraftContext F;
    public boolean G;
    public final yj70 x;
    public final h3y y;
    public final yy80 z;

    public dug(yj70 yj70Var, h3y h3yVar, yy80 yy80Var, k kVar, h hVar, aq80 aq80Var, o oVar, e eVar, OverdraftContext overdraftContext) {
        super(utg.class);
        this.x = yj70Var;
        this.y = h3yVar;
        this.z = yy80Var;
        this.A = kVar;
        this.B = hVar;
        this.C = aq80Var;
        this.D = oVar;
        this.E = eVar;
        this.F = overdraftContext;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        rx2 rx2Var = this.z.d;
        rx2Var.getClass();
        rx2Var.a.a("DebtsInfoCard.Closed", new HashMap(), 1, new HashMap());
    }

    public final void Kg(t0 t0Var, hug hugVar) {
        lv90 b;
        OverdraftContext overdraftContext;
        String str;
        zy80 zy80Var = zy80.a;
        if (t0Var != null) {
            yy80 yy80Var = this.z;
            OverdraftContext overdraftContext2 = this.F;
            yy80Var.getClass();
            switch (xy80.a[t0Var.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    str = "pay_debt";
                    break;
                case 5:
                    str = "order";
                    break;
                case 6:
                case 7:
                    str = "debt_info";
                    break;
                case 8:
                case 9:
                case 10:
                    str = "payment_methods";
                    break;
                case 11:
                    str = "close";
                    break;
                case 12:
                case 13:
                case 14:
                    str = null;
                    break;
                default:
                    w511.b();
                    return;
            }
            if (str != null) {
                rx2 rx2Var = yy80Var.d;
                String b2 = yy80.b(overdraftContext2);
                boolean z = yy80Var.d().c;
                boolean e = yy80Var.e();
                boolean f = yy80Var.f();
                double c = yy80Var.c();
                rx2Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(MetaDataField.SCREEN_FIELD, b2);
                hashMap.put("tapped_button", str);
                oo31.q(z, hashMap, "has_overdraft", e, "is_card_available");
                hashMap.put("is_cash_available", Boolean.valueOf(f));
                hashMap.put("cumulative_debt", Double.valueOf(c));
                rx2Var.a.a("DebtsInfoCard.Tapped", hashMap, 1, new HashMap());
            }
        }
        if (t0Var instanceof j0) {
            g gVar = (g) this.x.a;
            mz80 mz80Var = gVar.a0;
            if (mz80Var != null) {
                mz80Var.a(zy80Var);
            }
            nm10 nm10Var = gVar.I;
            lv90.Companion.getClass();
            nm10Var.a(lv90.g);
            gVar.r(new qu(9));
            return;
        }
        if (t0Var instanceof TapAction$OpenRidesHistoryAction) {
            yj70 yj70Var = this.x;
            String str2 = ((TapAction$OpenRidesHistoryAction) t0Var).a;
            g gVar2 = (g) yj70Var.a;
            m950 m950Var = (m950) gVar2.Q.get();
            rz80 rz80Var = (rz80) gVar2.x;
            pz80 pz80Var = rz80Var instanceof pz80 ? (pz80) rz80Var : null;
            if (pz80Var == null || (overdraftContext = pz80Var.a) == null) {
                overdraftContext = OverdraftContext.SUMMARY;
            }
            gVar2.A(m950Var, new lug(str2, overdraftContext), sy60.Q2);
            return;
        }
        if (t0Var instanceof TapAction$PayDebtAction) {
            TapAction$PayDebtAction tapAction$PayDebtAction = (TapAction$PayDebtAction) t0Var;
            ((sz80) this.C.a).c = tapAction$PayDebtAction.a;
            m6a0 a = ((sz80) this.C.a).a();
            if (a == null) {
                this.x.k();
                return;
            }
            yy80 yy80Var2 = this.z;
            String code = a.a.getCode();
            i d = ((j) yy80Var2.a).d("Overdraft.SelectCard.PayDebtTapped");
            d.d("payment_type", code);
            d.m();
            this.A.b(tapAction$PayDebtAction.a);
            return;
        }
        if (t0Var instanceof TapAction$OpenUrlAction) {
            ((a60) ((g) this.x.a).W).b(new Intent("android.intent.action.VIEW", Uri.parse(((TapAction$OpenUrlAction) t0Var).a)));
            return;
        }
        if (t0Var instanceof TapAction$SwitchPaymentMethodAction) {
            DebtAvailablePaymentMethod debtAvailablePaymentMethod = ((TapAction$SwitchPaymentMethodAction) t0Var).a;
            String str3 = debtAvailablePaymentMethod.a;
            if (str3 == null) {
                b = lv90.f;
            } else {
                PaymentMethod$Type.Companion.getClass();
                PaymentMethod$Type a2 = b4a0.a(str3);
                if (a2 == null) {
                    b = lv90.f;
                } else {
                    kv90 kv90Var = lv90.Companion;
                    String str4 = debtAvailablePaymentMethod.b;
                    kv90Var.getClass();
                    b = kv90.b(str4, a2);
                }
            }
            this.x.c(new bz80(b));
            return;
        }
        if (t0Var instanceof q0) {
            if (hugVar == null) {
                return;
            }
            yj70 yj70Var2 = this.x;
            zv51 zv51Var = hugVar.a;
            g gVar3 = (g) yj70Var2.a;
            ((dv51) ((cv51) gVar3.S.b.get())).b(new fv51(new aw51(zv51Var, YbScreenSource.OVERDRAFT_TOPUP_ACTION), false), new bav0(new lz70(8, gVar3), 2));
            return;
        }
        if (t0Var instanceof r0) {
            if (hugVar == null) {
                return;
            }
            yj70 yj70Var3 = this.x;
            zv51 zv51Var2 = hugVar.a;
            aoj aojVar = (aoj) ((g) yj70Var3.a).R.get();
            BigDecimal bigDecimal = zv51Var2.b;
            if (bigDecimal != null) {
                bigDecimal.toPlainString();
            }
            aojVar.getClass();
            return;
        }
        if (t0Var instanceof i0) {
            this.x.k();
            return;
        }
        if (t0Var instanceof o0) {
            this.x.c(zy80Var);
            return;
        }
        boolean z2 = t0Var instanceof f0;
        yj70 yj70Var4 = this.x;
        if (z2) {
            yj70Var4.c(zy80Var);
        } else if (t0Var instanceof g0) {
            yj70Var4.c(cz80.a);
        } else {
            yj70Var4.c(zy80Var);
            g8e.B(jst.e, "Payments:Debts", null, "Unsupported action for action buttons in debts flow", 2);
        }
    }
}
