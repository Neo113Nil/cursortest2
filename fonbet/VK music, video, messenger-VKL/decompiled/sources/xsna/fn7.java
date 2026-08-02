package xsna;

import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vk.voip.ui.sessionrooms.f;
import java.util.Collections;
import kotlin.Pair;
import xsna.fwo;
import xsna.lrq0;
import xsna.vd70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class fn7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fn7(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((pn7) this.c).k((BookingCalendarScreenState.TimeSlotSelector.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 1:
                String str = (String) this.c;
                String str2 = (String) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                ay9.l(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, q630Var);
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                fid.a((s61) this.c, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                gzs gzsVar = (gzs) this.c;
                gzs gzsVar2 = (gzs) this.d;
                q630 q630Var2 = (q630) this.e;
                ((Integer) obj2).getClass();
                rmd.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var2);
                return s3q0.a;
            case 4:
                String str3 = (String) this.c;
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.d;
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1191354413, intValue, -1, "com.vk.core.tool.compose.dialogs.DatePickerDialog.<anonymous> (DatePickerDialog.kt:52)");
                    }
                    eyk.b(str3, dateTimePickerState, null, semanticsConfiguration, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((qwo) this.c).h((fwo.b) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 6:
                be70 be70Var = (be70) this.c;
                vd70 vd70Var = (vd70) this.d;
                izs<? super fd70, s3q0> izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1832369473, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.menu.NotificationMenuModalView.NotificationMenuModalContent.<anonymous>.<anonymous> (NotificationMenuModalView.kt:112)");
                    }
                    be70Var.h((vd70.a) vd70Var, izsVar, aVar2, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((gmh0) this.c).j((mmh0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                return s3q0.a;
            case 8:
                com.vk.voip.ui.sessionrooms.dialog.model.a aVar3 = (com.vk.voip.ui.sessionrooms.dialog.model.a) this.c;
                f.a.b bVar = (f.a.b) this.d;
                Pair pair = (Pair) obj;
                return aVar3.d(bVar.c, (a.c) this.e, Collections.singletonList(bVar), new Pair<>(on00.f(new Pair(bVar.a, pair.i())), pair.j()), (Pair) obj2);
            default:
                ((Integer) obj2).getClass();
                ((lrq0) this.c).g((lrq0.b) this.d, (qvm0) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                return s3q0.a;
        }
    }

    public /* synthetic */ fn7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
