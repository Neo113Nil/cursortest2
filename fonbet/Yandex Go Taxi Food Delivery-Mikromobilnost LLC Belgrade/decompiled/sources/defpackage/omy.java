package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lomy;", "", "Companion", "mmy", "nmy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class omy {
    public static final nmy Companion = new nmy();
    public final String a;
    public final String b;
    public final String c;
    public final rmy d;

    public /* synthetic */ omy(int i, String str, String str2, String str3, rmy rmyVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = new rmy(0);
        } else {
            this.d = rmyVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final rmy getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public omy() {
        this(0);
    }

    public omy(int i) {
        rmy rmyVar = new rmy(0);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = rmyVar;
    }
}
