package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import com.google.common.collect.ImmutableList;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import ru.yandex.taxi.requirements.ui.ExpandingView;

/* loaded from: classes3.dex */
public final /* synthetic */ class opo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ opo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        int i = this.a;
        Object obj = this.x;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ExpandingView.bind$lambda$0$0((yot0) obj4, (sls) obj3, (ExpandingView) obj2, (zot0) obj, view);
                break;
            case 1:
                lyc0 lyc0Var = (lyc0) obj4;
                zxc0 zxc0Var = (zxc0) obj3;
                xzz0 xzz0Var = (xzz0) obj2;
                kyc0 kyc0Var = (kyc0) obj;
                if (zxc0Var.isCommandAvailable(29)) {
                    zxc0Var.setTrackSelectionParameters(zxc0Var.getTrackSelectionParameters().a().f(new n001(xzz0Var, ImmutableList.r(Integer.valueOf(kyc0Var.b)))).j(kyc0Var.a.b.c).a());
                    lyc0Var.i(kyc0Var.c);
                    popupWindow = lyc0Var.b.settingsWindow;
                    popupWindow.dismiss();
                    break;
                }
                break;
            default:
                n70 n70Var = (n70) obj3;
                r8m0 r8m0Var = (r8m0) obj;
                uuz0.a(((c361) obj4).c, n70Var.P.getString(dzh0.ybsdk_common_copied), Tooltip$PreferredGravity.END, o5m0.a, 12);
                ((wls) obj2).invoke(d.a(n70Var.P, r8m0Var.a).toString(), r8m0Var.c);
                break;
        }
    }
}
