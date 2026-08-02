package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln8j;", "", "Companion", "l8j", "m8j", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class n8j {
    public static final m8j Companion = new m8j();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final er e;

    public /* synthetic */ n8j(int i, String str, String str2, String str3, String str4, er erVar) {
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
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = erVar;
        }
    }

    public n8j() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
