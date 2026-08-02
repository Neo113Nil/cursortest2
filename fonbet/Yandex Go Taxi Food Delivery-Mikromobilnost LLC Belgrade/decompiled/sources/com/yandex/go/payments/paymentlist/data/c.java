package com.yandex.go.payments.paymentlist.data;

import android.os.SystemClock;
import android.util.LruCache;
import com.yandex.go.payments.data.PaymentMethodsApi;
import com.yandex.go.payments.data.model.PaymentMethodsParams;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.CashLikeAccount;
import com.yandex.go.payments.data.model.response.ComplementWallet;
import com.yandex.go.payments.data.model.response.CorpAccount;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.JazzcashWallet;
import com.yandex.go.payments.data.model.response.Kaspi;
import com.yandex.go.payments.data.model.response.MBankAccount;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.PersonalAccount;
import com.yandex.go.payments.data.model.response.SbpBindToken;
import com.yandex.go.payments.data.model.response.SbpToken;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.data.model.response.r0;
import com.yandex.go.payments.data.model.response.y1;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.yb.domain.o;
import com.yandex.go.zone.model.Zone;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cda0;
import defpackage.cj20;
import defpackage.cmt;
import defpackage.d60;
import defpackage.dda0;
import defpackage.dvx;
import defpackage.e4a0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.fga0;
import defpackage.gci0;
import defpackage.gda0;
import defpackage.gl3;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.jl40;
import defpackage.kjz;
import defpackage.lv90;
import defpackage.lz90;
import defpackage.mdh;
import defpackage.nrd;
import defpackage.ny61;
import defpackage.qaa0;
import defpackage.qmp;
import defpackage.raa0;
import defpackage.rfa0;
import defpackage.sfa0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.vda0;
import defpackage.w511;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class c implements cda0 {
    public final m a;
    public final raa0 b;
    public final ru.yandex.taxi.launch.c c;
    public final h3y d;
    public final h3y e;
    public final qmp f;
    public final fga0 g;
    public final hit h;
    public final d60 i;
    public final h3y j;
    public final h3y k;
    public final h3y l;
    public final h3y m;
    public final com.yandex.go.lifecycle.a n;
    public final lz90 o;
    public final gda0 p;
    public final h3y q;
    public final com.yandex.go.payments.paymentlist.domain.preselect.a r;
    public final LruCache s = new LruCache(4);
    public final n0 t = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
    public final b u;

    public c(m mVar, raa0 raa0Var, ru.yandex.taxi.launch.c cVar, h3y h3yVar, h3y h3yVar2, qmp qmpVar, fga0 fga0Var, hit hitVar, d60 d60Var, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, com.yandex.go.lifecycle.a aVar, lz90 lz90Var, gda0 gda0Var, h3y h3yVar7, com.yandex.go.payments.paymentlist.domain.preselect.a aVar2) {
        this.a = mVar;
        this.b = raa0Var;
        this.c = cVar;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.f = qmpVar;
        this.g = fga0Var;
        this.h = hitVar;
        this.i = d60Var;
        this.j = h3yVar3;
        this.k = h3yVar4;
        this.l = h3yVar5;
        this.m = h3yVar6;
        this.n = aVar;
        this.o = lz90Var;
        this.p = gda0Var;
        this.q = h3yVar7;
        this.r = aVar2;
        this.u = new b(e.I(fga0Var.z(), new PaymentMethodsRepositoryImpl$paymentMethodsFlow$1(2, null)), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x005e, code lost:
    
        if (r11.b(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, qaa0 qaa0Var, dvx dvxVar, ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$requestPaymentMethods$1 paymentMethodsRepositoryImpl$requestPaymentMethods$1;
        Object obj;
        Object obj2;
        int i;
        qaa0 qaa0Var2;
        long j;
        PaymentMethods paymentMethods;
        String str;
        PaymentMethods.LocationInfo locationInfo;
        cj20 cj20Var;
        String str2;
        String str3;
        String str4;
        cVar.getClass();
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$requestPaymentMethods$1) {
            paymentMethodsRepositoryImpl$requestPaymentMethods$1 = (PaymentMethodsRepositoryImpl$requestPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$requestPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                obj = paymentMethodsRepositoryImpl$requestPaymentMethods$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$requestPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.lifecycle.a aVar = cVar.n;
                    paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$0 = qaa0Var;
                    paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$1 = dvxVar;
                    paymentMethodsRepositoryImpl$requestPaymentMethods$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = paymentMethodsRepositoryImpl$requestPaymentMethods$1.J$0;
                        qaa0Var2 = (qaa0) paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$0;
                        kotlin.b.b(obj);
                        paymentMethods = (PaymentMethods) obj;
                        str = paymentMethods.i;
                        locationInfo = paymentMethods.o;
                        if (str == null && !evu0.J(str)) {
                            ny61.r(paymentMethods.i);
                            return null;
                        }
                        cj20Var = (cj20) cVar.m.get();
                        cj20Var.getClass();
                        if (qaa0Var2 != null && (str2 = qaa0Var2.c) != null && !evu0.J(str2) && (locationInfo == null || (str3 = locationInfo.b) == null || evu0.J(str3) || (str4 = locationInfo.a) == null || evu0.J(str4) || locationInfo.c == null)) {
                            if (str2 == null) {
                                zzs zzsVar = qaa0Var2.b;
                                str2 = zzsVar != null ? zzsVar.b() : "empty";
                            }
                            i d = ((j) cj20Var.b).d("PaymentMethods.Response.MissingParams");
                            d.g("has_location", locationInfo == null);
                            String str5 = locationInfo == null ? locationInfo.a : null;
                            d.g("has_country_code", !(str5 != null || evu0.J(str5)));
                            String str6 = locationInfo == null ? locationInfo.b : null;
                            d.g("has_currency", !(str6 != null || evu0.J(str6)));
                            d.g("has_region_id", (locationInfo != null ? locationInfo.c : null) != null);
                            d.d("geo", str2);
                            d.m();
                        }
                        ((ul51) cVar.f).getClass();
                        return new vda0(paymentMethods, j);
                    }
                    dvxVar = (dvx) paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$1;
                    qaa0Var = (qaa0) paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                zzs zzsVar2 = qaa0Var == null ? qaa0Var.b : null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$0 = qaa0Var;
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$1 = null;
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$2 = null;
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.J$0 = elapsedRealtime;
                paymentMethodsRepositoryImpl$requestPaymentMethods$1.label = 2;
                obj = cVar.g(dvxVar, zzsVar2, paymentMethodsRepositoryImpl$requestPaymentMethods$1);
                if (obj != obj2) {
                    qaa0Var2 = qaa0Var;
                    j = elapsedRealtime;
                    paymentMethods = (PaymentMethods) obj;
                    str = paymentMethods.i;
                    locationInfo = paymentMethods.o;
                    if (str == null) {
                    }
                    cj20Var = (cj20) cVar.m.get();
                    cj20Var.getClass();
                    if (qaa0Var2 != null) {
                        if (str2 == null) {
                        }
                        i d2 = ((j) cj20Var.b).d("PaymentMethods.Response.MissingParams");
                        d2.g("has_location", locationInfo == null);
                        if (locationInfo == null) {
                        }
                        d2.g("has_country_code", !(str5 != null || evu0.J(str5)));
                        if (locationInfo == null) {
                        }
                        d2.g("has_currency", !(str6 != null || evu0.J(str6)));
                        d2.g("has_region_id", (locationInfo != null ? locationInfo.c : null) != null);
                        d2.d("geo", str2);
                        d2.m();
                    }
                    ((ul51) cVar.f).getClass();
                    return new vda0(paymentMethods, j);
                }
                return obj2;
            }
        }
        paymentMethodsRepositoryImpl$requestPaymentMethods$1 = new PaymentMethodsRepositoryImpl$requestPaymentMethods$1(cVar, continuationImpl);
        obj = paymentMethodsRepositoryImpl$requestPaymentMethods$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$requestPaymentMethods$1.label;
        if (i != 0) {
        }
        if (qaa0Var == null) {
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$0 = qaa0Var;
        paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$1 = null;
        paymentMethodsRepositoryImpl$requestPaymentMethods$1.L$2 = null;
        paymentMethodsRepositoryImpl$requestPaymentMethods$1.J$0 = elapsedRealtime2;
        paymentMethodsRepositoryImpl$requestPaymentMethods$1.label = 2;
        obj = cVar.g(dvxVar, zzsVar2, paymentMethodsRepositoryImpl$requestPaymentMethods$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    public static final vda0 b(c cVar, qaa0 qaa0Var, String str) {
        String str2;
        cVar.getClass();
        if (qaa0Var == null || (str2 = qaa0Var.c) == null) {
            return null;
        }
        PaymentMethods paymentMethods = (PaymentMethods) cVar.s.get(b64.j(str2, str));
        if (paymentMethods == null) {
            return null;
        }
        return new vda0(paymentMethods, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x044d, code lost:
    
        if (r7 != com.yandex.go.payments.data.model.response.Card.VerifyStrategy.UNKNOWN) goto L278;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, String str, String str2, vda0 vda0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1 paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1;
        int i;
        String str3;
        String str4;
        PaymentMethod$Type a;
        vda0 vda0Var2 = vda0Var;
        fga0 fga0Var = cVar.g;
        fga0 fga0Var2 = cVar.g;
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1) {
            paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1 = (PaymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fga0Var.b.l(vda0Var2);
                    PaymentMethods paymentMethods = vda0Var2.a;
                    if (!((g) cVar.q.get()).e() || (a = fga0Var.c().a()) == null || a == PaymentMethod$Type.CASH) {
                        e4a0 a2 = fga0Var.a().a();
                        if (!a2.equals(e4a0.S3) && !a2.equals(e4a0.R3)) {
                            if ((a2 == PaymentMethod$Type.CASH || a2 == PaymentMethod$Type.GOOGLE_PAY) && a2 == PaymentMethod$Type.GOOGLE_PAY && paymentMethods.n == null) {
                                fga0Var2.A();
                                fga0Var2.a.w(fga0Var2.v);
                            } else {
                                String q = fga0Var.q(fga0Var.c());
                                if (q != null) {
                                    PaymentMethod$Type a3 = a2.a();
                                    boolean z = false;
                                    switch (a3 == null ? -1 : dda0.a[a3.ordinal()]) {
                                        case -1:
                                        case 22:
                                        case 23:
                                            if (!z) {
                                                fga0Var2.A();
                                                fga0Var2.a.w(fga0Var2.v);
                                                break;
                                            }
                                            break;
                                        case 0:
                                        default:
                                            w511.b();
                                            break;
                                        case 1:
                                        case 2:
                                            z = true;
                                            if (!z) {
                                            }
                                            break;
                                        case 3:
                                            MBankAccount mBankAccount = paymentMethods.r.a;
                                            if (jl40.l(mBankAccount != null ? mBankAccount.a : null, q)) {
                                                MBankAccount mBankAccount2 = paymentMethods.r.a;
                                                Card.VerifyStrategy verifyStrategy = mBankAccount2 != null ? mBankAccount2.e : null;
                                                if (verifyStrategy != null) {
                                                    break;
                                                }
                                                z = true;
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 4:
                                            List list = paymentMethods.a.a;
                                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (jl40.l(((Card) it.next()).k(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 5:
                                            List list2 = paymentMethods.q.a;
                                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                                Iterator it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                    if (jl40.l(((SbpToken) it2.next()).e(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 6:
                                            List<r0> list3 = paymentMethods.t;
                                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                                for (r0 r0Var : list3) {
                                                    if (q.equals(r0Var.getA())) {
                                                        YapeToken yapeToken = r0Var instanceof YapeToken ? (YapeToken) r0Var : null;
                                                        Card.VerifyStrategy e = yapeToken != null ? yapeToken.getE() : null;
                                                        if (e != null && e != Card.VerifyStrategy.UNKNOWN) {
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 7:
                                            List<r0> list4 = paymentMethods.t;
                                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                                for (r0 r0Var2 : list4) {
                                                    if (q.equals(r0Var2.getA())) {
                                                        NequiToken nequiToken = r0Var2 instanceof NequiToken ? (NequiToken) r0Var2 : null;
                                                        Card.VerifyStrategy e2 = nequiToken != null ? nequiToken.getE() : null;
                                                        if (e2 != null && e2 != Card.VerifyStrategy.UNKNOWN) {
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 8:
                                            List<r0> list5 = paymentMethods.t;
                                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                for (r0 r0Var3 : list5) {
                                                    if (q.equals(r0Var3.getA())) {
                                                        FastshiftAccount fastshiftAccount = r0Var3 instanceof FastshiftAccount ? (FastshiftAccount) r0Var3 : null;
                                                        Card.VerifyStrategy e3 = fastshiftAccount != null ? fastshiftAccount.getE() : null;
                                                        if (e3 != null && e3 != Card.VerifyStrategy.UNKNOWN) {
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 9:
                                            List<r0> list6 = paymentMethods.t;
                                            if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                                for (r0 r0Var4 : list6) {
                                                    if (q.equals(r0Var4.getA())) {
                                                        JazzcashWallet jazzcashWallet = r0Var4 instanceof JazzcashWallet ? (JazzcashWallet) r0Var4 : null;
                                                        Card.VerifyStrategy e4 = jazzcashWallet != null ? jazzcashWallet.getE() : null;
                                                        if (e4 != null && e4 != Card.VerifyStrategy.UNKNOWN) {
                                                        }
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 10:
                                            ArrayList e5 = paymentMethods.e();
                                            if (!e5.isEmpty()) {
                                                Iterator it3 = e5.iterator();
                                                while (it3.hasNext()) {
                                                    if (q.equals(((SbpBindToken) it3.next()).getA())) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 11:
                                            ArrayList b = paymentMethods.b();
                                            if (!b.isEmpty()) {
                                                Iterator it4 = b.iterator();
                                                while (it4.hasNext()) {
                                                    if (jl40.l(((Kaspi) it4.next()).getA(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 12:
                                        case 13:
                                            z = jl40.l(fga0Var.q(a2), q);
                                            if (!z) {
                                            }
                                            break;
                                        case 14:
                                            List list7 = paymentMethods.c.a;
                                            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                                Iterator it5 = list7.iterator();
                                                while (it5.hasNext()) {
                                                    if (jl40.l(((CorpAccount) it5.next()).h(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 15:
                                            List list8 = paymentMethods.d.a;
                                            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                                                Iterator it6 = list8.iterator();
                                                while (it6.hasNext()) {
                                                    if (jl40.l(((DeliveryPaymentMethod) it6.next()).a, q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 16:
                                            List list9 = paymentMethods.e.a;
                                            if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                                Iterator it7 = list9.iterator();
                                                while (it7.hasNext()) {
                                                    if (jl40.l(((PersonalAccount) it7.next()).a, q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 17:
                                            List list10 = paymentMethods.g.a;
                                            if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                                Iterator it8 = list10.iterator();
                                                while (it8.hasNext()) {
                                                    if (jl40.l(((YbWallet) it8.next()).e(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 18:
                                            List list11 = paymentMethods.f.b;
                                            if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                                                Iterator it9 = list11.iterator();
                                                while (it9.hasNext()) {
                                                    if (jl40.l(((SharedAccount) it9.next()).i(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 19:
                                            List list12 = paymentMethods.h.a;
                                            if (!(list12 instanceof Collection) || !list12.isEmpty()) {
                                                Iterator it10 = list12.iterator();
                                                while (it10.hasNext()) {
                                                    if (jl40.l(((y1) it10.next()).c(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 20:
                                            List list13 = paymentMethods.b.a;
                                            if (!(list13 instanceof Collection) || !list13.isEmpty()) {
                                                Iterator it11 = list13.iterator();
                                                while (it11.hasNext()) {
                                                    if (jl40.l(((CashLikeAccount) it11.next()).c(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                        case 21:
                                            List<ComplementWallet> list14 = paymentMethods.s.a;
                                            if (!(list14 instanceof Collection) || !list14.isEmpty()) {
                                                for (ComplementWallet complementWallet : list14) {
                                                    if (complementWallet.getB() == PaymentMethod$Type.BIRBONUS_WALLET && jl40.l(complementWallet.f(), q)) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                            }
                                            break;
                                    }
                                    return null;
                                }
                            }
                        }
                        com.yandex.go.payments.paymentlist.domain.preselect.a aVar = cVar.r;
                        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$0 = str;
                        str3 = str2;
                        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$1 = str3;
                        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$2 = vda0Var2;
                        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$3 = null;
                        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.label = 1;
                        if (aVar.a(paymentMethods, paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str4 = str;
                    } else {
                        str4 = str;
                        str3 = str2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vda0Var2 = (vda0) paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$2;
                    String str5 = (String) paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$1;
                    str4 = (String) paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                    str3 = str5;
                }
                if (str4 != null) {
                    cVar.s.put(b64.j(str4, str3), vda0Var2.a);
                }
                if ((cVar.a.a() instanceof gl3) && fga0Var.c().getId() != -1) {
                    fga0Var.A();
                }
                return zy11.a;
            }
        }
        paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1 = new PaymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1(cVar, continuationImpl);
        Object obj2 = paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$updateCurrentPaymentMethods$1.label;
        if (i != 0) {
        }
        if (str4 != null) {
        }
        if (cVar.a.a() instanceof gl3) {
            fga0Var.A();
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j, ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1 paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1) {
            paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1 = (PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gci0 z = this.g.z();
                    PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2 paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2 = new PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2(j, null);
                    paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.J$0 = j;
                    paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.label = 1;
                    obj = e.x(z, paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$2, paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((vda0) obj).a;
            }
        }
        paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1 = new PaymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1(this, continuationImpl);
        Object obj2 = paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$awaitUpdatedPaymentMethods$1.label;
        if (i != 0) {
        }
        return ((vda0) obj2).a;
    }

    public final void e() {
        kjz kjzVar = this.g.b;
        kjzVar.l(new vda0(kjzVar.g(), SystemClock.elapsedRealtime()));
    }

    public final rfa0 f(Zone zone) {
        fga0 fga0Var = this.g;
        lv90 a = fga0Var.a();
        if (zone != null && !bb1.N(zone, a.a())) {
            a = lv90.f;
        }
        PaymentMethod$Type paymentMethod$Type = a.a;
        boolean b = ((nrd) this.j.get()).b();
        h3y h3yVar = this.k;
        if (b) {
            List list = fga0Var.b.g().e.a;
            PersonalAccount personalAccount = list.isEmpty() ? PersonalAccount.l : (PersonalAccount) list.get(0);
            if (paymentMethod$Type != null && !personalAccount.equals(PersonalAccount.l)) {
                return sfa0.c((sfa0) h3yVar.get(), paymentMethod$Type, a.b, PaymentMethod$Type.PERSONAL_WALLET, personalAccount.a, 16);
            }
        }
        return sfa0.c((sfa0) h3yVar.get(), paymentMethod$Type, a.b, null, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(dvx dvxVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$1 paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1;
        int i;
        c cVar;
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$1) {
            paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1 = (PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<PaymentMethods> b = ((PaymentMethodsApi) this.d.get()).b(new PaymentMethodsParams(4, zzsVar, dvxVar.a));
                    cVar = this;
                    PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$2 paymentMethodsRepositoryImpl$getPaymentMethodsInternal$2 = new PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$2(1, cVar, c.class, "handlePaymentError", "handlePaymentError(Ljava/lang/Throwable;)V", 0);
                    paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.L$0 = null;
                    paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.L$1 = null;
                    paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.L$2 = null;
                    paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.L$3 = null;
                    paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(b, paymentMethodsRepositoryImpl$getPaymentMethodsInternal$2, paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    cVar = this;
                }
                ((o) cVar.e.get()).b();
                return obj;
            }
        }
        paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1 = new PaymentMethodsRepositoryImpl$getPaymentMethodsInternal$1(this, continuationImpl);
        Object obj2 = paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$getPaymentMethodsInternal$1.label;
        if (i != 0) {
        }
        ((o) cVar.e.get()).b();
        return obj2;
    }

    public final ListBuilder h() {
        return this.p.a(this.g.b.g(), true);
    }

    public final void i() {
        this.t.g(zy11.a);
        fga0 fga0Var = this.g;
        fga0Var.b.j(null);
        fga0Var.C.g(fga0Var.c());
        kotlinx.coroutines.flow.r0 r0Var = fga0Var.D;
        Boolean valueOf = Boolean.valueOf(fga0Var.a.g(fga0Var.w, false));
        r0Var.getClass();
        r0Var.m(null, valueOf);
        hbp0 hbp0Var = this.h.a;
        this.i.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PaymentMethodsRepositoryImpl$init$1(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1 paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1) {
            paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1 = (PaymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.label = 1;
                    this.s.evictAll();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.t.g(zy11.a);
                    obj = d(elapsedRealtime, paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((PaymentMethods) obj).q.c != null);
            }
        }
        paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1 = new PaymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1(this, continuationImpl);
        Object obj3 = paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$isAddSbpTokenAvailable$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((PaymentMethods) obj3).q.c != null);
    }

    public final Object k(String str, Continuation continuation) {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodsRepositoryImpl$removeCard$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object l(String str, Continuation continuation) {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodsRepositoryImpl$removeMBankAccount$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object m(String str, Continuation continuation) {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodsRepositoryImpl$removeNequiToken$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object n(String str, Continuation continuation) {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodsRepositoryImpl$removeSbpToken$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object o(String str, Continuation continuation) {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new PaymentMethodsRepositoryImpl$removeYapeToken$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final void p() {
        this.s.evictAll();
        this.t.g(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ContinuationImpl continuationImpl) {
        PaymentMethodsRepositoryImpl$updatePaymentMethods$1 paymentMethodsRepositoryImpl$updatePaymentMethods$1;
        int i;
        if (continuationImpl instanceof PaymentMethodsRepositoryImpl$updatePaymentMethods$1) {
            paymentMethodsRepositoryImpl$updatePaymentMethods$1 = (PaymentMethodsRepositoryImpl$updatePaymentMethods$1) continuationImpl;
            int i2 = paymentMethodsRepositoryImpl$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsRepositoryImpl$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsRepositoryImpl$updatePaymentMethods$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsRepositoryImpl$updatePaymentMethods$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsRepositoryImpl$updatePaymentMethods$1.label = 1;
                    this.s.evictAll();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.t.g(zy11Var);
                    if (d(elapsedRealtime, paymentMethodsRepositoryImpl$updatePaymentMethods$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11Var;
            }
        }
        paymentMethodsRepositoryImpl$updatePaymentMethods$1 = new PaymentMethodsRepositoryImpl$updatePaymentMethods$1(this, continuationImpl);
        Object obj3 = paymentMethodsRepositoryImpl$updatePaymentMethods$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsRepositoryImpl$updatePaymentMethods$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        return zy11Var2;
    }
}
