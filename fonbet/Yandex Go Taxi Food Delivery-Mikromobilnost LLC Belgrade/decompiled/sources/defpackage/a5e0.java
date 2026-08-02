package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"La5e0;", "", "Companion", "y4e0", "z4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a5e0 {
    public static final z4e0 Companion = new z4e0();
    public final String a;
    public final Float b;
    public final d5e0 c;
    public final Float d;

    public /* synthetic */ a5e0(int i, String str, Float f, d5e0 d5e0Var, Float f2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d5e0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final d5e0 getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final Float getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final Float getB() {
        return this.b;
    }

    public a5e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
