package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;

/* compiled from: CredentialsAnalyticsImpl.kt */
/* loaded from: classes.dex */
public final class udk implements tdk {
    @Override // xsna.tdk
    public final void a() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_USE_CANCELED, null, null, null, null, null, null, 254);
    }

    @Override // xsna.tdk
    public final void b() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_USE_AGREED, null, null, null, null, null, null, 254);
    }

    @Override // xsna.tdk
    public final void c() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_SAVE_SUGGEST, null, null, null, null, null, null, 254);
    }

    @Override // xsna.tdk
    public final void d() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_USE_SUGGEST, null, null, null, null, null, null, 254);
    }

    @Override // xsna.tdk
    public final void e() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_SAVING_DECLINED, null, null, null, null, null, null, 254);
    }

    @Override // xsna.tdk
    public final void f() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SMART_LOCK_SAVING_CONFIRMED, null, null, null, null, null, null, 254);
    }
}
