package xsna;

import android.content.DialogInterface;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class mop implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mop(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((dof) this.c).invoke();
                break;
            case 1:
                bex0.a.a((x6y) this.c, JsApiMethodType.DOWNLOAD_FILE, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                break;
            default:
                hpb0 hpb0Var = (hpb0) this.c;
                hpb0Var.d();
                iia0 iia0Var = hpb0Var.L;
                if (iia0Var != null) {
                    iia0Var.invoke();
                    break;
                }
                break;
        }
    }
}
