package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.log.api.LogPriority;
import defpackage.e3n;
import defpackage.j5d0;
import defpackage.k5d0;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4z;
import defpackage.rkd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwj0;
import defpackage.xnp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxnp0;", "<anonymous>", "(Ltse;)Lxnp0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.graphql.configuration.SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1", f = "SdkConfigurationRepositoryImpl.kt", l = {HProv.PP_PASSWD_TERM, 139, 160, 174, 193}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $this_run;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_run = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1(this.$this_run, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkConfigurationRepositoryImpl$getOrUpdateDeferred$2$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ad, code lost:
    
        if (r2 == r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0234  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        int i;
        Ref$LongRef ref$LongRef;
        int i2;
        long j;
        o4z o4zVar;
        CoroutineSingletons coroutineSingletons;
        int i3;
        int i4;
        Object obj2;
        Object a3;
        int i5;
        int i6;
        xnp0 xnp0Var;
        xnp0 xnp0Var2;
        Object obj3;
        Object obj4;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        if (i7 == 0) {
            b.b(obj);
            com.yandex.plus.home.datasource.local.preferences.a aVar = this.$this_run.i;
            this.label = 1;
            a = aVar.a(this);
        } else if (i7 == 1) {
            b.b(obj);
            a = ((Result) obj).getValue();
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        xnp0Var = (xnp0) this.L$2;
                        b.b(obj);
                        ((Result) obj).getClass();
                        r0 r0Var = this.$this_run.l;
                        j5d0 j5d0Var = new j5d0(xnp0Var);
                        r0Var.getClass();
                        r0Var.m(null, j5d0Var);
                        return xnp0Var;
                    }
                    if (i7 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xnp0Var2 = (xnp0) this.L$4;
                    b.b(obj);
                    ((Result) obj).getClass();
                    r0 r0Var2 = this.$this_run.l;
                    j5d0 j5d0Var2 = new j5d0(xnp0Var2);
                    r0Var2.getClass();
                    r0Var2.m(null, j5d0Var2);
                    return xnp0Var2;
                }
                i6 = this.I$1;
                i5 = this.I$0;
                j = this.J$0;
                o4zVar = (o4z) this.L$1;
                ref$LongRef = (Ref$LongRef) this.L$0;
                b.b(obj);
                a3 = ((Result) obj).getValue();
                coroutineSingletons = coroutineSingletons2;
                if (a3 instanceof Result.Failure) {
                    a3 = null;
                }
                xnp0Var = (xnp0) a3;
                a aVar2 = this.$this_run;
                if (xnp0Var == null) {
                    long a4 = aVar2.c.a();
                    ref$LongRef.element = a4;
                    this.$this_run.j.getClass();
                    o4z a5 = wwj0.a(xnp0Var, a4);
                    rkd0 rkd0Var = this.$this_run.g;
                    LogPriority logPriority = LogPriority.INFO;
                    if (rkd0Var.e(logPriority)) {
                        obj4 = null;
                        rkd0Var.b(logPriority, "SdkConfigurationRepositoryImpl", "getOrUpdateDeferred(): value successfully loaded, update storage and local cache networkSdkConfig=" + xnp0Var + ",currentTime=" + ((Object) e3n.p(ref$LongRef.element)), null);
                    } else {
                        obj4 = null;
                    }
                    com.yandex.plus.home.datasource.local.preferences.a aVar3 = this.$this_run.h;
                    this.L$0 = obj4;
                    this.L$1 = obj4;
                    this.L$2 = xnp0Var;
                    this.L$3 = obj4;
                    this.J$0 = j;
                    this.I$0 = i5;
                    this.I$1 = i6;
                    this.label = 4;
                    if (aVar3.e(a5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r0 r0Var3 = this.$this_run.l;
                    j5d0 j5d0Var3 = new j5d0(xnp0Var);
                    r0Var3.getClass();
                    r0Var3.m(null, j5d0Var3);
                    return xnp0Var;
                }
                long a6 = aVar2.c.a();
                ref$LongRef.element = a6;
                if (o4zVar == null) {
                    a aVar4 = this.$this_run;
                    wwj0 wwj0Var = aVar4.j;
                    long k = e3n.k(e3n.k(a6, e3n.q(aVar4.d)), kp50.U(15, DurationUnit.MINUTES));
                    wwj0Var.getClass();
                    o4zVar = wwj0.a(null, k);
                }
                this.$this_run.j.getClass();
                xnp0Var2 = new xnp0(o4zVar.a, o4zVar.b, o4zVar.c, o4zVar.d, o4zVar.e, o4zVar.f, o4zVar.g, o4zVar.h, o4zVar.i);
                rkd0 rkd0Var2 = this.$this_run.g;
                LogPriority logPriority2 = LogPriority.INFO;
                if (rkd0Var2.e(logPriority2)) {
                    obj3 = null;
                    rkd0Var2.b(logPriority2, "SdkConfigurationRepositoryImpl", "getOrUpdateDeferred(): value loading failed, create fallback fallbackStorageSdkConfig=" + o4zVar + ",currentTime=" + ((Object) e3n.p(ref$LongRef.element)), null);
                } else {
                    obj3 = null;
                }
                com.yandex.plus.home.datasource.local.preferences.a aVar5 = this.$this_run.h;
                this.L$0 = obj3;
                this.L$1 = obj3;
                this.L$2 = obj3;
                this.L$3 = obj3;
                this.L$4 = xnp0Var2;
                this.J$0 = j;
                this.I$0 = i5;
                this.I$1 = i6;
                this.label = 5;
                if (aVar5.e(o4zVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r0 r0Var22 = this.$this_run.l;
                j5d0 j5d0Var22 = new j5d0(xnp0Var2);
                r0Var22.getClass();
                r0Var22.m(null, j5d0Var22);
                return xnp0Var2;
            }
            i2 = this.I$1;
            int i8 = this.I$0;
            long j2 = this.J$0;
            Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.L$0;
            b.b(obj);
            a2 = ((Result) obj).getValue();
            i = i8;
            j = j2;
            ref$LongRef = ref$LongRef2;
            if (a2 instanceof Result.Failure) {
                a2 = null;
            }
            o4zVar = (o4z) a2;
            if (o4zVar == null) {
                long j3 = o4zVar.j;
                int i9 = i;
                long a7 = this.$this_run.c.a();
                ref$LongRef.element = a7;
                boolean z = e3n.c(j3, a7) < 0;
                boolean z2 = e3n.c(e3n.k(j3, this.$this_run.d), ref$LongRef.element) > 0;
                a aVar6 = this.$this_run;
                rkd0 rkd0Var3 = aVar6.g;
                LogPriority logPriority3 = LogPriority.INFO;
                if (rkd0Var3.e(logPriority3)) {
                    i4 = i9;
                    StringBuilder sb = new StringBuilder("getOrUpdateDeferred(): check for fresh stored value currentTime=");
                    coroutineSingletons = coroutineSingletons2;
                    i3 = i2;
                    sb.append((Object) e3n.p(ref$LongRef.element));
                    sb.append(",cacheLifeTime=");
                    sb.append((Object) e3n.p(aVar6.d));
                    sb.append(",isConfigTimeValid=");
                    sb.append(z);
                    sb.append(",isConfigFresh=");
                    sb.append(z2);
                    rkd0Var3.b(logPriority3, "SdkConfigurationRepositoryImpl", sb.toString(), null);
                } else {
                    i3 = i2;
                    i4 = i9;
                    coroutineSingletons = coroutineSingletons2;
                }
                if (z && z2) {
                    this.$this_run.j.getClass();
                    xnp0 xnp0Var3 = new xnp0(o4zVar.a, o4zVar.b, o4zVar.c, o4zVar.d, o4zVar.e, o4zVar.f, o4zVar.g, o4zVar.h, o4zVar.i);
                    r0 r0Var4 = this.$this_run.l;
                    j5d0 j5d0Var4 = new j5d0(xnp0Var3);
                    r0Var4.getClass();
                    r0Var4.m(null, j5d0Var4);
                    return xnp0Var3;
                }
                obj2 = null;
            } else {
                coroutineSingletons = coroutineSingletons2;
                i3 = i2;
                i4 = i;
                obj2 = null;
            }
            r0 r0Var5 = this.$this_run.l;
            r0Var5.getClass();
            r0Var5.m(obj2, k5d0.a);
            a aVar7 = this.$this_run;
            this.L$0 = ref$LongRef;
            this.L$1 = o4zVar;
            this.J$0 = j;
            int i10 = i4;
            this.I$0 = i10;
            int i11 = i3;
            this.I$1 = i11;
            this.label = 3;
            a3 = a.a(aVar7, this);
            if (a3 != coroutineSingletons) {
                return coroutineSingletons;
            }
            i5 = i10;
            i6 = i11;
            if (a3 instanceof Result.Failure) {
            }
            xnp0Var = (xnp0) a3;
            a aVar22 = this.$this_run;
            if (xnp0Var == null) {
            }
        }
        e3n e3nVar = new e3n(0L);
        if (a instanceof Result.Failure) {
            a = e3nVar;
        }
        long j4 = ((e3n) a).a;
        Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        long a8 = this.$this_run.c.a();
        ref$LongRef3.element = a8;
        ?? r9 = e3n.c(j4, e3n.k(a8, kp50.U(24, DurationUnit.HOURS))) < 0 ? 1 : 0;
        ?? r10 = e3n.c(j4, ref$LongRef3.element) > 0 ? 1 : 0;
        rkd0 rkd0Var4 = this.$this_run.g;
        LogPriority logPriority4 = LogPriority.INFO;
        if (rkd0Var4.e(logPriority4)) {
            rkd0Var4.b(logPriority4, "SdkConfigurationRepositoryImpl", "getOrUpdateDeferred(): check for recharging rechargeEnd=" + ((Object) e3n.p(j4)) + ",currentTime=" + ((Object) e3n.p(ref$LongRef3.element)) + ",isRechargingTimeValid=" + ((boolean) r9) + ",isRechargingNow=" + ((boolean) r10), null);
        }
        if (r9 != 0 && r10 != 0) {
            StringBuilder sb2 = new StringBuilder("Rechanging now: rechargeEnd=");
            sb2.append((Object) e3n.p(j4));
            com.yandex.passport.internal.sloth.performers.usermenu.b.b(sb2, ", currentTime=", e3n.p(ref$LongRef3.element));
            return null;
        }
        com.yandex.plus.home.datasource.local.preferences.a aVar8 = this.$this_run.h;
        this.L$0 = ref$LongRef3;
        this.J$0 = j4;
        this.I$0 = r9;
        this.I$1 = r10;
        this.label = 2;
        a2 = aVar8.a(this);
        if (a2 != coroutineSingletons2) {
            i = r9;
            ref$LongRef = ref$LongRef3;
            i2 = r10;
            j = j4;
            if (a2 instanceof Result.Failure) {
            }
            o4zVar = (o4z) a2;
            if (o4zVar == null) {
            }
            r0 r0Var52 = this.$this_run.l;
            r0Var52.getClass();
            r0Var52.m(obj2, k5d0.a);
            a aVar72 = this.$this_run;
            this.L$0 = ref$LongRef;
            this.L$1 = o4zVar;
            this.J$0 = j;
            int i102 = i4;
            this.I$0 = i102;
            int i112 = i3;
            this.I$1 = i112;
            this.label = 3;
            a3 = a.a(aVar72, this);
            if (a3 != coroutineSingletons) {
            }
        }
        return coroutineSingletons2;
    }
}
