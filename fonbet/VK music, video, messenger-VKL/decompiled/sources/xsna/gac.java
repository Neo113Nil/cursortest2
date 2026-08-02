package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ChipActionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class gac extends m56<ActionButtonAttachment> implements View.OnClickListener {
    public final TextView D;
    public final Object E;

    public gac(ViewGroup viewGroup) {
        super(R.layout.attach_chip_action_button, viewGroup);
        this.D = (TextView) this.itemView.findViewById(R.id.action_button_title);
        this.E = msy.a(LazyThreadSafetyMode.NONE, new pr1(5));
        this.itemView.setOnClickListener(this);
        getContext();
    }

    @Override // xsna.m56
    public final void T6(ActionButtonAttachment actionButtonAttachment) {
        this.D.setText(actionButtonAttachment.g);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionButtonAttachment actionButtonAttachment = (ActionButtonAttachment) this.C;
        if (actionButtonAttachment != null) {
            di60.w(actionButtonAttachment.h, this.itemView.getContext(), t6(), null, null, null, 60);
            NewsEntry q6 = q6();
            if (q6 != null) {
                lu luVar = (lu) this.E.getValue();
                u1c0 J0 = J0();
                int i = J0 != null ? J0.k : 0;
                luVar.getClass();
                lu.a(q6, actionButtonAttachment, i);
            }
        }
    }
}
