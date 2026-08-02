package defpackage;

/* loaded from: classes11.dex */
public final class hvb1 extends kvb1 {
    public String a;
    public boolean b;
    public int c;
    public byte d;

    public final ivb1 a() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new ivb1(str, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" libraryName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        ny61.r("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
