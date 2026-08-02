package com.yandex.go.pin.api.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.AnimatedImage;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.Frame;
import com.yandex.runtime.image.ImageProvider;
import defpackage.e0c0;
import defpackage.ewb0;
import defpackage.gk00;
import defpackage.i1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw31;
import defpackage.z0c0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.api.widget.PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1", f = "PinMapKitImageFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1 extends SuspendLambda implements wls {
    final /* synthetic */ ewb0 $holder;
    final /* synthetic */ p0c0 $style$inlined;
    final /* synthetic */ p0c0 $style$inlined$1;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1(ewb0 ewb0Var, Continuation continuation, b bVar, p0c0 p0c0Var, p0c0 p0c0Var2) {
        super(2, continuation);
        this.$holder = ewb0Var;
        this.this$0 = bVar;
        this.$style$inlined = p0c0Var;
        this.$style$inlined$1 = p0c0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1(this.$holder, continuation, this.this$0, this.$style$inlined, this.$style$inlined$1);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Bitmap bitmap = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ewb0 ewb0Var = this.$holder;
        PinV1Component pinV1Component = ewb0Var.a;
        long j = 40;
        if (pinV1Component == null) {
            PinV2Component pinV2Component = ewb0Var.b;
            if (pinV2Component == null) {
                ny61.r("Missing pin render");
                return null;
            }
            i1c0 f = this.this$0.e.f(this.$style$inlined$1);
            if (f == null) {
                f = this.this$0.e.i();
            }
            PinV2Component.Position position = PinV2Component.Position.ANCHORED;
            SourceOnMapControl.a aVar = new SourceOnMapControl.a(e0c0.a, null, null, false, false, null, null, 2046);
            pinV2Component.updatePosition(position, false);
            pinV2Component.updateControlState(aVar);
            pinV2Component.updateControlStyle(f);
            xw31.r(pinV2Component);
            Rect pinFullVisibleBounds = pinV2Component.getPinFullVisibleBounds();
            PointF targetOffsetPoint = pinV2Component.getTargetOffsetPoint();
            PointF pointF = new PointF(targetOffsetPoint.x, targetOffsetPoint.y);
            float f2 = -(pointF.y + pinFullVisibleBounds.top);
            float f3 = -(pointF.x + pinFullVisibleBounds.left);
            Canvas canvas = new Canvas();
            pointF.set(0.5f, (pointF.y + f2) / pinFullVisibleBounds.height());
            IconStyle iconStyle = new IconStyle(pointF, null, null, null, null, null, null);
            ArrayList arrayList = new ArrayList();
            long j2 = 0;
            while (j2 < 12) {
                long j3 = j2 * j;
                pinV2Component.setCustomAnimationTime(j3);
                Bitmap createBitmap = Bitmap.createBitmap(pinFullVisibleBounds.width(), pinFullVisibleBounds.height(), Bitmap.Config.ARGB_8888);
                canvas.setBitmap(createBitmap);
                canvas.translate(f3, f2);
                pinV2Component.draw(canvas);
                canvas.setBitmap(bitmap);
                arrayList.add(new Frame(ImageProvider.fromBitmap(createBitmap), Math.min(500 - j3, 40L)));
                j2++;
                bitmap = bitmap;
                j = 40;
                f2 = f2;
            }
            return new gk00(AnimatedImageProvider.fromAnimatedImage(new AnimatedImage(0, arrayList)), iconStyle);
        }
        r0c0 r0c0Var = this.this$0.e;
        p0c0 p0c0Var = this.$style$inlined;
        r0c0Var.getClass();
        z0c0 e = r0c0.e(true, p0c0Var);
        if (e == null) {
            e = this.this$0.e.g();
        }
        Pin$State pin$State = Pin$State.IN_PROGRESS;
        pinV1Component.setPinV1Style(e);
        pinV1Component.setIdleStateDrawable(null);
        pinV1Component.setState(pin$State, false);
        pinV1Component.setAnchored(true, false);
        pinV1Component.setPinText("");
        xw31.r(pinV1Component);
        Rect pinFullVisibleBounds2 = pinV1Component.getPinFullVisibleBounds();
        PointF targetOffsetPoint2 = pinV1Component.getTargetOffsetPoint();
        PointF pointF2 = new PointF(targetOffsetPoint2.x, targetOffsetPoint2.y);
        float f4 = -(pointF2.y + pinFullVisibleBounds2.top);
        float f5 = -(pointF2.x + pinFullVisibleBounds2.left);
        Canvas canvas2 = new Canvas();
        pointF2.set(0.5f, (pointF2.y + f4) / pinFullVisibleBounds2.height());
        IconStyle iconStyle2 = new IconStyle(pointF2, null, null, null, null, null, null);
        int animationDuration = (int) pinV1Component.getAnimationDuration();
        ArrayList arrayList2 = new ArrayList();
        int i = animationDuration / 40;
        for (int i2 = 0; i2 < i; i2++) {
            pinV1Component.setAnimationCurrentPlayTime(i2 * 40);
            Bitmap createBitmap2 = Bitmap.createBitmap(pinFullVisibleBounds2.width(), pinFullVisibleBounds2.height(), Bitmap.Config.ARGB_8888);
            canvas2.setBitmap(createBitmap2);
            canvas2.translate(f5, f4);
            pinV1Component.draw(canvas2);
            canvas2.setBitmap(null);
            arrayList2.add(new Frame(ImageProvider.fromBitmap(createBitmap2), 40L));
        }
        int size = arrayList2.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return new gk00(AnimatedImageProvider.fromAnimatedImage(new AnimatedImage(0, arrayList2)), iconStyle2);
            }
            arrayList2.add(arrayList2.get(size));
        }
    }
}
