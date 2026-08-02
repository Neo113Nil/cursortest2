package xsna;

import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vkontakte.android.R;

/* compiled from: SuperAppWidgetSubscribeTileItem.kt */
/* loaded from: classes6.dex */
public final class ien0 extends e9n0 {
    public final SuperAppWidgetSubscribeTile h;

    public ien0(SuperAppWidgetSubscribeTile superAppWidgetSubscribeTile) {
        super(superAppWidgetSubscribeTile.k, superAppWidgetSubscribeTile.d, superAppWidgetSubscribeTile.n.b);
        this.h = superAppWidgetSubscribeTile;
    }

    public static boolean j(WebSubscribeExtra webSubscribeExtra) {
        boolean z = webSubscribeExtra.d;
        WebSubscribeExtra.MemberStatus memberStatus = webSubscribeExtra.e;
        WebSubscribeExtra.MemberStatus memberStatus2 = WebSubscribeExtra.MemberStatus.HAS_SENT_A_REQUEST;
        if (memberStatus == memberStatus2) {
            webSubscribeExtra.d = false;
            webSubscribeExtra.e = WebSubscribeExtra.MemberStatus.NOT_A_MEMBER;
            return true;
        }
        WebSubscribeExtra.GroupClosedType groupClosedType = webSubscribeExtra.f;
        if (groupClosedType != WebSubscribeExtra.GroupClosedType.CLOSED && (groupClosedType != WebSubscribeExtra.GroupClosedType.PRIVATE || z)) {
            webSubscribeExtra.d = !z;
            webSubscribeExtra.e = !z ? WebSubscribeExtra.MemberStatus.MEMBER : WebSubscribeExtra.MemberStatus.NOT_A_MEMBER;
            return z;
        }
        webSubscribeExtra.d = false;
        webSubscribeExtra.e = memberStatus2;
        return false;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_subscribe_tile_widget;
    }

    @Override // xsna.f9n0
    public final SuperAppWidget c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ien0) && epx.f(this.h, ((ien0) obj).h);
    }

    public final WebActionSubscribe h() {
        WebAction webAction = this.h.o.d;
        if (webAction instanceof WebActionSubscribe) {
            return (WebActionSubscribe) webAction;
        }
        return null;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final boolean i() {
        WebSubscribeExtra webSubscribeExtra;
        WebSubscribeExtra webSubscribeExtra2;
        WebActionSubscribe h = h();
        if (h == null || (webSubscribeExtra2 = h.e) == null || !webSubscribeExtra2.d) {
            WebActionSubscribe h2 = h();
            if (((h2 == null || (webSubscribeExtra = h2.e) == null) ? null : webSubscribeExtra.e) != WebSubscribeExtra.MemberStatus.HAS_SENT_A_REQUEST) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "SuperAppWidgetSubscribeTileItem(data=" + this.h + ')';
    }
}
