package xsna;

import com.vk.newsfeed.api.data.BorderType;

/* compiled from: BorderedPostDisplayItem.kt */
/* loaded from: classes3.dex */
public final class f28 extends u1c0 {
    public p18 q;

    public final p18 k() {
        p18 p18Var = this.q;
        if (p18Var != null) {
            return p18Var;
        }
        p18 p18Var2 = new p18();
        p18Var2.b = BorderType.NONE.h();
        this.q = p18Var2;
        return p18Var2;
    }
}
