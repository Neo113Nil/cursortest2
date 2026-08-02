package com.ybsdk.widgets.common;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.ffx;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.widgets.common.BlendingGradientView$render$1", f = "BlendingGradientView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BlendingGradientView$render$1 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $logo;
    int label;
    final /* synthetic */ BlendingGradientView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlendingGradientView$render$1(Drawable drawable, BlendingGradientView blendingGradientView, Continuation continuation) {
        super(2, continuation);
        this.$logo = drawable;
        this.this$0 = blendingGradientView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlendingGradientView$render$1(this.$logo, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BlendingGradientView$render$1 blendingGradientView$render$1 = (BlendingGradientView$render$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        blendingGradientView$render$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lz40 lz40Var;
        int makeAccentColor;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Integer num = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Bitmap e0 = ffx.e0(this.$logo);
        if (e0 == null) {
            Drawable drawable = this.$logo;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            e0 = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        }
        Integer calculateAverageColor = e0 != null ? this.this$0.calculateAverageColor(e0) : null;
        if (calculateAverageColor != null) {
            makeAccentColor = this.this$0.makeAccentColor(calculateAverageColor.intValue());
            num = new Integer(makeAccentColor);
        }
        lz40Var = this.this$0.colorFlow;
        lz40Var.g(num);
        return zy11.a;
    }
}
