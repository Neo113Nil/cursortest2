package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Li521;", "Lq5r0;", "Companion", "g521", "h521", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class i521 extends q5r0 {
    public static final h521 Companion = new h521();
    public final String a;

    public i521(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    @Override // defpackage.q5r0
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.q5r0
    /* renamed from: b */
    public final boolean getD() {
        return true;
    }

    public i521(String str) {
        this.a = str;
    }

    public i521() {
        this(null);
    }
}
