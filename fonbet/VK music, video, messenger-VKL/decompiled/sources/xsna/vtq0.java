package xsna;

import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.SimpleTimeZone;
import kotlin.collections.EmptyList;

/* compiled from: UserProfilePromoBtnFactoryDelegate.kt */
/* loaded from: classes5.dex */
public final class vtq0 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(ExtendedUserProfile extendedUserProfile, List list) {
        ExtendedUserProfile.h hVar;
        UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip birthdayHiddenTooltip;
        int i;
        int i2;
        if (bwd0.d(extendedUserProfile)) {
            return EmptyList.b;
        }
        List singletonList = (extendedUserProfile.a.A || (hVar = extendedUserProfile.c1) == null) ? null : list.isEmpty() ? EmptyList.b : Collections.singletonList(new UserProfileAdapterItem.PromoButtons.BirthdayPromo.a(hVar.b, hVar.c, list, extendedUserProfile));
        if (singletonList != null) {
            return singletonList;
        }
        if (!extendedUserProfile.a.A) {
            int i3 = extendedUserProfile.s;
            int i4 = extendedUserProfile.t;
            SimpleTimeZone simpleTimeZone = pvo0.a;
            int i5 = -1;
            if (i3 > 0 && i4 > 0) {
                Calendar calendar = Calendar.getInstance();
                if (pvo0.a != null) {
                    calendar.setTimeZone(pvo0.a);
                }
                calendar.setTimeInMillis(pvo0.a() * 1000);
                if (i3 <= calendar.getMaximum(5) && i4 - 1 <= calendar.getMaximum(2)) {
                    calendar.set(5, i3);
                    calendar.set(2, i);
                    int i6 = calendar.get(6);
                    int i7 = pvo0.d().get(6);
                    boolean z = calendar.get(5) == i3 && calendar.get(2) + 1 == i4;
                    if (i6 < i7 || !z) {
                        int actualMaximum = (pvo0.d().getActualMaximum(6) - i7) + 1;
                        int i8 = 3;
                        while (true) {
                            calendar.add(1, 1);
                            calendar.set(5, i3);
                            calendar.set(2, i);
                            if (calendar.get(5) == i3 && calendar.get(2) + 1 == i4) {
                                i2 = calendar.get(6) + actualMaximum;
                                break;
                            }
                            actualMaximum += calendar.getActualMaximum(6);
                            i8--;
                            if (i8 <= 0) {
                                i2 = actualMaximum;
                                break;
                            }
                        }
                        if (i8 > 0) {
                            i5 = i2;
                        }
                    } else {
                        i5 = i6 - i7;
                    }
                }
            }
            VasFeatures vasFeatures = VasFeatures.VAS_SCHEDULED_GIFTS;
            vasFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(vasFeatures);
            if (i5 == 0) {
                birthdayHiddenTooltip = new UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip(R.string.item_birthday_today, R.string.item_birthday_send_gift, UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.SendGift, extendedUserProfile);
            } else if (1 <= i5 && i5 < 15 && extendedUserProfile.b1) {
                if (a) {
                    birthdayHiddenTooltip = new UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip(R.string.item_birthday_soon, R.string.item_birthday_schedule_gift, UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.ScheduledGift, extendedUserProfile);
                } else {
                    boolean z2 = extendedUserProfile.b("wishes") > 0;
                    birthdayHiddenTooltip = new UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip(R.string.item_birthday_soon, z2 ? R.string.item_birthday_look_wish_list : R.string.item_birthday_look_ideas, z2 ? UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.Wishes : UserProfileAdapterItem.PromoButtons.BirthdayPromo.BirthdayHiddenTooltip.LinkType.Ideas, extendedUserProfile);
                }
            }
            List singletonList2 = birthdayHiddenTooltip != null ? Collections.singletonList(birthdayHiddenTooltip) : null;
            return singletonList2 != null ? EmptyList.b : singletonList2;
        }
        birthdayHiddenTooltip = null;
        if (birthdayHiddenTooltip != null) {
        }
        if (singletonList2 != null) {
        }
    }
}
