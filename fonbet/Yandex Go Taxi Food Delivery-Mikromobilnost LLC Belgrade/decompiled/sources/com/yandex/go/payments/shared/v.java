package com.yandex.go.payments.shared;

import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.AccountDetails;
import com.yandex.go.payments.shared.data.model.AddMemberRequest;
import com.yandex.go.payments.shared.data.model.CreateAccountRequest;
import com.yandex.go.payments.shared.data.model.MemberDetails;
import com.yandex.go.payments.shared.data.model.SaveMemberDetails;
import com.yandex.go.payments.shared.data.model.SaveReportSettingsRequest;
import com.yandex.go.payments.shared.data.model.SetCommonLimitRequest;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import com.yandex.go.zone.model.Zone;
import defpackage.as6;
import defpackage.cda0;
import defpackage.cpr0;
import defpackage.e4a0;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.fl8;
import defpackage.g8e;
import defpackage.im51;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jz21;
import defpackage.kh10;
import defpackage.kj;
import defpackage.lh10;
import defpackage.lx4;
import defpackage.lz90;
import defpackage.ma1;
import defpackage.mdh;
import defpackage.n20;
import defpackage.na1;
import defpackage.nbr0;
import defpackage.ny61;
import defpackage.o3f;
import defpackage.ods0;
import defpackage.oyr;
import defpackage.qqy;
import defpackage.r991;
import defpackage.rfa0;
import defpackage.sjh;
import defpackage.snr0;
import defpackage.tje;
import defpackage.tmr0;
import defpackage.tt2;
import defpackage.uh6;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.vnr0;
import defpackage.wnr0;
import defpackage.xby;
import defpackage.yqg;
import defpackage.znr0;
import defpackage.zqg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.exception.ValidationException;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class v {
    public final ru.yandex.taxi.am.g a;
    public final fga0 b;
    public final cda0 c;
    public final x d;
    public final lh10 e;
    public final vnr0 f;
    public final n20 g;
    public final ods0 h;
    public final b i;
    public final im51 j;
    public final ru.yandex.taxi.settings.email.a k;
    public final wnr0 l;
    public final com.yandex.go.payments.shared.business.c m;
    public final znr0 n;
    public final cpr0 o;
    public final tt2 p;
    public final lz90 q;

    public v(ru.yandex.taxi.am.g gVar, fga0 fga0Var, cda0 cda0Var, x xVar, lh10 lh10Var, vnr0 vnr0Var, n20 n20Var, ods0 ods0Var, b bVar, im51 im51Var, ru.yandex.taxi.settings.email.a aVar, wnr0 wnr0Var, com.yandex.go.payments.shared.business.c cVar, znr0 znr0Var, cpr0 cpr0Var, tt2 tt2Var, lz90 lz90Var) {
        this.a = gVar;
        this.b = fga0Var;
        this.c = cda0Var;
        this.d = xVar;
        this.e = lh10Var;
        this.f = vnr0Var;
        this.g = n20Var;
        this.h = ods0Var;
        this.i = bVar;
        this.j = im51Var;
        this.k = aVar;
        this.l = wnr0Var;
        this.m = cVar;
        this.n = znr0Var;
        this.o = cpr0Var;
        this.p = tt2Var;
        this.q = lz90Var;
    }

    public final Object a(String str, String str2, String str3, Continuation continuation) {
        x xVar = this.d;
        xVar.getClass();
        String j = new Regex("\\D+").j(str3, "");
        xVar.c.getClass();
        String uuid = UUID.randomUUID().toString();
        AddMemberRequest addMemberRequest = new AddMemberRequest(new MemberDetails(evu0.k0(str2).toString(), j));
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$addMember$2(xVar, str, uuid, addMemberRequest, null), continuation);
    }

    public final boolean b() {
        this.j.getClass();
        if (this.a.a.Mg()) {
            wnr0 wnr0Var = this.l;
            ((ul51) wnr0Var.a).getClass();
            Zone a = wnr0Var.b.a();
            if ((a == null ? false : a.f(SimpleBooleanExperiment.SHARED_PAYMENT_PROTECTION)) && !((com.yandex.go.taxi.order.provider.a) this.g).r()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, nbr0 nbr0Var, ContinuationImpl continuationImpl) {
        SharedPaymentInteractor$changeAccountName$1 sharedPaymentInteractor$changeAccountName$1;
        int i;
        if (continuationImpl instanceof SharedPaymentInteractor$changeAccountName$1) {
            sharedPaymentInteractor$changeAccountName$1 = (SharedPaymentInteractor$changeAccountName$1) continuationImpl;
            int i2 = sharedPaymentInteractor$changeAccountName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$changeAccountName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentInteractor$changeAccountName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$changeAccountName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str2 == null || evu0.J(str2)) {
                        throw r991.a(nbr0Var.c);
                    }
                    sharedPaymentInteractor$changeAccountName$1.L$0 = null;
                    sharedPaymentInteractor$changeAccountName$1.L$1 = null;
                    sharedPaymentInteractor$changeAccountName$1.L$2 = null;
                    sharedPaymentInteractor$changeAccountName$1.L$3 = null;
                    sharedPaymentInteractor$changeAccountName$1.label = 1;
                    x xVar = this.d;
                    xVar.getClass();
                    AccountDetails accountDetails = new AccountDetails(str2, "E5E5E5", 4);
                    xVar.f.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new SharedPaymentRepository$changeAccountName$2(xVar, str, str3, accountDetails, null), sharedPaymentInteractor$changeAccountName$1);
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
                Account account = (Account) obj;
                ((com.yandex.go.payments.paymentlist.data.c) this.c).p();
                return account;
            }
        }
        sharedPaymentInteractor$changeAccountName$1 = new SharedPaymentInteractor$changeAccountName$1(this, continuationImpl);
        Object obj2 = sharedPaymentInteractor$changeAccountName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$changeAccountName$1.label;
        if (i != 0) {
        }
        Account account2 = (Account) obj2;
        ((com.yandex.go.payments.paymentlist.data.c) this.c).p();
        return account2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(o3f o3fVar, ContinuationImpl continuationImpl) {
        SharedPaymentInteractor$createAccount$1 sharedPaymentInteractor$createAccount$1;
        int i;
        String b;
        if (continuationImpl instanceof SharedPaymentInteractor$createAccount$1) {
            sharedPaymentInteractor$createAccount$1 = (SharedPaymentInteractor$createAccount$1) continuationImpl;
            int i2 = sharedPaymentInteractor$createAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$createAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentInteractor$createAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$createAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (o3fVar.b().f) {
                        String a = o3fVar.a();
                        nbr0 nbr0Var = o3fVar.b().r.b;
                        if (a == null || evu0.J(a)) {
                            throw r991.a(nbr0Var.c);
                        }
                    }
                    sharedPaymentInteractor$createAccount$1.L$0 = null;
                    sharedPaymentInteractor$createAccount$1.label = 1;
                    x xVar = this.d;
                    xVar.getClass();
                    AccountDetails accountDetails = new AccountDetails(o3fVar.a(), "E5E5E5", 4);
                    yqg yqgVar = xVar.b;
                    TimeZone timeZone = TimeZone.getDefault();
                    yqgVar.getClass();
                    ThreadLocal threadLocal = zqg.c;
                    CreateAccountRequest createAccountRequest = new CreateAccountRequest(accountDetails, o3fVar.b().a, uh6.t(timeZone), o3fVar.c(), o3fVar.d());
                    xVar.c.getClass();
                    String uuid = UUID.randomUUID().toString();
                    xVar.f.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new SharedPaymentRepository$createAccount$2(xVar, uuid, createAccountRequest, null), sharedPaymentInteractor$createAccount$1);
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
                Account account = (Account) obj;
                b = account.getB();
                vnr0 vnr0Var = this.f;
                ma1 ma1Var = vnr0Var.c;
                lx4 lx4Var = vnr0Var.a;
                if (!jl40.l(b, "family")) {
                    ((na1) ma1Var).getClass();
                    ((ru.yandex.taxi.analytics.j) lx4Var).v(as6.x());
                    return account;
                }
                if (!jl40.l(b, "business")) {
                    jst.e.x(new IllegalArgumentException(g8e.o("unknown type: ", b)), "can't send adjust event");
                    return account;
                }
                ((na1) ma1Var).getClass();
                ((ru.yandex.taxi.analytics.j) lx4Var).v(as6.w());
                return account;
            }
        }
        sharedPaymentInteractor$createAccount$1 = new SharedPaymentInteractor$createAccount$1(this, continuationImpl);
        Object obj2 = sharedPaymentInteractor$createAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$createAccount$1.label;
        if (i != 0) {
        }
        Account account2 = (Account) obj2;
        b = account2.getB();
        vnr0 vnr0Var2 = this.f;
        ma1 ma1Var2 = vnr0Var2.c;
        lx4 lx4Var2 = vnr0Var2.a;
        if (!jl40.l(b, "family")) {
        }
    }

    public final Object e(tmr0 tmr0Var, Continuation continuation) {
        String k;
        String c = this.k.c();
        if (c.length() <= 0) {
            kj Ig = this.a.a.Ig();
            c = Ig != null ? Ig.g : null;
        }
        fga0 fga0Var = this.b;
        e4a0 c2 = fga0Var.c();
        PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.CARD;
        if (c2 == paymentMethod$Type) {
            Card g = fga0Var.g(fga0Var.q(paymentMethod$Type));
            ListBuilder h = ((com.yandex.go.payments.paymentlist.data.c) this.c).h();
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = h.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                }
                Object next = qqyVar.next();
                if (next instanceof fl8) {
                    arrayList.add(next);
                }
            }
            if (g != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (jl40.l(((fl8) it.next()).a, g.k())) {
                        k = g.k();
                        break;
                    }
                }
            }
        }
        k = null;
        return d(new o3f(null, tmr0Var, c, (k == null || k.length() == 0) ? null : new SharedPayment(Collections.singletonList(new rfa0(PaymentMethod$Type.CARD, k, (String) null, (Boolean) null, (List) null, 28)), k)), (ContinuationImpl) continuation);
    }

    public final Object f(String str, String str2, SuspendLambda suspendLambda) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$deleteMember$2(xVar, str2, str, null), suspendLambda);
    }

    public final Object g(String str, ContinuationImpl continuationImpl) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$getAccountDetails$2(xVar, str, null), continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tmr0 h(String str) {
        SharedAccount o = this.b.o(str);
        tmr0 tmr0Var = null;
        if (o != null) {
            Iterator it = this.i.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(o.getB(), ((tmr0) next).a)) {
                    tmr0Var = next;
                    break;
                }
            }
            tmr0Var = tmr0Var;
        }
        return tmr0Var == null ? new tmr0(null, null, null, null, null, false, null, false, null, null, this.o.a(), 131071) : tmr0Var;
    }

    public final Object i(Continuation continuation) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$getCurrencies$2(xVar, null), continuation);
    }

    public final snr0 j(tmr0 tmr0Var) {
        Object obj;
        Iterator it = this.b.b.g().f.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            SharedAccount sharedAccount = (SharedAccount) obj;
            if (!sharedAccount.l() && jl40.l(tmr0Var.a, sharedAccount.getB())) {
                break;
            }
        }
        SharedAccount sharedAccount2 = (SharedAccount) obj;
        if (sharedAccount2 == null || !tmr0Var.h || tmr0Var.i.length() <= 0) {
            return null;
        }
        return this.q.l(sharedAccount2);
    }

    public final boolean k(String str) {
        fga0 fga0Var = this.b;
        SharedAccount w = fga0Var.w();
        return fga0Var.c() == PaymentMethod$Type.SHARED && w != null && jl40.l(w.i(), str);
    }

    public final boolean l() {
        if (b()) {
            fga0 fga0Var = this.b;
            if (!fga0Var.b.g().f.a.isEmpty() && !fga0Var.a.g(fga0Var.y, false)) {
                return true;
            }
        }
        return false;
    }

    public final u m() {
        return new u(kotlinx.coroutines.flow.e.I(this.b.z(), new SharedPaymentInteractor$observeInvitations$1(2, null)), this);
    }

    public final Object n(String str, String str2, String str3, SaveMemberDetails saveMemberDetails, kh10 kh10Var, Continuation continuation) {
        Long a;
        this.e.getClass();
        ArrayList arrayList = new ArrayList();
        String b = saveMemberDetails.b();
        if (b == null || evu0.J(b)) {
            arrayList.add(new jz21("name", kh10Var.c));
        }
        String c = saveMemberDetails.c();
        if (c == null || evu0.J(c)) {
            arrayList.add(new jz21("phone", kh10Var.e));
        }
        if (saveMemberDetails.d() && ((a = saveMemberDetails.a()) == null || a.longValue() <= 0)) {
            arrayList.add(new jz21("limit", kh10Var.i));
        }
        if (!arrayList.isEmpty()) {
            throw new ValidationException(arrayList);
        }
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$saveMemberDetails$2(xVar, str2, str3, saveMemberDetails, str, null), continuation);
    }

    public final Object o(String str, SaveReportSettingsRequest saveReportSettingsRequest, String str2, Continuation continuation) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$saveReportSettings$2(xVar, str, str2, saveReportSettingsRequest, null), continuation);
    }

    public final Object p(String str, Continuation continuation) {
        this.p.getClass();
        Object k0 = tje.k0(uyj.a, new SharedPaymentInteractor$setAccountInvitationRead$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|13|(1:15)|16))|31|6|7|(0)(0)|12|13|(0)|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        r12 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, ContinuationImpl continuationImpl) {
        SharedPaymentInteractor$setAccountInvitationReadRequest$1 sharedPaymentInteractor$setAccountInvitationReadRequest$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof SharedPaymentInteractor$setAccountInvitationReadRequest$1) {
            sharedPaymentInteractor$setAccountInvitationReadRequest$1 = (SharedPaymentInteractor$setAccountInvitationReadRequest$1) continuationImpl;
            int i2 = sharedPaymentInteractor$setAccountInvitationReadRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$setAccountInvitationReadRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentInteractor$setAccountInvitationReadRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$setAccountInvitationReadRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x xVar = this.d;
                    sharedPaymentInteractor$setAccountInvitationReadRequest$1.L$0 = str;
                    sharedPaymentInteractor$setAccountInvitationReadRequest$1.label = 1;
                    if (xVar.e(str, sharedPaymentInteractor$setAccountInvitationReadRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) sharedPaymentInteractor$setAccountInvitationReadRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                Object failure = zy11Var;
                a = Result.a(failure);
                if (a != null) {
                    xby.l(jst.e, "SHARED_PAYMENT:MARK_ACCOUNT_INVITATION:FAILED", null, a, oyr.p("Failed to set account [", str, "] invitation as read"), 2);
                }
                return zy11Var;
            }
        }
        sharedPaymentInteractor$setAccountInvitationReadRequest$1 = new SharedPaymentInteractor$setAccountInvitationReadRequest$1(this, continuationImpl);
        Object obj2 = sharedPaymentInteractor$setAccountInvitationReadRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$setAccountInvitationReadRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Object failure2 = zy11Var2;
        a = Result.a(failure2);
        if (a != null) {
        }
        return zy11Var2;
    }

    public final Object r(String str, String str2, SetCommonLimitRequest setCommonLimitRequest, Continuation continuation) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$setCommonLimit$2(xVar, str, str2, setCommonLimitRequest, null), continuation);
    }

    public final Object s(String str, String str2, Continuation continuation) {
        x xVar = this.d;
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$setCurrency$2(xVar, str, str2, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ContinuationImpl continuationImpl) {
        SharedPaymentInteractor$synchronizeAccountInvitationsReadState$1 sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof SharedPaymentInteractor$synchronizeAccountInvitationsReadState$1) {
            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1 = (SharedPaymentInteractor$synchronizeAccountInvitationsReadState$1) continuationImpl;
            int i2 = sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label = 1;
                    this.p.getClass();
                    obj = tje.k0(uyj.a, new SharedPaymentInteractor$getUnsynchronizedInvitationIds$2(this, null), sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.L$1;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.L$0 = null;
                            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.L$1 = it;
                            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.L$2 = null;
                            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.L$3 = null;
                            sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label = 2;
                            if (q(str, sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1) == obj2) {
                                return obj2;
                            }
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1 = new SharedPaymentInteractor$synchronizeAccountInvitationsReadState$1(this, continuationImpl);
        Object obj3 = sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$synchronizeAccountInvitationsReadState$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public final Object u(String str, String str2, String str3, Continuation continuation) {
        x xVar = this.d;
        xVar.getClass();
        SharedPayment sharedPayment = new SharedPayment(Collections.singletonList(new rfa0(PaymentMethod$Type.CARD, str2, (String) null, (Boolean) null, (List) null, 28)), str2);
        xVar.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SharedPaymentRepository$updatePaymentType$2(xVar, str, str3, sharedPayment, null), continuation);
    }
}
