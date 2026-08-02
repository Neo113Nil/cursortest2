package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.toggle.features.ImFeatures;

/* compiled from: VkAppDialogsFragmentProvider.kt */
/* loaded from: classes11.dex */
public final class l9u0 implements qqm {
    public static final l9u0 a = new l9u0();

    @Override // xsna.qqm
    public final Class<? extends FragmentImpl> a() {
        return DialogsScreenFragment.class;
    }

    @Override // xsna.qqm
    public final oz50 b(long j) {
        return new GroupDialogsScreenFragment.a(j);
    }

    @Override // xsna.qqm
    public final Bundle c(boolean z) {
        if (!z) {
            return null;
        }
        w0o0 w0o0Var = new w0o0(8);
        ha40 ha40Var = new ha40(28);
        ImFeatures imFeatures = ImFeatures.CHANNELS_FOLDER_FORCED_ANY;
        imFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(imFeatures) && g620.b == 0 && g620.d > 0) {
            ha40Var.invoke("channels_forced_any");
            return (Bundle) w0o0Var.invoke();
        }
        ImFeatures imFeatures2 = ImFeatures.CHANNELS_FOLDER_FORCED_UNMUTED;
        imFeatures2.getClass();
        if (!bVar.a(imFeatures2) || g620.b != 0 || g620.e <= 0) {
            return null;
        }
        ha40Var.invoke("channels_forced_unmuted");
        return (Bundle) w0o0Var.invoke();
    }

    @Override // xsna.qqm
    public final oz50 f() {
        return new DialogsScreenFragment.a();
    }
}
