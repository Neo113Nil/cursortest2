package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.SituationalThemeAttachment;

/* compiled from: SituationalSuggestHolder.kt */
/* loaded from: classes4.dex */
public final class ywj0 extends m56<SituationalThemeAttachment> implements View.OnClickListener {
    public final TextView D;
    public final TextView E;
    public final View F;

    public ywj0(ViewGroup viewGroup) {
        super(R.layout.holder_post_situational_suggest_v2, viewGroup);
        this.D = (TextView) this.itemView.findViewById(R.id.post_situation_suggest_title);
        this.E = (TextView) this.itemView.findViewById(R.id.post_situation_suggest_subtitle);
        View findViewById = this.itemView.findViewById(R.id.post_situation_suggest_open);
        this.F = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.m56
    public final void T6(SituationalThemeAttachment situationalThemeAttachment) {
        SituationalThemeAttachment situationalThemeAttachment2 = situationalThemeAttachment;
        this.D.setText(situationalThemeAttachment2.g);
        this.E.setText(situationalThemeAttachment2.h);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!jjc.b() && epx.f(view, this.F)) {
            U6(view);
        }
    }
}
