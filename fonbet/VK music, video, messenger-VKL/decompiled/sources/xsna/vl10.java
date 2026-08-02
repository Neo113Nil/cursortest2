package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.R$string;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes13.dex */
public final class vl10 extends hk {
    public final /* synthetic */ com.google.android.material.datepicker.c b;

    public vl10(com.google.android.material.datepicker.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        com.google.android.material.datepicker.c cVar = this.b;
        amVar.a.setHintText(cVar.u.getVisibility() == 0 ? cVar.getString(R$string.mtrl_picker_toggle_to_year_selection) : cVar.getString(R$string.mtrl_picker_toggle_to_day_selection));
    }
}
