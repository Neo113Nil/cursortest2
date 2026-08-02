package com.yandex.messaging.ui.timeline;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.view.EmojiDrawable;
import com.yandex.messaging.domain.statuses.StatusIconType;
import com.yandex.messaging.domain.user.DeletedShownStatus;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.internal.net.Error;
import defpackage.a6t;
import defpackage.bob1;
import defpackage.cft;
import defpackage.ct21;
import defpackage.e9h0;
import defpackage.edz0;
import defpackage.fxa1;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.ike;
import defpackage.j3b;
import defpackage.j6b;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.n1f;
import defpackage.olh0;
import defpackage.oyh0;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rp3;
import defpackage.u2c0;
import defpackage.u9u0;
import defpackage.w4t;
import defpackage.w6t;
import defpackage.wg90;
import defpackage.wwg0;
import defpackage.x6t;
import defpackage.y6t;
import defpackage.zp11;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class g extends Brick {
    public static final /* synthetic */ kgx[] N;
    public final w6t A;
    public final w4t B;
    public final View C;
    public final TextView D;
    public final TextView E;
    public final AvatarImageView F;
    public final ProgressBar G;
    public String H;
    public EmojiDrawable I;
    public StatusIconType J;
    public final rp3 K;
    public Error L;
    public DeletedShownStatus M;
    public final Activity a;
    public final ChatRequest b;
    public final cft c;
    public final com.yandex.messaging.internal.e w;
    public final h3y x;
    public final com.yandex.messaging.internal.displayname.a y;
    public final com.yandex.messaging.internal.team.gaps.a z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("chatInfoJob", 0, "getChatInfoJob()Lkotlinx/coroutines/Job;", g.class);
        qoi0.a.getClass();
        N = new kgx[]{mutablePropertyReference1Impl};
    }

    public g(Activity activity, ChatRequest chatRequest, cft cftVar, com.yandex.messaging.internal.e eVar, h3y h3yVar, com.yandex.messaging.internal.displayname.a aVar, com.yandex.messaging.internal.team.gaps.a aVar2, w6t w6tVar, w4t w4tVar) {
        this.a = activity;
        this.b = chatRequest;
        this.c = cftVar;
        this.w = eVar;
        this.x = h3yVar;
        this.y = aVar;
        this.z = aVar2;
        this.A = w6tVar;
        this.B = w4tVar;
        View inflate = inflate(activity, olh0.msg_b_chat_toolbar_content);
        this.C = inflate;
        this.D = (TextView) inflate.findViewById(e9h0.messaging_toolbar_title);
        this.E = (TextView) inflate.findViewById(e9h0.messaging_toolbar_status);
        AvatarImageView avatarImageView = (AvatarImageView) inflate.findViewById(e9h0.messaging_toolbar_avatar);
        this.F = avatarImageView;
        this.G = (ProgressBar) inflate.findViewById(e9h0.messaging_toolbar_progressbar);
        this.K = new rp3();
        this.M = DeletedShownStatus.NormalStatus;
        avatarImageView.setOnlineIndicatorSize(avatarImageView.getResources().getDimensionPixelSize(gvg0.online_indicator_height_and_width_small));
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.C;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        edz0 edz0Var = (edz0) this.x.get();
        zp11 zp11Var = edz0Var.y;
        ChatRequest chatRequest = edz0Var.b;
        zp11Var.getClass();
        u2c0 u2c0Var = new u2c0(zp11Var, chatRequest, edz0Var);
        qp3 qp3Var = edz0Var.N;
        kgx[] kgxVarArr = edz0.a0;
        kgx kgxVar = kgxVarArr[0];
        qp3Var.b(u2c0Var);
        wg90 wg90Var = edz0Var.z;
        ct21 e = wg90Var.b.e(wg90Var.a, new j6b(1));
        qp3 qp3Var2 = edz0Var.O;
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var2.b(e);
        y6t y6tVar = edz0Var.x;
        kotlinx.coroutines.flow.e.H(edz0Var.V, new jqr(new n1f(16, y6tVar.b.a(), y6tVar), new TimelineToolbarStatusUpdater$onAttach$1(edz0Var, null), 3));
        v();
        com.yandex.messaging.internal.e eVar = this.w;
        ChatRequest chatRequest2 = this.b;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(eVar.a(chatRequest2), new TimelineToolbarContentBrick$onBrickAttach$1(this, null), 3));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.c.a(chatRequest2), new TimelineToolbarContentBrick$onBrickAttach$2(this, null), 3));
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.B.a(chatRequest2), new TimelineToolbarContentBrick$onBrickAttach$3(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        edz0 edz0Var = (edz0) this.x.get();
        kotlinx.coroutines.a.g(edz0Var.V.a, null);
        qp3 qp3Var = edz0Var.N;
        kgx[] kgxVarArr = edz0.a0;
        kgx kgxVar = kgxVarArr[0];
        qp3Var.b(null);
        qp3 qp3Var2 = edz0Var.O;
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var2.b(null);
        this.J = null;
        this.I = null;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickPause() {
        super.onBrickPause();
        kotlinx.coroutines.a.g(((edz0) this.x.get()).U.a, null);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickResume() {
        String str;
        String str2;
        super.onBrickResume();
        edz0 edz0Var = (edz0) this.x.get();
        com.yandex.messaging.domain.user.a aVar = edz0Var.E;
        ChatRequest chatRequest = edz0Var.b;
        ike ikeVar = edz0Var.U;
        if (!((u9u0) edz0Var.F.get()).w || edz0Var.L) {
            j3b j3bVar = edz0Var.M;
            if (j3bVar != null && (str = j3bVar.e) != null) {
                kotlinx.coroutines.flow.e.H(ikeVar, new m0(edz0Var.w.a(chatRequest), aVar.a(new a6t(str)), new TimelineToolbarStatusUpdater$onResume$2$1(edz0Var, null)));
            }
        } else {
            j3b j3bVar2 = edz0Var.M;
            if (j3bVar2 != null && (str2 = j3bVar2.e) != null) {
                kotlinx.coroutines.flow.e.H(ikeVar, new m0(edz0Var.D.a(new x6t(str2)), aVar.a(new a6t(str2)), new TimelineToolbarStatusUpdater$onResume$1$1(edz0Var, null)));
            }
        }
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(edz0Var.A.a(chatRequest), new TimelineToolbarStatusUpdater$onResume$3(edz0Var, null), 3));
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(edz0Var.C.a(chatRequest), new TimelineToolbarStatusUpdater$onResume$4(2, edz0Var.c, g.class, "updateHasMeeting", "updateHasMeeting(Z)V", 4), 3));
    }

    public final void q(boolean z) {
        this.G.setVisibility(z ? 0 : 8);
        this.F.setVisibility(z ? 8 : 0);
        this.E.setVisibility(z ? 8 : 0);
        this.D.setVisibility(z ? 8 : 0);
    }

    public final void r(CharSequence charSequence) {
        TextView textView = this.E;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(fxa1.c(jng0.messagingToolbarStatusTextColor, this.a).data);
        if (charSequence == null && this.M == DeletedShownStatus.EmptyStatus) {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        } else if (this.L != null || (charSequence != null && charSequence.length() == 0)) {
            textView.setText((CharSequence) null);
            textView.setVisibility(4);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public final void s(EmojiDrawable emojiDrawable, StatusIconType statusIconType) {
        TextView textView = this.D;
        if (statusIconType != null) {
            bob1.c(textView, statusIconType.getIconRes(), statusIconType.getColor(), 16);
        } else {
            bob1.d(textView, emojiDrawable, false);
        }
    }

    public final void u(Error error) {
        kgx kgxVar = N[0];
        this.K.a(null);
        this.L = error;
        r("");
        this.D.setText(oyh0.chat_list_error_title);
        q(false);
        this.F.setImageResource(wwg0.msg_ic_avatar_chat_fail);
        if (error == Error.INVITE_LINK_INVALID) {
            int i = oyh0.error_invalid_invite_link;
            Activity activity = this.a;
            Toast.makeText(activity, activity.getString(i), 0).show();
        }
    }

    public final void v() {
        pzt0 H = kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.y.a(this.b, gvg0.avatar_size_36), new TimelineToolbarContentBrick$showInfo$1(this, null), 3));
        kgx kgxVar = N[0];
        this.K.a(H);
    }
}
