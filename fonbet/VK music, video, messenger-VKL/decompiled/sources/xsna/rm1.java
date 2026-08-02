package xsna;

import android.content.DialogInterface;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import xsna.sq1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rm1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rm1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = AlbumsFragment.j0;
                ((sq1.f) obj).d.invoke();
                break;
            case 1:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                SettingsGeneralFragment.ro("ClearAllWithoutLogoutClicked");
                com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(settingsGeneralFragment.kn());
                cVar.n(settingsGeneralFragment.getResources().getString(R.string.loading));
                cVar.show();
                cVar.setCancelable(false);
                settingsGeneralFragment.m0.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new dil(settingsGeneralFragment, 1)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bdz(cVar, 20)));
                dialogInterface.dismiss();
                break;
            case 2:
                ((ttx) obj).invoke();
                break;
            case 3:
                ((gzs) obj).invoke();
                break;
            default:
                c0v0 c0v0Var = (c0v0) obj;
                wzu0 wzu0Var = c0v0Var.c;
                WebIdentityCardData webIdentityCardData = c0v0Var.v;
                WebIdentityCard webIdentityCard = null;
                if (webIdentityCardData != null) {
                    String str = c0v0Var.w;
                    webIdentityCard = webIdentityCardData.Ab(c0v0Var.t, str != null ? str : null);
                }
                wzu0Var.Z(webIdentityCard);
                break;
        }
    }
}
