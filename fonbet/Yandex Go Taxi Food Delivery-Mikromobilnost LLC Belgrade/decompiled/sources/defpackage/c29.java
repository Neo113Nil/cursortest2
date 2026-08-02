package defpackage;

import android.content.res.Resources;
import com.yandex.go.chargers.debt.data.ChargersDebtApi;
import com.yandex.go.chargers.debt.screen.data.model.ChargersDebtPayOffParams;
import com.yandex.go.chargers.debt.screen.data.model.ChargersPaymentMethod;
import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.chargers.offer.data.api.ChargersOfferKeyDto;
import com.yandex.go.chargers.offer.ui.compose.e;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.a;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.factory.CitySuggestDialogModalView;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.net.Error;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.cashback.router.c;
import ru.yandex.taxi.plus.badge.CashbackBackgroundView;

/* loaded from: classes15.dex */
public final class c29 implements wyt, mmd0, wda, f3u, fo3, k8b, t030, lb6, wwc {
    public final /* synthetic */ int a;
    public final Object b;

    public c29(vwc vwcVar) {
        this.a = 28;
        this.b = vwcVar;
        awu awuVar = vwcVar.x;
        if (awuVar != null) {
            awuVar.cancel();
            vwcVar.x = null;
        }
        vwcVar.o();
    }

    @Override // defpackage.wyt
    public Resources C() {
        return ((CashbackBackgroundView) this.b).getResources();
    }

    @Override // defpackage.f3u
    public Iterator D() {
        return ((ListBuilder) this.b).listIterator(0);
    }

    @Override // defpackage.t030
    public boolean H() {
        return false;
    }

    @Override // defpackage.wda
    public void a(uda udaVar) {
        ((ChargersMultiOrderModalView) this.b).onTabChanged(udaVar);
    }

    public void b(wib wibVar, io9 io9Var) {
        k kVar = (k) this.b;
        fnb fnbVar = kVar.a;
        if (wibVar instanceof nib) {
            ((a) io9Var.a).r(new qu(9));
            return;
        }
        if (wibVar instanceof pib) {
            pib pibVar = (pib) wibVar;
            String str = pibVar.a;
            int i = pibVar.b;
            fnbVar.d(new bo21(str, i));
            kVar.l(new qlc(str, i));
            return;
        }
        if (wibVar instanceof vib) {
            vib vibVar = (vib) wibVar;
            String str2 = vibVar.a;
            boolean z = vibVar.b;
            fnbVar.d(new ao21(str2, z));
            kVar.l(new hlc(str2, z));
            return;
        }
        if (wibVar instanceof sib) {
            sib sibVar = (sib) wibVar;
            qlj qljVar = sibVar.a;
            clq0 clq0Var = sibVar.c;
            a aVar = (a) io9Var.a;
            aVar.A((m950) aVar.H.getValue(), new vlj(qljVar, clq0Var), new gmb(aVar, qljVar));
            return;
        }
        if (wibVar instanceof tib) {
            tib tibVar = (tib) wibVar;
            khu0 khu0Var = tibVar.a;
            clq0 clq0Var2 = tibVar.c;
            a aVar2 = (a) io9Var.a;
            aVar2.A((m950) aVar2.I.getValue(), new mhu0(khu0Var, clq0Var2), new hmb(aVar2, khu0Var));
            return;
        }
        if (wibVar instanceof oib) {
            kVar.e(((oib) wibVar).a);
            return;
        }
        if (!(wibVar instanceof uib)) {
            if (!(wibVar instanceof qib)) {
                if (jl40.l(wibVar, rib.a)) {
                    return;
                }
                w511.b();
                return;
            } else {
                String str3 = ((qib) wibVar).a;
                ((a60) ((y50) ((a) io9Var.a).N.a.get())).c(str3, v770.b);
                return;
            }
        }
        zlb zlbVar = ((uib) wibVar).a;
        if (zlbVar instanceof slb) {
            kVar.e(((slb) zlbVar).a);
            return;
        }
        if (zlbVar instanceof tlb) {
            kVar.f(((tlb) zlbVar).a);
            return;
        }
        if (zlbVar instanceof ulb) {
            kVar.j(((ulb) zlbVar).a);
            return;
        }
        if (zlbVar instanceof vlb) {
            kVar.g(((vlb) zlbVar).a);
            return;
        }
        if (zlbVar instanceof xlb) {
            kVar.i(((xlb) zlbVar).a);
            return;
        }
        if (zlbVar instanceof ylb) {
            ylb ylbVar = (ylb) zlbVar;
            kVar.k(ylbVar.a, ylbVar.b);
        } else {
            if (zlbVar instanceof wlb) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.k8b
    public Object c(ExistingChat existingChat) {
        String a = h9b.a((h9b) this.b, existingChat.id());
        if (a != null) {
            return p8b.a(a);
        }
        return null;
    }

    @Override // defpackage.t030
    public void collapse() {
    }

    public void d(String str, tsa tsaVar, ir9 ir9Var) {
        u7a u7aVar = (u7a) this.b;
        u7aVar.A((m950) u7aVar.R.get(), new hw9(ChargersDiscountsListEntryPoint.OFFER, str, tsaVar, ir9Var, null, null, null, 112), new e(u7aVar));
    }

    @Override // defpackage.t030
    public void dismissWithAction(Runnable runnable) {
    }

    @Override // defpackage.lb6
    public void e(int i) {
        sqc sqcVar = (sqc) this.b;
        sqcVar.c0(i, sqcVar.P0, sqcVar.Q0, sqcVar.R0);
    }

    @Override // defpackage.t030
    public void expand() {
    }

    public Object f(String str, m6a0 m6a0Var, Continuation continuation) {
        return ((ChargersDebtApi) ((h3y) this.b).get()).a(new ChargersDebtPayOffParams(str, new ChargersPaymentMethod(m6a0Var.b))).a(continuation);
    }

    @Override // defpackage.fo3
    public void g(Error error) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                ((u1b) ((c29) obj).b).g(error);
                break;
            default:
                ((c8b) obj).g = false;
                break;
        }
    }

