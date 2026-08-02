package xsna;

import android.content.Context;

/* compiled from: DebugViewEffect.java */
/* loaded from: classes12.dex */
public final class f7l implements c0u {
    public final g7l a;
    public final m6g b;

    public f7l(g7l g7lVar, m6g m6gVar) {
        this.a = g7lVar;
        this.b = m6gVar;
    }

    @Override // xsna.c0u
    public final o0u a(Context context, boolean z) {
        return new i7l(context, this.a, this.b);
    }
}
