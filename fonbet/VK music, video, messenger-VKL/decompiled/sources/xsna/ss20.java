package xsna;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MixBackgroundCpuShader.kt */
@b6l(c = "com.vk.music.bottomsheets.track.redesigned.presentation.components.shaders.source.MixBackgroundCpuShader$generate$2", f = "MixBackgroundCpuShader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ss20 extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    final /* synthetic */ int $color;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    int label;
    final /* synthetic */ ts20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss20(int i, int i2, ts20 ts20Var, int i3, spj<? super ss20> spjVar) {
        super(2, spjVar);
        this.$width = i;
        this.$height = i2;
        this.this$0 = ts20Var;
        this.$color = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ss20(this.$width, this.$height, this.this$0, this.$color, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return ((ss20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        int[] iArr = new int[this.$width * this.$height];
        int i = 0;
        while (true) {
            int i2 = this.$width;
            if (i >= i2) {
                Bitmap createBitmap = Bitmap.createBitmap(i2, this.$height, Bitmap.Config.ARGB_8888);
                int i3 = this.$width;
                createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, this.$height);
                return createBitmap;
            }
            int i4 = 0;
            while (true) {
                int i5 = this.$height;
                if (i4 < i5) {
                    int i6 = this.$width;
                    int i7 = (i4 * i6) + i;
                    ts20 ts20Var = this.this$0;
                    int i8 = this.$color;
                    float f = i / i6;
                    float f2 = ts20Var.a * f;
                    float floor = ((((f2 - ((float) Math.floor(f2))) - 0.5f) * ts20Var.b) + f) - 0.5f;
                    float f3 = (i4 / i5) - 0.5f;
                    iArr[i7] = Color.argb(an10.b((1.0f - swe0.f(((f3 * f3) / 0.25f) + ((floor * floor) / 0.25f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * 255), Color.red(i8), Color.green(i8), Color.blue(i8));
                    i4++;
                }
            }
            i++;
        }
    }
}
