package xsna;

import android.content.Context;
import com.facebook.imagepipeline.request.ImageRequest;
import com.vk.imageloader.fresco.CallerContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkFrescoImage.kt */
@b6l(c = "com.vk.core.compose.image.fresco.VkFrescoImageKt$rememberDataSourcePainterWithState$4$1", f = "VkFrescoImage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class dwu0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ lpa0 $controllerBuilder;
    final /* synthetic */ ImageRequest $currentFallbackRequest;
    final /* synthetic */ Object $dataSourceHolder;
    final /* synthetic */ flo<njt> $draweeHolder;
    final /* synthetic */ ImageRequest[] $imageRequestArray;
    final /* synthetic */ wh50<Boolean> $isFallbackRequestUsed$delegate;
    final /* synthetic */ ewu0 $listener;
    final /* synthetic */ tjo $xmlDrawableFactory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwu0(ImageRequest imageRequest, Context context, flo<njt> floVar, lpa0 lpa0Var, ImageRequest[] imageRequestArr, ewu0 ewu0Var, tjo tjoVar, Object obj, wh50<Boolean> wh50Var, spj<? super dwu0> spjVar) {
        super(2, spjVar);
        this.$currentFallbackRequest = imageRequest;
        this.$context = context;
        this.$draweeHolder = floVar;
        this.$controllerBuilder = lpa0Var;
        this.$imageRequestArray = imageRequestArr;
        this.$listener = ewu0Var;
        this.$xmlDrawableFactory = tjoVar;
        this.$dataSourceHolder = obj;
        this.$isFallbackRequestUsed$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new dwu0(this.$currentFallbackRequest, this.$context, this.$draweeHolder, this.$controllerBuilder, this.$imageRequestArray, this.$listener, this.$xmlDrawableFactory, this.$dataSourceHolder, this.$isFallbackRequestUsed$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((dwu0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (this.$isFallbackRequestUsed$delegate.getValue().booleanValue() || this.$currentFallbackRequest == null) {
            this.$isFallbackRequestUsed$delegate.setValue(Boolean.FALSE);
            Context context = this.$context;
            flo<njt> floVar = this.$draweeHolder;
            lpa0 lpa0Var = this.$controllerBuilder;
            ewu0 ewu0Var = this.$listener;
            tjo tjoVar = this.$xmlDrawableFactory;
            final zuk zukVar = (zuk) this.$dataSourceHolder;
            dlo dloVar = floVar.e;
            lpa0Var.d();
            lpa0Var.l = dloVar;
            lpa0Var.h = ewu0Var;
            lpa0Var.g = new yhn0() { // from class: xsna.zvu0
                @Override // xsna.yhn0
                public final Object get() {
                    return zuk.this;
                }
            };
            lpa0Var.b = CallerContext.Frontend;
            yiz.b(lpa0Var, context, tjoVar);
            floVar.h(lpa0Var.b());
        } else {
            this.$isFallbackRequestUsed$delegate.setValue(Boolean.TRUE);
            fwu0.e(this.$context, this.$draweeHolder, this.$controllerBuilder, this.$imageRequestArray, this.$listener, this.$xmlDrawableFactory, this.$currentFallbackRequest, false, 896);
        }
        return s3q0.a;
    }
}
