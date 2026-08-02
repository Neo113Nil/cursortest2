package xsna;

import android.net.Uri;
import kotlin.text.Regex;

/* compiled from: FixSectionHandler.kt */
/* loaded from: classes7.dex */
public final class qmr implements g9l {
    public final Regex a = new Regex("c(?:\\[|%5B)([a-z]+)(?:]|%5D)=");

    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        Uri parse = Uri.parse(this.a.g(fgxVar.d.toString(), "c_$1="));
        fgxVar.b = null;
        fgxVar.c = null;
        fgxVar.d = parse;
    }
}
