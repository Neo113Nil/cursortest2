package xsna;

import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthStatSender;
import com.vkontakte.android.R;
import xsna.eeu0;

/* compiled from: PhoneConfirmationPresenter.kt */
/* loaded from: classes15.dex */
public final class d3a0 extends p66<x65> {
    public xpu0 A;
    public final String x;
    public final String y;
    public final DefaultAuthActivity z;

    public d3a0(String str, String str2, DefaultAuthActivity defaultAuthActivity) {
        this.x = str;
        this.y = str2;
        this.z = defaultAuthActivity;
        this.s = new c3a0(this);
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66
    public final void u0(Throwable th) {
        DefaultAuthActivity defaultAuthActivity = this.z;
        eeu0.a aVar = new eeu0.a(defaultAuthActivity);
        aVar.a.f = wbu0.a(defaultAuthActivity, th, false).a;
        aVar.setTitle(defaultAuthActivity.getString(R.string.vk_auth_error));
        aVar.j(defaultAuthActivity.getString(R.string.vk_ok), null);
        aVar.i = new b3a0(this, 0);
        aVar.m();
    }
}
