package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes9.dex */
public class WrapContentViewFlow extends ViewFlow {
    public WrapContentViewFlow(Context context) {
        this(context, null);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i2);
        this.j = Math.min(defaultSize / 10, this.i);
        ((ViewFlow) this).a = Math.min(Math.max(0, ((ViewFlow) this).a), ((ViewFlow) this).b - 1);
        int i3 = defaultSize - (this.d * 2);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                if (childAt == this.e || childAt == this.f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
                } else {
                    ViewFlow.b bVar = (ViewFlow.b) childAt.getLayoutParams();
                    if (bVar != null) {
                        int i6 = ((ViewGroup.LayoutParams) bVar).width;
                        childAt.measure(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : ViewGroup.getChildMeasureSpec(i, this.d * 2, i6), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
                        i4 = Math.max(i4, childAt.getMeasuredHeight());
                    }
                }
            }
        }
        setMeasuredDimension(defaultSize, Math.min(i4, defaultSize2));
    }

    public WrapContentViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
