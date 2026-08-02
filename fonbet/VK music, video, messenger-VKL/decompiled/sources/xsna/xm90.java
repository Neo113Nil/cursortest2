package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.hn90;

/* compiled from: PastAsrListBottomSheet.kt */
/* loaded from: classes7.dex */
public final class xm90 implements av20.b<e520> {
    public final /* synthetic */ ym90 a;

    public xm90(ym90 ym90Var, Context context) {
        this.a = ym90Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        ym90 ym90Var = this.a;
        ev3 ev3Var = ym90Var.d;
        in90<hn90> in90Var = ym90Var.e;
        int i2 = ((e520) obj).a;
        if (i2 == R.id.action_download) {
            in90Var.a(new hn90.b(ev3Var));
        } else if (i2 == R.id.action_remove) {
            in90Var.a(new hn90.f(ev3Var));
        }
        ym90Var.b(view);
    }
}
