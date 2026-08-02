package xsna;

import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionProfileButtonDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionProfileDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.db7;
import xsna.ib7;
import xsna.ka7;
import xsna.kb7;
import xsna.ntf0;
import xsna.oa7;
import xsna.of90;

/* compiled from: BirthdaysListReducer.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class ya7 extends FunctionReferenceImpl implements izs<db7.a, kb7.a> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kb7.a invoke(db7.a aVar) {
        ib7 ib7Var;
        ?? r11;
        ib7.a aVar2;
        String str;
        Integer m;
        db7.a aVar3 = aVar;
        oa7 oa7Var = (oa7) this.receiver;
        oa7Var.getClass();
        of90 of90Var = aVar3.d;
        ListBuilder e = e43.e();
        for (ab7 ab7Var : aVar3.b.a) {
            e.add(new jb7(ab7Var.a));
            for (FriendsGetBirthdaysSectionProfileDto friendsGetBirthdaysSectionProfileDto : ab7Var.b) {
                UsersUserFullDto f = friendsGetBirthdaysSectionProfileDto.f();
                if (f != null) {
                    oa7Var.a.getClass();
                    UserProfile a = j2r0.a(f);
                    List<FriendsGetBirthdaysSectionProfileButtonDto> d = friendsGetBirthdaysSectionProfileDto.d();
                    if (d != null) {
                        r11 = new ArrayList();
                        Iterator it = d.iterator();
                        while (it.hasNext()) {
                            int i = oa7.a.$EnumSwitchMapping$0[((FriendsGetBirthdaysSectionProfileButtonDto) it.next()).ordinal()];
                            if (i == 1) {
                                aVar2 = new ib7.a(R.drawable.vk_icon_list_like_outline_28, R.string.birthdays_list_accessibility_open_wishlist, ka7.b.a);
                            } else if (i == 2) {
                                aVar2 = new ib7.a(R.drawable.vk_icon_message_outline_28, R.string.birthdays_list_accessibility_send_message, ka7.d.a);
                            } else if (i == 3) {
                                aVar2 = new ib7.a(R.drawable.vk_icon_gift_outline_28, R.string.birthdays_list_accessibility_send_gift, ka7.c.a);
                            } else {
                                if (i != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                UsersUserFullDto f2 = friendsGetBirthdaysSectionProfileDto.f();
                                String i2 = f2 != null ? f2.i() : null;
                                if (i2 != null) {
                                    List c0 = drm0.c0(i2, new String[]{"."}, 0, 6);
                                    if (c0.size() < 2) {
                                        c0 = null;
                                    }
                                    if (c0 != null && (m = arm0.m(10, (String) c0.get(0))) != null) {
                                        int intValue = m.intValue();
                                        Integer m2 = arm0.m(10, (String) c0.get(1));
                                        if (m2 != null) {
                                            int intValue2 = m2.intValue();
                                            Calendar calendar = Calendar.getInstance();
                                            int i3 = calendar.get(1);
                                            calendar.set(i3, intValue2 - 1, intValue, 10, 0, 0);
                                            calendar.set(14, 0);
                                            Calendar calendar2 = Calendar.getInstance();
                                            calendar2.set(11, 0);
                                            calendar2.set(12, 0);
                                            calendar2.set(13, 0);
                                            calendar2.set(14, 0);
                                            if (calendar.before(calendar2)) {
                                                calendar.set(1, i3 + 1);
                                            }
                                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
                                            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                                            str = simpleDateFormat.format(calendar.getTime());
                                            aVar2 = str != null ? null : new ib7.a(R.drawable.vk_icon_gift_clock_outline_28, R.string.birthdays_list_accessibility_send_scheduled_gift, new ka7.e(str));
                                        }
                                    }
                                }
                                str = null;
                                if (str != null) {
                                }
                            }
                            if (aVar2 != null) {
                                r11.add(aVar2);
                            }
                        }
                    } else {
                        r11 = EmptyList.b;
                    }
                    List list = r11;
                    UserId userId = a.c;
                    kr5 b = qp5.b(a);
                    String str2 = a.e;
                    String e2 = friendsGetBirthdaysSectionProfileDto.e();
                    if (e2 == null) {
                        e2 = "";
                    }
                    ib7Var = new ib7(userId, b, str2, e2, a.n, a.B, list);
                } else {
                    ib7Var = null;
                }
                if (ib7Var != null) {
                    e.add(ib7Var);
                }
            }
        }
        if (of90Var instanceof of90.c) {
            e.add(hb7.b);
        }
        if (of90Var instanceof of90.a) {
            e.add(new gb7(((of90.a) of90Var).a));
        }
        return new kb7.a(e.g(), aVar3.c instanceof ntf0.b);
    }
}
