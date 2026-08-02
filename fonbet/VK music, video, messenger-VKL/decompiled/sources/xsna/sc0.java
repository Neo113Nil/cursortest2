package xsna;

import android.util.Size;
import android.view.View;
import java.util.ArrayList;

/* compiled from: AdBannerData.kt */
/* loaded from: classes8.dex */
public final class sc0 {
    public final String a;
    public final Size b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final View f;
    public final ArrayList g;
    public final sh0 h;

    public sc0(String str, Size size, int i, boolean z, boolean z2, View view, ArrayList arrayList, sh0 sh0Var) {
        this.a = str;
        this.b = size;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = view;
        this.g = arrayList;
        this.h = sh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc0)) {
            return false;
        }
        sc0 sc0Var = (sc0) obj;
        return epx.f(this.a, sc0Var.a) && this.b.equals(sc0Var.b) && this.c == sc0Var.c && this.d == sc0Var.d && this.e == sc0Var.e && epx.f(this.f, sc0Var.f) && this.g.equals(sc0Var.g) && this.h.equals(sc0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e);
        View view = this.f;
        return this.h.hashCode() + qr.a(this.g, (b + (view == null ? 0 : view.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "AdBannerData(id=" + this.a + ", videoSize=" + this.b + ", durationMs=" + this.c + ", hasShoppable=" + this.d + ", hasAdChoices=" + this.e + ", shoppableView=" + this.f + ", shoppableProducts=" + this.g + ", redirectData=" + this.h + ")";
    }
}
