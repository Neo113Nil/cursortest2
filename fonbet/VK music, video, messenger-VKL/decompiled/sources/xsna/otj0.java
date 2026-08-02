package xsna;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import xsna.vm10;

/* compiled from: SingleDateSelector.java */
/* loaded from: classes13.dex */
public final class otj0 extends com.google.android.material.datepicker.a {
    public final /* synthetic */ vm10.a j;
    public final /* synthetic */ TextInputLayout k;
    public final /* synthetic */ SingleDateSelector l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otj0(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, vm10.a aVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.l = singleDateSelector;
        this.j = aVar;
        this.k = textInputLayout2;
    }
}
