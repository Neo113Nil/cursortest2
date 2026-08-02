package defpackage;

import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public final class nr61 extends xw61 {
    public rs61 x;
    public yt61 y;

    public final yt61 h() {
        Element f;
        if (this.y == null && (f = f("CRLIdentifier")) != null) {
            this.y = new yt61(f, this.b, this.c, this.w, 2);
        }
        return this.y;
    }
}
