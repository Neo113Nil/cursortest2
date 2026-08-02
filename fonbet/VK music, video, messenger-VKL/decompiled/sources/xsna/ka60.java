package xsna;

import android.content.DialogInterface;
import xsna.msf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka60 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((gzs) this.c).invoke();
                break;
            case 1:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            default:
                rsf0 rsf0Var = (rsf0) this.c;
                String str = null;
                try {
                    String string = gnj.a(rsf0Var.c.getContext()).getString("com.vk.sdk.RELATED_PROFILE_PREFIX", null);
                    if (string != null) {
                        if (!drm0.N(string)) {
                            str = string;
                        }
                    }
                } catch (Throwable unused) {
                }
                if (str == null) {
                    str = "vkid_";
                }
                rsf0Var.d.invoke(new msf0.n(str.concat("recover_pincode")));
                break;
        }
    }
}
