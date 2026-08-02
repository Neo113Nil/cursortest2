package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.CircularProgressView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.cwb0;
import xsna.kcb;
import xsna.pua;
import xsna.vwb;
import xsna.xwb;

/* compiled from: ChannelSettingsComponent.kt */
/* loaded from: classes16.dex */
public final class ecb extends j8i implements xwb.a, kcb.a.InterfaceC3174a {
    public final qcb i;
    public final rcb j;
    public final pua k;
    public final mcb l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final lxa n;
    public Channel o;
    public ImageList p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;

    public ecb(qcb qcbVar, kkm kkmVar, a1w a1wVar, mxv mxvVar, bc6 bc6Var, long j) {
        ucp ucpVar = ucp.a;
        this.i = qcbVar;
        this.j = new rcb(this, kkmVar);
        pua puaVar = new pua(j, bc6Var, this, a1wVar, mxvVar);
        I0(puaVar.f);
        this.k = puaVar;
        mcb mcbVar = new mcb(j, a1wVar, this);
        I0(mcbVar.d);
        this.l = mcbVar;
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.n = new lxa(j, a1wVar);
        this.p = new ImageList(null, 1, null);
        this.q = "";
        this.r = "";
    }

    public static void Y0(ecb ecbVar, Throwable th) {
        rcb rcbVar = ecbVar.j;
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.s() == 100 && epx.f(vKApiExecutionException.g(), "groups.edit")) {
                NotifyId notifyId = NotifyId.CHANNEL_INVALID_TITLE;
                rcbVar.getClass();
                zk70.c(notifyId);
                return;
            }
        }
        if (th != null) {
            rcbVar.getClass();
            zk70.e(th);
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        rcb rcbVar = this.j;
        View a = rcbVar.a(layoutInflater, viewGroup);
        if (bundle != null) {
            a1();
        }
        RecyclerView recyclerView = rcbVar.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.j(recyclerView);
        CircularProgressView circularProgressView = rcbVar.l;
        (circularProgressView != null ? circularProgressView : null).setVisibility(0);
        io.reactivex.rxjava3.internal.operators.observable.y yVar = this.n.e;
        yVar.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.t(new io.reactivex.rxjava3.internal.operators.maybe.v(new io.reactivex.rxjava3.internal.operators.observable.e0(yVar)), new wx40(new yka0(io.reactivex.rxjava3.android.schedulers.a.b(), 9), 5)).subscribe(new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 23), 13), new ia(new com.vk.movika.sdk.base.logic.interactor.f(7), 10));
        io.reactivex.rxjava3.disposables.b bVar = this.m;
        bVar.b(subscribe);
        bVar.b(ktr.c(yVar).subscribe(new zl0(new ka(this, 16), 7), new j50(new am0(18), 9)));
        return a;
    }

    @Override // xsna.j8i
    public final void M0() {
        this.n.destroy();
        this.m.dispose();
    }

    @Override // xsna.j8i
    public final void N0() {
        this.j.j();
    }

    @Override // xsna.xwb.a
    public final void O(AvatarAction avatarAction) {
        boolean z;
        Activity activity;
        boolean z2;
        pua puaVar = this.k;
        Context context = puaVar.b.a;
        int i = pua.a.$EnumSwitchMapping$0[avatarAction.ordinal()];
        if (i == 1) {
            while (true) {
                z = context instanceof FragmentActivity;
                if (z || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            activity = z ? (Activity) context : null;
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, (FragmentActivity) activity, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new kd(puaVar, 15), null, 96);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            hg1.d(puaVar.g);
            return;
        }
        while (true) {
            z2 = context instanceof FragmentActivity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        activity = z2 ? (Activity) context : null;
        PermissionHelper permissionHelper2 = PermissionHelper.a;
        permissionHelper2.getClass();
        PermissionHelper.h(permissionHelper2, (FragmentActivity) activity, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, new ld(puaVar, 15), null, 96);
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        a1();
    }

    @Override // xsna.kcb.a.InterfaceC3174a
    public final void R(boolean z) {
        this.s = z;
        Z0();
    }

    public final boolean X0() {
        Channel channel;
        if (drm0.N(this.q)) {
            return false;
        }
        String str = this.q;
        Channel channel2 = this.o;
        if (!epx.f(str, channel2 != null ? channel2.d : null)) {
            return true;
        }
        String str2 = this.r;
        Channel channel3 = this.o;
        return (epx.f(str2, channel3 != null ? channel3.v : null) && (channel = this.o) != null && this.s == channel.w) ? false : true;
    }

    public final void Z0() {
        boolean X0 = X0();
        qcb qcbVar = this.i;
        rcb rcbVar = this.j;
        if (X0) {
            rcbVar.k();
            qcbVar.Yn(false);
        } else {
            rcbVar.e();
            qcbVar.Yn(true);
        }
    }

    public final void a1() {
        List<? extends hfz> singletonList = Collections.singletonList(new vwb.a(this.q, this.r, this.s, !this.t, this.p));
        rcb rcbVar = this.j;
        RecyclerView recyclerView = rcbVar.k;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        CircularProgressView circularProgressView = rcbVar.l;
        if (circularProgressView == null) {
            circularProgressView = null;
        }
        f4m.j(circularProgressView);
        qwb qwbVar = rcbVar.e;
        (qwbVar != null ? qwbVar : null).setItems(singletonList);
    }

    @Override // xsna.xwb.a
    public final void b0() {
        rcb rcbVar = this.j;
        bzb0 bzb0Var = rcbVar.f;
        if (bzb0Var != null) {
            bzb0.d(bzb0Var, cwb0.h.l, new com.vk.movika.sdk.base.model.b(rcbVar, 14), null, null, 28);
        }
    }

    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void f() {
        pua puaVar = this.k;
        puaVar.getClass();
        ArrayList w0 = rl3.w0(AvatarAction.values());
        w0.remove(AvatarAction.REMOVE);
        w0.remove(AvatarAction.CHANGE_BY_MINI_APP);
        rcb rcbVar = puaVar.c.j;
        bzb0 bzb0Var = rcbVar.f;
        if (bzb0Var != null) {
            bzb0Var.b(new cwb0.e(w0, cwb0.c1.b.a), new tm0(rcbVar, 20), null);
        }
    }

    @Override // xsna.hzb, xsna.kcb.a.InterfaceC3174a
    public final void g(String str) {
        this.q = str;
        Z0();
    }

    @Override // xsna.xwb.a
    public final void n() {
        String str = this.q;
        String str2 = this.r;
        boolean z = this.s;
        mcb mcbVar = this.l;
        mcbVar.getClass();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        io.reactivex.rxjava3.internal.operators.single.c C = mcbVar.b.C("ecb", new mpu(Peer.a.c(-mcbVar.a), str, str2, Boolean.valueOf(z)));
        asu0 asu0Var = asu0.a;
        int i = 4;
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(C.q(asu0Var.c()).m(asu0Var.d()), new pf1(new fm0(mcbVar, 15), i)), new lcb(mcbVar, 0)).subscribe(new np3(new sa(mcbVar, 19), i), new pp3(new m7(mcbVar, 24), 6));
        mcbVar.d.b(subscribe);
        mcbVar.e = subscribe;
    }

    @Override // xsna.xwb.a
    public final void o() {
        boolean X0 = X0();
        rcb rcbVar = this.j;
        if (X0) {
            bzb0 bzb0Var = rcbVar.f;
            if (bzb0Var != null) {
                bzb0.d(bzb0Var, e1h0.l, new ic(rcbVar, 18), new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(rcbVar, 20), null, 24);
                return;
            }
            return;
        }
        rcbVar.d();
        qcb qcbVar = this.i;
        qcbVar.Yn(true);
        qcbVar.hide();
    }

    @Override // xsna.xwb.a
    public final void p(AvatarAction avatarAction) {
        this.k.a();
    }

    @Override // xsna.kcb.a.InterfaceC3174a
    public final void q0(String str) {
        this.r = str;
        Z0();
    }

    @Override // xsna.xwb.a
    public final void y() {
        io.reactivex.rxjava3.disposables.c cVar = this.l.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.k.a();
        this.j.d();
        qcb qcbVar = this.i;
        qcbVar.Yn(true);
        qcbVar.hide();
    }

    @Override // xsna.xwb.a
    public final void Z(ph90 ph90Var) {
    }

    @Override // xsna.xwb.a
    public final void b(vwb.c cVar) {
    }

    @Override // xsna.xwb.a
    public final void h(vwb.b bVar) {
    }

    @Override // xsna.xwb.a
    public final void J(ph90 ph90Var, int i) {
    }
}
