package xsna;

import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vkontakte.android.R;

/* compiled from: ButtonItem.kt */
/* loaded from: classes2.dex */
public abstract class cq8 implements hfz {
    public final ContactsViews b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ButtonItem.kt */
    public static final class a extends cq8 {
        public static final a h = new a(ContactsViews.CREATE_CONTACT, R.string.vkim_create_contact, R.drawable.vk_icon_add_24, R.drawable.vk_icon_add_24, 0, false, 112);
    }

    /* compiled from: ButtonItem.kt */
    public static final class b extends cq8 {
    }

    /* compiled from: ButtonItem.kt */
    public static final class c extends cq8 {
        public static final c h = new c(ContactsViews.CREATE_CALL, R.string.vkim_create_call, R.drawable.vk_icon_phone_outline_28, R.drawable.vk_icon_phone_outline_28, 0, false, 112);
    }

    /* compiled from: ButtonItem.kt */
    public static final class d extends cq8 {
        public static final d h = new d(ContactsViews.CREATE_CASPER_CHAT, R.string.vkim_create_casper_chat, R.drawable.vk_icon_ghost_outline_28, R.drawable.vk_icon_ghost_outline_28, 0, false, 112);
    }

    /* compiled from: ButtonItem.kt */
    public static final class e extends cq8 {
        public final boolean h;

        public e(boolean z) {
            super(ContactsViews.CREATE_CHANNEL, R.string.vkim_create_channel, R.drawable.vk_icon_channels_outline_28, R.drawable.vk_icon_lego_card_megaphone_outline_28, 0, false, 112);
            this.h = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.h == ((e) obj).h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CreateChannel(needHighlight="), this.h, ')');
        }
    }

    /* compiled from: ButtonItem.kt */
    public static final class f extends cq8 {
        public static final f h = new f(ContactsViews.CREATE_CHAT, R.string.vkim_create_chat, R.drawable.vk_icon_users_outline_28, R.drawable.vk_icon_users_outline_28, 0, false, 112);
    }

    /* compiled from: ButtonItem.kt */
    public static final class g extends cq8 {
        public static final g h = new g(ContactsViews.INVITE, R.string.vkim_contacts_invite, R.drawable.vk_icon_user_add_outline_24, R.drawable.vk_icon_user_add_outline_24, 0, false, 112);
    }

    /* compiled from: ButtonItem.kt */
    public static final class h extends cq8 {
        public final boolean h;

        public h(boolean z) {
            super(ContactsViews.INVITE_BY_PHONE_NUMBER, R.string.vkim_contacts_invite_by_phone_number_btn, R.drawable.vk_icon_phone_add_outline_28, R.drawable.vk_icon_phone_outline_28, 0, z, 48);
            this.h = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.h == ((h) obj).h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("InviteByPhoneNumber(isWithSeparator="), this.h, ')');
        }
    }

    /* compiled from: ButtonItem.kt */
    public static final class i extends cq8 {
        public static final i h = new i(ContactsViews.WRITE_BY_PHONE_NUMBER, R.string.vkim_contacts_write_by_phone_number_btn, R.drawable.vk_icon_phone_add_outline_28, R.drawable.vk_icon_phone_outline_28, 0, false, 112);
    }

    public cq8(ContactsViews contactsViews, int i2, int i3, int i4, int i5, boolean z, int i6) {
        i5 = (i6 & 16) != 0 ? 0 : i5;
        z = (i6 & 64) != 0 ? false : z;
        this.b = contactsViews;
        this.c = i2;
        this.d = i3;
        this.e = i5;
        this.f = false;
        this.g = z;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.ordinal());
    }
}
