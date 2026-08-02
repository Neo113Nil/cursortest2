package defpackage;

@gsq0
/* loaded from: classes6.dex */
public final class dqo {
    public static final cqo Companion = new cqo();
    public final String a;
    public final zzs b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ dqo(int i, String str, zzs zzsVar, String str2, String str3, boolean z) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, bqo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z;
        }
    }

    public dqo(zzs zzsVar, String str, String str2, String str3) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = str3;
        this.e = true;
    }
}
