package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class nh8 implements mk8, tro, xnf {
    public final wb8 a;
    public final yh5 b;
    public final hg8 c;
    public final nz21 d;
    public final l9s e;
    public final y6q0 f;
    public final xro g;
    public final lir h;
    public final r0 i;
    public final r0 j;
    public jlk k;

    public nh8(rg8 rg8Var, boolean z, boolean z2, wb8 wb8Var, yh5 yh5Var, hg8 hg8Var, lir lirVar) {
        rg8 rg8Var2;
        nz21 nz21Var = new nz21(0);
        l9s l9sVar = new l9s(z, z2);
        y6q0 y6q0Var = new y6q0(0);
        xro xroVar = new xro();
        this.a = wb8Var;
        this.b = yh5Var;
        this.c = hg8Var;
        this.d = nz21Var;
        this.e = l9sVar;
        this.f = y6q0Var;
        this.g = xroVar;
        this.h = lirVar;
        if (rg8Var == null) {
            rg8Var2 = new rg8(cau0.a, new ok8("", false, new w031(syh0.finsdk_wrong_card_number)), new fso("", l76.D, false, new w031(syh0.finsdk_wrong_expiration_date)), new lof("", false, new w031(syh0.finsdk_wrong_cvv)), 0, syh0.finsdk_cvv);
        } else {
            rg8Var2 = rg8Var;
        }
        r0 c = bvf0.c(rg8Var2);
        this.i = c;
        this.j = c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        boolean z;
        r0 r0Var;
        Object value;
        rg8 rg8Var;
        ok8 ok8Var;
        l9s l9sVar;
        int i;
        int i2;
        int i3;
        this.h.a(new kir("card_data_form-input", g8e.z("type", "card_number")));
        nz21 nz21Var = this.d;
        if (nz21Var.a(str)) {
            nz21Var.c.getClass();
            String obj = gvu0.z0(cvu0.v(str, " ", "", false)).toString();
            ArrayList arrayList = new ArrayList(obj.length());
            for (int i4 = 0; i4 < obj.length(); i4++) {
                arrayList.add(Integer.valueOf(Character.getNumericValue(obj.charAt(i4))));
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                int intValue = ((Number) next).intValue();
                if (i5 % 2 != 0) {
                    intValue = intValue < 5 ? intValue * 2 : (intValue * 2) - 9;
                }
                arrayList2.add(Integer.valueOf(intValue));
                i5 = i6;
            }
            if (a.z0(arrayList2) % 10 == 0) {
                z = true;
                do {
                    r0Var = this.i;
                    value = r0Var.getValue();
                    rg8Var = (rg8) value;
                    ok8Var = new ok8(str, nz21Var.a(str), !z ? y031.a : new w031(syh0.finsdk_wrong_card_number));
                    l9sVar = this.e;
                    CardNetwork cardNetwork = ((kk8) l9sVar.c).a(str).a;
                    boolean z2 = l9sVar.b;
                    if (l9sVar.a) {
                        switch (dv50.a[cardNetwork.ordinal()]) {
                            case 1:
                                i = axg0.finsdk_ic_card_network_amex_dark;
                                i2 = i;
                                break;
                            case 2:
                                i = axg0.finsdk_ic_card_network_discover_dark;
                                i2 = i;
                                break;
                            case 3:
                                i = axg0.finsdk_ic_card_network_jcb_dark;
                                i2 = i;
                                break;
                            case 4:
                                i = axg0.finsdk_ic_card_network_mastercard_dark;
                                i2 = i;
                                break;
                            case 5:
                                i = axg0.finsdk_ic_card_network_visa_dark;
                                i2 = i;
                                break;
                            case 6:
                                if (!z2) {
                                    i = axg0.finsdk_ic_card_network_mir_dark;
                                    i2 = i;
                                    break;
                                }
                                i2 = 0;
                                break;
                            case 7:
                                i = axg0.finsdk_ic_card_network_unionpay_dark;
                                i2 = i;
                                break;
                            case 8:
                                i = axg0.finsdk_ic_card_network_uzcard_dark;
                                i2 = i;
                                break;
                            case 9:
                                i = axg0.finsdk_ic_card_network_maestro_dark;
                                i2 = i;
                                break;
                            case 10:
                                i = axg0.finsdk_ic_card_network_visa_electron_dark;
                                i2 = i;
                                break;
                            case 11:
                                i = axg0.finsdk_ic_card_network_humocard_dark;
                                i2 = i;
                                break;
                            case 12:
                                break;
                            default:
                                w511.b();
                                return;
                        }
                    } else {
                        switch (dv50.a[cardNetwork.ordinal()]) {
                            case 1:
                                i = axg0.finsdk_ic_card_network_amex;
                                i2 = i;
                                break;
                            case 2:
                                i = axg0.finsdk_ic_card_network_discover;
                                i2 = i;
                                break;
                            case 3:
                                i = axg0.finsdk_ic_card_network_jcb;
                                i2 = i;
                                break;
                            case 4:
                                i = axg0.finsdk_ic_card_network_mastercard;
                                i2 = i;
                                break;
                            case 5:
                                i = axg0.finsdk_ic_card_network_visa;
                                i2 = i;
                                break;
                            case 6:
                                if (!z2) {
                                    i = axg0.finsdk_ic_card_network_mir;
                                    i2 = i;
                                    break;
                                }
                                i2 = 0;
                                break;
                            case 7:
                                i = axg0.finsdk_ic_card_network_unionpay;
                                i2 = i;
                                break;
                            case 8:
                                i = axg0.finsdk_ic_card_network_uzcard;
                                i2 = i;
                                break;
                            case 9:
                                i = axg0.finsdk_ic_card_network_maestro;
                                i2 = i;
                                break;
                            case 10:
                                i = axg0.finsdk_ic_card_network_visa_electron;
                                i2 = i;
                                break;
                            case 11:
                                i = axg0.finsdk_ic_card_network_humocard;
                                i2 = i;
                                break;
                            case 12:
                                i2 = 0;
                                break;
                            default:
                                w511.b();
                                return;
                        }
                    }
                    i3 = w6q0.a[this.f.a.a(str).a.ordinal()];
                } while (!r0Var.k(value, rg8.a(rg8Var, null, ok8Var, null, null, i2, i3 == 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? syh0.finsdk_cvv : syh0.finsdk_cvv : syh0.finsdk_cvn : syh0.finsdk_cvc : syh0.finsdk_cvp, 13)));
            }
        }
        z = false;
        do {
            r0Var = this.i;
            value = r0Var.getValue();
            rg8Var = (rg8) value;
            ok8Var = new ok8(str, nz21Var.a(str), !z ? y031.a : new w031(syh0.finsdk_wrong_card_number));
            l9sVar = this.e;
            CardNetwork cardNetwork2 = ((kk8) l9sVar.c).a(str).a;
            boolean z22 = l9sVar.b;
            if (l9sVar.a) {
            }
            i3 = w6q0.a[this.f.a.a(str).a.ordinal()];
        } while (!r0Var.k(value, rg8.a(rg8Var, null, ok8Var, null, null, i2, i3 == 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? syh0.finsdk_cvv : syh0.finsdk_cvv : syh0.finsdk_cvn : syh0.finsdk_cvc : syh0.finsdk_cvp, 13)));
    }

    public final void b() {
        r0 r0Var;
        Object value;
        this.h.a(new kir("text_field_focus_changed", g8e.z("type", "card_number")));
        do {
            r0Var = this.i;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rg8.a((rg8) value, cau0.a, null, null, null, 0, 0, 62)));
    }

    public final void c() {
        r0 r0Var;
        Object value;
        this.h.a(new kir("text_field_focus_changed", g8e.z("type", "cvn")));
        do {
            r0Var = this.i;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rg8.a((rg8) value, y9u0.a, null, null, null, 0, 0, 62)));
    }

    public final void d() {
        r0 r0Var;
        Object value;
        this.h.a(new kir("text_field_focus_changed", g8e.z("type", "expiration_date")));
        do {
            r0Var = this.i;
            value = r0Var.getValue();
        } while (!r0Var.k(value, rg8.a((rg8) value, aau0.a, null, null, null, 0, 0, 62)));
    }
}
