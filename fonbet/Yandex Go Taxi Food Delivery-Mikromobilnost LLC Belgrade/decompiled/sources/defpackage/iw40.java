package defpackage;

import android.app.Activity;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes14.dex */
public abstract class iw40 implements lit {
    public final Activity a;
    public final a980 b;

    public iw40(Activity activity, a980 a980Var) {
        this.a = activity;
        this.b = a980Var;
    }

    public void B0(o2y0 o2y0Var) {
    }

    @Override // defpackage.sdj
    public final qdj I(tdj tdjVar, BaseDialog baseDialog) {
        Object obj = tdjVar.a;
        String str = tdjVar.b;
        a980 a980Var = this.b;
        if (obj != null) {
            str = a980Var.a((o2y0) obj, str);
        }
        String str2 = tdjVar.d;
        if (obj != null) {
            str2 = a980Var.a((o2y0) obj, str2);
        }
        baseDialog.setTitle(str, str2);
        baseDialog.show();
        B0((o2y0) obj);
        return new tej(1, baseDialog);
    }

    @Override // defpackage.lit
    public final Activity getActivity() {
        return this.a;
    }
}
