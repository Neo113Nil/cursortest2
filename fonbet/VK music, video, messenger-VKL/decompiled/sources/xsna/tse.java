package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsPlaylistsFolderNamingContent.kt */
@b6l(c = "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContentKt$InputTextField$1$1", f = "ClipsPlaylistsFolderNamingContent.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 123, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class tse extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isAnimated;
    final /* synthetic */ gzs<s3q0> $onAnimationEnd;
    final /* synthetic */ if2<Float, sq2> $shake;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tse(boolean z, if2<Float, sq2> if2Var, gzs<s3q0> gzsVar, spj<? super tse> spjVar) {
        super(2, spjVar);
        this.$isAnimated = z;
        this.$shake = if2Var;
        this.$onAnimationEnd = gzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tse(this.$isAnimated, this.$shake, this.$onAnimationEnd, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tse) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r0 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (xsna.if2.c(r0, r2, null, null, r13, 14) == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:14:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            if (this.$isAnimated) {
                i = 0;
                if (i >= 11) {
                }
                return coroutineSingletons;
            }
            return s3q0.a;
        }
        if (i2 == 1) {
            int i3 = this.I$0;
            kotlin.a.a(obj);
            i = i3;
            i++;
            if (i >= 11) {
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAnimationEnd.invoke();
            return s3q0.a;
        }
        int i4 = this.I$0;
        kotlin.a.a(obj);
        i = i4;
        Object c = obj;
        i++;
        if (i >= 11) {
            if2<Float, sq2> if2Var = this.$shake;
            Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.label = 3;
        } else if (i % 2 == 0) {
            if2<Float, sq2> if2Var2 = this.$shake;
            Float f2 = new Float(3.0f);
            xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100000.0f, null, 5);
            this.I$0 = i;
            this.label = 1;
            Object c3 = if2.c(if2Var2, f2, c2, null, this, 12);
            if (c3 != coroutineSingletons) {
                i++;
                if (i >= 11) {
                }
            }
        } else {
            if2<Float, sq2> if2Var3 = this.$shake;
            Float f3 = new Float(-3.0f);
            xmk0 c4 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100000.0f, null, 5);
            this.I$0 = i;
            this.label = 2;
            c = if2.c(if2Var3, f3, c4, null, this, 12);
        }
        return coroutineSingletons;
    }
}
