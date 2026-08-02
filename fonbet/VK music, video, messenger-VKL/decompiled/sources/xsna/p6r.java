package xsna;

import android.graphics.Bitmap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FetchImageIconByCacheUseCase.kt */
@b6l(c = "com.vk.geo.impl.usecase.FetchImageIconByCacheUseCase$fetchFromCache$2", f = "FetchImageIconByCacheUseCase.kt", l = {82, 84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p6r extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ boolean $isWallPost;
    final /* synthetic */ int $size;
    int label;
    final /* synthetic */ q6r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6r(boolean z, q6r q6rVar, int i, String str, spj<? super p6r> spjVar) {
        super(2, spjVar);
        this.$isWallPost = z;
        this.this$0 = q6rVar;
        this.$size = i;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p6r(this.$isWallPost, this.this$0, this.$size, this.$imageUrl, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return ((p6r) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                return (Bitmap) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return (Bitmap) obj;
        }
        kotlin.a.a(obj);
        if (this.$isWallPost) {
            s6r s6rVar = (s6r) this.this$0.b.getValue();
            int i2 = this.$size;
            String str = this.$imageUrl;
            this.label = 1;
            s6rVar.getClass();
            obj = s6r.a(i2, i2, str, true, this);
        } else {
            s6r s6rVar2 = (s6r) this.this$0.b.getValue();
            int i3 = this.$size;
            String str2 = this.$imageUrl;
            this.label = 2;
            s6rVar2.getClass();
            obj = s6r.a(i3, i3, str2, true, this);
        }
        return coroutineSingletons;
    }
}
