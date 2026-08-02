package com.yandex.go.masstransit.sdk.order.impl.tickets;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.avj0;
import defpackage.ml40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ptg0;
import defpackage.tse;
import defpackage.u92;
import defpackage.vz5;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8v;", "<anonymous>", "(Ltse;)Ll8v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsUiStateMapper$generateQRCode$2", f = "MtTicketsUiStateMapper.kt", l = {355}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsUiStateMapper$generateQRCode$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $payload;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsUiStateMapper$generateQRCode$2(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$payload = str;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsUiStateMapper$generateQRCode$2(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsUiStateMapper$generateQRCode$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$payload;
            int c = ((avj0) this.this$0.b).c(ptg0.pdf417_image_width);
            this.label = 1;
            vz5 a = new ml40().a(str, BarcodeFormat.QR_CODE, c, c, kotlin.collections.b.i(new Pair(EncodeHintType.MARGIN, new Integer(0)), new Pair(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H)));
            obj = Bitmap.createBitmap(c, c, Bitmap.Config.ARGB_8888);
            for (int i2 = 0; i2 < c; i2++) {
                for (int i3 = 0; i3 < c; i3++) {
                    obj.setPixel(i2, i3, a.b(i2, i3) ? ModalContentViewContainer.BASE_SHADOW_COLOR : -1);
                }
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return new u92((Bitmap) obj);
    }
}
