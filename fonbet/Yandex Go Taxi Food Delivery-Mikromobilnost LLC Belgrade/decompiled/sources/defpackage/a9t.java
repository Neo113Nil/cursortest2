package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$1;
import com.yandex.messaging.internal.GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2;
import com.yandex.messaging.internal.MessageStatus;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.PollMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TextMessageData;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import java.util.Date;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a9t implements s3z {
    public final Context a;
    public final ChatRequest b;
    public final String c;
    public final String w;
    public final String x;
    public final /* synthetic */ c9t y;

    public a9t(c9t c9tVar, Context context, ChatRequest chatRequest) {
        this.y = c9tVar;
        this.a = context;
        this.b = chatRequest;
        this.c = context.getString(oyh0.messaging_moderation_action_hide_text);
        this.w = context.getString(oyh0.messenger_removed_message_text);
        this.x = context.getString(oyh0.messenger_moderated_out_message_text);
    }

    @Override // defpackage.s3z
    public final Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return new l7(e.i(new GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$1(null, this.y.e, str)), str, date, 12);
    }

    @Override // defpackage.s3z
    public final Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        c9t c9tVar = this.y;
        return new z8t(new mth(e.i(new GetMessageInfoFlowUseCase$flow$$inlined$disposableFlowWrapper$2(null, z, c9tVar.d, techBaseMessage, str, this.b)), 6), str, c9tVar, techBaseMessage, date, z);
    }

    @Override // defpackage.s3z
    public final Object l(Date date) {
        return new g92(2, new x8t(null, this.x, date, MessageStatus.OTHER, false, true));
    }

    @Override // defpackage.s3z
    public final Object m(Date date, RemovedMessageData removedMessageData) {
        String quantityString;
        if (removedMessageData.removedGroupSize == 1) {
            quantityString = this.w;
        } else {
            Resources resources = this.a.getResources();
            int i = ewh0.messaging_removed_messages_group_plural;
            int i2 = removedMessageData.removedGroupSize;
            quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        }
        return new g92(2, new x8t(null, quantityString, date, MessageStatus.OTHER, true, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r1 = defpackage.g8e.o("→ ", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r9 != false) goto L31;
     */
    @Override // defpackage.s3z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(my40 my40Var, boolean z) {
        MessageData messageData = my40Var.g;
        Date date = my40Var.a;
        MessageStatus messageStatus = (z && my40Var.j) ? MessageStatus.READ : (z && my40Var.i) ? MessageStatus.SENT : (!z || messageData.detentionReason == 0) ? z ? MessageStatus.SENDING : MessageStatus.OTHER : MessageStatus.DETAINED;
        String str = null;
        String str2 = z ? null : my40Var.h;
        boolean z2 = my40Var.c;
        this.y.c.getClass();
        if (!uu10.a(messageData)) {
            str = this.c;
        } else if (messageData instanceof TextMessageData) {
            str = messageData.text;
        } else if (messageData instanceof MediaMessageData) {
            str = (String) ((MediaMessageData) messageData).a(new y8t(this.a.getResources()));
        } else if (messageData instanceof PollMessageData) {
            String str3 = ((PollMessageData) messageData).title;
            if (str3 == null) {
                str3 = "";
            }
            str = "📊 ".concat(str3);
            if (z2) {
                str = "→ ".concat(str);
            }
        }
        return new g92(2, new x8t(str2, str, date, messageStatus, false, false));
    }
}
