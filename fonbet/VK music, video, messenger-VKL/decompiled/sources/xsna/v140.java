package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.a;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import java.util.ArrayList;
import xsna.usi0;

/* compiled from: MultiAccountAnalyticsHelper.kt */
/* loaded from: classes6.dex */
public final class v140 {
    public final MultiAccountEntryPoint a;
    public final SchemeStatSak$EventScreen b;
    public final mui0 c;
    public final com.vk.superapp.multiaccount.api.a d;

    public v140(MultiAccountEntryPoint multiAccountEntryPoint, SchemeStatSak$EventScreen schemeStatSak$EventScreen, mui0 mui0Var, com.vk.superapp.multiaccount.api.a aVar) {
        this.a = multiAccountEntryPoint;
        this.b = schemeStatSak$EventScreen;
        this.c = mui0Var;
        this.d = aVar;
    }

    public static void b(v140 v140Var, SchemeStatSak$TypeMultiaccountsItem.EventType eventType, UserId userId) {
        UserId userId2;
        fhq0 c;
        usi0.a i = v140Var.c.i();
        if (i == null || (c = i.c()) == null || (userId2 = c.a) == null) {
            userId2 = UserId.d;
        }
        UserId userId3 = userId2;
        int size = yxi0.a(v140Var.c.e()).size();
        ArrayList e = v140Var.c.e();
        com.vk.superapp.multiaccount.api.a aVar = v140Var.d;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = v140Var.b;
        usi0.a i2 = v140Var.c.i();
        UserId userId4 = null;
        if (i2 != null) {
            usi0.a.b bVar = i2 instanceof usi0.a.b ? (usi0.a.b) i2 : null;
            if (bVar != null) {
                userId4 = bVar.g;
            }
        }
        aVar.c(new a.d(eventType, schemeStatSak$EventScreen, userId3, userId, size, e, true, null, userId4, 128));
    }

    public static void c(v140 v140Var, SchemeStatSak$TypeRegistrationItem.EventType eventType, UserId userId, VkAnalyticsUserType vkAnalyticsUserType, VkAnalyticsUserType vkAnalyticsUserType2, int i) {
        usi0.a i2;
        fhq0 c;
        if ((i & 2) != 0 && ((i2 = v140Var.c.i()) == null || (c = i2.c()) == null || (userId = c.a) == null)) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        if ((i & 4) != 0) {
            vkAnalyticsUserType = null;
        }
        if ((i & 8) != 0) {
            vkAnalyticsUserType2 = null;
        }
        v140Var.d.e(new a.f(v140Var.b, eventType, userId2, v140Var.a(vkAnalyticsUserType, vkAnalyticsUserType2), null));
    }

    public final ArrayList<SchemeStatSak$RegistrationFieldItem> a(VkAnalyticsUserType vkAnalyticsUserType, VkAnalyticsUserType vkAnalyticsUserType2) {
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.TO_SWITCHER_FROM;
        MultiAccountEntryPoint multiAccountEntryPoint = this.a;
        ArrayList<SchemeStatSak$RegistrationFieldItem> a = e43.a(new SchemeStatSak$RegistrationFieldItem(name, "", "", multiAccountEntryPoint != null ? multiAccountEntryPoint.b : null));
        if (vkAnalyticsUserType2 != null && vkAnalyticsUserType != null) {
            a.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.FROM_PROFILE_TYPE, "", "", vkAnalyticsUserType.i()));
            a.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.TO_PROFILE_TYPE, "", "", vkAnalyticsUserType2.i()));
            return a;
        }
        if (vkAnalyticsUserType == null) {
            vkAnalyticsUserType = vkAnalyticsUserType2;
        }
        if (vkAnalyticsUserType != null) {
            a.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.PROFILE_TYPE, "", "", vkAnalyticsUserType.i()));
        }
        return a;
    }
}
