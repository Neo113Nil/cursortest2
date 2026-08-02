package xsna;

import android.content.DialogInterface;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sm1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ sm1(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = AlbumsFragment.j0;
                dialogInterface.dismiss();
                break;
            default:
                int i3 = SettingsGeneralFragment.z0;
                dialogInterface.dismiss();
                break;
        }
    }
}
