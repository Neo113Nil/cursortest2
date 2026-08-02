package sg.bigo.ads.dh;

import androidx.annotation.NonNull;
import xsna.i5s;

/* loaded from: classes9.dex */
public class n {
    private boolean a;
    public final String b;
    public boolean c;
    public boolean d;
    public boolean e;

    public n(@NonNull String str) {
        this.d = false;
        this.a = true;
        this.e = false;
        this.b = str;
    }

    public String toString() {
        return i5s.a(new StringBuilder("{\"Content\":\""), this.b, "\"}");
    }

    public n(@NonNull String str, byte b) {
        this(str);
        this.d = true;
    }
}
