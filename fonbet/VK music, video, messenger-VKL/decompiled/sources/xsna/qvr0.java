package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VhUnreadFrom.kt */
/* loaded from: classes2.dex */
public final class qvr0 extends osr0<rvr0> {
    public static final /* synthetic */ int q = 0;
    public final TextView m;
    public final ViewGroup n;
    public final View o;
    public final View p;

    public qvr0(View view) {
        super(view);
        this.m = (TextView) view.findViewById(R.id.text);
        this.n = (ViewGroup) view.findViewById(R.id.text_container);
        this.o = view.findViewById(R.id.left_line_view);
        this.p = view.findViewById(R.id.right_line_view);
    }

    @Override // xsna.osr0
    public final /* bridge */ /* synthetic */ void V5(Object obj, pk30 pk30Var) {
        a6((rvr0) obj);
    }

    public final void a6(rvr0 rvr0Var) {
        boolean z = rvr0Var.c;
        View view = this.p;
        View view2 = this.o;
        ViewGroup viewGroup = this.n;
        TextView textView = this.m;
        if (z) {
            Context context = textView.getContext();
            e3m.a aVar = e3m.a;
            textView.setTextColor(context.getColor(R.color.vk_white));
            viewGroup.setBackgroundResource(R.drawable.bg_unread_msg);
            view2.setVisibility(4);
            view.setVisibility(4);
        } else {
            textView.setTextColor(e3m.f(R.attr.vk_ui_vkontakte_im_service_message_text, textView.getContext()));
            viewGroup.setBackground(null);
            view2.setVisibility(0);
            view.setVisibility(0);
        }
        textView.setText(rvr0Var.f);
    }
}
