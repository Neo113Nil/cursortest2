package defpackage;

import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class la7 extends rvj0 {
    public final vxj a;
    public final String b;
    public final String c;
    public final jci0 w;

    public la7(vxj vxjVar, String str, String str2) {
        this.a = vxjVar;
        this.b = str;
        this.c = str2;
        this.w = new jci0(new h06((y9t0) vxjVar.c.get(1), this));
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        String str = this.c;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = yf61.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        String str = this.b;
        if (str != null) {
            Regex regex = wg10.e;
            try {
                return qje.o(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        return this.w;
    }
}
