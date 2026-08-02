package com.yandex.go.taxi.order.search.ui.views;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.tje;
import defpackage.wug0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/taxi/order/search/ui/views/PointLocationView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/PointF;", IssuingDistributionPointExtension.POINT, "Lzy11;", "setAnchorPoint", "(Landroid/graphics/PointF;)V", "", "shadowCompensation", CA20Status.STATUS_USER_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PointLocationView extends AppCompatImageView {
    public static final int $stable = 8;
    private final int shadowCompensation;

    public PointLocationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.shadowCompensation = tje.r(wug0.location_point_shadow_compensation, getContext());
    }

    public final void setAnchorPoint(PointF point) {
        setX(point.x - (getWidth() / 2.0f));
        setY((point.y - (getHeight() / 2.0f)) + this.shadowCompensation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointLocationView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PointLocationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
