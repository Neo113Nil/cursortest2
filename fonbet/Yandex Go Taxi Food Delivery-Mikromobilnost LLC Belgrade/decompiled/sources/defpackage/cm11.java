package defpackage;

import com.google.gson.stream.JsonToken;
import java.net.URL;

/* loaded from: classes11.dex */
public class cm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        if (nextString.equals("null")) {
            return null;
        }
        return new URL(nextString);
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        URL url = (URL) obj;
        afxVar.W(url == null ? null : url.toExternalForm());
    }
}
