package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes11.dex */
public class dm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        try {
            String nextString = wdxVar.nextString();
            if (nextString.equals("null")) {
                return null;
            }
            return new URI(nextString);
        } catch (URISyntaxException e) {
            throw new JsonIOException(e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        URI uri = (URI) obj;
        afxVar.W(uri == null ? null : uri.toASCIIString());
    }
}
