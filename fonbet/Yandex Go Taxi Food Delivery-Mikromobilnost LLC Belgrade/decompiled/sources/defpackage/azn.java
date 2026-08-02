package defpackage;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* loaded from: classes11.dex */
public final class azn {
    public final String a;
    public SymbolShapeHint b;
    public final StringBuilder c;
    public int d;
    public int e;
    public zzw0 f;
    public int g;

    public azn(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                ny61.g("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.a.length() - this.g;
    }

    public final void c(int i) {
        zzw0 zzw0Var = this.f;
        if (zzw0Var == null || i > zzw0Var.b) {
            this.f = zzw0.e(i, this.b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }
}
