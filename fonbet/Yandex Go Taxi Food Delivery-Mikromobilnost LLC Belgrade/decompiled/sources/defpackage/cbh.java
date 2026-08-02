package defpackage;

/* loaded from: classes2.dex */
public class cbh implements leo {
    public final String a;
    public final String b;

    public cbh(String str, String str2, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.leo
    public final String a() {
        return this.b;
    }

    @Override // defpackage.leo
    public final String getName() {
        return this.a;
    }
}
