package xsna;

import xsna.qjc;

/* compiled from: ColoredLinkSpanWithContentDescription.kt */
/* loaded from: classes4.dex */
public final class j9g extends qaz implements llv0 {
    public final CharSequence m;
    public final int n;

    public j9g(String str, int i, qjc.a aVar) {
        super(aVar);
        this.m = str;
        this.n = i;
    }

    @Override // xsna.qjc, xsna.l2v0
    public final int getColor() {
        return this.n;
    }

    @Override // xsna.llv0
    public final CharSequence getContentDescription() {
        return this.m;
    }
}
