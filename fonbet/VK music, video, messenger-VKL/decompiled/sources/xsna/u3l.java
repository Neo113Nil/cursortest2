package xsna;

import android.content.DialogInterface;
import android.os.Process;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class u3l implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String[] strArr = DebugDevSettingsFragment.t0;
        if (i == -1) {
            dialogInterface.dismiss();
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(0);
        } catch (Throwable unused) {
        }
    }
}
