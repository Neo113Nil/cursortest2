package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le8x;", "Lvqo;", "Companion", "c8x", "d8x", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e8x implements vqo {
    public static final d8x Companion = new d8x();
    public final boolean a;
    public final int b;
    public final int c;

    public /* synthetic */ e8x(int i, int i2, int i3, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = 1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
    }

    @Override // defpackage.vqo
    /* renamed from: isEnabled */
    public final Boolean getA() {
        return Boolean.valueOf(this.a);
    }

    public e8x(int i) {
        this.a = false;
        this.b = 1;
        this.c = 1;
    }

    public e8x() {
        this(0);
    }
}
