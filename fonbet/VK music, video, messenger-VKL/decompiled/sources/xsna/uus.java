package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.action_button.ActionButtonProgress;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;
import xsna.y6u0;

/* compiled from: FullDonutGoalActionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class uus extends m56<ActionButtonAttachment> implements View.OnClickListener {
    public final y6u0 D;
    public final Object E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uus(ViewGroup viewGroup) {
        super(r0);
        y6u0 y6u0Var = new y6u0(viewGroup.getContext());
        y6u0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        y6u0 y6u0Var2 = (y6u0) this.itemView;
        y6u0Var2.setOnClickListener(this);
        this.D = y6u0Var2;
        this.E = msy.a(LazyThreadSafetyMode.NONE, new nh(12));
    }

    @Override // xsna.m56
    public final void T6(ActionButtonAttachment actionButtonAttachment) {
        ActionButtonAttachment actionButtonAttachment2 = actionButtonAttachment;
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        wus wusVar = obj instanceof wus ? (wus) obj : null;
        y6u0 y6u0Var = this.D;
        if (wusVar != null) {
            y6u0Var.setText(wusVar.h);
            y6u0Var.setLeft(wusVar.i);
            return;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = actionButtonAttachment2.g;
        aVar.getClass();
        y6u0Var.setText(new tlo0.h(str));
        ActionButtonProgress actionButtonProgress = actionButtonAttachment2.i;
        int i = actionButtonProgress != null ? actionButtonProgress.b : 0;
        y6u0Var.setLeft(i < 100 ? new y6u0.a.b(i / 100.0f) : y6u0.a.C4083a.a);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        NewsEntry q6;
        int i;
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        wus wusVar = obj instanceof wus ? (wus) obj : null;
        ?? r11 = this.E;
        if (wusVar != null) {
            ActionButtonAttachment actionButtonAttachment = wusVar.k;
            di60.w(actionButtonAttachment.h, this.itemView.getContext(), null, null, null, null, 62);
            lu luVar = (lu) r11.getValue();
            NewsEntry newsEntry = wusVar.j;
            u1c0 J02 = J0();
            i = J02 != null ? J02.k : 0;
            luVar.getClass();
            lu.a(newsEntry, actionButtonAttachment, i);
            return;
        }
        ActionButtonAttachment actionButtonAttachment2 = (ActionButtonAttachment) this.C;
        if (actionButtonAttachment2 == null || (q6 = q6()) == null) {
            return;
        }
        di60.w(actionButtonAttachment2.h, this.itemView.getContext(), null, null, null, null, 62);
        lu luVar2 = (lu) r11.getValue();
        u1c0 J03 = J0();
        i = J03 != null ? J03.k : 0;
        luVar2.getClass();
        lu.a(q6, actionButtonAttachment2, i);
    }
}
