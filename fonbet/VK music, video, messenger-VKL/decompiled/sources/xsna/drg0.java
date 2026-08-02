package xsna;

import com.vk.core.preference.Preference;

/* compiled from: RuStorePreferenceImpl.kt */
/* loaded from: classes5.dex */
public final class drg0 implements crg0 {
    @Override // xsna.crg0
    public final void a() {
        Preference.C("rustore_pushes", "rustore_token_key");
    }

    @Override // xsna.crg0
    public final void b(String str) {
        Preference.H("rustore_pushes", "rustore_token_key", str);
    }

    @Override // xsna.crg0
    public final String getToken() {
        String s;
        s = Preference.s("rustore_pushes", "rustore_token_key", new String());
        return s;
    }
}
