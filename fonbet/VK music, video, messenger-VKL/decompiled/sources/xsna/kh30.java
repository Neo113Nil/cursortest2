package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import com.vkontakte.android.R;

/* compiled from: MsgBodyUserFormatter.kt */
/* loaded from: classes2.dex */
public final class kh30 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Msg msg, Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        String obj;
        ChatSettings Hb;
        dhr0.a.getClass();
        Context E = dhr0.E();
        long j = msg.getFrom().d;
        int i = v120.$EnumSwitchMapping$0[msg.getFrom().c.ordinal()];
        String str = "";
        if (i == 1) {
            User user = (User) profilesSimpleInfo.b.get(Long.valueOf(j));
            if (user != null) {
                String str2 = user.p;
                String str3 = user.d;
                if (str3 != null) {
                    obj = str3;
                } else {
                    obj = drm0.r0(user.o + ' ' + (str2.length() > 0 ? Character.valueOf(str2.charAt(0)) : "")).toString();
                }
            }
            obj = null;
        } else if (i == 2) {
            Contact contact = (Contact) profilesSimpleInfo.c.get(Long.valueOf(j));
            if (contact != null) {
                UserNameCase.a aVar = UserNameCase.Companion;
                obj = contact.c;
            }
            obj = null;
        } else if (i == 3) {
            Email email = (Email) profilesSimpleInfo.d.get(Long.valueOf(j));
            if (email != null) {
                obj = email.c;
            }
            obj = null;
        } else if (i != 4) {
            obj = "";
        } else {
            Group group = (Group) profilesSimpleInfo.e.get(Long.valueOf(j));
            if (group != null) {
                obj = group.c;
            }
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            if ((msg instanceof MsgFromUser) && (dialog == null || !dialog.Jc())) {
                if (!((MsgFromUser) msg).i) {
                    g2v.c().getClass();
                    Context context = e43.a;
                    str = (context != null ? context : null).getString(R.string.vkim_search_me);
                } else if ((dialog == null || (Hb = dialog.Hb()) == null || !Hb.h) && dialog != null && dialog.uc()) {
                    str = obj;
                }
            }
            if (str.length() == 0) {
                return;
            }
            spannableStringBuilder.insert(0, (CharSequence) str).insert(str.length(), E.getResources().getString(R.string.vkim_colon));
            com.vk.im.ui.formatters.spans.dialogitem.b.a(spannableStringBuilder, MsgBodySpan.Type.MEMBER_NAME, str.length() + 1, 8);
        }
    }
}
