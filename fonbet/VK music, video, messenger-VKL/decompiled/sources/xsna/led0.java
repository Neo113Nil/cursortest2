package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.plc0;

/* compiled from: PrivacySettingHolder.kt */
/* loaded from: classes4.dex */
public final class led0 extends vif0<plc0.a> {
    public final TextView n;
    public final TextView o;

    public led0(View view, com.vk.newsfeed.impl.posting.settings.mvi.c cVar) {
        super(view);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_open_privacy);
        this.n = textView;
        this.o = (TextView) this.itemView.findViewById(R.id.tv_hint);
        bwt0.i0(textView, new arb0(cVar, 5));
    }

    @Override // xsna.vif0
    public final void i6(plc0.a aVar) {
        plc0.a aVar2 = aVar;
        boolean z = aVar2.b;
        TextView textView = this.o;
        TextView textView2 = this.n;
        if (!z) {
            textView.setText(this.itemView.getContext().getString(R.string.comments_privacy_desc_public));
            bwt0.p0(textView2, false);
            return;
        }
        if (aVar2.c) {
            at.d(this.itemView, R.string.comments_privacy_enable_desc_group, textView);
            at.d(this.itemView, R.string.disable_comments, textView2);
        } else {
            at.d(this.itemView, R.string.comments_privacy_disable_desc_group, textView);
            at.d(this.itemView, R.string.enable_comments, textView2);
        }
        bwt0.p0(textView2, true);
    }
}
