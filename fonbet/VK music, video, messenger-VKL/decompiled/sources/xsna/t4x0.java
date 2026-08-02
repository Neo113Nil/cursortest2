package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import xsna.e8j;
import xsna.il90;

/* compiled from: VoipViewModelContactCallsDelegate.kt */
/* loaded from: classes7.dex */
public final class t4x0 implements f8j, il90 {
    public final com.vk.voip.b b;
    public final d8j c;
    public final io.reactivex.rxjava3.subjects.f<e8j> d = new io.reactivex.rxjava3.subjects.f<>();

    public t4x0(com.vk.voip.b bVar, d8j d8jVar) {
        this.b = bVar;
        this.c = d8jVar;
    }

    public final boolean a() {
        ContactCallManager contactCallManager = this.b.getContactCallManager();
        return contactCallManager != null && contactCallManager.getIAmAnonymous();
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y b(boolean z) {
        io.reactivex.rxjava3.core.q U = this.d.U(new i3u(new ptl0(this, 25), 28));
        if (z) {
            U = U.o0(new io.reactivex.rxjava3.internal.operators.single.v(new q9e(this, 2)));
        }
        U.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(U, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        xmw0 xmw0Var;
        Collection values = cVar.c.values();
        com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
        dhw0 L = cVar2.L();
        String str = (L == null || (xmw0Var = L.C) == null) ? null : xmw0Var.a;
        dhw0 L2 = cVar2.L();
        if (L2 == null || L2.C == null) {
            return;
        }
        Collection collection = values;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (epx.f(((CallMemberId) it.next()).b, str)) {
                com.vk.voip.ui.c cVar3 = com.vk.voip.ui.c.b;
                dhw0 L3 = cVar3.L();
                cVar3.X0(L3 != null ? dhw0.a(L3, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -268435457, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null);
                return;
            }
        }
    }

    @Override // xsna.f8j
    public final void onContactCallMyAnonChanged() {
        ContactCallManager contactCallManager = this.b.getContactCallManager();
        if (contactCallManager == null || !contactCallManager.getIWasInitiallyAnonymous() || contactCallManager.getIAmAnonymous()) {
            return;
        }
        this.c.b.O();
        this.d.onNext(new e8j.a(a()));
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
    }
}
