package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import xsna.l5x0;

/* compiled from: VirtualBackgroundPreferences.kt */
/* loaded from: classes7.dex */
public final class m4u0 implements unw0 {
    public final l5x0.d a;
    public final bpn0 b = new bpn0(new ap80(this, 15));

    public m4u0(l5x0.d dVar) {
        this.a = dVar;
    }

    @Override // xsna.unw0
    public final boolean a() {
        return e().contains("VoipVirtualBackgroundController_maskId_str");
    }

    @Override // xsna.unw0
    public final void b() {
        SharedPreferences.Editor edit = e().edit();
        edit.remove(new String[]{"VoipVirtualBackgroundController_maskId_str"}[0]);
        edit.apply();
    }

    @Override // xsna.unw0
    public final String c() {
        String string = e().getString("VoipVirtualBackgroundController_maskId_str", "");
        if (string != null) {
            return string;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // xsna.unw0
    public final void d(String str) {
        qaj0.c(e(), "VoipVirtualBackgroundController_maskId_str", str);
    }

    public final SharedPreferences e() {
        return Preference.e(((UserId) this.a.invoke()).b, (String) this.b.getValue());
    }
}
