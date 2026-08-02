package xsna;

import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;

/* compiled from: SettingsFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class r1j0 extends uaj0 {
    public final SettingsArguments a;

    public r1j0(SettingsArguments settingsArguments) {
        this.a = settingsArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1j0) && epx.f(this.a, ((r1j0) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SettingsFragmentScopeKey(arguments=" + this.a + ')';
    }
}
