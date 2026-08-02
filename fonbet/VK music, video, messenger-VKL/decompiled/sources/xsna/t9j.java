package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.contacts.ContactsManager;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c5v0;
import xsna.tlo0;

/* compiled from: ContactSyncColdStartModalImpl.kt */
/* loaded from: classes17.dex */
public final class t9j implements q9j {
    public final mxv a;
    public final ContactsManager b;

    public t9j(mxv mxvVar, ContactsManager contactsManager, u9j u9jVar) {
        this.a = mxvVar;
        this.b = contactsManager;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, xsna.dw20] */
    @Override // xsna.q9j
    public final void a(final Activity activity, final z9j z9jVar, final aaj aajVar, final baj bajVar) {
        boolean z;
        final Ref$ObjectRef ref$ObjectRef;
        c5v0.a.C2643a c2643a;
        boolean z2;
        PermissionHelper.a.getClass();
        if (PermissionHelper.n(activity)) {
            Context context = activity;
            while (true) {
                z2 = context instanceof FragmentActivity;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            FragmentActivity fragmentActivity = (FragmentActivity) (z2 ? (Activity) context : null);
            if ((fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null) == null) {
                bajVar.invoke();
                return;
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_SHOW, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.Reason.ALREADY_SYNCED));
            ref$ObjectRef2.element = new VkModal(VkModal.Mode.Card, new b.a.C0790b(new c5v0.c.b(new gko(R.drawable.vk_icon_illustration_messanger_phone_bubbles_120h), null, null, 12), new c5v0.b(12, tq.h(tlo0.Companion, R.string.sync_contacts_bottom_sheet_share_link_title), new tlo0.f(R.string.sync_contacts_bottom_sheet_share_link_subtitle)), null, new c5v0.a(new c5v0.a.C2643a(new tlo0.f(R.string.sync_contacts_bottom_sheet_share_link_btn_approve), new defpackage.d0(this, ref$ObjectRef2, activity, z9jVar), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 2), 20), new enh(bajVar, 3), false, 20).b(activity, "tag_contacts_sync_cold_start");
            return;
        }
        Context context2 = activity;
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        final FragmentActivity fragmentActivity2 = (FragmentActivity) (z ? (Activity) context2 : null);
        if ((fragmentActivity2 != null ? fragmentActivity2.getSupportFragmentManager() : null) == null) {
            u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_SHOW, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.Reason.NO_SYNC));
            this.b.P0(activity, false, new og1(this, activity, z9jVar, r5), new r9(this, aajVar));
            return;
        }
        PermissionHelper.a.getClass();
        r5 = PermissionHelper.p(fragmentActivity2, PermissionHelper.y) != PermissionHelper.PermissionResult.DONT_ASK_AGAIN ? 0 : 1;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        u9j.a(new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.EventType.MODAL_SYNC_CONTACTS_SHOW, MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction.Reason.NO_SYNC));
        VkModal.Mode mode = VkModal.Mode.Card;
        TypedValue typedValue = krv0.a;
        c5v0.c.b bVar = new c5v0.c.b(new gko(epx.f(krv0.i(activity), Boolean.TRUE) ? R.drawable.vk_icon_illustration_messenger_users_add_dark_160h : R.drawable.vk_icon_illustration_messenger_users_add_light_160h), null, null, 12);
        c5v0.b bVar2 = new c5v0.b(12, tq.h(tlo0.Companion, R.string.sync_contacts_bottom_sheet_title), new tlo0.f(R.string.sync_contacts_bottom_sheet_subtitle));
        if (r5 != 0) {
            ref$ObjectRef = ref$ObjectRef3;
            c2643a = new c5v0.a.C2643a(new tlo0.f(R.string.vk_permissions_open_settings), new defpackage.g0(this, fragmentActivity2, ref$ObjectRef3, bajVar), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED);
        } else {
            ref$ObjectRef = ref$ObjectRef3;
            c2643a = new c5v0.a.C2643a(new tlo0.f(R.string.sync_contacts_bottom_sheet_btn_approve), new gzs() { // from class: xsna.r9j
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.gzs
                public final Object invoke() {
                    UiTracker uiTracker = UiTracker.a;
                    new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalClick.EventType.MODAL_SYNC_CONTACTS_IMPORT_CONTACTS_CLICK), 2)).q();
                    dw20 dw20Var = (dw20) ref$ObjectRef.element;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                    t9j t9jVar = t9j.this;
                    t9jVar.b.N0(fragmentActivity2, false, ContactsPermissionMessage.DEFAULT, new m2j(bajVar, 1), new lbe(t9jVar, aajVar), new s9j(t9jVar, activity, z9jVar, 0));
                    return s3q0.a;
                }
            }, null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED);
        }
        ref$ObjectRef.element = new VkModal(mode, new b.a.C0790b(bVar, bVar2, null, new c5v0.a(c2643a, (c5v0.a.C2643a) null, 2), 20), new kbe(bajVar, 13), false, 20).b(activity, "tag_contacts_sync_cold_start");
    }

    public final void b(Activity activity, z9j z9jVar) {
        Future<ContactsManager.b> U0 = this.b.U0();
        asu0.a.getClass();
        asu0.n().execute(new or4(U0, this));
        try {
            this.a.getClass();
            bc6 L = xa4.L(activity);
            ContactsListFragmentRedesign.a aVar = new ContactsListFragmentRedesign.a();
            ContactsListFactory contactsListFactory = ContactsListFactory.CONTACTS_LIST_VKAPP;
            Bundle bundle = aVar.j;
            bundle.putSerializable("factory", contactsListFactory);
            aVar.s(true);
            aVar.y(R.attr.im_ic_back_toolbar);
            bundle.putString("force_entry_point_for_new", null);
            bundle.putString("force_entry_point_for_create_contact", "contact_list_vk_create_contact");
            aVar.m(L);
        } catch (Exception e) {
            L.j(e, "Failed to open contact list");
        }
        z9jVar.invoke();
    }
}
