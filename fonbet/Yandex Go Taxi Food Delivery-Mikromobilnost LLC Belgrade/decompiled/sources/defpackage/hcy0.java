package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechCallInfoMessage;
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

/* loaded from: classes15.dex */
public final class hcy0 implements TechBaseMessage.MessageHandler {
    public final Context a;
    public final lqo b;
    public final String c;
    public final String d;

    public hcy0(Context context, lqo lqoVar, String str) {
        this.a = context;
        this.b = lqoVar;
        this.c = str;
        this.d = context.getResources().getString(oyh0.call_missed_notifcation_text);
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object b(TechUsersAddedToChatMessage techUsersAddedToChatMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object c() {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object d(TechUserJoinChatMessage techUserJoinChatMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object e() {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object f(TechUserLeaveChatMessage techUserLeaveChatMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object g(TechChatInfoChangedMessage techChatInfoChangedMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object h(TechUsersRemovedFromChatMessage techUsersRemovedFromChatMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object i(TechGenericMessage techGenericMessage) {
        return techGenericMessage.messageText;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object j(TechChatCreatedMessage techChatCreatedMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object k() {
        if (this.b.a(tz10.p)) {
            return g8e.o("📞 ", this.a.getResources().getString(oyh0.group_call_started_message_text_with_author, this.c));
        }
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final /* bridge */ /* synthetic */ Object l(TechUserJoinChatByLinkMessage techUserJoinChatByLinkMessage) {
        return null;
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object m(TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage) {
        int i;
        PersonalMeetingResolution e = hi91.e(techPersonalMeetingEndedMessage);
        int i2 = gcy0.a[e.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4 && i2 != 5) {
                w511.b();
            }
            return null;
        }
        Resources resources = this.a.getResources();
        int i3 = i5b0.a[e.ordinal()];
        if (i3 == 1) {
            i = oyh0.call_finished;
        } else if (i3 == 2) {
            i = oyh0.call_finished;
        } else if (i3 == 3) {
            i = oyh0.call_declined;
        } else if (i3 == 4) {
            i = oyh0.call_missed;
        } else {
            if (i3 != 5) {
                w511.b();
                return null;
            }
            i = oyh0.call_missed;
        }
        return resources.getString(i);
    }

    @Override // com.yandex.messaging.internal.entities.TechBaseMessage.MessageHandler
    public final Object n(TechCallInfoMessage techCallInfoMessage) {
        int i = techCallInfoMessage.callInfo.callStatus;
        if (i == 2 || i == 5) {
            return this.d;
        }
        return null;
    }
}
