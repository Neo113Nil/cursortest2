package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.ybsdk.common.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes3.dex */
public final class juq0 implements guq0 {
    public final ContextThemeWrapper a;
    public final AppAnalyticsReporter b;
    public final kuq0 c;
    public final a d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public juq0(ContextThemeWrapper contextThemeWrapper, AppAnalyticsReporter appAnalyticsReporter, kuq0 kuq0Var, a aVar) {
        this.a = contextThemeWrapper;
        this.b = appAnalyticsReporter;
        this.c = kuq0Var;
        this.d = aVar;
    }

    public final void a(fuq0 fuq0Var) {
        Handler handler = this.e;
        handler.removeCallbacksAndMessages(null);
        long intValue = fuq0Var.b.e != null ? r0.intValue() : 0L;
        if (intValue > 0) {
            handler.postDelayed(new epo0(14, this, fuq0Var), intValue);
        } else {
            b(fuq0Var);
        }
    }

    public final void b(fuq0 fuq0Var) {
        Lifecycle.State b;
        sls slsVar;
        rbv rbvVar;
        String str;
        Tooltip$PreferredPosition tooltip$PreferredPosition;
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition;
        rbv rbvVar2;
        CharSequence a;
        ConstraintLayout constraintLayout = fuq0Var.a;
        auq0 auq0Var = fuq0Var.b;
        pey o = vng.o(constraintLayout);
        Lifecycle lifecycle = o != null ? o.getLifecycle() : null;
        if (lifecycle == null || (b = lifecycle.b()) == null) {
            return;
        }
        int i = 1;
        if (b.a(Lifecycle.State.STARTED) && constraintLayout.isAttachedToWindow()) {
            euq0 euq0Var = auq0Var.d;
            String str2 = euq0Var.a.a;
            View c = li91.c(constraintLayout, str2);
            String str3 = auq0Var.a;
            int i2 = 2;
            if (c == null) {
                x4c.g("Server tooltip anchor contains wrong viewId", null, b.i(new Pair("tooltip_id", str3), new Pair("view_id", str2)), Collections.singletonList(lrp0.E), 2);
                return;
            }
            huq0 huq0Var = new huq0(str3, str2);
            long intValue = euq0Var.e != null ? r4.intValue() : 0L;
            int i3 = ung0.ybColor_button_primaryNormal;
            ContextThemeWrapper contextThemeWrapper = this.a;
            int a2 = rje.a(contextThemeWrapper, i3);
            int a3 = rje.a(contextThemeWrapper, ung0.ybColor_textIcon_primaryInverted);
            sls bgcVar = new bgc(12);
            TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
            TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition2 = TooltipCommon$PreferredPosition.TOP;
            euq0 euq0Var2 = auq0Var.d;
            ztq0 ztq0Var = euq0Var2.c;
            Text text = ztq0Var.a;
            String obj = text != null ? d.a(contextThemeWrapper, text).toString() : null;
            Text text2 = ztq0Var.b;
            String obj2 = text2 != null ? d.a(contextThemeWrapper, text2).toString() : "";
            Integer num = euq0Var2.d;
            int intValue2 = num != null ? num.intValue() : 0;
            xtq0 xtq0Var = ztq0Var.c;
            if (xtq0Var != null) {
                duq0 duq0Var = xtq0Var.b;
                slsVar = new xlp0(i, this, xtq0Var, huq0Var);
                str = (duq0Var == null || (a = d.a(contextThemeWrapper, duq0Var.a)) == null) ? null : a.toString();
                rbvVar = (duq0Var == null || (rbvVar2 = duq0Var.b) == null) ? null : rbvVar2;
            } else {
                slsVar = bgcVar;
                rbvVar = null;
                str = null;
            }
            int i4 = iuq0.a[euq0Var2.b.ordinal()];
            if (i4 == 1) {
                tooltip$PreferredPosition = Tooltip$PreferredPosition.TOP;
            } else {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                tooltip$PreferredPosition = Tooltip$PreferredPosition.BOTTOM;
            }
            int i5 = auz0.a[tooltip$PreferredPosition.ordinal()];
            if (i5 == 1) {
                tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.TOP;
            } else if (i5 == 2) {
                tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.BOTTOM;
            } else {
                if (i5 != 3) {
                    w511.b();
                    return;
                }
                tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.AUTO;
            }
            cuz0 cuz0Var = new cuz0(a2, a3, 0, intValue2, 10, slsVar, new xlp0(i2, this, fuq0Var, huq0Var), new uwl0(28, new a5p0(15, this, huq0Var)), rbvVar, contextThemeWrapper, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, null, null, null, obj, obj2, str, true, true);
            cuz0Var.f(c, intValue);
            cuz0Var.a();
        }
    }
}
