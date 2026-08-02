package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: ChangePublishPostponeDateMenu.kt */
/* loaded from: classes4.dex */
public final class tsa {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;
    public dw20 c;

    public tsa(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public final void a(Context context) {
        dw20.b bVar = new dw20.b(context, null);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.postpone_publish_menu_item, LayoutInflater.from(context));
        aVar.d = new ssa();
        aVar.f = e43.l(new e520(R.id.postpone_date_menu_change, 0, R.string.postpone_date_menu_change, 0, false, 0, 0, true, null, 0, null, false, 7922), new e520(R.id.postpone_date_menu_delete, 0, R.string.postpone_date_menu_delete, 1, false, 0, 0, true, null, 0, null, false, 7922));
        aVar.c(new rsa(this, 0));
        dw20.b bVar2 = (dw20.b) dw20.a.k(bVar, aVar.b(), 6);
        int a = context.getResources().getDisplayMetrics().widthPixels - iah0.a(4);
        bVar2.g();
        bVar2.d.A0 = a;
        this.c = bVar2.I0(tsa.class.getSimpleName());
    }
}
