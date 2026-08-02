package xsna;

import com.vk.core.preference.Preference;

/* compiled from: VkReefPersistentStorage.kt */
/* loaded from: classes5.dex */
public final class qfv0 implements iof0 {
    @Override // xsna.iof0
    public final void a(String str) {
        Preference.H("reef", "state", str);
    }

    @Override // xsna.iof0
    public final String b() {
        return Preference.s("reef", "state", "{}");
    }
}
