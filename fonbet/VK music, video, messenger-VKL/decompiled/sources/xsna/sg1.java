package xsna;

import android.content.DialogInterface;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sg1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ sg1(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = AlbumDetailsFragment.p0;
                dialogInterface.dismiss();
                break;
            case 1:
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
