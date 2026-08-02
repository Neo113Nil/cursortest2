package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.LongSparseArray;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.soloader.MinElf;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.exceptions.chat.ChatInvitationException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.log.L;
import com.vk.network.kbh.state.NetworkState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ftb;
import xsna.ktb;
import xsna.nwb;
import xsna.o0r0;
import xsna.uxd0;
import xsna.zxd0;

/* compiled from: ChatProfileDelegate.kt */
/* loaded from: classes2.dex */
public final class cxb extends r46 implements ktb.a, ftb.a {
    public final lzv o;
    public final com.vk.im.ui.views.avatars.b p;
    public final u9h0 q;
    public final r0n0 r;
    public final zzn0 s;
    public final a t;
    public final hxb u;
    public final bpn0 v;
    public final ktb w;
    public final ftb x;

    /* compiled from: ChatProfileDelegate.kt */
    public interface a {
        boolean b();
    }

    /* compiled from: ChatProfileDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MemberAction.values().length];
            try {
                iArr[MemberAction.ADMIN_SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MemberAction.ADMIN_UNSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MemberAction.KICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MemberAction.OWNER_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MemberAction.WRITE_DISABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MemberAction.WRITE_ENABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxb(Context context, DialogExt dialogExt, a1w a1wVar, ImScope imScope, lzv lzvVar, mxv mxvVar, b25 b25Var, sj90 sj90Var, g3a0 g3a0Var, ImageViewer imageViewer, com.vk.im.ui.views.avatars.b bVar, u9h0 u9h0Var, r0n0 r0n0Var, u90 u90Var, e8v e8vVar, kkm kkmVar, a aVar, rul rulVar) {
        super(context, dialogExt, a1wVar, sj90Var, g3a0Var, mxvVar, imageViewer, e8vVar, rulVar);
        zzn0 zzn0Var = new zzn0();
        this.o = lzvVar;
        this.p = bVar;
        this.q = u9h0Var;
        this.r = r0n0Var;
        this.s = zzn0Var;
        this.t = aVar;
        this.u = new hxb(context, dialogExt, kkmVar, a1wVar, mxvVar, this);
        this.v = new bpn0(new bxb(mxvVar, dialogExt, this, e8vVar, 0));
        ktb ktbVar = new ktb(context, a1wVar, mxvVar, b25Var, new ca(this, 17), u90Var, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, this);
        e(ktbVar.j);
        this.w = ktbVar;
        ftb ftbVar = new ftb(imScope, lzvVar, this.c.f, this, "ftb");
        e(ftbVar.p);
        this.x = ftbVar;
    }

    @Override // xsna.ftb.a
    public final void A0() {
        k(new uxd0.j(new l1(this, 19)));
    }

    @Override // xsna.r46
    public final void E(qxb qxbVar) {
        if (qxbVar instanceof ChatProfileListItem.InviteLink) {
            this.g.b().v(this.b, this.c, false, this.d.q());
        }
    }

    @Override // xsna.ktb.a
    public final void F9(itb itbVar, jtb jtbVar) {
        k(new uxd0.e(itbVar, jtbVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.r46
    public final void G(xub xubVar) {
        ChatSettings Hb;
        String str;
        ChatSettings Hb2;
        Peer peer;
        if (xubVar instanceof zub) {
            this.w.c(this.c.f);
            return;
        }
        if (xubVar instanceof vvb) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            }
            Dialog Cb = this.c.Cb();
            if (Cb != null && (Hb2 = Cb.Hb()) != null && (peer = Hb2.d) != null) {
                if (!peer.Ab(Peer.Type.GROUP)) {
                    peer = null;
                }
                if (peer != null) {
                    this.g.d().m(this.b, com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
            }
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (xubVar instanceof uvb) {
            Dialog Cb2 = this.c.Cb();
            if (Cb2 == null || (Hb = Cb2.Hb()) == null || (str = Hb.A) == null) {
                return;
            }
            this.g.b().h(this.b, str);
            return;
        }
        int i = 15;
        if (xubVar instanceof hvb) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            } else {
                k(new uxd0.o(new hd(this, i)));
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
        }
        if (xubVar instanceof ivb) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            } else {
                this.g.b().N(xa4.L(this.b), this.c.f, this.c.getTitle());
                s3q0 s3q0Var3 = s3q0.a;
                return;
            }
        }
        if (xubVar instanceof evb) {
            k(new uxd0.i(new wl0(this, 14)));
            return;
        }
        if (xubVar instanceof gwb) {
            ftb ftbVar = this.x;
            Peer peer2 = this.c.f;
            if (hg1.d(ftbVar.n)) {
                return;
            }
            io.reactivex.rxjava3.core.x b2 = ftbVar.c.b(ftbVar, new bdm(peer2, false, (int) (0 == true ? 1 : 0), 4));
            asu0 asu0Var = asu0.a;
            int i2 = 10;
            io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(b2.q(asu0Var.c()).m(asu0Var.d()), new da(new r6(ftbVar, 18), i2)), new p98(ftbVar, 1)).subscribe(new btb(new rl2(5), 0), new f50(new com.vk.movika.sdk.base.logic.interactor.e(ftbVar, i), i2));
            ftbVar.p.b(subscribe);
            ftbVar.n = subscribe;
        }
    }

    @Override // xsna.r46
    public final void H(zxd0 zxd0Var) {
        if (zxd0Var instanceof zxd0.t) {
            FragmentManager supportFragmentManager = ((AppCompatActivity) e3m.h(this.b)).getSupportFragmentManager();
            int i = nxb.k1;
            DialogExt dialogExt = this.c;
            Peer q = this.d.q();
            nxb nxbVar = new nxb();
            Bundle bundle = new Bundle();
            if (!dialogExt.j) {
                throw new IllegalArgumentException("Dialog is not chat id=" + dialogExt.e);
            }
            n34.w(bundle, dialogExt, null);
            bundle.putParcelable("owner_id", q);
            nxbVar.setArguments(bundle);
            nxbVar.Td(supportFragmentManager, "ChatProfileInfoModel");
        }
    }

    @Override // xsna.ftb.a
    public final void K() {
        k(new uxd0.l0(new w40(this, 18)));
    }

    @Override // xsna.ktb.a
    public final void Le(Throwable th) {
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void N() {
        k(new uxd0.j0(new j1(this, 19)));
    }

    public final boolean O() {
        ChatSettings Bb;
        if (this.t.b() && (Bb = this.c.Bb()) != null) {
            Peer q = this.d.q();
            boolean z = epx.f(Bb.d, q) || Bb.e.contains(q);
            if (!Bb.g && Bb.t && z) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ftb.a
    public final void P(Throwable th) {
        L.f("ChatProfileInfoModel", "onKickMemberError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void T() {
        k(uxd0.c.a);
    }

    @Override // xsna.ftb.a
    public final void V() {
        k(uxd0.c.a);
    }

    @Override // xsna.r46, xsna.jxb
    public final void a(sxp sxpVar) {
        String str;
        super.a(sxpVar);
        if (sxpVar instanceof h480) {
            h480 h480Var = (h480) sxpVar;
            long j = h480Var.b;
            Peer peer = h480Var.c;
            ProfilesInfo profilesInfo = h480Var.d;
            if (j != this.c.f.b) {
                return;
            }
            qtd0 Bb = profilesInfo.Bb(peer);
            if (Bb == null || (str = Bb.name()) == null) {
                str = "";
            }
            k(new uxd0.q0.i(str, new ie3(4, this, peer)));
        }
    }

    @Override // xsna.ktb.a
    public final void b5(esb esbVar) {
        ChatInvitationException chatInvitationException = esbVar.a;
        if (chatInvitationException != null) {
            String d = chatInvitationException.d();
            if (d == null || drm0.N(d)) {
                k(new uxd0.w(chatInvitationException));
            } else {
                k(new uxd0.x(chatInvitationException.g(), chatInvitationException.d()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ea A[SYNTHETIC] */
    @Override // xsna.jxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xxd0 c(DialogExt dialogExt, ImStoryState imStoryState, y6p y6pVar, List<EduAchievement> list, Map<Peer, p6p> map) {
        ChatSettings Hb;
        ChatSettings Hb2;
        boolean z;
        Peer peer;
        String string;
        ChatSettings Hb3;
        int i;
        Peer peer2;
        ChatSettings Hb4;
        Dialog Cb = dialogExt.Cb();
        ProfilesSimpleInfo Ob = dialogExt.b.Ob();
        ChatSettings Hb5 = Cb.Hb();
        Peer peer3 = Hb5.d;
        String str = Hb5.A;
        peer3.getClass();
        Peer.Type type = Peer.Type.GROUP;
        boolean Ab = peer3.Ab(type);
        sj90 sj90Var = this.e;
        g3a0 g3a0Var = this.f;
        Context context = this.b;
        yxd0 yxd0Var = new yxd0(context, dialogExt, this.d, sj90Var, g3a0Var);
        yxd0Var.f = this.q.a(Cb, Ob);
        yxd0Var.h = this.r.a(Cb, Ob);
        yxd0Var.k = Hb5.c;
        yxd0Var.l = this.p.c(Hb5, Cb.Sb().longValue(), Cb.hc());
        yxd0Var.m = f();
        yxd0Var.p = Hb5.Q && (Hb5.o || Hb5.B != null);
        yxd0Var.q = false;
        yxd0Var.r = imStoryState;
        boolean t = BuildInfo.t();
        Integer num = null;
        Context context2 = this.b;
        a1w a1wVar = this.d;
        if (!t) {
            this.g.getClass();
            boolean Ab2 = a1wVar.q().Ab(type);
            ChatSettings Hb6 = Cb.Hb();
            if (Hb6 != null && Hb6.n && !Cb.sc() && !Ab2) {
                yxd0Var.a(new zub(R.drawable.vk_icon_user_add_outline_28, 12, context2.getText(R.string.vkim_chat_profile_action_add_to_chat), null));
            }
        }
        yxd0Var.b();
        yxd0Var.j();
        yxd0Var.s();
        if (Ab) {
            yxd0Var.p();
            if (BuildInfo.t()) {
                yxd0Var.o();
            }
            yxd0Var.q();
            yxd0Var.k(new vvb(R.drawable.vk_icon_info_circle_outline_28, 12, context2.getText(R.string.vkim_dialog_option_open_group_profile), null));
            if (myc0.f(str)) {
                yxd0Var.k(new uvb(context2));
            } else if (O()) {
                yxd0Var.k(new hvb(context2));
            }
            Peer q = a1wVar.q();
            ChatSettings Hb7 = Cb.Hb();
            if (((Hb7 != null && Hb7.e.contains(q)) || ((Hb4 = Cb.Hb()) != null && epx.f(Hb4.d, q))) && a1wVar.r().h.g()) {
                ChatSettings Hb8 = Cb.Hb();
                if (Hb8 == null || !Hb8.H) {
                    yxd0Var.k(new evb(context2));
                } else {
                    yxd0Var.k(new gwb(context2));
                }
            }
            yxd0Var.m();
            Peer q2 = a1wVar.q();
            q2.getClass();
            if (!q2.Ab(type)) {
                yxd0Var.n();
            }
        } else {
            yxd0Var.l();
            yxd0Var.p();
            yxd0Var.r(true);
            if (BuildInfo.t()) {
                yxd0Var.o();
            }
            yxd0Var.q();
            ChatSettings Hb9 = Cb.Hb();
            boolean z2 = (Hb9 != null ? Hb9.f : 0) <= 300;
            Peer q3 = a1wVar.q();
            ChatSettings Hb10 = Cb.Hb();
            if (((Hb10 != null && Hb10.e.contains(q3)) || ((Hb = Cb.Hb()) != null && epx.f(Hb.d, q3))) && z2) {
                yxd0Var.k(new ivb(R.drawable.vk_icon_message_add_badge_outline_28, 12, context2.getText(R.string.vkim_create_chat_based_on_current), null));
            }
            if (myc0.f(str)) {
                yxd0Var.k(new uvb(context2));
            } else if (O()) {
                yxd0Var.k(new hvb(context2));
            }
            Peer q4 = a1wVar.q();
            ChatSettings Hb11 = Cb.Hb();
            if (((Hb11 != null && Hb11.e.contains(q4)) || ((Hb2 = Cb.Hb()) != null && epx.f(Hb2.d, q4))) && a1wVar.r().h.g()) {
                ChatSettings Hb12 = Cb.Hb();
                if (Hb12 != null && Hb12.H) {
                    yxd0Var.k(new gwb(context2));
                } else {
                    yxd0Var.k(new evb(context2));
                }
            }
            Peer q5 = a1wVar.q();
            ChatSettings Hb13 = Cb.Hb();
            if ((Hb13 != null && epx.f(Hb13.d, q5)) && !Hb5.j) {
                yxd0Var.k(new jvb(R.drawable.vk_icon_delete_outline_28, 8, context2.getText(R.string.vkim_chat_delete_action), null));
            }
            yxd0Var.m();
            yxd0Var.n();
        }
        ChatSettings Hb14 = Cb.Hb();
        boolean Ab3 = (Hb14 == null || (peer2 = Hb14.d) == null) ? false : peer2.Ab(type);
        if (Cb.sc()) {
            yxd0Var.e(new nwb.i(R.string.vkim_dialog_settings_casper_description, R.drawable.vk_icon_ghost_outline_28));
        }
        if (Cb.o1()) {
            yxd0Var.e(new nwb.i(R.string.vkim_dialog_settings_donut_description, R.drawable.vk_icon_donut_outline_28));
        }
        if (!BuildInfo.t()) {
            yxd0Var.c();
        }
        Dialog Cb2 = dialogExt.Cb();
        if (Cb2 != null && (Hb3 = Cb2.Hb()) != null && Hb3.v) {
            ChatProfileListItem.InviteLink.EntityType entityType = Cb2.vc() ? ChatProfileListItem.InviteLink.EntityType.CHAT : ChatProfileListItem.InviteLink.EntityType.CHANNEL;
            boolean t2 = BuildInfo.t();
            int i2 = ChatProfileListItem.InviteLink.a.$EnumSwitchMapping$0[entityType.ordinal()];
            if (i2 == 1) {
                i = R.string.vkim_chat_make_link_title;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.vkim_channel_invite_link;
            }
            yxd0Var.d(new ChatProfileListItem.InviteLink(5, context.getString(i), t2 ? R.drawable.vkim_ic_22_link_channel : R.drawable.vk_icon_chain_outline_28, null, false, false, t2, 56));
        }
        if (!Ab3) {
            if (!BuildInfo.t()) {
                yxd0Var.i();
            }
            if (Cb.Hc()) {
                Long Sb = Cb.Sb();
                long longValue = Sb.longValue();
                t6g0 t6g0Var = t6g0.b;
                hwp0 k0 = t6g0.d().k0();
                LongSparseArray<UGCChatSettingsModel> longSparseArray = k0.e;
                UGCChatSettingsModel uGCChatSettingsModel = longSparseArray.get(longValue);
                if (uGCChatSettingsModel == null) {
                    uGCChatSettingsModel = k0.c.a(longValue);
                    if (uGCChatSettingsModel != null) {
                        longSparseArray.put(longValue, uGCChatSettingsModel);
                    } else {
                        hwp0.e(k0, Sb, null, 2);
                        uGCChatSettingsModel = longSparseArray.get(longValue);
                        if (uGCChatSettingsModel == null) {
                            uGCChatSettingsModel = new UGCChatSettingsModel(longValue, false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                        }
                    }
                }
                boolean z3 = uGCChatSettingsModel.d;
                boolean z4 = uGCChatSettingsModel.g;
                if (!z3 && (z4 || uGCChatSettingsModel.h)) {
                    boolean m = pla.e().b().m(HintId.STICKERS_UGC_SETTINGS_UNSEEN);
                    String string2 = context.getString(R.string.vkim_chat_ugc);
                    if (uGCChatSettingsModel.f && z4) {
                        String string3 = context.getString(R.string.vkim_you_cant_edit_ugc_stickers);
                        num = Integer.valueOf(R.drawable.vk_icon_info_circle_outline_24);
                        string = string3;
                    } else {
                        string = uGCChatSettingsModel.c ? context.getString(R.string.vkim_ugc_stickers_hidden) : null;
                    }
                    yxd0Var.e(new nwb.h(new ChatProfileListItem.c(m, string2, num, BuildInfo.t()), string));
                }
            }
        }
        yxd0Var.g();
        ChatSettings Hb15 = Cb.Hb();
        boolean Ab4 = (Hb15 == null || (peer = Hb15.d) == null) ? false : peer.Ab(type);
        boolean qc = Cb.qc();
        ChatSettings Hb16 = Cb.Hb();
        boolean z5 = Hb16 != null ? Hb16.Q : false;
        List<sxb> i3 = i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i3) {
            txb txbVar = ((sxb) obj).a;
            if (txbVar instanceof yd3) {
                if (!qc || Ab4) {
                    z = false;
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                z = true;
                if (z) {
                }
            } else {
                if (txbVar instanceof c8v) {
                    z = qc;
                } else {
                    if (txbVar instanceof hxb) {
                        z = z5;
                    }
                    z = true;
                }
                if (z) {
                }
            }
        }
        yxd0Var.h(arrayList, this.s, !BuildInfo.t());
        return yxd0Var.t();
    }

