package xsna;

import com.vk.push.common.Logger;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.b6l;
import xsna.bk10;
import xsna.epx;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: StartPushServiceInteractor.kt */
/* loaded from: classes5.dex */
public final class oqk0 {
    public final ia80 a;
    public final os9 b;
    public final bk10 c;
    public final ovj d;
    public final Logger e;

    public oqk0(ia80 ia80Var, os9 os9Var, bk10 bk10Var, Logger logger) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = ia80Var;
        this.b = os9Var;
        this.c = bk10Var;
        this.d = wglVar;
        this.e = logger.createLogger(this);
    }

    public static final Object a(oqk0 oqk0Var, int i, boolean z, izs izsVar, SuspendLambda suspendLambda) {
        Logger logger = oqk0Var.e;
        Logger.DefaultImpls.info$default(logger, "Push tokens count = " + i + ", is host a master = " + z, null, 2, null);
        if (i <= 0 || !z) {
            return s3q0.a;
        }
        Logger.DefaultImpls.info$default(logger, "Start push service invoke", null, 2, null);
        Object invoke = izsVar.invoke(suspendLambda);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
    }

    public final void b(yvj yvjVar, wv2 wv2Var) {
        ksr l = rsr.l(((ske0) this.b.c).k());
        final bk10 bk10Var = this.c;
        final ksr<bk10.a> flow = bk10Var.b.flow();
        ztr ztrVar = new ztr(l, new ksr<Boolean>() { // from class: com.vk.push.pushsdk.data.repository.MasterInfoRepository$isHostMasterFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.vk.push.pushsdk.data.repository.MasterInfoRepository$isHostMasterFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ bk10 c;

                /* compiled from: Emitters.kt */
                @b6l(c = "com.vk.push.pushsdk.data.repository.MasterInfoRepository$isHostMasterFlow$$inlined$map$1$2", f = "MasterInfoRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                /* renamed from: com.vk.push.pushsdk.data.repository.MasterInfoRepository$isHostMasterFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, bk10 bk10Var) {
                    this.b = lsrVar;
                    this.c = bk10Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                bk10.a aVar = (bk10.a) obj;
                                Boolean valueOf = Boolean.valueOf(epx.f(aVar != null ? aVar.a : null, this.c.a.getPackageName()));
                                anonymousClass1.label = 1;
                                if (this.b.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super Boolean> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, bk10Var), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, new mqk0(this, wv2Var, null));
        ovj ovjVar = this.d;
        rsr.s(rsr.q(ztrVar, ovjVar), yvjVar);
        ia80 ia80Var = this.a;
        ia80Var.getClass();
        rsr.s(rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.q(rsr.i(new ha80(ia80Var, null)), ia80Var.b), new nqk0(this, wv2Var, null)), ovjVar), yvjVar);
    }
}
