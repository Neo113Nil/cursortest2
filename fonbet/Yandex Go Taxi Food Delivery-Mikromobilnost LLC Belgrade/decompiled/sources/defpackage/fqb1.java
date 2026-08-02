package defpackage;

import android.view.View;
import com.yandex.go.tariffcard.ui.MultiTariffOption$Subtitle$SubtitleType;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public abstract class fqb1 {
    public static final View a(wee weeVar) {
        View swipeRefreshContent = weeVar.getSwipeRefreshContent();
        while (swipeRefreshContent instanceof wee) {
            wee weeVar2 = (wee) swipeRefreshContent;
            if (jl40.l(weeVar2.getSwipeRefreshContent(), swipeRefreshContent)) {
                break;
            }
            swipeRefreshContent = weeVar2.getSwipeRefreshContent();
        }
        return swipeRefreshContent;
    }

    public static final void b(ListItemComponent listItemComponent, hq40 hq40Var, in40 in40Var) {
        boolean z = false;
        if (hq40Var != null && hq40Var.a) {
            z = true;
        }
        listItemComponent.setEnabled(!z);
        listItemComponent.setContentAlpha(z ? 0.5f : 1.0f);
        if (z) {
            listItemComponent.setSubtitle(hq40Var.b);
            listItemComponent.setSubtitleTextColor(new gdc(mqg0.component_orange_normal));
            return;
        }
        bdc bdcVar = null;
        listItemComponent.setSubtitle(in40Var != null ? in40Var.a : null);
        MultiTariffOption$Subtitle$SubtitleType multiTariffOption$Subtitle$SubtitleType = in40Var != null ? in40Var.b : null;
        int i = multiTariffOption$Subtitle$SubtitleType == null ? -1 : wo40.a[multiTariffOption$Subtitle$SubtitleType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                bdcVar = new bdc(xng0.textMinor);
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                bdcVar = new bdc(xng0.textMain);
            }
        }
        listItemComponent.setSubtitleTextColor(bdcVar);
    }
}
