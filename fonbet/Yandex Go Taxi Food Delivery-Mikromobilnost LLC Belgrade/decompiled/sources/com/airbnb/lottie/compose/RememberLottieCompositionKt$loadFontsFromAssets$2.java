package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Typeface;
import com.airbnb.lottie.AsyncUpdates;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.lgz;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.upx;
import defpackage.wls;
import defpackage.xxr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends SuspendLambda implements wls {
    final /* synthetic */ nsz $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(nsz nszVar, Context context, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$composition = nszVar;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RememberLottieCompositionKt$loadFontsFromAssets$2 rememberLottieCompositionKt$loadFontsFromAssets$2 = (RememberLottieCompositionKt$loadFontsFromAssets$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rememberLottieCompositionKt$loadFontsFromAssets$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (xxr xxrVar : this.$composition.f.values()) {
            Context context = this.$context;
            String str = xxrVar.a;
            String str2 = this.$fontAssetsFolder;
            String str3 = this.$fontFileExtension;
            String str4 = xxrVar.c;
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), g8e.p(str2, str, str3));
                try {
                    int i = 0;
                    boolean y = evu0.y(str4, "Italic", false);
                    boolean y2 = evu0.y(str4, "Bold", false);
                    if (y && y2) {
                        i = 3;
                    } else if (y) {
                        i = 2;
                    } else if (y2) {
                        i = 1;
                    }
                    if (createFromAsset.getStyle() != i) {
                        createFromAsset = Typeface.create(createFromAsset, i);
                    }
                    xxrVar.d = createFromAsset;
                } catch (Exception unused) {
                    lgz.a.getClass();
                    AsyncUpdates asyncUpdates = upx.a;
                }
            } catch (Exception unused2) {
                lgz.a.getClass();
                AsyncUpdates asyncUpdates2 = upx.a;
            }
        }
        return zy11.a;
    }
}
