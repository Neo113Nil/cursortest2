package xsna;

import android.view.View;
import com.vk.contacts.ContactSyncState;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: NoContactsVh.kt */
/* loaded from: classes2.dex */
public final class o270 extends vfz<m270> {
    public final l270 l;
    public final VkPlaceholder m;

    /* compiled from: NoContactsVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactSyncState.values().length];
            try {
                iArr[ContactSyncState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactSyncState.PERMITTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactSyncState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactSyncState.SYNCING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContactSyncState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContactSyncState.UNSUPPORTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o270(View view, l270 l270Var) {
        super(view);
        this.l = l270Var;
        this.m = (VkPlaceholder) this.itemView.findViewById(R.id.no_contacts_placeholder);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(m270 m270Var) {
        int i;
        VkPlaceholder.b.c cVar;
        m270 m270Var2 = m270Var;
        Integer valueOf = Integer.valueOf(R.string.vkim_contacts_no_contacts);
        int i2 = a.$EnumSwitchMapping$0[m270Var2.b.ordinal()];
        boolean z = false;
        VkPlaceholder.a.b bVar = null;
        int i3 = R.string.vkim_contacts_allow_contacts_permission;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                i = R.string.vkim_contacts_no_contacts_at_all;
                i3 = R.string.vkim_contacts_add_contact;
                break;
            case 4:
                i = R.string.vkim_contacts_syncing;
                break;
            case 5:
                i = R.string.vkim_contact_request_permission_label_failed;
                i3 = R.string.vkim_contacts_sync_failed;
                z = true;
                break;
            case 6:
                i = R.string.vkim_contacts_empty_and_unsupported;
                valueOf = null;
                break;
            default:
                i = R.string.vkim_contacts_no_permission_label;
                z = true;
                break;
        }
        VkPlaceholder vkPlaceholder = this.m;
        vkPlaceholder.getContext();
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_users_outline_56), new x7g(R.attr.vk_ui_icon_accent), null, 12));
        if (valueOf != null) {
            cVar = new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, valueOf.intValue()));
        } else {
            cVar = null;
        }
        vkPlaceholder.setMiddle(new VkPlaceholder.b(cVar, new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, i))));
        if (z) {
            bVar = new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(i3), (gzs) new mh3(17, m270Var2, this), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), null, null, null, 8);
        }
        vkPlaceholder.setBottom(bVar);
    }
}
