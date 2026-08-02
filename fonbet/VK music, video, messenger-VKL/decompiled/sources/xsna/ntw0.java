package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.g0x0;
import xsna.h1x0;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ntw0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ntw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                otw0 otw0Var = (otw0) obj2;
                int i2 = otw0.i1;
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                break;
            case 1:
                ((j0x0) obj2).T(g0x0.a.c.b.b);
                break;
            case 2:
                c2x0 c2x0Var = (c2x0) obj2;
                c2x0Var.n1.onNext(h1x0.a.C2969a.a);
                nr4.b().D(c2x0Var.requireContext(), ((Uri) obj).toString());
                break;
            case 3:
                o7x0 o7x0Var = (o7x0) obj2;
                pis0 pis0Var = new pis0((cd80) obj, 20);
                Context context = o7x0Var.a;
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_warning_triangle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_warning), (Size) null, 12);
                int i3 = 9;
                aVar.u = new ikv0.d(context.getString(R.string.vpn_snackbar_title), context.getString(R.string.vpn_snackbar_message), new ikv0.d.a(context.getString(R.string.vpn_snackbar_action), null, new olt0(o7x0Var, i3), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                aVar.e = o7x0Var.b.b;
                aVar.h = new zsl0(i3, pis0Var, o7x0Var);
                o7x0Var.f = pkv0.f(aVar);
                break;
            default:
                Throwable th = (Throwable) obj;
                izs<? super Throwable, s3q0> izsVar = ((ujx0) obj2).d;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
        }
        return s3q0.a;
    }
}
