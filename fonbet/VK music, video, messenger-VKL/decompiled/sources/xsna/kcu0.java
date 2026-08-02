package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import xsna.dh6;

/* compiled from: VkAuthModalDialogDelegate.kt */
/* loaded from: classes15.dex */
public final class kcu0 implements dh6.a {
    public final SchemeStatSak$EventScreen b;
    public final boolean c;
    public final ArrayList<SchemeStatSak$RegistrationFieldItem> d;
    public boolean e;
    public SchemeStatSak$EventScreen f;

    public /* synthetic */ kcu0(SchemeStatSak$EventScreen schemeStatSak$EventScreen, boolean z) {
        this(schemeStatSak$EventScreen, z, null);
    }

    @Override // xsna.dh6.a
    public final void a() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        this.f = frf0.f(this.f, this.b, this.d, false, null, null, 56);
    }

    @Override // xsna.dh6.a
    public final void b() {
        if (this.e) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.g(this.b, this.f, this.d, null, 8);
            this.e = false;
        }
    }

    public kcu0(SchemeStatSak$EventScreen schemeStatSak$EventScreen, boolean z, ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList) {
        this.b = schemeStatSak$EventScreen;
        this.c = z;
        this.d = arrayList;
        this.e = true;
    }
}
