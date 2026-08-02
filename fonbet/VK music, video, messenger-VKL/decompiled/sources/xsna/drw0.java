package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vkontakte.android.R;

/* compiled from: VoipInviteToScheduledCallView.kt */
/* loaded from: classes7.dex */
public final class drw0 implements gm50 {
    public final View b;
    public final qqw0 c;
    public final ijw0 d;
    public final TextView e;
    public final TextView f;
    public final VoipShareLinkPagerView g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final crw0 m;

    public drw0(View view, qqw0 qqw0Var, ijw0 ijw0Var) {
        this.b = view;
        this.c = qqw0Var;
        this.d = ijw0Var;
        this.e = (TextView) view.findViewById(R.id.scheduled_title);
        this.f = (TextView) view.findViewById(R.id.scheduled_time_subtitle);
        VoipShareLinkPagerView voipShareLinkPagerView = (VoipShareLinkPagerView) view.findViewById(R.id.share_link_pager);
        this.g = voipShareLinkPagerView;
        View findViewById = view.findViewById(R.id.share_link_btn);
        this.h = findViewById;
        View findViewById2 = view.findViewById(R.id.share_by_email_btn);
        this.i = findViewById2;
        View findViewById3 = view.findViewById(R.id.add_to_calendar_btn);
        this.j = findViewById3;
        View findViewById4 = view.findViewById(R.id.share_QR_btn);
        this.k = findViewById4;
        this.l = view.findViewById(R.id.progress_bar);
        crw0 crw0Var = new crw0(this);
        this.m = crw0Var;
        boolean z = BuildInfo.s() || BuildInfo.t();
        bwt0.p0(voipShareLinkPagerView, z);
        bwt0.p0(findViewById, !z);
        jjc.g(findViewById, new lyl0(this, 23));
        jjc.g(findViewById2, new olt0(this, 6));
        jjc.g(findViewById3, new qzl0(this, 23));
        jjc.g(findViewById4, new xkw0(this, 1));
        qqw0Var.getLifecycle().addObserver(crw0Var);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }
}
