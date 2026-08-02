package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.bridges.SuperappUiRouterBridge;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class sdr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ yfu0 b;
    public final /* synthetic */ tdr0 c;
    public final /* synthetic */ Activity d;

    public sdr0(yfu0 yfu0Var, tdr0 tdr0Var, Activity activity) {
        this.b = yfu0Var;
        this.c = tdr0Var;
        this.d = activity;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SuperappUiRouterBridge.c p0;
        view.removeOnLayoutChangeListener(this);
        Rect rect = new Rect();
        this.b.b.getGlobalVisibleRect(rect);
        rect.offset(0, iah0.a(4));
        tdr0 tdr0Var = this.c;
        WebApiApplication v = tdr0Var.b.v();
        Boolean bool = v != null ? v.R : null;
        Activity activity = this.d;
        if (bool == null) {
            p0 = null;
        } else {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            p0 = superappUiRouterBridge.p0(activity, rect, new tsk0(tdr0Var, 16));
        }
        if (p0 == null) {
            SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
            (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).S(activity, rect, new wzb0(tdr0Var, 26));
        }
        tdr0Var.d.y = true;
    }
}
