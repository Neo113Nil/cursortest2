package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.services.UnityAdsConstants;
import com.vk.reefton.protocol.ReefProtocol$Event;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CursorAnimationState.kt */
@b6l(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class zlk extends SuspendLambda implements wzs<yvj, spj<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ amk this$0;

    /* compiled from: CursorAnimationState.kt */
    @b6l(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 79, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ eyx $oldJob;
        int label;
        final /* synthetic */ amk this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eyx eyxVar, amk amkVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$oldJob = eyxVar;
            this.this$0 = amkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$oldJob, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
        
            if (xsna.qsl.b(500, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
        
            if (xsna.iyx.c(r11, r10) == r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0077 -> B:9:0x007a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    eyx eyxVar = this.$oldJob;
                    if (eyxVar != null) {
                        this.label = 1;
                    }
                } else if (i == 1) {
                    kotlin.a.a(obj);
                } else {
                    if (i == 2) {
                        kotlin.a.a(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i == 3) {
                        kotlin.a.a(obj);
                        ((vak0) this.this$0.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.label = 4;
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        ((vak0) this.this$0.c).g(1.0f);
                        this.label = 3;
                        if (qsl.b(500L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ((vak0) this.this$0.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        this.label = 4;
                    }
                }
                ((vak0) this.this$0.c).g(1.0f);
                if (!this.this$0.a) {
                    this.label = 2;
                    if (qsl.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    throw new KotlinNothingValueException();
                }
                this.label = 3;
                if (qsl.b(500L, this) == coroutineSingletons) {
                }
                ((vak0) this.this$0.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.label = 4;
            } catch (Throwable th) {
                ((vak0) this.this$0.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlk(amk amkVar, spj<? super zlk> spjVar) {
        super(2, spjVar);
        this.this$0 = amkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zlk zlkVar = new zlk(this.this$0, spjVar);
        zlkVar.L$0 = obj;
        return zlkVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Boolean> spjVar) {
        return ((zlk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        yvj yvjVar = (yvj) this.L$0;
        eyx andSet = this.this$0.b.getAndSet(null);
        amk amkVar = this.this$0;
        AtomicReference<eyx> atomicReference = amkVar.b;
        yok0 h = myc0.h(yvjVar, null, null, new a(andSet, amkVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, h)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