    @Override // defpackage.wyt
    public int getPaddingTop() {
        return ((CashbackBackgroundView) this.b).getPaddingTop();
    }

    @Override // defpackage.wyt
    public int getWidth() {
        return ((CashbackBackgroundView) this.b).getWidth();
    }

    @Override // defpackage.fo3
    public void h(ChatData chatData, UserData userData) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                ((u1b) ((c29) obj).b).h(chatData, null);
                return;
            default:
                c8b c8bVar = (c8b) obj;
                kse.a(c8bVar.a);
                l020 C = c8bVar.b.C();
                try {
                    C.I(chatData);
                    C.s();
                    C.close();
                    c8bVar.g = false;
                    return;
                } finally {
                }
        }
    }

    @Override // defpackage.wwc
    public wwc i(boolean z) {
        return new c29((vwc) this.b);
    }

    @Override // defpackage.t030
    public boolean isCollapsed() {
        return ((CitySuggestDialogModalView) this.b).isCollapsed();
    }

    @Override // defpackage.t030
    public boolean isExpanded() {
        return ((CitySuggestDialogModalView) this.b).isExpanded();
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object j(CreateChannel createChannel) {
        return null;
    }

    @Override // defpackage.k8b
    public Object k(InviteThread inviteThread) {
        return inviteThread.parent();
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object m(InviteChat inviteChat) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object n(StaffChat staffChat) {
        return null;
    }

    @Override // defpackage.mmd0
    public void openUrl(String str) {
        ((oqd0) ((a46) this.b).K).b(str, false, true);
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object p(ChatAlias chatAlias) {
        return null;
    }

    @Override // defpackage.f3u
    public Object q(Object obj) {
        return (ChargersOfferKeyDto) obj;
    }

    @Override // defpackage.mmd0
    public void r() {
        ((c) ((s3d0) ((a46) this.b).L).d.getValue()).i();
    }

    @Override // defpackage.k8b
    public Object t(ThreadChat threadChat) {
        return threadChat.parent();
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object u(CreateFamilyChat createFamilyChat) {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object v() {
        return null;
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object w(CreateGroupChat createGroupChat) {
        return null;
    }

    @Override // defpackage.mmd0
    public void x(String str) {
        ((a46) this.b).r(new h0(str, 26));
    }

    @Override // defpackage.mmd0
    public void y() {
        ((a46) this.b).r(new qu(9));
    }

    @Override // defpackage.k8b
    public /* bridge */ /* synthetic */ Object z(PrivateChat privateChat) {
        return null;
    }

    public /* synthetic */ c29(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
