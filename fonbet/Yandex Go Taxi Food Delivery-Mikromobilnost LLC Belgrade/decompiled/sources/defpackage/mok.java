package defpackage;

import android.graphics.Point;
import android.view.View;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipAlignment;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;

/* loaded from: classes3.dex */
public final class mok extends kok {
    public static final int f = kp50.r(12);
    public final DivEducationsV2View d;
    public final jpn e;

    public mok(View view, View view2, DivEducationsV2View divEducationsV2View, jpn jpnVar) {
        super(view, view2);
        this.d = divEducationsV2View;
        this.e = jpnVar;
    }

    @Override // defpackage.wce0
    public final int c() {
        return 8388659;
    }

    @Override // defpackage.wce0
    public final float e() {
        return 180.0f;
    }

    @Override // defpackage.wce0
    public final Point g(TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity) {
        int measuredHeight;
        int i;
        View view = this.a;
        Point j = b.j(view);
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment = this.e.c;
        int i2 = educationsTooltipEntity$EducationsTooltipAlignment == null ? -1 : lok.a[educationsTooltipEntity$EducationsTooltipAlignment.ordinal()];
        if (i2 == -1 || i2 == 1) {
            measuredHeight = view.getMeasuredHeight() + j.y;
            i = iArr[1];
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            measuredHeight = j.y;
            i = iArr[1];
        }
        return new Point(a(j, tooltipCommon$PreferredGravity), measuredHeight - i);
    }

    @Override // defpackage.kok
    public final int h() {
        return f;
    }

    @Override // defpackage.kok
    public final int i() {
        return kp50.r(this.e.e) + g(TooltipCommon$PreferredGravity.CENTER).y;
    }
}
