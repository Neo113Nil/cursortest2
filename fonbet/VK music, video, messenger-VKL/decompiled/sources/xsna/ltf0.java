package xsna;

import android.os.Bundle;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class ltf0 extends n3a {
    public final String a;
    public final Bundle b;
    public final boolean c;

    public ltf0(Bundle bundle, String str, boolean z) {
        this.a = str;
        this.b = bundle;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltf0)) {
            return false;
        }
        ltf0 ltf0Var = (ltf0) obj;
        return epx.f(this.a, ltf0Var.a) && epx.f(this.b, ltf0Var.b) && this.c == ltf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReloadSectionWithCustomizedParams(sourceBlockId=");
        sb.append(this.a);
        sb.append(", newParams=");
        sb.append(this.b);
        sb.append(", clearCurrentData=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
