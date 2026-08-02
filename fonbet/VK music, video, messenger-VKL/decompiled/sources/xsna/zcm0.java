package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StorySendMessageVH.kt */
/* loaded from: classes6.dex */
public final class zcm0 extends cc<uwl0.a.b.C3843a> {
    public final TextView p;
    public final FrameLayout q;

    public zcm0(View view, rwl0.a aVar) {
        super(view, aVar);
        this.p = (TextView) view.findViewById(R.id.tv_action);
        this.q = (FrameLayout) view.findViewById(R.id.fl_send_message_container);
    }

    @Override // xsna.cc
    public final void b6(uwl0.a.b.C3843a c3843a) {
        TextView textView = this.p;
        textView.setText(R.string.stories_replies_reply);
        textView.setTextSize(0, cn70.f(14));
        cc.j6(this.q, c3843a.c);
    }

    @Override // xsna.cc
    public final void i6() {
        if (jjc.b()) {
            return;
        }
        super.i6();
    }
}
