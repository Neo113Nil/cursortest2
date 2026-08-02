package defpackage;

import com.google.gson.JsonSyntaxException;
import java.util.Currency;

/* loaded from: classes11.dex */
public class gm11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        String nextString = wdxVar.nextString();
        try {
            return Currency.getInstance(nextString);
        } catch (IllegalArgumentException e) {
            StringBuilder x = unr0.x("Failed parsing '", nextString, "' as Currency; at path ");
            x.append(wdxVar.w());
            throw new JsonSyntaxException(x.toString(), e);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.W(((Currency) obj).getCurrencyCode());
    }
}
