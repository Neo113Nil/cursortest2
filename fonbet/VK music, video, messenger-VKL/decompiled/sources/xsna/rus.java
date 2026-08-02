package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.tlo0;

/* compiled from: FullActionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class rus extends m56<ActionButtonAttachment> implements View.OnClickListener {
    public final y6u0 D;
    public final Object E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rus(ViewGroup viewGroup) {
        super(r0);
        y6u0 y6u0Var = new y6u0(viewGroup.getContext());
        y6u0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        y6u0 y6u0Var2 = (y6u0) this.itemView;
        y6u0Var2.setOnClickListener(this);
        this.D = y6u0Var2;
        this.E = msy.a(LazyThreadSafetyMode.NONE, new fn4(14));
    }

    @Override // xsna.m56
    public final void T6(ActionButtonAttachment actionButtonAttachment) {
        ActionButtonAttachment actionButtonAttachment2 = actionButtonAttachment;
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        tus tusVar = obj instanceof tus ? (tus) obj : null;
        y6u0 y6u0Var = this.D;
        if (tusVar != null) {
            y6u0Var.setText(tusVar.h);
            return;
        }
        tlo0.a aVar = tlo0.Companion;
        String str = actionButtonAttachment2.g;
        aVar.getClass();
        y6u0Var.setText(new tlo0.h(str));
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        tus tusVar = obj instanceof tus ? (tus) obj : null;
        ?? r11 = this.E;
        if (tusVar != null) {
            ActionButtonAttachment actionButtonAttachment = tusVar.j;
            di60.w(actionButtonAttachment.h, this.itemView.getContext(), null, null, null, null, 62);
            lu luVar = (lu) r11.getValue();
            NewsEntry newsEntry = tusVar.i;
            u1c0 J02 = J0();
            i = J02 != null ? J02.k : 0;
            luVar.getClass();
            lu.a(newsEntry, actionButtonAttachment, i);
            return;
        }
        ActionButtonAttachment actionButtonAttachment2 = (ActionButtonAttachment) this.C;
        if (actionButtonAttachment2 != null) {
            di60.w(actionButtonAttachment2.h, this.itemView.getContext(), null, null, null, null, 62);
            NewsEntry q6 = q6();
            if (q6 != null) {
                lu luVar2 = (lu) r11.getValue();
                u1c0 J03 = J0();
                i = J03 != null ? J03.k : 0;
                luVar2.getClass();
                lu.a(q6, actionButtonAttachment2, i);
            }
        }
    }
}
