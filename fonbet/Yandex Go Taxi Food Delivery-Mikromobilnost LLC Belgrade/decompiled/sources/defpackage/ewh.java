package defpackage;

/* loaded from: classes5.dex */
public final class ewh {
    public final hki a;
    public final tls b;

    public ewh(hki hkiVar, zai zaiVar, int i) {
        hkiVar = (i & 1) != 0 ? gki.a : hkiVar;
        tls wthVar = (i & 8) != 0 ? new wth(3) : zaiVar;
        this.a = hkiVar;
        this.b = wthVar;
    }

    public ewh() {
        this(null, null, 15);
    }
}
