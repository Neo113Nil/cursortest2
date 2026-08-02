package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: CollageFormatsAdapter.kt */
/* loaded from: classes4.dex */
public final class s0g extends m.e<z2g> {
    public static final s0g a = new s0g();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(z2g z2gVar, z2g z2gVar2) {
        return z2gVar.equals(z2gVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(z2g z2gVar, z2g z2gVar2) {
        return epx.f(z2gVar.a, z2gVar2.a);
    }
}
