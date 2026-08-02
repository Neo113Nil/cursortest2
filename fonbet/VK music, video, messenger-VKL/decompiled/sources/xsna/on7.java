package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountPrivacyValueDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.calendar.BookingCalendarScreenState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ems;
import xsna.rfb;
import xsna.wgb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class on7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ on7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                final BookingCalendarScreenState.TimeSlotSelector timeSlotSelector = (BookingCalendarScreenState.TimeSlotSelector) this.c;
                final pn7 pn7Var = (pn7) this.d;
                final izs izsVar = (izs) this.e;
                rry rryVar = (rry) obj;
                int i3 = 3;
                if (timeSlotSelector instanceof BookingCalendarScreenState.TimeSlotSelector.a) {
                    rryVar.f("masterBusy", new gv3(i3), new jai(263143258, new yzs() { // from class: xsna.cn7
                        @Override // xsna.yzs
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(263143258, intValue, -1, "com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenMviView.TimeSlots.<anonymous>.<anonymous>.<anonymous> (BookingCalendarScreenMviView.kt:194)");
                                }
                                pn7.this.k((BookingCalendarScreenState.TimeSlotSelector.a) timeSlotSelector, izsVar, aVar, 512);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar.h();
                            }
                            return s3q0.a;
                        }
                    }, true));
                } else {
                    if (!(timeSlotSelector instanceof BookingCalendarScreenState.TimeSlotSelector.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    for (BookingCalendarScreenState.TimeSlotSelector.Block block : ((BookingCalendarScreenState.TimeSlotSelector.c) timeSlotSelector).a) {
                        rryVar.f(block.a, new gv3(i3), new jai(1521588223, new en7(i2, block, pn7Var), true));
                        ArrayList arrayList = block.b;
                        rry.d(rryVar, arrayList.size(), new com.vk.movika.sdk.base.observable.a(arrayList, 8), new jai(-589593149, new vn7(i2, arrayList, izsVar), true), 12);
                    }
                }
                return s3q0.a;
            case 1:
                wgb wgbVar = (wgb) this.c;
                rfb.a.b bVar = (rfb.a.b) this.d;
                aeb aebVar = (aeb) this.e;
                gz9 gz9Var = wgbVar.b;
                gz9Var.a(new hc1(4, wgbVar, aebVar));
                sfb a = wgbVar.f.a(bVar);
                gz9Var.a(new ry3(wgbVar, aebVar, a, i));
                wgbVar.c((wgb.b) obj, a, aebVar, true);
                return s3q0.a;
            case 2:
                lgj lgjVar = (lgj) this.c;
                eyx eyxVar = (eyx) this.d;
                n160 n160Var = (n160) this.e;
                float floatValue = ((Float) obj).floatValue();
                float f = lgjVar.r ? 1.0f : -1.0f;
                zhh0 zhh0Var = lgjVar.q;
                float g = zhh0Var.g(zhh0Var.e(n160Var.b(zhh0Var.e(zhh0Var.h(f * floatValue))))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    eyxVar.b(fsk.j("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')', null));
                }
                return s3q0.a;
            case 3:
                UIBlockProfile uIBlockProfile = (UIBlockProfile) this.c;
                UserProfile userProfile = uIBlockProfile.A;
                Context context = (Context) this.d;
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) this.e;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (epx.f(((UsersUserFullDto) obj2).s1(), userProfile.c)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj2;
                uIBlockProfile.E = 1;
                BaseBoolIntDto g3 = usersUserFullDto != null ? usersUserFullDto.g3() : null;
                BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                Object[] objArr = g3 == baseBoolIntDto;
                boolean z = (usersUserFullDto != null ? usersUserFullDto.D() : null) == baseBoolIntDto;
                boolean z2 = userProfile.e0 == SocialButtonType.FOLLOW;
                FriendsSuggestsVh.b bVar2 = objArr != false ? FriendsSuggestsVh.b.REQUEST_ACCEPTED : z2 ? FriendsSuggestsVh.b.STARTED_FOLLOWING : FriendsSuggestsVh.b.REQUEST_SENT;
                if (userProfile.z || objArr == true) {
                    friendsSuggestsVh.h(bVar2, z);
                } else if (!zls.o(ams.a(), context, z2, 2)) {
                    friendsSuggestsVh.h(bVar2, z);
                }
                UIBlockProfile uIBlockProfile2 = friendsSuggestsVh.h;
                m3a m3aVar = friendsSuggestsVh.b;
                if (uIBlockProfile.equals(uIBlockProfile2)) {
                    VkRichCell vkRichCell = friendsSuggestsVh.g;
                    VkRichCell vkRichCell2 = vkRichCell != null ? vkRichCell : null;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    pgv0 middle = vkRichCell.getMiddle();
                    vkRichCell2.setMiddle(middle != null ? friendsSuggestsVh.e(middle, context, uIBlockProfile) : null);
                }
                if (objArr == true) {
                    m3aVar.j(new ems.a(uIBlockProfile));
                } else {
                    m3aVar.j(new ems.e(uIBlockProfile));
                }
                return s3q0.a;
            case 4:
                ((x7y) this.c).L0().e((String) this.d, (String) this.e, (Throwable) obj);
                return s3q0.a;
            case 5:
                NotificationAction notificationAction = (NotificationAction) this.c;
                NotificationItem notificationItem = (NotificationItem) this.d;
                bj70 bj70Var = (bj70) this.e;
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_done_24);
                if ("tag_photo_accept".equals(notificationAction.b)) {
                    notificationItem.v = new NotificationItem.b(valueOf, Integer.valueOf(R.string.not_photo_tag_confirmed));
                } else {
                    notificationItem.v = new NotificationItem.b(valueOf, Integer.valueOf(R.string.not_photo_tag_removed));
                }
                bj70Var.Q(notificationItem);
                return s3q0.a;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                List list = (List) obj;
                AccountPrivacyValueDto accountPrivacyValueDto = (AccountPrivacyValueDto) ref$ObjectRef.element;
                String i4 = accountPrivacyValueDto != null ? accountPrivacyValueDto.i() : null;
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    long longValue = ((Number) it2.next()).longValue();
                    gzs<s3q0> gzsVar = fkq0.a;
                    dq.h(longValue, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    long longValue2 = ((Number) it3.next()).longValue();
                    gzs<s3q0> gzsVar2 = fkq0.a;
                    dq.h(longValue2, arrayList5);
                }
                return new StoryPrivacyResponse(i4, list, arrayList5, arrayList4);
        }
    }

    public /* synthetic */ on7(lgj lgjVar, o7q0 o7q0Var, eyx eyxVar, n160 n160Var) {
        this.b = 2;
        this.c = lgjVar;
        this.d = eyxVar;
        this.e = n160Var;
    }
}
