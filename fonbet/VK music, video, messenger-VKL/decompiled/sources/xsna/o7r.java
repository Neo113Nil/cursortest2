package xsna;

import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FieldsExt.kt */
/* loaded from: classes5.dex */
public final class o7r {
    public static final void a(ArrayList arrayList, VkEmailForwardingConfig vkEmailForwardingConfig) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = (SchemeStatSak$RegistrationFieldItem) it.next();
            if (schemeStatSak$RegistrationFieldItem.a() == SchemeStatSak$RegistrationFieldItem.Name.IS_INPUT_SKIPPED_BY_EMAIL || schemeStatSak$RegistrationFieldItem.a() == SchemeStatSak$RegistrationFieldItem.Name.CAN_ENTER_BY_MAIL_PASS) {
                it.remove();
            }
        }
        if (vkEmailForwardingConfig != null) {
            arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.IS_INPUT_SKIPPED_BY_EMAIL, "", "", com.vk.registration.funnels.a.e(Boolean.TRUE)));
            if (vkEmailForwardingConfig.b) {
                arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.CAN_ENTER_BY_MAIL_PASS, "", "", null));
            }
        }
    }
}
