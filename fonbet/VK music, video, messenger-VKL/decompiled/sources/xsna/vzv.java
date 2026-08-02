package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.a;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import java.util.ArrayList;
import java.util.List;
import xsna.dw20;

/* compiled from: ImContactsSelectBottomSheet.kt */
/* loaded from: classes2.dex */
public final class vzv {
    public final Context a;
    public final ArrayList b;
    public final String c;
    public final fre d;
    public dw20 e;

    public vzv(Context context, ArrayList arrayList, String str, fre freVar) {
        this.a = context;
        this.b = arrayList;
        this.c = str;
        this.d = freVar;
    }

    public final void a() {
        a1w a1wVar = q1w.a;
        a1w a1wVar2 = a1wVar != null ? a1wVar : null;
        mxv c = g2v.c();
        a1w a1wVar3 = q1w.a;
        if (a1wVar3 == null) {
            a1wVar3 = null;
        }
        com.vk.im.ui.components.contacts.a aVar = new com.vk.im.ui.components.contacts.a(a1wVar2, c, a1wVar3.r().h, xa4.L(this.a), new a(), rl3.y0(new ContactsViews[]{ContactsViews.CONTACTS, ContactsViews.USERS}), false, false, new l2k(this, 19), SortOrder.BY_NAME, 0, false, 0, null, null, null, false, false, true, null, null, null, null, false, false, false, 2145643136);
        this.e = new dw20.b(this.a, null).w0(this.c).D0(aVar.D0(this.a, null, null, null), false).e0(new som0(aVar)).a0(new m2j(aVar, 18)).I0("ImContactsSelectBottomSheet");
    }

    /* compiled from: ImContactsSelectBottomSheet.kt */
    public final class a implements a.InterfaceC1144a {
        public a() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final boolean h(qtd0 qtd0Var) {
            return true;
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void k(int i, List list) {
            if (list.isEmpty()) {
                return;
            }
            qtd0 qtd0Var = (qtd0) j5g.Y(list);
            vzv vzvVar = vzv.this;
            vzvVar.d.invoke(qtd0Var);
            dw20 dw20Var = vzvVar.e;
            if (dw20Var != null) {
                dw20Var.tn();
            }
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void c() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void f() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void g() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void j() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void l() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void m() {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void a(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void b(q2a0 q2a0Var) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void d(boolean z) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void e(Peer peer) {
        }

        @Override // com.vk.im.ui.components.contacts.a.InterfaceC1144a
        public final void i(qtd0 qtd0Var) {
        }
    }
}
