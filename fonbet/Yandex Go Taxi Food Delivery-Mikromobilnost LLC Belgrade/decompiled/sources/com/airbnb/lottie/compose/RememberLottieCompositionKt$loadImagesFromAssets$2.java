package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.lgz;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wtz;
import defpackage.zw21;
import defpackage.zy11;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends SuspendLambda implements wls {
    final /* synthetic */ nsz $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadImagesFromAssets$2(nsz nszVar, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.$composition = nszVar;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadImagesFromAssets$2(this.$composition, this.$context, this.$imageAssetsFolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RememberLottieCompositionKt$loadImagesFromAssets$2 rememberLottieCompositionKt$loadImagesFromAssets$2 = (RememberLottieCompositionKt$loadImagesFromAssets$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rememberLottieCompositionKt$loadImagesFromAssets$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (wtz wtzVar : ((HashMap) this.$composition.c()).values()) {
            String str = wtzVar.d;
            if (wtzVar.f == null && cvu0.x(str, "data:", false) && evu0.H(str, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] decode = Base64.decode(str.substring(evu0.G(str, HexString.CHAR_COMMA, 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    wtzVar.f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                } catch (IllegalArgumentException unused) {
                    lgz.c("data URL did not have correct base64 format.");
                }
            }
            Context context = this.$context;
            String str2 = this.$imageAssetsFolder;
            if (wtzVar.f == null && str2 != null) {
                try {
                    InputStream open = context.getAssets().open(str2 + str);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmap = BitmapFactory.decodeStream(open, null, options2);
                    } catch (IllegalArgumentException unused2) {
                        lgz.c("Unable to decode image.");
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        wtzVar.f = zw21.d(bitmap, wtzVar.a, wtzVar.b);
                    }
                } catch (IOException unused3) {
                    lgz.c("Unable to open asset.");
                }
            }
        }
        return zy11.a;
    }
}
