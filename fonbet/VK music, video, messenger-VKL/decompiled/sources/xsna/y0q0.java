package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import xsna.xyp0;

/* compiled from: UiTrackingBottomSheetDialog.kt */
/* loaded from: classes17.dex */
public class y0q0 extends xyp0 {
    public final SchemeStat$TypeDialogItem.DialogItem g;
    public final SchemeStat$EventItem h;
    public final a i;

    /* compiled from: UiTrackingBottomSheetDialog.kt */
    public static final class a {
        public Integer a;
        public SchemeStat$TypeMiniAppItem b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.b;
            return hashCode + (schemeStat$TypeMiniAppItem != null ? schemeStat$TypeMiniAppItem.hashCode() : 0);
        }

        public final String toString() {
            return "MiniAppItem(appId=" + this.a + ", typeMiniAppItem=" + this.b + ')';
        }

        public a(int i) {
            this.a = null;
            this.b = null;
        }
    }

    public y0q0(SchemeStat$TypeDialogItem.DialogItem dialogItem, SchemeStat$EventItem schemeStat$EventItem) {
        super(false);
        this.g = dialogItem;
        this.h = schemeStat$EventItem;
        this.i = new a(0);
    }

    @Override // xsna.xyp0, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        super.y(uiTrackingScreen);
        a aVar = this.i;
        SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = aVar.b;
        SchemeStat$EventItem schemeStat$EventItem = null;
        SchemeStat$TypeMiniAppItem a2 = schemeStat$TypeMiniAppItem != null ? SchemeStat$TypeMiniAppItem.a(schemeStat$TypeMiniAppItem) : null;
        aVar.b = null;
        uiTrackingScreen.a(xyp0.a.a(null, this.g, this.e, null, a2, false, 32));
        SchemeStat$EventItem schemeStat$EventItem2 = this.h;
        if (schemeStat$EventItem2 != null) {
            schemeStat$EventItem = SchemeStat$EventItem.a(schemeStat$EventItem2, aVar.a != null ? Long.valueOf(r0.intValue()) : null);
        }
        uiTrackingScreen.f = schemeStat$EventItem;
    }
}
