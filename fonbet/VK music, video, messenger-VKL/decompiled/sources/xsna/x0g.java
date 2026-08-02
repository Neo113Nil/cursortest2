package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: CollageGridsAdapter.kt */
/* loaded from: classes4.dex */
public final class x0g extends m.e<b3g> {
    public static final x0g a = new x0g();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(b3g b3gVar, b3g b3gVar2) {
        return b3gVar.equals(b3gVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(b3g b3gVar, b3g b3gVar2) {
        return epx.f(b3gVar.a, b3gVar2.a);
    }
}
