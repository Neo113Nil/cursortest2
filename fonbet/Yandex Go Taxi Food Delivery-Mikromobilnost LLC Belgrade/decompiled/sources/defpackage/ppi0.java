package defpackage;

import kotlin.text.Regex;

/* loaded from: classes11.dex */
public final class ppi0 implements t25 {
    public final Regex a;

    public ppi0(String str) {
        this.a = new Regex(str);
    }

    @Override // defpackage.t25
    public final boolean a(String str) {
        return this.a.h(str);
    }
}
