package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import java.util.List;
import xsna.dh6;

/* compiled from: ClipsBottomSheetView.kt */
/* loaded from: classes16.dex */
public final class okd implements bkd {
    public final Activity a;
    public final List<yu20> b;
    public final fkd c;
    public final int d;
    public final dh6.a e;
    public dw20 f;

    /* JADX WARN: Multi-variable type inference failed */
    public okd(Activity activity, List<? extends yu20> list, fkd fkdVar, int i, dh6.a aVar) {
        this.a = activity;
        this.b = list;
        this.c = fkdVar;
        this.d = i;
        this.e = aVar;
    }

    public final void a() {
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = this.b;
        c0785a.c = new ha(this, 15);
        int i = this.d;
        c0785a.g = i;
        dh6.a aVar = this.e;
        if (aVar != null) {
            c0785a.e = aVar;
        }
        this.f = c0785a.a(new l7s(this.a, i), "CLIPS_BOTTOM_SHEET");
    }

    @Override // xsna.bkd
    public final void dismiss() {
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
