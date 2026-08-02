package xsna;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.n6p;

/* compiled from: VhProfileBanner.kt */
/* loaded from: classes2.dex */
public final class vur0 extends osr0<wur0> implements n6p.a {
    public static final /* synthetic */ int w = 0;
    public final View m;
    public final com.vk.im.ui.views.avatars.b n;
    public final Button o;
    public final Button p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final AvatarView t;
    public Peer u;
    public n6p v;

    public vur0(View view) {
        super(view);
        this.m = view;
        this.n = new com.vk.im.ui.views.avatars.b(view.getContext(), true);
        this.o = (Button) view.findViewById(R.id.edu_conversation_btn_first);
        this.p = (Button) view.findViewById(R.id.edu_conversation_btn_second);
        this.q = (TextView) view.findViewById(R.id.edu_conversation_request_state_info);
        this.r = (TextView) view.findViewById(R.id.edu_conversation_member_name);
        this.s = (TextView) view.findViewById(R.id.edu_conversation_member_organization);
        this.t = (AvatarView) view.findViewById(R.id.edu_conversation_member_avatar);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.u = Peer.Unknown.e;
    }

    @Override // xsna.osr0
    public final void V5(Object obj, pk30 pk30Var) {
        n6p n6pVar;
        CharSequence charSequence;
        wur0 wur0Var = (wur0) obj;
        String str = wur0Var.f;
        CharSequence charSequence2 = wur0Var.d;
        Peer peer = wur0Var.e;
        this.u = peer;
        n6p n6pVar2 = wur0Var.h;
        if (n6pVar2 != null) {
            n6p n6pVar3 = this.v;
            if (n6pVar3 != null) {
                n6pVar3.a(this);
            }
            n6pVar = n6pVar2;
        } else {
            n6pVar = null;
        }
        this.v = n6pVar;
        this.t.T0(wur0Var.c, this.n.e(charSequence2.toString(), peer.c));
        this.r.setText(charSequence2);
        if (n6pVar2 == null || (charSequence = n6pVar2.b(this.u)) == null) {
            charSequence = wur0Var.g;
        }
        boolean z = charSequence == null || drm0.N(charSequence);
        TextView textView = this.s;
        bwt0.p0(textView, !z);
        if (charSequence != null) {
            textView.setText(charSequence);
        }
        boolean z2 = !drm0.N(str);
        TextView textView2 = this.q;
        bwt0.p0(textView2, z2);
        textView2.setText(str);
        List<BannerButton> list = wur0Var.i;
        bwt0.p0(this.o, false);
        bwt0.p0(this.p, false);
        BannerButton bannerButton = (BannerButton) j5g.b0(0, list);
        if (bannerButton != null) {
            l16.a(this.o, bannerButton.c, dhr0.M() ? bannerButton.e : bannerButton.f, bannerButton.d, bannerButton.a, bannerButton.b, this.u, pk30Var);
        }
        BannerButton bannerButton2 = (BannerButton) j5g.b0(1, list);
        if (bannerButton2 != null) {
            l16.a(this.p, bannerButton2.c, dhr0.M() ? bannerButton2.e : bannerButton2.f, bannerButton2.d, bannerButton2.a, bannerButton2.b, this.u, pk30Var);
        }
    }

    @Override // xsna.osr0
    public final void W5() {
        n6p n6pVar = this.v;
        if (n6pVar != null) {
            n6pVar.c(this);
        }
        this.v = null;
    }

    @Override // xsna.n6p.a
    public final void g2(CharSequence charSequence) {
        boolean z = true ^ (charSequence == null || drm0.N(charSequence));
        TextView textView = this.s;
        bwt0.p0(textView, z);
        if (charSequence != null) {
            textView.setText(charSequence);
        }
    }
}
