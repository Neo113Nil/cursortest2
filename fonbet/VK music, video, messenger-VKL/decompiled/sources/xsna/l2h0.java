package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import xsna.rv1;

/* compiled from: SberAlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class l2h0 {

    /* compiled from: SberAlreadyBoundModal.kt */
    public static final class a implements rv1.a {
        @Override // xsna.rv1.a
        public final void a() {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SBER_NEW_NUMBER, null, null, null, null, null, null, 254);
        }
    }

    public static final rv1 a(ld20 ld20Var) {
        return new rv1(ld20Var, "SberVkIDAlreadyBound", R.string.vk_auth_id_already_bound_to_another_sber_id_modal_title, new a(), null);
    }
}
