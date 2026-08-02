package defpackage;

import android.view.View;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.rangedatepicker.RangeDatePickerCalendarView;

/* loaded from: classes3.dex */
public final class a461 implements zo31 {
    public final PFMCalendarView a;

    public a461(PFMCalendarView pFMCalendarView, LoadableInput loadableInput, LoadableInput loadableInput2, RangeDatePickerCalendarView rangeDatePickerCalendarView) {
        this.a = pFMCalendarView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
