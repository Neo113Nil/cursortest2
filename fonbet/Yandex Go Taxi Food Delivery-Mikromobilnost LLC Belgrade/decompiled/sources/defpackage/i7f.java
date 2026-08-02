package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import com.yandex.messaging.ui.createpoll.CreatePollActivity;

/* loaded from: classes15.dex */
public final class i7f extends x40 {
    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        l7f l7fVar = (l7f) obj;
        Intent intent = new Intent(context, (Class<?>) CreatePollActivity.class);
        Bundle c = l7fVar.c();
        c.putParcelable("Messaging.Arguments.ChatRequest", l7fVar.a);
        intent.putExtras(c);
        return intent;
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        Bundle extras;
        if (i != -1 || i != -1 || intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (PollMessageDraft) vng.u(extras, PollMessageDraft.class, "param_draft");
    }
}
