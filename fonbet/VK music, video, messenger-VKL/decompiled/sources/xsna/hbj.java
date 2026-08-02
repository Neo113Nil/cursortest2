package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.Peer;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.jsm;

/* compiled from: ContactsInteractorImpl.kt */
/* loaded from: classes18.dex */
public final class hbj implements jsm.a {
    public final a1w a;
    public final mxv b;
    public final b25 c;

    public hbj(a1w a1wVar, mxv mxvVar, b25 b25Var) {
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = b25Var;
    }

    @Override // xsna.jsm.a
    public final boolean a() {
        this.b.getClass();
        return k9u0.a.b(this.a.r().a.a);
    }

    @Override // xsna.jsm.a
    public final io.reactivex.rxjava3.internal.operators.single.f0 b(Context context) {
        return new io.reactivex.rxjava3.internal.operators.single.b(new mv8(this, context)).q(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.jsm.a
    public final boolean c() {
        a1w a1wVar = this.a;
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            return false;
        }
        b25 b25Var = this.c;
        return !o25.b(b25Var) || b25Var.i().S;
    }

    @Override // xsna.jsm.a
    public final void d(Context context) {
        this.b.getClass();
        bc6 L = xa4.L(context);
        ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
        ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
        Bundle bundle = aVar.j;
        bundle.putSerializable("factory", contactsListFactory);
        aVar.s(true);
        aVar.y(R.attr.im_ic_back_toolbar);
        bundle.putString("force_entry_point_for_new", null);
        bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
        aVar.m(L);
    }

    @Override // xsna.jsm.a
    public final io.reactivex.rxjava3.internal.operators.single.y e() {
        this.b.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(k9u0.a.f().r0(asu0.a.d()).y0(500L, TimeUnit.MILLISECONDS), new z7(new pt(23), 19)).J(0).l(new b8(new py(19), 17));
    }
}
