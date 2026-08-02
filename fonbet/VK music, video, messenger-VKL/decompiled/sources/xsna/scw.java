package xsna;

import android.content.DialogInterface;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;

/* compiled from: ImSettingsDialogThemeFragment.kt */
/* loaded from: classes2.dex */
public final class scw implements DialogInterface.OnClickListener {
    public final /* synthetic */ ImSettingsDialogThemeFragment b;

    public scw(ImSettingsDialogThemeFragment imSettingsDialogThemeFragment) {
        this.b = imSettingsDialogThemeFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = this.b;
        com.vk.im.ui.components.theme_chooser.b bVar = imSettingsDialogThemeFragment.T;
        if (bVar != null) {
            imSettingsDialogThemeFragment.fo(bVar, new ucw(bVar));
        }
    }
}
