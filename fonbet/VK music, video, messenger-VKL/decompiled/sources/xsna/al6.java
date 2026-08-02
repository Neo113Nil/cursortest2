package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.auth.AuthTarget;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.p66;
import xsna.pud0;

/* compiled from: BaseProfileCarouselPresenter.kt */
/* loaded from: classes15.dex */
public abstract class al6<V extends pud0> extends p66<V> implements oud0<V> {
    public final ArrayList x = new ArrayList();
    public final LongSparseArray<Integer> y = new LongSparseArray<>();
    public UserId z;

    public al6(Bundle bundle) {
        this.z = bundle != null ? (UserId) bundle.getParcelable("SELECTED_USER_ID") : null;
    }

    public boolean A0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B0(ArrayList arrayList) {
        int i;
        Object obj;
        UserId userId = this.z;
        ArrayList arrayList2 = this.x;
        if (userId != null) {
            Iterator it = j5g.W0(arrayList2).iterator();
            while (true) {
                ztw ztwVar = (ztw) it;
                if (!ztwVar.b.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = ztwVar.next();
                    if (epx.f(((UserItem) ((xtw) obj).b).b, userId)) {
                        break;
                    }
                }
            }
            xtw xtwVar = (xtw) obj;
            Integer valueOf = xtwVar != null ? Integer.valueOf(xtwVar.a) : null;
            if (valueOf != null) {
                i = valueOf.intValue();
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                if (!arrayList2.isEmpty()) {
                    bpn0 bpn0Var = t65.a;
                    g0 g0Var = new g0(this, 5);
                    epx.f(Looper.myLooper(), Looper.getMainLooper());
                    ((Handler) t65.a.getValue()).postDelayed(g0Var, 10L);
                    return;
                }
                if (i >= arrayList2.size()) {
                    i = e43.h(arrayList2);
                }
                this.z = ((UserItem) arrayList2.get(i)).b;
                pud0 pud0Var = (pud0) this.a;
                if (pud0Var != null) {
                    pud0Var.Yk(i, arrayList2);
                }
                pud0 pud0Var2 = (pud0) this.a;
                if (pud0Var2 != null) {
                    pud0Var2.U7(i, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((UserItem) it2.next()).c);
                }
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = xa4.H(j2q.a(arrayList3), 4, 1007).a0(io.reactivex.rxjava3.schedulers.a.b()).s0(new pi0(new com.vk.movika.sdk.base.observable.p(this, 12), 2)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                lz lzVar = new lz(new tb(this, 14), 6);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                int i2 = 9;
                this.t.b(mnh0.B(a0.E(lzVar, lVar, kVar, kVar), this.s, new mz(this, i2), new w8(this, i2), null));
                return;
            }
        }
        i = 0;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
        }
    }

    public abstract void C0();

    @Override // xsna.oud0
    public final void a() {
        if (BuildInfo.s()) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_SAVED_START, null, null, null, null, null, null, 254);
        }
        y0(AuthStatSender.Element.CONTINUE_BUTTON);
    }

    @Override // xsna.oud0
    public final void d0(int i, List list) {
        UserId userId = ((UserItem) list.get(i)).b;
        if (epx.f(userId, this.z)) {
            if (BuildInfo.s()) {
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.AUTH_SAVED_START, null, null, null, null, null, null, 254);
            }
            y0(AuthStatSender.Element.AVATAR_BUTTON);
        }
        this.z = userId;
        pud0 pud0Var = (pud0) this.a;
        if (pud0Var != null) {
            pud0Var.U7(i, list);
        }
    }

    @Override // xsna.p66
    public final void n0() {
        N();
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putParcelable("SELECTED_USER_ID", this.z);
    }

    public final void y0(AuthStatSender.Element element) {
        Object obj;
        Iterator it = this.x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((UserItem) obj).b, this.z)) {
                    break;
                }
            }
        }
        UserItem userItem = (UserItem) obj;
        if (userItem == null) {
            N();
        } else {
            z0(userItem, element);
        }
    }

    public void z0(UserItem userItem, AuthStatSender.Element element) {
        C0();
        SignUpDataHolder signUpDataHolder = this.p;
        VkAuthMetaInfo vkAuthMetaInfo = (signUpDataHolder != null ? signUpDataHolder : null).I;
        SilentAuthSource silentAuthSource = SilentAuthSource.FAST_LOGIN;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        VkAuthMetaInfo zb = VkAuthMetaInfo.zb(vkAuthMetaInfo, silentAuthSource, AuthTarget.a(signUpDataHolder.I.f, userItem.j, true, false, false, 28), null, 39);
        l55 l55Var = l55.a;
        String str = userItem.c;
        UserId userId = this.z;
        if (userId == null) {
            userId = UserId.d;
        }
        p66.r0(this, l55.e(l55Var, this.b, str, userId, zb, AuthByExchangeTokenInitiator.SILENT_AUTHORIZATION), new p66.a(), zb, 4);
        this.e.c(g0(), AuthStatSender.Status.EXCHANGE_LOGIN, element);
    }
}
