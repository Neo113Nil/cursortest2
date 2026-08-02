package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: BigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class e17 implements d160 {
    public final /* synthetic */ f12<?> b;
    public final /* synthetic */ Orientation c;

    /* compiled from: BigPlayerScaffold.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BigPlayerScaffold.kt", l = {657}, m = "onPostFling-RZ2iAVY")
    public static final class a extends ContinuationImpl {
        long J$0;
        long J$1;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e17.this.m0(0L, 0L, this);
        }
    }

    /* compiled from: BigPlayerScaffold.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "BigPlayerScaffold.kt", l = {648}, m = "onPreFling-QWom1Mo")
    public static final class b extends ContinuationImpl {
        float F$0;
        float F$1;
        long J$0;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e17.this.M(0L, this);
        }
    }

    public e17(f12<?> f12Var, Orientation orientation) {
        this.b = f12Var;
        this.c = orientation;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, spj<? super jmr0> spjVar) {
        b bVar;
        int i;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    float b2 = this.c == Orientation.Horizontal ? jmr0.b(j) : jmr0.c(j);
                    f12<?> f12Var = this.b;
                    float f = f12Var.f();
                    if (b2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f <= f12Var.c().e()) {
                        j = 0;
                    } else {
                        bVar.J$0 = j;
                        bVar.F$0 = b2;
                        bVar.F$1 = f;
                        bVar.label = 1;
                        if (f12Var.h(b2, bVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = bVar.J$0;
                    kotlin.a.a(obj);
                }
                return new jmr0(j);
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        return new jmr0(j);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i != 1) {
            return 0L;
        }
        return a(this.b.b(intBitsToFloat));
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (i == 1) {
            return a(this.b.b(Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j2 >> 32 : 4294967295L & j2))));
        }
        return 0L;
    }

    public final long a(float f) {
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.c;
        float f2 = orientation2 == orientation ? f : 0.0f;
        if (orientation2 != Orientation.Vertical) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    float b2 = this.c == Orientation.Horizontal ? jmr0.b(j2) : jmr0.c(j2);
                    aVar.J$0 = j;
                    aVar.J$1 = j2;
                    aVar.label = 1;
                    if (this.b.h(b2, aVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = aVar.J$1;
                    kotlin.a.a(obj);
                }
                return new jmr0(j2);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return new jmr0(j2);
    }
}
