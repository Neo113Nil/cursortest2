package xsna;

import kotlin.collections.builders.ListBuilder;

/* compiled from: ClipCtaWithDonutViewState.kt */
/* loaded from: classes16.dex */
public final class zpc implements lm50 {
    public final ListBuilder b;
    public final boolean c;

    public zpc(ListBuilder listBuilder, boolean z) {
        this.b = listBuilder;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpc)) {
            return false;
        }
        zpc zpcVar = (zpc) obj;
        return this.b.equals(zpcVar.b) && this.c == zpcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCtaWithDonutViewState(sections=");
        sb.append((Object) wow.c(this.b));
        sb.append(", doneButtonEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
