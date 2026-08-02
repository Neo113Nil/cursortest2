package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class kb20 {
    public final zl60 a;
    public final String b;
    public final String c;
    public final cne0 d;
    public final dj9 e;
    public volatile jb20 f;
    public volatile ph1 g;

    public kb20(dne0 dne0Var, b03 b03Var, zl60 zl60Var) {
        this.a = zl60Var;
        this.d = dne0Var.b();
        String applicationId = b03Var.getApplicationId();
        this.b = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_UUID");
        this.c = b64.j(applicationId, ".utils.PreferenceUtils.FIELD_DEVICE_ID");
        this.e = new dj9('!', '~');
    }

    public final String a() {
        ph1 ph1Var = this.g;
        if (ph1Var == null) {
            String l = this.d.l(this.c, null);
            ph1Var = l == null ? new ph1(null, 1) : new ph1(c(l, "READ_UNSUPPORTED_CHAR", "METRICA_DEVICE_ID"), 1);
            synchronized (this) {
                if (this.g == null) {
                    this.g = ph1Var;
                }
            }
        }
        return ph1Var.b;
    }

    public final String b() {
        jb20 jb20Var = this.f;
        if (jb20Var == null) {
            String l = this.d.l(this.b, null);
            jb20Var = l == null ? new jb20("", 0) : new jb20(c(l, "READ_UNSUPPORTED_CHAR", "METRICA_UUID"), 0);
            synchronized (this) {
                if (this.f == null) {
                    this.f = jb20Var;
                }
            }
        }
        return jb20Var.b;
    }

    public final String c(String str, String str2, String str3) {
        dj9 dj9Var;
        String str4;
        int length = str.length() - 1;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            dj9Var = this.e;
            if (i2 > length) {
                break;
            }
            char charAt = str.charAt(!z ? i2 : length);
            boolean z2 = charAt <= dj9Var.b && dj9Var.a <= charAt;
            if (z) {
                if (z2) {
                    break;
                }
                length--;
            } else if (z2) {
                z = true;
            } else {
                i2++;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        if (str.length() != obj.length()) {
            hst hstVar = jst.e;
            int i3 = 0;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                int i4 = i3 + 1;
                char c = dj9Var.a;
                if (charAt2 > dj9Var.b || c > charAt2) {
                    str4 = "Unsupported char '" + charAt2 + "' with code " + String.format(Locale.US, "%#04x", Arrays.copyOf(new Object[]{Integer.valueOf(charAt2)}, 1)) + " for " + str3 + " at " + i3 + " position";
                    break;
                }
                i++;
                i3 = i4;
            }
            str4 = "";
            xby.t(hstVar, str2, new IllegalStateException(), str4, 2);
        }
        return obj;
    }
}