    @Override // xsna.ftb.a
    public final void h0(Throwable th) {
        L.f("ChatProfileInfoModel", "onUnbanError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.r46
    public final List<sxb> i() {
        return (List) this.v.getValue();
    }

    @Override // xsna.ftb.a
    public final void j() {
        k(uxd0.c.a);
    }

    @Override // xsna.ktb.a
    public final void jd(bb bbVar) {
        k(new uxd0.d(bbVar));
    }

    @Override // xsna.ftb.a
    public final void k0() {
        k(new uxd0.n0(new rj1(this, 14)));
    }

    @Override // xsna.ftb.a
    public final void l() {
        k(new uxd0.z(new sx0(this, 12)));
    }

    @Override // xsna.ktb.a
    public final void m4() {
        k(uxd0.c.a);
    }

    @Override // xsna.ftb.a
    public final void n0() {
        k(uxd0.c.a);
    }

    @Override // xsna.r46, xsna.jxb
    public final void onActivityResult(int i, int i2, Intent intent) {
        long[] jArr;
        Peer peer;
        Context context = this.b;
        mxv mxvVar = this.g;
        switch (i) {
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                this.w.b(intent);
                break;
            case STALE_CACHED_RESPONSE_VALUE:
                if (i2 == -1) {
                    if (intent == null || (jArr = intent.getLongArrayExtra("ids")) == null) {
                        jArr = new long[0];
                    }
                    mxvVar.b().e(xa4.L(context), rl3.t0(jArr), intent != null ? intent.getBooleanExtra("based_on_other_chat", false) : false);
                    break;
                }
                break;
            case 224:
                if (i2 == -1 && intent != null && (peer = (Peer) intent.getParcelableExtra("dialog_id")) != null) {
                    mxvVar.b().d(peer.b, context);
                    break;
                }
                break;
        }
    }

    @Override // xsna.ftb.a
    public final void q(Throwable th) {
        L.f("ChatProfileInfoModel", "onSetOwnerError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void r(Throwable th) {
        L.f("ChatProfileInfoModel", "onSetAdminError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void r0() {
        k(uxd0.c.a);
    }

    @Override // xsna.ftb.a
    public final void s() {
        k(uxd0.c.a);
    }

    @Override // xsna.ftb.a
    public final void s0(Throwable th) {
        L.f("ChatProfileInfoModel", "onUnsetAdminError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void u0(Throwable th) {
        L.f("ChatProfileInfoModel", "onBanError", th);
        k(new uxd0.w(th));
    }

    @Override // xsna.ftb.a
    public final void x0() {
        k(new uxd0.m0(new v6(this, 11)));
    }
}
