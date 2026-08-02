package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: FeedHidePopupViewHolder.kt */
/* loaded from: classes4.dex */
public final class c0r extends vfz<b0r> implements View.OnClickListener {
    public final TextView l;
    public final View m;
    public b0r n;

    public c0r(ViewGroup viewGroup) {
        super(R.layout.feed_hide_popup_item, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.item_ignored_title);
        this.m = this.itemView.findViewById(R.id.item_ignored_icon);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(b0r b0rVar) {
        b0r b0rVar2 = b0rVar;
        this.n = b0rVar2;
        xo9.A(this.l, b0rVar2.c);
        dhr0.f0(b0rVar2.b, R.attr.vk_ui_icon_accent, this.m);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b0r b0rVar;
        View.OnClickListener onClickListener;
        if (jjc.b() || (b0rVar = this.n) == null || (onClickListener = b0rVar.d) == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
