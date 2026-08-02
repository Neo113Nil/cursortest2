package defpackage;

@gsq0
/* loaded from: classes12.dex */
public final class ig8 {
    public static final gg8 Companion = new gg8();
    public final yg8 a;
    public final Boolean b;
    public final boolean c;
    public final String d;
    public final f5n e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ ig8(int i, yg8 yg8Var, Boolean bool, boolean z, String str, f5n f5nVar, String str2, String str3, String str4, String str5) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, eg8.a.getDescriptor());
            throw null;
        }
        this.a = yg8Var;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f5nVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
    }
}
