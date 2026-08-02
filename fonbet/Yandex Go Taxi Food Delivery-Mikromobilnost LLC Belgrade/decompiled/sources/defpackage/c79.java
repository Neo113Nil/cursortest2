package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc79;", "", "Companion", "a79", "b79", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c79 {
    public static final b79 Companion = new b79();
    public final zzs a;
    public final bxu0 b;
    public final f0k c;

    public /* synthetic */ c79(int i, zzs zzsVar, bxu0 bxu0Var, f0k f0kVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bxu0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f0kVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final f0k getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final zzs getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final bxu0 getB() {
        return this.b;
    }

    public c79() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
