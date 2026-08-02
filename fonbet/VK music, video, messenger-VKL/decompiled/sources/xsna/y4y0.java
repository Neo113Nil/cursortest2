package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import xsna.rv1;

/* compiled from: YandexAlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class y4y0 {

    /* compiled from: YandexAlreadyBoundModal.kt */
    public static final class a implements rv1.a {
        @Override // xsna.rv1.a
        public final void a() {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.YANDEX_NEW_NUMBER, null, null, null, null, null, null, 254);
        }
    }

    public static final rv1 a(ld20 ld20Var) {
        return new rv1(ld20Var, "YandexVkIDAlreadyBound", R.string.vk_auth_id_already_bound_to_another_yandex_id_modal_title, new a(), null);
    }
}
