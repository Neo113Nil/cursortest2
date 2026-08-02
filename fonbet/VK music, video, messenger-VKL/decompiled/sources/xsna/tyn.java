package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import com.vkontakte.android.data.DonutAnalytics;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: DonutChipActionButtonRedesignedHolder.kt */
/* loaded from: classes4.dex */
public final class tyn extends rp6<uyn, NewsEntry> implements View.OnClickListener {
    public final Object E;
    public final VkText F;
    public final VkText G;
    public final Object H;

    public tyn(ViewGroup viewGroup) {
        super(R.layout.attach_donut_chip, viewGroup);
        r rVar = new r(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, rVar);
        this.F = (VkText) this.itemView.findViewById(R.id.title);
        this.G = (VkText) this.itemView.findViewById(R.id.price);
        this.itemView.setOnClickListener(this);
        getContext();
        this.H = msy.a(lazyThreadSafetyMode, new gu0(13));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(uyn uynVar) {
        uyn uynVar2 = uynVar;
        tlo0.h hVar = uynVar2.h;
        Context context = this.itemView.getContext();
        hVar.getClass();
        this.F.setText(tlo0.b.a(hVar, context));
        boolean booleanValue = ((Boolean) this.E.getValue()).booleanValue();
        VkText vkText = this.G;
        if (booleanValue) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) rik0.a);
            DonutPriceTemplate donutPriceTemplate = uynVar2.k;
            if (donutPriceTemplate != null) {
                y1o.a(spannableStringBuilder, donutPriceTemplate, this.itemView.getContext(), null);
            }
            vkText.setText(spannableStringBuilder);
        } else {
            vkText.setText(((CharSequence) rik0.a) + uynVar2.i);
        }
        this.itemView.setContentDescription(uynVar2.j);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionButtonAttachment actionButtonAttachment;
        Action action;
        NewsEntry newsEntry;
        uyn uynVar = (uyn) this.C;
        if (uynVar == null || (actionButtonAttachment = uynVar.l) == null) {
            return;
        }
        Action action2 = actionButtonAttachment.h;
        if (action2 instanceof ActionOpenUrl) {
            ActionOpenUrl actionOpenUrl = (ActionOpenUrl) action2;
            UiTracker uiTracker = UiTracker.a;
            action = new ActionOpenUrl(DonutAnalytics.b(actionOpenUrl.c, UiTracker.d()), actionOpenUrl.d);
        } else {
            action = action2;
        }
        di60.w(action, this.itemView.getContext(), null, null, null, null, 62);
        u1c0 J0 = J0();
        if (J0 == null || (newsEntry = J0.a) == null) {
            return;
        }
        lu luVar = (lu) this.H.getValue();
        int i = J0.k;
        luVar.getClass();
        lu.a(newsEntry, actionButtonAttachment, i);
    }
}
