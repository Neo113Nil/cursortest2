package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class j2h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentActivity b;

    public /* synthetic */ j2h(FragmentActivity fragmentActivity, int i) {
        this.a = i;
        this.b = fragmentActivity;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        View view;
        View findViewById;
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition;
        int i = this.a;
        x0h x0hVar = x0h.a;
        FragmentActivity fragmentActivity = this.b;
        switch (i) {
            case 0:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.Share)) {
                    return x0hVar;
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((DeeplinkAction.Share) baseDeeplinkAction).getText());
                intent.setType("text/plain");
                rje.k(fragmentActivity, Intent.createChooser(intent, null));
                return new v0h(EmptyList.a, null, 6);
            default:
                if (!(baseDeeplinkAction instanceof DeeplinkAction.ShowTooltip)) {
                    return x0hVar;
                }
                DeeplinkAction.ShowTooltip showTooltip = (DeeplinkAction.ShowTooltip) baseDeeplinkAction;
                String viewId = showTooltip.getViewId();
                if (viewId == null || (view = fragmentActivity.getWindow().getDecorView().findViewWithTag(viewId)) == null) {
                    Integer x = showTooltip.getX();
                    Integer y = showTooltip.getY();
                    if (x == null || y == null || (findViewById = fragmentActivity.findViewById(jah0.ybSdkTooltipFromDeeplinkAnchor)) == null) {
                        view = null;
                    } else {
                        findViewById.setX(x.intValue());
                        findViewById.setY(y.intValue());
                        view = findViewById;
                    }
                }
                if (view == null) {
                    return x0hVar;
                }
                Context context = view.getContext();
                int a = rje.a(context, ung0.ybColor_button_primaryNormal);
                int a2 = rje.a(context, ung0.ybColor_textIcon_primaryInverted);
                bgc bgcVar = new bgc(12);
                bgc bgcVar2 = new bgc(12);
                f0z0 f0z0Var = new f0z0(19);
                TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = TooltipCommon$PreferredGravity.CENTER;
                TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition2 = TooltipCommon$PreferredPosition.TOP;
                String obj = d.a(context, showTooltip.getTitle()).toString();
                String obj2 = d.a(context, showTooltip.getSubtitle()).toString();
                int i2 = auz0.a[showTooltip.getGravity().ordinal()];
                if (i2 == 1) {
                    tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.TOP;
                } else if (i2 == 2) {
                    tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.BOTTOM;
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    tooltipCommon$PreferredPosition = TooltipCommon$PreferredPosition.AUTO;
                }
                cuz0 cuz0Var = new cuz0(a, a2, 0, 0, 12, bgcVar, bgcVar2, f0z0Var, null, context, tooltipCommon$PreferredGravity, tooltipCommon$PreferredPosition, null, null, null, obj, obj2, null, true, true);
                Long duration = showTooltip.getDuration();
                cuz0Var.f(view, duration != null ? duration.longValue() : 0L);
                return x0hVar;
        }
    }
}
