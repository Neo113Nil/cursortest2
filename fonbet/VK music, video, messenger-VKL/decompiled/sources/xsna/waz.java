package xsna;

import xsna.qjc;

/* compiled from: LinkSpanWithContentDescription.kt */
/* loaded from: classes4.dex */
public final class waz extends qaz implements llv0 {
    public final CharSequence m;

    public waz(String str, qjc.a aVar) {
        super(aVar);
        this.m = str;
    }

    @Override // xsna.llv0
    public final CharSequence getContentDescription() {
        return this.m;
    }
}
