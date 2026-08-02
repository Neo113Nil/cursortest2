package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.vk.libvideo.dialogs.BaseAnimationDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class b56 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b56(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                BaseAnimationDialog baseAnimationDialog = (BaseAnimationDialog) obj;
                pkk pkkVar = BaseAnimationDialog.Z;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                baseAnimationDialog.b(false);
                return true;
            default:
                return ((omo) obj).a(i);
        }
    }
}
