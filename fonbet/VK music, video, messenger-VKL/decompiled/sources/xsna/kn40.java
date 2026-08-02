package xsna;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.cameraui.impl.a;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn40 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kn40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        a.j jVar;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                o950 o950Var = (o950) this.c;
                if (!o950Var.r) {
                    AppCompatActivity appCompatActivity = o950Var.n;
                    CharSequence text = appCompatActivity.getText(R.string.music_verify_phone_text);
                    o950Var.o.getClass();
                    com.vk.auth.validation.b.c(r55.d, appCompatActivity, o950Var.q, text);
                    break;
                }
                break;
            case 2:
                n1j0 n1j0Var = (n1j0) this.c;
                n1j0Var.C = null;
                if (n1j0Var.w) {
                    n1j0Var.dismiss();
                    break;
                }
                break;
            default:
                uhj0 uhj0Var = ((xhj0) this.c).c;
                if (uhj0Var != null && (jVar = uhj0Var.j) != null) {
                    jVar.onDismiss(null);
                    break;
                }
                break;
        }
    }
}
