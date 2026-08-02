package defpackage;

import androidx.compose.ui.semantics.f;
import com.yandex.go.payments.mbank.navigation.d;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardCvvValidationResult;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardNumberValidationResult;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final /* synthetic */ class h0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ h0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 1:
                return Boolean.valueOf(!jl40.l(((b580) obj).a, str));
            case 2:
                kf0 kf0Var = (kf0) obj;
                switch (kf0Var.a) {
                    case 0:
                        ycq0 ycq0Var = (ycq0) ((d) kf0Var.b).F.get();
                        kv90 kv90Var = lv90.Companion;
                        PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.MBANK_ACCOUNT;
                        kv90Var.getClass();
                        ycq0Var.b(kv90.b(str, paymentMethod$Type));
                        return zy11Var;
                    default:
                        ((com.yandex.go.payments.paymentlist.navigation.f) kf0Var.b).k0.c(str, PaymentMethod$Type.MBANK_ACCOUNT);
                        return zy11Var;
                }
            case 3:
                ((kg0) obj).O(str);
                return zy11Var;
            case 4:
                mnq0 mnq0Var = (mnq0) obj;
                f.l(mnq0Var, str);
                f.p(mnq0Var, 0);
                return zy11Var;
            case 5:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, str);
                f.p(mnq0Var2, 0);
                return zy11Var;
            case 6:
                ((r71) obj).o(str);
                return zy11Var;
            case 7:
                gp70 gp70Var = (gp70) obj;
                ru.yandex.taxi.order.f fVar = gp70Var.a;
                o2y0 o2y0Var = gp70Var.b;
                fVar.o0(o2y0Var);
                o2y0Var.b().b.j(null);
                fVar.c0(o2y0Var);
                fVar.t0();
                fVar.j0(str);
                return zy11Var;
            case 8:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.l(mnq0Var3, str);
                f.p(mnq0Var3, 5);
                return zy11Var;
            case 9:
                j04 j04Var = (j04) obj;
                List list = j04Var.e;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str2 = (String) obj2;
                    Integer num = j04Var.k;
                    if (num != null && i2 == num.intValue()) {
                        str2 = str == null ? "" : str;
                    }
                    arrayList.add(str2);
                    i2 = i3;
                }
                return j04.a(j04Var, null, false, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, 262127);
            case 10:
                j04 j04Var2 = (j04) obj;
                List list2 = j04Var2.d;
                ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                for (Object obj3 : list2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str3 = (String) obj3;
                    Integer num2 = j04Var2.k;
                    if (num2 != null && i2 == num2.intValue()) {
                        str3 = str == null ? "" : str;
                    }
                    arrayList2.add(str3);
                    i2 = i4;
                }
                return j04.a(j04Var2, null, false, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, 262135);
            case 11:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 12:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 13:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 14:
                ((abe0) obj).b0(str);
                return zy11Var;
            case 15:
                mnq0 mnq0Var4 = (mnq0) obj;
                f.n(mnq0Var4, 1);
                f.o(mnq0Var4, str);
                return zy11Var;
            case 16:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 17:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 18:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 19:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 20:
                return new sb8(str, ((cib) obj).d);
            case 21:
                return new sb8(str, null);
            case 22:
                ull0 T0 = ((oll0) obj).T0("SELECT version FROM bucket_version WHERE bucket_name = ?");
                try {
                    T0.g1(1, str);
                    long j = T0.q() ? T0.getLong(0) : 0L;
                    T0.close();
                    return Long.valueOf(j);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            case 23:
                mnq0 mnq0Var5 = (mnq0) obj;
                f.l(mnq0Var5, str);
                f.p(mnq0Var5, 0);
                f.a(mnq0Var5);
                return zy11Var;
            case 24:
                ((ny7) obj).a.invoke(str);
                return zy11Var;
            case 25:
                s98 s98Var = (s98) obj;
                int i5 = ga8.a[s98Var.c.ordinal()];
                String str4 = this.b;
                if (i5 == 1) {
                    return s98.a(s98Var, str4, null, null, null, null, CardCvvValidationResult.VALID, null, null, null, null, null, null, null, null, null, 32734);
                }
                if (i5 == 2) {
                    return s98.a(s98Var, null, str4, null, null, null, null, CardNumberValidationResult.VALID, null, null, null, null, null, null, null, null, 32701);
                }
                w511.b();
                return null;
            case 26:
                mo11 mo11Var = (mo11) obj;
                mo11Var.getClass();
                mo11Var.b.r(new jl01(29, new qxx0(str, w2d0.f, null)));
                return zy11Var;
            case 27:
                ((t4a) obj).a.r(new h0(str, 28));
                return zy11Var;
            case 28:
                ((lda) obj).a.S(str);
                return zy11Var;
            default:
                ((lda) obj).a.S(str);
                return zy11Var;
        }
    }
}
