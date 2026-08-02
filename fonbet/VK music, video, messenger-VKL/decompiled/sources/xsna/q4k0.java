package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.g4k0;

/* compiled from: SmartCropInlineActor.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$initPlayer$1", f = "SmartCropInlineActor.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class q4k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ w4k0 this$0;

    /* compiled from: SmartCropInlineActor.kt */
    @b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$initPlayer$1$1", f = "SmartCropInlineActor.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ w4k0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w4k0 w4k0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = w4k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                gpt0 gpt0Var = gpt0.a;
                m7q d = gpt0.d(this.this$0.c.b);
                sht0 e = jgz.e(d);
                w4k0 w4k0Var = this.this$0;
                o1b0.g(w4k0Var.e, d, null, false, true, new rxz(w4k0Var, 25), null, 992);
                rdi.y(this.this$0, new pf40(e, 20));
                OneVideoPlayer a = this.this$0.e.a(e);
                rdi.y(this.this$0, new bl30(a, 19));
                final w4k0 w4k0Var2 = this.this$0;
                w4k0Var2.getClass();
                OneVideoPlayer.d dVar = new OneVideoPlayer.d() { // from class: xsna.n4k0
                    @Override // one.video.player.OneVideoPlayer.d
                    public final void C(BaseVideoPlayer baseVideoPlayer, long j) {
                        w4k0 w4k0Var3 = w4k0.this;
                        ((SmartCropState) w4k0Var3.b.getCurrentState()).e.setValue(Long.valueOf(j));
                        q500 q500Var = ((SmartCropState) w4k0Var3.b.getCurrentState()).f;
                        long j2 = q500Var.b;
                        if (j > q500Var.c || j2 > j) {
                            baseVideoPlayer.seekTo(j2);
                        }
                    }
                };
                a.s(dVar);
                rdi.y(this.this$0, new aj50(dVar, 23));
                a.n0(e, ((SmartCropState) this.this$0.b.getCurrentState()).f.b);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
                this.this$0.c(new g4k0.a(true));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4k0(w4k0 w4k0Var, spj<? super q4k0> spjVar) {
        super(2, spjVar);
        this.this$0 = w4k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q4k0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q4k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, null);
            this.label = 1;
            if (myc0.k(ge00Var, aVar, this) == coroutineSingletons) {
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
