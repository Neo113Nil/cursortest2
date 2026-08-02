package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkxg;", "Lbds0;", "Companion", "ixg", "jxg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class kxg extends bds0 {
    public static final jxg Companion = new jxg();
    public final Boolean a;
    public final Float b;

    public /* synthetic */ kxg(int i, Boolean bool, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
    }

    @Override // defpackage.bds0
    /* renamed from: a, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    public kxg() {
        this.a = null;
        this.b = null;
    }
}
