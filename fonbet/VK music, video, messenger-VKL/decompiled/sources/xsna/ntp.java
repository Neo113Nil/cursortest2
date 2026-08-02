package xsna;

import xsna.i06;

/* compiled from: EqualizerBaseInfo.kt */
/* loaded from: classes3.dex */
public final class ntp {
    private static final ntp STUB;
    public static final a d = new a();
    public final short a;
    public final short b;
    public final i06[] c;

    /* compiled from: EqualizerBaseInfo.kt */
    public static final class a {
        public final ntp getSTUB() {
            return ntp.STUB;
        }
    }

    static {
        i06.a aVar = i06.b;
        STUB = new ntp((short) -1500, (short) 1500, new i06[]{aVar.getSTUB(), aVar.getSTUB(), aVar.getSTUB(), aVar.getSTUB(), aVar.getSTUB()});
    }

    public ntp(short s, short s2, i06[] i06VarArr) {
        this.a = s;
        this.b = s2;
        this.c = i06VarArr;
    }
}
