package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;

/* compiled from: PullRefresh.kt */
/* loaded from: classes11.dex */
public final class xfe0 implements d160 {
    public final lpd b;
    public final wfe0 c;
    public final boolean d;

    /* compiled from: PullRefresh.kt */
    @b6l(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {JsonToken.BOOLEAN}, m = "onPreFling-QWom1Mo", v = 1)
    public static final class a extends ContinuationImpl {
        float F$0;
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return xfe0.this.M(0L, this);
        }
    }

    public xfe0(lpd lpdVar, wfe0 wfe0Var, boolean z) {
        this.b = lpdVar;
        this.c = wfe0Var;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.d160
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, spj<? super jmr0> spjVar) {
        a aVar;
        int i;
        float f;
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
                    Float f2 = new Float(jmr0.c(j));
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar.F$0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar.label = 1;
                    obj = this.c.invoke(f2, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = aVar.F$0;
                    kotlin.a.a(obj);
                }
                return new jmr0(m200.b(f, ((Number) obj).floatValue()));
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return new jmr0(m200.b(f, ((Number) obj2).floatValue()));
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        if (!this.d || i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float floatValue = ((Number) this.b.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (4294967295L & Float.floatToRawIntBits(floatValue));
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (!this.d || i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float floatValue = ((Number) this.b.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (4294967295L & Float.floatToRawIntBits(floatValue)) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }
}
