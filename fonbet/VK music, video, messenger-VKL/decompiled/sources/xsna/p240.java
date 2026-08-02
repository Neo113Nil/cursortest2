package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import xsna.wxi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class p240 implements ayi0 {
    @Override // xsna.ayi0
    public final void a(uxi0 uxi0Var) {
        wxi0 a = new vxi0(uxi0Var).a();
        if (a instanceof wxi0.a) {
            Preference preference = Preference.a;
            long j = ((wxi0.a) a).a().b;
            preference.getClass();
            Preference.f = String.valueOf(j);
            return;
        }
        if (a instanceof wxi0.d) {
            UserId b = ((wxi0.d) a).a().c().b();
            Preference preference2 = Preference.a;
            long j2 = b.b;
            preference2.getClass();
            Preference.f = String.valueOf(j2);
            return;
        }
        if (a instanceof wxi0.c) {
            Preference preference3 = Preference.a;
            long j3 = ((wxi0.c) a).a().b;
            preference3.getClass();
            Preference.E(j3, true);
        }
    }
}
