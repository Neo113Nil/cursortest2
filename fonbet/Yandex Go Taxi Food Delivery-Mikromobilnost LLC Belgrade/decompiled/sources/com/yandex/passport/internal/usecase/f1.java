package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.hb;
import com.yandex.passport.data.network.lb;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.o8;
import com.yandex.passport.internal.report.p8;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.ny61;
import defpackage.w511;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class f1 extends com.yandex.passport.common.domain.a {
    public final lb b;
    public final r1 c;
    public final com.yandex.passport.internal.credentials.d d;
    public final com.yandex.passport.internal.report.reporters.b1 e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.internal.core.tokens.a g;
    public final com.yandex.passport.internal.push.i0 h;
    public final com.yandex.passport.internal.push.k0 i;

    public f1(com.yandex.passport.common.coroutine.a aVar, lb lbVar, r1 r1Var, com.yandex.passport.internal.credentials.d dVar, com.yandex.passport.internal.report.reporters.b1 b1Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.core.tokens.a aVar2, com.yandex.passport.internal.push.i0 i0Var, com.yandex.passport.internal.push.k0 k0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = lbVar;
        this.c = r1Var;
        this.d = dVar;
        this.e = b1Var;
        this.f = bVar;
        this.g = aVar2;
        this.h = i0Var;
        this.i = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(f1 f1Var, ModernAccount modernAccount, MasterToken masterToken, d1 d1Var, Uid uid, RevokePlace revokePlace, ContinuationImpl continuationImpl) {
        RevokeMasterTokenUseCase$execute$1 revokeMasterTokenUseCase$execute$1;
        int i;
        if (continuationImpl instanceof RevokeMasterTokenUseCase$execute$1) {
            revokeMasterTokenUseCase$execute$1 = (RevokeMasterTokenUseCase$execute$1) continuationImpl;
            int i2 = revokeMasterTokenUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                revokeMasterTokenUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = revokeMasterTokenUseCase$execute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revokeMasterTokenUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object c1Var = new c1(modernAccount, masterToken, d1Var, uid, revokePlace);
                    revokeMasterTokenUseCase$execute$1.label = 1;
                    obj = f1Var.a(c1Var, revokeMasterTokenUseCase$execute$1);
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
                return ((Result) obj).getValue();
            }
        }
        revokeMasterTokenUseCase$execute$1 = new RevokeMasterTokenUseCase$execute$1(f1Var, continuationImpl);
        Object obj3 = revokeMasterTokenUseCase$execute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revokeMasterTokenUseCase$execute$1.label;
        if (i != 0) {
        }
        return ((Result) obj3).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x009e, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable d(f1 f1Var, c1 c1Var, ContinuationImpl continuationImpl) {
        RevokeMasterTokenUseCase$run$1 revokeMasterTokenUseCase$run$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        c1 c1Var2;
        com.yandex.passport.internal.j a;
        char c;
        f1 f1Var2;
        c1 c1Var3;
        ModernAccount a2;
        Object value;
        char c2;
        char c3;
        Throwable a3;
        f1 f1Var3 = f1Var;
        if (continuationImpl instanceof RevokeMasterTokenUseCase$run$1) {
            revokeMasterTokenUseCase$run$1 = (RevokeMasterTokenUseCase$run$1) continuationImpl;
            int i2 = revokeMasterTokenUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                revokeMasterTokenUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                obj = revokeMasterTokenUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = revokeMasterTokenUseCase$run$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.ui.sloth.e d = c1Var.d();
                    if (d instanceof e1) {
                        a = f1Var3.d.a(((e1) c1Var.d()).s(), c1Var.f().getEnvironment());
                        c1Var2 = c1Var;
                        if (c1Var2.b() && (a2 = c1Var2.a()) != null) {
                            f1Var3.h.a(a2.getUid(), false);
                            f1Var3.i.b(a2.getUid());
                        }
                        lb lbVar = f1Var3.b;
                        com.yandex.passport.internal.network.mappers.b bVar = f1Var3.f;
                        Environment environment = c1Var2.f().getEnvironment();
                        bVar.getClass();
                        com.yandex.passport.data.models.g a4 = com.yandex.passport.internal.network.mappers.b.a(environment);
                        String decryptedId = a.getDecryptedId();
                        String decryptedSecret = a.getDecryptedSecret();
                        String rawValue = c1Var2.c().getRawValue();
                        ModernAccount a5 = c1Var2.a();
                        c = 1;
                        hb hbVar = new hb(a4, decryptedId, decryptedSecret, rawValue, a5 != null ? new Long(a5.getLocationId()) : null);
                        revokeMasterTokenUseCase$run$1.L$0 = f1Var3;
                        revokeMasterTokenUseCase$run$1.L$1 = c1Var2;
                        revokeMasterTokenUseCase$run$1.label = 2;
                        obj = lbVar.a(hbVar, revokeMasterTokenUseCase$run$1);
                        if (obj != coroutineSingletons) {
                            f1Var2 = f1Var3;
                            c1Var3 = c1Var2;
                            value = ((Result) obj).getValue();
                            int i3 = 12;
                            if (value instanceof Result.Failure) {
                            }
                            a3 = Result.a(value);
                            if (a3 != null) {
                            }
                            return new Result(value);
                        }
                        return coroutineSingletons;
                    }
                    if (!(d instanceof d1)) {
                        w511.b();
                        return null;
                    }
                    r1 r1Var = f1Var3.c;
                    q1 q1Var = new q1(((d1) c1Var.d()).s(), c1Var.f().getEnvironment());
                    revokeMasterTokenUseCase$run$1.L$0 = f1Var3;
                    c1Var2 = c1Var;
                    revokeMasterTokenUseCase$run$1.L$1 = c1Var2;
                    revokeMasterTokenUseCase$run$1.label = 1;
                    obj = r1Var.a(q1Var, revokeMasterTokenUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c1Var3 = (c1) revokeMasterTokenUseCase$run$1.L$1;
                        f1Var2 = (f1) revokeMasterTokenUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        c = 1;
                        value = ((Result) obj).getValue();
                        int i32 = 12;
                        if (value instanceof Result.Failure) {
                            com.yandex.passport.internal.report.reporters.b1 b1Var = f1Var2.e;
                            RevokePlace e = c1Var3.e();
                            Uid f = c1Var3.f();
                            ModernAccount a6 = c1Var3.a();
                            Uid masterUid = a6 != null ? a6.getMasterUid() : null;
                            String rawValue2 = c1Var3.c().getRawValue();
                            b1Var.getClass();
                            p8 p8Var = p8.w;
                            c3 = 3;
                            com.yandex.passport.internal.report.i iVar = new com.yandex.passport.internal.report.i(rawValue2, 26);
                            c2 = 2;
                            md mdVar = new md(e.a(), i32, z);
                            jd jdVar = new jd(Long.valueOf(f.getValue()));
                            com.yandex.passport.internal.report.i iVar2 = new com.yandex.passport.internal.report.i(masterUid != null ? Long.valueOf(masterUid.getValue()) : null);
                            pd[] pdVarArr = new pd[4];
                            pdVarArr[0] = iVar;
                            pdVarArr[c] = mdVar;
                            pdVarArr[2] = jdVar;
                            pdVarArr[3] = iVar2;
                            b1Var.f(p8Var, pdVarArr);
                            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, e.a(), 8);
                            }
                            if (c1Var3.a() != null) {
                                f1Var2.g.a(c1Var3.a());
                            }
                        } else {
                            c2 = 2;
                            c3 = 3;
                        }
                        a3 = Result.a(value);
                        if (a3 != null) {
                            com.yandex.passport.internal.report.reporters.b1 b1Var2 = f1Var2.e;
                            RevokePlace e2 = c1Var3.e();
                            Uid f2 = c1Var3.f();
                            ModernAccount a7 = c1Var3.a();
                            Uid masterUid2 = a7 != null ? a7.getMasterUid() : null;
                            String rawValue3 = c1Var3.c().getRawValue();
                            b1Var2.getClass();
                            o8 o8Var = o8.w;
                            com.yandex.passport.internal.report.i iVar3 = new com.yandex.passport.internal.report.i(rawValue3, 26);
                            md mdVar2 = new md(e2.a(), i32, z);
                            jd jdVar2 = new jd(Long.valueOf(f2.getValue()));
                            com.yandex.passport.internal.report.i iVar4 = new com.yandex.passport.internal.report.i(masterUid2 != null ? Long.valueOf(masterUid2.getValue()) : null);
                            ld ldVar = new ld(a3);
                            pd[] pdVarArr2 = new pd[5];
                            pdVarArr2[0] = iVar3;
                            pdVarArr2[c] = mdVar2;
                            pdVarArr2[c2] = jdVar2;
                            pdVarArr2[c3] = iVar4;
                            pdVarArr2[4] = ldVar;
                            b1Var2.f(o8Var, pdVarArr2);
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, e2.a(), 8);
                            }
                        }
                        return new Result(value);
                    }
                    c1 c1Var4 = (c1) revokeMasterTokenUseCase$run$1.L$1;
                    f1 f1Var4 = (f1) revokeMasterTokenUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    c1Var2 = c1Var4;
                    f1Var3 = f1Var4;
                }
                a = (com.yandex.passport.internal.j) obj;
                if (c1Var2.b()) {
                    f1Var3.h.a(a2.getUid(), false);
                    f1Var3.i.b(a2.getUid());
                }
                lb lbVar2 = f1Var3.b;
                com.yandex.passport.internal.network.mappers.b bVar2 = f1Var3.f;
                Environment environment2 = c1Var2.f().getEnvironment();
                bVar2.getClass();
                com.yandex.passport.data.models.g a42 = com.yandex.passport.internal.network.mappers.b.a(environment2);
                String decryptedId2 = a.getDecryptedId();
                String decryptedSecret2 = a.getDecryptedSecret();
                String rawValue4 = c1Var2.c().getRawValue();
                ModernAccount a52 = c1Var2.a();
                c = 1;
                hb hbVar2 = new hb(a42, decryptedId2, decryptedSecret2, rawValue4, a52 != null ? new Long(a52.getLocationId()) : null);
                revokeMasterTokenUseCase$run$1.L$0 = f1Var3;
                revokeMasterTokenUseCase$run$1.L$1 = c1Var2;
                revokeMasterTokenUseCase$run$1.label = 2;
                obj = lbVar2.a(hbVar2, revokeMasterTokenUseCase$run$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        revokeMasterTokenUseCase$run$1 = new RevokeMasterTokenUseCase$run$1(f1Var3, continuationImpl);
        obj = revokeMasterTokenUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = revokeMasterTokenUseCase$run$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        a = (com.yandex.passport.internal.j) obj;
        if (c1Var2.b()) {
        }
        lb lbVar22 = f1Var3.b;
        com.yandex.passport.internal.network.mappers.b bVar22 = f1Var3.f;
        Environment environment22 = c1Var2.f().getEnvironment();
        bVar22.getClass();
        com.yandex.passport.data.models.g a422 = com.yandex.passport.internal.network.mappers.b.a(environment22);
        String decryptedId22 = a.getDecryptedId();
        String decryptedSecret22 = a.getDecryptedSecret();
        String rawValue42 = c1Var2.c().getRawValue();
        ModernAccount a522 = c1Var2.a();
        c = 1;
        hb hbVar22 = new hb(a422, decryptedId22, decryptedSecret22, rawValue42, a522 != null ? new Long(a522.getLocationId()) : null);
        revokeMasterTokenUseCase$run$1.L$0 = f1Var3;
        revokeMasterTokenUseCase$run$1.L$1 = c1Var2;
        revokeMasterTokenUseCase$run$1.label = 2;
        obj = lbVar22.a(hbVar22, revokeMasterTokenUseCase$run$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return d(this, (c1) obj, (ContinuationImpl) continuation);
    }
}
