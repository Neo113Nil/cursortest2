package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.core.net.entities.proto.message.DepartmentInfo;
import com.yandex.messaging.core.net.entities.proto.message.GroupInfo;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechChatCreatedMessage;
import com.yandex.messaging.internal.entities.TechChatInfoChangedMessage;
import com.yandex.messaging.internal.entities.TechGenericMessage;
import com.yandex.messaging.internal.entities.TechUserJoinChatByLinkMessage;
import com.yandex.messaging.internal.entities.TechUserJoinChatMessage;
import com.yandex.messaging.internal.entities.TechUserLeaveChatMessage;
import com.yandex.messaging.internal.entities.TechUsersAddedToChatMessage;
import com.yandex.messaging.internal.entities.TechUsersRemovedFromChatMessage;
import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public abstract class icy0 implements TechBaseMessage.MessageHandler {
    public final boolean a;
    public final String[] b;
    public final Resources c;
    public final boolean d;

    public icy0(boolean z, String[] strArr, Resources resources, boolean z2) {
        this.a = z;
        this.b = strArr;
        this.c = resources;
        this.d = z2;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object a() {
        return String.format(this.c.getString(oyh0.tech_unknown_message_text_format), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object b(TechUsersAddedToChatMessage techUsersAddedToChatMessage) {
        ArrayList arrayList;
        int i = oyh0.tech_added_to_chat_text;
        int i2 = oyh0.tech_added_to_chat_text_with_colon;
        String[] strArr = techUsersAddedToChatMessage.guestsGuids;
        ArrayList arrayList2 = null;
        Set f0 = strArr != null ? j73.f0(strArr) : null;
        DepartmentInfo[] departmentInfoArr = techUsersAddedToChatMessage.departments;
        if (departmentInfoArr != null) {
            ArrayList arrayList3 = new ArrayList(departmentInfoArr.length);
            for (DepartmentInfo departmentInfo : departmentInfoArr) {
                arrayList3.add(departmentInfo.getName());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        GroupInfo[] groupInfoArr = techUsersAddedToChatMessage.groups;
        if (groupInfoArr != null) {
            arrayList2 = new ArrayList(groupInfoArr.length);
            for (GroupInfo groupInfo : groupInfoArr) {
                arrayList2.add(groupInfo.getName());
            }
        }
        return o(i, i2, f0, arrayList, arrayList2);
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object c() {
        return this.c.getString(oyh0.group_call_ended_message_text);
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object d(TechUserJoinChatMessage techUserJoinChatMessage) {
        return String.format(this.c.getString(oyh0.tech_user_join_chat_text_format), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object e() {
        return String.format(this.c.getString(oyh0.tech_user_change_chat_avatar_text_format), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object f(TechUserLeaveChatMessage techUserLeaveChatMessage) {
        return String.format(this.c.getString(oyh0.tech_user_leave_chat_text_format), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object g(TechChatInfoChangedMessage techChatInfoChangedMessage) {
        String str = techChatInfoChangedMessage.name;
        if (str == null && techChatInfoChangedMessage.description == null) {
            return "";
        }
        Resources resources = this.c;
        String[] strArr = this.b;
        return (str == null || techChatInfoChangedMessage.description == null) ? str != null ? String.format(resources.getString(oyh0.tech_user_change_chat_name_text_format), Arrays.copyOf(new Object[]{strArr[0], techChatInfoChangedMessage.name}, 2)) : String.format(resources.getString(oyh0.tech_user_change_chat_description_text_format), Arrays.copyOf(new Object[]{strArr[0], techChatInfoChangedMessage.description}, 2)) : String.format(resources.getString(oyh0.tech_user_change_chat_name_description_text_format), Arrays.copyOf(new Object[]{strArr[0], techChatInfoChangedMessage.name, techChatInfoChangedMessage.description}, 3));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object h(TechUsersRemovedFromChatMessage techUsersRemovedFromChatMessage) {
        ArrayList arrayList;
        int i = oyh0.tech_users_removed_from_chat_text_format;
        int i2 = oyh0.tech_users_removed_from_chat_text_format_with_colon;
        String[] strArr = techUsersRemovedFromChatMessage.guestsGuids;
        ArrayList arrayList2 = null;
        Set f0 = strArr != null ? j73.f0(strArr) : null;
        DepartmentInfo[] departmentInfoArr = techUsersRemovedFromChatMessage.departments;
        if (departmentInfoArr != null) {
            ArrayList arrayList3 = new ArrayList(departmentInfoArr.length);
            for (DepartmentInfo departmentInfo : departmentInfoArr) {
                arrayList3.add(departmentInfo.getName());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        GroupInfo[] groupInfoArr = techUsersRemovedFromChatMessage.groups;
        if (groupInfoArr != null) {
            arrayList2 = new ArrayList(groupInfoArr.length);
            for (GroupInfo groupInfo : groupInfoArr) {
                arrayList2.add(groupInfo.getName());
            }
        }
        return o(i, i2, f0, arrayList, arrayList2);
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object i(TechGenericMessage techGenericMessage) {
        return techGenericMessage.messageText;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object j(TechChatCreatedMessage techChatCreatedMessage) {
        boolean z = this.d;
        Resources resources = this.c;
        return z ? resources.getString(oyh0.tech_channel_created) : String.format(resources.getString(oyh0.tech_user_create_chat_text_format), Arrays.copyOf(new Object[]{this.b[0], techChatCreatedMessage.name}, 2));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object k() {
        return String.format(this.c.getString(oyh0.group_call_started_message_text_with_author), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object l(TechUserJoinChatByLinkMessage techUserJoinChatByLinkMessage) {
        return String.format(this.c.getString(oyh0.tech_user_join_chat_by_link_text_format), Arrays.copyOf(new Object[]{this.b[0]}, 1));
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object m(TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage) {
        int i;
        PersonalMeetingResolution e = hi91.e(techPersonalMeetingEndedMessage);
        boolean z = techPersonalMeetingEndedMessage.callType == 1;
        int i2 = h5b0.a[e.ordinal()];
        boolean z2 = this.a;
        if (i2 == 1 || i2 == 2) {
            i = (z2 && z) ? oyh0.chat_outgoing_call : z2 ? oyh0.chat_outgoing_video_call : z ? oyh0.chat_incoming_call : oyh0.chat_incoming_video_call;
        } else if (i2 == 3) {
            i = z2 ? oyh0.chat_outgoing_failed_call : z ? oyh0.chat_incoming_call : oyh0.chat_incoming_video_call;
        } else if (i2 == 4) {
            i = z2 ? oyh0.chat_outgoing_failed_call : z ? oyh0.chat_incoming_missed_call : oyh0.chat_incoming_missed_video_call;
        } else {
            if (i2 != 5) {
                w511.b();
                return null;
            }
            i = (z2 && z) ? oyh0.chat_outgoing_call : z2 ? oyh0.chat_outgoing_video_call : z ? oyh0.chat_incoming_missed_call : oyh0.chat_incoming_missed_video_call;
        }
        return this.c.getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [icy0] */
    public final String o(int i, int i2, Set set, ArrayList arrayList, ArrayList arrayList2) {
        if (set == null) {
            set = EmptySet.a;
        }
        Set set2 = set;
        ArrayList arrayList3 = new ArrayList(tcc.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            unr0.B("@", (String) it.next(), arrayList3);
        }
        Set N0 = a.N0(arrayList3);
        String[] strArr = this.b;
        List z = j73.z(1, strArr);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : z) {
            if (!N0.contains((String) obj)) {
                arrayList4.add(obj);
            }
        }
        ?? r0 = EmptyList.a;
        if (arrayList == null) {
            arrayList = r0;
        }
        if (arrayList2 == null) {
            arrayList2 = r0;
        }
        String X = a.X(j73.A(new String[]{p(arrayList4, null), p(a.J0(N0), Integer.valueOf(ewh0.tech_user_added_guest)), p(arrayList, Integer.valueOf(ewh0.tech_user_added_department)), p(arrayList2, Integer.valueOf(ewh0.tech_user_added_group))}), Extension.FIX_SPACE, null, null, null, 62);
        boolean isEmpty = arrayList4.isEmpty();
        Resources resources = this.c;
        return isEmpty ? resources.getString(i, strArr[0], X) : resources.getString(i2, strArr[0], X);
    }

    public final String p(List list, Integer num) {
        if (list.isEmpty()) {
            return null;
        }
        if (num == null) {
            return a.X(list, Extension.FIX_SPACE, null, null, null, 62);
        }
        return this.c.getQuantityString(num.intValue(), list.size(), a.X(list, Extension.FIX_SPACE, null, null, null, 62));
    }
}
