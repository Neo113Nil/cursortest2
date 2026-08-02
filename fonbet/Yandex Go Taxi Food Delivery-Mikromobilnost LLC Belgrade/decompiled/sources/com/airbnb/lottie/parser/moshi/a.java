package com.airbnb.lottie.parser.moshi;

import defpackage.hzk;
import defpackage.lbb1;
import defpackage.oyr;
import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a implements Closeable {
    public static final String[] x = new String[128];
    public int a;
    public int[] b;
    public String[] c;
    public int[] w;

    static {
        for (int i = 0; i <= 31; i++) {
            x[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public final String getPath() {
        return lbb1.d(this.a, this.b, this.c, this.w);
    }

    public abstract boolean hasNext();

    public abstract JsonReader$Token k();

    public final void n(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(getPath()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.w;
            this.w = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextString();

    public abstract int o(hzk hzkVar);

    public abstract void skipValue();

    public abstract void v();

    public final void w(String str) {
        StringBuilder v = oyr.v(str, " at path ");
        v.append(getPath());
        throw new JsonEncodingException(v.toString());
    }
}
