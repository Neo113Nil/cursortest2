package xsna;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vkontakte.android.R;

/* compiled from: MsgPartWallPostCollapseTextHolder.kt */
/* loaded from: classes2.dex */
public final class ou30 extends hr30<AttachWall, pu30> {
    public TextView d;
    public final v5t e = new v5t(R.layout.vkim_msg_part_wall_post_collapse_text);

    @Override // xsna.hr30
    public final void p(pu30 pu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        pu30 pu30Var2 = pu30Var;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        Resources resources = textView.getContext().getResources();
        TextView textView2 = this.d;
        TextView textView3 = textView2 != null ? textView2 : null;
        int i = pu30Var2.b;
        textView3.setText(resources.getQuantityString(R.plurals.vkim_wall_post_see_more, i, Integer.valueOf(i)));
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.e.c(layoutInflater, viewGroup);
        this.d = (TextView) c.findViewById(R.id.text);
        return c;
    }
}
