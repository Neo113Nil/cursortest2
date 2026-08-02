package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.hints.HintId;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vkontakte.android.R;

/* compiled from: VkAppContactsBridge.kt */
/* loaded from: classes7.dex */
public final class k9u0 implements szv {
    public static final k9u0 a = new k9u0();

    @Override // xsna.szv
    public final void e(u90 u90Var, String str) {
        ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
        ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
        Bundle bundle = aVar.j;
        bundle.putSerializable("factory", contactsListFactory);
        aVar.s(true);
        aVar.y(R.attr.im_ic_back_toolbar);
        bundle.putString("force_entry_point_for_new", str);
        bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
        aVar.m(u90Var);
    }

    @Override // xsna.szv
    public final boolean h() {
        return pla.e().b().p(HintId.IM_CONTACTS_PROMO_SCREEN.getId()) != null;
    }

    @Override // xsna.szv
    public final void i() {
        pla.e().b().b(HintId.IM_CONTACTS_PROMO_SCREEN.getId());
    }

    public final Intent j(Context context) {
        ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
        ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
        Bundle bundle = aVar.j;
        bundle.putSerializable("factory", contactsListFactory);
        aVar.s(true);
        aVar.y(R.attr.im_ic_back_toolbar);
        bundle.putString("force_entry_point_for_new", "message_new_contact_push");
        bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
        return aVar.n(context);
    }
}
