package xsna;

import com.vk.attachpicker.widget.CustomSpinner;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h8m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ CustomSpinner c;

    public /* synthetic */ h8m0(CustomSpinner customSpinner, int i) {
        this.b = i;
        this.c = customSpinner;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CustomSpinner customSpinner = (CustomSpinner) obj;
        switch (this.b) {
            case 0:
                int measuredHeight = customSpinner.getMeasuredHeight();
                CustomSpinner customSpinner2 = this.c;
                customSpinner2.setDropDownVerticalOffset(measuredHeight);
                customSpinner2.setDropDownHorizontalOffset(cn70.b(8));
                break;
            default:
                int measuredHeight2 = customSpinner.getMeasuredHeight();
                CustomSpinner customSpinner3 = this.c;
                customSpinner3.setDropDownVerticalOffset(measuredHeight2);
                customSpinner3.setDropDownHorizontalOffset(cn70.b(8));
                break;
        }
        return s3q0.a;
    }
}
