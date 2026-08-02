package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4217a2;
import com.vk.core.ui.CircularProgressView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.chat_controls.ChatControls;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cwb0;
import xsna.dqb;
import xsna.ph90;
import xsna.smb;
import xsna.vwb;
import xsna.xwb;

/* compiled from: ChatProfileChatSettingsComponent.kt */
/* loaded from: classes2.dex */
public final class uwb extends j8i implements xwb.a, smb.a, dqb.a {
    public static final Object x = pn00.k(new Pair("all", Integer.valueOf(R.string.vkim_all_members)), new Pair("owner_and_admins", Integer.valueOf(R.string.vkim_owner_and_admins)), new Pair("owner", Integer.valueOf(R.string.vkim_owner)), new Pair("enabled", Integer.valueOf(R.string.vkim_popup_stickers_enabled)), new Pair(C4217a2.e, Integer.valueOf(R.string.vkim_popup_stickers_disabled)), new Pair("ordinary", Integer.valueOf(R.string.vkim_dialog_ordinary_type)), new Pair("service", Integer.valueOf(R.string.vkim_dialog_service_type)));
    public final DialogExt i;
    public final nxb j;
    public final f1w k;
    public final lzv l;
    public final xbw m;
    public final xwb n;
    public final com.vk.im.ui.views.avatars.b o;
    public final smb p;
    public final dqb q;
    public DialogExt r;
    public ChatControls s;
    public ChatControls t;
    public String u;
    public boolean v;
    public int w;

    public uwb(Context context, DialogExt dialogExt, nxb nxbVar, kkm kkmVar, f1w f1wVar, lzv lzvVar, xbw xbwVar, mxv mxvVar, bc6 bc6Var) {
        ucp ucpVar = ucp.a;
        this.i = dialogExt;
        this.j = nxbVar;
        this.k = f1wVar;
        this.l = lzvVar;
        this.m = xbwVar;
        this.n = new xwb(this, kkmVar, R.string.vkim_chat_profile_chat_settings);
        this.o = new com.vk.im.ui.views.avatars.b(context, true);
        ji0 ji0Var = new ji0(this, 13);
        smb smbVar = new smb(ji0Var, bc6Var, this, f1wVar, lzvVar, mxvVar, 389489, "uwb");
        I0(smbVar.k);
        this.p = smbVar;
        dqb dqbVar = new dqb(ji0Var, lzvVar, this, "uwb");
        I0(dqbVar.e);
        this.q = dqbVar;
        this.r = dialogExt;
        this.u = "";
    }

