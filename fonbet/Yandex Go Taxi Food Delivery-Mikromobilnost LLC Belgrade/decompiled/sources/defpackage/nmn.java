package defpackage;

import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.view.input.edit.EditMessageDraft;

/* loaded from: classes15.dex */
public final class nmn {
    public final SharedPreferences a;
    public final Moshi b;
    public final String c;

    public nmn(SharedPreferences sharedPreferences, ChatRequest chatRequest, Moshi moshi) {
        this.a = sharedPreferences;
        this.b = moshi;
        this.c = g8e.o("edit_message_draft#", chatRequest.uniqueRequestId());
    }

    public final EditMessageDraft a() {
        String string = this.a.getString(this.c, null);
        if (string == null) {
            return null;
        }
        EditMessageDraft editMessageDraft = (EditMessageDraft) this.b.adapter(EditMessageDraft.class).fromJson(string);
        if (editMessageDraft != null) {
            return editMessageDraft;
        }
        ny61.g("Unparseable draft format ".concat(string));
        return null;
    }
}
