package com.yandex.mob.okhttp;

import com.yandex.mob.network.MobNetworkErrorType;
import defpackage.cvw;
import defpackage.d5j0;
import defpackage.e3n;
import defpackage.ep20;
import defpackage.eq20;
import defpackage.flv;
import defpackage.fq20;
import defpackage.go20;
import defpackage.gr20;
import defpackage.ho20;
import defpackage.kp50;
import defpackage.ll20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.qoi0;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.tl20;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.xl20;
import defpackage.zp20;
import defpackage.zy11;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgq20;", "<anonymous>", "(Ltse;)Lgq20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.okhttp.OkHttpMobAvailabilityGateway$ping$2", f = "OkHttpMobAvailabilityGateway.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class OkHttpMobAvailabilityGateway$ping$2 extends SuspendLambda implements wls {
    final /* synthetic */ go20 $headers;
    final /* synthetic */ pr20 $mobSelectedProxy;
    final /* synthetic */ gr20 $options;
    final /* synthetic */ oq20 $query;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpMobAvailabilityGateway$ping$2(pr20 pr20Var, oq20 oq20Var, go20 go20Var, a aVar, gr20 gr20Var, Continuation continuation) {
        super(2, continuation);
        this.$mobSelectedProxy = pr20Var;
        this.$query = oq20Var;
        this.$headers = go20Var;
        this.this$0 = aVar;
        this.$options = gr20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OkHttpMobAvailabilityGateway$ping$2(this.$mobSelectedProxy, this.$query, this.$headers, this.this$0, this.$options, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OkHttpMobAvailabilityGateway$ping$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pr20 pr20Var = this.$mobSelectedProxy;
            oq20 oq20Var = this.$query;
            go20 go20Var = this.$headers;
            t4j0 t4j0Var = new t4j0();
            t4j0Var.c();
            t4j0Var.a = tje.p(pr20Var, oq20Var, "/ping");
            t4j0Var.e = t4j0Var.e.E(qoi0.a(Object.class), new ho20(cvw.K(pr20Var)));
            t4j0Var.c = wwg.y(go20Var.a).d();
            d5j0 d5j0Var = new d5j0(t4j0Var);
            OkHttpClient a = ((flv) this.this$0.a).a();
            o430 o430Var = e3n.b;
            int i2 = this.$options.a;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            long U = kp50.U(i2, durationUnit);
            Duration ofSeconds = Duration.ofSeconds(e3n.o(U, durationUnit), e3n.g(U));
            OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1 okHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1 = new OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1(a, d5j0Var, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = U;
            this.I$0 = 0;
            this.label = 1;
            obj = kotlinx.coroutines.a.w(ofSeconds.compareTo(Duration.ZERO) <= 0 ? 0L : ofSeconds.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (ofSeconds.getSeconds() < 9223372036854775L || (ofSeconds.getSeconds() == 9223372036854775L && ofSeconds.getNano() < 807000000)) ? ofSeconds.toMillis() : ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, okHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1, this);
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
        xl20 xl20Var = (xl20) obj;
        if (xl20Var instanceof tl20) {
            return eq20.a;
        }
        if (xl20Var instanceof ll20) {
            return new fq20(MobNetworkErrorType.Http);
        }
        if (xl20Var instanceof ep20) {
            return new fq20(((ep20) xl20Var).b);
        }
        if (!(xl20Var instanceof zp20) && xl20Var != null) {
            w511.b();
            return null;
        }
        return new fq20(MobNetworkErrorType.Unknown);
    }
}
