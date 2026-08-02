package xsna;

import android.view.View;
import androidx.recyclerview.widget.FillingLinearLayoutManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ccr implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ccr(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                FillingLinearLayoutManager fillingLinearLayoutManager = (FillingLinearLayoutManager) this.d;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                View childAt = fillingLinearLayoutManager.getChildAt(intValue2);
                if (childAt != null) {
                    return Integer.valueOf(fillingLinearLayoutManager.getDecoratedMeasuredHeight(childAt) + intValue);
                }
                throw new IllegalArgumentException((intValue2 + " child is not exist. pos:" + this.c + " child count: " + fillingLinearLayoutManager.getChildCount()).toString());
            default:
                ((Integer) obj2).intValue();
                ((sjg0) this.d).d(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }
}
