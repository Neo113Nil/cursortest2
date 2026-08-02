package xsna;

import com.vk.core.preference.Preference;

/* compiled from: MuteSettingsDefault.kt */
/* loaded from: classes2.dex */
public final class si50 implements ri50 {
    public final pey a;
    public boolean b = true;
    public boolean c;

    public si50(pkd pkdVar, pey peyVar) {
        this.a = peyVar;
        pkdVar.h().getClass();
        this.c = Preference.d("PlaySettingsPrefs", "PlaySettingsPrefs.clip_feed_mute", true);
        pkdVar.h().getClass();
    }

    @Override // xsna.ri50
    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (!z) {
                c(z);
            }
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @Override // xsna.ri50
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.ri50
    public final void c(boolean z) {
        if (this.c != z) {
            this.c = z;
            Preference.I("PlaySettingsPrefs", "PlaySettingsPrefs.clip_feed_mute", z);
            this.a.invoke(Boolean.valueOf(z));
        }
    }

    @Override // xsna.ri50
    public final boolean d() {
        return this.c;
    }
}
