package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: MsgPartNestedForwardHolder.kt */
/* loaded from: classes2.dex */
public final class ms30 extends hr30<AttachWall, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d> {
    public View d;
    public ImAvatarView e;
    public TextView f;
    public TextView g;
    public StackAvatarView h;
    public TextView i;
    public Group j;
    public com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d k;
    public final v5t l = new v5t(R.layout.vkim_msg_part_nested_forward);

    public ms30() {
        new DisplayNameFormatter(null, 3, null);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.n;
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar = this.k;
        if (dVar != null && dVar.g) {
            i = bubbleColors.g;
        }
        TextView textView3 = this.g;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(i);
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar2 = this.k;
        int f = l8g.f(0.08f, (dVar2 == null || !dVar2.l) ? bubbleColors.r : -1);
        View view = this.d;
        (view != null ? view : null).getBackground().setTint(f);
    }

    @Override // xsna.hr30
    public final void p(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d dVar2 = dVar;
        this.k = dVar2;
        ImAvatarView imAvatarView = this.e;
        if (imAvatarView == null) {
            imAvatarView = null;
        }
        ImageList imageList = dVar2.d;
        String str = dVar2.e;
        Peer.Type type = dVar2.c.c;
        imAvatarView.getClass();
        imAvatarView.p1(imageList, imAvatarView.t.e(str, type), AvatarBorderType.CIRCLE);
        if (pk30Var != null) {
            ImAvatarView imAvatarView2 = this.e;
            if (imAvatarView2 == null) {
                imAvatarView2 = null;
            }
            bwt0.i0(imAvatarView2, new td0(25, pk30Var, dVar2));
            View view = this.d;
            if (view == null) {
                view = null;
            }
            bwt0.i0(view, new defpackage.o(26, dVar2, pk30Var));
        }
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(dVar2.f);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(dVar2.h);
        int i = dVar2.k;
        List<ImageList> list = dVar2.j;
        if (i < 2) {
            Group group = this.j;
            f4m.j(group != null ? group : null);
            return;
        }
        Group group2 = this.j;
        if (group2 == null) {
            group2 = null;
        }
        group2.setVisibility(0);
        TextView textView3 = this.i;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(enj.f(R.plurals.vkim_msg_list_nested_forward_show_all_num_messages, i - 1, textView3.getContext()));
        List<ImageList> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            StackAvatarView stackAvatarView = this.h;
            f4m.j(stackAvatarView != null ? stackAvatarView : null);
            return;
        }
        StackAvatarView stackAvatarView2 = this.h;
        if (stackAvatarView2 == null) {
            stackAvatarView2 = null;
        }
        int i2 = StackAvatarView.n;
        stackAvatarView2.getClass();
        stackAvatarView2.d(new i5g(list2), 0, null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.l.c(layoutInflater, viewGroup);
        this.d = c;
        if (c == null) {
            c = null;
        }
        this.e = (ImAvatarView) c.findViewById(R.id.vkim_forward_author_icon);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        this.f = (TextView) view.findViewById(R.id.vkim_forward_author_name);
        View view2 = this.d;
        if (view2 == null) {
            view2 = null;
        }
        this.g = (TextView) view2.findViewById(R.id.vkim_forward_content);
        View view3 = this.d;
        if (view3 == null) {
            view3 = null;
        }
        this.h = (StackAvatarView) view3.findViewById(R.id.vkim_forward_show_more_authors_stack);
        View view4 = this.d;
        if (view4 == null) {
            view4 = null;
        }
        this.i = (TextView) view4.findViewById(R.id.vkim_forward_show_more_text);
        View view5 = this.d;
        if (view5 == null) {
            view5 = null;
        }
        this.j = (Group) view5.findViewById(R.id.vkim_forward_show_more_group);
        View view6 = this.d;
        if (view6 == null) {
            return null;
        }
        return view6;
    }

    @Override // xsna.hr30
    public final void r() {
        this.k = null;
        ImAvatarView imAvatarView = this.e;
        if (imAvatarView == null) {
            imAvatarView = null;
        }
        imAvatarView.setOnClickListener(null);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(null);
    }
}
