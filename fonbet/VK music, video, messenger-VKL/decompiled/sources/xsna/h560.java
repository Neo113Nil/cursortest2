package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h560 implements Runnable {
    public final /* synthetic */ i560 b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ gzs f;

    public /* synthetic */ h560(i560 i560Var, izs izsVar, Context context, boolean z, gzs gzsVar) {
        this.b = i560Var;
        this.c = izsVar;
        this.d = context;
        this.e = z;
        this.f = gzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i560 i560Var = this.b;
        if (i560Var.c != null) {
            return;
        }
        Context context = this.d;
        ikv0.a aVar = new ikv0.a(context);
        float f = 28;
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_20, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(iah0.a(f), iah0.a(f)), 8);
        boolean z = this.e;
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(z ? R.string.lost_network_title_snackbar_with_downloads : R.string.lost_network_title_snackbar_no_downloads)), z ? new ikv0.d.b(context.getString(R.string.lost_network_subtitle_snackbar_with_downloads)) : null, (ikv0.d.a) null, 4);
        if (z) {
            aVar.s = new ikv0.e.b(new gko(R.drawable.vk_icon_chevron_right_small_outline_24), new x7g(R.attr.vk_ui_icon_accent_themed), (Size) null, new w910(context, 8), 12);
            aVar.g = new cty(context, 14);
        }
        aVar.l = 80;
        if (fnj.d(context)) {
            aVar.k = 1;
            aVar.g(81);
        }
        aVar.e = 5000L;
        aVar.h = new fo6(16, this.f, i560Var);
        i560Var.c = (ikv0) this.c.invoke(aVar);
    }
}
