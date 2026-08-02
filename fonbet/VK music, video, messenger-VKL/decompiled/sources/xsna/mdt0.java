package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoRestrictionPlaceholder.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionPlaceholderKt$LegacyBlurImage$1$1", f = "VideoRestrictionPlaceholder.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class mdt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $blurRadius;
    final /* synthetic */ wh50<agw> $blurredImageBitmap$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ agw $imageBitmap;
    int label;

    /* compiled from: VideoRestrictionPlaceholder.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.restriction.view.VideoRestrictionPlaceholderKt$LegacyBlurImage$1$1$1", f = "VideoRestrictionPlaceholder.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $blurRadius;
        final /* synthetic */ wh50<agw> $blurredImageBitmap$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ agw $imageBitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(agw agwVar, Context context, float f, wh50<agw> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$imageBitmap = agwVar;
            this.$context = context;
            this.$blurRadius = f;
            this.$blurredImageBitmap$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$imageBitmap, this.$context, this.$blurRadius, this.$blurredImageBitmap$delegate, spjVar);
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
            Bitmap copy = ba2.a(this.$imageBitmap).copy(Bitmap.Config.ARGB_8888, true);
            Context context = this.$context;
            float f = this.$blurRadius;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(copy, copy.getWidth(), copy.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f));
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            createTyped.copyTo(createBitmap);
            create.destroy();
            this.$blurredImageBitmap$delegate.setValue(new aa2(createBitmap));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdt0(agw agwVar, Context context, float f, wh50<agw> wh50Var, spj<? super mdt0> spjVar) {
        super(2, spjVar);
        this.$imageBitmap = agwVar;
        this.$context = context;
        this.$blurRadius = f;
        this.$blurredImageBitmap$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mdt0(this.$imageBitmap, this.$context, this.$blurRadius, this.$blurredImageBitmap$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mdt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$imageBitmap != null) {
                ovj a2 = hqu0.a();
                a aVar = new a(this.$imageBitmap, this.$context, this.$blurRadius, this.$blurredImageBitmap$delegate, null);
                this.label = 1;
                if (myc0.k(a2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
