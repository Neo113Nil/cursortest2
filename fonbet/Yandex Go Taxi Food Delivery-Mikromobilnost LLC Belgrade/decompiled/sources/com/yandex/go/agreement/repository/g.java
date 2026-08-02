package com.yandex.go.agreement.repository;

import defpackage.bbz;
import defpackage.bd;
import defpackage.cbz;
import defpackage.dbz;
import defpackage.dd;
import defpackage.ege0;
import defpackage.jl40;
import defpackage.mth;
import defpackage.nk1;
import defpackage.ny61;
import defpackage.of;
import defpackage.ok1;
import defpackage.pk1;
import defpackage.rk1;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.k;

/* loaded from: classes.dex */
public final class g {
    public final com.yandex.go.permission.location_with_agreement.interactor.e a;
    public final ege0 b;
    public final k c;
    public final k d;
    public final AuthStateRepository e;
    public final of f;
    public final com.yandex.go.agreement.trackable.repository.b g;
    public final ru.yandex.taxi.sdc.a h;

    public g(com.yandex.go.permission.location_with_agreement.interactor.e eVar, ege0 ege0Var, k kVar, k kVar2, AuthStateRepository authStateRepository, of ofVar, com.yandex.go.agreement.trackable.repository.b bVar, ru.yandex.taxi.sdc.a aVar) {
        this.a = eVar;
        this.b = ege0Var;
        this.c = kVar;
        this.d = kVar2;
        this.e = authStateRepository;
        this.f = ofVar;
        this.g = bVar;
        this.h = aVar;
    }

    public final mth a() {
        return new mth(kotlinx.coroutines.flow.e.n(this.a.b(), e(), new m0(this.c.Hg(), this.e.b, new AgreementToShowRepositoryImpl$authDoneFlow$1(3, null)), new AgreementToShowRepositoryImpl$agreementToShowFlow$1(4, this, g.class, "getAgreementPayload", "getAgreementPayload(ZLjava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(bd bdVar, boolean z, Continuation continuation) {
        AgreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1 agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1;
        int i;
        if (continuation instanceof AgreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1) {
            agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1 = (AgreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1) continuation;
            int i2 = agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.getClass();
                    if (jl40.l(bdVar.a, "gdpr")) {
                        return new rk1(bdVar);
                    }
                    if (!z) {
                        return null;
                    }
                    agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.L$0 = bdVar;
                    agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.Z$0 = z;
                    agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.label = 1;
                    obj = this.h.b(bdVar, agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bdVar = (bd) agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.L$0;
                    kotlin.b.b(obj);
                }
                return !((Boolean) obj).booleanValue() ? new nk1(bdVar) : new rk1(bdVar);
            }
        }
        agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1 = new AgreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1(this, continuation);
        Object obj2 = agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementToShowRepositoryImpl$getDefaultAgreementAcceptancePayload$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, Continuation continuation) {
        AgreementToShowRepositoryImpl$getLocationWithAgreement$1 agreementToShowRepositoryImpl$getLocationWithAgreement$1;
        int i;
        dbz dbzVar;
        bd bdVar;
        if (continuation instanceof AgreementToShowRepositoryImpl$getLocationWithAgreement$1) {
            agreementToShowRepositoryImpl$getLocationWithAgreement$1 = (AgreementToShowRepositoryImpl$getLocationWithAgreement$1) continuation;
            int i2 = agreementToShowRepositoryImpl$getLocationWithAgreement$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                agreementToShowRepositoryImpl$getLocationWithAgreement$1.label = i2 - Integer.MIN_VALUE;
                Object obj = agreementToShowRepositoryImpl$getLocationWithAgreement$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = agreementToShowRepositoryImpl$getLocationWithAgreement$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    agreementToShowRepositoryImpl$getLocationWithAgreement$1.L$0 = list;
                    agreementToShowRepositoryImpl$getLocationWithAgreement$1.label = 1;
                    obj = this.a.a(agreementToShowRepositoryImpl$getLocationWithAgreement$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) agreementToShowRepositoryImpl$getLocationWithAgreement$1.L$0;
                    kotlin.b.b(obj);
                }
                dbzVar = (dbz) obj;
                if (dbzVar instanceof bbz) {
                    if (dbzVar instanceof cbz) {
                        return pk1.a;
                    }
                    w511.b();
                    return null;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bdVar = 0;
                        break;
                    }
                    bdVar = it.next();
                    if (jl40.l(((dd) bdVar).a(), ((bbz) dbzVar).a())) {
                        break;
                    }
                }
                return new ok1(bdVar instanceof bd ? bdVar : null);
            }
        }
        agreementToShowRepositoryImpl$getLocationWithAgreement$1 = new AgreementToShowRepositoryImpl$getLocationWithAgreement$1(this, continuation);
        Object obj2 = agreementToShowRepositoryImpl$getLocationWithAgreement$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = agreementToShowRepositoryImpl$getLocationWithAgreement$1.label;
        if (i != 0) {
        }
        dbzVar = (dbz) obj2;
        if (dbzVar instanceof bbz) {
        }
    }

    public final m0 d() {
        return new m0(this.a.b(), e(), new AgreementToShowRepositoryImpl$locationPermissionToShowFlow$1(this, null));
    }

    public final b e() {
        return new b(new f(kotlinx.coroutines.flow.e.X(new d(new mth(this.f.c, 6)), new AgreementToShowRepositoryImpl$requiredAcceptancesFlow$$inlined$flatMapLatest$1(this, null))), this);
    }
}
