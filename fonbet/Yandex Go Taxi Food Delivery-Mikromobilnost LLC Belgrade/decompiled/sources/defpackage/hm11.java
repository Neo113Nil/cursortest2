package defpackage;

import com.google.gson.stream.JsonToken;
import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes11.dex */
public class hm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(wdxVar.nextString(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        Locale locale = (Locale) obj;
        afxVar.W(locale == null ? null : locale.toString());
    }
}
