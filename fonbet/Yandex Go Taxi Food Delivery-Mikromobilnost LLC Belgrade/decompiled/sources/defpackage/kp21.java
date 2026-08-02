package defpackage;

import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.Metadata;

/* loaded from: classes15.dex */
public interface kp21 {
    default Metadata a(String str, ouf0 ouf0Var, Moshi moshi) {
        mp21 mp21Var = (mp21) a.b(((lp21) this).a, true, false, new il01(str, 14));
        if (mp21Var == null) {
            return null;
        }
        Metadata metadata = new Metadata();
        byte[] bArr = mp21Var.b;
        metadata.chatbar = bArr != null ? (Metadata.Chatbar) ouf0Var.a(Metadata.Chatbar.class).decode(bArr) : null;
        byte[] bArr2 = mp21Var.c;
        metadata.callsSettings = bArr2 != null ? (Metadata.CallsSettings) ouf0Var.a(Metadata.CallsSettings.class).decode(bArr2) : null;
        byte[] bArr3 = mp21Var.d;
        metadata.complainAction = bArr3 != null ? (String[]) moshi.adapter(String[].class).fromJson(new String(bArr3, uza.a)) : null;
        Boolean bool = mp21Var.e;
        if (bool != null) {
            metadata.viewImportantsList = bool.booleanValue();
        }
        return metadata;
    }
}
