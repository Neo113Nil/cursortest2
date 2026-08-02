package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.InfoBar;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: VkStickersBridge.kt */
/* loaded from: classes7.dex */
public final class fnv0 implements ldw {
    public static final fnv0 a = new fnv0();

    public final void a(Context context, int i, Long l) {
        g2v.d().a().j(context, i, l != null ? new GiftData(Collections.singleton(new UserId(l.longValue())), false) : GiftData.d, l != null ? new ContextUser(new UserId(l.longValue()), null, null, null, null, 30, null) : null, "message");
    }

    public final void b(FragmentActivity fragmentActivity, int i, long j, String str) {
        g2v.d().a().t(fragmentActivity, i, new UserId(j), str, "message");
    }

    public final void c(Context context, InfoBar.Payload.GiftsBirthdays giftsBirthdays) {
        da7 da7Var;
        List<InfoBar.Payload.GiftsBirthdays.User> list = giftsBirthdays.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (InfoBar.Payload.GiftsBirthdays.User user : list) {
            UserProfile userProfile = new UserProfile();
            userProfile.c = user.b;
            userProfile.d = user.c;
            userProfile.f = user.d;
            userProfile.g = user.e;
            arrayList.add(userProfile);
        }
        zal0 a2 = g2v.d().a();
        List<UserId> list2 = giftsBirthdays.f;
        InfoBar.Payload.GiftsBirthdays.InfoBarBirthdaysData infoBarBirthdaysData = giftsBirthdays.g;
        if (infoBarBirthdaysData != null) {
            String str = infoBarBirthdaysData.b;
            String str2 = infoBarBirthdaysData.c;
            List<InfoBar.Payload.GiftsBirthdays.BirthdaysGroup> list3 = infoBarBirthdaysData.d;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (InfoBar.Payload.GiftsBirthdays.BirthdaysGroup birthdaysGroup : list3) {
                arrayList2.add(new ha7(birthdaysGroup.b, birthdaysGroup.c));
            }
            da7Var = new da7(str, str2, arrayList2);
        } else {
            da7Var = null;
        }
        a2.A(context, arrayList, list2, da7Var, giftsBirthdays.e);
    }
}
