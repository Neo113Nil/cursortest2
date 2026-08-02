package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: EmptyCommentsHolder.kt */
/* loaded from: classes4.dex */
public final class ifp extends aa {
    public ifp(ViewGroup viewGroup, String str) {
        super(viewGroup, R.layout.empty_comments, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.empty_comments_tv);
        textView.setText(str);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, enj.e(R.drawable.vk_icon_comment_outline_56, R.attr.vk_ui_icon_secondary, this.itemView.getContext()), (Drawable) null, (Drawable) null);
        bwt0.h(this.itemView, new l49(textView, viewGroup, this, 3));
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(iag iagVar) {
    }

    @Override // xsna.aa
    public final void s6() {
    }
}
