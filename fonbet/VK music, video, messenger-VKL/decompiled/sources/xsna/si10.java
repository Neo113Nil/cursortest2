package xsna;

import android.content.DialogInterface;
import com.vk.content.design.view.camera.MasksWrap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class si10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = MasksWrap.e0;
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
