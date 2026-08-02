package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.iht0;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1", f = "InitDelegate.kt", l = {167}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class hyw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_registerFocusSlot;
    int label;

    /* compiled from: InitDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1$1", f = "InitDelegate.kt", l = {174, 186}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<bms0, spj<? super s3q0>, Object> {
        final /* synthetic */ ars0 $this_registerFocusSlot;
        int label;

        /* compiled from: InitDelegate.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1$1$2", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.hyw$a$a, reason: collision with other inner class name */
        public static final class C3027a extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
            final /* synthetic */ ars0 $this_registerFocusSlot;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3027a(ars0 ars0Var, spj<? super C3027a> spjVar) {
                super(2, spjVar);
                this.$this_registerFocusSlot = ars0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3027a c3027a = new C3027a(this.$this_registerFocusSlot, spjVar);
                c3027a.L$0 = obj;
                return c3027a;
            }

            @Override // xsna.wzs
            public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
                return ((C3027a) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yg5 yg5Var = (yg5) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                fjz fjzVar = ((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).v;
                if (fjzVar != null) {
                    if (((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).t.f) {
                        fjzVar.resume();
                    } else {
                        fjzVar.pause();
                    }
                }
                com.vk.libvideo.autoplay.a aVar = ((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).s;
                if (aVar != null) {
                    yg5Var.a0(aVar);
                }
                yg5Var.D();
                return s3q0.a;
            }
        }

        /* compiled from: InitDelegate.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1$1$3", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
            final /* synthetic */ ars0 $this_registerFocusSlot;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ars0 ars0Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$this_registerFocusSlot = ars0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                b bVar = new b(this.$this_registerFocusSlot, spjVar);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // xsna.wzs
            public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
                return ((b) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yg5 yg5Var = (yg5) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                fjz fjzVar = ((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).v;
                if (fjzVar != null) {
                    fjzVar.resume();
                }
                com.vk.libvideo.autoplay.a aVar = ((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).s;
                if (aVar != null) {
                    yg5Var.a0(aVar);
                }
                yg5Var.D();
                yg5Var.play();
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ars0 ars0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_registerFocusSlot = ars0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$this_registerFocusSlot, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(bms0 bms0Var, spj<? super s3q0> spjVar) {
            return ((a) create(bms0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (r6.y(r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (r6.y(r1, r5) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                m0b0.a(this.$this_registerFocusSlot);
                this.$this_registerFocusSlot.m(new tcu(5));
                if (!((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).t.g) {
                    ars0 ars0Var = this.$this_registerFocusSlot;
                    if (ars0Var.g) {
                        C3027a c3027a = new C3027a(ars0Var, null);
                        this.label = 1;
                    } else {
                        b bVar = new b(ars0Var, null);
                        this.label = 2;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: InitDelegate.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1$2", f = "InitDelegate.kt", l = {198}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<bms0, spj<? super s3q0>, Object> {
        final /* synthetic */ ars0 $this_registerFocusSlot;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: InitDelegate.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerFocusSlot$1$2$2", f = "InitDelegate.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
            final /* synthetic */ ars0 $this_registerFocusSlot;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ars0 ars0Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$this_registerFocusSlot = ars0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$this_registerFocusSlot, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
                return ((a) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yg5 yg5Var = (yg5) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                fjz fjzVar = ((VideoLargeListState) ((b2a) this.$this_registerFocusSlot.b.b).getCurrentState()).v;
                if (fjzVar != null) {
                    fjzVar.pause();
                }
                yg5Var.C(true);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ars0 ars0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_registerFocusSlot = ars0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$this_registerFocusSlot, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(bms0 bms0Var, spj<? super s3q0> spjVar) {
            return ((b) create(bms0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            bms0 bms0Var = (bms0) this.L$0;
            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.$this_registerFocusSlot.m(new ehu(4));
                ars0 ars0Var = this.$this_registerFocusSlot;
                if (!ars0Var.g && !bms0Var.c) {
                    a aVar = new a(ars0Var, null);
                    this.L$0 = null;
                    this.label = 1;
                    yg5 yg5Var = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).r;
                    if (yg5Var != null) {
                        bdn bdnVar = bdn.a;
                        obj2 = myc0.k(ie00.a, new ers0(aVar, yg5Var, null), this);
                        if (obj2 != obj3) {
                            obj2 = s3q0.a;
                        }
                    } else {
                        obj2 = s3q0.a;
                    }
                    if (obj2 == obj3) {
                        return obj3;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyw(ars0 ars0Var, spj<? super hyw> spjVar) {
        super(2, spjVar);
        this.$this_registerFocusSlot = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hyw(this.$this_registerFocusSlot, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hyw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ars0 ars0Var = this.$this_registerFocusSlot;
            com.vk.video.focus.api.a aVar = ars0Var.d;
            iht0.c cVar = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).p;
            a aVar2 = new a(this.$this_registerFocusSlot, null);
            b bVar = new b(this.$this_registerFocusSlot, null);
            this.label = 1;
            Object collect = aVar.a().collect(new zls0(cVar, bVar, aVar2), this);
            if (collect != obj2) {
                collect = s3q0.a;
            }
            if (collect == obj2) {
                return obj2;
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
