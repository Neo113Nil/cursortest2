package xsna;

import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import xsna.yia;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class w4l implements yia.a {
    public final /* synthetic */ DebugDevSettingsFragment a;

    public w4l(DebugDevSettingsFragment debugDevSettingsFragment) {
        this.a = debugDevSettingsFragment;
    }

    @Override // xsna.yia.a
    public final boolean a0() {
        androidx.appcompat.app.d dVar = this.a.p0;
        if (dVar == null) {
            return false;
        }
        dVar.dismiss();
        return false;
    }

    @Override // xsna.yia.a
    public final void a() {
    }
}
