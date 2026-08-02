package defpackage;

import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class dpy0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dpy0(int i, int i2, int i3, int i4, String str) {
        if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + Extension.FIX_SPACE + String.valueOf(i2) + Extension.C_BRAKE);
        }
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + Extension.FIX_SPACE + String.valueOf(i4) + Extension.C_BRAKE);
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
        }
        if (i > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static dpy0 a(JSONObject jSONObject) {
        return new dpy0(jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"), jSONObject.getString("text"));
    }
}
