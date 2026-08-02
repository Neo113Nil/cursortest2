package com.yandex.go.pin.api.v2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bl00;
import defpackage.i1c0;
import defpackage.xw31;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes13.dex */
public abstract class d {
    public static final bl00 a(PinV2Component pinV2Component, i1c0 i1c0Var, PinV2Component.Position position, SourceOnMapControl.a aVar) {
        pinV2Component.updatePosition(position, false);
        pinV2Component.updateControlState(aVar);
        pinV2Component.updateControlStyle(i1c0Var);
        xw31.r(pinV2Component);
        Rect pinFullVisibleBounds = pinV2Component.getPinFullVisibleBounds();
        PointF targetOffsetPoint = pinV2Component.getTargetOffsetPoint();
        PointF pointF = new PointF(targetOffsetPoint.x, targetOffsetPoint.y);
        float f = -(pointF.y + pinFullVisibleBounds.top);
        float f2 = -(pointF.x + pinFullVisibleBounds.left);
        Canvas canvas = new Canvas();
        pointF.set(0.5f, (pointF.y + f) / pinFullVisibleBounds.height());
        IconStyle iconStyle = new IconStyle(pointF, null, null, null, null, null, null);
        Bitmap createBitmap = Bitmap.createBitmap(pinFullVisibleBounds.width(), pinFullVisibleBounds.height(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        canvas.translate(f2, f);
        pinV2Component.draw(canvas);
        canvas.setBitmap(null);
        return new bl00(ImageProvider.fromBitmap(createBitmap), iconStyle);
    }
}
