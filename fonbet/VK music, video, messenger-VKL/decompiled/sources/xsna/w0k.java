package xsna;

import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import java.util.Calendar;
import java.util.SimpleTimeZone;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w0k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w0k(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        long a;
        switch (this.b) {
            case 0:
                return CoverChooseState.a((CoverChooseState) obj, null, null, null, this.c, 15);
            default:
                Calendar calendar = (Calendar) obj;
                if (this.c) {
                    SimpleTimeZone simpleTimeZone = pvo0.a;
                    xuo0.a.getClass();
                    long a2 = xuo0.a();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(a2);
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    a = calendar2.getTime().getTime();
                } else {
                    SimpleTimeZone simpleTimeZone2 = pvo0.a;
                    xuo0.a.getClass();
                    a = xuo0.a();
                }
                return Boolean.valueOf(new CompositeDateValidator(e43.l(new DateValidatorPointForward(a), new DateValidatorPointBackward(yl10.b())), CompositeDateValidator.e).Z6(calendar.getTimeInMillis()));
        }
    }
}
