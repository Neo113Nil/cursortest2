package xsna;

import android.content.Context;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.ReplyView;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.web.view.marker.di.WebViewMarkerComponentImpl;
import com.vkontakte.android.R;
import xsna.bbv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pkd0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pkd0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new gwh0(null);
            case 1:
                return new tpd0(new jqd0(new yd10(), new x8c()));
            case 2:
                Context context = e43.a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_reactions_margin_before_counter, context != null ? context : null));
            case 3:
                int i = ReplyView.k;
                return new DisplayNameFormatter(null, 3, null);
            case 4:
                bbv0.g.getClass();
                bbv0.a.f().d.c();
                return s3q0.a;
            case 5:
                return new esl0();
            case 6:
                int i2 = SuperAppFragment.o0;
                return s3q0.a;
            case 7:
                return 3;
            case 8:
                nmo0 nmo0Var = lvp0.d;
                nmo0 nmo0Var2 = lvp0.e;
                nmo0 nmo0Var3 = lvp0.f;
                nmo0 nmo0Var4 = lvp0.g;
                nmo0 nmo0Var5 = lvp0.h;
                nmo0 nmo0Var6 = lvp0.i;
                nmo0 nmo0Var7 = lvp0.m;
                nmo0 nmo0Var8 = lvp0.n;
                nmo0 nmo0Var9 = lvp0.o;
                nmo0 nmo0Var10 = lvp0.a;
                nmo0 nmo0Var11 = lvp0.b;
                nmo0 nmo0Var12 = lvp0.c;
                nmo0 nmo0Var13 = lvp0.j;
                nmo0 nmo0Var14 = lvp0.k;
                nmo0 nmo0Var15 = lvp0.l;
                return new xup0(nmo0Var, nmo0Var2, nmo0Var3, nmo0Var4, nmo0Var5, nmo0Var6, nmo0Var7, nmo0Var8, nmo0Var9, nmo0Var10, nmo0Var11, nmo0Var12, nmo0Var13, nmo0Var14, nmo0Var15, nmo0Var, nmo0Var2, nmo0Var3, nmo0Var4, nmo0Var5, nmo0Var6, nmo0Var7, nmo0Var8, nmo0Var9, nmo0Var10, nmo0Var11, nmo0Var12, nmo0Var13, nmo0Var14, nmo0Var15);
            case 9:
                return new pxo0(400L);
            case 10:
                Context context2 = e43.a;
                return Integer.valueOf((context2 != null ? context2 : null).getColor(R.color.vk_orange_fire));
            case 11:
                return new jl80();
            case 12:
                return new vvx(qsk0.a);
            case 13:
                return tlo0.Companion.serializer();
            case 14:
                return new f3x0();
            default:
                qcy<Object>[] qcyVarArr = WebViewMarkerComponentImpl.c;
                return new bjx0();
        }
    }
}
