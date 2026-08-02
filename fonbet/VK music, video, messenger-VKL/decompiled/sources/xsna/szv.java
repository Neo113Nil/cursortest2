package xsna;

import android.content.Context;
import com.vk.contacts.AndroidContact;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.im.ui.fragments.PhonebookContactFragment;
import java.util.Collections;

/* compiled from: ImContactsBridge.kt */
/* loaded from: classes2.dex */
public interface szv {
    static /* synthetic */ void a(szv szvVar, Context context, ContactsPermissionMessage contactsPermissionMessage, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, int i) {
        gzs gzsVar4;
        szv szvVar2;
        Context context2;
        gzs gzsVar5;
        if ((i & 2) != 0) {
            contactsPermissionMessage = ContactsPermissionMessage.DEFAULT;
        }
        ContactsPermissionMessage contactsPermissionMessage2 = contactsPermissionMessage;
        gzs gzsVar6 = (i & 8) != 0 ? null : gzsVar2;
        if ((i & 16) != 0) {
            gzsVar4 = null;
            context2 = context;
            gzsVar5 = gzsVar;
            szvVar2 = szvVar;
        } else {
            gzsVar4 = gzsVar3;
            szvVar2 = szvVar;
            context2 = context;
            gzsVar5 = gzsVar;
        }
        szvVar2.d(context2, contactsPermissionMessage2, gzsVar5, gzsVar6, gzsVar4);
    }

    default boolean b(Context context) {
        return enj.l(context, "android.permission.READ_CONTACTS") && com.vk.contacts.d.a.H0();
    }

    default io.reactivex.rxjava3.internal.operators.observable.y c(Context context) {
        return new io.reactivex.rxjava3.internal.operators.observable.y(com.vk.contacts.d.a.a().U(new e40(new nm1(14, this, context), 16)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    default void d(Context context, ContactsPermissionMessage contactsPermissionMessage, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3) {
        com.vk.contacts.d.a.N0(context, false, contactsPermissionMessage, gzsVar2, new rzv(0, gzsVar3), gzsVar);
    }

    default io.reactivex.rxjava3.internal.operators.observable.j1 f() {
        return com.vk.contacts.d.a.a().b0(fbj.class).U(new y34(new d8w0(1), 21));
    }

    default void g(Context context, q2a0 q2a0Var) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        PhonebookContactFragment.a aVar = new PhonebookContactFragment.a(PhonebookContactFragment.class, null, null);
        AndroidContact androidContact = q2a0Var instanceof com.vk.im.engine.models.contacts.a ? ((com.vk.im.engine.models.contacts.a) q2a0Var).b : new AndroidContact(null, q2a0Var.name(), false, Collections.singleton(q2a0Var.c5()), null, null, 49, null);
        int i = PhonebookContactFragment.S;
        aVar.j.putParcelable("android_contact", androidContact);
        aVar.s(true);
        aVar.k(context);
    }

    default boolean h() {
        return false;
    }

    default void i() {
    }

    default void e(u90 u90Var, String str) {
    }
}
