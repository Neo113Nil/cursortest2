package xsna;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import com.vk.core.compose.image.asset.NotAnAssetException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zw3;

/* compiled from: rememberAssetPainter.kt */
@b6l(c = "com.vk.core.compose.image.asset.RememberAssetPainterKt$rememberAssetPainter$1$1", f = "rememberAssetPainter.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class utf0 extends SuspendLambda implements wzs<qhd0<zw3>, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: rememberAssetPainter.kt */
    @b6l(c = "com.vk.core.compose.image.asset.RememberAssetPainterKt$rememberAssetPainter$1$1$1", f = "rememberAssetPainter.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ qhd0<zw3> $$this$produceState;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, qhd0<zw3> qhd0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$url = str;
            this.$$this$produceState = qhd0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$context, this.$url, this.$$this$produceState, spjVar);
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
            AssetManager assets = this.$context.getResources().getAssets();
            String str = this.$url;
            byte[] h = i7o0.h(assets.open(drm0.g0(str, "file:///android_asset/", str)));
            this.$$this$produceState.setValue(new zw3.b(k9q0.d(BitmapFactory.decodeByteArray(h, 0, h.length))));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utf0(Context context, String str, spj spjVar) {
        super(2, spjVar);
        this.$url = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        utf0 utf0Var = new utf0(this.$context, this.$url, spjVar);
        utf0Var.L$0 = obj;
        return utf0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(qhd0<zw3> qhd0Var, spj<? super s3q0> spjVar) {
        return ((utf0) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qhd0 qhd0Var = (qhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                if (!brm0.B(this.$url, "file:///android_asset/", false)) {
                    throw new NotAnAssetException("Specified url \"" + this.$url + "\" is not an asset, try use url starting \"file:///android_asset/\" instead");
                }
                bdn bdnVar = bdn.a;
                wgl wglVar = wgl.c;
                a aVar = new a(this.$context, this.$url, qhd0Var, null);
                this.L$0 = qhd0Var;
                this.label = 1;
                if (myc0.k(wglVar, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
        } catch (Throwable th) {
            qhd0Var.setValue(new zw3.a(th));
        }
        return s3q0.a;
    }
}
