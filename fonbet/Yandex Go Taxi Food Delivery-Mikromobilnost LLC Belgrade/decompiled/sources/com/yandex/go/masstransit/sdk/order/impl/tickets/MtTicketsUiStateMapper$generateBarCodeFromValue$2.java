package com.yandex.go.masstransit.sdk.order.impl.tickets;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.yandex.go.movista.BarcodeEncoder;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.fc51;
import defpackage.hc4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ov4;
import defpackage.t390;
import defpackage.tse;
import defpackage.u92;
import defpackage.vz5;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8v;", "<anonymous>", "(Ltse;)Ll8v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsUiStateMapper$generateBarCodeFromValue$2", f = "MtTicketsUiStateMapper.kt", l = {365}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsUiStateMapper$generateBarCodeFromValue$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $barcodeValue;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsUiStateMapper$generateBarCodeFromValue$2(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$barcodeValue = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTicketsUiStateMapper$generateBarCodeFromValue$2(this.this$0, this.$barcodeValue, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTicketsUiStateMapper$generateBarCodeFromValue$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        fc51 t390Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            WindowManager windowManager = (WindowManager) this.this$0.a.getSystemService("window");
            Resources resources = this.this$0.a.getResources();
            String str = this.$barcodeValue;
            BarcodeEncoder barcodeEncoder = BarcodeEncoder.PDF417_CPPK;
            this.L$0 = null;
            this.label = 1;
            if (barcodeEncoder.getImageGeneratorSize() == null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                pair = new Pair(new Integer(point.x), new Integer((int) (point.x / 2.0f)));
            } else {
                pair = new Pair(new Integer(resources.getDimensionPixelSize(barcodeEncoder.getImageGeneratorSize().a)), new Integer(resources.getDimensionPixelSize(barcodeEncoder.getImageGeneratorSize().b)));
            }
            int intValue = ((Number) pair.getFirst()).intValue();
            int intValue2 = ((Number) pair.getSecond()).intValue();
            BarcodeFormat format = barcodeEncoder.getFormat();
            Map hints = barcodeEncoder.getHints();
            int i2 = ov4.a[format.ordinal()];
            if (i2 == 1) {
                t390Var = new t390();
            } else if (i2 != 2) {
                obj = null;
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                t390Var = new hc4();
            }
            vz5 a = t390Var.a(str, format, intValue, intValue2, hints);
            int i3 = a.a;
            int i4 = a.b;
            int[] iArr = new int[i3 * i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    iArr[i6 + i7] = a.b(i7, i5) ? ModalContentViewContainer.BASE_SHADOW_COLOR : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_4444);
            createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
            obj = createBitmap;
            if (obj == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            return new u92(bitmap);
        }
        return null;
    }
}
