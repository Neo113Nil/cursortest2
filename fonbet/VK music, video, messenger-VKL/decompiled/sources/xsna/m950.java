package xsna;

import android.content.DialogInterface;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m950 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m950(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                n950 n950Var = (n950) obj;
                VKActivity vKActivity = n950Var.a;
                if (!n950Var.b.m) {
                    CharSequence text = vKActivity.getText(R.string.music_verify_phone_text);
                    r55 r55Var = r55.a;
                    com.vk.auth.validation.b.b(r55.d, vKActivity, text, 88);
                    break;
                }
                break;
            case 1:
                n1j0 n1j0Var = (n1j0) obj;
                n1j0Var.D = null;
                if (n1j0Var.w) {
                    n1j0Var.dismiss();
                    break;
                }
                break;
            default:
                yads.fi0.a((yads.fi0) obj, dialogInterface);
                break;
        }
    }
}
