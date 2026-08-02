package xsna;

import android.content.DialogInterface;
import android.widget.EditText;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import xsna.kuc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lwd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lwd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((kuc.a) this.c).c.invoke();
                break;
            default:
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) this.c;
                EditText editText = vKCaptchaActivity.b;
                if (editText == null) {
                    editText = null;
                }
                editText.getText().toString();
                yhr0.b();
                vKCaptchaActivity.finish();
                break;
        }
    }
}
