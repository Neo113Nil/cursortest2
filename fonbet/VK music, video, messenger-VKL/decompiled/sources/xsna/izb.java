package xsna;

/* compiled from: ChatTransactionInfo.kt */
/* loaded from: classes3.dex */
public final class izb {
    public final boolean a;
    public final dw1 b;
    public final boolean c;
    public final int d;

    public izb() {
        this(0);
    }

    public static izb a(izb izbVar, boolean z, dw1 dw1Var, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = izbVar.a;
        }
        if ((i2 & 2) != 0) {
            dw1Var = izbVar.b;
        }
        if ((i2 & 4) != 0) {
            z2 = izbVar.c;
        }
        if ((i2 & 8) != 0) {
            i = izbVar.d;
        }
        izbVar.getClass();
        return new izb(z, dw1Var, z2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izb)) {
            return false;
        }
        izb izbVar = (izb) obj;
        return this.a == izbVar.a && epx.f(this.b, izbVar.b) && this.c == izbVar.c && this.d == izbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatTransactionInfo(pinMessage=");
        sb.append(this.a);
        sb.append(", recommendedAmount=");
        sb.append(this.b);
        sb.append(", participateInCollect=");
        sb.append(this.c);
        sb.append(", dialogParticipantsCount=");
        return vu5.b(sb, this.d, ')');
    }

    public izb(boolean z, dw1 dw1Var, boolean z2, int i) {
        this.a = z;
        this.b = dw1Var;
        this.c = z2;
        this.d = i;
    }

    public /* synthetic */ izb(int i) {
        this(true, new dw1(0, ""), true, 0);
    }
}
