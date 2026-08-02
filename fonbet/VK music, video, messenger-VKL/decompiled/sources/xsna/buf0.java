package xsna;

import android.content.Context;
import android.graphics.Typeface;
import com.airbnb.lottie.AsyncUpdates;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: rememberLottieComposition.kt */
@b6l(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class buf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ i700 $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buf0(i700 i700Var, Context context, String str, String str2, spj<? super buf0> spjVar) {
        super(2, spjVar);
        this.$composition = i700Var;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new buf0(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((buf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        for (o4s o4sVar : this.$composition.f.values()) {
            Context context = this.$context;
            String str = this.$fontAssetsFolder;
            String str2 = this.$fontFileExtension;
            String str3 = o4sVar.a;
            String str4 = o4sVar.c;
            try {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), pzl.b(str, str3, str2));
                try {
                    int i = 0;
                    boolean D = drm0.D(str4, "Italic", false);
                    boolean D2 = drm0.D(str4, "Bold", false);
                    if (D && D2) {
                        i = 3;
                    } else if (D) {
                        i = 2;
                    } else if (D2) {
                        i = 1;
                    }
                    if (createFromAsset.getStyle() != i) {
                        createFromAsset = Typeface.create(createFromAsset, i);
                    }
                    o4sVar.d = createFromAsset;
                } catch (Exception unused) {
                    n100.a.getClass();
                    AsyncUpdates asyncUpdates = tky.a;
                }
            } catch (Exception unused2) {
                n100.a.getClass();
                AsyncUpdates asyncUpdates2 = tky.a;
            }
        }
        return s3q0.a;
    }
}
