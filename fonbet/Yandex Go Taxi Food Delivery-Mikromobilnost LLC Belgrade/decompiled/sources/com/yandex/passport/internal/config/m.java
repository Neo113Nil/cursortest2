package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.d6;
import com.yandex.passport.data.network.j6;
import com.yandex.passport.data.network.n6;
import com.yandex.passport.data.network.y5;
import com.yandex.passport.internal.report.a5;
import com.yandex.passport.internal.report.b5;
import com.yandex.passport.internal.report.c5;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class m extends com.yandex.passport.common.domain.d {
    public final h b;
    public final n6 c;
    public final com.yandex.passport.internal.report.reporters.q d;
    public final f e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.network.mappers.e g;
    public final com.yandex.passport.internal.filter.i h;
    public final com.yandex.passport.internal.config.template.g i;
    public final q j;
    public final j k;
    public final o l;
    public final b m;

    public m(com.yandex.passport.common.coroutine.a aVar, h hVar, n6 n6Var, com.yandex.passport.internal.report.reporters.q qVar, f fVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.network.mappers.e eVar, com.yandex.passport.internal.filter.i iVar, com.yandex.passport.internal.config.template.g gVar, q qVar2, j jVar, o oVar, b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = hVar;
        this.c = n6Var;
        this.d = qVar;
        this.e = fVar;
        this.f = bVar;
        this.g = eVar;
        this.h = iVar;
        this.i = gVar;
        this.j = qVar2;
        this.k = jVar;
        this.l = oVar;
        this.m = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9 A[Catch: Exception -> 0x0068, TryCatch #1 {Exception -> 0x0068, blocks: (B:16:0x00f5, B:18:0x00f9, B:19:0x0111, B:20:0x0145, B:22:0x014b, B:36:0x0063, B:37:0x00df), top: B:35:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014b A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #1 {Exception -> 0x0068, blocks: (B:16:0x00f5, B:18:0x00f9, B:19:0x0111, B:20:0x0145, B:22:0x014b, B:36:0x0063, B:37:0x00df), top: B:35:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #2 {Exception -> 0x0077, blocks: (B:42:0x0073, B:43:0x00af, B:45:0x00b9, B:51:0x007e, B:54:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Environment environment, ContinuationImpl continuationImpl) {
        GetConfigUseCase$run$1 getConfigUseCase$run$1;
        int i;
        m mVar;
        Object value;
        Environment environment2;
        d6 d6Var;
        Object obj;
        com.yandex.passport.internal.config.template.g gVar;
        j6 j6Var;
        Environment environment3;
        Throwable a;
        String str;
        m mVar2 = this;
        Environment environment4 = environment;
        try {
            if (continuationImpl instanceof GetConfigUseCase$run$1) {
                getConfigUseCase$run$1 = (GetConfigUseCase$run$1) continuationImpl;
                int i2 = getConfigUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getConfigUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = getConfigUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = getConfigUseCase$run$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        if (mVar2.e.a(environment4, "last_update", "package_name")) {
                            return zy11Var;
                        }
                        com.yandex.passport.internal.report.reporters.q qVar = mVar2.d;
                        qVar.getClass();
                        qVar.h(b5.w);
                        n6 n6Var = mVar2.c;
                        mVar2.f.getClass();
                        y5 y5Var = new y5(com.yandex.passport.internal.network.mappers.b.a(environment4));
                        getConfigUseCase$run$1.L$0 = mVar2;
                        getConfigUseCase$run$1.L$1 = environment4;
                        getConfigUseCase$run$1.label = 1;
                        obj2 = n6Var.a(y5Var, getConfigUseCase$run$1);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                d6Var = (d6) getConfigUseCase$run$1.L$3;
                                obj = getConfigUseCase$run$1.L$2;
                                environment3 = (Environment) getConfigUseCase$run$1.L$1;
                                m mVar3 = (m) getConfigUseCase$run$1.L$0;
                                try {
                                    kotlin.b.b(obj2);
                                    mVar = mVar3;
                                    str = d6Var.c;
                                    if (str != null) {
                                        ((SharedPreferences) mVar.j.b.getValue()).edit().putString("white_list_key", str).apply();
                                    }
                                    mVar.b.a(environment3, d6Var.a, d6Var.d);
                                    mVar.k.f(environment3, d6Var.f);
                                    mVar.l.a(environment3, d6Var.g, d6Var.h);
                                    mVar.m.b(environment3, d6Var.i, d6Var.j);
                                    mVar.e.b(environment3, "last_update", "package_name");
                                    com.yandex.passport.internal.report.reporters.q qVar2 = mVar.d;
                                    qVar2.getClass();
                                    qVar2.h(c5.w);
                                    value = obj;
                                    a = Result.a(value);
                                    if (a != null) {
                                        com.yandex.passport.internal.report.reporters.q qVar3 = mVar.d;
                                        qVar3.getClass();
                                        qVar3.f(a5.w, new yd(a), new ld(a));
                                    }
                                    return zy11Var;
                                } catch (Exception e) {
                                    e = e;
                                    mVar = mVar3;
                                    com.yandex.passport.internal.report.reporters.q qVar4 = mVar.d;
                                    qVar4.getClass();
                                    qVar4.f(a5.w, new yd(e), new ld(e));
                                    return zy11Var;
                                }
                            }
                            d6Var = (d6) getConfigUseCase$run$1.L$3;
                            obj = getConfigUseCase$run$1.L$2;
                            environment2 = (Environment) getConfigUseCase$run$1.L$1;
                            mVar = (m) getConfigUseCase$run$1.L$0;
                            try {
                                kotlin.b.b(obj2);
                                gVar = mVar.i;
                                j6Var = d6Var.e;
                                getConfigUseCase$run$1.L$0 = mVar;
                                getConfigUseCase$run$1.L$1 = environment2;
                                getConfigUseCase$run$1.L$2 = obj;
                                getConfigUseCase$run$1.L$3 = d6Var;
                                getConfigUseCase$run$1.label = 3;
                                if (gVar.c(j6Var, getConfigUseCase$run$1) != coroutineSingletons) {
                                    environment3 = environment2;
                                    str = d6Var.c;
                                    if (str != null) {
                                    }
                                    mVar.b.a(environment3, d6Var.a, d6Var.d);
                                    mVar.k.f(environment3, d6Var.f);
                                    mVar.l.a(environment3, d6Var.g, d6Var.h);
                                    mVar.m.b(environment3, d6Var.i, d6Var.j);
                                    mVar.e.b(environment3, "last_update", "package_name");
                                    com.yandex.passport.internal.report.reporters.q qVar22 = mVar.d;
                                    qVar22.getClass();
                                    qVar22.h(c5.w);
                                    value = obj;
                                    a = Result.a(value);
                                    if (a != null) {
                                    }
                                    return zy11Var;
                                }
                                return coroutineSingletons;
                            } catch (Exception e2) {
                                e = e2;
                                com.yandex.passport.internal.report.reporters.q qVar42 = mVar.d;
                                qVar42.getClass();
                                qVar42.f(a5.w, new yd(e), new ld(e));
                                return zy11Var;
                            }
                        }
                        environment4 = (Environment) getConfigUseCase$run$1.L$1;
                        mVar2 = (m) getConfigUseCase$run$1.L$0;
                        kotlin.b.b(obj2);
                    }
                    value = ((Result) obj2).getValue();
                    if (!(value instanceof Result.Failure)) {
                        mVar = mVar2;
                        a = Result.a(value);
                        if (a != null) {
                        }
                        return zy11Var;
                    }
                    d6 d6Var2 = (d6) value;
                    com.yandex.passport.internal.filter.i iVar = mVar2.h;
                    com.yandex.passport.internal.network.mappers.e eVar = mVar2.g;
                    List list = d6Var2.b;
                    eVar.getClass();
                    com.yandex.passport.data.models.a a2 = com.yandex.passport.internal.network.mappers.e.a(list);
                    getConfigUseCase$run$1.L$0 = mVar2;
                    getConfigUseCase$run$1.L$1 = environment4;
                    getConfigUseCase$run$1.L$2 = value;
                    getConfigUseCase$run$1.L$3 = d6Var2;
                    getConfigUseCase$run$1.label = 2;
                    if (iVar.f(a2, getConfigUseCase$run$1) != coroutineSingletons) {
                        environment2 = environment4;
                        d6Var = d6Var2;
                        mVar = mVar2;
                        obj = value;
                        gVar = mVar.i;
                        j6Var = d6Var.e;
                        getConfigUseCase$run$1.L$0 = mVar;
                        getConfigUseCase$run$1.L$1 = environment2;
                        getConfigUseCase$run$1.L$2 = obj;
                        getConfigUseCase$run$1.L$3 = d6Var;
                        getConfigUseCase$run$1.label = 3;
                        if (gVar.c(j6Var, getConfigUseCase$run$1) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj2).getValue();
            if (!(value instanceof Result.Failure)) {
            }
        } catch (Exception e3) {
            e = e3;
            mVar = mVar2;
        }
        getConfigUseCase$run$1 = new GetConfigUseCase$run$1(mVar2, continuationImpl);
        Object obj22 = getConfigUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getConfigUseCase$run$1.label;
        zy11 zy11Var2 = zy11.a;
    }
}
