package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;

/* compiled from: UiTrackingBottomSheet.kt */
/* loaded from: classes17.dex */
public class x0q0 extends xyp0 {
    public final SchemeStat$EventItem g;

    public x0q0(SchemeStat$EventItem schemeStat$EventItem, boolean z) {
        super(z);
        this.g = schemeStat$EventItem;
    }

    @Override // xsna.xyp0, xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        super.y(uiTrackingScreen);
        SchemeStat$EventItem schemeStat$EventItem = this.g;
        if (schemeStat$EventItem != null) {
            uiTrackingScreen.f = schemeStat$EventItem;
        }
    }
}
