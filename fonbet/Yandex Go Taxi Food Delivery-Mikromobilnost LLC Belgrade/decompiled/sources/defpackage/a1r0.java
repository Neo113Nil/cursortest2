package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La1r0;", "", "Companion", "y0r0", "z0r0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a1r0 {
    public static final z0r0 Companion = new z0r0();
    public static final i3y[] f = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(5)), null};
    public final s1r0 a;
    public final String b;
    public final String c;
    public final List d;
    public final d1r0 e;

    public /* synthetic */ a1r0(int i, s1r0 s1r0Var, String str, String str2, List list, d1r0 d1r0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = s1r0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d1r0Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final s1r0 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final d1r0 getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getC() {
        return this.c;
    }

    public a1r0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
