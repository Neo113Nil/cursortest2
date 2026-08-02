package defpackage;

import android.net.Uri;

/* loaded from: classes8.dex */
public final class b1h implements m3h {
    public final a1h a;

    public b1h(a1h a1hVar) {
        this.a = a1hVar;
    }

    @Override // defpackage.m3h
    public final void a(Uri uri) {
        a1h a1hVar = this.a;
        if (a1hVar.a(uri)) {
            a1hVar.b(uri);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (b1h.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((b1h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
