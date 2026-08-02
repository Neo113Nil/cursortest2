package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.hzp0;

/* compiled from: MarketProductMediaContentHolder.kt */
/* loaded from: classes18.dex */
public final class ic10 extends vif0<nq10> {
    public final w6e n;
    public final VkGroupHeader o;
    public final VkSimpleButton p;
    public final jc10 q;

    public ic10(ViewGroup viewGroup, w6e w6eVar, kdg0 kdg0Var, g7s0 g7s0Var) {
        super(viewGroup, R.layout.good_media_content_grid_holder, 0);
        Spannable newSpannable;
        this.n = w6eVar;
        GalvitaLayout galvitaLayout = (GalvitaLayout) this.itemView.findViewById(R.id.grid);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) this.itemView.findViewById(R.id.title_text_view);
        this.o = vkGroupHeader;
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.show_all_button);
        this.p = vkSimpleButton;
        jc10 jc10Var = new jc10(this.itemView.getContext(), w6eVar, kdg0Var, g7s0Var);
        this.q = jc10Var;
        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
        galvitaLayout.setGap(cn70.b(2));
        galvitaLayout.setMaximumWidth(iah0.w(viewGroup.getContext()));
        galvitaLayout.setAdapter(jc10Var);
        galvitaLayout.setDecoration(new oq10(cn70.a() * 2.0f));
        galvitaLayout.setPadding(0, 0, 0, 0);
        jjc.g(vkSimpleButton, new yhu(this, 6));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.itemView.getContext().getString(R.string.show_all));
        spannableStringBuilder.append((CharSequence) rik0.b(12.0f));
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) dhr0.x(R.drawable.ic_chevron_16_black, R.attr.vk_ui_icon_accent, this.itemView.getContext()), cn70.b(1), 0, cn70.b(3), 0);
        int b = cn70.b(16);
        int b2 = cn70.b(16);
        if (myc0.f(" ")) {
            newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            dqa dqaVar = new dqa(insetDrawable);
            insetDrawable.setBounds(0, 0, b, b2);
            newSpannable.setSpan(dqaVar, 0, 1, 0);
        } else {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("accessibilityText shouldn't be empty"));
            newSpannable = Spannable.Factory.getInstance().newSpannable("");
        }
        spannableStringBuilder.append((CharSequence) newSpannable);
        vkSimpleButton.setText(spannableStringBuilder);
    }

    @Override // xsna.vif0
    public final void i6(nq10 nq10Var) {
        nq10 nq10Var2 = nq10Var;
        int i = nq10Var2.c;
        if (i > 0) {
            this.o.setTitle(new VkGroupHeader.d(this.itemView.getContext().getString(i), null, null, null, 0, null, 510));
        }
        awt0.v(this.p, nq10Var2.b);
        this.q.e(nq10Var2.a);
        w6e w6eVar = this.n;
        cxo cxoVar = (cxo) w6eVar.b;
        Good good = cxoVar.r;
        if (good != null) {
            hc10 c = cxoVar.a.c();
            long j = good.b;
            long j2 = good.c.b;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = (CommonMarketStat$TypeRefSource) w6eVar.c;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = cxoVar.g;
            LinkedContentAnalyticsParams linkedContentAnalyticsParams = new LinkedContentAnalyticsParams(j, j2, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null);
            c.getClass();
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(linkedContentAnalyticsParams.b), Long.valueOf(linkedContentAnalyticsParams.c), null, linkedContentAnalyticsParams.e, null, 40, null);
            UiTrackingScreen b = UiTracker.j.b();
            new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, linkedContentAnalyticsParams.d, linkedContentAnalyticsParams.f, new com.vk.stat.scheme.r(), 18), null).a();
        }
    }
}
