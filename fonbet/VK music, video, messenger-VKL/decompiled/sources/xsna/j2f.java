package xsna;

import android.content.DialogInterface;
import com.vk.core.ui.modal.VkModal;
import com.vk.video.profile.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j2f implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.c) this.c).dispose();
                break;
            case 1:
                ((wlg) this.c).c.invoke(a.e.b);
                break;
            default:
                VkModal vkModal = ((dfw) this.c).i;
                if (vkModal == null) {
                    vkModal = null;
                }
                vkModal.a();
                break;
        }
    }
}
