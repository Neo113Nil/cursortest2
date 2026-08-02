package com.yandex.mapkit.maps.core.utils.sensors;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"lowPass360", "", "input", "prev", CaretView.ALPHA_PROPERTY, "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FiltersMathKt {
    public static final double lowPass360(double d, double d2, double d3) {
        return !Double.isNaN(d2) ? RotationsOnCircleUtilsKt.normalizeOnCircle((RotationsOnCircleUtilsKt.normalizeOnCircle(d - d2) * d3) + d2) : d;
    }
}
