package xsna;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.a;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.o0r0;
import xsna.otb;
import xsna.ug30;
import xsna.uxd0;
import xsna.yyb;

/* compiled from: ChatProfileChatMembersAdapter.kt */
/* loaded from: classes2.dex */
public final class pwb extends wx3 {
    public final hxb j;
    public final xdw k;
    public final a l = new a();

    public pwb(hxb hxbVar, kkm kkmVar, xdw xdwVar) {
        this.j = hxbVar;
        this.k = xdwVar;
        x0(yyb.g.class, new fb(this, 19));
        x0(yyb.i.class, new com.vk.im.ui.fragments.b(this, 23));
        x0(yyb.h.class, new qb6(3, this, kkmVar));
        x0(yyb.f.class, new zt4(this, 10));
        x0(yyb.d.class, new com.vk.movika.sdk.base.observable.a(this, 22));
        x0(yyb.e.class, new hb(this, 23));
        setHasStableIds(true);
    }

    /* compiled from: ChatProfileChatMembersAdapter.kt */
    public final class a implements jj0 {
        public a() {
        }

        @Override // xsna.jj0
        public final void c() {
            pwb.this.j.m.c();
        }

        @Override // xsna.jj0
        public final void f(DialogMember dialogMember, ProfilesInfo profilesInfo, tow towVar) {
            cxb cxbVar = pwb.this.j.k;
            mb8 mb8Var = cxbVar.d.a.a.e;
            Context context = cxbVar.b;
            Peer peer = dialogMember.b;
            Peer peer2 = dialogMember.c;
            new ug30.c0(peer, towVar);
            if (!dialogMember.zb()) {
                cxbVar.g.d().m(context, com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return;
            }
            FragmentManager supportFragmentManager = ((AppCompatActivity) e3m.h(context)).getSupportFragmentManager();
            int i = msw.f1;
            dw20.b bVar = new dw20.b(context, null);
            String str = dialogMember.g;
            bVar.w0(str);
            String a = new DisplayNameFormatter(null, 3, null).a(peer2, profilesInfo, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME);
            String a2 = new bj30(context).a(dialogMember.d);
            qtd0 Bb = profilesInfo.Bb(peer2);
            dw20.a.R(bVar, context.getString((Bb != null ? Bb.B2() : null) == UserSex.FEMALE ? R.string.vkim_chat_been_invited_time_f : R.string.vkim_chat_been_invited_time_m, a, a2), 0, 0, 6);
            if (str == null) {
                str = "";
            }
            bVar.N(new com.vk.im.ui.views.avatars.a(context, new a.b.C1179b(str), 2));
            bVar.H0(supportFragmentManager, "ChatProfileInfoModel");
        }

        @Override // xsna.jj0
        public final void g() {
            cxb cxbVar = pwb.this.j.k;
            cxbVar.w.c(cxbVar.c.f);
        }

        @Override // xsna.jj0
        public final void j(String str) {
            otb otbVar = pwb.this.j.m;
            otbVar.getClass();
            String obj = drm0.p0(str).toString();
            if (epx.f(otbVar.c.a, obj)) {
                return;
            }
            otbVar.f.e();
            otbVar.c = new otb.c(obj, 4);
            if (obj.length() != 0) {
                otbVar.d();
                return;
            }
            otb.b bVar = otbVar.l;
            DialogExt dialogExt = otbVar.l.a;
            otbVar.l = otb.b.a(bVar, new DialogExt(dialogExt.d, new ProfilesInfo(), dialogExt.c), false, false, new ohm(), false, null, 894);
            otbVar.i();
            otbVar.b(otbVar.l.a);
        }

        @Override // xsna.jj0
        public final void u(DialogMember dialogMember) {
            cxb cxbVar = pwb.this.j.k;
            Dialog Cb = cxbVar.c.Cb();
            if (Cb == null) {
                return;
            }
            Peer q = cxbVar.d.q();
            cxbVar.k(new uxd0.d0(r490.c(Cb, dialogMember, q), epx.f(dialogMember.b, q), new kp5(3, cxbVar, dialogMember)));
        }

        @Override // xsna.jj0
        public final void e() {
        }

        @Override // xsna.jj0
        public final void h() {
        }

        @Override // xsna.jj0
        public final void k() {
        }

        @Override // xsna.jj0
        public final void l() {
        }

        @Override // xsna.jj0
        public final void m() {
        }

        @Override // xsna.jj0
        public final void o() {
        }

        @Override // xsna.jj0
        public final void p() {
        }

        @Override // xsna.jj0
        public final void r() {
        }

        @Override // xsna.jj0
        public final void s() {
        }

        @Override // xsna.jj0
        public final void t() {
        }

        @Override // xsna.jj0
        public final void v() {
        }

        @Override // xsna.jj0
        public final void w() {
        }

        @Override // xsna.jj0
        public final void x() {
        }

        @Override // xsna.jj0
        public final void y() {
        }

        @Override // xsna.jj0
        public final void d(String str) {
        }

        @Override // xsna.jj0
        public final void i(String str) {
        }

        @Override // xsna.jj0
        public final void n(boolean z) {
        }

        @Override // xsna.jj0
        public final void q(String str) {
        }
    }
}
