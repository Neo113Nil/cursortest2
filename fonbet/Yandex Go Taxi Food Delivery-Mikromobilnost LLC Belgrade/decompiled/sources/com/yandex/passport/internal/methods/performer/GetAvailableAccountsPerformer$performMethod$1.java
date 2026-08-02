package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.account.PassportAvailableAccountImpl;
import com.yandex.passport.internal.entities.AccountType;
import com.yandex.passport.internal.entities.Filter;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/passport/internal/account/PassportAvailableAccountImpl;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetAvailableAccountsPerformer$performMethod$1", f = "GetAvailableAccountsPerformer.kt", l = {28, 46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetAvailableAccountsPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.y0 $method;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableAccountsPerformer$performMethod$1(v vVar, com.yandex.passport.internal.methods.y0 y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$method = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAvailableAccountsPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetAvailableAccountsPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0056, code lost:
    
        if (r4 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x013a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection t;
        com.yandex.passport.internal.b a;
        Object c;
        Object a2;
        Collection collection;
        PassportAccountType passportAccountType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            t = g8e.t(obj);
            a = this.this$0.a.a();
            com.yandex.passport.internal.filter.i iVar = this.this$0.b;
            ArrayList f = a.f();
            Filter filter = (Filter) this.$method.b.c;
            this.L$0 = t;
            this.L$1 = a;
            this.label = 1;
            c = iVar.c(f, filter, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                collection = (List) this.L$0;
                kotlin.b.b(obj);
                a2 = obj;
                v vVar = this.this$0;
                for (com.yandex.passport.internal.entities.k kVar : (Iterable) a2) {
                    Collection collection2 = collection;
                    PassportUidImpl A = com.yandex.passport.internal.util.p.A(kVar.a);
                    PassportUidImpl A2 = com.yandex.passport.internal.util.p.A(kVar.b);
                    AccountType accountType = kVar.c;
                    vVar.getClass();
                    switch (u.a[accountType.ordinal()]) {
                        case 1:
                            passportAccountType = PassportAccountType.PORTAL;
                            break;
                        case 2:
                            passportAccountType = PassportAccountType.LITE;
                            break;
                        case 3:
                            passportAccountType = PassportAccountType.SOCIAL;
                            break;
                        case 4:
                            passportAccountType = PassportAccountType.SOCIAL;
                            break;
                        case 5:
                            passportAccountType = PassportAccountType.PHONISH;
                            break;
                        case 6:
                            passportAccountType = PassportAccountType.MAILISH;
                            break;
                        case 7:
                            passportAccountType = PassportAccountType.MUSIC_PHONISH;
                            break;
                        case 8:
                            passportAccountType = PassportAccountType.CHILDISH;
                            break;
                        case 9:
                            passportAccountType = PassportAccountType.UNDEFINED;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    collection2.add(new PassportAvailableAccountImpl(A, A2, passportAccountType, kVar.d, kVar.e, kVar.f, kVar.g));
                }
                return collection;
            }
            com.yandex.passport.internal.b bVar = (com.yandex.passport.internal.b) this.L$1;
            Collection collection3 = (List) this.L$0;
            kotlin.b.b(obj);
            a = bVar;
            t = collection3;
            c = obj;
        }
        for (ModernAccount modernAccount : (Iterable) c) {
            Collection collection4 = t;
            PassportUidImpl A3 = com.yandex.passport.internal.util.p.A(modernAccount.getUid());
            Uid masterUid = modernAccount.getMasterUid();
            PassportUidImpl A4 = masterUid != null ? com.yandex.passport.internal.util.p.A(masterUid) : null;
            PassportAccountType accountType2 = modernAccount.getAccountType();
            String displayLogin = modernAccount.getDisplayLogin();
            String publicName = modernAccount.getPublicName();
            String phoneNumber = modernAccount.getPhoneNumber();
            String m296getAvatarUrlxSnV4o = modernAccount.m296getAvatarUrlxSnV4o();
            collection4.add(new PassportAvailableAccountImpl(A3, A4, accountType2, displayLogin, publicName, phoneNumber, m296getAvatarUrlxSnV4o == null ? null : m296getAvatarUrlxSnV4o));
        }
        if (!((Boolean) this.this$0.w.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
            return t;
        }
        com.yandex.passport.internal.usecase.o0 o0Var = this.this$0.c;
        Filter filter2 = (Filter) this.$method.b.c;
        Collection collection5 = t;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection5.iterator();
        while (it.hasNext()) {
            PassportUidImpl m299getMasterUid = ((PassportAvailableAccountImpl) it.next()).m299getMasterUid();
            Uid B = m299getMasterUid != null ? com.yandex.passport.internal.util.p.B(m299getMasterUid) : null;
            if (B != null) {
                arrayList.add(B);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(collection5, 10));
        Iterator it2 = collection5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.yandex.passport.internal.util.p.B(((PassportAvailableAccountImpl) it2.next()).m300getUid()));
        }
        androidx.core.app.d1 d1Var = new androidx.core.app.d1(filter2, arrayList, arrayList2, a);
        this.L$0 = t;
        this.L$1 = null;
        this.label = 2;
        a2 = o0Var.a(d1Var);
        if (a2 != coroutineSingletons) {
            collection = t;
            v vVar2 = this.this$0;
            while (r2.hasNext()) {
            }
            return collection;
        }
        return coroutineSingletons;
    }
}
