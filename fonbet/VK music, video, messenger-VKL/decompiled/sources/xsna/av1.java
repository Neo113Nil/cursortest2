package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import xsna.nzt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class av1 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ av1(Context context, String str, String str2, long j) {
        this.e = context;
        this.c = j;
        this.d = str;
        this.f = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VkUiView view;
        io.reactivex.rxjava3.disposables.b D6;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.f;
        String str = this.d;
        long j = this.c;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                dv1 dv1Var = (dv1) obj3;
                ev1 ev1Var = (ev1) obj2;
                ngx0 ngx0Var = (ngx0) obj;
                if (ngx0Var.a && j5g.t0(ev1Var.b, ngx0Var.b).isEmpty()) {
                    dv1Var.c.a(str);
                    s13 s13Var = dv1Var.b;
                    if (s13Var != null) {
                        s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GROUP_MESSAGES, MiniAppSettingsBoxAction.ALLOW);
                    }
                } else {
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = vdx0Var.j().f(j).subscribe(new b00(new cv1(dv1Var, ngx0Var, str, i2), 2), new sv(new tn0(1, dv1Var, str), 4));
                    xwv0 xwv0Var = (xwv0) dv1Var.a.invoke();
                    if (xwv0Var != null && (view = xwv0Var.getView()) != null && (D6 = view.D6()) != null) {
                        D6.b(subscribe);
                    }
                }
                break;
            default:
                Context context = (Context) obj3;
                nzt.a.C3428a c3428a = (nzt.a.C3428a) obj;
                int i3 = GiftsCatalogFragment.c0;
                Uri.Builder appendEncodedPath = new Uri.Builder().appendEncodedPath(j + "/gifts/" + str);
                appendEncodedPath.appendQueryParameter("ref", (String) obj2);
                boolean M = dhr0.M();
                appendEncodedPath.appendQueryParameter("lang", ply.a());
                appendEncodedPath.appendQueryParameter("scheme", !M ? "bright_light" : "space_gray");
                appendEncodedPath.appendQueryParameter("appearance", !M ? "light" : "dark");
                GiftsCatalogFragment.b.a(context, c3428a.a + appendEncodedPath.build().toString(), false);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ av1(dv1 dv1Var, ev1 ev1Var, String str, long j) {
        this.e = dv1Var;
        this.f = ev1Var;
        this.d = str;
        this.c = j;
    }
}
