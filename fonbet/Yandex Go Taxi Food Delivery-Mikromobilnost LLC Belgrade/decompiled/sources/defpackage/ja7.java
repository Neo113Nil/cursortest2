package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lja7;", "", "Companion", "ha7", "ia7", "aa7", "ba7", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ja7 {
    public static final ba7 Companion = new ba7();
    public final Boolean a;
    public final ha7 b;

    public /* synthetic */ ja7(int i, Boolean bool, ha7 ha7Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ha7Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final ha7 getB() {
        return this.b;
    }

    public ja7() {
        this.a = null;
        this.b = null;
    }
}
