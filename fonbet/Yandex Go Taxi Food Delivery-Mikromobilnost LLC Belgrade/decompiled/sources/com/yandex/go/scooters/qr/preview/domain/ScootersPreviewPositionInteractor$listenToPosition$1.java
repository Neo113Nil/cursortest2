package com.yandex.go.scooters.qr.preview.domain;

import android.graphics.PointF;
import android.graphics.Rect;
import defpackage.bms;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersPreviewPositionInteractor$listenToPosition$1 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        Rect rect3 = (Rect) obj3;
        ((b) this.receiver).getClass();
        Rect rect4 = new Rect(rect2);
        int height = rect.bottom - rect3.bottom >= rect2.height() ? rect3.bottom : rect3.top - rect.top >= rect2.height() ? rect3.top - rect2.height() : -1;
        if (height != -1) {
            rect4.offsetTo(rect3.centerX() - (rect4.width() / 2), height);
            if (rect4.left >= rect.left && rect4.right <= rect.right) {
                return new PointF(rect4.left, rect4.top);
            }
        }
        int width = rect.right - rect3.right >= rect2.width() ? rect3.right : rect3.left - rect.left >= rect2.width() ? rect3.left - rect2.width() : -1;
        if (width == -1) {
            return null;
        }
        rect4.offsetTo(width, rect3.centerY() - (rect4.height() / 2));
        if (rect4.top < rect.top || rect4.bottom > rect.bottom) {
            return null;
        }
        return new PointF(rect4.left, rect4.top);
    }
}
