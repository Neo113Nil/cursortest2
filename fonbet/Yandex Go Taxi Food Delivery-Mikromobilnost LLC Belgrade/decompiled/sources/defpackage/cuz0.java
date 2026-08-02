package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import com.ybsdk.widgets.tooltip.a;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;

/* loaded from: classes4.dex */
public final class cuz0 {
    public final a a;
    public Object b;

    public cuz0(int i, int i2, int i3, int i4, int i5, sls slsVar, sls slsVar2, tls tlsVar, rbv rbvVar, Context context, TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity, TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition, Integer num, Integer num2, Integer num3, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = new a(i, i2, i3, i4, i5, slsVar, slsVar2, tlsVar, rbvVar, context, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, num, num2, num3, str, str2.length() == 0 ? null : str2, str3, z, z2);
    }

    public final void a() {
        View contentView;
        a aVar = this.a;
        TooltipPopupWindow tooltipPopupWindow = aVar.u;
        if (tooltipPopupWindow == null || (contentView = tooltipPopupWindow.getContentView()) == null) {
            return;
        }
        String str = aVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = aVar.c;
        String obj = evu0.k0(str + " " + (str2 != null ? str2 : "")).toString();
        if (obj.length() > 0) {
            b.r(contentView, obj);
        }
    }

    public final Object b() {
        return this.b;
    }

    public final void c() {
        this.a.a();
    }

    public final void d() {
        a aVar = this.a;
        pzt0 pzt0Var = aVar.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.A = null;
        TooltipPopupWindow tooltipPopupWindow = aVar.u;
        if (tooltipPopupWindow != null) {
            tooltipPopupWindow.dismiss();
        }
    }

    public final void e(dy3 dy3Var) {
        this.b = dy3Var;
    }

    public final void f(View view, long j) {
        this.a.c(view, j);
    }
}
