package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: CompactInlineWriteBarHolder.kt */
/* loaded from: classes4.dex */
public final class z5i extends rp6<a6i, NewsEntry> implements View.OnClickListener, al2 {
    public static final /* synthetic */ int F = 0;
    public final Object E;

    public z5i(ViewGroup viewGroup, nuu0 nuu0Var, h170 h170Var) {
        super(nuu0Var, viewGroup);
        getContext();
        nuu0 nuu0Var2 = (nuu0) this.itemView;
        this.E = msy.a(LazyThreadSafetyMode.NONE, new sv0(11));
        tlo0.Companion.getClass();
        nuu0Var2.setText(new tlo0.f(R.string.newsfeed_inline_comment_compact_hint));
        this.itemView.setOnClickListener(this);
        if (h170Var.e()) {
            int a = iah0.a(6);
            int a2 = iah0.a(0);
            View view = nuu0Var2.b;
            f4m.y(a, view);
            f4m.v(a2, view);
            int b = (int) iah0.b(6.5f);
            int b2 = (int) iah0.b(7.5f);
            VkText vkText = nuu0Var2.c;
            f4m.y(b, vkText);
            f4m.v(b2, vkText);
        }
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(a6i a6iVar) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!jjc.b() && epx.f(view, this.itemView)) {
            String str = this.u;
            String str2 = (str == null || !brm0.B(str, "feed", false)) ? "discover_full".equals(this.u) ? "discover_inline" : "wall_inline" : "feed_inline";
            a6i a6iVar = (a6i) this.C;
            if (a6iVar != null) {
                this.D.sa(new NewsfeedExternalAction.c.p(new o3y0(a6iVar.h, a6iVar.i, str2, a6iVar.j, a6iVar.k, getLayoutPosition())));
            }
            u1c0 J0 = J0();
            if (J0 == null) {
                return;
            }
            NewsEntry newsEntry = J0.a;
            int i = J0.k;
            ((yzw) this.E.getValue()).getClass();
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(di60.n(newsEntry)), Long.valueOf(k9q0.o(newsEntry).b), null, newsEntry.Cb().b, null, 40, null), Integer.valueOf(i), new com.vk.stat.scheme.z())).q();
        }
    }
}
