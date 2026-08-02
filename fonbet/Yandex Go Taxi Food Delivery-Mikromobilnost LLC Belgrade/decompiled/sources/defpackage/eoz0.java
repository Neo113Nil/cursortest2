package defpackage;

@gsq0
/* loaded from: classes12.dex */
public final class eoz0 {
    public static final doz0 Companion = new doz0();
    public final String a;
    public final String b;

    public /* synthetic */ eoz0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, coz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }
}
