package xsna;

import androidx.annotation.Nullable;
import androidx.media3.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes12.dex */
public final class keh0 extends TagPayloadReader {
    public long b;
    public long[] c;
    public long[] d;

    @Nullable
    public static Serializable a(int i, xi90 xi90Var) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(xi90Var.w()));
        }
        if (i == 1) {
            return Boolean.valueOf(xi90Var.C() == 1);
        }
        if (i == 2) {
            return c(xi90Var);
        }
        if (i != 3) {
            if (i == 8) {
                return b(xi90Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(xi90Var.w()));
                xi90Var.Q(2);
                return date;
            }
            int G = xi90Var.G();
            ArrayList arrayList = new ArrayList(G);
            for (int i2 = 0; i2 < G; i2++) {
                Serializable a = a(xi90Var.C(), xi90Var);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String c = c(xi90Var);
            int C = xi90Var.C();
            if (C == 9) {
                return hashMap;
            }
            Serializable a2 = a(C, xi90Var);
            if (a2 != null) {
                hashMap.put(c, a2);
            }
        }
    }

    public static HashMap<String, Object> b(xi90 xi90Var) {
        int G = xi90Var.G();
        HashMap<String, Object> hashMap = new HashMap<>(G);
        for (int i = 0; i < G; i++) {
            String c = c(xi90Var);
            Serializable a = a(xi90Var.C(), xi90Var);
            if (a != null) {
                hashMap.put(c, a);
            }
        }
        return hashMap;
    }

    public static String c(xi90 xi90Var) {
        int J = xi90Var.J();
        int i = xi90Var.b;
        xi90Var.Q(J);
        return new String(xi90Var.a, i, J);
    }
}
