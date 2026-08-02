package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.channels.api.Channel;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: ChannelMsgSearchVh.kt */
/* loaded from: classes16.dex */
public final class t5b extends vfz<n5b> {
    public static final /* synthetic */ int u = 0;
    public final s5b l;
    public final ImAvatarView m;
    public final TextView n;
    public final View o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final ci30 s;
    public final StringBuffer t;

    public t5b(View view, s5b s5bVar) {
        super(view);
        this.l = s5bVar;
        this.m = (ImAvatarView) view.findViewById(R.id.channel_msg_search_avatar);
        this.n = (TextView) view.findViewById(R.id.channel_msg_search_title);
        this.o = view.findViewById(R.id.channel_msg_search_fwd_divider);
        this.p = (TextView) view.findViewById(R.id.channel_msg_search_fwd_hint);
        this.q = (TextView) view.findViewById(R.id.channel_msg_search_msg_text);
        this.r = (TextView) view.findViewById(R.id.channel_msg_search_time);
        this.s = new ci30(this.itemView.getContext());
        this.t = new StringBuffer();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(n5b n5bVar) {
        n5b n5bVar2 = n5bVar;
        bwt0.i0(this.itemView, new d05(6, this, n5bVar2));
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setText(n5bVar2.c);
        StringBuffer stringBuffer = this.t;
        stringBuffer.setLength(0);
        long j = n5bVar2.b.g;
        ci30 ci30Var = this.s;
        ci30Var.c().setTimeInMillis(j);
        Date date = ci30Var.c;
        date.setTime(j);
        ((SimpleDateFormat) ci30Var.g.getValue()).format(date, stringBuffer, ci30Var.d);
        this.r.setText(stringBuffer);
        Channel channel = n5bVar2.d;
        String str = channel != null ? channel.d : null;
        if (str == null) {
            str = "";
        }
        this.n.setText(str);
        this.m.s1(channel);
    }
}
