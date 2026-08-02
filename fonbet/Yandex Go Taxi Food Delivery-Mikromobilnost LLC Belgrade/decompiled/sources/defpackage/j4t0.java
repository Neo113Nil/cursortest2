package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj4t0;", "", "Companion", "h4t0", "i4t0", "flex-snippet-behaviour_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j4t0 {
    public static final i4t0 Companion = new i4t0();
    public final Boolean a;
    public final Boolean b;

    public /* synthetic */ j4t0(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public j4t0() {
        this.a = null;
        this.b = null;
    }
}
