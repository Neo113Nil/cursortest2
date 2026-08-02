package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.k0k;

/* compiled from: CoverChooseInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.presentation.feature.store.CoverChooseInlineActor$saveCoverAndClose$2", f = "CoverChooseInlineActor.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class y0k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Bitmap $bitmapSource;
    final /* synthetic */ Matrix $coverMatrix;
    final /* synthetic */ Rect $coverRect;
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ z0k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0k(Bitmap bitmap, Matrix matrix, Rect rect, z0k z0kVar, spj<? super y0k> spjVar) {
        super(2, spjVar);
        this.$bitmapSource = bitmap;
        this.$coverMatrix = matrix;
        this.$coverRect = rect;
        this.this$0 = z0kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y0k(this.$bitmapSource, this.$coverMatrix, this.$coverRect, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y0k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.$bitmapSource.getWidth(), this.$bitmapSource.getHeight());
            this.$coverMatrix.mapRect(rectF);
            float width = rectF.width() / this.$bitmapSource.getWidth();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.$bitmapSource, an10.b(r3.getWidth() * width), an10.b(this.$bitmapSource.getHeight() * width), true);
            int width2 = this.$coverRect.width();
            int height = this.$coverRect.height();
            int b2 = an10.b(this.$coverRect.left - rectF.left);
            int width3 = createScaledBitmap.getWidth() - width2;
            if (b2 > width3) {
                b2 = width3;
            }
            int b3 = an10.b(this.$coverRect.top - rectF.top);
            int height2 = createScaledBitmap.getHeight() - height;
            if (b3 > height2) {
                b3 = height2;
            }
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, b2, b3, width2, height);
            a1k a1kVar = this.this$0.d;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.F$0 = width;
            this.I$0 = width2;
            this.I$1 = height;
            this.I$2 = b2;
            this.I$3 = b3;
            this.label = 1;
            b = a1kVar.b(createBitmap, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        z0k z0kVar = this.this$0;
        if (!(b instanceof Result.Failure)) {
            z0kVar.c(new j0k((File) b));
        }
        z0k z0kVar2 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
            z0kVar2.c(k0k.c.a);
        }
        return s3q0.a;
    }
}
