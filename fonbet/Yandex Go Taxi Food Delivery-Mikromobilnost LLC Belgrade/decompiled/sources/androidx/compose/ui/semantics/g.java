package androidx.compose.ui.semantics;

import defpackage.wls;

/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final wls b;
    public final boolean c;

    public g(String str, wls wlsVar) {
        this.a = str;
        this.b = wlsVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ g(String str) {
        this(str, SemanticsPropertyKey$1.w);
    }

    public g(String str, int i) {
        this(str);
        this.c = true;
    }

    public g(String str, boolean z, wls wlsVar) {
        this(str, wlsVar);
        this.c = z;
    }
}
