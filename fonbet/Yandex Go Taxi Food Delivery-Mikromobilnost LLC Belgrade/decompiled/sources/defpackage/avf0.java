package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.Metadata;

/* loaded from: classes15.dex */
public final class avf0 {
    public final ouf0 a;
    public final Moshi b;

    public avf0(ouf0 ouf0Var, Moshi moshi) {
        this.a = ouf0Var;
        this.b = moshi;
    }

    public final mp21 a(String str, Metadata metadata) {
        Metadata.Chatbar chatbar = metadata.chatbar;
        ouf0 ouf0Var = this.a;
        byte[] encode = chatbar != null ? ouf0Var.a(Metadata.Chatbar.class).encode(chatbar) : null;
        Metadata.CallsSettings callsSettings = metadata.callsSettings;
        byte[] encode2 = callsSettings != null ? ouf0Var.a(Metadata.CallsSettings.class).encode(callsSettings) : null;
        String[] strArr = metadata.complainAction;
        return new mp21(str, encode, encode2, strArr != null ? this.b.adapter(String[].class).toJson(strArr).getBytes(uza.a) : null, Boolean.valueOf(metadata.viewImportantsList));
    }
}
