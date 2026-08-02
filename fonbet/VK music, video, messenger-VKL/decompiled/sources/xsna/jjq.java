package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.viewcontrollers.msg_list.OverscrollBehavior;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.a2o;
import xsna.vg30;

/* compiled from: FakeChatComponent.kt */
/* loaded from: classes2.dex */
public final class jjq extends j8i {
    public final jbs i;
    public final a1w j;
    public final lzv k;
    public final kkm l;
    public final Context m;
    public vm30 n;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public final tk30 q;
    public List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> r;

    public jjq(jbs jbsVar, a1w a1wVar, lzv lzvVar, kkm kkmVar) {
        this.i = jbsVar;
        this.j = a1wVar;
        this.k = lzvVar;
        this.l = kkmVar;
        FragmentActivity kn = jbsVar.a.kn();
        this.m = kn;
        Context context = e43.a;
        this.q = new tk30(new com.vk.movika.sdk.android.defaultplayer.layout.a(context == null ? null : context), null, new tz30(kn.getApplicationContext()), new com.vk.im.ui.formatters.a(kn.getApplicationContext()), null, new v1o(kn, a2o.a.a.getSTUB()), null, 934);
        this.r = new ArrayList();
        new ProfilesInfo();
        new Dialog();
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        FragmentActivity kn = this.i.a.kn();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(kn);
        zdw zdwVar = i7o0.b;
        zdw zdwVar2 = zdwVar != null ? zdwVar : null;
        if (zdwVar == null) {
            zdwVar = null;
        }
        j3f0 e = zdwVar.e();
        a1w a1wVar = this.j;
        hbw h2 = e != null ? e.h(a1wVar) : null;
        zdw zdwVar3 = i7o0.b;
        if (zdwVar3 == null) {
            zdwVar3 = null;
        }
        j3f0 e2 = zdwVar3.e();
        v1f0 f = e2 != null ? e2.f(a1wVar) : null;
        zdw zdwVar4 = i7o0.b;
        if (zdwVar4 == null) {
            zdwVar4 = null;
        }
        j3f0 e3 = zdwVar4.e();
        xyt e4 = e3 != null ? e3.e(a1wVar) : null;
        a1wVar.getClass();
        int i = 16;
        this.n = new vm30(h, layoutInflater, viewGroup, null, false, false, zdwVar2, null, new q9(a1wVar, i), this.l, h2, f, e4, vg30.a.a, null, null, null, null, null, null, null, false, null, false, false, false, null, 134201480);
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        this.o = this.l.c.a0(asu0.a.d()).subscribe(new qs2(new l2i(this, 7), 14));
        vm30 vm30Var = this.n;
        if (vm30Var == null) {
            vm30Var = null;
        }
        Context context = this.m;
        vm30Var.v(new MsgListEmptyViewState.b(null, context.getString(R.string.vkim_msg_list_empty), context.getString(R.string.vkim_pinned_msg_not_found), null, 24));
        vm30 vm30Var2 = this.n;
        if (vm30Var2 == null) {
            vm30Var2 = null;
        }
        vm30Var2.I.L(true);
        vm30 vm30Var3 = this.n;
        if (vm30Var3 == null) {
            vm30Var3 = null;
        }
        vm30Var3.z(false);
        vm30 vm30Var4 = this.n;
        if (vm30Var4 == null) {
            vm30Var4 = null;
        }
        if (true != vm30Var4.s0) {
            ViewGroup.LayoutParams layoutParams = vm30Var4.t.getLayoutParams();
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            if (fVar != null) {
                fVar.c(new OverscrollBehavior(true));
            }
            vm30Var4.s0 = true;
        }
        this.p = this.k.a("FakeChatComponent init chat", new nub(new gcl(a1wVar), Source.ACTUAL), new iu1(this, i), kwg0.b());
        vm30 vm30Var5 = this.n;
        return (vm30Var5 == null ? null : vm30Var5).t;
    }

    @Override // xsna.j8i
    public final void N0() {
        vm30 vm30Var = this.n;
        if (vm30Var == null) {
            vm30Var = null;
        }
        vm30Var.b();
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.o = null;
    }

    @Override // xsna.j8i
    public final void Q0() {
        vm30 vm30Var = this.n;
        if (vm30Var == null) {
            vm30Var = null;
        }
        vm30Var.N();
    }

    @Override // xsna.j8i
    public final void R0() {
        vm30 vm30Var = this.n;
        if (vm30Var == null) {
            vm30Var = null;
        }
        vm30Var.O();
    }

    public final void X0(List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list) {
        vm30 vm30Var = this.n;
        if (vm30Var == null) {
            vm30Var = null;
        }
        vm30.x(vm30Var, list, "updateHistory", 9);
        this.r = list;
    }
}
