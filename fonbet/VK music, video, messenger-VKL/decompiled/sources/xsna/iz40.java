package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: MusicPlayingOverlay.kt */
@b6l(c = "com.vk.music.compose.MusicPlayingOverlayKt$TrackPlayingBars$1$1$1", f = "MusicPlayingOverlay.kt", l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, VersionConstants.PRODUCT_MAJOR_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class iz40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
    final /* synthetic */ int $count;
    final /* synthetic */ List<Float> $initialFractions;
    final /* synthetic */ boolean $isAnimating;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* compiled from: MusicPlayingOverlay.kt */
    @b6l(c = "com.vk.music.compose.MusicPlayingOverlayKt$TrackPlayingBars$1$1$1$2$1", f = "MusicPlayingOverlay.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super fq2<Float, sq2>>, Object> {
        final /* synthetic */ List<if2<Float, sq2>> $animatedHeights;
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, List list, spj spjVar) {
            super(2, spjVar);
            this.$animatedHeights = list;
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$index, this.$animatedHeights, spjVar);
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
            if2<Float, sq2> if2Var = this.$animatedHeights.get(this.$index);
            Random.b.getClass();
            Float f = new Float(((float) Math.cbrt(Random.c.i() * 1000000)) / 100.0f);
            dtp0 d = jq2.d(250, 0, luo.a, 2);
            this.label = 1;
            Object c = if2.c(if2Var, f, d, null, this, 12);
            return c == coroutineSingletons ? coroutineSingletons : c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz40(boolean z, List<if2<Float, sq2>> list, int i, List<Float> list2, spj<? super iz40> spjVar) {
        super(2, spjVar);
        this.$isAnimating = z;
        this.$animatedHeights = list;
        this.$count = i;
        this.$initialFractions = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        iz40 iz40Var = new iz40(this.$isAnimating, this.$animatedHeights, this.$count, this.$initialFractions, spjVar);
        iz40Var.L$0 = obj;
        return iz40Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((iz40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List<Float> list;
        int i;
        int i2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.a.a(obj);
            if (!this.$isAnimating) {
                List<if2<Float, sq2>> list2 = this.$animatedHeights;
                List<Float> list3 = this.$initialFractions;
                it = list2.iterator();
                list = list3;
                i = 0;
                i2 = 0;
                while (it.hasNext()) {
                }
                return s3q0.a;
            }
            while (zvj.f(yvjVar)) {
            }
            return s3q0.a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            while (zvj.f(yvjVar)) {
                k9x q = swe0.q(0, this.$count);
                List<if2<Float, sq2>> list4 = this.$animatedHeights;
                ArrayList arrayList = new ArrayList(c5g.u(q, 10));
                j9x it2 = q.iterator();
                while (it2.d) {
                    arrayList.add(myc0.b(yvjVar, null, null, new a(it2.nextInt(), list4, null), 3));
                }
                this.L$0 = yvjVar;
                this.label = 2;
                if (fto0.e(arrayList, this) == coroutineSingletons) {
                }
            }
            return s3q0.a;
        }
        int i4 = this.I$1;
        i2 = this.I$0;
        it = (Iterator) this.L$3;
        list = (List) this.L$2;
        kotlin.a.a(obj);
        i = i4;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Float f = list.get(i);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = list;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = i2;
            this.I$1 = i5;
            this.I$2 = i;
            this.I$3 = 0;
            this.label = 1;
            if (((if2) next).e(f, this) != coroutineSingletons) {
                i = i5;
            }
        }
        return s3q0.a;
        return coroutineSingletons;
    }
}
