package com.ybsdk.core.design.spoiler;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qvt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.design.spoiler.SpoilerEffectBitmapFactory$checkUpdate$1", f = "SpoilerEffectBitmapFactory.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SpoilerEffectBitmapFactory$checkUpdate$1 extends SuspendLambda implements wls {
    final /* synthetic */ Bitmap $bufferBitmapFinal;
    int label;
    final /* synthetic */ qvt0 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.core.design.spoiler.SpoilerEffectBitmapFactory$checkUpdate$1$1", f = "SpoilerEffectBitmapFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.core.design.spoiler.SpoilerEffectBitmapFactory$checkUpdate$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Bitmap $finalBitmap;
        int label;
        final /* synthetic */ qvt0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(qvt0 qvt0Var, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.this$0 = qvt0Var;
            this.$finalBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$finalBitmap, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
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
            qvt0 qvt0Var = this.this$0;
            qvt0Var.c = qvt0Var.b;
            qvt0Var.b = this.$finalBitmap;
            Paint paint = qvt0Var.f;
            Bitmap bitmap = this.this$0.b;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.this$0.i = false;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerEffectBitmapFactory$checkUpdate$1(qvt0 qvt0Var, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.$bufferBitmapFinal = bitmap;
        this.this$0 = qvt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpoilerEffectBitmapFactory$checkUpdate$1(this.this$0, this.$bufferBitmapFinal, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpoilerEffectBitmapFactory$checkUpdate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Bitmap bitmap = this.$bufferBitmapFinal;
            if (bitmap == null) {
                int i2 = this.this$0.j;
                bitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
            }
            qvt0 qvt0Var = this.this$0;
            Bitmap bitmap2 = qvt0Var.d;
            if (bitmap2 == null) {
                int i3 = qvt0Var.j;
                qvt0Var.d = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
            } else {
                bitmap2.eraseColor(0);
            }
            Canvas canvas = new Canvas(bitmap);
            Canvas canvas2 = new Canvas(this.this$0.d);
            for (int i4 = 0; i4 < 10; i4++) {
                for (int i5 = 0; i5 < 10; i5++) {
                    ((SpoilerEffect) this.this$0.h.get((i4 * 10) + i5)).draw(canvas2);
                }
            }
            bitmap.eraseColor(0);
            canvas.drawBitmap(this.this$0.d, 0.0f, 0.0f, (Paint) null);
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, bitmap, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
