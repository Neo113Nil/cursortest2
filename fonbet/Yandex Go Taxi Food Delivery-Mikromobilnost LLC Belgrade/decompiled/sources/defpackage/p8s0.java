package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp8s0;", "", "Companion", "g8s0", "j8s0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p8s0 {
    public static final j8s0 Companion = new j8s0();
    public final boolean a;
    public final int b;
    public final int c;

    public /* synthetic */ p8s0(int i, int i2, int i3, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
    }

    public p8s0(int i) {
        this.a = false;
        this.b = 0;
        this.c = 0;
    }

    public p8s0() {
        this(0);
    }
}
