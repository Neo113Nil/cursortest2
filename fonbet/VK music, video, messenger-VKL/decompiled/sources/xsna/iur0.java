package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: VhMsgSearch.kt */
/* loaded from: classes2.dex */
public final class iur0 extends vfz<gk30> {
    public static final /* synthetic */ int y = 0;
    public final mkr0 l;
    public final ImAvatarView m;
    public final TextView n;
    public final View o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final AppCompatImageView s;
    public final ci30 t;
    public final DisplayNameFormatter u;
    public final StringBuilder v;
    public final StringBuffer w;
    public final com.vk.im.ui.formatters.a x;

    public iur0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (ImAvatarView) view.findViewById(R.id.vkim_avatar);
        this.n = (TextView) view.findViewById(R.id.vkim_title);
        this.o = view.findViewById(R.id.vkim_fwd_divider);
        this.p = (TextView) view.findViewById(R.id.vkim_fwd_hint);
        this.q = (TextView) view.findViewById(R.id.vkim_msg_text);
        this.r = (TextView) view.findViewById(R.id.vkim_time);
        this.s = (AppCompatImageView) view.findViewById(R.id.casper_icon);
        this.t = new ci30(this.itemView.getContext());
        this.u = new DisplayNameFormatter(null, 2, "...");
        this.v = new StringBuilder();
        this.w = new StringBuffer();
        this.x = new com.vk.im.ui.formatters.a(this.itemView.getContext());
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(gk30 gk30Var) {
        String d6;
        gk30 gk30Var2 = gk30Var;
        bwt0.i0(this.itemView, new een0(5, this, gk30Var2));
        Dialog dialog = gk30Var2.b;
        Msg msg = gk30Var2.d;
        ProfilesSimpleInfo profilesSimpleInfo = gk30Var2.c;
        CharSequence charSequence = gk30Var2.e;
        com.vk.im.engine.models.messages.a aVar = gk30Var2.f;
        boolean z = gk30Var2.g;
        boolean z2 = gk30Var2.h;
        bwt0.p0(this.o, !aVar.equals(msg) || z2);
        boolean z3 = !aVar.equals(msg) || z2;
        TextView textView = this.p;
        bwt0.p0(textView, z3);
        boolean z4 = aVar instanceof NestedMsg;
        CharSequence charSequence2 = "…";
        if (z4 && ((NestedMsg) aVar).b == NestedMsg.Type.FWD) {
            qtd0 zb = profilesSimpleInfo.zb(msg.getFrom());
            if (zb != null && (d6 = zb.d6(UserNameCase.NOM)) != null) {
                charSequence2 = d6;
            }
            charSequence2 = (zb != null ? zb.B2() : null) == UserSex.FEMALE ? this.itemView.getContext().getString(R.string.vkim_search_msg_hint_fwd_female, charSequence2) : this.itemView.getContext().getString(R.string.vkim_search_msg_hint_fwd_male, charSequence2);
        } else if (z4 && ((NestedMsg) aVar).b == NestedMsg.Type.REPLY) {
            charSequence2 = this.itemView.getContext().getString(R.string.vkim_search_msg_hint_reply);
        } else if (z2) {
            charSequence2 = this.x.b(msg);
        }
        textView.setText(charSequence2);
        this.q.setText(charSequence);
        StringBuilder sb = this.v;
        sb.setLength(0);
        StringBuffer stringBuffer = this.w;
        stringBuffer.setLength(0);
        long j = msg.g;
        ci30 ci30Var = this.t;
        ci30Var.c().setTimeInMillis(j);
        Date date = ci30Var.c;
        date.setTime(j);
        ((SimpleDateFormat) ci30Var.g.getValue()).format(date, stringBuffer, ci30Var.d);
        this.r.setText(stringBuffer);
        ImAvatarView imAvatarView = this.m;
        TextView textView2 = this.n;
        DisplayNameFormatter displayNameFormatter = this.u;
        if (z) {
            displayNameFormatter.f(msg.getFrom(), profilesSimpleInfo, sb);
            textView2.setText(sb);
            imAvatarView.s1(profilesSimpleInfo.zb(msg.getFrom()));
        } else {
            displayNameFormatter.g(dialog, profilesSimpleInfo, sb);
            textView2.setText(sb);
            imAvatarView.r1(dialog, profilesSimpleInfo);
        }
        AppCompatImageView appCompatImageView = this.s;
        if (z || !dialog.sc()) {
            bwt0.p0(appCompatImageView, false);
        } else {
            bwt0.p0(appCompatImageView, true);
            bwt0.o0(appCompatImageView, c4g0.t(dialog.hc()));
        }
    }
}
