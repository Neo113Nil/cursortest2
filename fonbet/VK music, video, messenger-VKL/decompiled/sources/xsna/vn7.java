package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import java.util.ArrayList;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vn7 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vn7(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-589593149, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.bookingCalendarTimeSlotTableView.<anonymous> (BookingCalendarTimeSlotTableView.kt:29)");
                    }
                    BookingCalendarScreenState.TimeSlotSelector.b bVar = (BookingCalendarScreenState.TimeSlotSelector.b) arrayList.get(intValue);
                    int i = intValue / 4;
                    float f = 4;
                    q630 E = ahn.E(s200.C(q630.a.a, new u890(f, i == 0 ? 0 : 8, f, i == ((arrayList.size() + 3) / 4) - 1 ? 0 : 8)), "calendar_slot_item");
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                    izs izsVar = this.c;
                    boolean J = aVar.J(izsVar) | aVar.J(bVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new g4(6, izsVar, bVar);
                        aVar.R(x);
                    }
                    bhu0.c((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, null, false, null, null, null, false, kai.c(880825864, new un7(bVar, 0), aVar), aVar, X2.b.f, 384, 4064);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                StoryPrivacyType storyPrivacyType = (StoryPrivacyType) obj;
                StoryPrivacyType storyPrivacyType2 = (StoryPrivacyType) obj2;
                List<UserId> list = (List) obj3;
                List<UserId> list2 = (List) obj4;
                g9m0 g9m0Var = ((m9m0) this.d).b;
                if (storyPrivacyType2 == StoryPrivacyType.ONLY_ME) {
                    storyPrivacyType2 = null;
                }
                g9m0Var.h(storyPrivacyType, storyPrivacyType2, list, list2, g9m0Var.k(), true, true);
                izs izsVar2 = this.c;
                if (izsVar2 != null) {
                    izsVar2.invoke(storyPrivacyType);
                }
                break;
        }
        return s3q0.a;
    }
}
