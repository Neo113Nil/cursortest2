package xsna;

import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: BookingCancelRecordConfirmationModal.kt */
/* loaded from: classes18.dex */
public final class zn7 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public zn7(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, izs<? super Alert$DismissReason, s3q0> izsVar, BookingServiceType bookingServiceType, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(gzsVar);
        this.b = androidx.compose.runtime.k.b(gzsVar2);
        this.c = androidx.compose.runtime.k.b(izsVar);
        this.d = androidx.compose.runtime.k.b(bookingServiceType);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(953102273);
        int i4 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(953102273, i4, -1, "com.vk.ecomm.onlinebooking.impl.common.ui.BookingCancelRecordConfirmationDialogImpl.Content (BookingCancelRecordConfirmationModal.kt:59)");
            }
            if (((BookingServiceType) ((zak0) this.d).getValue()) == BookingServiceType.INDIVIDUAL) {
                i2 = -158845797;
                i3 = R.string.booking_cancel_record_confirmation_description;
            } else {
                i2 = -158738475;
                i3 = R.string.booking_cancel_group_record_confirmation_description;
            }
            String a = zq.a(M, i2, i3, M, 0);
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.e).getValue();
            q630Var2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var2, semanticsConfiguration);
            String N = d370.N(R.string.booking_cancel_record_confirmation_title, 0, M);
            izs izsVar = (izs) ((zak0) this.c).getValue();
            String N2 = d370.N(R.string.booking_cancel_record_confirmation_cancel, 0, M);
            gzs gzsVar = (gzs) ((zak0) this.a).getValue();
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            t7u0.d(0, 336, M, new Alert$Button(N2, gzsVar, style, cq.b("cancel_record_confirmation_positive", null, 3)), new Alert$Button(d370.N(R.string.booking_cancel_record_confirmation_keep, 0, M), (gzs) ((zak0) this.b).getValue(), style, cq.b("cancel_record_confirmation_negative", null, 3)), null, null, N, a, null, izsVar, b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq1(this, q630Var2, i, 1);
        }
    }
}
