package defpackage;

/* loaded from: classes11.dex */
public final class gmy0 extends zoy0 {
    public final /* synthetic */ int A;

    @Override // defpackage.zoy0
    public final int u(char c, StringBuilder sb) {
        switch (this.A) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) 0);
                            return 2;
                        }
                        if (c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + u((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        l1b1.c(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // defpackage.zoy0, defpackage.vyn
    public void v(azn aznVar) {
        switch (this.A) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    if (aznVar.b()) {
                        char a = aznVar.a();
                        aznVar.d++;
                        u(a, sb);
                        if (sb.length() % 3 == 0) {
                            zoy0.I(aznVar, sb);
                            if (l1b1.k(aznVar.d, 3, aznVar.a) != 3) {
                                aznVar.e = 0;
                            }
                        }
                    }
                }
                z(aznVar, sb);
                break;
            default:
                super.v(aznVar);
                break;
        }
    }

    @Override // defpackage.zoy0
    public final int x() {
        switch (this.A) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // defpackage.zoy0
    public void z(azn aznVar, StringBuilder sb) {
        switch (this.A) {
            case 1:
                StringBuilder sb2 = aznVar.c;
                aznVar.c(sb2.length());
                int length = aznVar.f.b - sb2.length();
                aznVar.d -= sb.length();
                String str = aznVar.a;
                if ((str.length() - aznVar.g) - aznVar.d > 1 || length > 1 || (str.length() - aznVar.g) - aznVar.d != length) {
                    aznVar.d((char) 254);
                }
                if (aznVar.e < 0) {
                    aznVar.e = 0;
                    break;
                }
                break;
            default:
                super.z(aznVar, sb);
                break;
        }
    }
}
