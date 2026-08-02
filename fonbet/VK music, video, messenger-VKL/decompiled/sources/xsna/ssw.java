package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: IncomingCallHeaderViewsHolder.kt */
/* loaded from: classes7.dex */
public final class ssw {
    public final Object a;
    public Object b;
    public Object c;

    public ssw(upj upjVar) {
        this.a = upjVar;
    }

    public ssw(mjw0 mjw0Var) {
        ViewGroup viewGroup = (ViewGroup) mjw0Var.findViewById(R.id.incoming_call_header_container);
        this.a = viewGroup;
        this.b = (TextView) viewGroup.findViewById(R.id.tv_header_peer_name);
        this.c = (TextView) viewGroup.findViewById(R.id.header_subtitle_text);
        bwt0.p0(viewGroup, false);
    }

    public ssw(p870 p870Var, sv9 sv9Var) {
        yd10 yd10Var = new yd10();
        this.a = p870Var;
        this.b = yd10Var;
        this.c = sv9Var;
    }
}
