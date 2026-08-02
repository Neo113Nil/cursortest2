package defpackage;

import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.encoder.c;
import com.google.zxing.qrcode.encoder.d;

/* loaded from: classes11.dex */
public final class li20 {
    public final Mode a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ c e;

    public li20(c cVar, Mode mode, int i, int i2, int i3) {
        this.e = cVar;
        this.a = mode;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        Mode mode = this.a;
        Mode mode2 = Mode.BYTE;
        int i = this.d;
        if (mode != mode2) {
            return i;
        }
        d dVar = this.e.c;
        lan lanVar = dVar.c;
        String str = dVar.a;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(lanVar.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Mode mode = this.a;
        sb.append(mode);
        sb.append('(');
        Mode mode2 = Mode.ECI;
        d dVar = this.e.c;
        if (mode == mode2) {
            lan lanVar = dVar.c;
            sb.append(lanVar.a[this.c].charset().displayName());
        } else {
            String str = dVar.a;
            int i = this.d;
            int i2 = this.b;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
