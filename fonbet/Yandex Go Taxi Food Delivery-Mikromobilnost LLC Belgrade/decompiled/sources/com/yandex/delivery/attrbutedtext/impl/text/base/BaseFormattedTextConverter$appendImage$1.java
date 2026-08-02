package com.yandex.delivery.attrbutedtext.impl.text.base;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import com.yandex.delivery.attrbutedtext.impl.text.base.span.CustomImageSpan;
import defpackage.dci;
import defpackage.e991;
import defpackage.idc;
import defpackage.jgz;
import defpackage.kbs;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.DeliveryBitmapTransformation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.attrbutedtext.impl.text.base.BaseFormattedTextConverter$appendImage$1", f = "BaseFormattedTextConverter.kt", l = {351}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class BaseFormattedTextConverter$appendImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ SpannableStringBuilder $builder;
    final /* synthetic */ int $height;
    final /* synthetic */ com.yandex.delivery.attrbutedtext.api.a $image;
    final /* synthetic */ CustomImageSpan $imageSpan;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ boolean $safeLoad;
    final /* synthetic */ int $width;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFormattedTextConverter$appendImage$1(int i, int i2, CustomImageSpan customImageSpan, a aVar, com.yandex.delivery.attrbutedtext.api.a aVar2, boolean z, SpannableStringBuilder spannableStringBuilder, String str, Continuation continuation) {
        super(2, continuation);
        this.$width = i;
        this.$height = i2;
        this.$imageSpan = customImageSpan;
        this.this$0 = aVar;
        this.$image = aVar2;
        this.$safeLoad = z;
        this.$builder = spannableStringBuilder;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseFormattedTextConverter$appendImage$1(this.$width, this.$height, this.$imageSpan, this.this$0, this.$image, this.$safeLoad, this.$builder, this.$imageUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseFormattedTextConverter$appendImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BaseFormattedTextConverter$appendImage$1 baseFormattedTextConverter$appendImage$1;
        Throwable th;
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                String str = this.$imageUrl;
                int i2 = this.$width;
                int i3 = this.$height;
                try {
                    dci dciVar = aVar.b;
                    DeliveryBitmapTransformation deliveryBitmapTransformation = DeliveryBitmapTransformation.FIT_CENTER;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    baseFormattedTextConverter$appendImage$1 = this;
                    try {
                        obj = dciVar.a(str, i2, i3, deliveryBitmapTransformation, baseFormattedTextConverter$appendImage$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        jgz jgzVar = jgz.a;
                        jgz.d(th, "Failed to load image", new Object[0]);
                        bitmap = null;
                        if (bitmap == null) {
                        }
                        return zy11.a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    baseFormattedTextConverter$appendImage$1 = this;
                    th = th;
                    jgz jgzVar2 = jgz.a;
                    jgz.d(th, "Failed to load image", new Object[0]);
                    bitmap = null;
                    if (bitmap == null) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    b.b(obj);
                    baseFormattedTextConverter$appendImage$1 = this;
                } catch (Throwable th4) {
                    th = th4;
                    baseFormattedTextConverter$appendImage$1 = this;
                    jgz jgzVar22 = jgz.a;
                    jgz.d(th, "Failed to load image", new Object[0]);
                    bitmap = null;
                    if (bitmap == null) {
                    }
                    return zy11.a;
                }
            }
            bitmap = (Bitmap) obj;
            if (bitmap == null) {
                int i4 = baseFormattedTextConverter$appendImage$1.$width;
                if (i4 <= 0) {
                    i4 = bitmap.getWidth();
                }
                int i5 = baseFormattedTextConverter$appendImage$1.$height;
                if (i5 <= 0) {
                    i5 = bitmap.getHeight();
                }
                CustomImageSpan customImageSpan = baseFormattedTextConverter$appendImage$1.$imageSpan;
                a aVar2 = baseFormattedTextConverter$appendImage$1.this$0;
                Resources resources = aVar2.d.getResources();
                String a = baseFormattedTextConverter$appendImage$1.$image.a();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
                if (i4 > 0 && i5 > 0) {
                    bitmapDrawable.setBounds(0, 0, i4, i5);
                } else if (i4 > 0) {
                    bitmapDrawable.setBounds(0, 0, i4, (bitmap.getHeight() * i4) / bitmap.getWidth());
                } else if (i5 > 0) {
                    bitmapDrawable.setBounds(0, 0, (bitmap.getWidth() * i5) / bitmap.getHeight(), i5);
                } else {
                    bitmapDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                }
                idc a2 = aVar2.a.a(a);
                if (a2 != null) {
                    bitmapDrawable.setTint(e991.d(a2, aVar2.g.b()));
                }
                customImageSpan.setDrawable(bitmapDrawable);
            } else {
                if (!baseFormattedTextConverter$appendImage$1.$safeLoad) {
                    kbs.g("Image load failed with unknown error");
                    return null;
                }
                baseFormattedTextConverter$appendImage$1.$builder.removeSpan(baseFormattedTextConverter$appendImage$1.$imageSpan);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
