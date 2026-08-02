package xsna;

import android.content.ClipboardManager;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class w3l implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = DebugDevSettingsFragment.t0;
        ((ClipboardManager) e43.a.getSystemService("clipboard")).setText(a201.a().c().i());
        cvk.w("Okay!", false);
    }
}
