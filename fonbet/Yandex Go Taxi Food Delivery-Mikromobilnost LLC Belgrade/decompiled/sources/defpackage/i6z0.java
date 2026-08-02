package defpackage;

/* loaded from: classes11.dex */
public final class i6z0 {
    public static final i6z0 d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new i6z0(i, i, 0);
    }

    public i6z0(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = 0;
                this.c = 32768;
                break;
        }
    }

    public int a(boolean z) {
        return z ? this.c : this.b;
    }

    public int b() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("Location(line = ");
                sb.append(this.b);
                sb.append(", column = ");
                return oyr.s(sb, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i6z0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
