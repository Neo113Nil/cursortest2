package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;

/* compiled from: ReplyBarHolder.kt */
/* loaded from: classes4.dex */
public final class j3g0 extends aa implements View.OnClickListener {
    public final afg o;
    public final VkAvatar p;
    public final TextView q;
    public String r;

    public j3g0(ViewGroup viewGroup, afg afgVar) {
        super(viewGroup, R.layout.wall_comment_replybar, 0);
        this.o = afgVar;
        this.p = (VkAvatar) this.itemView.findViewById(R.id.photo);
        this.q = (TextView) this.itemView.findViewById(R.id.text);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        int itemViewType = getItemViewType();
        VkAvatar vkAvatar = this.p;
        if (itemViewType == 438) {
            f4m.s(b6().getDimensionPixelSize(R.dimen.comment_reply_small_margin_start), vkAvatar);
            f4m.s(b6().getDimensionPixelSize(R.dimen.comment_reply_bar_small_margin_start), this.q);
        }
        String str = this.r;
        if (str == null) {
            str = hd60.a().a().u();
        }
        vkAvatar.o0(str, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.o.xh((iag) this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aa
    public final void t6() {
        boolean a4 = this.o.a4(this.n);
        View view = this.itemView;
        view.setAlpha(a4 ? 1.0f : 0.4f);
        if (view instanceof c0n) {
            ((c0n) view).setTouchEnabled(a4);
        }
    }
}
