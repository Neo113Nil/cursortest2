package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.wfx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"com/yandex/div/core/view2/divs/widgets/DivBorderDrawer$RoundedRectOutlineProvider", "Landroid/view/ViewOutlineProvider;", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "<init>", "(F)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "F", "getCornerRadius", "()F", "setCornerRadius", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DivBorderDrawer$RoundedRectOutlineProvider extends ViewOutlineProvider {
    private float cornerRadius;

    public /* synthetic */ DivBorderDrawer$RoundedRectOutlineProvider(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f = this.cornerRadius;
        float width2 = view.getWidth();
        float height2 = view.getHeight();
        float f2 = 0.0f;
        if (height2 > 0.0f && width2 > 0.0f) {
            float min = Math.min(height2, width2) / 2.0f;
            if (f > min) {
                int i = wfx.a;
            }
            f2 = Math.min(f, min);
        }
        outline.setRoundRect(0, 0, width, height, f2);
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public DivBorderDrawer$RoundedRectOutlineProvider() {
        this(0.0f, 1, null);
    }

    public DivBorderDrawer$RoundedRectOutlineProvider(float f) {
        this.cornerRadius = f;
    }
}
