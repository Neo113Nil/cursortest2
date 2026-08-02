package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: rememberLottieComposition.kt */
@b6l(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class cuf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ i700 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuf0(i700 i700Var, Context context, String str, spj<? super cuf0> spjVar) {
        super(2, spjVar);
        this.$composition = i700Var;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cuf0(this.$composition, this.$context, this.$imageAssetsFolder, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cuf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        for (q800 q800Var : ((HashMap) this.$composition.d()).values()) {
            Bitmap bitmap = q800Var.f;
            String str = q800Var.d;
            if (bitmap == null && brm0.B(str, "data:", false) && drm0.K(0, 6, str, "base64,", false) > 0) {
                try {
                    byte[] decode = Base64.decode(str.substring(drm0.L(str, ',', 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    q800Var.f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                } catch (IllegalArgumentException e) {
                    n100.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.$context;
            String str2 = this.$imageAssetsFolder;
            if (q800Var.f == null && str2 != null) {
                try {
                    InputStream open = context.getAssets().open(str2 + str);
                    Bitmap bitmap2 = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmap2 = BitmapFactory.decodeStream(open, null, options2);
                    } catch (IllegalArgumentException e2) {
                        n100.c("Unable to decode image.", e2);
                    }
                    if (bitmap2 != null) {
                        q800Var.f = b3r0.e(q800Var.a, q800Var.b, bitmap2);
                    }
                } catch (IOException e3) {
                    n100.c("Unable to open asset.", e3);
                }
            }
        }
        return s3q0.a;
    }
}
