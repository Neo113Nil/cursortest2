package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public final class nn60 extends nl11 {
    public static final ln60 b = new ln60(0, new nn60(ToNumberPolicy.LAZILY_PARSED_NUMBER));
    public final sjz0 a;

    public nn60(sjz0 sjz0Var) {
        this.a = sjz0Var;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        JsonToken R = wdxVar.R();
        int i = mn60.a[R.ordinal()];
        if (i == 1) {
            wdxVar.B0();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.a(wdxVar);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(R);
        String path = wdxVar.getPath();
        sb.append("; at path ");
        sb.append(path);
        throw new JsonSyntaxException(sb.toString());
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.U((Number) obj);
    }
}
