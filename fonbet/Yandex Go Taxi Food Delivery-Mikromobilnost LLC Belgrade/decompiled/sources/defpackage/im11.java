package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.util.BitSet;

/* loaded from: classes11.dex */
public class im11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        BitSet bitSet = new BitSet();
        wdxVar.a();
        JsonToken R = wdxVar.R();
        int i = 0;
        while (R != JsonToken.END_ARRAY) {
            int i2 = lm11.a[R.ordinal()];
            boolean z = true;
            if (i2 == 1 || i2 == 2) {
                int nextInt = wdxVar.nextInt();
                if (nextInt == 0) {
                    z = false;
                } else if (nextInt != 1) {
                    StringBuilder t = b64.t(nextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    t.append(wdxVar.w());
                    throw new JsonSyntaxException(t.toString());
                }
            } else {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(R);
                    String path = wdxVar.getPath();
                    sb.append("; at path ");
                    sb.append(path);
                    throw new JsonSyntaxException(sb.toString());
                }
                z = wdxVar.nextBoolean();
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            R = wdxVar.R();
        }
        wdxVar.k();
        return bitSet;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        afxVar.c();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            afxVar.R(bitSet.get(i) ? 1L : 0L);
        }
        afxVar.k();
    }
}
