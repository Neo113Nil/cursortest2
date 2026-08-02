package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartCommentsButtonHolder.kt */
/* loaded from: classes2.dex */
public final class bp30 extends hr30<Attach, cp30> {
    public TextView d;
    public AppCompatImageView e;
    public AppCompatImageView f;
    public View g;
    public pk30 h;
    public cp30 i;
    public final ap30 j = new ap30(this, 0);

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setColorFilter(i);
        AppCompatImageView appCompatImageView2 = this.f;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setColorFilter(i);
    }

    @Override // xsna.hr30
    public final void p(cp30 cp30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        cp30 cp30Var2 = cp30Var;
        aeg aegVar = cp30Var2.d;
        this.h = pk30Var;
        this.i = cp30Var2;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(aegVar.a);
        View view = this.g;
        (view != null ? view : null).setVisibility(aegVar.b ? 0 : 8);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_comments_button, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.comments_title);
        this.e = (AppCompatImageView) inflate.findViewById(R.id.comments_icon);
        this.f = (AppCompatImageView) inflate.findViewById(R.id.comments_chevron);
        this.g = inflate.findViewById(R.id.comments_separator);
        jjc.g(inflate, this.j);
        return inflate;
    }

    @Override // xsna.hr30
    public final void r() {
        this.h = null;
        this.i = null;
    }
}
