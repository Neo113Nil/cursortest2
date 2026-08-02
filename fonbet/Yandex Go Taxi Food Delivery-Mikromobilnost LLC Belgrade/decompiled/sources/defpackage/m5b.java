package defpackage;

import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.Metadata;

/* loaded from: classes15.dex */
public interface m5b {
    default Metadata a(long j, ouf0 ouf0Var, Moshi moshi) {
        o5b o5bVar = (o5b) a.b(((n5b) this).a, true, false, new cs0(j, 21));
        if (o5bVar == null) {
            return null;
        }
        Metadata metadata = new Metadata();
        byte[] bArr = o5bVar.b;
        metadata.chatbar = bArr != null ? (Metadata.Chatbar) ouf0Var.a(Metadata.Chatbar.class).decode(bArr) : null;
        byte[] bArr2 = o5bVar.c;
        metadata.callsSettings = bArr2 != null ? (Metadata.CallsSettings) ouf0Var.a(Metadata.CallsSettings.class).decode(bArr2) : null;
        byte[] bArr3 = o5bVar.d;
        metadata.complainAction = bArr3 != null ? (String[]) moshi.adapter(String[].class).fromJson(new String(bArr3, uza.a)) : null;
        metadata.miniappUrl = o5bVar.e;
        metadata.allowUnsafeMiniapp = o5bVar.f;
        Boolean bool = o5bVar.g;
        if (bool != null) {
            metadata.viewImportantsList = bool.booleanValue();
        }
        return metadata;
    }
}
