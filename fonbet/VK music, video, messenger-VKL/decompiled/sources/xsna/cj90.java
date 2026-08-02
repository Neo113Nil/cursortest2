package xsna;

/* compiled from: ParseSettings.java */
/* loaded from: classes8.dex */
public final class cj90 {
    public static final cj90 c = new cj90(false, false);
    public static final cj90 d = new cj90(true, true);
    public final boolean a;
    public final boolean b;

    public cj90(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final void a(org.jsoup.nodes.b bVar) {
        if (bVar == null || this.b) {
            return;
        }
        for (int i = 0; i < bVar.b; i++) {
            String[] strArr = bVar.c;
            strArr[i] = ad0.C(strArr[i]);
        }
    }
}
