package xsna;

import android.content.Context;
import android.text.Spannable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.pik0;

/* compiled from: MsgServiceSpanFormatter.kt */
/* loaded from: classes2.dex */
public final class qz30 {
    public final Context a;
    public final b25 b;

    /* compiled from: MsgServiceSpanFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgChatOwnerUpdate.Type.values().length];
            try {
                iArr[MsgChatOwnerUpdate.Type.CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ANY_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ADMIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgChatOwnerUpdate.Type.ANY_ADMIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qz30(Context context) {
        b25 a2 = o25.a();
        this.a = context;
        this.b = a2;
    }

    public static /* synthetic */ Spannable b(qz30 qz30Var, qtd0 qtd0Var, List list, int i, int i2, int i3, String str, int i4) {
        if ((i4 & 32) != 0) {
            str = "%name%";
        }
        return qz30Var.a(qtd0Var, list, i, i2, i3, str, false);
    }

    public static Spannable l(qz30 qz30Var, qtd0 qtd0Var, int i, int i2, int i3, List list, String str, String str2, List list2, UserId userId, int i4) {
        String str3;
        String str4 = (i4 & 2) != 0 ? "%name%" : "%who_name%";
        String o = qz30Var.o(qtd0Var, i, i2, i3, (i4 & 512) != 0 ? qz30Var.b.c() : userId);
        pik0.a aVar = new pik0.a();
        aVar.a = str4;
        if (qtd0Var == null || (str3 = qtd0Var.name()) == null) {
            str3 = "…";
        }
        aVar.b = str3;
        aVar.c = list;
        pik0.a aVar2 = new pik0.a();
        aVar2.a = str2;
        aVar2.b = str;
        aVar2.c = list2;
        return pik0.a(o, e43.l(aVar, aVar2));
    }

    public final Spannable a(qtd0 qtd0Var, List list, int i, int i2, int i3, String str, boolean z) {
        String o = o(qtd0Var, i3, i, i2, this.b.c());
        pik0.a aVar = new pik0.a();
        aVar.a = str;
        String str2 = null;
        if (z) {
            if (qtd0Var != null) {
                str2 = qtd0Var.ha();
            }
        } else if (qtd0Var != null) {
            str2 = qtd0Var.name();
        }
        if (str2 == null) {
            str2 = "…";
        }
        aVar.b = str2;
        aVar.c = list;
        return pik0.a(o, Collections.singletonList(aVar));
    }

    public final Spannable c(qtd0 qtd0Var, List list, boolean z) {
        return b(this, qtd0Var, list, z ? R.string.vkim_msg_chat_avatar_remove_female_channel : R.string.vkim_msg_chat_avatar_remove_female, z ? R.string.vkim_msg_chat_avatar_remove_male_channel : R.string.vkim_msg_chat_avatar_remove_male, z ? R.string.vkim_msg_chat_avatar_remove_you_channel : R.string.vkim_msg_chat_avatar_remove_you, null, 96);
    }

    public final Spannable d(qtd0 qtd0Var, List list, boolean z) {
        return b(this, qtd0Var, list, z ? R.string.vkim_msg_chat_avatar_update_female_channel : R.string.vkim_msg_chat_avatar_update_female, z ? R.string.vkim_msg_chat_avatar_update_male_channel : R.string.vkim_msg_chat_avatar_update_male, z ? R.string.vkim_msg_chat_avatar_update_you_channel : R.string.vkim_msg_chat_avatar_update_you, null, 96);
    }

    public final Spannable e(qtd0 qtd0Var, String str, List list, List list2, boolean z) {
        return l(this, qtd0Var, z ? R.string.vkim_msg_chat_create_you_channel : R.string.vkim_msg_chat_create_you, z ? R.string.vkim_msg_chat_create_female_channel : R.string.vkim_msg_chat_create_female, z ? R.string.vkim_msg_chat_create_male_channel : R.string.vkim_msg_chat_create_male, list, str, "%title%", list2, null, 514);
    }

    public final Spannable f(qtd0 qtd0Var, qtd0 qtd0Var2, List list, List list2) {
        String str;
        if (qtd0Var2 == null || (str = qtd0Var2.Q2(UserNameCase.ACC)) == null) {
            str = "…";
        }
        return l(this, qtd0Var, R.string.vkim_msg_invite_you, R.string.vkim_msg_invite_female, R.string.vkim_msg_invite_male, list, str, "%whom_name%", list2, null, 512);
    }

    public final Spannable g(qtd0 qtd0Var, qtd0 qtd0Var2, List list, List list2) {
        String str;
        if (qtd0Var2 == null || (str = qtd0Var2.Q2(UserNameCase.ACC)) == null) {
            str = "…";
        }
        return l(this, qtd0Var, R.string.vkim_msg_invite_by_call_you, R.string.vkim_msg_invite_by_call_female, R.string.vkim_msg_invite_by_call_male, list, str, "%whom_name%", list2, null, 512);
    }

    public final Spannable h(qtd0 qtd0Var, qtd0 qtd0Var2, List list, List list2) {
        String str;
        if (epx.f(qtd0Var != null ? qtd0Var.getId() : null, qtd0Var2 != null ? qtd0Var2.getId() : null)) {
            return b(this, qtd0Var, list, R.string.vkim_msg_leave_female, R.string.vkim_msg_leave_male, R.string.vkim_msg_leave_you, "%who_name%", 64);
        }
        if (qtd0Var2 == null || (str = qtd0Var2.Q2(UserNameCase.ACC)) == null) {
            str = "…";
        }
        return l(this, qtd0Var, R.string.vkim_msg_kick_you, R.string.vkim_msg_kick_female, R.string.vkim_msg_kick_male, list, str, "%whom_name%", list2, null, 512);
    }

