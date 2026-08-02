package xsna;

import com.vk.core.preference.Preference;

/* compiled from: CallDebugOptionsRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class u29 implements t29 {
    @Override // xsna.t29
    public final void a(String str, boolean z) {
        qaj0.c(Preference.f("voip_debug_options"), str, Boolean.valueOf(z));
    }

    @Override // xsna.t29
    public final boolean b(String str, boolean z) {
        return Preference.f("voip_debug_options").getBoolean(str, z);
    }
}