    public static void b1(uwb uwbVar, Throwable th, NotifyId notifyId, int i) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            notifyId = null;
        }
        xwb xwbVar = uwbVar.n;
        if (th != null) {
            xwbVar.getClass();
            zk70.e(th);
        } else {
            if (notifyId == null) {
                return;
            }
            xwbVar.getClass();
            zk70.c(notifyId);
        }
        uwbVar.w = 0;
        uwbVar.v = false;
        uwbVar.d1();
    }

    @Override // xsna.smb.a
    public final void I(AvatarAction avatarAction) {
        xwb xwbVar = this.n;
        xwbVar.getClass();
        if (xwb.c.$EnumSwitchMapping$0[avatarAction.ordinal()] == 1) {
            bzb0 bzb0Var = xwbVar.f;
            if (bzb0Var != null) {
                bzb0Var.c(cwb0.g.e, new xm6(2, xwbVar, avatarAction));
                return;
            }
            return;
        }
        bzb0 bzb0Var2 = xwbVar.f;
        if (bzb0Var2 != null) {
            bzb0Var2.c(cwb0.f.e, new xy0(4, xwbVar, avatarAction));
        }
    }

    @Override // xsna.xwb.a
    public final void J(ph90 ph90Var, int i) {
        e1(ph90Var, (String) j5g.O0(ph90Var.c).get(i));
    }

    @Override // xsna.smb.a
    public final void L(Throwable th) {
        L.f("uwb", "onAvatarActionError: ", th);
        this.n.getClass();
        zk70.e(th);
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        xwb xwbVar = this.n;
        View a = xwbVar.a(layoutInflater, viewGroup);
        if (bundle != null) {
            O0(bundle);
        }
        DialogExt dialogExt = this.i;
        if (dialogExt.Cb() != null) {
            this.r = dialogExt;
            Dialog Cb = dialogExt.Cb();
            if (Cb != null) {
                this.s = kq01.p(Cb.Hb());
                f1();
            }
        } else {
            RecyclerView recyclerView = xwbVar.k;
            if (recyclerView == null) {
                recyclerView = null;
            }
            f4m.j(recyclerView);
            CircularProgressView circularProgressView = xwbVar.l;
            if (circularProgressView == null) {
                circularProgressView = null;
            }
            circularProgressView.setVisibility(0);
            c1(Source.ACTUAL, null, null);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = this.m.a().a0(io.reactivex.rxjava3.android.schedulers.a.b());
        pv2 pv2Var = new pv2(new s8(1, this, uwb.class, "onImEngineEvent", "onImEngineEvent(Lcom/vk/im/engine/models/events/Event;)V", 0, 4), 9);
        int i = kwg0.a;
        I0(a0.subscribe(pv2Var, new jwg0("uwb")));
        return a;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.n.j();
    }

    @Override // xsna.xwb.a
    public final void O(AvatarAction avatarAction) {
        this.p.d(avatarAction);
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.u = bundle.getString("LAST_EDITED_TITLE", "");
        this.t = (ChatControls) bundle.getParcelable("LAST_EDITED_CHAT_CONTROLS");
        this.w = bundle.getInt("APPLIED_CHANGED_COUNT", 0);
        this.v = bundle.getBoolean("APPLYING_UPDATES", false);
        f1();
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        bundle.putString("LAST_EDITED_TITLE", this.u);
        bundle.putParcelable("LAST_EDITED_CHAT_CONTROLS", this.t);
        bundle.putInt("APPLIED_CHANGED_COUNT", this.w);
        bundle.putBoolean("APPLYING_UPDATES", this.v);
    }

    @Override // xsna.dqb.a
    public final void W() {
        c1(Source.CACHE, new s4(this, 19), new lb(this, 20));
    }

    @Override // xsna.smb.a
    public final void X(List<? extends AvatarAction> list) {
        xwb xwbVar = this.n;
        bzb0 bzb0Var = xwbVar.f;
        if (bzb0Var != null) {
            bzb0Var.b(new cwb0.e((ArrayList) list, cwb0.c1.b.a), new u8(xwbVar, 22), null);
        }
    }

    public final void X0() {
        boolean z = false;
        if (!a1()) {
            this.v = false;
            this.w = 0;
            d1();
            this.n.d();
            nxb nxbVar = this.j;
            nxbVar.Yn(true);
            nxbVar.hide();
            return;
        }
        int i = this.w;
        if (i > 2) {
            b1(this, null, NotifyId.ERROR_TYPE_INTERNAL, 1);
            c1(Source.NETWORK, null, null);
            return;
        }
        this.v = true;
        this.w = i + 1;
        boolean Z0 = Z0();
        dqb dqbVar = this.q;
        if (Z0) {
            z = dqbVar.b(this.u);
        } else if (Y0()) {
            z = dqbVar.a(this.t);
        }
        if (z || !this.v) {
            return;
        }
        b1(this, null, NotifyId.ERROR_TYPE_INTERNAL, 1);
        c1(Source.NETWORK, null, null);
    }

    public final boolean Y0() {
        ChatControls chatControls;
        ChatControls chatControls2 = this.t;
        return (chatControls2 == null || (chatControls = this.s) == null || epx.f(chatControls2, chatControls)) ? false : true;
    }

    @Override // xsna.xwb.a
    public final void Z(ph90 ph90Var) {
        e1(ph90Var, C4217a2.e);
    }

    public final boolean Z0() {
        String str;
        ChatSettings Hb;
        String str2 = this.u;
        if (str2.length() <= 0) {
            return false;
        }
        Dialog Cb = this.r.Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null || (str = Hb.b) == null) {
            str = "";
        }
        return !epx.f(str2, str);
    }

    public final boolean a1() {
        return Z0() || Y0();
    }

    @Override // xsna.xwb.a
    public final void b(vwb.c cVar) {
        Object obj;
        xwb xwbVar;
        bzb0 bzb0Var;
        int i = cVar.b;
        ChatControls chatControls = this.t;
        if (chatControls != null) {
            Peer a = this.k.a();
            a.getClass();
            Iterator it = qh90.a(chatControls, a.Ab(Peer.Type.GROUP)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ph90) obj).a == i) {
                        break;
                    }
                }
            }
            ph90 ph90Var = (ph90) obj;
            if (ph90Var == null) {
                return;
            }
            String str = epx.f(ph90Var.b, "enabled") ? C4217a2.e : "enabled";
            e1(ph90Var, str);
            if (i == 11 && str.equals("enabled") && (bzb0Var = (xwbVar = this.n).f) != null) {
                bzb0.d(bzb0Var, i9s.l, null, new n0(8, xwbVar, ph90Var), null, 26);
            }
        }
    }

    @Override // xsna.xwb.a
    public final void b0() {
        xwb xwbVar = this.n;
        bzb0 bzb0Var = xwbVar.f;
        if (bzb0Var != null) {
            bzb0.d(bzb0Var, cwb0.h.l, new f5(xwbVar, 17), null, null, 28);
        }
    }

    @Override // xsna.smb.a
    public final void c0() {
        c1(Source.CACHE, null, null);
    }

    public final void c1(Source source, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        I0(ktr.d(this.l.b("uwb", new uqm(this.i.f, source)).l(new gv(new com.vk.movika.sdk.base.observable.m(this, 22), 8))).subscribe(new hv(new cq3(5, this, gzsVar), 10), new az(new twb(izsVar, 0), 14)));
    }

    public final void d1() {
        boolean a1 = a1();
        nxb nxbVar = this.j;
        xwb xwbVar = this.n;
        if (!a1) {
            xwbVar.e();
            xwbVar.i();
            RecyclerView recyclerView = xwbVar.k;
            (recyclerView != null ? recyclerView : null).removeOnItemTouchListener(xwbVar.m);
            nxbVar.Yn(true);
            return;
        }
        if (this.v) {
            xwbVar.d();
            RecyclerView recyclerView2 = xwbVar.k;
            (recyclerView2 != null ? recyclerView2 : null).addOnItemTouchListener(xwbVar.m);
            xwbVar.e();
            xwbVar.l();
        } else {
            RecyclerView recyclerView3 = xwbVar.k;
            (recyclerView3 != null ? recyclerView3 : null).removeOnItemTouchListener(xwbVar.m);
            xwbVar.i();
            xwbVar.k();
        }
        nxbVar.Yn(false);
    }

    public final void e1(ph90 ph90Var, String str) {
        ChatControls chatControls;
        ChatControls chatControls2 = this.t;
        if (chatControls2 == null) {
            chatControls = null;
        } else if (ph90Var instanceof ph90.i) {
            chatControls = ChatControls.zb(chatControls2, str, null, null, null, null, null, null, null, null, null, null, null, 4094);
        } else if (ph90Var instanceof ph90.d) {
            chatControls = ChatControls.zb(chatControls2, null, str, null, null, null, null, null, null, null, null, null, null, 4093);
        } else if (ph90Var instanceof ph90.e) {
            chatControls = ChatControls.zb(chatControls2, null, null, str, null, null, null, null, null, null, null, null, null, 4091);
        } else if (ph90Var instanceof ph90.f) {
            chatControls = ChatControls.zb(chatControls2, null, null, str, null, null, null, null, null, null, null, null, null, 4091);
        } else if (ph90Var instanceof ph90.k) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, str, null, null, null, null, null, null, null, null, 4087);
        } else if (ph90Var instanceof ph90.b) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, str, null, null, null, null, null, 4031);
        } else if (ph90Var instanceof ph90.j) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, str, null, null, null, null, null, null, null, 4079);
        } else if (ph90Var instanceof ph90.a) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, str, null, null, null, null, null, null, 4063);
        } else if (ph90Var instanceof ph90.c) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, null, Boolean.valueOf(epx.f(str, "service")), null, null, null, 3839);
        } else if (ph90Var instanceof ph90.g) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, str, null, null, null, null, 3967);
        } else if (ph90Var instanceof ph90.h) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, str, null, null, null, null, 3967);
        } else if (ph90Var instanceof ph90.l) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, null, null, str, null, null, 3583);
        } else if (ph90Var instanceof ph90.n) {
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, null, null, null, str, null, 3071);
        } else {
            if (!(ph90Var instanceof ph90.m)) {
                throw new NoWhenBranchMatchedException();
            }
            chatControls = ChatControls.zb(chatControls2, null, null, null, null, null, null, null, null, null, null, null, str, 2047);
        }
        this.t = chatControls;
        f1();
    }

    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void f() {
        this.p.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0033, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1() {
        vwb.d dVar;
        int i;
        ChatSettings Hb;
        Dialog Cb = this.r.Cb();
        ChatControls chatControls = this.s;
        if (Cb == null || chatControls == null) {
            return;
        }
        ChatControls chatControls2 = this.t;
        if (chatControls2 == null) {
            this.t = chatControls;
        } else {
            chatControls = chatControls2;
        }
        String str = this.u;
        ArrayList arrayList = new ArrayList();
        ChatSettings Hb2 = Cb.Hb();
        if (Hb2 != null && Hb2.o) {
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
            }
            str = Hb2.b;
            dVar = new vwb.d(str, Hb2.c, this.o.c(Hb2, Cb.Sb().longValue(), Cb.hc()));
        } else {
            dVar = null;
        }
        if (dVar != null) {
            arrayList.add(dVar);
        }
        ChatSettings Hb3 = Cb.Hb();
        ChatPermissions chatPermissions = Hb3 != null ? Hb3.B : null;
        uki0 uki0Var = ghp.a;
        if (chatPermissions != null || ((Hb = Cb.Hb()) != null && Hb.y)) {
            f1w f1wVar = this.k;
            boolean e = f1wVar.c().e();
            Peer a = f1wVar.a();
            a.getClass();
            ArrayList a2 = qh90.a(chatControls, a.Ab(Peer.Type.GROUP));
            if (a2.isEmpty()) {
                a2 = null;
            }
            if (a2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : a2) {
                    ph90 ph90Var = (ph90) obj;
                    if (!Cb.sc() || ((i = ph90Var.a) != 7 && i != 2)) {
                        arrayList2.add(obj);
                    }
                }
                uki0Var = rli0.t(new i5g(arrayList2), new swb(this, e));
            }
        }
        g5g.z(arrayList, uki0Var);
        boolean isEmpty = arrayList.isEmpty();
        xwb xwbVar = this.n;
        if (isEmpty) {
            xwbVar.d();
            nxb nxbVar = this.j;
            nxbVar.Yn(true);
            nxbVar.hide();
            return;
        }
        RecyclerView recyclerView = xwbVar.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        CircularProgressView circularProgressView = xwbVar.l;
        if (circularProgressView == null) {
            circularProgressView = null;
        }
        f4m.j(circularProgressView);
        qwb qwbVar = xwbVar.e;
        (qwbVar != null ? qwbVar : null).setItems(arrayList);
        d1();
    }

    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void g(String str) {
        boolean a1 = a1();
        this.u = str;
        if (a1 != a1()) {
            d1();
        }
    }

    @Override // xsna.dqb.a
    public final void g0() {
        c1(Source.CACHE, new ah(this, 14), new ul1(this, 20));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.xwb.a
    public final void h(vwb.b bVar) {
        Object obj;
        ChatControls chatControls = this.t;
        if (chatControls != null) {
            Peer a = this.k.a();
            a.getClass();
            Iterator it = qh90.a(chatControls, a.Ab(Peer.Type.GROUP)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ph90) obj).a == bVar.b) {
                        break;
                    }
                }
            }
            ph90 ph90Var = (ph90) obj;
            if (ph90Var == null) {
                return;
            }
            Set<String> set = ph90Var.c;
            ArrayList arrayList = new ArrayList(c5g.u(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((Number) x.get((String) it2.next())).intValue()));
            }
            int[] N0 = j5g.N0(arrayList);
            int T = rl3.T(bVar.e, N0);
            xwb xwbVar = this.n;
            xwbVar.d();
            int i = bVar.d;
            bzb0 bzb0Var = xwbVar.f;
            if (bzb0Var != null) {
                View view = xwbVar.i;
                bzb0Var.i((view != null ? view : null).getContext(), i, N0, R.string.ok, T, new mu1(xwbVar, ph90Var, i, N0));
            }
        }
    }

    @Override // xsna.dqb.a
    public final void i(NotifyId notifyId) {
        L.l("uwb", "onChangeTitleError: " + notifyId.name());
        b1(this, null, notifyId, 1);
        c1(Source.NETWORK, null, null);
    }

    @Override // xsna.dqb.a
    public final void i0(Throwable th) {
        L.f("uwb", "onChangeControlsError", th);
        b1(this, th, null, 2);
        c1(Source.NETWORK, null, null);
    }

    @Override // xsna.dqb.a
    public final void k() {
        d1();
    }

    @Override // xsna.dqb.a
    public final void m() {
        d1();
    }

    @Override // xsna.xwb.a
    public final void n() {
        X0();
    }

    @Override // xsna.xwb.a
    public final void o() {
        boolean a1 = a1();
        xwb xwbVar = this.n;
        if (a1) {
            bzb0 bzb0Var = xwbVar.f;
            if (bzb0Var != null) {
                bzb0.d(bzb0Var, e1h0.l, new ic(xwbVar, 18), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(xwbVar, 20), null, 24);
                return;
            }
            return;
        }
        xwbVar.d();
        nxb nxbVar = this.j;
        nxbVar.Yn(true);
        nxbVar.hide();
    }

    @Override // xsna.xwb.a
    public final void p(AvatarAction avatarAction) {
        smb smbVar = this.p;
        smbVar.a();
        io.reactivex.rxjava3.disposables.c cVar = smbVar.m;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.smb.a
    public final void t() {
        bzb0 bzb0Var = this.n.f;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
    }

    @Override // xsna.dqb.a
    public final void w0(Throwable th) {
        L.f("uwb", "onChangeTitleError:", th);
        b1(this, th, null, 2);
        c1(Source.NETWORK, null, null);
    }

    @Override // xsna.xwb.a
    public final void y() {
        this.n.d();
        nxb nxbVar = this.j;
        nxbVar.Yn(true);
        nxbVar.hide();
    }

    @Override // xsna.dqb.a
    public final void e0() {
    }

    @Override // xsna.dqb.a
    public final void w() {
    }
}
