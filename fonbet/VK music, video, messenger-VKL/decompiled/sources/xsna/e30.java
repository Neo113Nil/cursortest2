package xsna;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Playlist;
import com.vk.toggle.debug.BaseDebugTogglesFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ComponentName component;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                h30 h30Var = (h30) obj;
                dialogInterface.dismiss();
                VideoFile videoFile = h30Var.c;
                io.reactivex.rxjava3.observers.a aVar = h30Var.m;
                if (aVar != null) {
                    aVar.dispose();
                }
                io.reactivex.rxjava3.core.q<Boolean> i3 = fxc0.B().T().i(videoFile.o0(), videoFile.I0());
                l30 l30Var = new l30(h30Var);
                i3.subscribe(l30Var);
                h30Var.m = l30Var;
                return;
            case 1:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) obj;
                int i4 = BaseDebugTogglesFragment.X;
                if (i == -1) {
                    dialogInterface.dismiss();
                    return;
                }
                cvk.w("Restart! Wait please...", false);
                Intent launchIntentForPackage = baseDebugTogglesFragment.requireContext().getPackageManager().getLaunchIntentForPackage(baseDebugTogglesFragment.requireContext().getPackageName());
                if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                    baseDebugTogglesFragment.requireContext().startActivity(Intent.makeRestartActivityTask(component));
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 2:
                vg40 vg40Var = (vg40) obj;
                Playlist playlist = vg40Var.q;
                if (playlist != null) {
                    vg40Var.l.V(playlist);
                }
                dialogInterface.dismiss();
                return;
            default:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    return;
                }
                return;
        }
    }
}
