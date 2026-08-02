package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;

/* compiled from: PlayingIndication.kt */
@b6l(c = "com.vk.catalog.mvi.block.music.impl.ui.musictrack.playingindication.PlayingIndicationKt$PlayingIndication$1$1", f = "PlayingIndication.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class l6b0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
    final /* synthetic */ t6b0 $state;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: PlayingIndication.kt */
    @b6l(c = "com.vk.catalog.mvi.block.music.impl.ui.musictrack.playingindication.PlayingIndicationKt$PlayingIndication$1$1$1$1", f = "PlayingIndication.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super fq2<Float, sq2>>, Object> {
        final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
        final /* synthetic */ int $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, List list, spj spjVar) {
            super(2, spjVar);
            this.$animatedHeights = list;
            this.$it = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$it, this.$animatedHeights, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super fq2<Float, sq2>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
    public l6b0(t6b0 t6b0Var, List<if2<Float, sq2>> list, spj<? super l6b0> spjVar) {
        super(2, spjVar);
        this.$state = t6b0Var;
        this.$animatedHeights = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        l6b0 l6b0Var = new l6b0(this.$state, this.$animatedHeights, spjVar);
        l6b0Var.L$0 = obj;
        return l6b0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((l6b0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        do {
            t6b0 t6b0Var = this.$state;
            if (!t6b0Var.a) {
                return s3q0.a;
            }
            k9x q = swe0.q(0, t6b0Var.b);
            List<if2<Float, sq2>> list = this.$animatedHeights;
            arrayList = new ArrayList(c5g.u(q, 10));
            j9x it = q.iterator();
            while (it.d) {
                arrayList.add(myc0.b(yvjVar, null, null, new a(it.nextInt(), list, null), 3));
            }
            this.L$0 = yvjVar;
            this.label = 1;
        } while (fto0.e(arrayList, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
