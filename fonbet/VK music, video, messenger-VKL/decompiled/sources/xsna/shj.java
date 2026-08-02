package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zqe;

/* compiled from: Content.kt */
@b6l(c = "com.vk.clips.playlists.playlist_ui.ui.ContentKt$ClipsPlaylistUiView$3$1", f = "Content.kt", l = {111, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class shj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasNext;
    final /* synthetic */ boolean $hasPrev;
    final /* synthetic */ izs<zqe, s3q0> $onAction;
    final /* synthetic */ zzf0 $state;
    int label;

    /* compiled from: Content.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ izs<zqe, s3q0> c;
        public final /* synthetic */ boolean d;

        public a(izs izsVar, boolean z, boolean z2) {
            this.b = z;
            this.c = izsVar;
            this.d = z2;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            Pair pair = (Pair) obj;
            boolean booleanValue = ((Boolean) pair.d()).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.g()).booleanValue();
            izs<zqe, s3q0> izsVar = this.c;
            if (booleanValue && this.b) {
                izsVar.invoke(zqe.k.b);
            } else if (booleanValue2 && this.d) {
                izsVar.invoke(zqe.j.b);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public shj(zzf0 zzf0Var, boolean z, izs<? super zqe, s3q0> izsVar, boolean z2, spj<? super shj> spjVar) {
        super(2, spjVar);
        this.$state = zzf0Var;
        this.$hasPrev = z;
        this.$onAction = izsVar;
        this.$hasNext = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new shj(this.$state, this.$hasPrev, this.$onAction, this.$hasNext, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((shj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xsna.qsl.b(400, r6) == r0) goto L15;
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
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        izg0 M = nr2.M(new defpackage.k(this.$state, 29));
        a aVar = new a(this.$onAction, this.$hasPrev, this.$hasNext);
        this.label = 2;
    }
}
