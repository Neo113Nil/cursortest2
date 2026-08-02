package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public class am11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() != JsonToken.NULL) {
            return new StringBuilder(wdxVar.nextString());
        }
        wdxVar.B0();
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        afxVar.W(sb == null ? null : sb.toString());
    }
}
