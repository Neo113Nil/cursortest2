package defpackage;

@gsq0
/* loaded from: classes12.dex */
public final class ck8 {
    public static final bk8 Companion = new bk8();
    public final String a;
    public final String b;

    public /* synthetic */ ck8(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ak8.a.getDescriptor());
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
