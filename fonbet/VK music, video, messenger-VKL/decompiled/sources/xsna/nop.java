package xsna;

import android.content.DialogInterface;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class nop implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nop(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((dof) this.c).invoke();
                break;
            default:
                bex0.a.a((x6y) this.c, JsApiMethodType.DOWNLOAD_FILE, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                break;
        }
    }
}
