package xsna;

import android.view.ViewGroup;
import com.vk.community.design.compose.widget.factory.CommunityWidgetType;
import com.vk.dto.community.entries.widget.Widget;
import com.vkontakte.android.R;

/* compiled from: WidgetItem.kt */
/* loaded from: classes5.dex */
public final class fnx0 extends we6 {
    public final h5i g;
    public final n9b h;

    /* compiled from: WidgetItem.kt */
    public static final class a extends vif0<fnx0> {
        public final /* synthetic */ i5i n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i5i i5iVar, fnx0 fnx0Var) {
            super(i5iVar);
            this.n = i5iVar;
            i5iVar.setOnOpenUrl(fnx0Var.h);
        }

        @Override // xsna.vif0
        public final void i6(fnx0 fnx0Var) {
            h5i h5iVar;
            Widget widget;
            pox0 b;
            fnx0 fnx0Var2 = fnx0Var;
            if (fnx0Var2 == null || (h5iVar = fnx0Var2.g) == null || (widget = h5iVar.b) == null || (b = qox0.b(widget, this.itemView.getContext())) == null) {
                return;
            }
            this.n.h(b);
        }
    }

    public fnx0(h5i h5iVar, n9b n9bVar) {
        this.g = h5iVar;
        this.h = n9bVar;
    }

    @Override // xsna.we6
    public final vif0<fnx0> a(ViewGroup viewGroup) {
        CommunityWidgetType communityWidgetType;
        switch (this.g.b.b) {
            case 2:
                communityWidgetType = CommunityWidgetType.LIST;
                break;
            case 3:
                communityWidgetType = CommunityWidgetType.TABLE;
                break;
            case 4:
                communityWidgetType = CommunityWidgetType.TILES;
                break;
            case 5:
                communityWidgetType = CommunityWidgetType.COMPACT_LIST;
                break;
            case 6:
                communityWidgetType = CommunityWidgetType.COVER_LIST;
                break;
            case 7:
                communityWidgetType = CommunityWidgetType.MATCH;
                break;
            case 8:
                communityWidgetType = CommunityWidgetType.MATCHES;
                break;
            case 9:
                communityWidgetType = CommunityWidgetType.DONATION;
                break;
            default:
                communityWidgetType = CommunityWidgetType.TEXT;
                break;
        }
        i5i a2 = hwh.a(viewGroup.getContext(), communityWidgetType);
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a2.setId(R.id.vk_community_widget);
        return new a(a2, this);
    }

    @Override // xsna.we6
    public final int h() {
        return this.g.b.b + 65261;
    }
}
