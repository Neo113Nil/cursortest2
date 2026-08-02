package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.mlenhance.MlEnhanceDelegate;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.d4p;

/* compiled from: MlEnhanceToolDelegate.kt */
@b6l(c = "com.vk.attachpicker.screen.utils.MlEnhanceToolDelegate$doEnhanceFake$1", f = "MlEnhanceToolDelegate.kt", l = {139, 151}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ht20 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ MlEnhanceDelegate.a $callback;
    final /* synthetic */ Bitmap $original;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ gt20 this$0;

    /* compiled from: MlEnhanceToolDelegate.kt */
    @b6l(c = "com.vk.attachpicker.screen.utils.MlEnhanceToolDelegate$doEnhanceFake$1$1", f = "MlEnhanceToolDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ MlEnhanceDelegate.a $callback;
        final /* synthetic */ d4p.a $fileInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MlEnhanceDelegate.a aVar, d4p.a aVar2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$callback = aVar;
            this.$fileInfo = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$callback, this.$fileInfo, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$callback.a(new g4p(this.$fileInfo.a));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht20(Bitmap bitmap, gt20 gt20Var, MlEnhanceDelegate.a aVar, spj<? super ht20> spjVar) {
        super(2, spjVar);
        this.$original = bitmap;
        this.this$0 = gt20Var;
        this.$callback = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ht20(this.$original, this.this$0, this.$callback, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ht20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (xsna.myc0.k(r1, r3, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (xsna.qsl.b(2000, r7) == r0) goto L15;
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
        Bitmap createBitmap = Bitmap.createBitmap(this.$original.getWidth(), this.$original.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(this.$original, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        d4p.a f = gt20.f(this.this$0, createBitmap);
        bdn bdnVar = bdn.a;
        ge00 ge00Var = ie00.a;
        a aVar = new a(this.$callback, f, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
