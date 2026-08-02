package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s6r;

/* compiled from: FetchMarkerIconUseCase.kt */
@b6l(c = "com.vk.geo.impl.usecase.FetchMarkerIconUseCase$load$2", f = "FetchMarkerIconUseCase.kt", l = {68, 82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t6r extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ boolean $onlyFromCache;
    final /* synthetic */ String $url;
    final /* synthetic */ int $width;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6r(String str, boolean z, int i, int i2, spj<? super t6r> spjVar) {
        super(2, spjVar);
        this.$url = str;
        this.$onlyFromCache = z;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new t6r(this.$url, this.$onlyFromCache, this.$width, this.$height, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return ((t6r) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (r15 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r15 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q0v0 q0v0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$url.length() == 0 || (this.$onlyFromCache && !mcr0.n(this.$url))) {
                    return null;
                }
                q0v0Var = (this.$width <= 0 || this.$height <= 0) ? null : new q0v0(liw.a(), new Size(this.$width, this.$height), null);
                s6r.a aVar = s6r.a;
                int i2 = this.$width;
                int i3 = this.$height;
                this.L$0 = q0v0Var;
                this.label = 1;
                obj = aVar.a(i2, i3, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return (Bitmap) obj;
                }
                q0v0Var = (q0v0) this.L$0;
                kotlin.a.a(obj);
            }
            io.reactivex.rxjava3.internal.operators.observable.i2 m0 = mcr0.d(this.$width, this.$height, 94848, Uri.parse(this.$url), q0v0Var, (w9g0) obj, null, true, true).m0();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = sd9.f(m0, this);
        } catch (Throwable th) {
            L.E(th, "fail to fetch bitmap from url=%s", this.$url);
            return null;
        }
    }
}
