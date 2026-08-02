package defpackage;

/* loaded from: classes4.dex */
public final class mc51 {
    public final /* synthetic */ int a;
    public final String b;
    public int c;
    public final char d;
    public final StringBuffer e;

    public mc51(char c, int i, String str) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new StringBuffer();
                this.b = str;
                this.c = -1;
                this.d = c;
                break;
            default:
                this.e = new StringBuffer();
                this.b = str;
                this.c = -1;
                this.d = c;
                break;
        }
    }

    public boolean a() {
        return this.c != this.b.length();
    }

    public final String b() {
        int i = this.a;
        char c = this.d;
        String str = this.b;
        StringBuffer stringBuffer = this.e;
        switch (i) {
            case 0:
                if (this.c != str.length()) {
                    stringBuffer.setLength(0);
                    boolean z = false;
                    boolean z2 = false;
                    for (int i2 = this.c + 1; i2 != str.length(); i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt == '\"') {
                            if (!z) {
                                z2 = !z2;
                            }
                            stringBuffer.append(charAt);
                        } else if (z || z2) {
                            stringBuffer.append(charAt);
                        } else {
                            if (charAt == '\\') {
                                stringBuffer.append(charAt);
                                z = true;
                            } else if (charAt == c) {
                                this.c = i2;
                                break;
                            } else {
                                stringBuffer.append(charAt);
                            }
                        }
                        z = false;
                    }
                    this.c = i2;
                }
                break;
            default:
                if (this.c != str.length()) {
                    stringBuffer.setLength(0);
                    boolean z3 = false;
                    boolean z4 = false;
                    for (int i3 = this.c + 1; i3 != str.length(); i3++) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 == '\"') {
                            if (!z3) {
                                z4 = !z4;
                            }
                        } else if (!z3 && !z4) {
                            if (charAt2 == '\\') {
                                stringBuffer.append(charAt2);
                                z3 = true;
                            } else if (charAt2 == c) {
                                this.c = i3;
                                break;
                            } else {
                                stringBuffer.append(charAt2);
                            }
                        }
                        stringBuffer.append(charAt2);
                        z3 = false;
                    }
                    this.c = i3;
                }
                break;
        }
        return stringBuffer.toString();
    }
}
