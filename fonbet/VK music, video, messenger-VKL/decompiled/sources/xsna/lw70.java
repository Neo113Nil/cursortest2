package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import xsna.rv1;

/* compiled from: OkAlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class lw70 {

    /* compiled from: OkAlreadyBoundModal.kt */
    public static final class a implements rv1.a {
        @Override // xsna.rv1.a
        public final void a() {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OK_NEW_NUMBER, null, null, null, null, null, null, 254);
        }
    }

    public static final rv1 a(ld20 ld20Var) {
        return new rv1(ld20Var, "OkVkIDAlreadyBound", R.string.vk_auth_id_already_bound_to_another_ok_id_modal_title, new a(), null);
    }
}
