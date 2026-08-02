package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import com.vkontakte.android.data.DonutAnalytics;
import kotlin.LazyThreadSafetyMode;
import xsna.rzn;
import xsna.tlo0;

/* compiled from: DonutActionButtonRedesignedHolder.kt */
/* loaded from: classes4.dex */
public final class hwn extends rp6<jwn, NewsEntry> implements View.OnClickListener {
    public final rzn E;
    public final Object F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hwn(ViewGroup viewGroup) {
        super(r1, viewGroup);
        rzn rznVar = new rzn(viewGroup.getContext());
        rznVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        getContext();
        rzn rznVar2 = (rzn) this.itemView;
        rznVar2.setOnClickListener(this);
        this.E = rznVar2;
        this.F = msy.a(LazyThreadSafetyMode.NONE, new bv0(15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rp6
    public final void R6(jwn jwnVar) {
        String str;
        jwn jwnVar2 = jwnVar;
        DonutPriceTemplate donutPriceTemplate = jwnVar2.j;
        if (donutPriceTemplate != null) {
            Context context = this.itemView.getContext();
            kqj0 kqj0Var = new kqj0();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            y1o.a(spannableStringBuilder, donutPriceTemplate, context, kqj0Var);
            str = spannableStringBuilder;
        } else {
            str = jwnVar2.i;
        }
        tlo0.h hVar = jwnVar2.h;
        rzn rznVar = this.E;
        rznVar.setText(hVar);
        rznVar.setRightContent(new rzn.a.C3643a(str));
        rznVar.setContentDescription(jwnVar2.k);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionButtonAttachment actionButtonAttachment;
        Action action;
        NewsEntry newsEntry;
        jwn jwnVar = (jwn) this.C;
        if (jwnVar == null || (actionButtonAttachment = jwnVar.l) == null) {
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
        lu luVar = (lu) this.F.getValue();
        int i = J0.k;
        luVar.getClass();
        lu.a(newsEntry, actionButtonAttachment, i);
    }
}
