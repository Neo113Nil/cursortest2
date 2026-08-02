package xsna;

import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.iht0;

/* compiled from: VideoTrailerInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$registerFocusSlot$1", f = "VideoTrailerInlineActor.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class gmt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ylt0 this$0;

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$registerFocusSlot$1$1", f = "VideoTrailerInlineActor.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<bms0, spj<? super s3q0>, Object> {
        int I$0;
        int label;
        final /* synthetic */ ylt0 this$0;

        /* compiled from: VideoTrailerInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$registerFocusSlot$1$1$2", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.gmt0$a$a, reason: collision with other inner class name */
        public static final class C2949a extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
            final /* synthetic */ boolean $shouldPlay;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ylt0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2949a(ylt0 ylt0Var, boolean z, spj<? super C2949a> spjVar) {
                super(2, spjVar);
                this.this$0 = ylt0Var;
                this.$shouldPlay = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2949a c2949a = new C2949a(this.this$0, this.$shouldPlay, spjVar);
                c2949a.L$0 = obj;
                return c2949a;
            }

            @Override // xsna.wzs
            public final Object invoke(yg5 yg5Var, spj<? super s3q0> spjVar) {
                return ((C2949a) create(yg5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                yg5 yg5Var = (yg5) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                com.vk.libvideo.autoplay.a aVar = ((VideoTrailerView$State) ((b2a) this.this$0.b.b).getCurrentState()).f;
                if (aVar != null) {
                    yg5Var.a0(aVar);
                }
                yg5Var.D();
                if (this.$shouldPlay) {
                    yg5Var.play();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ylt0 ylt0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = ylt0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(bms0 bms0Var, spj<? super s3q0> spjVar) {
            return ((a) create(bms0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r10v30 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.m(new w9l0(12));
                ?? r10 = (!((VideoTrailerView$State) ((b2a) this.this$0.b.b).getCurrentState()).m || ((VideoTrailerView$State) ((b2a) this.this$0.b.b).getCurrentState()).g.n) ? 0 : 1;
                ylt0 ylt0Var = this.this$0;
                C2949a c2949a = new C2949a(ylt0Var, r10, null);
                this.I$0 = r10;
                this.label = 1;
                b2a b2aVar = (b2a) ylt0Var.b.b;
                yg5 yg5Var = ((VideoTrailerView$State) b2aVar.getCurrentState()).e;
                VideoTextureView videoTextureView = ((VideoTrailerView$State) b2aVar.getCurrentState()).h.get();
                com.vk.libvideo.autoplay.a aVar = ((VideoTrailerView$State) b2aVar.getCurrentState()).f;
                if (yg5Var == null || videoTextureView == null || aVar == null) {
                    obj2 = s3q0.a;
                } else {
                    bdn bdnVar = bdn.a;
                    obj2 = myc0.k(ie00.a, new imt0(yg5Var, videoTextureView, aVar, c2949a, null), this);
                    if (obj2 != obj3) {
                        obj2 = s3q0.a;
                    }
                }
                if (obj2 == obj3) {
                    return obj3;
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

    /* compiled from: VideoTrailerInlineActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$registerFocusSlot$1$2", f = "VideoTrailerInlineActor.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<bms0, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ylt0 this$0;

        /* compiled from: VideoTrailerInlineActor.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerInlineActor$registerFocusSlot$1$2$2", f = "VideoTrailerInlineActor.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yg5, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(2, spjVar);
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
                yg5Var.C(true);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ylt0 ylt0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.this$0 = ylt0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.this$0, spjVar);
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
                ylt0 ylt0Var = this.this$0;
                ylt0Var.m(new b8e0(ylt0Var, 25));
                if (!bms0Var.c) {
                    ylt0 ylt0Var2 = this.this$0;
                    a aVar = new a(2, null);
                    this.L$0 = null;
                    this.label = 1;
                    yg5 yg5Var = ((VideoTrailerView$State) ((b2a) ylt0Var2.b.b).getCurrentState()).e;
                    if (yg5Var != null) {
                        bdn bdnVar = bdn.a;
                        obj2 = myc0.k(ie00.a, new hmt0(aVar, yg5Var, null), this);
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
    public gmt0(ylt0 ylt0Var, spj<? super gmt0> spjVar) {
        super(2, spjVar);
        this.this$0 = ylt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gmt0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gmt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ylt0 ylt0Var = this.this$0;
            com.vk.video.focus.api.a aVar = ylt0Var.d;
            iht0.c cVar = ((VideoTrailerView$State) ((b2a) ylt0Var.b.b).getCurrentState()).i;
            a aVar2 = new a(this.this$0, null);
            b bVar = new b(this.this$0, null);
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
