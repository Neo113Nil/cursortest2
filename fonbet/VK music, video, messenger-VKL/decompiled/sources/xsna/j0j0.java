package xsna;

import android.content.DialogInterface;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class j0j0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsAccountInnerFragment b;

    public j0j0(SettingsAccountInnerFragment settingsAccountInnerFragment) {
        this.b = settingsAccountInnerFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsAccountInnerFragment settingsAccountInnerFragment = this.b;
        if ((!settingsAccountInnerFragment.m0.g ? 1 : 0) != i) {
            io.reactivex.rxjava3.disposables.b bVar = settingsAccountInnerFragment.n0;
            boolean z = i == 0;
            gs gsVar = new gs();
            gsVar.K("name", "own_posts_default");
            gsVar.K("value", z ? "1" : "0");
            gsVar.k = true;
            bVar.b(rsg0.y0(gsVar, null, null, 3).subscribe(new k0j0(settingsAccountInnerFragment, i)));
        }
    }
}
