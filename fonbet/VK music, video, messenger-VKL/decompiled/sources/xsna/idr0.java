package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;

/* compiled from: VKListPreferenceDialogFragment.kt */
/* loaded from: classes5.dex */
public final class idr0 extends agz {
    public final u0q0 I = new u0q0(SchemeStat$TypeDialogItem.DialogItem.SETTINGS_LIST_VALUE, null);

    @Override // androidx.preference.a, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.I.a();
    }

    @Override // androidx.preference.a, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.hdr0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.I.c();
            }
        });
        return yn;
    }
}
