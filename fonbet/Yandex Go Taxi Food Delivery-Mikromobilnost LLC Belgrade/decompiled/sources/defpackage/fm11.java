package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.util.UUID;

/* loaded from: classes11.dex */
public class fm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        try {
            return UUID.fromString(nextString);
        } catch (IllegalArgumentException e) {
            StringBuilder x = unr0.x("Failed parsing '", nextString, "' as UUID; at path ");
            x.append(wdxVar.w());
            throw new JsonSyntaxException(x.toString(), e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        UUID uuid = (UUID) obj;
        afxVar.W(uuid == null ? null : uuid.toString());
    }
}
