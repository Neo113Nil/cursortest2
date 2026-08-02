package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import xsna.gd60;

/* compiled from: ShittyActionButtonHolder.kt */
/* loaded from: classes4.dex */
public final class zdj0 extends qi6<ShitAttachment> implements View.OnClickListener {
    public final TextView C;

    public zdj0(ViewGroup viewGroup) {
        super(R.layout.shitty_action_button_holder, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView;
        TextView textView = (TextView) frameLayout.findViewById(R.id.shitty_action_button);
        this.C = textView;
        frameLayout.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        ShitAttachment shitAttachment2 = shitAttachment;
        String str = shitAttachment2.u;
        if (!shitAttachment2.l0 || drm0.N(str)) {
            str = shitAttachment2.p;
        }
        this.C.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.itemView.getContext();
        ShitAttachment q6 = q6();
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        gd60 a = hd60.a();
        gd60.a aVar = gd60.a;
        a.O(context, q6, i, false);
    }
}
