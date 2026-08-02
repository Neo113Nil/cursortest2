package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import xsna.tuw;

/* compiled from: PlayingIndication.kt */
@b6l(c = "com.vk.music.playlist.framework.presentation.indication.PlayingIndicationKt$PlayingIndication$1$1", f = "PlayingIndication.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h6b0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
    final /* synthetic */ t5b0 $config;
    final /* synthetic */ boolean $isAnimating;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: PlayingIndication.kt */
    @b6l(c = "com.vk.music.playlist.framework.presentation.indication.PlayingIndicationKt$PlayingIndication$1$1$1", f = "PlayingIndication.kt", l = {64}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements izs<spj<? super List<? extends fq2<Float, sq2>>>, Object> {
        final /* synthetic */ yvj $$this$LaunchedEffect;
        final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
        final /* synthetic */ t5b0 $config;
        int label;

        /* compiled from: PlayingIndication.kt */
        @b6l(c = "com.vk.music.playlist.framework.presentation.indication.PlayingIndicationKt$PlayingIndication$1$1$1$1$1", f = "PlayingIndication.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: xsna.h6b0$a$a, reason: collision with other inner class name */
        public static final class C2975a extends SuspendLambda implements wzs<yvj, spj<? super fq2<Float, sq2>>, Object> {
            final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
            final /* synthetic */ int $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2975a(int i, List list, spj spjVar) {
                super(2, spjVar);
                this.$animatedHeights = list;
                this.$it = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2975a(this.$it, this.$animatedHeights, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super fq2<Float, sq2>> spjVar) {
                return ((C2975a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = this.$animatedHeights.get(this.$it);
                Random.b.getClass();
                Float f = new Float(((float) Math.cbrt(Random.c.i() * 1000000)) / 100.0f);
                dtp0 d = jq2.d(250, 0, luo.a, 2);
                this.label = 1;
                Object c = if2.c(if2Var, f, d, null, this, 12);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t5b0 t5b0Var, yvj yvjVar, List<if2<Float, sq2>> list, spj<? super a> spjVar) {
            super(1, spjVar);
            this.$config = t5b0Var;
            this.$$this$LaunchedEffect = yvjVar;
            this.$animatedHeights = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new a(this.$config, this.$$this$LaunchedEffect, this.$animatedHeights, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<? super List<? extends fq2<Float, sq2>>> spjVar) {
            return ((a) create(spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            k9x q = swe0.q(0, this.$config.a);
            yvj yvjVar = this.$$this$LaunchedEffect;
            List<if2<Float, sq2>> list = this.$animatedHeights;
            ArrayList arrayList = new ArrayList(c5g.u(q, 10));
            j9x it = q.iterator();
            while (it.d) {
                arrayList.add(myc0.b(yvjVar, null, null, new C2975a(it.nextInt(), list, null), 3));
            }
            this.label = 1;
            Object e = fto0.e(arrayList, this);
            return e == coroutineSingletons ? coroutineSingletons : e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6b0(boolean z, t5b0 t5b0Var, List<if2<Float, sq2>> list, spj<? super h6b0> spjVar) {
        super(2, spjVar);
        this.$isAnimating = z;
        this.$config = t5b0Var;
        this.$animatedHeights = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        h6b0 h6b0Var = new h6b0(this.$isAnimating, this.$config, this.$animatedHeights, spjVar);
        h6b0Var.L$0 = obj;
        return h6b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h6b0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        while (this.$isAnimating) {
            a aVar = new a(this.$config, yvjVar, this.$animatedHeights, null);
            this.L$0 = yvjVar;
            this.label = 1;
            tuw tuwVar = (tuw) yvjVar.getCoroutineContext().get(tuw.a.b);
            if ((tuwVar == null ? aVar.invoke(this) : tuwVar.r()) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return s3q0.a;
    }
}
