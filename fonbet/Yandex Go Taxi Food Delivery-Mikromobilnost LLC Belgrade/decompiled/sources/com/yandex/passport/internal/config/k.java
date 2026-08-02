package com.yandex.passport.internal.config;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.l8;
import com.yandex.passport.data.network.q8;
import com.yandex.passport.data.network.t8;
import com.yandex.passport.data.network.u8;
import com.yandex.passport.internal.report.lb;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.mb;
import com.yandex.passport.internal.report.nb;
import com.yandex.passport.internal.report.yd;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.tcc;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class k extends com.yandex.passport.common.domain.d {
    public final u8 b;
    public final com.yandex.passport.internal.report.reporters.q c;
    public final f d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final a f;

    public k(com.yandex.passport.common.coroutine.a aVar, u8 u8Var, com.yandex.passport.internal.report.reporters.q qVar, f fVar, com.yandex.passport.internal.network.mappers.b bVar, a aVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = u8Var;
        this.c = qVar;
        this.d = fVar;
        this.e = bVar;
        this.f = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(2:36|37)(2:38|(1:40)))|12|(6:14|(1:16)|17|(2:20|18)|21|22)|23|(1:25)|26|27|28|29))|43|6|7|(0)(0)|12|(0)|23|(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        r12 = r12.c;
        r12.getClass();
        r12.f(com.yandex.passport.internal.report.lb.w, new com.yandex.passport.internal.report.yd(r13), new com.yandex.passport.internal.report.ld(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0032, B:12:0x0075, B:14:0x007f, B:17:0x0099, B:18:0x00a2, B:20:0x00a8, B:22:0x00c3, B:23:0x00d5, B:25:0x00db, B:26:0x00f5, B:34:0x0043, B:36:0x004b, B:38:0x004e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:11:0x0032, B:12:0x0075, B:14:0x007f, B:17:0x0099, B:18:0x00a2, B:20:0x00a8, B:22:0x00c3, B:23:0x00d5, B:25:0x00db, B:26:0x00f5, B:34:0x0043, B:36:0x004b, B:38:0x004e), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Environment environment, ContinuationImpl continuationImpl) {
        GetAppAccountVisibilityConfigUseCase$run$1 getAppAccountVisibilityConfigUseCase$run$1;
        int i;
        Object value;
        Throwable a;
        if (continuationImpl instanceof GetAppAccountVisibilityConfigUseCase$run$1) {
            getAppAccountVisibilityConfigUseCase$run$1 = (GetAppAccountVisibilityConfigUseCase$run$1) continuationImpl;
            int i2 = getAppAccountVisibilityConfigUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getAppAccountVisibilityConfigUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getAppAccountVisibilityConfigUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAppAccountVisibilityConfigUseCase$run$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.d.a(environment, "last_update_app_account_visibility", "package_name_app_account_visibility")) {
                        return Boolean.TRUE;
                    }
                    com.yandex.passport.internal.report.reporters.q qVar = this.c;
                    qVar.getClass();
                    qVar.h(mb.w);
                    u8 u8Var = this.b;
                    this.e.getClass();
                    l8 l8Var = new l8(com.yandex.passport.internal.network.mappers.b.a(environment));
                    getAppAccountVisibilityConfigUseCase$run$1.L$0 = this;
                    getAppAccountVisibilityConfigUseCase$run$1.L$1 = environment;
                    getAppAccountVisibilityConfigUseCase$run$1.label = 1;
                    obj = u8Var.a(l8Var, getAppAccountVisibilityConfigUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    environment = (Environment) getAppAccountVisibilityConfigUseCase$run$1.L$1;
                    this = (k) getAppAccountVisibilityConfigUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    q8 q8Var = (q8) value;
                    a aVar = this.f;
                    List list = q8Var.a;
                    List<t8> list2 = q8Var.b;
                    int d = gw00.d(tcc.n(list2, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (t8 t8Var : list2) {
                        Pair pair = new Pair(t8Var.a, t8Var.b);
                        linkedHashMap.put(pair.c(), pair.f());
                    }
                    aVar.a(linkedHashMap, list);
                    this.d.b(environment, "last_update_app_account_visibility", "package_name_app_account_visibility");
                    com.yandex.passport.internal.report.reporters.q qVar2 = this.c;
                    qVar2.getClass();
                    qVar2.h(nb.w);
                }
                a = Result.a(value);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.q qVar3 = this.c;
                    qVar3.getClass();
                    qVar3.f(lb.w, new yd(a), new ld(a));
                }
                z = !(value instanceof Result.Failure);
                return Boolean.valueOf(z);
            }
        }
        getAppAccountVisibilityConfigUseCase$run$1 = new GetAppAccountVisibilityConfigUseCase$run$1(this, continuationImpl);
        Object obj2 = getAppAccountVisibilityConfigUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAppAccountVisibilityConfigUseCase$run$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        z2 = !(value instanceof Result.Failure);
        return Boolean.valueOf(z2);
    }
}
