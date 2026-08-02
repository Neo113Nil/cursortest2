package xsna;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.im.ui.views.settings.EditTextSettingsView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v1p implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ v1p(KeyEvent.Callback callback, int i) {
        this.b = i;
        this.c = callback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        KeyEvent.Callback callback = this.c;
        switch (i2) {
            case 0:
                EditTextSettingsView editTextSettingsView = (EditTextSettingsView) callback;
                int i3 = EditTextSettingsView.C;
                androidx.appcompat.app.d dVar = editTextSettingsView.B;
                if (dVar != null) {
                    dVar.dismiss();
                }
                editTextSettingsView.B = null;
                break;
            default:
                VKCaptchaActivity vKCaptchaActivity = (VKCaptchaActivity) callback;
                int i4 = VKCaptchaActivity.e;
                yhr0.b();
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
                break;
        }
    }
}
