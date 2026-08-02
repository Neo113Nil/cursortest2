package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.group.Group;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.api.id.CallId;
import com.vk.voip.invite.GroupCallInviteFragment;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.x89;

/* compiled from: GroupCallInviteComponent.kt */
/* loaded from: classes7.dex */
public final class uhu extends j8i implements w8i {
    public final Context i;
    public final w89 j;
    public final String k;
    public final VoipCallSource l;
    public final String m;
    public final b25 n;
    public final khw0 o;
    public final GroupCallInviteFragment.b p;
    public final xhu q;
    public final Object r;
    public final Object s;
    public x89 t;
    public final bpn0 u;

    /* compiled from: GroupCallInviteComponent.kt */
    public final class a {

        /* compiled from: GroupCallInviteComponent.kt */
        /* renamed from: xsna.uhu$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3806a extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((uhu) this.receiver).Z0();
                return s3q0.a;
            }
        }

        /* compiled from: GroupCallInviteComponent.kt */
        public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((uhu) this.receiver).Z0();
                return s3q0.a;
            }
        }

        public a() {
        }

        public final void a(boolean z) {
            uhu uhuVar = uhu.this;
            x89 x89Var = uhuVar.t;
            if (x89Var instanceof x89.a) {
                s89 s89Var = ((x89.a) x89Var).a;
                if (s89Var.f != null) {
                    String str = uhuVar.m;
                    b bVar = new b(0, uhuVar, uhu.class, "hideBottomSheet", "hideBottomSheet()V", 0);
                    uhuVar.I0(hg1.n(uhuVar.j.b(s89Var, str), uhuVar.i, false, null, 62).subscribe(new y50(new thu(uhuVar, z, bVar), 28), new st0(new com.vk.im.engine.commands.messages.a(uhuVar, bVar, s89Var, z), 21)));
                    return;
                }
                C3806a c3806a = new C3806a(0, uhuVar, uhu.class, "hideBottomSheet", "hideBottomSheet()V", 0);
                x89 x89Var2 = uhuVar.t;
                x89.c cVar = x89Var2 instanceof x89.a ? ((x89.a) x89Var2).b : null;
                if (cVar == null) {
                    return;
                }
                CallId callId = s89Var.a;
                kyv j = ((ImBridgeComponent) ((k7m) m7m.f(uhuVar)).a(fpf0.a(ImBridgeComponent.class))).g5().j();
                xhu xhuVar = uhuVar.q;
                Context context = uhuVar.i;
                VoipCallSource voipCallSource = uhuVar.l;
                boolean z2 = cVar instanceof x89.c.a;
                if (z2) {
                    if (voipCallSource == null) {
                        voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.JOIN_DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE_ANONYMOUS);
                    }
                } else if (voipCallSource == null) {
                    voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.JOIN_DEEPLINK, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE);
                }
                xhuVar.getClass();
                if (cVar instanceof x89.c.C3983c) {
                    x89.c.C3983c c3983c = (x89.c.C3983c) cVar;
                    esa C = xo9.C(c3983c.c, callId);
                    if (C != null) {
                        j.e(context, c3983c.a, voipCallSource, z, true, C);
                    } else {
                        j.o(context, c3983c.a, voipCallSource, z, true);
                    }
                } else {
                    VoipCallSource voipCallSource2 = voipCallSource;
                    if (cVar instanceof x89.c.b) {
                        x89.c.b bVar2 = (x89.c.b) cVar;
                        j.n(context, bVar2.a, voipCallSource2, z, true, fkq0.e(bVar2.b.c));
                    } else {
                        if (!z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g2v.c().j().r(context, ((x89.c.a) cVar).b, voipCallSource2, z, true);
                    }
                }
                c3806a.invoke();
            }
        }
    }

    public uhu(Context context, w89 w89Var, String str, VoipCallSource voipCallSource, String str2, b25 b25Var, khw0 khw0Var, GroupCallInviteFragment.b bVar, xhu xhuVar) {
        this.i = context;
        this.j = w89Var;
        this.k = str;
        this.l = voipCallSource;
        this.m = str2;
        this.n = b25Var;
        this.o = khw0Var;
        this.p = bVar;
        this.q = xhuVar;
        sbg sbgVar = new sbg(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, sbgVar);
        this.s = msy.a(lazyThreadSafetyMode, new atm(this, 10));
        this.t = x89.d.a;
        this.u = new bpn0(new tbh(this, 21));
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        aiu Y0 = Y0();
        Y0.getClass();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.voip_group_call_invite, viewGroup, false);
        Y0.e = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        Y0.b = (TextView) viewGroup2.findViewById(R.id.voip_call_invite_title);
        Y0.c = (AvatarView) viewGroup2.findViewById(R.id.voip_call_invite_chat_avatar);
        Y0.d = (TextView) viewGroup2.findViewById(R.id.voip_call_invite_participants_subtitle);
        ViewGroup viewGroup3 = Y0.e;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        Y0.f = BottomSheetBehavior.L((ViewGroup) viewGroup3.findViewById(R.id.voip_call_invite_bottom_sheet_view));
        ViewGroup viewGroup4 = Y0.e;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        Y0.g = (ViewFlipper) viewGroup4.findViewById(R.id.voip_call_invite_flipper_view);
        ViewGroup viewGroup5 = Y0.e;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        Y0.h = viewGroup5.findViewById(R.id.voip_call_invite_join_with_video_btn);
        ViewGroup viewGroup6 = Y0.e;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        Y0.i = viewGroup6.findViewById(R.id.voip_call_invite_join_btn);
        ViewGroup viewGroup7 = Y0.e;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        Y0.j = viewGroup7.findViewById(R.id.voip_call_link_share_btn);
        ViewGroup viewGroup8 = Y0.e;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        Y0.k = viewGroup8.findViewById(R.id.voip_call_invite_scan_device_qr_code_button);
        ViewGroup viewGroup9 = Y0.e;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        Y0.l = viewGroup9.findViewById(R.id.voip_call_invite_error_close_btn);
        ViewGroup viewGroup10 = Y0.e;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        Y0.m = (TextView) viewGroup10.findViewById(R.id.voip_call_invite_error_title);
        ViewGroup viewGroup11 = Y0.e;
        if (viewGroup11 == null) {
            viewGroup11 = null;
        }
        Y0.n = (TextView) viewGroup11.findViewById(R.id.voip_call_invite_error_message);
        ViewGroup viewGroup12 = Y0.e;
        if (viewGroup12 == null) {
            viewGroup12 = null;
        }
        Y0.p = (ViewStub) viewGroup12.findViewById(R.id.voip_call_change_caller);
        ViewGroup viewGroup13 = Y0.e;
        if (viewGroup13 == null) {
            viewGroup13 = null;
        }
        bwt0.i0(viewGroup13, new m4g(Y0, 26));
        View view = Y0.i;
        if (view == null) {
            view = null;
        }
        bwt0.i0(view, new yhu(Y0, 0));
        View view2 = Y0.h;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2, new r9k(Y0, 16));
        View view3 = Y0.l;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.i0(view3, new uoh(Y0, 22));
        View view4 = Y0.j;
        if (view4 == null) {
            view4 = null;
        }
        bwt0.i0(view4, new zkh(Y0, 21));
        View view5 = Y0.k;
        if (view5 == null) {
            view5 = null;
        }
        bwt0.p0(view5, true);
        View view6 = Y0.k;
        if (view6 == null) {
            view6 = null;
        }
        bwt0.i0(view6, new m1k(Y0, 14));
        View view7 = Y0.k;
        View view8 = view7 == null ? null : view7;
        Y0.o = new q2x0(view8.getContext(), "add-room-by-code", R.string.voip_invite_by_qr_code_tool_tip, new r2x0(TimeUnit.DAYS.toMillis(60L)), view8, 112);
        zhu zhuVar = new zhu(Y0);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = Y0.f;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.D(zhuVar);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = Y0.f;
        if (bottomSheetBehavior2 == null) {
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.X(5);
        ViewGroup viewGroup14 = Y0.e;
        if (viewGroup14 == null) {
            viewGroup14 = null;
        }
        bwt0.h(viewGroup14, new z0h(Y0, 18));
        ViewGroup viewGroup15 = Y0.e;
        if (viewGroup15 != null) {
            return viewGroup15;
        }
        return null;
    }

    @Override // xsna.j8i
    public final void N0() {
        Y0().q = null;
    }

    public final void X0(x89 x89Var) {
        x89.c cVar;
        Context mo2getContext;
        this.t = x89Var;
        if (x89Var instanceof x89.d) {
            ViewFlipper viewFlipper = Y0().g;
            sp.g(viewFlipper != null ? viewFlipper : null, 1);
            return;
        }
        if (!(x89Var instanceof x89.a)) {
            if (!(x89Var instanceof x89.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aiu Y0 = Y0();
            x89.b bVar = (x89.b) x89Var;
            ViewFlipper viewFlipper2 = Y0.g;
            if (viewFlipper2 == null) {
                viewFlipper2 = null;
            }
            sp.g(viewFlipper2, 2);
            t89 t89Var = bVar.a;
            TextView textView = Y0.m;
            if (textView == null) {
                textView = null;
            }
            textView.setText(t89Var.a);
            TextView textView2 = Y0.n;
            (textView2 != null ? textView2 : null).setText(t89Var.b);
            return;
        }
        x89.a aVar = (x89.a) x89Var;
        String str = aVar.a.c;
        GroupCallInviteFragment groupCallInviteFragment = this.p.a;
        com.vk.voip.ui.c.b.getClass();
        dhw0 dhw0Var = com.vk.voip.ui.c.O;
        boolean equals = str.equals(dhw0Var != null ? dhw0Var.i() : null);
        if (equals && (mo2getContext = groupCallInviteFragment.mo2getContext()) != null) {
            int i = VoipCallActivity.P;
            Intent intent = new Intent(mo2getContext, (Class<?>) VoipCallActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("extra_open_participants_screen_on_start", false);
            mo2getContext.startActivity(intent);
            int i2 = groupCallInviteFragment.U;
            if (i2 == 0) {
                groupCallInviteFragment.tn();
            } else if (i2 == 1) {
                groupCallInviteFragment.finish();
            } else if (i2 == 2) {
                groupCallInviteFragment.finish();
            }
        }
        if (equals) {
            Z0();
        }
        Y0().b(aVar.a);
        if (this.n.b() && (cVar = aVar.b) != null) {
            if (cVar instanceof x89.c.C3983c) {
                x89.c.C3983c c3983c = (x89.c.C3983c) cVar;
                cn cnVar = c3983c.b;
                og0 og0Var = c3983c.c;
                String str2 = (String) og0Var.b;
                if (str2 == null) {
                    str2 = (String) og0Var.c;
                }
                aiu Y02 = Y0();
                Y02.getClass();
                Y02.d(new k8(18, cnVar, str2));
            } else if (cVar instanceof x89.c.b) {
                aiu Y03 = Y0();
                Group group = ((x89.c.b) cVar).b;
                Y03.getClass();
                Y03.d(new qcl(group, 19));
            } else {
                if (!(cVar instanceof x89.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aiu Y04 = Y0();
                String str3 = ((x89.c.a) cVar).a;
                Y04.getClass();
                Y04.d(new r6g(str3, 1));
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final aiu Y0() {
        return (aiu) this.r.getValue();
    }

    public final void Z0() {
        Y0().c();
    }

    public final void a1() {
        io.reactivex.rxjava3.core.x B;
        boolean b = this.n.b();
        w89 w89Var = this.j;
        String str = this.k;
        if (b) {
            io.reactivex.rxjava3.internal.operators.single.r c = w89Var.c(str);
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.c0.getClass();
            B = io.reactivex.rxjava3.core.x.B(c, io.reactivex.rxjava3.core.x.j(q39.e.b()), new z7(whu.b, 27));
        } else {
            B = io.reactivex.rxjava3.core.x.B(w89Var.c(str), io.reactivex.rxjava3.core.x.k(EmptyList.b), new ggz0(vhu.b));
        }
        I0(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.n(B, new tf1(new h6g(this, 22), 24)).l(new w7(new h2s(this, 4), 23)).m(asu0.a.d()), new oce(this, 28), new fre(this, 27)));
    }
}
