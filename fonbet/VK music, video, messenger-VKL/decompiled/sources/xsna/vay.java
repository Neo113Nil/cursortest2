package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: JsonStreamContext.java */
/* loaded from: classes12.dex */
public abstract class vay {
    public int a;
    public int b;
    public int c;

    public abstract String a();

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a == 2;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final String e() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String a = a();
                if (a != null) {
                    sb.append('\"');
                    int[] iArr = amb.j;
                    int length = iArr.length;
                    int length2 = a.length();
                    while (r2 < length2) {
                        char charAt = a.charAt(r2);
                        if (charAt >= length || iArr[charAt] == 0) {
                            sb.append(charAt);
                        } else {
                            sb.append('\\');
                            int i2 = iArr[charAt];
                            if (i2 < 0) {
                                sb.append("u00");
                                char[] cArr = amb.a;
                                sb.append(cArr[charAt >> 4]);
                                sb.append(cArr[charAt & 15]);
                            } else {
                                sb.append((char) i2);
                            }
                        }
                        r2++;
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i3 = this.b;
                sb.append(i3 >= 0 ? i3 : 0);
                sb.append(']');
            }
        } else {
            sb.append(DomExceptionUtils.SEPARATOR);
        }
        return sb.toString();
    }
}
