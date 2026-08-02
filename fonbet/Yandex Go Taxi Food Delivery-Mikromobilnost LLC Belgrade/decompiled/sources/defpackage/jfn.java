package defpackage;

@gsq0
/* loaded from: classes5.dex */
public final class jfn {
    public static final ifn Companion = new ifn();
    public final String a;
    public final boolean b;

    public /* synthetic */ jfn(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, hfn.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public jfn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
