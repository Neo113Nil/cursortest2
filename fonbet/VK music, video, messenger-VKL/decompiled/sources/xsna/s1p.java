package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;

/* compiled from: EditTextPreferenceDialogFragment.kt */
/* loaded from: classes5.dex */
public final class s1p extends t1p {
    public final u0q0 J = new u0q0(SchemeStat$TypeDialogItem.DialogItem.SETTINGS_TEXT_VALUE, null);

    @Override // androidx.preference.a, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.J.a();
    }

    @Override // androidx.preference.a, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.r1p
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                s1p.this.J.c();
            }
        });
        return yn;
    }
}
