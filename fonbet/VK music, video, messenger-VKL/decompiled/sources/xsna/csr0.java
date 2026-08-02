package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import xsna.thm;

/* compiled from: VhMember.kt */
/* loaded from: classes2.dex */
public final class csr0 extends vfz<w120> {
    public static final /* synthetic */ int s = 0;
    public final gj0 l;
    public final ImAvatarView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final DisplayNameFormatter q;
    public x120 r;

    public csr0(View view, thm.a aVar) {
        super(view);
        this.l = aVar;
        this.m = (ImAvatarView) view.findViewById(R.id.avatar);
        this.n = (TextView) view.findViewById(R.id.name);
        this.o = (TextView) view.findViewById(R.id.nickname);
        this.p = (TextView) view.findViewById(R.id.mentionLabel);
        this.q = new DisplayNameFormatter(null, 3, null);
        view.setOnClickListener(new um3(this, 10));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(w120 w120Var) {
        w120 w120Var2 = w120Var;
        w120Var2.getClass();
        x120 x120Var = w120Var2.b;
        this.r = x120Var;
        ProfilesInfo profilesInfo = w120Var2.c;
        this.m.s1(profilesInfo.Bb(x120Var.a));
        Peer peer = x120Var.a;
        qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
        this.n.setText(this.q.a(peer, profilesInfo, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME));
        this.o.setText(x120Var.c);
        boolean z = x120Var.d;
        TextView textView = this.p;
        if (!z) {
            f4m.j(textView);
        } else {
            textView.setText(this.itemView.getContext().getString(R.string.vkim_mention_write_restricted));
            textView.setVisibility(0);
        }
    }
}
