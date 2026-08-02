package xsna;

import com.vk.core.apps.BuildInfo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.iht0;
import xsna.ovj;
import xsna.pvj;
import xsna.u8f0;

/* compiled from: VideoFocusInteractorImpl.kt */
/* loaded from: classes11.dex */
public final class vls0 implements com.vk.video.focus.api.a {
    public final yfs b;
    public final utk0 c = vtk0.a(null);
    public final caj0 d;
    public final caj0 e;
    public final hpj f;
    public final ArrayList g;
    public final LinkedHashMap h;
    public final ArrayList i;

    /* compiled from: VideoFocusInteractorImpl.kt */
    @b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$1", f = "VideoFocusInteractorImpl.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: VideoFocusInteractorImpl.kt */
        @b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$1$1", f = "VideoFocusInteractorImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.vls0$a$a, reason: collision with other inner class name */
        public static final class C3895a extends SuspendLambda implements wzs<jht0, spj<? super Boolean>, Object> {
            int label;
            final /* synthetic */ vls0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3895a(vls0 vls0Var, spj<? super C3895a> spjVar) {
                super(2, spjVar);
                this.this$0 = vls0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3895a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(jht0 jht0Var, spj<? super Boolean> spjVar) {
                return ((C3895a) create(jht0Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return Boolean.valueOf(!this.this$0.g.isEmpty());
            }
        }

        /* compiled from: VideoFocusInteractorImpl.kt */
        @b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$1$2", f = "VideoFocusInteractorImpl.kt", l = {63}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements yzs<lsr<? super Long>, Boolean, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ vls0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(vls0 vls0Var, spj<? super b> spjVar) {
                super(3, spjVar);
                this.this$0 = vls0Var;
            }

            @Override // xsna.yzs
            public final Object invoke(lsr<? super Long> lsrVar, Boolean bool, spj<? super s3q0> spjVar) {
                boolean booleanValue = bool.booleanValue();
                b bVar = new b(this.this$0, spjVar);
                bVar.L$0 = lsrVar;
                bVar.Z$0 = booleanValue;
                return bVar.invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                lsr lsrVar = (lsr) this.L$0;
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if (z) {
                        ksr<Long> a = this.this$0.b.a();
                        this.L$0 = null;
                        this.Z$0 = z;
                        this.label = 1;
                        if (rsr.m(lsrVar, a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        /* compiled from: VideoFocusInteractorImpl.kt */
        @b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$1$3", f = "VideoFocusInteractorImpl.kt", l = {66}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements wzs<Long, spj<? super s3q0>, Object> {
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ vls0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(vls0 vls0Var, spj<? super c> spjVar) {
                super(2, spjVar);
                this.this$0 = vls0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                c cVar = new c(this.this$0, spjVar);
                cVar.J$0 = ((Number) obj).longValue();
                return cVar;
            }

            @Override // xsna.wzs
            public final Object invoke(Long l, spj<? super s3q0> spjVar) {
                return ((c) create(Long.valueOf(l.longValue()), spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long j = this.J$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    vls0 vls0Var = this.this$0;
                    u8f0.a aVar = new u8f0.a(j);
                    this.J$0 = j;
                    this.label = 1;
                    if (vls0.g(vls0Var, aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return vls0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                vls0 vls0Var = vls0.this;
                caj0 caj0Var = vls0Var.e;
                C3895a c3895a = new C3895a(vls0Var, null);
                int i2 = mtr.a;
                xya y = rsr.y(rsr.l(rsr.y(caj0Var, new ltr(c3895a, null))), new b(vls0.this, null));
                c cVar = new c(vls0.this, null);
                this.label = 1;
                if (rsr.k(y, cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class b extends kotlin.coroutines.a implements pvj {
        @Override // xsna.pvj
        public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
            if (BuildInfo.h()) {
                throw th;
            }
        }
    }

    /* compiled from: VideoFocusInteractorImpl.kt */
    @b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$updateVideoSlotInfo$2", f = "VideoFocusInteractorImpl.kt", l = {135, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<jht0, jht0> $block;
        final /* synthetic */ iht0 $slot;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(iht0 iht0Var, izs<? super jht0, ? extends jht0> izsVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$slot = iht0Var;
            this.$block = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return vls0.this.new c(this.$slot, this.$block, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            if (xsna.vls0.g(r9, r4, r8) != r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            jht0 invoke;
            jht0 jht0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                jht0 jht0Var2 = (jht0) vls0.this.h.get(this.$slot);
                if (jht0Var2 != null) {
                    invoke = this.$block.invoke(jht0Var2);
                    vls0.this.h.put(this.$slot, invoke);
                    caj0 caj0Var = vls0.this.e;
                    this.L$0 = jht0Var2;
                    this.L$1 = invoke;
                    this.label = 1;
                    if (caj0Var.emit(invoke, this) != coroutineSingletons) {
                        jht0Var = jht0Var2;
                        vls0 vls0Var = vls0.this;
                        u8f0.b bVar = new u8f0.b(this.$slot, epx.f(vls0Var.c.getValue(), this.$slot), jht0Var, invoke);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                    }
                    return coroutineSingletons;
                }
                return s3q0.a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            invoke = (jht0) this.L$1;
            jht0Var = (jht0) this.L$0;
            kotlin.a.a(obj);
            vls0 vls0Var2 = vls0.this;
            u8f0.b bVar2 = new u8f0.b(this.$slot, epx.f(vls0Var2.c.getValue(), this.$slot), jht0Var, invoke);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
    }

    public vls0(yfs yfsVar) {
        this.b = yfsVar;
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        this.d = lyd.b(0, 1, bufferOverflow, 1);
        this.e = lyd.b(0, 1, bufferOverflow, 1);
        vhn0 a2 = whn0.a();
        ovj a3 = hqu0.a();
        ovj.a aVar = ovj.b;
        hpj a4 = zvj.a(d.a.a(a2, a3.T(1)).plus(new b(pvj.a.b)));
        this.f = a4;
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wml());
        this.i = arrayList;
        myc0.h(a4, null, null, new a(null), 3);
    }

    public static final Object g(vls0 vls0Var, u8f0 u8f0Var, SuspendLambda suspendLambda) {
        Object k = myc0.k(vls0Var.f.b, new wls0(vls0Var, u8f0Var, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // com.vk.video.focus.api.a
    public final ksr a() {
        return this.d;
    }

    @Override // com.vk.video.focus.api.a
    public final void b(ams0 ams0Var) {
        this.i.add(ams0Var);
    }

    @Override // com.vk.video.focus.api.a
    public final void c(ams0 ams0Var) {
        this.i.remove(ams0Var);
    }

    @Override // com.vk.video.focus.api.a
    public final void d(iht0.c cVar) {
        myc0.h(this.f, null, null, new yls0(this, cVar, null), 3);
    }

    @Override // com.vk.video.focus.api.a
    public final void e(iht0 iht0Var, izs<? super jht0, ? extends jht0> izsVar) {
        myc0.h(this.f, null, null, new c(iht0Var, izsVar, null), 3);
    }

    @Override // com.vk.video.focus.api.a
    public final void f(iht0.c cVar, jht0 jht0Var) {
        myc0.h(this.f, null, null, new xls0(this, cVar, jht0Var, null), 3);
    }
}