    public final Spannable i(qtd0 qtd0Var, List list, boolean z) {
        return b(this, qtd0Var, list, z ? R.string.vkim_msg_kick_call_female_channel : R.string.vkim_msg_kick_call_female, z ? R.string.vkim_msg_kick_call_male_channel : R.string.vkim_msg_kick_call_male, z ? R.string.vkim_msg_kick_call_you_channel : R.string.vkim_msg_kick_call_you, "%whom_name%", 64);
    }

    public final Spannable j(qtd0 qtd0Var, String str, String str2, List list, List list2, List list3, boolean z) {
        String str3;
        boolean z2 = str2 != null;
        int i = z2 ? z ? R.string.vkim_msg_chat_title_update_with_old_you_channel : R.string.vkim_msg_chat_title_update_with_old_you : z ? R.string.vkim_msg_chat_title_update_you_channel : R.string.vkim_msg_chat_title_update_you;
        int i2 = z2 ? z ? R.string.vkim_msg_chat_title_update_with_old_female_channel : R.string.vkim_msg_chat_title_update_with_old_female : z ? R.string.vkim_msg_chat_title_update_female_channel : R.string.vkim_msg_chat_title_update_female;
        int i3 = z2 ? z ? R.string.vkim_msg_chat_title_update_with_old_male_channel : R.string.vkim_msg_chat_title_update_with_old_male : z ? R.string.vkim_msg_chat_title_update_male_channel : R.string.vkim_msg_chat_title_update_male;
        if (qtd0Var == null || (str3 = qtd0Var.name()) == null) {
            str3 = "…";
        }
        ArrayList a2 = e43.a(new ov30("%name%", str3, list));
        if (z2) {
            a2.add(new ov30("%old_title%", str2, list3));
        }
        a2.add(new ov30("%title%", str, list2));
        String o = o(qtd0Var, i, i2, i3, this.b.c());
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ov30 ov30Var = (ov30) it.next();
            String str4 = ov30Var.a;
            String str5 = ov30Var.b;
            List<?> list4 = ov30Var.c;
            pik0.a aVar = new pik0.a();
            aVar.a = str4;
            aVar.b = str5;
            aVar.c = list4;
            arrayList.add(aVar);
        }
        return pik0.a(o, arrayList);
    }

    public final Spannable k(qtd0 qtd0Var, List list, String str, String str2, List list2) {
        String str3;
        boolean z = str == null;
        String o = o(qtd0Var, z ? R.string.vkim_msg_chat_style_reset_myself : R.string.vkim_msg_chat_style_update_myself, z ? R.string.vkim_msg_chat_style_reset_female : R.string.vkim_msg_chat_style_update_female, z ? R.string.vkim_msg_chat_style_reset_male : R.string.vkim_msg_chat_style_update_male, this.b.c());
        pik0.a aVar = new pik0.a();
        aVar.a = "%name%";
        if (qtd0Var == null || (str3 = qtd0Var.name()) == null) {
            str3 = "…";
        }
        aVar.b = str3;
        aVar.c = list;
        pik0.a aVar2 = new pik0.a();
        aVar2.a = "%style%";
        if (str == null) {
            str = "";
        } else if (drm0.N(str)) {
            str = "…";
        }
        aVar2.b = str;
        ArrayList o2 = e43.o(aVar, aVar2);
        if (str2.length() > 0) {
            pik0.a aVar3 = new pik0.a();
            aVar3.a = "%btn%";
            aVar3.b = str2;
            aVar3.c = list2;
            o2.add(aVar3);
            o = o.concat("\n %btn%");
        }
        return pik0.a(o, o2);
    }

    public final Spannable m(qtd0 qtd0Var, String str, UserId userId, List list, List list2) {
        int i = str.length() == 0 ? R.string.vkim_msg_pin_without_body_you : R.string.vkim_msg_pin_with_body_you;
        int i2 = str.length() == 0 ? R.string.vkim_msg_pin_without_body_female : R.string.vkim_msg_pin_with_body_female;
        int i3 = str.length() == 0 ? R.string.vkim_msg_pin_without_body_male : R.string.vkim_msg_pin_with_body_male;
        if (str.length() == 0) {
            str = this.a.getString(R.string.vkim_msg);
        }
        return l(this, qtd0Var, i, i2, i3, list, str, "%message%", list2, userId, 2);
    }

    public final Spannable n(qtd0 qtd0Var, List list, boolean z) {
        return b(this, qtd0Var, list, z ? R.string.vkim_msg_screenshot_female_channel : R.string.vkim_msg_screenshot_female, z ? R.string.vkim_msg_screenshot_male_channel : R.string.vkim_msg_screenshot_male, z ? R.string.vkim_msg_screenshot_myself_channel : R.string.vkim_msg_screenshot_myself, null, 96);
    }

    public final String o(qtd0 qtd0Var, int i, int i2, int i3, UserId userId) {
        UserId userId2 = qtd0Var != null ? new UserId(qtd0Var.id()) : null;
        if (!fkq0.b(userId)) {
            if (!epx.f(userId2, userId)) {
                if ((qtd0Var != null ? qtd0Var.B2() : null) == UserSex.FEMALE) {
                    i = i2;
                }
            }
            return this.a.getString(i);
        }
        i = i3;
        return this.a.getString(i);
    }
}
